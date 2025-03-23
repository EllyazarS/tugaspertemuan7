/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.latihanpt7;
import java.util.Scanner;

/**
 *
 * @author elzyko
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        linearEquation object = new linearEquation();
        
        System.out.println("Masukkan angka!");
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        e = scanner.nextInt();
        f = scanner.nextInt();
        
        object.setA(a);
        object.setB(b);
        object.setC(c);
        object.setD(d);
        object.setE(e);
        object.setF(f);
        
        if (object.isSolvable()) {
            System.out.println(object.getX() + ", " + object.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}
