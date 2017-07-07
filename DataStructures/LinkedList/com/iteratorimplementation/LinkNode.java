package com.iteratorimplementation;

public class LinkNode {
String data;
LinkNode next;
public LinkNode() {
	super();
	// TODO Auto-generated constructor stub
}
public LinkNode(String data) {
	super();
	this.data = data;
	
}

public String getData(int index) {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public LinkNode getNext() {
	return next;
}
public void setNext(LinkNode next) {
	this.next = next;
}

}
