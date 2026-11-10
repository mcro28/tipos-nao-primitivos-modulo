package manipulandostring;

import java.util.Locale;

public class ManipulandoString {
    public static void main(String[] args){
        String palavra = "manipulando string";
        System.out.println(palavra.length());
        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());
        System.out.println(palavra.substring(12));
         palavra = palavra.substring(12);
         System.out.println(palavra);
    }
}
