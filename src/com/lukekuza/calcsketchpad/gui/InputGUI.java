/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lukekuza.calcsketchpad.gui;

import com.lukekuza.calcsketchpad.util.SharedDataUtil;

/**
 * @author User
 */
public class InputGUI extends javax.swing.JFrame {

    private InputChangedListener listener;
    private SharedDataUtil sharedDataUtil = SharedDataUtil.getInstance();
    // Variables declaration - do not modify
    private javax.swing.JTextField diffyeqTextField;
    private javax.swing.JTextField equationTextField;
    private javax.swing.JTextField initialXTextField;
    private javax.swing.JTextField initialYTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField maxXTextField;
    private javax.swing.JTextField minXTextField;
    private javax.swing.JTextField stepSizeTextField;
    private javax.swing.JTextField stepsTextField;

    /**
     * Creates new form InputGUI
     */
    public InputGUI() {
        initComponents();
    }

    public static void invokeGUI(final InputChangedListener listener) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InputGUI gui = new InputGUI();
                gui.setLocation(500, 100);
                gui.setVisible(true);
                gui.listener = listener;
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
        jLabel2 = new javax.swing.JLabel();
        equationTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        diffyeqTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        initialXTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        initialYTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        stepSizeTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        stepsTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        minXTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        maxXTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inputs");

        jLabel1.setText("Inputs");

        jLabel2.setText("f(x)=");

        equationTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                equationTextFieldKeyReleased(evt);
            }
        });

        jLabel3.setText("dy/dx=");

        diffyeqTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                diffyeqTextFieldKeyReleased(evt);
            }
        });

        jLabel4.setText("Initial X:");

        initialXTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                initialXTextFieldKeyReleased(evt);
            }
        });

        jLabel5.setText("Initial Y:");

        initialYTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                initialYTextFieldKeyReleased(evt);
            }
        });

        jLabel6.setText("Stepsize:");

        stepSizeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stepSizeTextFieldKeyReleased(evt);
            }
        });

        jLabel7.setText("Steps:");

        stepsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                stepsTextFieldKeyReleased(evt);
            }
        });

        jLabel8.setText("Min X:");

        minXTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                minXTextFieldKeyReleased(evt);
            }
        });

        jLabel9.setText("Max X:");

        maxXTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                maxXTextFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(209, 209, 209)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jLabel4)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(initialXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel5)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(initialYTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(equationTextField)
                                                                        .addComponent(diffyeqTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel7))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(stepSizeTextField)
                                                                        .addComponent(stepsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(minXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(maxXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(equationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addComponent(stepSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(diffyeqTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(stepsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(initialXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(initialYTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)
                                        .addComponent(minXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(maxXTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void equationTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setEquation(equationTextField.getText());
        listener.onInputChanged(0, maxXTextField.getText().isEmpty() || minXTextField.getText().isEmpty() || equationTextField.getText().isEmpty());
    }

    private void stepSizeTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setStepSize(stepSizeTextField.getText());
        listener.onInputChanged(1, stepSizeTextField.getText().isEmpty() || diffyeqTextField.getText().isEmpty() || stepsTextField.getText().isEmpty() || initialXTextField.getText().isEmpty()
                || initialYTextField.getText().isEmpty());
    }

    private void diffyeqTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setDiffyEq(diffyeqTextField.getText());
        listener.onInputChanged(2, stepSizeTextField.getText().isEmpty() || diffyeqTextField.getText().isEmpty() || stepsTextField.getText().isEmpty() || initialXTextField.getText().isEmpty()
                || initialYTextField.getText().isEmpty());
    }

    private void stepsTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setSteps(stepsTextField.getText());
        listener.onInputChanged(3, stepSizeTextField.getText().isEmpty() || diffyeqTextField.getText().isEmpty() || stepsTextField.getText().isEmpty() || initialXTextField.getText().isEmpty()
                || initialYTextField.getText().isEmpty());
    }

    private void initialXTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setInitialX(initialXTextField.getText());
        listener.onInputChanged(4, stepSizeTextField.getText().isEmpty() || diffyeqTextField.getText().isEmpty() || stepsTextField.getText().isEmpty() || initialXTextField.getText().isEmpty()
                || initialYTextField.getText().isEmpty());
    }

    private void initialYTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setInitialY(initialYTextField.getText());
        listener.onInputChanged(5, stepSizeTextField.getText().isEmpty() || diffyeqTextField.getText().isEmpty() || stepsTextField.getText().isEmpty() || initialXTextField.getText().isEmpty()
                || initialYTextField.getText().isEmpty());
    }

    private void maxXTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setMaxX(maxXTextField.getText());
        listener.onInputChanged(6, maxXTextField.getText().isEmpty() || minXTextField.getText().isEmpty() || equationTextField.getText().isEmpty());
    }

    private void minXTextFieldKeyReleased(java.awt.event.KeyEvent evt) {
        sharedDataUtil.setMinX(minXTextField.getText());
        listener.onInputChanged(7, maxXTextField.getText().isEmpty() || minXTextField.getText().isEmpty() || equationTextField.getText().isEmpty());
    }

    public interface InputChangedListener {
        public void onInputChanged(int inputType, boolean inputEmpty);
    }
    // End of variables declaration                   
}
