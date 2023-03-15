package com.somar.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

	

	public void m1() {
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
	}


	public static void main(String[] args) {
		App app = new App();
		app.m1();
	}
}