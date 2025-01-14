
import java.util.Scanner;

public class Yorh4 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
       

        Scanner scanner = new Scanner(System.in);
        System.out.println("sum ou divi: ");
        String calculo = scanner.nextLine();
        
        if(calculo.equalsIgnoreCase("sum")){
            int resultado = sum(x, y);
            System.out.println("resultado da soma: " + resultado);
        }else if(calculo.equalsIgnoreCase("divi")){
            int resultado = divi(x, y);
            System.out.println("Resultado da subtração: " + resultado);
        }else {
            System.out.println("deu ruim");
        }
        scanner.close();
        
}
    public static int sum(int x, int y){
        return x + y;
    }
    public static int divi(int x, int y){
        return x - y;
    }
    
}
