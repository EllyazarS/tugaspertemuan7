/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanpt7;

/**
 *
 * @author elzyko
 */
public class linearEquation {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    
    public linearEquation() {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
}

  public int getA() {
        return this.a;
    }
    
    public int getB() {
        return this.b;
    }
    
    public int getC() {
        return this.c;
    }
    
    public int getD() {
        return this.d;
    }
    
    public int getE() {
        return this.e;
    }
    
    public int getF() {
        return this.f;
    }
    
    public int getX() {
        return ((this.getE() * this.getD() - this.getB() * this.getF())/(this.getA() * this.getD() - this.getB() * this.getC())); 
    }
    
    public int getY() {
        return ((this.getA() * this.getF() - this.getE() * this.getC())/(this.getA() * this.getD() - this.getB() * this.getC()));
    }
    
    public boolean isSolvable() {
        if (this.getA() * this.getD() - this.getB() * this.getC() != 0) {
            return true;
        }
        
        return false;
    }
    
    public void setA(int a) {
        this.a = a;
    }
    
    public void setB(int b) {
        this.b = b;
    }
    
    public void setC(int C) {
        this.c = c;
    }
    
    public void setD(int d) {
        this.d = d;
    }
    
    public void setE(int e) {
        this.e = e;
    }
    
    public void setF(int f) {
        this.f = f;
    }
}