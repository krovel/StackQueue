package com.cg;

public class MyQueue {
	private final MyLinkedList myLinkedList;

	public MyQueue() {
		this.myLinkedList = new MyLinkedList();
	}

	public void enqueue(AllNode newNode) {
		myLinkedList.append(newNode);
	}

	public void printQueue() {
		myLinkedList.printMyList();
	}

	public AllNode peek() {
		return myLinkedList.getHead();
	}
}