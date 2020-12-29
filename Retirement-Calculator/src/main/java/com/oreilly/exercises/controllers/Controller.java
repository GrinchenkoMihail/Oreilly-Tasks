package com.oreilly.exercises.controllers;

import com.oreilly.exercises.RetirementCalculator;
import com.oreilly.exercises.response.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    private final String MAIN_STR ="What is your current age?\nAt what age would you like to retire?";

    @RequestMapping("/")
    public String getMainPage() {
        return MAIN_STR;
    }

    @GetMapping("/person")
    public String getInfPerson(@RequestParam int ageNow,
                               @RequestParam int ageRetiremen) {

        return  new RetirementCalculator(new Person(ageNow, ageRetiremen)).getStringAnswer();
    }


}
