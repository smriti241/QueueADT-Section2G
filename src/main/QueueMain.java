package main;

import java.util.Arrays;

public class QueueMain
{
	public static void main(String[] args)
	{
		QueueADT queue1 = new QueueADT();

		queue1.enqueue(1);
		queue1.enqueue(5);
		queue1.enqueue(7);
//		TODO add method call for enqueue
			System.out.println(Arrays.toString(queue1.queue));
//		TODO add method call for dequeue

	}
}
