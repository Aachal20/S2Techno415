package com.nt.ston;

public class Printer {

	//static variable to hold reference of current obj
	private static Printer INSTANCE;

	//private const
	private Printer() {
		// TODO Auto-generated constructor stub
		System.out.println("Printer():: 0-param constructor");
	}

	/*
	 * public static Printer getInstance() { //singletone logic if(INSTANCE==null)
	 * INSTANCE = new Printer();
	 * 
	 * return INSTANCE;
	 * 
	 * }
	 */


}
