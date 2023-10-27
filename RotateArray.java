import java.util.Scanner;
public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number length of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of positions to rotate: ");
        int number = scanner.nextInt();
        int[] rotatedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int newIndex = (i + number-1) % array.length;
            rotatedArray[newIndex] = array[i];
        }
        System.arraycopy(rotatedArray, 0, array, 0, array.length);
        System.out.print("Rotated array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}  

