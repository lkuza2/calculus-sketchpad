package com.lukekuza.calcsketchpad.util;

import de.congrace.exp4j.ExpressionBuilder;
import de.congrace.exp4j.UnknownFunctionException;
import de.congrace.exp4j.UnparsableExpressionException;

import java.util.HashMap;

/**
 * Created by User on 5/19/2014.
 */
public class FunctionEvaluatorUtil {

    private static FunctionEvaluatorUtil instance;

    private FunctionEvaluatorUtil() {

    }

    public static FunctionEvaluatorUtil getInstance() {
        if (instance == null)
            instance = new FunctionEvaluatorUtil();
        return instance;
    }

    public HashMap<String, Double[]> evaluateEuler(String diffyEq, double stepSize, int steps, double initialX, double initialY) {
        HashMap<String, Double[]> bundle = new HashMap<String, Double[]>();
        Double[] xVals = new Double[steps + 1];
        Double[] yVals = new Double[steps + 1];
        Double[] dydx = new Double[steps + 1];
        xVals[0] = initialX;
        yVals[0] = initialY;
        dydx[0] = evaluateDiffyEq(diffyEq, initialX, initialY);
        double currentX = initialX + stepSize;
        for (int i = 0; i < steps; i++) {
            xVals[i + 1] = currentX;
            yVals[i + 1] = yVals[i] + (stepSize * dydx[i]);
            dydx[i + 1] = evaluateDiffyEq(diffyEq, xVals[i + 1], yVals[i + 1]);
            currentX += stepSize;
        }
        bundle.put("xVals", xVals);
        bundle.put("yVals", yVals);
        bundle.put("dydx", dydx);
        return bundle;
    }

    private double evaluateDiffyEq(String equation, double x, double y) {
        try {
            return new ExpressionBuilder(equation).withVariable("x", x).withVariable("y", y).withVariable("e", Math.E).build().calculate();
        } catch (UnknownFunctionException e) {
            e.printStackTrace();
        } catch (UnparsableExpressionException e) {
            e.printStackTrace();
        }
        return 0;
    }


}
