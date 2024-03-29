package com.mkpits.java.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtListenerDemo {
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    public AwtListenerDemo(){
        prepareGUI();
    }

    public static void main(String[] args){
        AwtListenerDemo  awtListenerDemo = new AwtListenerDemo();
        awtListenerDemo.showWindowListenerDemo();
    }

    private void prepareGUI(){
        mainFrame = new Frame("Java AWT Examples");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3, 1));
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showWindowListenerDemo(){

        headerLabel.setText("Listener in action: WindowListener");

        Button okButton = new Button("OK");

        aboutFrame = new Frame();
        aboutFrame.setSize(300,200);;
        aboutFrame.setTitle("WindowListener Demo");
        aboutFrame.addWindowListener(new CustomWindowListener());

        Label msgLabel = new Label("Welcome to tutorialspoint.");
        msgLabel.setAlignment(Label.CENTER);
        msgLabel.setSize(100,100);
        aboutFrame.add(msgLabel);
        aboutFrame.setVisible(true);
    }
    Frame aboutFrame;
    class CustomWindowListener implements WindowListener {
        public void windowOpened(WindowEvent e) {
        }

        public void windowClosing(WindowEvent e) {
            aboutFrame.dispose();
        }

        public void windowClosed(WindowEvent e) {
        }

        public void windowIconified(WindowEvent e) {
        }

        public void windowDeiconified(WindowEvent e) {
        }

        public void windowActivated(WindowEvent e) {
        }

        public void windowDeactivated(WindowEvent e) {
        }
    }

}
