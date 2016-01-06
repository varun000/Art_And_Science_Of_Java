/*
 * File: RadioactiveDecay.java
 * -------------------------------------------------------------------------
 * This program simulates the decaying process of radioactive atoms that
 * have a half life of one year. The program will show the amount of atoms
 * remaining at the end of each year until all atoms has decayed
 */

package chapter_6.Programming_Exercises.Exercise_4;

import acm.program.*;
import acm.util.RandomGenerator;

public class RadioactiveDecay extends ConsoleProgram {

    /* Number of atoms */
    private static final int NATOMS = 10000;

    public void run() {
        println("There are " + NATOMS + " atoms initially.");
        findRemainingAtoms();
        
    }
    
    /**
     * Finding the remaining atoms left.
     */
    private void findRemainingAtoms() {
    	int remainingAtoms = NATOMS;
        int year = 0;
        while (remainingAtoms > 0) {
        	remainingAtoms = remainingAtomsAfterYear(remainingAtoms);
            year++;
            println("There are " + remainingAtoms + " atoms at the end of year " + year);
        }
    }
    
    /**
     * Simulate the decaying process for each atom. Each atom has a 50% chance of decay.
     * @param remainingAtoms Remaining atoms left
     * @return Returns the remaining atoms after decay
     */
    private int remainingAtomsAfterYear(int remainingAtoms) {
    	int atomsAfterDecay = remainingAtoms;
    	for (int i = atomsAfterDecay; i > 0; i--) {
            if (isDecayed()) {
            	atomsAfterDecay--;
            }
        }
		return atomsAfterDecay;
	}

    /**
     * Finding whether the atom is decayed or not.
     * @return Returns a boolean value of atom state
     */
	private boolean isDecayed() {
    	boolean itIsDecayed = rgen.nextBoolean();
    	return itIsDecayed;
    }

    /* Create an instance variable for the random number generator */
    private RandomGenerator rgen = RandomGenerator.getInstance();
}