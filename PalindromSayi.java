import java.sql.SQLOutput;

public class PalindromSayi {
    public static void main(String[] args) {

        palindrom(746);

    }

    static boolean palindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp/=10;
        }
        if (number == reverseNumber) {
            System.out.println("Palindrom");
            return true;
        }
        else {
            System.out.println("Palindrom değil");
            return false;
        }
    }
}
