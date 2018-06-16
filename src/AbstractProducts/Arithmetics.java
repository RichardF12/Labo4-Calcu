/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractProducts;

import AbstractFactory.ArithmeticFactory;
import AbstractFactory.Calculo;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ricky
 */
public class Arithmetics extends JPanel{
    ArithmeticFactory AF = new ArithmeticFactory();
    

    public int WIDTH = 435, widthTF=120, widthB=50;
    public int HEIGHT = 120, heightTF=30, heightB=30;
    public JTextField textF1,textF2,textF3;
    public JButton button,button2,button3,button4;
    
    public Arithmetics(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(20,20,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(150,20,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(300,40,widthTF,heightTF));
        
        button = new JButton("+");
        button.setBounds(new Rectangle(10,75,widthB,heightB));
        
        button2 = new JButton("-");
        button2.setBounds(new Rectangle(80,75,widthB,heightB));
        
        button3 = new JButton("x");
        button3.setBounds(new Rectangle(155,75,widthB,heightB));
        
        button4 = new JButton("÷");
        button4.setBounds(new Rectangle(225,75,widthB,heightB));
        
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo suma = AF.newArithmetic(1);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = suma.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo resta = AF.newArithmetic(2);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = resta.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo multi = AF.newArithmetic(3);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = multi.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo divs = AF.newArithmetic(4);
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = divs.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        add(textF1);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(textF2);
        add(textF3);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        
    }
}
