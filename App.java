package com.code;

import javax.swing.*;

public class App {
    private JPanel panelMain;
    private JRadioButton radioButtonSimple;
    private JRadioButton radioButtonGeneral;
    private JLabel labelTitle;
    private JLabel labelBoardSize;
    private JTextField textFieldBoardSize;
    private JPanel panelBoard;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


