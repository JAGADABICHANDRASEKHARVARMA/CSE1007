package com.JAVACSE1007.LABDA4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ColorDemo extends JFrame implements ItemListener
{
    int r=0,g=0,b=0;
    JCheckBox red,green,blue;
    JPanel P = new JPanel();
    JPanel cpanel = new JPanel();
    Container pane = getContentPane();
    ColorDemo(String cd){
        super(cd);
        red = new JCheckBox("red");
        red.addItemListener(this);
        green = new JCheckBox("green");
        green.addItemListener(this);
        blue = new JCheckBox("blue");
        blue.setSelected(true);
        blue.addItemListener(this);
        cpanel.add(red);
        cpanel.add(green);
        cpanel.add(blue);
        getContentPane().add(cpanel,"North");
        setSize(400,400);
        setVisible(true);
        getContentPane().add(P);
        P.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        setVisible(true);
        cpanel = new JPanel();
        getContentPane().add(cpanel, BorderLayout.CENTER);
        cpanel.setLayout(new CardLayout(100, 100));
        cpanel.add(P, "name");
        P.setAlignmentX(JComponent.CENTER_ALIGNMENT);
        P.setBackground(new Color(0,0,255));
    }
    public static void main(String[] args)
    {
        com.JAVACSE1007.LABDA4.ColorDemo cd = new com.JAVACSE1007.LABDA4.ColorDemo("Color Check Box");
        cd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent ie){
        if(ie.getItem() == red)
            if(red.isSelected()) r=255; else r=0;
        if(ie.getItem() == green)
            if(green.isSelected()) g=255; else g=0;
        if(ie.getItem() == blue)
            if(blue.isSelected()) b=255; else b=0;
        P.setBackground(new Color(r,g,b));
    }
}

