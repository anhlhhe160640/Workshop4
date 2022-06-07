/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import Vaidation.InputValidation;

/**
 *
 * @author admin
 */
public class Statue extends Item{
    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void inputStatue() {
        boolean continued = false;
        do {            
            try {
                System.out.println("Enter Statue Weight: ");
                weight = InputValidation.Int();
                System.out.println("Enter Statue Colour: ");
                colour = InputValidation.String();
                if(weight > 0 && colour != null) {
                    continued = false;
                }
                else {
                    throw new Exception("Error please try again!");
                }
            } catch (Exception e) {
                System.out.println(e);
                continued = true;
            }
        } while (continued);
    }
    public void outputStatue() {
        System.out.println("Statue Weight: "+ weight);
        System.out.println("Statue Colour: "+colour);
    }
   }
