package view;

import model.FixedCapacityQueue;
import model.Queue_trial;

public class Screen {
	public static void main(String[] args) {

		Queue_trial queue = new Queue_trial(5);
		FixedCapacityQueue fixedQ= new FixedCapacityQueue(4);

//		// Test enqueue
//		assert queue.enqueue(1);
//		assert queue.enqueue(2);
//		assert queue.enqueue(3);
//		assert queue.enqueue(4);
//		assert queue.enqueue(5);
//		assert !queue.enqueue(6); // Queue should be full
//
//		// Test size
//		assert queue.size() == 5;
//
//		// Test dequeue
//		assert queue.dequeue() == 1;
//		assert queue.dequeue() == 2;
//		assert queue.dequeue() == 3;
//		assert queue.size() == 2;
//
//		// Test wrap-around
//		assert queue.enqueue(6);
//		assert queue.enqueue(7);
//		assert queue.size() == 4;
//		assert queue.dequeue() == 4;
//		assert queue.dequeue() == 5;
//		assert queue.dequeue() == 6;
//		assert queue.dequeue() == 7;
//		assert queue.size() == 0;
//		assert queue.dequeue() == null; // Queue should be empty

	       // Test enqueue
        System.out.println("Enqueue 1: " + queue.enqueue(1));
        System.out.println("Enqueue 2: " + queue.enqueue(2));
        System.out.println("Enqueue 3: " + queue.enqueue(3));
        System.out.println("Enqueue 4: " + queue.enqueue(4));
        System.out.println("Enqueue 5: " + queue.enqueue(5));
        System.out.println("Enqueue 6 (should be false): " + queue.enqueue(6)); // Queue should be full
        System.out.println("The Queue is: "+ isEmpty);

        // Test size
        System.out.println("Current size (should be 5): " + queue.size());

        // Test dequeue
        System.out.println("Dequeue (should be 1): " + queue.dequeue());
        System.out.println("Dequeue (should be 2): " + queue.dequeue());
        System.out.println("Dequeue (should be 3): " + queue.dequeue());
        System.out.println("Current size (should be 2): " + queue.size());

        // Test wrap-around
        System.out.println("Enqueue 6: " + queue.enqueue(6));
        System.out.println("Enqueue 7: " + queue.enqueue(7));
        System.out.println("Current size (should be 4): " + queue.size());
        System.out.println("Dequeue (should be 4): " + queue.dequeue());
        System.out.println("Dequeue (should be 5): " + queue.dequeue());
        System.out.println("Dequeue (should be 6): " + queue.dequeue());
        System.out.println("Dequeue (should be 7): " + queue.dequeue());
        System.out.println("Current size (should be 0): " + queue.size());
        System.out.println("Dequeue (should be null): " + queue.dequeue()); // Queue should be empty
	}
}
