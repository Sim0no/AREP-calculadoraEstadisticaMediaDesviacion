package edu.escuelaing.arep.calculadora.implementation;

import edu.escuelaing.arep.calculadora.dataStructures.LinkedList;

/**
 *calculator that calculates the
 *arithmetic mean and standard deviation
 * @author German Simon Marin Mejia
 */
public class Calculator {
    /**
     * calculates the sum of a data set
     * @param array data set
     * @return Sum of data set
     **/
    public double suma(LinkedList<Double> array){
        double sumatoria = 0.0;
        for(Double i: array) {
            sumatoria+= i;
        }
        return sumatoria;
    }

    /**
     * Calculates the mean of a data set.
     * @param array LinkedList with the data.
     * @return arithmetic mean
     */
    public double mean(LinkedList<Double> array){
        double sumatoria = suma(array);
        return sumatoria / array.getSize();
    }

    /**
     * Calculates standard deviation of a data set.
     * @param array LinkedList with the data.
     * @return result of standard deviation
     */
    public double standardDeviation(LinkedList<Double> array){
        double sumatoria=0;
        double promedio = mean(array);
        for (Double i:array){
            sumatoria+= Math.pow(i-promedio,2);
        }
        return (float) Math.sqrt((sumatoria)/(array.getSize()-1));
    }
}
