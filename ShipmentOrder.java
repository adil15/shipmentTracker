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
public class ShipmentOrder extends Shipment {

    private int orderNumber;
    private double insuranceCost;
    private double totalCost;
    private String insurance;

    public ShipmentOrder(double weight, String method) {
        super(weight, method);
    }

    private void calcInsCost() {
        if ((this.shippingCost < 10) && (this.shippingCost > 1)) {
            if (this.insurance.equalsIgnoreCase("basic")) {
                this.insuranceCost = 0.50;
            } else {
                this.insuranceCost = 2.45;
            }
        } else if (this.shippingCost < 30) {
            if (this.insurance.equalsIgnoreCase("basic")) {
                this.insuranceCost = 1.50;
            } else {
                this.insuranceCost = 3.95;
            }
        } else if (this.insurance.equalsIgnoreCase("basic")) {
            this.insuranceCost = 2.50;
        } else {
            this.insuranceCost = 5.55;
        }
    }

    public double getInsCost() {
        calcInsCost();
        return insuranceCost;
    }

    public double getTotalCost() {
        this.totalCost = this.insuranceCost + this.shippingCost;
        return totalCost;
    }

    public void setIns(String insurance) {
        this.insurance = insurance;
    }

    public void setNumber(int number) {
        this.orderNumber = number;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

}
