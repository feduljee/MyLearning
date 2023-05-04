package com.lowes.myLambda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
  public static void main(String[] args) {
    Frame frame = new Frame("ActionListener Before Java8");

    Button b = new Button("Click Here");

    b.setBounds(50,100,80,50);

    // Without Lambda
//    b.addActionListener(new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        System.out.println("Hello World!");
//      }
//    });

    // Using Lambda
    b.addActionListener(e -> System.out.println("Hello World"));

    frame.add(b);
    frame.setSize(500,500);
    frame.setLayout(null);
    frame.setVisible(true);
  }
}
