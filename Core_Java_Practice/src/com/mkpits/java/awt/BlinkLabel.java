package com.mkpits.java.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkLabel extends JLabel {
    private static final long serialVersionUID = 1L;

    private static final int BLINKING_RATE = 1000; // in ms

    private boolean blinkingOn = true;

    public BlinkLabel(String text) {
        super(text);
        ImageIcon imgThisImg = new ImageIcon("C:\\Users\\Administrator\\IdeaProjects\\AwtExample\\src\\com\\mkpits\\java\\awtexample\\up.png");

        super.setIcon(imgThisImg);
        Timer timer = new Timer( BLINKING_RATE , new TimerListener(this));
        timer.setInitialDelay(0);
        timer.start();
    }

    public void setBlinking(boolean flag) {
        this.blinkingOn = flag;
    }
    public boolean getBlinking(boolean flag) {
        return this.blinkingOn;
    }


    private class TimerListener implements ActionListener {
        private BlinkLabel bl;
        private Color bg;
        private Color fg;
        private boolean isForeground = true;

        public TimerListener(BlinkLabel bl) {
            this.bl = bl;
            fg = bl.getForeground();
            bg = bl.getBackground();
        }

        public void actionPerformed(ActionEvent e) {
            if (bl.blinkingOn) {
                if (isForeground) {
                    bl.setForeground(fg);
                }
                else {
                    bl.setForeground(bg);
                }
                isForeground = !isForeground;
            }
            else {
                // here we want to make sure that the label is visible
                // if the blinking is off.
                if (isForeground) {
                    bl.setForeground(fg);
                    isForeground = false;
                }
            }
        }

    }

    // --- for testing
    private static void createAndShowUI() {

        JFrame frame = new JFrame("BlinkLabel");
        JPanel jp=new JPanel();
        jp.setBounds(10,20,200,400);
        jp.setBackground(Color.gray);
        jp.setLayout(null);

        JPanel jp21=new JPanel();
        jp21.setBounds(10,10,180,80);
        jp21.setBackground(Color.yellow);
        jp21.setLayout(null);
        JLabel j1=new JLabel("0");
        j1.setBounds(70,10,150,100);
        jp21.add(j1);
        jp.add(jp21);

        JPanel jp212=new JPanel();
        jp212.setBounds(10,100,180,80);
        jp212.setBackground(Color.yellow);
        jp212.setLayout(null);

        final BlinkLabel bl = new BlinkLabel("UP");

        bl.setBounds(70,120,150,100);
        bl.setBackground(Color.white);
//jp212.add(bl);
//jp.add(jp212);
        jp.add(bl);

        JPanel jp2=new JPanel();
        jp2.setBounds(10,220,180,80);
        jp2.setBackground(Color.yellow);
        jp2.setLayout(null);

        final JLabel bl1 = new JLabel("Fan off");
        bl1.setBounds(20,20,150,50);

        jp2.add(bl1);
        jp.add(jp2);

        // frame.getContentPane().setLayout(new java.awt.FlowLayout());
        //frame.getContentPane().add(bl);

        JPanel jpp=new JPanel();
        jpp.setBounds(300,20,200,400);
        jpp.setLayout(null);


        JButton b = new JButton("toogle blink");
        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        bl.blinkingOn = !bl.blinkingOn;
                    }
                });
        b.setBounds(10,300,100,50);
        jpp.add(b);
        //jp.add(b);
        frame.add(jp);
        frame.add(jpp);
        // frame.getContentPane().add(b);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(700,600);
        //frame.pack();
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);

    }

    public static void main(String[] args)  {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                createAndShowUI();
            }
        });
    }
    // ---

}
