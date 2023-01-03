import java.util.Scanner;
public class manav
{
    public static void main(String[] args){
      double kg1,kg2,kg3;
      double elmaperkg=10,armutperkg=12.4 ,limonperkg=5.5,total1,total2,total3;
      Scanner input=new Scanner(System.in);
      System.out.print("Alacağınınz elma miktarını kg cinsinden giriniz: ");
      kg1=input.nextDouble();
      System.out.print("Alacağınız armut tutarını kg cinsinden giriniz: ");
      kg2=input.nextDouble();
      System.out.print("Alacağınız limon miktarını kg cinsinden giriniz: ");
      kg3=input.nextDouble();

        total1=kg1*elmaperkg;
        total2=kg2*armutperkg;
        total3=kg3*limonperkg;
        System.out.print("toplam tutar: "+(total1+total2+total3));







    }

}
