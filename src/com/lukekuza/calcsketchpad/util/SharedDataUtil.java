package com.lukekuza.calcsketchpad.util;

import java.util.HashMap;

/**
 * Created by User on 5/29/2014.
 */
public class SharedDataUtil {

    private static SharedDataUtil instance;
    private String equation;
    private String diffyEq;
    private String stepSize;
    private String steps;
    private String initialX;
    private String initialY;
    private String minX;
    private String maxX;
    private HashMap<String, Double[]> bundle;

    private SharedDataUtil() {

    }

    public synchronized static SharedDataUtil getInstance() {
        if (instance == null)
            instance = new SharedDataUtil();
        return instance;
    }

    public String getEquation() {
        return equation;
    }

    public void setEquation(String equation) {
        this.equation = equation;
    }

    public String getDiffyEq() {
        return diffyEq;
    }

    public void setDiffyEq(String diffyEq) {
        this.diffyEq = diffyEq;
    }

    public String getStepSize() {
        return stepSize;
    }

    public void setStepSize(String stepSize) {
        this.stepSize = stepSize;
    }

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public String getInitialX() {
        return initialX;
    }

    public void setInitialX(String initialX) {
        this.initialX = initialX;
    }

    public String getInitialY() {
        return initialY;
    }

    public void setInitialY(String initialY) {
        this.initialY = initialY;
    }

    public String getMinX() {
        return minX;
    }

    public void setMinX(String minX) {
        this.minX = minX;
    }

    public String getMaxX() {
        return maxX;
    }

    public void setMaxX(String maxX) {
        this.maxX = maxX;
    }

    public HashMap<String, Double[]> getBundle() {
        return bundle;
    }

    public void setBundle(HashMap<String, Double[]> bundle) {
        this.bundle = bundle;
    }
}
