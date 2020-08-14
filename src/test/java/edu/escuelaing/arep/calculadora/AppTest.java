package edu.escuelaing.arep.calculadora;

import edu.escuelaing.arep.calculadora.dataStructures.LinkedList;
import edu.escuelaing.arep.calculadora.implementation.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AppTest
{
    Calculator calculator;
    LinkedList<Double> dataSet1,dataSet2,dataSet3,dataSet4, dataSet5, dataSet6;


    @Before
    public void setup(){
        calculator = new Calculator();
        dataSet1 = new LinkedList(new Double[]{26.7,58.2,69.1,47.6,13.2,42.8,78.2,65.1,74.3,68.7,32.4,71.6});
        dataSet2 = new  LinkedList(new Double[]{77.2, 19.4, 10.8, 74.6, 53.4, 42.2, 34.3, 67.4, 63.7});
        dataSet3 = new  LinkedList(new Double[]{64.7, 175.1, 118.3, 57.9, 54.6, 65.4, 123.7, 92.2, 173.0, 126.5});
        dataSet4 = new  LinkedList(new Double[]{122.0, 89.4, 41.6, 75.2, 50.1, 52.7, 54.3});
        dataSet5 = new  LinkedList(new Double[]{61.4, 81.9, 72.1, 58.3, 62.0, 50.7, 48.0, 82.4, 78.7});

    }


    @Test
    public void shouldCalculateMean() {
        Assert.assertEquals(53.9, calculator.mean(dataSet1), 0.1);
        Assert.assertEquals(49.2, calculator.mean(dataSet2), 0.1);
        Assert.assertEquals(105.1, calculator.mean(dataSet3), 0.1);
        Assert.assertEquals(69.3, calculator.mean(dataSet4), 0.1);
        Assert.assertEquals(66.1, calculator.mean(dataSet5), 0.1);
    }


    @Test
    public void shouldNotCalculateMean() {
        Assert.assertNotEquals(55.0, calculator.mean(dataSet1), 0.0);
        Assert.assertNotEquals(50.0, calculator.mean(dataSet2), 0.00001);
        Assert.assertNotEquals(104.8, calculator.mean(dataSet3), 0.01);
        Assert.assertNotEquals(65.2, calculator.mean(dataSet4), 0.01);
        Assert.assertNotEquals(67.2, calculator.mean(dataSet5), 0.01);
    }


    @Test
    public void shouldCalculateStandardDeviation(){
        Assert.assertEquals(21.18, calculator.standardDeviation(dataSet1), 0.01);
        Assert.assertEquals(24.03, calculator.standardDeviation(dataSet2), 0.01);
        Assert.assertEquals(45.51, calculator.standardDeviation(dataSet3), 0.01);
        Assert.assertEquals(28.43, calculator.standardDeviation(dataSet4), 0.01);
        Assert.assertEquals(13.10, calculator.standardDeviation(dataSet5), 0.01);

    }


    @Test
    public void shouldNotCalculateStandardDeviation(){
        Assert.assertNotEquals(22.0, calculator.standardDeviation(dataSet1), 0.05);
        Assert.assertNotEquals(25.0, calculator.standardDeviation(dataSet2), 0.03);
        Assert.assertNotEquals(45.55, calculator.standardDeviation(dataSet3), 0.01);
        Assert.assertNotEquals(28.49, calculator.standardDeviation(dataSet4), 0.01);
        Assert.assertNotEquals(13.2, calculator.standardDeviation(dataSet5), 0.01);
    }

}
