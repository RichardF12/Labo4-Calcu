/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractProducts.MultiUse;
import Factory.Divide;
import Factory.Multi;
import Factory.Sub;
import Factory.Sum;

/**
 *
 * @author ricky
 */
public class ArithmeticFactory implements MultiUse{
    @Override
    public Calculo newArithmetic(int c){
        switch(c){
            case 1:
                Calculo suma = new Sum();
                return suma;
            case 2:
                Calculo resta = new Sub();
                return resta;
            case 3:
                Calculo multiplicacion = new Multi();
                return multiplicacion;
            case 4:
                Calculo division =  new Divide();
                return division;
        }
        return null;
    }

    @Override
    public Convert newConversion(int d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
