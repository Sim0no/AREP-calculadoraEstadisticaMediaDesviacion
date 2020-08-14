package edu.escuelaing.arep.calculadora;

import edu.escuelaing.arep.calculadora.dataStructures.LinkedList;
import edu.escuelaing.arep.calculadora.implementation.Calculator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App 
{
    private static Calculator c = new Calculator();

    public static void main( String[] args ) throws FileNotFoundException {
        File archivo = new File(args[0]);
        Scanner scaner = new Scanner(archivo);
        while (scaner.hasNextLine()) {
            String line =scaner.nextLine();
            readAndCalculate(line);
        }
        scaner.close();

    }

    private static void readAndCalculate(String data) {
        LinkedList<Double> array = new LinkedList<>();
        String[] mData = data.split(",");
        for (String i : mData){
            double value = Double.parseDouble(i);
            array.add(value);
        }
        System.out.println("Mean -> "+c.mean(array));
        System.out.println("Standard Deviation -> "+c.standardDeviation(array));
    }
}
