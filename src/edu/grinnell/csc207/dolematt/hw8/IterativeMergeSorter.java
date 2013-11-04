package edu.grinnell.csc207.dolematt.hw8;

import java.util.Arrays;
import java.util.Comparator;

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
    @Override
    public T[] sorti(T[] vals, Comparator<T> order) {
	T[][] arrayOfArrays = (T[][]) new Object[vals.length][];
for(int j = 0; j<vals.length; j++) {
    arrayOfArrays[j] = (T[]) new Object[1];
}
	int size = 1;
	while (size < vals.length) {
	    // Merge neighboring subarrays of size size
	    for (int i = 0; i < vals.length; i += size) {
		Utils.merge(order, vals, i, i + size, vals, i + size, i
			+ (2 * size));
	    } // for

	    // The merged subarrays are now twice as large
	    size *= 2;
	} // while

	if (vals.length % 2 != 0) {
	    Utils.merge(order, vals, 0, size - 2, vals, size - 2, vals.length);
	}
	return vals;
    } // sorti(T[], Comparator<T>)
} // IterativeMergeSorter<T>
