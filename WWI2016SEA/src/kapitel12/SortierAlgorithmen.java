package kapitel12;

public class SortierAlgorithmen {

	private static int[] zuSortieren = {90, 70, 50, 30, 80, 60}; 
	
	public static int[] bubblesort(int[] array){
		
		long startZeit = System.currentTimeMillis();
		
		int j = array.length - 1; 	// Vorletzte Element des Arrays
		boolean swapped = false; 	// Variable um festzustellen ob in einem durchlauf getauscht wurde 
		
		do{
			swapped = false;			// sollte innerhalb einer gesamten Iterration (von 0 bis j) kein Wert vertauscht worden sein, bleibt swapped auf false und das Array ist sortiert
			for(int i = 0; i < j; i++){
				if(array[i] > array[i+1]){
					swap(array, i, i+1);
					swapped = true;
				}
			}
			j--; 					// es muss immer ein Element weniger betrachtet werden, weil das Ende immer weiter sortiert ist
		}while(swapped);
		
		long endZeit = System.currentTimeMillis();
		
		printTime("BubbleSort" ,array, startZeit, endZeit);
		
		return array;
	}
	
	public static int[] insertionsort(int[] array){
		
		long startZeit = System.currentTimeMillis();
		
		for(int i = 1; i < array.length; i++){
			for(int j = i; j > 0; j--){
				if(array[j] < array[j-1]){
					swap(array, j, j-1);
				}else{
					break;
				}
			}
		}
		
		long endZeit = System.currentTimeMillis();
		
		printTime("Insertionsort", array, startZeit, endZeit);
		
		return array;
	}
	
	public static int[] insertionsortZwei(int[] array){
		
		long startZeit = System.currentTimeMillis();
		
		for(int i = 1; i < array.length; i++){
			int j = i;
			while(j > 0 && array[j] < array[j-1]){
				swap(array, j, j-1);
				j--;
			}
		}
		
		long endZeit = System.currentTimeMillis();
		
		printTime("InsertionSort Zwei", array, startZeit, endZeit);
		
		return array;
	}
	
	public static int[] selectionSort(int[] array){
		
		long startZeit = System.currentTimeMillis();
		
		int marker = array.length - 1;
		
		while(marker > 0){
			int maxPos = 0;
			for(int i = 0; i <= marker; i++){
				if(array[i] > array[maxPos]){
					maxPos = i;
				}
			}
			swap(array, marker, maxPos);
			marker--;
		}
		
		long endZeit = System.currentTimeMillis();
		
		printTime("SelectionSort", array, startZeit, endZeit);
		
		return array;
	}

	private static void printTime(String algorithmusName, int[] array, long startZeit, long endZeit) {
		System.out.println("Laufzeit für " + algorithmusName + " mit " + array.length + " Elementen: " + (endZeit - startZeit)/1000.0 + "s");
	}
	
	
	private static void swap(int[] array, int a, int b){
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	private static void printArray(int[] array){
		System.out.print("Array-Ausgabe: " );
		for(int i : array){
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("Unsortiert:");
		printArray(zuSortieren);
		
		System.out.println("BubbleSort:");
		printArray(bubblesort(zuSortieren.clone()));
		
		System.out.println("InsertionSort:");
		printArray(insertionsort(zuSortieren.clone()));
		
		System.out.println("InsertionSortZwei:");
		printArray(insertionsortZwei(zuSortieren.clone()));
		
		System.out.println("SelectionSort:");
		printArray(selectionSort(zuSortieren.clone()));

	}

}
