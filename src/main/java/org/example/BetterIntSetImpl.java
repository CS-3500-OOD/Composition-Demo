package org.example;

public class BetterIntSetImpl implements BetterIntSet {

    private final IntSet intSet;
    private int count = 0;

    public BetterIntSetImpl(IntSet set) {
        intSet = set;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void add(int value) {
        intSet.add(value);
        count++;
    }

    @Override
    public void addAll(int... value) {
        intSet.addAll(value);
        count += value.length;
    }

    /**
     * Removes the given value from this set, if present.
     *
     * @param value the integer to remove
     */
    @Override
    public void remove(int value) {

    }

    /**
     * Determines whether a particular integer value is a member of this set.
     *
     * @param value the integer to check
     * @return whether value is a member of this set
     */
    @Override
    public boolean member(int value) {
        return false;
    }
}
