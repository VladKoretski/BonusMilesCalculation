package org.example;

public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int costOfFrequentFlyerMile = 20;
        int bonus;
        bonus = ticketPrice / costOfFrequentFlyerMile;
        return bonus;
    }
}
