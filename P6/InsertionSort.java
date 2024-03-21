public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 8, 5, 2, 4, 6, 3};
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);
        
        insertionSort(arr);
        
        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }
    
    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; --j) {
                // Tukar elemen jika arr[j] lebih kecil dari arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }
    
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
