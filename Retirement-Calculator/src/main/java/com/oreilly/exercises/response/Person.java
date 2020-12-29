package com.oreilly.exercises.response;

import java.util.Date;

public class Person {

    private int ageNow;

    private int ageRetirement;

    public Person(int ageNow, int ageRetirement) {
        this.ageNow = ageNow;
        this.ageRetirement = ageRetirement;
    }

    public int getAgeNow() {
        return ageNow;
    }

    public int getAgeRetirement() {
        return ageRetirement;
    }
}
