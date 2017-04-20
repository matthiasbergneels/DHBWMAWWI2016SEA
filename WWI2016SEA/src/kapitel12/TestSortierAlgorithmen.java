package kapitel12;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestSortierAlgorithmen {

	static int count = 100000;
	static int randomRange = 3000000;
	static int[] toSort = null;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// vor allen Tests einmal
		generateArray();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void bubbleSortTest() {
		assertTrue(isSorted(SortierAlgorithmen.bubblesort(toSort.clone())));
	}
	
	@Test
	public void insertionsortTest() {
		assertTrue(isSorted(SortierAlgorithmen.insertionsort(toSort.clone())));
	}
	
	@Test
	public void insertionsortZweiTest() {
		assertTrue(isSorted(SortierAlgorithmen.insertionsortZwei(toSort.clone())));
	}
	
	@Test
	public void selectionsortTest() {
		assertTrue(isSorted(SortierAlgorithmen.selectionSort(toSort.clone())));
	}
	
	private static boolean isSorted(int[] array){
		for(int i = 0; i < array.length-1; i++){
			if(array[i] > array[i+1]){
				return false;
			}
		}
		return true;
	}

	
	private static void generateArray(){
		toSort = new int[count];
		for(int i = 0; i < count; i++){
			boolean notInserted = true;
			while(notInserted){
				int randomNumber = (int)(Math.random() * randomRange);
				
				boolean found = false;
				for(int j = 0; j < i; j++){
					if(toSort[j] == randomNumber){
						found = true;
						break;
					}
				}
				
				if(!found){
					toSort[i] = randomNumber;
					notInserted = false;
				}
				
			}
		}
	}

}
