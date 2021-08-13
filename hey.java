import java.util.Scanner;
public class hey {
    public static void main(String[] args) {
        double b,kdvoran;

Scanner input= new Scanner(System.in);

System.out.println("Aldığınız ürünün fiyatını giriniz: ");
double a = input.nextDouble();
System.out.println("KDV'siz fiyat: ");
System.out.println(a);

kdvoran=(a>1000) ? 0.8 : 0.18;
        b=(a*kdvoran)+a;
System.out.println("KDV'li fiyat: ");
System.out.println(b);


    }
}
