package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{
		if(rear!=(size()-1))
		{
			//rear and front values are changed according to added number of elements
			rear++;
			queue[rear] = value;
			if(front==-1)
			{
				front=rear;
			}
		}
	}

	int dequeue()
	{
		int deleted = 0;
		return deleted;
	}

	int peek()
	{
		int item = 0;

		return item;
	}

	int size()
	{
			}

	boolean isEmpty()
	{

			return false;
	}

	boolean isFull()
	{
			return false;
	}

}
