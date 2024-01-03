import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] dizi = diziyeEkleme();
        double harmonikToplam = 0;
        for (double eleman : dizi) {
            harmonikToplam += 1 / eleman;
        }
        double harmonikOrtalama = dizi.length / harmonikToplam;
        System.out.println("Dizinin Harmonik Ortalaması " + harmonikOrtalama);
    }

    public static double[] diziyeEkleme() {
        Scanner inp = new Scanner(System.in);

        System.out.println("Dizinin Eleman Sayısnı Giriniz: ");
        int n = inp.nextInt();

        double[] dizi = new double[n];

        System.out.println("Dizinin Elemanlarını Giriniz;");
        for (int i = 0; i < n; i++) {
            System.out.println("Eleman " + ( i+1) + ": ");
            dizi[i] = inp.nextDouble();
            
        }
        return dizi;
    }
}
