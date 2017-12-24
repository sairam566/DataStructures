package com.vijaya.sort;

public class SelectionSortBySarah {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

		for(int lastUnsortedIndex=intArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--)
		{
			int largest=0;
			for(int i=1;i<=lastUnsortedIndex;i++)
			{
				if(intArray[i]>intArray[largest])
				{
					largest=i;
				}
			}
			swap(intArray, largest, lastUnsortedIndex);
		}
		
		for (int j1 : intArray) {
			System.out.print(j1+" ");
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
