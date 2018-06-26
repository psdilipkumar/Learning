package com.appiumTest.AndroidTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class DataStructure {

	//@Test
	public void testArrayList() {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add(669265720);
		al.add("Dilip");
		al.add("PSDK");
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.remove(1);
		Iterator itr= al.iterator();
		for(Object a:al) {
			System.out.println(a);
		}
		while (itr.hasNext()) {
			Object c= itr.next();
			System.out.println(c);
		}
	}
	
	//@Test
	public void testHashTable() {
		Hashtable h1= new Hashtable();
		h1.put("FN", "Dilip");
		h1.put("MN", "Kumar");
		h1.put("IN", "ps");
		
		//create a clone copy
		Hashtable h2=new Hashtable();
		h2= (Hashtable)h1.clone();
				
		h1.clear();
		System.out.println("h1 is" + h1);
		System.out.println("h2 is "+ h2);
		System.out.println(h2.get("MN"));
		
	}
	
	//@Test
	public void testHashTableWithList() {
		Hashtable<String,List> h1= new Hashtable<String,List>();
		h1.put("QA", Arrays.asList("QAUser","QAPwd"));
		h1.put("Saturn", Arrays.asList("User1","Pwd123"));
		List<String> l1= h1.get("QA");
		System.out.println(l1.get(1));
	}
	
	//@Test
	public void setDuplicate() {
		Set<String> uniq=new HashSet<String>();
		Set<String> repeats=new HashSet<String>();
		String chrs= "abcbcdf";
		for (int i=0;i<chrs.length();i++) {
			System.out.println(chrs.substring(i, i+1));
			if (uniq.add(chrs.substring(i, i+1))==false) {
				repeats.add(chrs.substring(i, i+1));
			}
		}
		System.out.println("Unique: " + uniq);
		System.out.println("repeats: " + repeats);
		
	}
	
	//@Test
	public void closureCheck() {
		String cc="{[(}]}";
		int m=cc.length()/2;
		int j=m;
		for (int i=m-1;i>=0;i--) {
			System.out.println("Check for "+ cc.substring(i, i+1) + " with " + cc.substring(j,j+1) );
			if (cc.substring(i, i+1).equals("{")){
					if (! cc.substring(j,j+1).equals("}")){
							System.out.println("Closure expected } at position "+ j);
					}
			}
			if (cc.substring(i, i+1).equals("[")){
				if (! cc.substring(j,j+1).equals("]")){
						System.out.println("Closure expected ] at position "+ j);
				}
			}
			if (cc.substring(i, i+1).equals("(") ){
				if (! cc.substring(j,j+1).equals(")")){
						System.out.println("Closure expected ) at position "+ j);
				}
			}
			j=j+1;
		}
	}
	
	//@Test
	public void reverseString() {
		String s1="Dilip";
		String s2="";
		for (int i=s1.length()-1;i>=0;i--) {
			s2= s2+ s1.charAt(i);
		}
		System.out.println(s2);
	}
	
	@Test
	public void BubbleSort() {
		int s[]= {3,5,7,1,4};
		int a;
		for (int j=s.length-1;j>0;j--) {
		for (int i=0;i<j; i++) {
			if(s[i+1]<s[i]) {
				a=s[i];
				s[i]=s[i+1];
				s[i+1]=a;
			}
		}
		}
		System.out.println(Arrays.toString(s));
	}
}