import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner imp = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        matematik = imp.nextInt();
        System.out.print("Fizik Notunuz = ");
        fizik = imp.nextInt();
        System.out.print("Kimya Notunuz = ");
        kimya = imp.nextInt();
        System.out.print("Türkçe Notunuz = ");
        turkce = imp.nextInt();
        System.out.print("Tarih Notunuz = ");
        tarih = imp.nextInt();
        System.out.print("Müzik Notunuz = ");
        muzik = imp.nextInt();
        double sonuc = ((matematik + fizik + kimya + turkce + tarih + muzik)/6);
        System.out.println("Ortalamanız : " + sonuc);
        String sonuc2 = (sonuc>=60) ? "Sınıfı geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc2);
    }
}
