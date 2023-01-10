package Lecture04.Lecture06;

public class displayMiddleCha {

        public static void displayMiddleChar(String value) {
            int position;
            int length;

            //If the length of the string is even there will be two middle characters.
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
    }

