package poo2;

import java.util.ArrayList;

public class Person {
	private String firstname;
	private String lastname;
	private Basket basket;

	public Person() {
		this.basket = new Basket();
	}

	public Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.basket = new Basket();
	}

	public Person(String firstname, String lastname, Basket basket) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.basket = basket;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public void ramasserPomme(Apple apple) {
		this.basket.addApple(apple);
		System.out.println(this.firstname + " " + this.lastname
				+ " vient de ramasser " + apple.getName() + ".");
	}

	public void ramasserPommes(ArrayList<Apple> apples) {
		this.basket.addApples(apples);
		System.out.println(this.firstname + " " + this.lastname
				+ " vient de ramasser " + apples.size() + " pommes.");
	}

	public void echangePomme(Person person, Integer itemNB) {
		if (itemNB <= this.basket.getApples().size()) {
			for (int i = 0; i < itemNB; i++) {
				Apple toExchange = this.basket.getApples().get(0);
				this.basket.removeApple(toExchange);
				person.basket.addApple(toExchange);
			}
			System.out.println(this.firstname + " " + this.lastname
					+ " vient de donner " + itemNB + " pommes à "
					+ person.firstname + " " + person.lastname + ".");
		} else {
			System.out.println(this.firstname + " " + this.lastname
					+ " ne posède pas autant de pommes.");
		}
	}

	public void mangerPomme() {
		if (this.basket.getApples().size() > 0) {
			Apple apple = this.basket.getApples().get(0);
			this.basket.removeApple(apple);
			System.out.println(this.firstname + " " + this.lastname + " mange "
					+ apple.getName() + " hummmmmmm.");
		} else {
			System.out.println("Quel malheur " + this.firstname + " "
					+ this.lastname + " n'a plus aucune pomme.");
		}
	}

	public void tatin() {
		if (this.basket.getApples().size() >= 6) {
			for (int i = 0; i < 6; i++) {
				Apple apple = this.basket.getApples().get(0);
				this.basket.removeApple(apple);
			}
			System.out.println(this.firstname + " " + this.lastname
					+ " vient de faire une bonne tarte tatin.");
		} else {
			System.out.println("Quel malheur " + this.firstname + " "
					+ this.lastname
					+ " n'a plus assez de pommes pour faire une tarte tatin.");
		}
	}
}
