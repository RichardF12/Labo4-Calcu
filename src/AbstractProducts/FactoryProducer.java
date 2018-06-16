/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractProducts;

import AbstractFactory.Calculo;
import AbstractFactory.Convert;
/**
 *
 * @author ricky
 */
public interface FactoryProducer {
    public Calculo newArithmetic(int c);
    public Convert newConversion(int d);
}
