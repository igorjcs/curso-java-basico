public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 14.0;

        if (valorSolicitado < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println("Valor solicitado: R$" + valorSolicitado);
        
        }else{
        System.out.println("Saldo insuficiente");}

        System.out.println("Saldo atual: R$" + saldo);


    }
}