package com.lukekuza.calcsketchpad.util;

import de.congrace.exp4j.ExpressionBuilder;

import static easyjcckit.QuickPlot.*;

/**
 * Created by User on 5/29/2014.
 */
public class GraphUtil {

    private static GraphUtil instance;

    private GraphUtil() {

    }

    public static GraphUtil getInstance() {
        if (instance == null)
            instance = new GraphUtil();
        return instance;
    }

    public void makeEquationGraph(String equation, int minX, int maxX) throws Exception {
        double step = .1;
        double[] xaxis = new double[(int) ((maxX - minX) / step) + 1];
        double[] yvalues = new double[(int) ((maxX - minX) / step) + 1];
        int index = 0;
        for (double i = minX; i <= maxX; i += step) {
            xaxis[index] = i;
            yvalues[index] = new ExpressionBuilder(equation).withVariable("x", i).withVariable("e", Math.E).build().calculate();
            index++;
        }

        line(xaxis, yvalues); // create a plot using xaxis and yvalues
    }

    public void makeScatterGraph(Double[] xVals, Double[] yVals, boolean add) {
        double[] xValsp = new double[xVals.length];
        double[] yValsp = new double[yVals.length];
        int i = 0;
        for (Double xVal : xVals) {
            xValsp[i] = xVal;
            i++;
        }
        i = 0;
        for (Double yVal : yVals) {
            yValsp[i] = yVal;
            i++;
        }

        if (add)
            addPlot(xValsp, yValsp);
        else
            plot(xValsp, yValsp);
    }
}
