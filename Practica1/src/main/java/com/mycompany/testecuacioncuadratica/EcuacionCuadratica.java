/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testecuacioncuadratica;

/**
 *
 * @author Rutedli
 */
public class EcuacionCuadratica {
    private double a;
    private double b;
    private double c;

    public EcuacionCuadratica(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminante(){
        return this.b * this.b - 4 * this.a * this.c ;
    }
    public double getRaiz1(){
        return (double) (-this.b + Math.sqrt(getDiscriminante()))/(2*this.a);
    }
    public double getRaiz2(){
        return (double) ((-this.b-Math.sqrt(getDiscriminante()))/(2*this.a));
    }
    public String toString(){
        
		return String.format("EcuacioCuadratica [%a,%b,%c]",this.a,this.b,this.c);
    }
}
