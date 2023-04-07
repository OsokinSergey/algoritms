package gb.algortims.lesson2;

public class HeapSort {

	 public void sort(int array[]) {
	        int n = array.length;
	 
	        // Построение кучи (перегруппировка массива)
	        for (int i = n / 2 - 1; i >= 0; i--)
	            heapify(array, n, i);
	 
	        // Один за другим извлекаем элементы из кучи
	        for (int i=n-1; i>=0; i--) {
	            // Перемещаем текущий корень в конец
	            int temp = array[0];
	            array[0] = array[i];
	            array[i] = temp;
	 
	            // вызываем процедуру heapify на уменьшенной куче
	            heapify(array, i, 0);
	        }
	    }
	 
	    // Функция для превращения поддерева в кучу
	    void heapify(int arr[], int n, int i) {
	        int largest = i;  // Инициализируем наибольший элемент как корень
	        int left = 2*i + 1;  // левый = 2*i + 1
	        int right = 2*i + 2;  // правый = 2*i + 2
	 
	        // Если левый дочерний элемент больше корня
	        if (left < n && arr[left] > arr[largest])
	            largest = left;
	 
	        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
	        if (right < n && arr[right] > arr[largest])
	            largest = right;
	 
	        // Если самый большой элемент не корень
	        if (largest != i) {
	            int swap = arr[i];
	            arr[i] = arr[largest];
	            arr[largest] = swap;
	 
	            // Рекурсивно heapify поддерево
	            heapify(arr, n, largest);
	        }
	    }
}
	
	

