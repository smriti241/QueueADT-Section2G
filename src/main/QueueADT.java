package main;

public class QueueADT
{

	int[] queue = new int[10];
	int front = -1;
	int rear = -1;
	int size = queue.length;

	void enqueue(int value)
	{
		if(!isFull())
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
		if(!isEmpty())
		{
			deleted=queue[front];
			for(int i=0;i<size()-1;i++)
			{
				queue[i]=queue[i+1];
			}
			front=queue[0];
		}
		return deleted;
	}

	int peek()
	{
		int item = 0;

		return item;
	}

	int size()
	{
		int size = 0;
		size=rear+1;
		return queue.length;
	}

	boolean isEmpty()
	{
		if(front==-1 && rear==-1)
			return true;
		else
			return false;
	}

	boolean isFull()
	{
		if(rear==(queue.length-1))
			return true;
		else
			return false;
	}

}
