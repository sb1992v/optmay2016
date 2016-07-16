package com.two95.assignment7;

public class GenericMethodTest {
	public static <E> void printArray(E[] inputArray){
		for(E element:inputArray){
			System.out.printf("%s",element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray={1, 2, 3, 4, 5};
		Double[] doubleArray={1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray={'K','E','V','I','N'};
		System.out.println("Array intArray contains ");
		printArray(intArray);
		System.out.println("\nArray doubleArray contains ");
		printArray(doubleArray);
		System.out.println("\nArray charArray contains ");
		printArray(charArray);
		
		}
		
		

	}


