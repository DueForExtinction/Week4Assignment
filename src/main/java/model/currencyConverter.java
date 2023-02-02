/**
 * 
 */
package model;

import java.text.DecimalFormat;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Jan 31, 2023
 */
public class currencyConverter {
	private double euro; // variable declaration
	private double pesos;
	private double pound;

	public currencyConverter() { // Default constructor 
		
	}
	
	public currencyConverter(double dollars) { // Constructor with args
		setEuro(convertEuros(dollars));
		setPesos(convertPesos(dollars));
		setPound(convertPounds(dollars));
	}

	/**
	 * @return the euro
	 */
	public double getEuro() { // Getters and setters
		return euro;
	}

	/**
	 * @param euro the euro to set
	 */
	public void setEuro(double euro) {
		this.euro = euro;
	}

	/**
	 * @return the pesos
	 */
	public double getPesos() {
		return pesos;
	}

	/**
	 * @param pesos the pesos to set
	 */
	public void setPesos(double pesos) {
		this.pesos = pesos;
	}

	/**
	 * @return the pound
	 */
	public double getPound() {
		return pound;
	}

	/**
	 * @param pound the pound to set
	 */
	public void setPound(double pound) {
		this.pound = pound;
	}

	public double convertEuros(double dollars) { // Converts dollars to euros
		final double EURO = 0.91; // Conversion as of 2/1/2023
		double conversion = dollars * EURO;
		return conversion;
	}
	
	public double convertPesos(double dollars) { // Converts dollars to mexican pesos
		final double PESOS = 18.59; // Conversion as of 2/1/2023
		double conversion = dollars * PESOS;
		return conversion;
	}
	
	public double convertPounds(double dollars) { // converts dollars to pound sterling
		final double POUNDS = 0.81; // Conversion as of 2/1/2023
		double conversion = dollars * POUNDS;
		return conversion;
	}
	
	@Override
	public String toString() { // Prints class info
		DecimalFormat df = new DecimalFormat("#.##");
		return "To euro: " + df.format(euro) + "\nTo pesos: " + df.format(pesos) + "\nTo pound sterling: " + df.format(pound);
	}
}
