

public class BeTwo {
    public static void main(String[] args) { // args são parametros
        sum(32, 23);
        per(23.4, 43);
        yor("Glory to ", "Mankind");
        piper(false, " A2 is Alive");
        conjun(33, 23.7, " Alegações");
    }

    static void sum(int x, int y) { //declaração padrão 
        System.out.println(x + y);
        
    }

    static void per( double x, int y) {
        System.out.println(x / y);
        

    }

    static void yor(String x, String y ){
        System.out.println(x + y);
    }

    static void piper(boolean x, String y){
        System.err.println(x+ y);
    }

    static void conjun(int x, double y, String z){
        System.err.println(x+y+z);
    }
}
