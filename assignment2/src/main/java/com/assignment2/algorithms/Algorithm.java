package com.assignment2.algorithms;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Algorithm {

	public static void main(String args[]) {
		Algorithm algo = new Algorithm();
		//1
		 algo.isPrime(8);
		 //2
		 algo.isPalindrome(12321);
		 //4
		 algo.isStringPalindrome("abba");
		 //5
		 algo.fib(5);
		 System.out.println( algo.fib(1));
		 //6
		 algo.fibSeries(5);
		 //7
		 System.out.println( algo.findDiff(56));
		 //10
		 Rectangle arr[] = new Rectangle[3]; 
		 int x = 10, y = 20; 
	     arr[0] = new Rectangle(x, y); 
            x = 5; 
	        y = 25; 
	        arr[1] = new Rectangle(x, y); 
	        x = 15; 
	        y = 10; 
	        arr[1] = new Rectangle(x, y); 
            x = 12; 
	        y = 12; 
	        arr[2] = new Rectangle(x, y); 
		 System.out.println(algo.calculate_Area(arr));
		 //11
		 int arr1[]= {4, 2, 1, 5, 3};
		 int n=5;
		 algo.immediateSmaller(arr1, n);
		 //13
		 algo.thirdLargest(arr1);
		 //14
		 algo.minAnd2ndMin(arr1);
		 //15
		 String s1="bcadehk";
		 String s2="hea";
		 algo.remAnagrams(s1, s2);
		 //16
		// algo.sieveOfEratosthenes(10);
		 //17
		 String s3="AXY";
		 String s4="YADXCP";
		 algo.issubsequence(s3, s4);
		 //18
		 int arr5[] = { 1, 3, 3, 4 };
		 int u=3;
		 algo.firstAndLast(arr5, u);
		 //19
		String s5 = "abc", s6 = "def";
		 algo.merge(s5, s6);
		 //20
		 String s7="aeioup";
		 algo.isGoodorBad(s7);
		 //21
		 int arr6[]= {2, 2, 5, 10, 1, 2, 10, 5, 10, 2};
		 int n6=10;
		 algo.isFrequencyUnique(arr6, n6);
		 //22
		 int arr7[]= {100,180,260,310,40,535,695};
		 int n7=7;
		 algo.stockBuySell(arr7, n7);
		 //23
		 int arr8[]= {3, 4, 1, 5};
		 int n8=4;
		 algo.stockBuyAndSell2( n8,arr8);
		 //24
		 String s8="ABCD";
		 algo.addMinChar(s8);
		 //25
		 int arr9[]={6,1,2,8,3,4,7,10,5};
		 int n9=10;
		 algo.missingNumber(arr9, n9);
		 //26
		 int arr10[]= {7, 10, 4, 3, 20 ,15};
		 int k=3;
		 algo.kthSmallest(arr10, k);
		 //27
		 /////long arr11[]= {}
		// algo.equilibriumPoint(null, n9);
		 
		
	}
//Algorithm 1>>>Prime Number
	
	public int isPrime(int n) {
		int isPrime=1;
		if (n == 0 || n == 1) {
			isPrime=0;
		} else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					isPrime=0;
				}

			}
		}

		if (isPrime==1) {

			System.out.println("is prime number");
		} else {

			System.out.println("is not prime number");
		}
		return isPrime;
	}

//Algorithm 2>>>Palindrome
	
	public String isPalindrome(int num) {
    String result = null;
		int r, sum = 0, temp;

		temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number ");
		return result;
		}
		else {
			System.out.println("not palindrome");
		return result;
		}
	}

//Algorithm 3>>>Factorial
	
	public int findFactorial(int number) {
		int i, fact = 1;
		for (i = 1; i <= number; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		return fact;
	}
	
//Algorithm 4>>>Palindrome String

	public int isStringPalindrome(String string) {

		String reverse = "";
		int flag;

		int length = string.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}

		if (string.equals(reverse)) {
			System.out.println("Entered string is a palindrome.");
			flag = 1;
		} else {
			System.out.println("Entered string isn't a palindrome.");
			flag = 0;
		}
		return flag;
	}

	//Algorithm 5>>>Nth Fibonacci Number
	
	public int fib(int n) {
		int fib;
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		fib = fib(n - 1) + fib(n - 2);
		
		return fib;

	}
