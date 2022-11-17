import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        double boy, kg,sonuc;
        Scanner imp = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (Metre Cinsinden) Giriniz : ");
        boy = imp.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kg = imp.nextDouble();

        sonuc = kg/(boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + sonuc);
    }

}