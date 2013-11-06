package edu.grinnell.csc207.dolematt.hw8;

/**
 * 
 * @author Matt Dole
 * @author Mira Hall
 * @author Andrew Kelley
 * 
 */
public class LoopInvariants {
    /**
     * 1. SelectionSorter.indexOfSmallest: The element at the current
     * smallestIndex is the smallest element that has been discovered in the
     * array between lower bound and upper bound thus far.
     * 
     * 2. SelectionSorter.sorti: i values in the array have been sorted. All the
     * elements at the indices < i have been sorted according to order and
     * precede all the elements at indices > i
     * 
     * 3. Utils.merge: all the elements before and at the current index of
     * merged are sorted, and the next element to be inserted into merge is the
     * smaller (according to order) of the first unexamined element of a and the
     * first unexamined element of b.
     * 
     * 4. IterativeMergeSorter.sort: subarrays of length size or less are
     * ordered according to order
     * 
     * 5. Quicksorter.partition: values with indices less than small precede
     * pivot according to order, and values with indices greater than large
     * follow pivot according to order
     * 
     */
}
