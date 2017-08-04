package com.Sort.Binary_Insertion_Sort;


/*
 * 
 * What is Binary Insertion Sort?
We can use binary search to reduce the number of comparisons in normal insertion sort. 
Binary Insertion Sort find use binary search to find the proper location to insert the selected item at each iteration. 
In normal insertion, sort it takes O(i) (at ith iteration) in worst case. we can reduce it to O(logi) by using binary search. 
The algorithm as a whole still has a running worst case running time of O(n2) because of the series of swaps required for each insertion.
 * 
 */



public class Binary_Insertion_Sort {

	public static void sort(int a[],int n){
        for (int i=0;i<n;++i){
            int temp=a[i];
            int left=0;
            int right=i;
            while (left<right){
                int middle=(left+right)/2;
                if (temp>=a[middle])
                	left = middle + 1;
                else
                    right=middle;
            }
            for (int j=i;j>left;--j){
                swap(a,j-1,j);
            }
        }
    }

    public static void main(String[] args){
        int a[]=new int[]{12,10,34,23,9,7,8,5,6};
        sort(a,a.length);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void swap(int a[],int i,int j){
        int k=a[i];
        a[i]=a[j];
        a[j]=k;
    }

}


