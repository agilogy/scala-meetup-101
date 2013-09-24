package com.meetup.java;

public class PurchaseProcessorFactory {

	public PurchaseProcessor forPoyPol() {
		return new PurchaseProcessor() {

			@Override
			public void process(Purchase t) {
				// process t using PoyPol system
			}
		};
	}

	public PurchaseProcessor forViso() {
		return new PurchaseProcessor() {

			@Override
			public void process(Purchase t) {
				// process t using Viso
			}
		};

	}

}
