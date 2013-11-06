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

    @Test
    public void QuicksorterTest() {
	TestUtils.test1(new Quicksorter<Integer>());
	TestUtils.test2(new Quicksorter<Integer>());
    }

    @Test
    public void IterativeMergeSorterTest() {
	TestUtils.test1(new IterativeMergeSorter<Integer>());
	TestUtils.test2(new IterativeMergeSorter<Integer>());
    }
    
    @Test
    public void RecursiveMergeSorterTest() {
	TestUtils.test1(new MergeSorter<Integer>());
	TestUtils.test2(new MergeSorter<Integer>());
    }
    
//    @Test
//    public void counterTesting() {
//	int[] intArray = {3, 1, 4, 5, 8};
//	Quicksorter.sorti(intArray, StandardIntegerComparator.comparator);
//	assertEquals("Counter 1", 8, Utils.getCounter());
//    }
}
