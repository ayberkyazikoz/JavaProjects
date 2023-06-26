package com.mycompany.Framedeneme;
import javax.swing.*;
import java.awt.event.ActionEvent;
public class Framedeneme {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Hesap Makinesi");
        JPanel panel=new JPanel();
        JTextField txtf1=new JTextField();
        JTextField txtf2=new JTextField();
        JLabel label1=new JLabel("Sonuç 1: ");
        JButton topbut=new JButton("+");
        JButton cikbut=new JButton("-");
        JButton carpbut=new JButton("*");
        JButton bolbut=new JButton("/");
        
        topbut.addActionListener((ActionEvent ae)->
        {
            int sayi1=Integer.parseInt(txtf1.getText());
            int sayi2=Integer.parseInt(txtf2.getText());
            String m1=String.valueOf(sayi1+sayi2);
            label1.setText(m1);
        });
        cikbut.addActionListener((ActionEvent ae)->
        {
            int sayi1=Integer.parseInt(txtf1.getText());
            int sayi2=Integer.parseInt(txtf2.getText());
            String m1=String.valueOf(sayi1-sayi2);
            label1.setText(m1);
        });
        carpbut.addActionListener((ActionEvent ae)->
        {
            int sayi1=Integer.parseInt(txtf1.getText());
            int sayi2=Integer.parseInt(txtf2.getText());
            String m1=String.valueOf(sayi1*sayi2);
            label1.setText(m1);
        });
        bolbut.addActionListener((ActionEvent ae)->
        {
            int sayi1=Integer.parseInt(txtf1.getText());
            int sayi2=Integer.parseInt(txtf2.getText());
            String m1=String.valueOf(sayi1/sayi2);
            label1.setText(m1);
        });
                
        txtf1.setBounds(230,50,80,50);
        txtf2.setBounds(330,50,80,50);
        label1.setBounds(300,250,50,50);
        topbut.setBounds(220,200,50,50);
        cikbut.setBounds(270,200,50,50);
        carpbut.setBounds(320,200,50,50);
        bolbut.setBounds(370,200,50,50);
        
        frame.add(panel);
        frame.add(txtf1);
        frame.add(txtf2);
        frame.add(label1);
        frame.add(topbut);
        frame.add(cikbut);
        frame.add(carpbut);
        frame.add(bolbut);
        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(true);
        
    }
}
