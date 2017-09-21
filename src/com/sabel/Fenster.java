package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

    private JButton jbtnRot;
    private JButton jbtnGelb;
    private JButton jbtnBlau;
    private JPanel jPanel;

    public Fenster() {
        this.setTitle("Farbenauswahl");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        initEvents();
        this.setSize(300, 300);
        this.setVisible(true);
    }

    private void initEvents() {
        MeinInnererActionListener mial = new MeinInnererActionListener();
        jbtnBlau.addActionListener(mial);
        jbtnGelb.addActionListener(mial);
        jbtnRot.addActionListener(mial);

    }
    private void initComponents() {
        jPanel = new JPanel();
        jbtnBlau = new JButton();
        jbtnBlau.setText("Blau");
        jPanel.add(jbtnBlau);
        jbtnGelb = new JButton("Gelb");
        jPanel.add(jbtnGelb);
        jbtnRot = new JButton("Rot");
        jPanel.add(jbtnRot);
        this.add(jPanel);
    }

    public class MeinInnererActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.out.println(e.getActionCommand());

            switch (e.getActionCommand()) {
                case "Rot":
                    jPanel.setBackground(Color.RED);
                    break;
                case "Gelb":
                    jPanel.setBackground(Color.YELLOW);
                    break;
                case "Blau":
                    jPanel.setBackground(Color.BLUE);
                    break;
            }

        }
    }
}

