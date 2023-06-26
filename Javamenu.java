package com.mycompany.javamenu;
import javax.swing.*;
public class Javamenu {
    public static void main(String[] args) {
        JFrame frame=new JFrame("example");
        JMenu menu=new JMenu("options");
        JMenuItem a1,a2;
        JMenuBar menubar=new JMenuBar();
        a1=new JMenuItem("example");
        a2=new JMenuItem("example2");
        menu.add(a1);
        menu.add(a2);
        menubar.add(menu);
        frame.setJMenuBar(menubar);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);       
    }   
}
