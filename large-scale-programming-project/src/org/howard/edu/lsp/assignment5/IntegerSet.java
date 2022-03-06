package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;

public class IntegerSet {
	
	ArrayList<Integer> List = new ArrayList<Integer>();
	
	public IntegerSet() {
		
	}
	public void clear() {
		List.clear();
	};
	public int length() {
	
		return List.size();
	}; 

	public boolean equals(IntegerSet intSetb) {
		int t=0;
		ArrayList<Integer> Temp = new ArrayList<Integer>();	
		Temp= intSetb.List;
		for (int i=0; i< List.size();i++)
		{
			for (int j=0; j < Temp.size();j++)
		{
			if(List.get(i)==Temp.get(j))
			{
				t=t+1;
			}
		}
		
		}
		if (t==List.size())
		{
			return true;
		
		}
		return false;
		
	};
	public boolean contains(int value) {
		
		if (List.contains(value)== true)
		{
			return true;
		}
		
		return false;
		
	};
	public int largest() throws IntegerSetException {
		
		int large=999999;
		try {
			
			if (List.isEmpty()== true)
				{
				throw new IntegerSetException("");
				}else {
					large=List.get(0);
					for (int i = 0; i < List.size(); i++) {
			            if (large < List.get(i))
			                large = List.get(i);
			        }
					return large;	
					
					
				}
			
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		return large;
		
	};
		
	public int smallest() throws IntegerSetException{
		int min =0;
		try {
			
			if (List.isEmpty()== true)
				{
				throw new IntegerSetException("");
				}else {
					min=List.get(0);
					for (int i = 0; i < List.size(); i++) {
			            if (min > List.get(i))
			                min = List.get(i);
			        }
					return min;
				}
			
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		return min;
		
	};
	public void add(int item) throws IntegerSetException{
		try {
			
			if (List.contains(item)== true)
				{
				throw new IntegerSetException("");
				}else {
					List.add(item);
				}
			
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
	}; 

	public void remove(int item)throws IntegerSetException{
		try {
			
		if (List.contains(item)== false)
			{
			throw new IntegerSetException("");
			}
		else 
			{
			for (int i =0; i<List.size();i++)
			{
				if (List.get(i)== item)
				{
					List.remove(i);
				}
			}
				
			}
		}catch(IntegerSetException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	};  
	public void union(IntegerSet intSetb) {
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		Temp = intSetb.List;
		for (int i = 0; i < Temp.size(); i++) {
			for (int j=1 ; j< List.size();j++ )
			{ if (Temp.get(i)== List.get(j))
				
			{	List.remove(j);
				
			}else {
				List.add(Temp.get(i));
			}
			
        }
			}
		System.out.println(List.toString());
		
	};

	public void intersect(IntegerSet intSetb) {
		
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		Temp = intSetb.List;
		for (int i = 0; i < Temp.size(); i++) {
			for (int j=1 ; j< List.size();j++ )
            if (List.get(j)== Temp.get(i))
            {
            	System.out.println(List.get(j));
            }
			
        }
			
		
	}; 
	public void diff(IntegerSet intSetb) {
		
		ArrayList<Integer> Temp = new ArrayList<Integer>();
		Temp = intSetb.List;
		List.removeAll(Temp);
		
		for (int i=0; i < List.size() ;i++)
		{
		System.out.println(List.get(i));
		}
	
	
	};
	public boolean isEmpty() {
		if (List.isEmpty() == true)
		{
			return true;
		}
		return false;
	};
	public String toString() {
		
		return List.toString();
	};
	public static void main(String[] args) throws IntegerSetException {
		IntegerSet set1 = new IntegerSet();
		set1.add(0);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		set2.add(3);
		set2.add(0);
		set2.add(2);
		set2.add(8);

		set2.remove(8);
		IntegerSet set3 = new IntegerSet();
		
		System.out.println("Minimum element in Set1 = "+ set1.smallest());
		System.out.println("Largest element in Set1 = "+ set1.largest());
		System.out.println("Value of Set1 is:" + set1.toString());
		System.out.println("3 is in Set1 ? "+ set1.contains(3));
		System.out.println("Set2 ? "+ set2.toString());
		System.out.println("Set1 is empty ? "+ set1.isEmpty());
		System.out.println(" Set1 equals Set 2 "+ set1.equals(set2));
		System.out.println(" Set1 intersection Set 2: ");
		set1.intersect(set2);
		set2.diff(set1);
		System.out.println(" Set1 union Set 2: ");
		set1.union(set2);
		System.out.println("Minimum element in Set3 = "+ set3.smallest());
		System.out.println("Largest element in Set1 = "+ set3.largest());
		
	}

}
