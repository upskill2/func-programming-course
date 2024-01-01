package com.functionalprogramming.session_8;

import com.functionalprogramming.session_9.Order;

public class FluentShopping {

    public static void main (String[] args) {

        Order order = new Order ()
        .add ("Shoes")
        .add ("Headphones")
        .deliver ("Home");
        Order.placeOrder (order1 -> order1.add ("Shoes").add ("Headphones").deliver ("Home"));



    }
}
