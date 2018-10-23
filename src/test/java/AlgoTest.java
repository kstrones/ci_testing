package test.java;

import static org.junit.Assert.*;

import org.junit.*;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	private Item[] noElements;
	private Item[] unsorted;
	private Item[] partial;
	private Item[] sortingArray;
	private Item[] sorted;

	@Before
	public void setUp() throws Exception {
		noElements = new Item[] {};
		unsorted = new Item[] {new Item(7),new Item(6),new Item(5),new Item(4),new Item(3)};
		partial = new Item[] {new Item(5),new Item(4),new Item(3),new Item(6),new Item(7)};
		sorted = new Item[] {new Item(3),new Item(4),new Item(5),new Item(6),new Item(7)};
		
	}

	/*
	 * This test case will cover the branch coverage of the first for loop
	 */
	@Test
	public void testBubbleEmptyList() {
		
		sortingArray = noElements;
		SortAlgos.bubbleSort(sortingArray);
		assertEquals(noElements, sortingArray);
	}
	
	/*
	 * This test case will cover the branch coverage of the first for loop
	 */
	@Test
	public void testHeapEmptyList() {
		sortingArray = noElements;
		SortAlgos.heapSort(sortingArray);
		assertEquals(noElements, sortingArray);
	}
	
	/*
	 * This test case will cover the branch coverage of the first for loop
	 */
	@Test
	public void testInsertEmptyList() {
		sortingArray = noElements;
		SortAlgos.insertionSort(sortingArray);
		assertEquals(noElements, sortingArray);
	}
	
	/*
	 * This test case will cover the branch coverage of the first for loop
	 */
	@Test
	public void testMergeEmptyList() {
		sortingArray = noElements;
		SortAlgos.mergeSort(sortingArray);
		assertEquals(noElements, sortingArray);
	}
	
	/*
	 * This test case will cover the branch coverage of the first for loop
	 */
	@Test
	public void testQuickEmptyList() {
		sortingArray = noElements;
		SortAlgos.quickSort(sortingArray);
		assertEquals(noElements, sortingArray);
	}
	
	/*
	 * This test case will cover the branch coverage of the first for loop
	 */
	@Test
	public void testSelectionEmptyList() {
		sortingArray = noElements;
		SortAlgos.selectionSort(sortingArray);
		assertEquals(noElements, sortingArray);
	}
	
	/*
	 * This test case will cover the node coverage and some of the edge coverage
	 */
	@Test
	public void testBubbleUnsortedList() {
		sortingArray = unsorted;
		SortAlgos.bubbleSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the node coverage and some of the edge coverage
	 */
	@Test
	public void testHeapUnsortedList() {
		sortingArray = unsorted;
		SortAlgos.heapSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the node coverage and some of the edge coverage
	 */
	@Test
	public void testInsertionUnsortedList() {
		sortingArray = unsorted;
		SortAlgos.insertionSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the node coverage and some of the edge coverage
	 */
	@Test
	public void testMergeUnsortedList() {
		sortingArray = unsorted;
		SortAlgos.mergeSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the node coverage and some of the edge coverage
	 */
	@Test
	public void testQuickUnsortedList() {
		sortingArray = unsorted;
		SortAlgos.quickSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the node coverage and some of the edge coverage
	 */
	@Test
	public void testSelectionUnsortedList() {
		sortingArray = unsorted;
		SortAlgos.selectionSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the rest of the edge coverage missed in the 
	 * first one and can also be utilized for node coverage
	 */
	@Test
	public void testBubblePartialSortList() {
		sortingArray = partial;
		SortAlgos.bubbleSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the rest of the edge coverage missed in the 
	 * first one and can also be utilized for node coverage
	 */
	@Test
	public void testHeapPartialSortList() {
		sortingArray = partial;
		SortAlgos.heapSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the rest of the edge coverage missed in the 
	 * first one and can also be utilized for node coverage
	 */
	@Test
	public void testInsertPartialSortList() {
		sortingArray = partial;
		SortAlgos.insertionSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the rest of the edge coverage missed in the 
	 * first one and can also be utilized for node coverage
	 */
	@Test
	public void testMergePartialSortList() {
		sortingArray = partial;
		SortAlgos.mergeSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the rest of the edge coverage missed in the 
	 * first one and can also be utilized for node coverage
	 */
	@Test
	public void testQuickPartialSortList() {
		sortingArray = partial;
		SortAlgos.quickSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}
	
	/*
	 * This test case will cover the rest of the edge coverage missed in the 
	 * first one and can also be utilized for node coverage
	 */
	@Test
	public void testSelectionPartialSortList() {
		sortingArray = partial;
		SortAlgos.selectionSort(sortingArray);
		for (int i = 0; i < sortingArray.length; i++) {
			assertEquals(sorted[i].key, sortingArray[i].key);
		}
	}

}
