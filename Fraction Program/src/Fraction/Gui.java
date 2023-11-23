package Fraction;

import javax.swing.*;
import BreezySwing.*;

public class Gui extends GBFrame {
	JLabel firstNumeratorLabel = addLabel("Numerator 1", 1, 1, 1, 1);
	IntegerField firstNumeratorField = addIntegerField(0, 1, 2, 1, 1);
	JLabel firstDenominatorLabel = addLabel("Denominator 1", 2, 1, 1, 1);
	IntegerField firstDenominatorField = addIntegerField(0, 2, 2, 1, 1);
	JLabel secondNumeratorLabel = addLabel("Numerator 2", 3, 1, 1, 1);
	IntegerField secondNumeratorField = addIntegerField(0, 3, 2, 1, 1);
	JLabel secondDenominatorLabel = addLabel("Denominator 2", 4, 1, 1, 1);
	IntegerField secondDenominatorField = addIntegerField(0, 4, 2, 1, 1);
	JButton multiply = addButton("Multiply", 5, 0, 1, 1);
	JTextField outputField = addTextField("", 5, 2, 1, 1);

	public void buttonClicked(JButton buttonObj) {
		int num;
		int den;
		int gcf;
		Fraction fraction1 = new Fraction(firstNumeratorField.getNumber(), firstDenominatorField.getNumber());
		Fraction fraction2 = new Fraction(secondNumeratorField.getNumber(), secondDenominatorField.getNumber());
		if (fraction1.validDenominator(fraction1.getDenominator(), fraction2.getDenominator())) {
			num = fraction1.getNumProduct(fraction1.getNumerator(), fraction2.getNumerator());
			den = fraction1.getDenProduct(fraction1.getDenominator(), fraction2.getDenominator());
			gcf = fraction1.getGCF(num, den);
			num = fraction1.getSimplifiedNum(num, gcf);
			den = fraction1.getSimplifiedDen(den, gcf);
			outputField.setText(num + "/" + den);
		}
		else {
			outputField.setText("Error. Denominator cannot be 0");
		}
	}

	public static void main(String[] args) {
		JFrame frm = new Gui();
		frm.setTitle("Fraction Calculator");
		frm.setSize(500, 300);
		frm.setVisible(true);
	}
	

}