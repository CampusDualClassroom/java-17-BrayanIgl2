package com.campusdual.classroom;

public class Exercise17 {
	public static int[] createEmptyIntArray(int positions) {

		//Se crea un array de tipo int de X posiciones
		int[] intArray = new int[positions];
		return intArray;
	}

	public static String[] createInitializedStringArray() {

		//Se crea un array de tipo String de 3 posiciones
		String[] stringArray = new String[3];

		//Se rellena el array
		stringArray[0] = "1";
		stringArray[1] = "2";
		stringArray[2] = "3";
		return stringArray;
	}

	public static void populateArray(int[] array, int index, int value) {

		//Se asigna el valor X a la posicion Y
		array[index] = value;
	}


	public static int arrayLength(int[] array) {

		//Devuelve el tamaño del array
		return array.length;
	}

	public static void showValue(int[] array, int index) {

		//Muestra el valor de X posicion del array
		System.out.println(array[index]);

	}

	public static void main(String[] args) {
		int[] intArray = createEmptyIntArray(3);
        String[] stringArray = createInitializedStringArray();
		populateArray(intArray, 0, 10);
		populateArray(intArray, 1, 9);
		populateArray(intArray, 2, 8);
		showValue(intArray, 0);
		System.out.println(arrayLength(intArray));
	}
}
