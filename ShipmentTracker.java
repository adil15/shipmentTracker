/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shipmenttracker;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 *
 * @author adilhassan
 */
public class ShipmentTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        ArrayList<ShipmentOrder> ShipList = new ArrayList<>();
        DecimalFormat money = new DecimalFormat("$0.00");

        boolean ShipTime = true;
        while (ShipTime) {
            System.out.println("Enter order number");
            int number = k.nextInt();
            while (number < 0) {
                System.out.println("order number cannot be negative please enter positive number");
                number = k.nextInt();
            }
            System.out.println("Enter weight of shipment (kg)");
            double weight = k.nextDouble();
            while (weight < 0) {
                System.out.println("weight cannot be negative please enter positive weight");
                weight = k.nextDouble();
            }
            System.out.println("Please enter Air for air shipping, Truck for truck shipping, or anything else for mail shipping");
            String method = k.next();
            System.out.println("If you would like basic insurance please type basic or anything else for regular insurance");
            String insurance = k.next();
            ShipmentOrder one = new ShipmentOrder(weight, method);
            one.setNumber(number);
            one.setIns(insurance);
            ShipList.add(one);

            System.out.println("Type in yes to process another order, or no to exit");
            String prompto = k.next();
            if (prompto.equalsIgnoreCase("no")) {
                ShipTime = false;
            }
        }
        for (int i = 0; i < ShipList.size(); i++) {
            ShipmentOrder two = ShipList.get(i);
            System.out.println("Order " + two.getOrderNumber() + "\n" + "Shipping cost is " + money.format(two.getShipCost()) + "\n" + " Insurance cost is " + money.format(two.getInsCost()) + "\n" + " Total Cost is " + money.format(two.getTotalCost()) + "\n");

        }
    }

}
