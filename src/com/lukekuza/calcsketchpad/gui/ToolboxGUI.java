/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lukekuza.calcsketchpad.gui;

import com.lukekuza.calcsketchpad.util.FunctionEvaluatorUtil;
import com.lukekuza.calcsketchpad.util.GraphUtil;
import com.lukekuza.calcsketchpad.util.SharedDataUtil;

import javax.swing.*;

/**
 * @author User
 */
public class ToolboxGUI extends javax.swing.JFrame implements InputGUI.InputChangedListener {

    SharedDataUtil sharedDataUtil = SharedDataUtil.getInstance();
    // Variables declaration - do not modify
    private javax.swing.JButton eulerButton;
    private javax.swing.JButton graphButton;
    private javax.swing.JLabel jLabel1;

    /**
     * Creates new form ToolboxGUI
     */
    public ToolboxGUI() {
        initComponents();
    }

    public static void invokeGUI() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ToolboxGUI gui = new ToolboxGUI();
                gui.setLocation(300, 500);
                gui.setVisible(true);
                InputGUI.invokeGUI(gui);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        graphButton = new javax.swing.JButton();
        eulerButton = new javax.swing.JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toolbox");
        setResizable(false);

        jLabel1.setText("Tools");

        graphButton.setText("Graph");
        graphButton.setEnabled(false);
        graphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphButtonActionPerformed(evt);
            }
        });

        eulerButton.setText("Euler Approximation");
        eulerButton.setEnabled(false);
        eulerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eulerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(graphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(eulerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(67, 67, 67))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(graphButton)
                                .addGap(18, 18, 18)
                                .addComponent(eulerButton)
                                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void graphButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            GraphUtil.getInstance().makeEquationGraph(sharedDataUtil.getEquation(), Integer.parseInt(sharedDataUtil.getMinX()), Integer.parseInt(sharedDataUtil.getMaxX()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void eulerButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            boolean initialGraph = false;
            if (sharedDataUtil.getEquation() != null && !sharedDataUtil.getEquation().isEmpty()) {
                GraphUtil.getInstance().makeEquationGraph(sharedDataUtil.getEquation(), Integer.parseInt(sharedDataUtil.getMinX()), Integer.parseInt(sharedDataUtil.getMaxX()));
                initialGraph = true;
            }
            SharedDataUtil.getInstance().setBundle(FunctionEvaluatorUtil.getInstance().evaluateEuler(sharedDataUtil.getDiffyEq(), Double.parseDouble(sharedDataUtil.getStepSize()),
                    Integer.parseInt(sharedDataUtil.getSteps()), Double.parseDouble(sharedDataUtil.getInitialX()), Double.parseDouble(sharedDataUtil.getInitialY())));
            GraphUtil.getInstance().makeScatterGraph(sharedDataUtil.getBundle().get("xVals"), sharedDataUtil.getBundle().get("yVals"), initialGraph);

            ChartGUI.invokeGUI();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onInputChanged(int inputType, boolean inputEmpty) {
        switch (inputType) {
            case 0:
            case 6:
            case 7:
                graphButton.setEnabled(!inputEmpty);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                eulerButton.setEnabled(!inputEmpty);
                break;
            default:
                break;
        }
    }
    // End of variables declaration                   
}
