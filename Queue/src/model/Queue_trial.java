package model;

public class Queue_trial {

	    private int[] mData; // Declaring an array to hold the elements.
	    private int mHead = 0; // Index of the head of the queue.
	    private int mTail = 0; // Index of the tail of the queue.
	    private int size = 0; // Current size of the queue.

	    // Constructor to initialize the queue with a given capacity.
	    public Queue_trial(int capacity) {
	        mData = new int[capacity];
	    }

	    // Enqueue method to add an element to the queue.
	    public boolean enqueue(int x) {
	        // Check if the queue is full.
	        if (size == mData.length) 
	        	return false;
	        mData[mTail] = x; // Add the element at the tail.
	        mTail = (mTail + 1) % mData.length; // Move the tail index and wrap around if necessary.
	        size++; // Increase the size of the queue.
	        return true;
	    }

	    // Dequeue method to remove and return the front element of the queue.
	    public Integer dequeue() {
	        // Check if the queue is empty.
	        if (size == 0) return null;
	        int v = mData[mHead]; // Get the element at the head.
	        mHead = (mHead + 1) % mData.length; // Move the head index and wrap around if necessary.
	        size--; // Decrease the size of the queue.
	        return v;
	    }

	    // Method to get the current size of the queue.
	    public int size() {
	        return size;
	    }
}