//Algorithm 6>>>Fibonacci Series up to Nth term
	
	public int fibSeries(int n) {

		int f[] = new int[n + 1];

		f[0] = 0;
		f[1] = 1;

		System.out.print(f[0] + " , " + f[1] + " , ");

		for (int i = 2; i < n; i++) {
			f[i] = f[i - 1] + f[i - 2];
			System.out.print(f[i] + " , ");
		}

		return n;

	}
 
//Algorithm 7>>Confused pappu
	
	public long findDiff(long amount) 
    {
        // code here
         String s = amount+"";
        
        s = s.replaceAll("6","9");
        long p = Long.parseLong(s);
        return p - amount;
        
    }
//Algorithm 10>>Maximum Area Rectangle
	
	 public int calculate_Area(Rectangle arr[]){
	        int area;
	        int maxArea = 0;
	        
	        for(int i = 0; i<arr.length; i++){
	            area = arr[i].height * arr[i].width;
	            if(area>maxArea){
	                maxArea = area;
	            }
	        }
	        
	        return maxArea;
	        
	    }
	 
//Algorithm 11>>>Smallest number
	 
	 public int immediateSmaller(int arr[], int n)
	    {
	        int next = 0, i, j;
	        for (i = 0; i < n; i++) {
	            next = -1;
	            for (j = i + 1; j < n; j++) {
	                if (arr[i] > arr[j]) {
	                    next = arr[j];
	                    break;
	                }
	            }
	            System.out.print(+ next +" ");
	        }
	        return next;
	    }
