//This is a simple Java algorithm to understand Queues
//IG: Jarrydleepatel

public class myQueue {

	int[] theData;
	int head;
	int tail;
	int size;
	int num;

	public myQueue(int queueSize) // constructor
	{
		theData = new int[queueSize];
		head = 0;
		tail = 0;
		size = queueSize;
		num = 0;
	}

	public void enqueue(int item) // enter
	{
		if (num <= size) {
			if (tail == size) {
				tail = 0;

			}
			if (theData[tail] == 0) {
				theData[tail++] = item;
				num++;

			} else {
				System.out.println("Queue is full");
			}
		} else {
			System.out.println("Queue is full");

		}

	}

	public int dequeue() {

		int value = theData[head];
		theData[head] = 0;
		if (head == size) {
			head = 0;
		} else {
			head++;
		}
		num--;
		return value;

	}

	public int size() {
		return size;

	}

	public void printQueue() {

		for (int i = 0; i < size; i++) {
			if (i == head) {
				System.out.print(theData[i] + "(head), ");
			} else if (i == tail) {
				System.out.print(theData[i] + "(tail), ");
			} else {
				System.out.print(theData[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
 myQueue q = new myQueue(10);
  //ADD//
 q.enqueue(1);
 q.enqueue(2);
 q.enqueue(3);
 q.enqueue(4);
 q.enqueue(5);
 q.enqueue(6);
 //REMOVE//
 q.dequeue();
 q.printQueue();
	}

}
