package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class inntektsSkatt {

	private static double finnSkatt(double inntekt) {
	
		if (inntekt >= 164101 && inntekt <= 230950) {
			
			return 0.93;
			
		}
		else if (inntekt >= 230951 && inntekt <= 580650)	{
			
			return 2.41;
			
		}
		else if (inntekt >= 580651 && inntekt <= 934050)	{
			
			return 11.52;
		}
		else if (inntekt >= 934051)	{
			
			return 14.52;
		} else {
			
			return 0;
			
		}
	}

	public static double inntektsSkatt(double inntekt, double skatt)	{
		if(skatt == 0) {
			return 0;
		}
		else if (skatt == 0.93) {
			return inntekt * 0.0093;
		}
		else if(skatt == 2.41) {
			return inntekt * 0.0241;
		}
		else if(skatt == 11.52) {
			return inntekt * 0.1152;
		
		} else {
			return inntekt * 0.1452;
			
		}
	}


	public static void main(String[] args) {
		
		String input = showInputDialog("Skriv inn inntekt: ");
		double x = Double.parseDouble(input);
		
		double skatt = finnSkatt(x);
		
		showMessageDialog(null, "Inntekt: " + x + '\n' + "Prosent: " + skatt + "%" + '\n' + "Skatt: " + inntektsSkatt(x, skatt) + '\n' + "Inntekt etter skatt " + (x-inntektsSkatt(x, skatt)));
		
	}
}