public class Prog1 {
    public static int reverse(int num){
        int reverseNum =0;
        if(num<=9){
            return num;
        }
        int lastDigit = num % 10;
        int remain = num/10;
        reverseNum = reverse(remain);

        int digit = 1;

        while(num >= 10){
            digit *= 10;
            num /= 10;
        }
        return (lastDigit*digit)+reverseNum;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reverse of "+ number + " is: " + reverse(number));
    }
}
