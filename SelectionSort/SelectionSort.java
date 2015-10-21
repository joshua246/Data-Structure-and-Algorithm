class SelectionSort {
 
    public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
     
    public static void main(String a[]){
        
        System.out.println("\n** Selection Sort Demo **");

        int[] arr1 = {10,34,2,56,7,67,88,42};

        System.out.println("Before Sort:");

        for (int i=0; i < arr1.length ; i++) {
            System.out.print(arr1[i] + " ");
        }

        int[] arr2 = doSelectionSort(arr1);

        System.out.println(); 

        System.out.println("After Sort:");
        for(int i:arr2){
            System.out.print(i + " ");
        }
    }

}
