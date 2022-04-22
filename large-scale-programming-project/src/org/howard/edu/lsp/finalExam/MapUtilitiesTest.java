package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class MapUtilitiesTest {

	private Integer commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) throws NullMapException {
		int count=0;
		if (hashmap1==null || hashmap2==null)
		{
			throw new NullMapException();
		}else System.out.println("The common key and value is :"); 
		
		for (String i : hashmap1.keySet()) {
			if(hashmap2.containsKey(i)==true)
			{
				if (hashmap2.containsValue(hashmap1.get(i))==true)
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
	@Test
	
	public void testCommonKeyValuePairs() throws NullMapException {
		
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
		
		assertEquals(2,commonKeyValuePairs(hashmap1,hashmap2));
		
	}

	


}
