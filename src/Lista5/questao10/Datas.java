package Lista5.questao10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Datas {
    static void main(String[] args) {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite alguma data especial: ");
        String data = scanner.next();
        try{
            Date dataconvertida = sd.parse(data);
            System.out.println("Data : " + dataconvertida);
        }catch (ParseException e){
            e.printStackTrace();
            System.out.println("O formato tem que ser assim(dd/MM/yyyy)..");
        }
    }
}
