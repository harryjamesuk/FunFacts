package com.harryjamesuk.funfacts;

import java.util.Random;

/**
 * Created by Harry on 05/01/2015.
 */
public class FactBook {

    // Member variables

    // Method (abilities: things the object can do)
    public String getFact() {
        String[] facts = {
                "Ants stretch when they wake up in the morning.",
                "Ostriches can run faster than horses.",
                "Olympic gold medals are actually made mostly of silver.",
                "You are born with 300 bones; by the time you are an adult you will have 206.",
                "It takes about 8 minutes for light from the Sun to reach Earth.",
                "Some bamboo plants can grow almost a meter in just one day.",
                "The state of Florida is bigger than England.",
                "Some penguins can leap 2-3 meters out of the water.",
                "On average, it takes 66 days to form a new habit.",
                "Mammoths still walked the earth when the Great Pyramid was being built.",
                "Treehouse is not actually in a tree." };

        // The button was clicked so update the factLabel with a new fact.
        String fact = "";
        // We'll randomly select a fact
        Random randomGenerator = new Random(); // Construct a new random number generator.
        int randomNumber = randomGenerator.nextInt(facts.length);

                /* Convert the randomNumber to a text fact
                 * 0 = Ants stretch when they wake up in the morning.
                 * 1 = Ostriches can run faster than horses.
                 * 2 = Olympic gold medals are actually made mostly of silver.
                 */

        fact = facts[randomNumber];

        return fact;
    }
}
