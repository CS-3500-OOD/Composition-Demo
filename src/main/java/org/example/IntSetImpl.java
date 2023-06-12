package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * An implementation of IntSet using the Collections Framework's
 * HashSet.
 */
public final class IntSetImpl implements IntSet {
    private final Set<Integer> set;

    public IntSetImpl(Set<Integer> set) {
        this.set = new HashSet<>(set); // Copy the set (only works with primitive types)
    }

    @Override
    public void add(int value) {
        _add(value);
    }

    private void _add(int value) {
        set.add(value);
    }

    // addAll() is implemented in terms of add() in order avoid code duplication.
    // In this example the implementation of add() is minuscule, but in a real
    // implementation it might be complicated, and we wouldn't want to repeat
    // it in addAll() as well.
    @Override
    public void addAll(int... values) { //... means that the method can take any number of arguments
        for (int i : values) {
            set.add(i);
        }
    }

    @Override
    public void remove(int value) {
        set.remove(value);
    }

    @Override
    public boolean member(int value) {
        return set.contains(value);
    }

    public Set<Integer> getSet() {
        return new HashSet<>(set);
    }
}