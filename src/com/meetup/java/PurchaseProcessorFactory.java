package com.meetup.java;

public class PurchaseProcessorFactory {

    public PurchaseProcessor forPayPal() {
        return new PurchaseProcessor() {

            @Override
            public void process(Purchase t) {
                // process t using PayPal system
            }
        };
    }

    public PurchaseProcessor forVisa() {
        return new PurchaseProcessor() {

            @Override
            public void process(Purchase t) {
                // process t using Visa
            }
        };

    }

}
