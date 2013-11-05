package edu.grinnell.csc207.dolematt.hw8;

import java.util.Arrays;
import java.util.Comparator;

import edu.grinnell.csc207.dolematt.hw8.Utils;

/**
 * Sort using iterative merge sort.
 * 
 * @author Samuel A. Rebelsky
 * @author Matt Dole
 * @author Mira Hall
 * @author Andrew Kelley
 */
public class IterativeMergeSorter<T> extends SorterBridge<T> {
    /**
     * Sort vals using iterative merge sort. See the Sorter<T> interface for
     * additional details.
     */
    @SuppressWarnings("unchecked")
    @Override
    public T[] sorti(T[] vals, Comparator<T> order) {
	int size = 1;
	while (size < vals.length) {
	    // Merge neighboring subarrays of size size
	    int i = 0;
	    T[] temp;
	    while (i < vals.length) {
		temp = (T[]) new Object[(Math.min((i + size*2), vals.length) - i)];
		temp = Utils.merge(order, vals, i,
			Math.min(i + size, vals.length), vals,
			Math.min(i + size, vals.length),
			Math.min((i + size*2), vals.length));
		int j = 0;
		int k = i;
		while (j < temp.length) {
		    vals[k] = temp[j];
		    j++;
		    k++;
		} // while
		i += size * 2;
	    } // while
	      // The merged subarrays are now twice as large
	    size *= 2;
	} // while
	return vals;
    } // sorti(T[], Comparator<T>)
} // IterativeMergeSorter<T>
