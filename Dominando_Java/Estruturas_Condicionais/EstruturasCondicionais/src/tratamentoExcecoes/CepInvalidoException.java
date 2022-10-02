package tratamentoExcecoes;

public class CepInvalidoException extends Throwable {
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8){
            throw new CepInvalidoException();
        }
        return "40.080-002";
    }
}
