package ch13_2_stack_queue;

import java.util.Stack;

class Coin {
	private int value;
	public Coin(int value) {this.value = value;}
	public int getValue() {return value;}
}

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("거내온 동전: " + coin.getValue() + "원");
		}
		System.out.println("남아 있는 동전: " + coinBox.size() + "개");
	}
}
