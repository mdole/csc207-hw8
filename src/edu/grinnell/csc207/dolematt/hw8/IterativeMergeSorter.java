package edu.grinnell.csc207.dolematt.hw8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Sort using iterative merge sort.
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here.
 */
public class IterativeMergeSorter<T> extends SorterBridge<T> {
    /**
     * Sort vals using iterative merge sort. See the Sorter<T> interface for
     * additional details.
     */
    @Override
    public T[] sorti(T[] vals, Comparator<T> order) {
	// STUB
	int size = 1;
	while (size < vals.length) {
	    // Merge neighboring subarrays of size size
	    int[] bounds = { 0, 0, 0, 0 };
	    boundsIncrement(size, bounds);
	    T[] temp = (T[]) (new Object[size * 2]);
	    while (bounds[3] <= vals.length) {
		temp = Utils.merge(order, vals, bounds[0], bounds[1], vals,
			bounds[2], bounds[3]);
		int i = bounds[0];
		while (i < bounds[3]) {
		    vals[i] = temp[i];
		    i++;
		} // while
		boundsIncrement(size, bounds);
	    } // while
	    // The merged subarrays are now twice as large
	    size *= 2;
	} // while
	return vals;
    } // sorti(T[], Comparator<T>)

    // 0:lb1
    // 1:ub1
    // 2:lb2
    // 3:ub2
    private void boundsIncrement(int size, int[] bounds) {
	bounds[0] = bounds[3];
	bounds[1] = bounds[0] + size;
	bounds[2] = bounds[1];
	bounds[3] = bounds[2] + size;
    }

} // IterativeMergeSorter<T>