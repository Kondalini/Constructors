package Build;


    public class SumArr {
        public static void main(String[] args) {


            double[] numbers = {0, 0.5, 1, 1.5, 2, 2.5};
            double sum = 0;
            for (double num : numbers) {
                sum += num;
            }
            System.out.println("The sum of arr is:" + sum);
        }
    }

