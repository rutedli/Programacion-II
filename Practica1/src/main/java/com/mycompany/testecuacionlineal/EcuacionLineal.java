/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecuacionlineal;

/**
 *
 * @author Rutedli
 */
public class EcuacionLineal {
    // Atributos privados
    private double a, b, c, d, e, f;

    // Constructor
    public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Método que verifica si el sistema tiene solución
    public boolean tieneSolucion() {
        return (a * d - b * c) != 0;
    }

    // Método que devuelve X
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // Método que devuelve Y
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}