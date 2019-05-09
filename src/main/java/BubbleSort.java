public class BubbleSort{


    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSort(int[] arr){
        boolean isSorted = true;
        int lastSortedSpot = arr.length-1;

        while(isSorted){
            isSorted = false;
            for (int i = 0; i < lastSortedSpot; i++) {
                if(arr[i] > (arr[i+1])){
                    swap(arr, i, i+1);
                    isSorted = true;
                }
            }
            lastSortedSpot--;
        }
    }

//    void bubbleSort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (arr[j] > arr[j+1])
//                {
//                    // swap arr[j+1] and arr[i]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//    }

    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
