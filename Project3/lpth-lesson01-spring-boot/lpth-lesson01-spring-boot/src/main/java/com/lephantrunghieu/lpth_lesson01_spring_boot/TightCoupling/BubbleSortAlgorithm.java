package com.lephantrunghieu.lpth_lesson01_spring_boot.TightCoupling;

public class BubbleSortAlgorithm {
    public void sort (int[] arr) {
        System.out.println("Sap xep theo giai thuat BubleSort");
        int n=arr.length;
        boolean swap;
        for (int i=0;i<n-1;i++) {
            swap=false;
            //perform a pass of buble sort
            for (int j=i+1;j<n;j++) {
                if (arr[i]>arr[j]) {
                    //swap arr [j] and arr [j+1]
                    int temp=arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            // if no elements were swapped, the array is already sorted
            if (!swap) {
                break;
            }
        }
    }
}
