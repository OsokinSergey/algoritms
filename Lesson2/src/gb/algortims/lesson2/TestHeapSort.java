package gb.algortims.lesson2;

public class TestHeapSort {
	
	public static void main(String[] args) {
		
		int arr[] = {12, 11, 13, 5, 6, 7};
		HeapSort heapSort = new HeapSort();
		System.out.println("Исходный массив ");
		printArray(arr);
		heapSort.sort(arr);
		System.out.println("\nОтсортированный массив");
		printArray(arr);
		
	}
	
	private static void printArray(int arr[]) {
		
		for(int counter=0; counter < arr.length; counter++) {
			System.out.print(arr[counter]+" ");
		}

		
	}

}
