/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testpromediodesviacion;

/**
 *
 * @author Rutedli
 */
public class PromedioDesviacion {
    private double[] numeros;
    public PromedioDesviacion(double[] numeros) {
        this.numeros=numeros;
    }
    public double getPromedio(){
        double suma = 0;
        for (double n : numeros) {
            suma += n;
        }
        return suma / numeros.length;
    }
    public double getDesviacion(){
        double promedio = getPromedio(); 
        double suma = 0;

    for (double n : numeros) {
        suma += Math.pow(n - promedio, 2);
    }

    return Math.sqrt(suma / (numeros.length - 1));
    }
}
