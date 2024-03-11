 public class Prac3a {
    public static void main(String[] args) {
        try {
		int[] numbers = {1, 2, 3};
            	int value = exp(numbers, 5); 
            	System.out.println("Value at index 5: " + value);
        }
	catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception");
        }
    }

public static int exp(int[] array, int index) {
        return array[index];
    }
}  