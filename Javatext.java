package com.mycompany.javatext;
import javax.swing.*;
public class Javatext {

    public static void main(String[] args) {
        JFrame a=new JFrame("text");
        JTextField b=new JTextField("metin kutusu");
        b.setBounds(50,100,200,30);
        a.add(b);
        a.setSize(600,600);
        a.setVisible(true);
        a.setLayout(null);
    }
}
