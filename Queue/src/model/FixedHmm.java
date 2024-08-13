package model;

public class FixedHmm {
	private int[] mData;
	private int mHead;
	private int mTail;
	private int mSize;

	public FixedHmm(int capacity) {
		mData = new int[capacity];
		mHead = 0;
		mTail = 0;
		mSize = 0;
	}

	public boolean enqueue(int x) {
		try {
			if (isFull()) {
				throw new IllegalStateException("Queue overflow");
			}
			mData[mTail] = x;
			mTail = (mTail + 1) % mData.length;
			mSize++;
			return true;
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public int dequeue() {
		try {
			if (isEmpty()) {
				throw new IllegalStateException("Queue underflow");
			}
			int data = mData[mHead];
			mHead = (mHead + 1) % mData.length;
			mSize--;
			return data;
		} catch (IllegalStateException e) {
			System.out.println(e.getMessage());
			return -1; // Or handle the error differently
		}
	}

	// ... other methods ...
}
