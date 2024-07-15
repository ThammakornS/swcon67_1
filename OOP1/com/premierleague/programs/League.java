package com.premierleague.programs;

import com.premierleague.teams.FootballTeam;

public class League {
    public static void main(String[] args) {
        FootballTeam team = new FootballTeam(11, "CS_SOCCER");
        System.out.println(team.name);
        // System.out.println(team.numMembers);
    }
}
