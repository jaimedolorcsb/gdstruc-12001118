package com.dolorjaime;

import java.util.Random;

public class CardNames {

    static class Names{
        public String[] cardNames = {"Fizz", "Heimerdinger", "Lulu", "Darius", "Draven", "Katarina", "Anivia", "Ashe", "Braum",
                                    "Fiora", "Garen", "Jarvan IV", "Caitlyn", "Ekko", "Ezreal", "Irelia", "Karma", "Lee Sin",
                                    "Elise", "Hecarim", "Kalista", "Gangplank", "Miss Fortune", "Nautilus", "Aphelios", "Diana",
                                    "Leona", "Akshan", "Azir", "Nasus"};

        public String generateName() {
            Random rand = new Random();
            int draw = rand.nextInt(cardNames.length - 1);

            return cardNames[draw];
        }
    }

}
