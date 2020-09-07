package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class fakultetsKalkulator {
    public static int fakultet(int a){
        int b = a - 1;
        while (b > 0){
            a = a * b;
            b = b - 1;
        }
        return a;
    }

    public static void main(String[] args){
        String input = showInputDialog("Skriv et tall:    \nSkriv inn 0 + OK for å stoppe programmet");
        int in = Integer.parseInt(input);

        if (in != 0){
            showMessageDialog(null, fakultet(in));
            main(null);
        }
    }
}
