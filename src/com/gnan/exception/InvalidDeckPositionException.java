package com.gnan.exception;

public class InvalidDeckPositionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2538080149075459128L;
	private int positionIdentifier = 0;

	public InvalidDeckPositionException(int inValidPosition) {

		positionIdentifier = inValidPosition;

		System.out.println("Invalid Position" + inValidPosition);

	}

	private InvalidDeckPositionException() {
		System.out.println("Invalid Position");
	}

	public String toString() {

		return ("Attempted to get a card from a position not in Deck" + " " + this.positionIdentifier);
	}

	public int getPositionValue() {
		return positionIdentifier;
	}
} //End class