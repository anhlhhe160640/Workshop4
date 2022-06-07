/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import java.util.Scanner;

import Vaidation.InputValidation;

/**
 *
 * @author admin
 */
public class Vase extends Item{
    private  int height;
    private  String material;

    public Vase() {
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

   

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        boolean continued = false;
        do {
            try {
                System.out.println("Enter Vase height : ");
                height = InputValidation.Int();
                System.out.println("Enter Vase materials : ");
                material = InputValidation.String();
                if (height > 0 || material != null) {
                    continued = false;
                } else {
                    throw new Exception("Error! Please Try Again!");
                }
            } catch (Exception e) {
                System.out.println(e);
                continued = true;
            }
        } while (continued);
    }

    public void outputVase() {
        System.out.println(height);
        System.out.println(material);
    }

}
