package com.oreilly.exercises;

import com.oreilly.exercises.response.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RetirementCalculator {

    private Person person;

    public RetirementCalculator(Person person) {
        this.person = person;
    }

    public int getYearsUntilRetirement() {
        return person.getAgeRetirement() - person.getAgeNow();
    }

    public int getYearNow() {
        return new GregorianCalendar().get(Calendar.YEAR);
    }

    public int getRetirementYear() {
        return getYearNow() + getYearsUntilRetirement();
    }

    public String getStringAnswer() {
        if (getYearsUntilRetirement() < 0) {
            return "You are already retired";

        } else {
            return String.format("You have %s years left until you can retire.\n" +
                            "It's %s, so you can retire in %s.",
                    getYearsUntilRetirement(),
                    getYearNow(),
                    getRetirementYear());

        }
    }
}





