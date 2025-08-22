/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testecuacioncuadratica;

/**
 *
 * @author Rutedli
 */
public class TestEcuacionCuadratica {

    public static void main(String[] args) {
        EcuacionCuadratica ecu1=new EcuacionCuadratica(1.0, 3,1);
        EcuacionCuadratica ecu2=new EcuacionCuadratica(1, 2.0,1);
        EcuacionCuadratica ecu3=new EcuacionCuadratica(1, 2, 3);
        
        if (ecu1.getDiscriminante() < 0) {
            System.out.println("La ecuación no tiene raíces reales");
        } else {
            if (ecu1.getRaiz1() == ecu1.getRaiz2()) {
                System.out.println("La ecuación tiene una raíz " + ecu1.getRaiz1());
                } else {
                    System.out.println("La ecuación tiene dos raíces " + ecu1.getRaiz1() + " y " + ecu1.getRaiz2());
                }   
        }
        
        if (ecu2.getDiscriminante() < 0) {
            System.out.println("La ecuación no tiene raíces reales");
        } else {
            if (ecu2.getRaiz1() == ecu2.getRaiz2()) {
                System.out.println("La ecuación tiene una raíz " + ecu2.getRaiz1());
                } else {
                    System.out.println("La ecuación tiene dos raíces " + ecu2.getRaiz1() + " y " + ecu2.getRaiz2());
                }   
        }
        
        
        
        if (ecu3.getDiscriminante() < 0) {
            System.out.println("La ecuación no tiene raíces reales");
        } else {
            if (ecu3.getRaiz1() == ecu3.getRaiz2()) {
                System.out.println("La ecuación tiene una raíz " + ecu3.getRaiz1());
                } else {
                    System.out.println("La ecuación tiene dos raíces " + ecu3.getRaiz1() + " y " + ecu3.getRaiz2());
                }   
        }
    }
}
