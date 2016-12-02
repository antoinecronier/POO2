package poo2;

import java.util.ArrayList;

public class Basket {
	private ArrayList<Apple> apples;

	public Basket(){
		this.apples = new ArrayList<Apple>();
	}

	public ArrayList<Apple> getApples(){
		return apples;
	}

	public Basket addApple(Apple apple){
		this.apples.add(apple);
		return this;
	}

	public Basket addApples(ArrayList<Apple> apples) {
		for (Apple apple : apples) {
			this.addApple(apple);
		}
		return this;
	}

	public Basket removeApple(Apple apple){
		this.apples.remove(apple);
		return this;
	}

	public Basket removeApples(ArrayList<Apple> apples) {
		for (Apple apple : apples) {
			this.removeApple(apple);
		}
		return this;
	}
}
