package com.arrylist.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test {
	
	public static void main(String[] args) {
		
		//cc=10
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		//20
		ArrayList<Integer> al2=new ArrayList<Integer>(20);
		al2.add(10);
		al2.add(12);
		al2.add(14);
		
		ArrayList<Integer> al3=new ArrayList<Integer>(al2);
		
		System.out.println(al2);
		System.out.println(al3);
		
		System.out.println("----------------------------------------------");
		//methods
		ArrayList<Integer> mthd=new ArrayList<Integer>();
		mthd.add(123);
		mthd.add(124);
		mthd.add(125);
		System.out.println(mthd);
		mthd.add(1, 0);
		System.out.println(mthd);
		mthd.addAll(al2);
		System.out.println(mthd);
		
		//remove
		System.out.println("----------------------------------------");
		mthd.remove((Integer)0);
		System.out.println(mthd);
		mthd.remove(0);
		System.out.println(mthd);
		
		mthd.removeIf(ele->ele==10);
		System.out.println(mthd);
		
		mthd.add(12);
		System.out.println(mthd);
		//Index
		System.out.println(mthd.indexOf((Integer)12));//first occurance
		
		
		System.out.println(mthd.lastIndexOf((Integer)12));
		
		
		//replace
		
		mthd.set(1, 98);
		System.out.println(mthd);
		
		//for getting object
		System.out.println("----------------------------------------------");
		
		Iterator<Integer> it=mthd.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		//for-each
		for(Integer e:mthd)
		{
			System.out.print(e+" ");
		}
		
		//sorting
		mthd.sort(new mycom());
		System.out.println();
		System.out.println(mthd);
		
		//toArray
		
		Object[] array = mthd.toArray();
		List<Integer> synchronizedList = Collections.synchronizedList(mthd);
		System.out.println("the size is = "+mthd.size());
		
		int[] arr=new int[5];
		arr[0]=99;
		arr[1]=99;
		System.out.println(arr.length);
		
		System.out.println(mthd);
		
		Set<Integer> s=new HashSet<Integer>(mthd);
		ArrayList<Integer> l=new ArrayList<Integer>(s);
		System.out.println(l);
		
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("AA");
		ls.add("AKU");
		ls.add("AKAD");
		ls.add("AAA");
		ls.add("ZZZZ");
		System.out.println("before removing "+ls);
		ls.removeIf(ele->ele.length()==4);
		System.out.println(ls);
			
	}
	
	

}

class mycom implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
