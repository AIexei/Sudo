package by.ea.sudoku.model;

import java.util.*;

/**
 * Created by alexei on 14.08.15.
 */

public class Point {
    // variables
    private Set<Integer> variants;

    private int value;

    //constructor
    public Point(int value) {
        this.value = value;
        this.variants = new HashSet<Integer>();
    }

    //public area
    public boolean isEmpty () {
        return (value == 0);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Set<Integer> getVariants() {
        return variants;
    }

    public void setVariants(Set<Integer> variants) {
        this.variants = variants;
    }
}
