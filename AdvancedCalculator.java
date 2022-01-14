import java.util.Scanner;

public class AdvancedCalculator {

    static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int n2 = input.nextInt();
        System.out.println("Sonuç: "+(n1+n2));
    }
    static void extraction(){
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int n2 = input.nextInt();
        System.out.println("Sonuç: "+(n1-n2));
    }
    static void multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int n2 = input.nextInt();
        System.out.println("Sonuç: "+(n1*n2));
    }
    static void divide(){
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int n1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        int n2 = input.nextInt();
        System.out.println("Sonuç: "+(n1/n2));
    }
    static void pow(){
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısını giriniz");
        int n1 = input.nextInt();
        System.out.println("Üs sayısını giriniz");
        int n2 = input.nextInt();
        int result = 1;
        for(int i =1;i<=n2;i++){
            result *=n1;
        }
        System.out.println("Sonuç: "+result);
    }
    static void fact(){
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyelini öğrenmek istediğiniz sayı: ");
        int n1= input.nextInt();
        int f1=1;
        for(int i=1;i<=n1;i++){
            f1*=i;
        }
        System.out.println(f1);
        System.out.println("Sonuç: "+ f1);
    }
    static void mod(){
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        int n1 = input.nextInt();
        System.out.println("Mod kaç");
        int n2 = input.nextInt();
        System.out.println("Sonuç: "+ (n1%n2));
    }
    static void rectangle(){
        Scanner input = new Scanner(System.in);
        System.out.println("İlk kenarı giriniz: ");
        int n1 = input.nextInt();
        System.out.println("İkinci kenarı giriniz: ");
        int n2 = input.nextInt();
        System.out.println("Alan: "+ (n1*n2));
        System.out.println("Çevre: "+ (2*(n1+n2)));
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println("Yapmak istediğiniz işlemi seçin: " + menu);
        select = input.nextInt();

        if (select ==1){
            sum();
        }
        else if (select ==2){
            extraction();
        }
        else if (select ==3){
            multiplication();
        }
        else if (select ==4){
            divide();
        }
        else if (select ==5){
            pow();
        }
        else if (select ==6){
            fact();
        }
        else if (select ==7){
            mod();
        }
        else if (select ==8){
            rectangle();
        }
        else if (select ==0){
            System.out.println("Çıkış yapıldı.");
        }
        else{
            System.out.print("Yanlış giriş yapıldı. ");
        }

    }
}
