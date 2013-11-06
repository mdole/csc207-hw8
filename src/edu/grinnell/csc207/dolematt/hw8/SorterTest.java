package edu.grinnell.csc207.dolematt.hw8;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.grinnell.csc207.dolematt.hw8.Quicksorter;
import edu.grinnell.csc207.dolematt.hw8.TestUtils;

/**
 * @author Matt Dole
 * @author Mira Hall
 * @author Andrew Kelley
 * 
 */

public class SorterTest {

//    @Test
//    public void QuicksorterTest() {
//	TestUtils.test1(new Quicksorter<Integer>());
//	TestUtils.test2(new Quicksorter<Integer>());
//    }
//
//    @Test
//    public void IterativeMergeSorterTest() {
//	TestUtils.test1(new IterativeMergeSorter<Integer>());
//	TestUtils.test2(new IterativeMergeSorter<Integer>());
//    }
//
//    @Test
//    public void RecursiveMergeSorterTest() {
//	TestUtils.test1(new MergeSorter<Integer>());
//	TestUtils.test2(new MergeSorter<Integer>());
//    }

    @Test
    public void counterTesting() {
	Integer[] intArray1 = { 1, 3, 7, 10 };
	TestUtils.testOnePermutation(new Quicksorter<Integer>(),
		StandardIntegerComparator.comparator, intArray1);
	System.out.println("Approximate number of swaps: 8");
	System.out.println("Number of swaps performed: " + Utils.getCounter());
	Utils.resetCounter();
	
	Integer[] intArray2 = { 1, 3, 7, 10, 13 };
	TestUtils.testOnePermutation(new Quicksorter<Integer>(),
		StandardIntegerComparator.comparator, intArray2);
	System.out.println("Approximate number of swaps: 12");
	System.out.println("Number of swaps performed: " + Utils.getCounter());
	Utils.resetCounter();
	
	Integer[] intArray3 = { 1, 3, 7, 10, 13, 23 };
	TestUtils.testOnePermutation(new Quicksorter<Integer>(),
		StandardIntegerComparator.comparator, intArray3);
	System.out.println("Approximate number of swaps: 16");
	System.out.println("Number of swaps performed: " + Utils.getCounter());
	Utils.resetCounter();
	
	Integer[] intArray4 = { 1, 3, 7, 10, 13, 23, 84 };
	TestUtils.testOnePermutation(new Quicksorter<Integer>(),
		StandardIntegerComparator.comparator, intArray4);
	System.out.println("Approximate number of swaps: 20");
	System.out.println("Number of swaps performed: " + Utils.getCounter());
	Utils.resetCounter();
	
	Integer[] intArray5 = { 1, 3, 7, 10, 13, 23, 84, 95 };
	TestUtils.testOnePermutation(new Quicksorter<Integer>(),
		StandardIntegerComparator.comparator, intArray5);
	System.out.println("Approximate number of swaps: 24");
	System.out.println("Number of swaps performed: " + Utils.getCounter());
	Utils.resetCounter();
	
	Integer[] intArray6 = { 1, 3, 7, 10, 13, 23, 84, 95, 102 };
	TestUtils.testOnePermutation(new Quicksorter<Integer>(),
		StandardIntegerComparator.comparator, intArray6);
	System.out.println("Approximate number of swaps: 29");
	System.out.println("Number of swaps performed: " + Utils.getCounter());
	Utils.resetCounter();
    }
}
