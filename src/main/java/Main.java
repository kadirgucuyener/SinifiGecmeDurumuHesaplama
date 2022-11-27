import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if (mat < 100 || mat > 100){
            mat=0;
        }
        System.out.print("Fizik Notunuz:");
        fizik = input.nextInt();
        if (fizik < 100 || fizik > 100){
            fizik=0;
        }
        System.out.print("Kimya Notunuz:");
        kimya = input.nextInt();
        if (kimya < 100 || kimya > 100){
            kimya=0;
        }
        System.out.print("Türkçe Notunuz:");
        turkce = input.nextInt();
        if (turkce < 100 || turkce > 100){
            turkce=0;
        }
        System.out.print("Müzik Notunuz:");
        muzik = input.nextInt();
        if (muzik < 100 || muzik > 100){
            muzik=0;
        }
        double average = ((mat+fizik+kimya+turkce+muzik)/5);

        if (average<55){
            System.out.println("Sınıfta Kaldınız. Seneye Görüşmek Üzere.");
        }else {
            System.out.println("Sınıfı Geçtiniz.");
        }
        System.out.println("Ortalamanız : " + average);
    }
}



