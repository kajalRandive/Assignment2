package com.assignment2.algorithms;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class Assignment2ApplicationTests {

	//Algorithm 1
	Algorithm algo=new Algorithm();
	@Test
	public void isPrimeTest() {
		int n = 11;
		int result = algo.isPrime(n);
		assertEquals(1, result);

	}

	@Test
	public void isNotPrime() {
		int n = 8;
		int result = algo.isPrime(n);
		assertEquals(0, result);
	}
	
	
	//Algorithm 2
	@Test
	public void isPalindrome(){
		int n=131;
		String result=algo.isPalindrome(n);
		assertEquals("yes",result);
	}
	
	@Test
	public void isNotPalindrome(){
		int n=234;
		String result=algo.isPalindrome(n);
		assertEquals("no",result);
	}
	
	//Algorithm 3
	@Test
	public void isFactorial(){
		int n=6;
		int result=algo.findFactorial(n);
		assertEquals(720,result);
	}
	
	
	//Algorithm 4
	@Test
	public void isPalindromeString(){
		String s1="radar";
		int result=algo.isStringPalindrome(s1);
		assertEquals(1,result);
	}
	
	@Test
	public void isNotPalindromeString(){
		String s1="panu";
		int result=algo.isStringPalindrome(s1);
		assertEquals(0,result);
	}
	
	
	//Algorithm 5
	
	
	//Algorithm 6
	@Test
	public void fibonaccieSeries() {
		int n = 5;
		int result =algo.fibSeries(n) ;
		assertEquals(n, result);

	}
	
	//Algorithm 7
	
	@Test
	public void findDiff(){
		int amount = 46;
		assertEquals(3, algo.findDiff(amount));

	}
	
	//Algorithm 11
	@Test
	public void immediateSmallerElementArr() {
		int n = 5;
		int arr[] = { 4, 2, 1, 5, 3 };
		int result = algo.immediateSmaller(arr, n);
		assertEquals(5, result);

	}
	//Algorithm 12
	@Test
	public void zigZagArray() {
		int n = 7;
		int arr[] = { 4, 3, 7, 8, 6, 2, 1 };
		int result =algo.zigZag(arr, n);
        assertEquals(n, result);

	}
	
	
	//Algorithm 13
	
	@Test
	public void thirdLargestElement13(){
		int arr[]={2,4,1,3,5};
		int result=algo.thirdLargest(arr);
		assertEquals(3,result);
	}
	
	@Test
	public void NotThirdLargestElement13(){
		int arr[]={1,2};
		int result=algo.thirdLargest(arr);
		assertEquals(-1,result);
	}
	
	//Algorithm 14
	
	@Test
	public void smallestAndSecondSmallestNo14() {

		int arr[] = { 2, 4, 1, 3, 5 };
		List<Integer> result =algo.minAnd2ndMin(arr);
		List<Integer> expResult = new ArrayList<>();
		expResult.add(1);
		expResult.add(2);
		assertEquals(expResult, result);
	}

	@Test
	public void smallestAndSecondSmallestNoNotFound14() {

		int arr[] = {};
		List<Integer> result =algo.minAnd2ndMin(arr) ;
		ArrayList<Integer> expResult = new ArrayList<>();
		expResult.add(-1);
		expResult.add(-1);
		assertEquals(expResult, result);
	}
	
	//Algorithm 15
	
	@Test
	public void anagram() {
		String s1 = "cddgk";
		String s2 = "gcd";
		int deleteWorld = algo.remAnagrams(s2, s1);
		assertEquals(2, deleteWorld);

	}
	
	
	//Algorithm 16
	@Test
	public void sieveofEratosthenes16(){
		int n=10;
		
		//SieveofEratosthenes16 sieve=new SieveofEratosthenes16();
		List<Integer> primes=algo.sieveOfEratosthenes(n);
				sieve.sieveOfEratosthenes(n);
		int[] expectedPrimes={2,3,5,7};
		assertEquals(primes.size(), expectedPrimes.length);

		
	}
	
	//Algorithm 17
	@Test
	public void subSequenceString() {
		String s1 = "AXY";
		String s2 = "YADXCP";
		boolean deleteWorld =algo.issubsequence(s1, s2);
		assertEquals(false, deleteWorld);
	}

	@Test
	public void NotSubSequenceString() {
		String s1 = "gksrek";
		String s2 = "geeksforgeeks";
		boolean deleteWorld =algo.issubsequence(s1, s2);
	    assertEquals(true, deleteWorld);
	}
	
	
	//Algorithm 18
	
	@Test
	public void firstAndLast() {
		int arr[] = { 1, 2, 3, 4, 2, 5, 2, 6 };
	    int a = 2;
		List<Integer> result = algo.firstAndLast(arr, a);
		List<Integer> expResult = new ArrayList<>();
		expResult.add(1);
		expResult.add(6);
		assertEquals(expResult, result);

	}
	
	//Algorithm 19
	
}
