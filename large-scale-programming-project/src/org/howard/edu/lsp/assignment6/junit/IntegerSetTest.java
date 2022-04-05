package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();
	IntegerSet set3 = new IntegerSet();
	
	

	
	@Before
    public void init() throws IntegerSetException { 
		set1.add(0);
		set1.add(2);
		set1.add(3);
		
		set2.add(3);
		set2.add(0);
		set2.add(2);
		set2.add(8);
		set2.add(7);
		
		set3.add(100);

		
    }

	@Test
	@DisplayName("Test case for clear")
	public void testClear() {
		// JUnit test case(s) for clear
		set3.clear();
		assertEquals(true, set3.isEmpty());
		
	}

	@Test
	@DisplayName("Test case for length")
	public void testLength() {
		// JUnit test case(s) for length
		assertEquals(5, set2.length());
		
	}

	@Test
	@DisplayName("Test case for equals")
	public void testEqualsIntegerSet() {
		// JUnit test case(s) for equal
		assertEquals(false, set3.equals(set2));
	}

	@Test
	@DisplayName("Test case for contains")
	public void testContains() {
		// JUnit test case(s) for contains
		assertEquals(true, set2.contains(0));
	}

	@Test
	@DisplayName("Test case for largest")
	public void testLargest() throws IntegerSetException {
		// JUnit test case(s) for largest
		 assertEquals(8,set2.largest());
	}

	@Test
	@DisplayName("Test case for smallest")
	public void testSmallest() throws IntegerSetException {
		// JUnit test case(s) for smallest
		assertEquals(0,set1.smallest());
	}

	@Test
	@DisplayName("Test case for add")
	public void testAdd() throws IntegerSetException {
		// JUnit test case(s) for addition
		set1.add(5);
        assertEquals(4, set1.length());
		
	}

	@Test
	@DisplayName("Test case for remove")
	public void testRemove() throws IntegerSetException {
		// JUnit test case(s) for removal
		set1.remove(5);
        assertEquals(3, set1.length());
	}

	@Test
	@DisplayName("Test case for union")
	public void testUnion() {
		// JUnit test case(s) for union
		set1.union(set2);
		assertEquals(0,set1.List3.get(0));
		assertEquals(3,set1.List3.get(1));
		assertEquals(0,set1.List3.get(2));
		assertEquals(8,set1.List3.get(3));
		assertEquals(7,set1.List3.get(4));
	}

	@Test
	@DisplayName("Test case for intersect")
	public void testIntersect() {
		// JUnit test case(s) for intersection
		set1.intersect(set2);
		assertEquals(3,set1.List2.get(0));
		assertEquals(2,set1.List2.get(1));		
		
	}
	

	@Test
	@DisplayName("Test case for differences")
	public void testDiff() {
		// JUnit test case(s) for difference
		set2.diff(set1);
		assertEquals(8,set2.List.get(0));
		assertEquals(7,set2.List.get(1));
		
	} 
	
	@Test
	@DisplayName("Test case for isempity")
	public void testIsEmpty() {
		// JUnit test case(s) for emptiness
		assertEquals(false,set3.isEmpty());
	}

	@Test
	@DisplayName("Test case for String")
	public void testToString() {
		// JUnit test case(s) for string
		assertEquals("[100]",set3.toString());
	}
	
	}


