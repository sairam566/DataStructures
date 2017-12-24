package com.vijaya.sort;

public class SelectionSortBysai {
	public static void main(String[] args) {
		int i,j;
		int x[]={20, 35, -15, 7, 55, 1, -22,0};
		for(i=0;i<x.length-1;i++)
		{
			int largest=0;
			for(j=1;j<x.length-i;j++)
			{
				if(x[j]>x[largest])
				{
					largest=j;
				}
			}
			swap(x, largest, j-1);
			
		}
		for (int k : x) {
			System.out.print(k+" ");
		}
	}
	public static void swap(int[] array,int value1,int value2)
	{
		if(value1==value2)
		{
			return;
		}
		int temp=array[value1];
		array[value1]=array[value2];
		array[value2]=temp;
	}

}
