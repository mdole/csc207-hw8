package edu.grinnell.csc207.dolematt.hw8;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.grinnell.csc207.dolematt.hw8.Quicksorter;
import edu.grinnell.csc207.dolematt.hw8.TestUtils;

public class SorterTest {

//    @Test
//    public void QuicksorterTest() {
//	TestUtils.test2(new Quicksorter<Integer>());
//    }
//    
    @Test
    public void IterativeMergeSorterTest() {
	TestUtils.test2(new IterativeMergeSorter<Integer>());
    }

}
