package Lecture05;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 11, 45, 9};


        int largestNumber = arr[0];
        int i;

        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber)
                largestNumber = arr[i];
        }

        System.out.println("The largest number is: " + largestNumber);
    }
}



