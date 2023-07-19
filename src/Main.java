public class Main {
    public static void main(String[] args) {
        InformacoesCliente informacoesCliente = new InformacoesCliente();
        Menu menu = new Menu();

        informacoesCliente.mostraInformacoesCliente();
        menu.menu();
    }
}