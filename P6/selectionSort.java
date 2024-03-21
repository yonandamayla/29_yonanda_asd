public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 14, 27, 35, 42, 19, 33, 29};
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);
        
        selectionSort(arr);
        
        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }
    
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Tukar elemen
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
