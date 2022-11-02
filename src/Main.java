import java.util.Scanner;

public class Main {
    static void topla(){
        System.out.println("Toplama İşlemini Seçtiniz. İşlemi Bitirmek İçin Sıfır Seçebilirsiniz");
        Scanner scanner = new Scanner(System.in);
        int sayi,sonuc = 0, i=1;
        while(true){
            System.out.println(i++ + ". sayı :");
            sayi = scanner.nextInt();
            if (sayi == 0){
                break;
            }
            sonuc += sayi;
        }
        System.out.println("Sonuç: "+ sonuc);
    }

    static void cikarma(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz :");
        int sayac = scanner.nextInt();
        int sayi,sonuc = 0;
        for (int i=1;i<=sayac;i++){
            System.out.println(i + ".sayı :");
            sayi = scanner.nextInt();
            if(i==1){
                sonuc += sayi;
                continue;
            }
            sonuc -= sayi;
        }
        System.out.println("Sonuç: "+ sonuc);
    }
    static void carpma(){
        System.out.println("Çarpma İşlemini Seçtiniz. İşlemi Bitirmek İçin 1 Seçebilirsiniz");
        Scanner scan = new Scanner(System.in);
        int sayi, sonuc = 1,i=1;
        while (true){
            System.out.println(i++ + ".sayı :");
            sayi = scan.nextInt();
            if(sayi == 1)
                break;
            if (sayi == 0){
                sonuc =0;
                break;
            }
            sonuc *= sayi;
        }
        System.out.println("Sonuç : " + sonuc);

    }
    static void bolme(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Böleni 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Sonuç : " + result);


    }
    static void usalma(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç : " + result);

    }
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       int secim;
       String islem = "" +
               "1 : Toplama\n"+
               "2 : Çıkarma\n"+
               "3 : Çarpma\n"+
               "4 : Bölme\n"+
               "5 : Üs Alma\n"+
               "0 : Çıkış ";
       do{
           System.out.println(islem);
           System.out.println("Lütfen Yapacağınız İşlemi Seçiniz: ");
           secim = scanner.nextInt();
           switch (secim){
               case 1:
                   topla();
                   break;
               case 2:
                   cikarma();
                   break;
               case 3:
                   carpma();
                   break;
               case 4:
                   bolme();
                   break;
               case 5:
                   usalma();
                   break;
               case 0:
                   break;
               default:
                   System.out.println("Yanlış bir değer girmiş olabilirsiniz, yeniden deneyiniz");

           }
       }while (secim != 0);



    }
}