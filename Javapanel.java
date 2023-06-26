
package com.mycompany.javapanel;

import javax.swing.*;
public class Javapanel {

    public static void main(String[] args) {
        JFrame frame=new JFrame("example");
        JPanel panel=new JPanel();
        panel.setBounds(40,70,200,200);
        JButton button=new JButton("click");
        button.setBounds(60,50,80,40);
        panel.add(button);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
