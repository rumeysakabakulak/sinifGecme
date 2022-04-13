import java.util.Scanner;
public class sinifGeçmeDurumu {
    public static void main(String[] args) {

        int matematik , fizik , kimya , turkce , muzik , toplam = 0 ;
        double sayım = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();
        if (!(matematik <= 0 || matematik >= 100)){
            toplam += matematik;
            sayım++;
        }
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        if (!(fizik <= 0 || fizik <= 100)){
            toplam += matematik;
            sayım++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        if (!(kimya <= 0 || kimya >= 100)){
            toplam += kimya;
            sayım++;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();
        if (!(turkce <= 0 || turkce >= 100)){
            toplam += turkce;
            sayım++;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();
        if (!(muzik >=0 || muzik >= 100)){
            toplam +=muzik;
            sayım++;
        }
        if (toplam / sayım >= 55){
            System.out.println("Sınıfı Geçti");
        }else{
            System.out.println("Sınıfta Kaldı");
        }
        System.out.println("Ortalamanız: " + toplam/sayım);


        }


    }

