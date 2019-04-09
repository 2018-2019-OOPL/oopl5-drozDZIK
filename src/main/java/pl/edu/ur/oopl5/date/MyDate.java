
package pl.edu.ur.oopl5.date;


import java.time.Instant;
import java.time.LocalTime;
import java.util.Scanner;
import static javafx.beans.binding.Bindings.select;

public class MyDate {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz: (1)-biezaca data; (2)-poprzedi tydzien; (3)-nastepny tydzien");
        int number = sc.nextInt();
        switch (number){
            case (1):
                biezaca_data();
                break;
            case (2):
                poprzedni_tydzien();
                break;
            case (3):
                nastepny_tydzien();
                break;
            default :
                System.out.println("Wybierz od 1 do 3");
            
        }
        
    }

    private static void biezaca_data() {
        LocalTime today = LocalTime.now();
        System.out.println(today.getHour() + ":" + today.getMinute()+ ":" +today.getSecond());
        Instant date = Instant.now();
        System.out.println(date.toString());
    }

    private static void nastepny_tydzien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void poprzedni_tydzien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
