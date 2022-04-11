
package muhtesemsayiprogrami;
import java.util.*;
public class MuhtesemSayiProgrami {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = input.nextInt();
        
        int toplam=0;
        
        for(int i=1; i<sayi;i++)
        {
            if(sayi%1==0)
            {
                toplam +=i;
                
            }
        }
        
        if(sayi==toplam)
        {
            System.out.print(sayi + " " + "Mükemmel sayıdır.");
        }
        else {
            System.out.print(sayi + " " + "Mükemmel sayı değildir.");
        }
                
    }
    
}