package org.howard.edu.lsp.finalExam;

import java.util.HashMap;

public class MapUtilities {
	
	
	public  MapUtilities() 
	{
		
	}
public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) throws NullMapException 
{	
	int count=0;
	if (map1==null || map2==null)
	{
		throw new NullMapException();
	}else System.out.println("The common key and value is :"); 
	
	for (String i : map1.keySet()) {
		if(map2.containsKey(i)==true)
		{
			if (map2.containsValue(map1.get(i))==true)
			{
				count++;
			}
		}

	}
	      if (count==0)
	      {
	  		throw new NullMapException();
	  	}else System.out.println(""); 
	  	
	    	  
	return count;
		
}

public static void main(String[] args) throws NullMapException
{ 	 
	HashMap<String, String> hashmap1 = new HashMap<String, String>();
	HashMap<String, String> hashmap2 = new HashMap<String, String>();
	

	hashmap1.put("Alice","Healty");
	hashmap1.put("Mary","Ecastic");
	hashmap1.put("Bob","Happy");
	hashmap1.put("Chuck","Fine");
	hashmap1.put("Felix","Sick");

	hashmap2.put("Mary","Ecastic");
	hashmap2.put("Felix","Healty");
	hashmap2.put("Ricardo","Subperb");
	hashmap2.put("Bob","Happy");
	hashmap2.put("Tam","Fine");
	try 
	{
	System.out.println(commonKeyValuePairs(hashmap1,hashmap2));
	
	}catch (Exception e)
	{
		System.out.println(e.getMessage());
	}

	
	}
}
