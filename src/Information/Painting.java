/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Information;

import Vaidation.InputValidation;
import com.sun.jndi.toolkit.ctx.Continuation;

/**
 *
 * @author admin
 */
public class Painting extends Item{

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void inputPainting() {
        boolean continued = false;
        
        do {            
            try {
                System.out.println("Enter Painting Height: ");
                height = InputValidation.Int();
                System.out.println("Enter Painting Width: ");
                width = InputValidation.Int();
                System.out.println("Is Water Color? (Y/N): ");
                String In = InputValidation.String();
                if(In.equals("Y")) {
                    isWatercolour = true;
                }
                else if(In.equals("N")) {
                    isWatercolour = false;
                }
                System.out.println("Is Framed?");
                String InFrame = InputValidation.String();
                if(InFrame.equals("Y")) {
                    isFramed = true;
                }
                else if(InFrame.equals("N")) {
                    isFramed = false;
                }
            } catch (Exception e) {
                    System.out.println(e);
            }
        } while (continued);
    }
    public void outputPainting() {
        System.out.println("Painting Height: "+height);
        System.out.println("Painting width: "+width);
        if(isWatercolour = true) {
            System.out.println("Is Watercolour");
        }
        else if(isWatercolour = false) {
            System.out.println("Is Not Watercolour");
        }
        if(isFramed = true) {
            System.out.println("Is Framed");
        }
        else if(isFramed = false) {
            System.out.println("In Not Framed");
        }
    }
}
