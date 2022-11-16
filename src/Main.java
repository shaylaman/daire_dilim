import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, aci, alan;
        Scanner inp = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını giriniz: ");
        r = inp.nextDouble();
        System.out.println("Dairenin açısını giriniz: ");
        aci = inp.nextDouble();
        alan = (pi * (r * r) * aci)/360;
        System.out.println("Dilim alanı : " + alan);

    }
}