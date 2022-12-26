public class ReverseList {
    public static void main(String[] args) {
        int[] list = {10, 20, 30, 40, 50};
        int i;
        for (i = list.length - 1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }
}

