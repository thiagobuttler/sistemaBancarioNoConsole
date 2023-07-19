public class Menu {
    private static int escolha;
    private static double valorConsultado;
    private static double valorRecebido;
    private static double valorCreditado;
    private static double valorTransferido;
    private static double valorDebitado;
    public void menu() {
        InformacoesCliente informacoesCliente = new InformacoesCliente();

        do {
        System.out.println("""
                
                
                Operações
                
                1- Consultar  saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                    """);

        escolha = inputclass.in.nextInt();

        switch (escolha) {
            case 1:
                valorConsultado = informacoesCliente.getValor();
                System.out.println("O saldo atual é de R$ " + valorConsultado);
                break;
            case 2:
                System.out.println("Informe o valor a receber:");
                valorRecebido = inputclass.in.nextDouble();

                valorConsultado = informacoesCliente.getValor();
                valorCreditado = valorConsultado + valorRecebido;

                informacoesCliente.setValor(valorCreditado);
                valorConsultado = informacoesCliente.getValor();

                System.out.println("Seu valor atual é de " + valorConsultado);
                break;
            case 3:
                System.out.println("Informe o valor a transferir:");
                valorTransferido = inputclass.in.nextDouble();

                valorConsultado = informacoesCliente.getValor();
                valorDebitado = valorConsultado - valorTransferido;

                informacoesCliente.setValor(valorDebitado);
                valorConsultado = informacoesCliente.getValor();

                System.out.println("Seu valor atual é de " + valorConsultado);
                break;
            case 4:
                System.out.printf("Até mais!");
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida, tente novamente");
                break;
            }
        } while (escolha != 4);
    }
}
