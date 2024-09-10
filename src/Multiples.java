public class Multiples {
    public static void main(String[] args) {
        int i = 0;

        for (int x = 0; x < 1000; x++) {

            boolean By3 = x % 3 == 0;
            boolean By5 = x % 5 == 0;

            if (By3 && By5) {

                i++;

            } else if (By3) {

                i++;
            } else if (By5) i++;
        }
        System.out.println(i);
    }
}
