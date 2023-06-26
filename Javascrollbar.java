
package com.mycompany.javascrollbar;
import javax.swing.*;
public class Javascrollbar {

    public static void main(String[] args) {
        JFrame frame=new JFrame("example");
        JScrollBar sb=new JScrollBar();
        sb.setBounds(90,90,40,90);
        frame.add(sb);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
