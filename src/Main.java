import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String numString = Integer.toString(num);
        double suma = 0;
        for(int i=0; i<numString.length(); i++){
            suma += Integer.parseInt(String.valueOf(numString.charAt(i)));
        }

        return suma/numString.length();
    }
}
