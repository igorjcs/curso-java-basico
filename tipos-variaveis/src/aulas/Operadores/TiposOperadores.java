package aulas.Operadores;

public class TiposOperadores {
    
    public static void main(String[] args) {
       
        // Imprimir com um if/else curto
        int num1, num2;

        num1 = 5;
        num2 = 2;

        String resultado = num1==num2 ? "verdadeiro" : "falso";

        System.out.println(resultado);


        // Comparar Strings de forma mais efetiva
        String nomeUm = "Igor";
        String nomeDois = new String ("Igor");

        System.out.println(nomeUm.equals(nomeDois));
    }

}

