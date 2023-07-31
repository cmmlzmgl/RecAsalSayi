import java.util.Scanner;

public class RecAsalSayi {

    public static boolean asalMi(int num1, int num2) {
        if (num2 == 1) {
            return true;
        }

        if (num1 % num2 == 0) {
            return false;
        }

        return asalMi(num1, num2 - 1);
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz: ");
        int num1 = input.nextInt();

        boolean asal = asalMi(num1, num1 - 1);

        if (asal) {
            System.out.println(num1 + " bir asal sayıdır.");
        } else {
            System.out.println(num1 + " bir asal sayı değildir.");
        }
    }
}
