/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractProducts.FactoryProducer;
import Factory.Binary;


/**
 *
 * @author ricky
 */
public class ConverterFactory implements FactoryProducer{

    @Override
    public Convert newConversion(int d) {
        switch(d){
            case 1:
                return new Binary();
        }
        return null;
        
    }
    
    @Override
    public Calculo newArithmetic(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
