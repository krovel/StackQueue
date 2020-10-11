package com.cg;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyQueueTest {
	@Test
	public void given3NumberWhenAddedToQueueShouldHaveFirstAddedNodeAtTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);

		AllNode top = myQueue.peek();
		myQueue.printQueue();
		assertEquals(firstNode, top);
	}
	@Test
	public void given3NumberInQueueWhenDequeuedShouldMatchedFirstAddedNode() {
		MyNode<Integer> firstNode = new MyNode<Integer>(56);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(70);

		MyQueue myQueue = new MyQueue();
		myQueue.enqueue(firstNode);
		myQueue.enqueue(secondNode);
		myQueue.enqueue(thirdNode);

		AllNode dequeuedNode = myQueue.dequeue();
		myQueue.printQueue();
		assertEquals(firstNode, dequeuedNode);
	}

}