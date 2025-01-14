
import java.util.Random;

// Loopings

public class Again {
    

    public static void main(String[] args) {
        Random generate = new Random();
        
        int i = 0;
        while(i < 6){
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
            //i = i +1;
            //i++ ou --
        }
        //ou usa for tb
        for(int n = 0; n < 6; n++){
            int number = generate.nextInt(60);
            System.out.println(number);
        }

    }

        
}
