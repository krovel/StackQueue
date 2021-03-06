/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cg;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {
	@Test
	public void given3NumberWhenAddedToStackShouldHaveLastAddedNodeAtTop() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);

		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		
		AllNode top=myStack.peek();
		myStack.printStack();
		
		assertEquals(thirdNode,top);
	}
	@Test
	public void given3NumberInStackWhenPoppedShouldMatchedLastAddedNode() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);

		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);

		AllNode poppedNode = myStack.pop();
		myStack.printStack();
		assertEquals(thirdNode, poppedNode);
	}

	@Test
	public void given3NumberInStackWhenPoppedAllShouldBeEmpty() {
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);

		MyStack myStack = new MyStack();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);

		AllNode poppedLastNode = myStack.pop();
		AllNode poppedSecondLastNode = myStack.pop();
		AllNode poppedFirstNode = myStack.pop();

		assertTrue(myStack.isEmpty());
	}
}