package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> myFamily = new ArrayList<>();
        myFamily.add(new Person("Dana","Pearson",18));
        myFamily.add(new Person("John","Pearson",12));
        myFamily.add(new Person("David","Pearson",22));
        myFamily.add(new Person("Kanteh","Pearson",23));
        myFamily.add(new Person("Zeke","Pearson",14));
        Collections.sort(myFamily);
        for(Person person:myFamily){
            System.out.println(person.firstName + " " + person.lastName + " " + person.getAge());
        }


    }
}
