
package retornoboleto;

import java.util.List;

public class ProcessarBoletos {

    private LeituraRetorno leituraRetorno;

    public void setLeituraRetorno(LeituraRetorno leituraRetorno) {
        this.leituraRetorno = leituraRetorno;
    }
    
    public ProcessarBoletos(LeituraRetorno leituraRetorno){
        this.leituraRetorno = leituraRetorno;
    }
    
    public void processar(String nomeArquivo){
       List<Boleto> boletos =  leituraRetorno.lerArquivo(nomeArquivo);
        for (Boleto boleto : boletos) {
            System.out.println(boleto.getId());
        }
    
    }
    
}
