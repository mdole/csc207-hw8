package edu.grinnell.csc207.dolematt.hw8;

/**
 * A quick experiment with the insertion sorter.
 *
 * @author Samuel A. Rebelsky
 */
public class InsertionSortExpt {

    /**
     * Run the experiments.
     */
    public static void main(String[] args) {
        Utils.iExperiments(new InsertionSorter<Integer>());
        Utils.sExperiments(new InsertionSorter<String>());
    } // main(String[])
} // class InsertionSortExpt
