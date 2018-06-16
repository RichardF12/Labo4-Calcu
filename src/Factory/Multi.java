/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import AbstractFactory.Calculo;

/**
 *
 * @author ricky
 */
public class Multi implements Calculo{

    @Override
    public float Calculo(float a, float b) {
        return a*b;
    }
    
}
