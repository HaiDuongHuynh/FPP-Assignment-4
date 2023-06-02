public class Prog2 {
    public static int digit(int n) {
        if (n <= 9) {
            return 1;
        }
        return 1 + digit(n / 10);
    }

        public static void main (String[]args){
            int number = 123456;
            System.out.println("Number of digits of "+ number + " is: " + digit(number));
        }
}

