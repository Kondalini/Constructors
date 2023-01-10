package Lecture06;

public class FindSmallestNumber {
    public static void main(String[] args) {
    }

    public static int findSmallestNumber(int num1, int num2, int num3) {
        int smallestNumber = num1;
        if (smallestNumber > num2) {
            smallestNumber = num2;
        }
        if (smallestNumber > num3) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }


    public static double returnAverageNumber(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }


    public static void displayMiddleChar(String value) {
        int position;
        int length;

        if (value.length() % 2 == 0) {
            position = value.length() / 2 - 1;
            length = 2;

        } else {
            //If the length of the string is odd there will be one middle character.
            position = value.length() / 2;
            length = 1;
        }

        System.out.println(value.substring(position, position + length));
    }

    public static int countWords(String text) {
        text = text.trim();
        int count = 0;
        int textLength = text.length();
        if (textLength > 1) {
            count++;
            for (int i = 1; i < textLength; i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        return count;
    }
}