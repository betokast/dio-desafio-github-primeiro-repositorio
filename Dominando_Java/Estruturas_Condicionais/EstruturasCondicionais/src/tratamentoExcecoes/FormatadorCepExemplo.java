package tratamentoExcecoes;

import static tratamentoExcecoes.CepInvalidoException.formatarCep;

public class FormatadorCepExemplo {
    public static void main(String[] args) throws CepInvalidoException {
        try{
            String cepFormatado = formatarCep("2376062");
            System.out.println(cepFormatado);
        }catch(CepInvalidoException e){
            System.out.println("O CEP não corresponde ao padrão");
            e.printStackTrace();
        }
    }
}
