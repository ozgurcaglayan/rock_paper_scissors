import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("TAŞ KAĞIT MAKAS OYUNUNA HOŞGELDİNİZ!");

        System.out.println("Seçiniz:\n1)Taş\n2)Kağıt\n3)Makas");
        Scanner klavye = new Scanner(System.in);
        int deger = klavye.nextInt();

        Random r=new Random(); //random sınıfı
        int a=r.nextInt(3); //0=taş 1=kağıt 2=makas
        System.out.println(a);

        if (deger==3 && a==1){
            System.out.println("Tebrikler Kazandınız.(Makas kağıdı keser)");
        }
        else if(deger==3 && a==0){;
        System.out.println("Uzgunum kaybettiniz: (Taş makası kırar)");

        } else if (deger==3 && a==2) {
            System.out.println("Berabere: (Makas = Makas)");

        } else if (deger==2 && a==1) {
            System.out.println("Tebrikler Kazandınız.(Makas kağıdı keser)");

        }else if (deger==2 && a==0) {
            System.out.println("Tebrikler Kazandınız.(Kağıt taşı sarar)");

        }else if (deger==2 && a==2) {
            System.out.println("Berabere: (Kağıt = Kağıt)");

        }else if (deger==1 && a==1) {
            System.out.println("Uzgunum kaybettiniz: (Kağıt taşı sarar.)");

        }else if (deger==1 && a==0) {
            System.out.println("Berabere: (Taş .0 Taş)");

        }else if (deger==1 && a==2) {
            System.out.println("Tebrikler Kazandınız.(Taş makası kırar.)");

        }


    }
}
//