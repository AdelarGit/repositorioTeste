public class Principal {

    public static void main(String[]args){
        Arquivo.ler();
        Covid.processarConsolidado();
        Covid.imprimirSaidaJson();
    }
}
