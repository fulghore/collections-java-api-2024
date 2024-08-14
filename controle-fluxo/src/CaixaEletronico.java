public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 25;
        double valorSolicitado = 16;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saldo atual: R$"+ saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
        
    }
}
