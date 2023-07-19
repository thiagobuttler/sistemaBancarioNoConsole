public class InformacoesCliente {
    private static String nome;
    private static String tipoDaConta;
    private static double saldoInicial;

    public void mostraInformacoesCliente() {

        System.out.println("Digite seu nome");
        nome = inputclass.in.nextLine();

        System.out.println("Informe o tipo da sua conta");
        tipoDaConta = inputclass.in.nextLine();

        System.out.println("Informe o saldo inicial");
        saldoInicial = inputclass.in.nextDouble();

        System.out.println("""
                **********************************************************************
                Dados iniciais do cliente:
                
                Nome:           %s
                Tipo conta:     %s
                Saldo Inicial:  R$ %.2f
                **********************************************************************
                """.formatted(nome, tipoDaConta, saldoInicial));

    }
        public void setValor(double valor) {
            saldoInicial = valor;
        }


        public double getValor() {
            return  saldoInicial;
    }
}
