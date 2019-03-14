package com.objectoriented.eclipse;

class Hamburger {
	private String rollType;
	private double price;
	private String name;
	private String addition1Name;
	private double addition1Price;

	private String addition2Name;
	private double addition2Price;

	private String addition3Name;
	private double addition3Price;

	private String addition4Name;
	private double addition4Price;

	public Hamburger(String rollType, String meat, double price, String name) {
		this.rollType = rollType;
		this.price = price;
		this.name = name;
	}

	public void addHamAdd1(String name, double price) {
		this.addition1Name = name;
		this.addition1Price = price;
	}

	public void addHamAdd2(String name, double price) {
		this.addition2Name = name;
		this.addition2Price = price;
	}

	public void addHamAdd3(String name, double price) {
		this.addition3Name = name;
		this.addition3Price = price;
	}

	public void addHamAdd4(String name, double price) {
		this.addition4Name = name;
		this.addition4Price = price;
	}

	public double itemizedHam() {
		double finalprice = this.price;
		System.out.println(this.name + " hamburger on a " + this.rollType + " roll price is " + this.price);
		if (addition1Name != null) {
			finalprice += this.addition1Price;
			System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
		}
		if (addition2Name != null) {
			finalprice += this.addition2Price;
			System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
		}
		if (addition3Name != null) {
			finalprice += this.addition3Price;
			System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
		}
		if (addition4Name != null) {
			finalprice += this.addition4Price;
			System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
		}
		return finalprice;
	}

}

class Healthy extends Hamburger {
	private String healthyExtra1Name;
	private double healthyExtra1Price;

	private String healthyExtra2Name;
	private double healthyExtra2Price;

	public Healthy(String meat, double price) {
		super("Healthy", meat, price, "Brown roy");
		this.healthyExtra1Name = healthyExtra1Name;
	}

	public void addHealthyAdd1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
	}

	public void addHealthyAdd2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
	}

	@Override
	public double itemizedHam() {
		double finalPrice = super.itemizedHam();
		if (healthyExtra1Name != null) {
			finalPrice += this.healthyExtra1Price;
			System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);

		}
		if (healthyExtra2Name != null) {
			finalPrice += this.healthyExtra2Price;
			System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);

		}
		return finalPrice;
	}
}

class Deluxe extends Hamburger {

	public Deluxe() {
		super("Pork", "Bacon", 14.23, "White");
		super.addHamAdd1("chips", 2.45);
		super.addHamAdd2("drink", 1.50);
	}

	@Override
	public void addHamAdd1(String name, double price) {
		System.out.println("Can not add additional items to a delux burger");
	}

	@Override
	public void addHamAdd2(String name, double price) {
		System.out.println("Can not add additional items to a delux burger");
	}

	@Override
	public void addHamAdd3(String name, double price) {
		System.out.println("Can not add additional items to a delux burger");
	}

	@Override
	public void addHamAdd4(String name, double price) {
		System.out.println("Can not add additional items to a delux burger");
	}
}

public class BillsBurger {
	public static void main(String[] args) {
		Hamburger ham = new Hamburger("Basic", "Chicken", 3.40, "White");
		ham.itemizedHam();

		ham.addHamAdd1("Tomatos", 1.28);
		ham.addHamAdd2("Onions", 0.86);
		ham.addHamAdd3("Cheese", 1.56);
		ham.addHamAdd4("Lettuce", 1.73);
		// price=ham.itemizedHam();
		System.out.println("Total Burger Price is " + ham.itemizedHam());

		Healthy healthy = new Healthy("Sauusage", 2.56);
		healthy.addHealthyAdd1("cheese", 1.83);
		healthy.addHealthyAdd2("lettuce", 0.52);
		System.out.println("Total Healthy Burger price is" + healthy.itemizedHam());

		Deluxe del = new Deluxe();
		del.addHamAdd2("Should not do this", 50.53);
		del.itemizedHam();
	}

}
