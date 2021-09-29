package String_1;
/*
 * 
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".


makeAbba("Hi", "Bye") �� "HiByeByeHi"
makeAbba("Yo", "Alice") �� "YoAliceAliceYo"
makeAbba("What", "Up") �� "WhatUpUpWhat"
 */
public class makeAbba {
	public String makeAbba1(String a, String b) {
		  return a+b+b+a;
	}
	
	// Solution
	public String makeAbba2(String a, String b) {
		  return a + b + b + a;
	}
}
