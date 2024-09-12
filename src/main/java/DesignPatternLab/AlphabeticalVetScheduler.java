package DesignPatternLab;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class AlphabeticalVetScheduler implements VetScheduler{
    @Override
    public List<Pet> schedule(List<Pet> pets) {
//   Collection is used to gather all of the items in a list or any from
//   collection and the .sort is used to sort the things in the collection alphabetically
        Collections.sort(pets, new LexicographicComparator());

        System.out.println();
        return List.of();
    }
//    Schedules the appointments in alphabetical order of the Pet's name.
}
