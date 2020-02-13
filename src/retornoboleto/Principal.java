
package retornoboleto;

public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Banco do Brasil");
        final LeituraRetorno leituraRetorno = new LeituraRetornoBancoBrasil();
        ProcessarBoletos processador = new ProcessarBoletos(leituraRetorno);
        
       String nomeArquivo = "banco-brasil-1.csv";
       processador.processar(nomeArquivo);
       
       System.out.println("Bradesco");
       nomeArquivo = "bradesco-1.csv";
        processador.setLeituraRetorno(new LeituraRetornoBancoBradesco());
       processador.processar(nomeArquivo);
       
    }
    
}