//Algorithm 12>>
	 public int zigZag(int a[], int n){
         int flag=1;
		 //boolean flag=true;
        for(int i=0;i<n-1;i++){
            if(flag==1){
                if(a[i]>a[i+1]){
                    int temp=a[i];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
            else{
                if(a[i]<a[i+1]){
                    int temp=a[i];
                    a[i+1]=a[i];
                    a[i]=temp;
                }
            }
            flag=0;
        }
        return flag;
    }

	 
//Algorithm 13>>Third largest element 
	 
		public int thirdLargest(int arr[]) {

			int first = arr[0];
			for (int i = 1; i < arr.length; i++)
				if (arr[i] > first)
					first = arr[i];

			
			int second = 0;
			for (int i = 0; i < arr.length; i++)
				if (arr[i] > second && arr[i] < first)
					second = arr[i];

			
			int third = 0;
			for (int i = 0; i < arr.length; i++)
				if (arr[i] > third && arr[i] < second)
					third = arr[i];

			System.out.printf("The third Largest " + "element is %d\n", third);
			return third;
		}
		
//Algorithm 14>>>Find the smallest and second smallest element in an array
		
		public List<Integer> minAnd2ndMin(int arr[]) {

				List<Integer> list=new ArrayList<>();
			int firstSmallest = arr[0];
			for (int i = 1; i < arr.length; i++)
				if (arr[i] < firstSmallest)
					firstSmallest = arr[i];

			int secondSmallest=Integer.MAX_VALUE;
			for (int i = 1; i < arr.length; i++)
				if (arr[i] < secondSmallest && arr[i] > firstSmallest)
					secondSmallest = arr[i];
			
			list.add(firstSmallest);
			list.add(secondSmallest);
			System.out.printf("The smallestelement is %d " + "Second smallest element is %d\n", firstSmallest,secondSmallest);
			
			return list;
		}
		
//Algorithm 15>>Anagram of String	
		
		public int remAnagrams(String s, String s1) {
			

			char[] arr = s.toCharArray();
			char[] arr2 = s1.toCharArray();

			int[] count1 = new int[26];
			int[] count2 = new int[26];

			for (char c : arr) {
				count1[c - 'a']++;
			}

			for (char c : arr2) {
				count2[c - 'a']++;
			}

			int diff = 0;
			for (int i = 0; i < 26; i++) {
				diff += Math.abs(count1[i] - count2[i]);
			}
			
           System.out.println(+diff);
			return diff;

		}
//Algorithm 16>>Sieve of Eratosthenes	
		
		public void sieveOfEratosthenes(int n) {
			HashMap<Integer, String> map = new HashMap<>();
			boolean f = true;
			for(int j=0;j<=n;j++){

				if (j == 0 || j == 1) {
					f = false;
					map.put(j, "prime");
				} else {
					for (int i = 2; i < n; i++) {
						if (j % i == 0) {
							f = false;
							map.put(j, "prime");
						}

					}
				}
			

			

		}
			System.out.println(map);
		}
		
		
//Algorithm 17>>>Check for subsequence
		
		public boolean issubsequence(String s1, String s2)
	    {
	        int n = s1.length(), m = s2.length();
	        int i = 0, j = 0;
	        while (i < n && j < m) {
	            if (s1.charAt(i) == s2.charAt(j))
	                i++;
	            j++;
	        }
	        System.out.println(i == n);
	        return i == n;
	    }
	 
		
//Algorithm 18>>First and last occurrences of X	


		public List<Integer> firstAndLast(int arr[],int x) {
			List<Integer>list=new ArrayList<>();
			
			int firstElement = 0,lastElement = 0;
			
			for(int i=0;i<=arr.length;i++) {
				if(x==arr[i]) {
					firstElement=i;
					break;
				}
			}
			
			for(int j=arr.length-1;j>=0;j--) {
				
				if(x==arr[j]) {
					lastElement=j;
					break;
				}
				
			}
			list.add(firstElement);
			list.add(lastElement);
			System.out.printf("firstElement is  "+firstElement);
			System.out.printf("LastElement is  "+lastElement);
			
			return list;
		}
	
//Algorithm 19>>>Merge two strings
		
		public String merge(String s1, String s2) {
			StringBuilder result = new StringBuilder();

			for (int i = 0; i < s1.length() || i < s2.length(); i++) {

				if (i < s1.length())
					result.append(s1.charAt(i));

				if (i < s2.length())
					result.append(s2.charAt(i));
			}
System.out.println(" "+result.toString());
			return result.toString();
		}
		
//Algorithm 20>>>Good or Bad string
		
		public int isGoodorBad(String S) {
	        char ch[] = S.toCharArray();
	        int vow=0;
	        int cons=0;
	        for(int i=0;i<ch.length;i++)
	        {
	            if(ch[i]=='a'|| ch[i]=='e' ||ch[i]=='i'|| ch[i]=='o' || ch[i]=='u')
	            {
	                vow++;
	                cons=0;
	            }
	            else if(ch[i]=='?')
	            {
	                vow++;
	                cons++;
	            }
	            else
	            {
	                cons++;
	                vow=0;
	            }
	            if(vow==6 || cons==4)
	            	System.out.println("String is good");
	                return 0;
	        }
        	System.out.println("String is bad");

	        return 1;
	    }
		
//Algorithm 21>>>Unique Number of Occurrences
		
		public boolean isFrequencyUnique(int arr[], int n)
		{
		 boolean flag=false;
		    int[] frequency = new int[n + 1];
		 
		    // For counting the frequency of each element
		    for (int i = 1; i <= n; i++) {
		        for (int j = 0; j < n; j++) {
		            if (arr[j] == i) {
		                frequency[i - 1]++;
		            }
		        }
		    }
		 
		    // Checking if frequency array contains any duplicate
		    // or not
		    for (int i = 0; i < n; i++) {
		        for (int j = 0; j < n; j++) {
		            if (i == j || frequency[i] == 0)
		                continue;
		            if (frequency[i] == frequency[j]) {
		 
		                // If any duplicate frequency then return
		                // false
		            	flag=false;
		            	System.out.println("false");
		                return flag;
		            }
		        }
		    }
		     flag=true;
		     System.out.println("true");
		    // If no duplicate frequency found, then return true
		    return flag;
		}
//	Algorithm 22>>>Stock buy and sell	
		
		 public int stockBuySell(int prices[], int size) 
		    { 
		  
		        // maxProfit adds up the difference between 
		        // adjacent elements if they are in increasing order 
		        int maxProfit = 0; 
		  
		        // The loop starts from 1 
		        // as its comparing with the previous 
		        for (int i = 1; i < size; i++) 
		            if (prices[i] > prices[i - 1]) 
		                maxProfit += prices[i] - prices[i - 1]; 
		        System.out.println(+maxProfit);
		        return maxProfit; 
		    } 
		 
//Algorithm 23>>>stockBuyAndSell2
		 
		 public static int stockBuyAndSell2(int n, int[] arr) {
			 
		        int sum=0;
		    
		        for(int i=1;i<n;i++){
		            if(arr[i]>arr[i-1]){
		                sum+=arr[i]-arr[i-1];
		            }
		            
		        }
		        System.out.println(+sum);
		        return sum;
		    }
//Algorithm 24>>>Add Minimum Characters
		 
		 public int addMinChar(String str1) {
		        int n = str1.length();
		        int start = 0;
		        int end = n - 1;
		        int res = 0;
		        while (start < end) {  // While the pointers have not met in the middle of the string
		            if (str1.charAt(start) == str1.charAt(end)) {  // If the characters at the start and end pointers are equal
		                start++;  // Move the start pointer to the right
		                end--;  // Move the end pointer to the left
		            }
		            else {
		                res++;  // Increment the count of characters to be added
		                start = 0;  // Reset the start pointer to the beginning of the string
		                end = n - res - 1;  // Reset the end pointer to the end of the string with a reduced number of characters
		            }
		        }
		        System.out.println(+res);
		        return res;  // Return the count of characters to be added
		    }
		 
//Algorithm 25>>> Missing number in array
		 
		 int missingNumber(int array[], int n) {
		        // Your Code Here
		         Arrays.sort(array);

		        int i;

		        for (i = 1; i <= array.length; i++) {

		            if (array[i-1] != i) break;

		        }
System.out.println(i);
		        return i;
		    }
		 
//Algorithm 26>>Kth smallest element		    
		    
		    public static int kthSmallest(int[] arr, int K)
		    {
		        // Sort the given array
		        Arrays.sort(arr);
		 
		        // Return K'th element in
		        // the sorted array
		        System.out.println(arr[K - 1]);
		        return arr[K - 1];
		    }
		    
//Algorithm 27>>Equilibrium point
		    
		    public static int equilibriumPoint(long arr[], int n) {
		        
		        int sum=0;
		        int leftsum=0;
		        
		        for(int i=0;i<n;i++){
		            sum+=arr[i];
		            
		        }
		        for(int i=0;i<n;i++){
		            sum-=arr[i];
		            
		            if(sum==leftsum){
		                return i+1;
		            }
		            leftsum+=arr[i];
		        }
		        return -1;
		    }
		
//Algorithm 28>>Second Largest
		    
			public int print2largest(int arr[], int n) {

				int max = 0;
				int secMax = 0;
				for (int i = 0; i < n; i++) {
					if (arr[i] > max) {
						secMax = max;
						max = arr[i];
					}
					if (arr[i] < max && arr[i] > secMax) {
						secMax = arr[i];
					}
				}
				if (secMax != 0) {
					return secMax;
				}
				return -1;

			}
			
//Algorithm 29>>Count pairs with given sum
			
			public int getPairsCount(int[] arr, int n, int k) {
		        // code here
		        Map<Integer,Integer>mp=new HashMap<>();
		        int ans=0;
		        for(int i=0;i<n;i++)
		        {
		            int temp=k-arr[i];
		            if(mp.containsKey(temp))
		            {
		                ans+=mp.get(temp);
		            }
		            if(mp.containsKey(arr[i]))
		            {
		                mp.put(arr[i],mp.get(arr[i])+1);
		            }
		            else
		            {
		                mp.put(arr[i],1);
		                // System.out.println(mp.get(arr[i]));
		            }
		        }
		        return ans;
		    }
			
//Algorithm 30>>Maximum Product Subarray			
			public int maxSubarrayProduct(int arr[])
		    {
		        // Initializing result
		        int result = arr[0];
		        int n = arr.length;
		 
		        for (int i = 0; i < n; i++) {
		            int mul = arr[i];
		            // traversing in current subarray
		            for (int j = i + 1; j < n; j++) {
		                // updating result every time to keep an eye
		                // over the maximum product
		                result = Math.max(result, mul);
		                mul *= arr[j];
		            }
		            // updating the result for (n-1)th index.
		            result = Math.max(result, mul);
		        }
		        return result;
		    }
		}