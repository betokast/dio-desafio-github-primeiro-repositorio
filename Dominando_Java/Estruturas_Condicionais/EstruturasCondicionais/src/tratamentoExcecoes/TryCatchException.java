package tratamentoExcecoes;

import java.text.NumberFormat;
import java.text.ParseException;

public class TryCatchException {
    public static void main(String[] args) {
        Number valor;
        try{
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        }catch(ParseException err){
            err.printStackTrace();
        }
    }
}
