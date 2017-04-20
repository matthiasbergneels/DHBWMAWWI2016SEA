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
		
		System.out.println("BubbleSort Laufzeit für " + array.length + " Elemente: " + (endZeit - startZeit) + "ms");
		
		return array;
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

	}

}
