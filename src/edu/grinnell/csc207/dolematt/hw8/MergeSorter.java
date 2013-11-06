package edu.grinnell.csc207.dolematt.hw8;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using recursive merge sort.
 *
 * @author Sam Rebelsky
 * @author Matt Dole
 * @author Mira Hall
 * @author Andrew Kelley
 *
 */
public class MergeSorter<T> extends SorterBridge<T> {
   /**
    * Sort vals using iterative merge sort.  See the Sorter<T> interface
    * for additional details.
    */
   @Override
   public T[] sort(T[] vals, Comparator<T> order) {
       // Base case: Singleton arrays need not be sorted.
       if (vals.length <= 1) {
           return vals.clone();
       } else {
           int mid = vals.length / 2;
           T[] left = sort(Arrays.copyOfRange(vals, 0, mid), order);
           T[] right = sort(Arrays.copyOfRange(vals, mid, vals.length), order);
           return Utils.merge(order, left, right);
       } // recursive case: More than one element
   } // sort(T[], Comparator<T>)
} // MergeSorter<T>
