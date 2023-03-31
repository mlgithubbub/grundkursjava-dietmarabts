package de.javagrundlagen.Kapitel01;

import javax.swing.*;
import java.awt.*;

public class Demo3 extends JApplet {
    public void init(){
//        Icon icon = new ImageIcon(getClass().getResource("duke.png"));
        JLabel label = new JLabel("Viel Erfolg mit dem Grundkurs Java", /*icon, */JLabel.CENTER);
        add(label);

        Font schrift = new Font("SansSerif", Font.BOLD, 20);
        label.setFont(schrift);
        label.setForeground(Color.red);
        label.setBackground(Color.white);
        label.setOpaque(true);
    }
}
