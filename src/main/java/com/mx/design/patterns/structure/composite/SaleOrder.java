package com.mx.design.patterns.structure.composite;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SaleOrder {
	
	private long orderId;
    private String customer;
    private Calendar dateTime;
    private List<AbstractProduct> products = new ArrayList<AbstractProduct>();

    public SaleOrder(long orderId, String customer) {
        super();
        this.orderId = orderId;
        this.customer = customer;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Calendar getDateTime() {
        return dateTime;
    }

    public void setDateTime(Calendar dateTime) {
        this.dateTime = dateTime;
    }

    public List<AbstractProduct> getProducts() {
        return products;
    }

    public void setProducts(List<AbstractProduct> products) {
        this.products = products;
    }

    public double getPrice() {
        double price = 0d;
        for (AbstractProduct child : products) {
            price += child.getPrice();
        }
        return price;
    }

    public void addProduct(AbstractProduct product) {
        products.add(product);
    }

    public void removeProduct(AbstractProduct product) {
        products.remove(product);
    }

    public void printOrder() {
        NumberFormat formater = new DecimalFormat("###,##0.00");
        System.out.println("Orden: " + orderId + "nCliente: " + customer + "nProductos:");
        for (AbstractProduct prod : products) {
            System.out.println(prod.getName() + ":$ " + formater.format(prod.getPrice()));

        }
        System.out.println("Total: " + formater.format(getPrice()) + "\n=============================================");
    }	

}
