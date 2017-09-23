/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipmenttracker;

/**
 *
 * @author adilhassan
 */
public class Shipment {

    protected double weight;
    protected String method;
    protected double shippingCost;

    public Shipment(double weight, String method) {
        this.weight = weight;
        this.method = method;
    }

    private void calcShip() {

        if (this.weight < 10) {
            if (this.method.equalsIgnoreCase("air")) {
                this.shippingCost = this.weight * 4.0;
            } else if (this.method.equalsIgnoreCase("truck")) {
                this.shippingCost = this.weight * 3.0;
            } else {
                this.shippingCost = this.weight * 2.0;
            }
        } else if (this.weight < 20) {
            if (this.method.equalsIgnoreCase("air")) {
                this.shippingCost = this.weight * 3.0;
            } else if (this.method.equalsIgnoreCase("truck")) {
                this.shippingCost = this.weight * 2.45;

            } else {
                this.shippingCost = this.weight * 1.75;
            }
        } else if (this.method.equalsIgnoreCase("air")) {
            this.shippingCost = this.weight * 2.50;
        } else if (this.method.equalsIgnoreCase("truck")) {
            this.shippingCost = this.weight * 1.95;
        } else {
            this.shippingCost = this.weight * 1.55;
        }
    }

    public double getShipCost() {
        calcShip();
        return this.shippingCost;
    }
}
