/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import AbstractFactory.Convert;
/**
 *
 * @author ricky
 */
public class Binary implements Convert{

    @Override
    public String ConvertirBin(int a){
        return Integer.toBinaryString(a);
        
    }

    @Override
    public int Convertir(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
