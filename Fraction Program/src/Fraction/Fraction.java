package Fraction;
import javax.swing.*;
import BreezySwing.*;
public class Fraction {
	
	//initialize variables 
	private int numerator;
	private int denominator;
	private boolean found = false;

	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	//getters and setters
	public int getNumerator() {
		return numerator;
	}


	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}


	public int getDenominator() {
		return denominator;
	}


	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	//calculations
	public boolean validDenominator(int num, int den) {
		if (den != 0) {
			return true;
		}
		else
			return false;
	}
	public int getNumProduct(int num1, int num2) {
		numerator = num1 * num2;
		return numerator;
	}
	public int getDenProduct(int den1, int den2) {
		denominator = den1 * den2;
		return denominator;
	}
	public int getGCF (int num, int den) {
		int gcf;
		if (num < den) {
			gcf = num;
		}
		else {
			gcf = den;
		}
		while (found == false) {
			if (num % gcf == 0 && den % gcf == 0) {
				found = true;
			}
			else {
				gcf--;
			}
		}
		return gcf;
	}
	public int getSimplifiedNum(int num, int gcf) {
		numerator = num / gcf;
		return numerator;
	}
	public int getSimplifiedDen(int den, int gcf) {
		denominator = den / gcf;
		return denominator;
	}
	
}