
package com.mycompany.butonaction;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class Butonaction {

    public static void main(String[] args) {
        JFrame frame =new JFrame("MALSELEN");
        JTextField txtf1=new JTextField();
        JTextField txtf2=new JTextField();
        JTextField txtf3=new JTextField("x");
        JLabel l1=new JLabel();
        JButton but1=new JButton();
        
        txtf1.setBounds(100,30,100,30);
        txtf2.setBounds(230,30,100,30);
        txtf3.setBounds(400,30,100,30);
        l1.setBounds(100,90,100,30);
        
        but1.setBounds(100,120,80,40);
        
        txtf3.addActionListener((ActionEvent ae)->
        {
            int a=Integer.parseInt(txtf1.getText());
            int b=Integer.parseInt(txtf2.getText());
            String m11=String.valueOf(a+b);
            l1.setText(m11);
        });
        
        
        
        frame.add(txtf1);
        frame.add(txtf2);
        frame.add(txtf3);

        frame.add(l1);
        frame.add(but1);
        frame.setLayout(null);
        frame.setSize(600,400);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);       
    }
}
