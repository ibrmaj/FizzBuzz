public class Reduce {
    public static void main(String[] args) {

        int j = 0;

        int i = 100;

        while (i > 0) {
            boolean even = i % 2 == 0;
            boolean odd = i % 2 == 1;
            if (even) {
                i = i / 2;
            }
            else if (odd) {
                i--;
            }
            j++;
        }
        System.out.println(j);
    }
}
