/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.ejb.Stateless;

/**
 *
 * @author mesa
 */
@Stateless
public class ConverterBean implements ConverterBeanLocal {

    @Override
    public double calculate(double value, ConvertType type) {
        if (type == ConvertType.C2F) {
            return value * 2 +30;
        }
        return (value - 32) / 1.8;
    }

}
