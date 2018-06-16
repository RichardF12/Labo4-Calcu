/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractProducts;

import AbstractFactory.FactoryFactory;
import AbstractFactory.Calculo;
import AbstractFactory.Convert;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ricky
 */
public class Arithmetics extends JPanel{
    FactoryFactory Factory = new FactoryFactory();
    

    public int WIDTH = 785, widthTF=120, widthB=50;
    public int HEIGHT = 120, heightTF=30, heightB=30;
    public JTextField textF1,textF2,textF3,textF4,textF5;
    public JButton button,button2,button3,button4,button5;
    public JLabel Label1,Label2,Label3,Label4,Label5;
    
    public Arithmetics(){
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(15,30,widthTF,heightTF));
        
        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(150,30,widthTF,heightTF));
        
        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(300,30,widthTF,heightTF));
        
        textF4 = new JTextField();
        textF4.setBounds(new Rectangle(500,30,widthTF,heightTF));
        
        textF5 = new JTextField();
        textF5.setBounds(new Rectangle(650,30,widthTF,heightTF));
        
        button = new JButton("+");
        button.setBounds(new Rectangle(10,75,widthB,heightB));
        
        button2 = new JButton("-");
        button2.setBounds(new Rectangle(80,75,widthB,heightB));
        
        button3 = new JButton("x");
        button3.setBounds(new Rectangle(155,75,widthB,heightB));
        
        button4 = new JButton("÷");
        button4.setBounds(new Rectangle(225,75,widthB,heightB));
        
        button5 = new JButton("Binario");
        button5.setBounds(new Rectangle(590,75,80,heightB));
        
        Label1 = new JLabel("Calculadora");
        Label1.setBounds(new Rectangle(10,5,400,heightB));
        
        Label2 = new JLabel("Conversor");
        Label2.setBounds(new Rectangle(500,5,400,heightB));
        
        Label3 = new JLabel("");
        Label3.setBounds(new Rectangle(150,20,widthTF,heightB));
        
        Label4 = new JLabel("=");
        Label4.setBounds(new Rectangle(280,30,widthTF,heightB));
        
        Label5 = new JLabel("=");
        Label5.setBounds(new Rectangle(630,30,widthTF,heightB));
        
        
        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);
        textF4.setEditable(true);
        textF5.setEditable(false);
        
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo suma = Factory.newFactory(1).newArithmetic(1);
                Label3.setText("+");
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = suma.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo resta = Factory.newFactory(1).newArithmetic(2);
                Label3.setText("-");
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = resta.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo multi = Factory.newFactory(1).newArithmetic(3);
                Label3.setText("x");
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = multi.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Calculo divs = Factory.newFactory(1).newArithmetic(4);
                Label3.setText("÷");
                
                int a = Integer.parseInt(textF1.getText());
                int b = Integer.parseInt(textF2.getText());
                float c = divs.Calculo(a,b);
                
                textF3.setText(String.valueOf(c));
            }
        });
        
        button5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0){
                Convert bin = Factory.newFactory(2).newConversion(1);
                
                int a = Integer.parseInt(textF4.getText());
                String c = bin.ConvertirBin(a);
                
                textF5.setText(String.valueOf(c));
            }
        });
        
        add(textF1);
        add(button);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(textF2);
        add(textF3);
        add(textF4);
        add(textF5);
        add(Label1);
        add(Label2);
        add(Label3);
        add(Label4);
        add(Label5);
        setLayout(null);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
        

        
    }
}
