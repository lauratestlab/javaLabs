package DesignPatternLab;

import java.util.Comparator;

public class LexicographicComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet a, Pet b) {
        return a.getName().compareToIgnoreCase(b.getName());
    }
}
