package org.example;

import java.util.HashSet;
import java.util.Set;

public class Driver {
    public static void main(String[] args) {

        //Create a new IntSet1 object
        IntSet1 intSet1 = new IntSet1(new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));

        //Get the set from the IntSet1 object
        Set<Integer> strangeSet = intSet1.getSet();

        //Add 420 to the set
        strangeSet.add(420);

        //Print the set
        System.out.println(intSet1.member(420)); //Should be False because the set is copied and not the reference


        // Create a new BetterIntSetImpl object
        BetterIntSet betterIntSetImpl = new BetterIntSetImpl(intSet1);
        betterIntSetImpl.addAll(1, 2, 3, 4);
        System.out.println(betterIntSetImpl.getCount()); // 4

        System.out.println(betterIntSetImpl.member(3)); // True
        betterIntSetImpl.remove(3);
        System.out.println(betterIntSetImpl.member(3)); // False
    }
}