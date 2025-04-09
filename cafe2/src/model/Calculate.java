/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Calculate {
    private double tax;
    private double subtotal;

    public double getTax() {
        return calTax(subtotal);
    }

    public double getTotal() {
        return subtotal + getTax();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    private double calTax(double t) {
        if (t >= 10000.0 && t <= 20000.0) {
            tax = 500.0;
        } else if (t > 20000.0 && t <= 40000.0) {
            tax = 1000.0;
        } else if (t > 40000.0 && t <= 60000.0) {
            tax = 2000.0;
        } else if (t > 60000.0 && t <= 80000.0) {
            tax = 3000.0;
        } else if (t > 80000.0 && t <= 100000.0) {
            tax = 4000.0;
        } else if (t > 100000.0 && t <= 150000.0) {
            tax = 8000.0;
        } else if (t > 150000.0 && t <= 200000.0) {
            tax = 10000.0;
        } else if (t > 200000.0) {
            tax = 15000.0;
        }
        return tax;
    }
}
