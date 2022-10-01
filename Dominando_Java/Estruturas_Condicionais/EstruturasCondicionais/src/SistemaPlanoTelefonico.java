public class SistemaPlanoTelefonico {
    public static void main(String[] args) {
        String plano = "T";

        switch (plano){
            case "B":
                System.out.println("100 minutos de ligações");
                break;
            case "M":
                System.out.println("100 minutos de ligações e WhatsApp + Instagram gratuitos");
                break;
            case "T":
                System.out.println("100 minutos de ligações + Whats e Instagram grátis e 5GB Youtube");
        }
    }
}
