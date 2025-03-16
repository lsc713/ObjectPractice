package com.service.javamid.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class UserSolution
{
    private Map<Integer, Soldier> soldiers;
    private int[] teamOffset;
    private Map<Integer, TreeSet<Integer>>[] scoreToSoliders;

    static class Soldier{
        int id;
        int team;
        int baseScore;
        Soldier(int id, int team, int score){
            this.id = id;
            this.team = team;
            this.baseScore = score;
        }

        int getCurrentScore(int teamOffset) {
            int finalScore = baseScore + teamOffset;
            return Math.min(5, Math.max(1, finalScore));
        }
    }
    public void init()
    {
        soldiers = new HashMap<>();
        teamOffset = new int[6];
        for (int i = 1; i <= 5; i++) {
            teamOffset[i] = 0;
        }
        scoreToSoliders = new HashMap[6];
        for (int i = 1; i <= 5; i++) {
            scoreToSoliders[i] = new HashMap<>();
            for (int score = 1; score <= 5; score++) {
                scoreToSoliders[i].put(score, new TreeSet<>());
            }
        }
    }

    public void hire(int mID, int mTeam, int mScore)
    {
        int baseScore = mScore - teamOffset[mTeam];
        baseScore = Math.min(5, Math.max(1, baseScore));
        Soldier soldier = new Soldier(mID, mTeam, baseScore);
        soldiers.put(mID, soldier);
        scoreToSoliders[mTeam].get(baseScore).add(mID);

    }

    public void fire(int mID)
    {
        Soldier soldier = soldiers.get(mID);
        int team = soldier.team;
        int baseScore = soldier.baseScore;

        scoreToSoliders[team].get(baseScore).remove(mID);

        soldiers.remove(mID);
    }

    public void updateSoldier(int mID, int mScore)
    {
        Soldier soldier = soldiers.get(mID);
        int team = soldier.team;
        int oldBaseScore = soldier.baseScore;
        scoreToSoliders[team].get(oldBaseScore).remove(mID);
        int newBaseScore = mScore - teamOffset[team];
        newBaseScore = Math.min(5, Math.max(1, newBaseScore));
        soldier.baseScore = newBaseScore;
        scoreToSoliders[team].get(newBaseScore).add(mID);
    }

    public void updateTeam(int mTeam, int mChangeScore)
    {
        teamOffset[mTeam] += mChangeScore;
    }

    public int bestSoldier(int mTeam)
    {
        int maxId = -1;
        Map<Integer, Set<Integer>> currentScoreSoldiers = new HashMap<>();
        for (int baseScore = 1; baseScore <= 5; baseScore++) {
            int currentScore = Math.min(5, Math.max(1, baseScore + teamOffset[mTeam]));
            if (!currentScoreSoldiers.containsKey(currentScore)) {
                currentScoreSoldiers.put(currentScore, new HashSet<>());
            }
            currentScoreSoldiers.get(currentScore).addAll(scoreToSoliders[mTeam].get(baseScore));
        }
        for (int score = 5; score >= 1; score--) {
            if (currentScoreSoldiers.containsKey(score) && !currentScoreSoldiers.get(score)
                .isEmpty()) {
                for (int id : currentScoreSoldiers.get(score)) {
                    maxId = Math.max(maxId, id);
                }
                break;
            }
        }
        return maxId;
    }

}