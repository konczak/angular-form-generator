/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.konczak.angularformgeneratorapp;

import java.util.Scanner;

/**
 *
 * @author konczak
 */
public class AngularFormGeneratorApp {

    private String name;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        float b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        name = in.nextLine();
        String cmd;
        do {
            System.out.println("Add field [N] or generate [G]");
            cmd = in.nextLine();
            if ("N".equals(cmd)) {
                //execute field addition
            }
        } while (!"G".equals(cmd));

        System.out.println("You entered string " + name);
        System.out.println("Enter an integer");
        a = in.nextInt();
        System.out.println("You entered integer " + a);
        System.out.println("Enter a float");
        b = in.nextFloat();
        System.out.println("You entered float " + b);
    }

}
