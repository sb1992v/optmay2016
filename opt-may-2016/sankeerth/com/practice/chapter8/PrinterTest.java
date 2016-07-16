package com.practice.chapter8;

public class PrinterTest {

	public static void main(String[] args) {

		Printer p = new Printer();
		
		PrinterThread p1 = new PrinterThread(p, "Document1");
		PrinterThread p2 = new PrinterThread(p, "Document2");
		PrinterThread p3 = new PrinterThread(p, "Document3");
		PrinterThread p4 = new PrinterThread(p, "Document4");

		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}

}
