package coversoesentretipos;

public class ConversoesEntreTipos {
    public static void main(String[] args){

        int numeroint = 5;
        double numeroDouble = numeroint;
        System.out.println(numeroint);
        System.out.println(numeroDouble);

        int outronumeroint = (int) numeroDouble;
        System.out.println(outronumeroint);

        int terceironumeroint = (int) 5.23;
        System.out.println(terceironumeroint);

        String tipoString = String.valueOf(10);
        System.out.println(tipoString);

        int tipoint = Integer.parseInt(String.valueOf(150));
        System.out.println(tipoint);
    }
}
