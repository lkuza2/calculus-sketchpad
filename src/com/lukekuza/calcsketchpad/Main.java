package com.lukekuza.calcsketchpad;

import com.lukekuza.calcsketchpad.gui.ToolboxGUI;

import javax.swing.*;

public class Main {

    public Main() {

        /*DefaultXYDataset dataSet = new DefaultXYDataset();
        double data[][] = new double[2][2];
        data[0] = new double[]{2.0, 3.0};
        data[1] = new double[]{3.0, 4.0};

        DefaultXYDataset dataSet2 = new DefaultXYDataset();
        double data2[][] = new double[2][2];
        data[0] = new double[]{3.0, 4.0};
        data[1] = new double[]{8.0, 5.0};



        dataSet.addSeries(new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }, data);

        dataSet.addSeries(new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 1;
            }
        }, data2);


        JFreeChart chart = ChartFactory.createXYLineChart("lol", "Test", "test2", dataSet);
        JFreeChart chart2 = ChartFactory.createXYLineChart("lol", "Test", "test2", dataSet2);


        ChartPanel chartPanel = new ChartPanel(chart);
        ChartPanel chartPanel2 = new ChartPanel(chart2);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(1000, 1000));
        setPreferredSize(new Dimension(1000,1000));
        setContentPane(chartPanel);*/
    }

    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
            //Basically do nothing, if this fails then there is no UIManager
        }

        ToolboxGUI.invokeGUI();


        /*try {
            System.out.println(new ExpressionBuilder("(x+y)^x").withVariable("x", 3).withVariable("y", 5).build().calculate());
        } catch (UnknownFunctionException e) {
            e.printStackTrace();
        } catch (UnparsableExpressionException e) {
            e.printStackTrace();
        }*/

    }

}
