package com.bridgelabz.algorithmicProgramming;

public class MergeSort {
	
	public static void merge(String arr[],int beg, int mid, int end)
    {
    int n1 = mid - beg + 1;
        int n2 = end - mid;
        String L[] = new String [n1];
        String R[] = new String [n2];
        for (int i=0; i<n1; ++i)
        {
            L[i] = arr[beg + i];
        }
        for (int j=0; j<n2; ++j)
        {
          R[j] = arr[mid + 1+ j];
        }
        int i = 0, j = 0;
        int k = beg;
        while (i < n1 && j < n2)
        {
            if (L[i].compareTo(R[j])<=0)
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
   public static void mergeSort(String arr[], int beg, int end)
    {
        if (beg < end)
        {
            int mid = (beg+end)/2;
            mergeSort(arr, beg, mid);
            merge(arr, beg, mid, end);
        }
    } 

}
