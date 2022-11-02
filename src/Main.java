import java.util.Scanner;

public class Main {
    static void topla(){
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
        System.out.println("Çıkarma");
    }
    static void carpma(){
        System.out.println("Çarpma");

    }
    static void bolme(){
        System.out.println("Bölme");

    }
    static void usalma(){
        System.out.println("Üs Alma");

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
               "0 : Çıkış (Tüm işlemlerde çıkış için kullanılır)";
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