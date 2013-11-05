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
	int size = 1;
	System.out.println("\n\ndealing with array " + Arrays.toString(vals));
	System.out.println("of length " + vals.length);
	while (size < vals.length) {
	    // Merge neighboring subarrays of size size
	    int[] bounds = { 0, 0, 0, 0 };
	    boundsIncrement(size, bounds);
	    T[] temp = (T[]) (new Object[size * 2]);
	    while (bounds[3] <= vals.length) {
		temp = Utils.merge(order, vals, bounds[0], bounds[1], vals,
			bounds[2], bounds[3]);
		int i = bounds[0];
		int j = 0;
		while (i < bounds[3]) {
		    vals[i] = temp[j];
		    i++;
		    j++;
		} // while
		boundsIncrement(size, bounds);
	    } // while
	    // The merged subarrays are now twice as large
	    System.out.println("for subarrays of size " + size);
	    System.out.println("last merged value at " + bounds[0] + "\n");
	    System.out.println("vals is now" + Arrays.toString(vals));
	    size *= 2;

	} // while
	//almost there!!!! having trouble predicting the size of the leftover numbers
	//if you run the code, you'll see what i mean
	int remaining = vals.length -2^(vals.length%2) ;
	System.out.println("remaining: " + remaining);
	if (remaining != 0) {
	   vals = Utils.merge(order, vals, 0, vals.length - remaining, vals,
		   vals.length - remaining, vals.length);
	}// if
	System.out.print("reutrned array: "+ Arrays.toString(vals)); 
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
