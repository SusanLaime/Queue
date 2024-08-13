package view;

import model.FixedHmmm;

public class Screen_2 {

	public static void main(String[] args) {

		FixedHmmm queue = new FixedHmmm(5);

		try {
			queue.enqueue(1);
			queue.enqueue(2);
			queue.enqueue(3);
			queue.enqueue(4);
			queue.enqueue(5);
			queue.enqueue(6); // Should throw an exception
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Queue elements:");
		queue.displayQueue();

		try {
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue();
			queue.dequeue(); // Should throw an exception
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("Queue elements after dequeue:");
		queue.displayQueue();

	}

}
