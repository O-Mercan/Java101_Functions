import java.util.Scanner;

public class RecursiveİleÜslüSayi {
    static int pow(int taban, int us){
        if (taban==1 || us==0){
            return 1;
        }
        return taban * pow(taban, us-1);

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int taban,us;
        System.out.print("Taban değeri giriniz: ");
        taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = input.nextInt();
        System.out.print(pow(taban,us));
    }
}
