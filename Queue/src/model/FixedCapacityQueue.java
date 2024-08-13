package model;

public class FixedCapacityQueue {
	int[] mData=null; //Declaring an empty array.
	int mHead=0; //index of the first element in the array. Hmmm...not, really. What if it's empty?
	int mTail=0; //Declaring the last element in the array. If it's full?
	
	//HOW DO YOU DISTINGUIST EMPTY FROM FULL?
	//Both pointers are pointing at 0; 
	public boolean isEmpty() {
		if (mHead==0 && mTail ==0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isFull() {
		if (mTail ==mData.length) {
			return true;
		}else {
			return false;
		}
	}
	
	/*GOOD PRACTICE FOR PROGRAMMING:
	 - Establish some invariants of your data structure that are always true. (may be temporarily violated only within the method.)
	 
	 SOLUTION:
	 Find a way to the code not enable the user do any of theses things.
	*/
	//constructors
	public FixedCapacityQueue(int capacity) {
		//Defining the dimension of the array.
		mData= new int[capacity];
	}
	//Enqueue method is for adding new elements to the queue, so they go to the tail.
	//The distance is finite, we can fit more elements longer than the dimension.
	
	//These functions should be used with exceptions rather than returning code, a message?
	public boolean enqueue(int x) {
		/*PROBLEM:
		 Enqueue method will fail if the queue is full. 
		 Dequeue method will fail if the queue is empty.
		 SOLUTION:
		 Find a way to the code not enable the user do any of theses things.
		*/
		//tail should be the last element of the array.
		if(mTail==mData.length) return false;
		mData[mTail]=x;
		//x is the last element.
		mTail++;
		//mowing through the array.
		return true;
	}
	public boolean dequeue() {
		//Is queue full? 
		if (mTail==mHead) return false; //return -1; BAD!!
		int v=mData[mHead];
		mHead++;
		//mowing through the array.
		return true;
	}
	//What could it lack to the code?
	//Storing the element taken from the queue to a variable.
	//pointer
	/*return -1?
	 When you dequeue and it is empty, The method returns -1.
	 It could have been one of the elements inserted in queue.
	 SOLUTION:
	 - return false;
	 */
	//Implementing a library or a method from java.
	//derivative class?
	
}
