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
public class Item {

    private  int value;
    private  String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public  void input() {
        boolean continued = false;
        do {

            try {

                System.out.println("Enter item value : ");
                value = InputValidation.Int();
                System.out.println("Enter item creator : ");
                creator = InputValidation.String();
                if (value > 0 && creator != null) {
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

    public  void output() {
        System.out.println("Item Value: "+value);
        System.out.print("Item creator: "+creator);
    }
}
