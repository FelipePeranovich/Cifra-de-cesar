package cifracesar;

import java.util.Scanner;

public class Codigo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "";
        int cdg = 0;
        int deslocamento = 0;      
        System.out.println("Informe a palavra:");
        frase = teclado.nextLine();
        System.out.println("Informe o deslocamento:");
        deslocamento = teclado.nextInt();
        System.out.println("Palavra cifrada:");
        for (int i = 0; i < frase.length(); i++) {
          cdg = (frase.charAt(i));
          int cdgfinal = cdg + deslocamento;  
            if (cdgfinal > 122) {
                cdgfinal = cdgfinal - 122 + 96;
            }
            if (cdgfinal < 97 && cdgfinal > 90) {
                cdgfinal = cdgfinal - 90 + 64;
            }
            if (cdgfinal < 65 && cdgfinal > 57) {
                cdgfinal = cdgfinal - 57 + 47;
            } 
            char novaletra =(char) cdgfinal;
            if (novaletra == '#') {
                novaletra = ' ';
            }
            System.out.print(novaletra);                  
        }
        System.out.println("");
        
    }
}