package com.functionalprogramming.session_9;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@ToString
public class Order {
    private List<String> cart = new ArrayList<> ();
    private String address = "some_address";

    public Order () {
    }

    public Order (List<String> cart, String address) {
        this.cart = cart;
        this.address = address;
    }

    public Order add (String item) {
        cart.add (item);
        return new Order (this.cart, this.address);
    }

    public Order deliver (final String deliverAt) {
        address = deliverAt;
        System.out.println ("Delivering order to " + address);
        return new Order (this.cart, this.address);
    }

    public static void placeOrder (Function<Order, Order> function){
        Order order = new Order ();
        final Order apply = function.apply (order);
        System.out.println (apply);
    }
}
