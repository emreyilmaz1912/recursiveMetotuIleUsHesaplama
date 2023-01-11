import java.util.Scanner;

public class Main {

    static int power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result =1;

        for (int i = 1; i <= exponent; i++) {
            if (exponent == 0) {
                result = 1;
                break;
            }else
            result *= base;

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Üs hesaplamaya hoşgeldiniz");

        System.out.println("Sonuç : " + power());
    }
}