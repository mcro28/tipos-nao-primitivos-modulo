package funcoesaritimeticas;

public class FuncoesAritimeticas {
    public static void main(String[] args){

        int int1 = 15;
        int int2 = 25;

        System.out.println(int1 + int2);
        System.out.println(int1 - int2);
        System.out.println(int1 * int2);
        System.out.println(int1 / int2);

        int resultadoDaSoma = (int1 + 40);
        System.out.println(resultadoDaSoma);

        int restoDaDivisao = 10 % 3;
        System.out.println(restoDaDivisao);

        restoDaDivisao = 10 % 2;
        System.out.println(restoDaDivisao);

        double resultado = Math.pow(2.0, 3.0);
        System.out.println(resultado);
        System.out.println("aqui");

        double resultadoSqrt = Math.sqrt(81.0);
        System.out.println(resultadoSqrt);

        System.out.println(Math.max(80, 50));
        System.out.println(Math.min(80, 50));
    }
}
