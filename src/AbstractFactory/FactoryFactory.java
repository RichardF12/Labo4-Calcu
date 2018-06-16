/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import AbstractProducts.MultiUse;

/**
 *
 * @author ricky
 */
public class FactoryFactory {
    public MultiUse newFactory(int e){
        switch(e){
            case 1:
                return new ArithmeticFactory();
            case 2:
                return new ConverterFactory();
        }
        return null;
    }
}
