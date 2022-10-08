package InterfaceMap;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        //Dados os modelos dos carros e seus respectivos consumos na estrada, faça:
        //modelo = gol - consumo = 14,4km/l
        //modelo = uno - consumo = 15,6km/l
        //modelo = mobi - consumo = 16,1km/l
        //modelo = hb20 - consumo = 14,5km/l
        //modelo = kwid - consumo = 15,6km/l

        System.out.println("Crie um dicionário e relacione seus modelos com seus respectivos consumos");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());
        System.out.println("Por ser um HashMap, a forma impressa é diferente da forma como foram inseridos");

        System.out.println("================================================");
        System.out.println("Substitua o consumo do gol por 15,5 km/l: ");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println("================================================");
        System.out.println("Confira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("================================================");
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("================================================");
        System.out.println("Exiba o terceiro modelo adicionado: ");
        System.out.println("Da mesma forma como no set, não há um método para atender essa solicitação");

        System.out.println("================================================");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("Exiba os modelos: " + modelos);

        System.out.println("================================================");
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("================================================");
        System.out.println("Exiba o modelo mais econômico e seu respectivo consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

        System.out.println("================================================");
        System.out.println("Exiba o modelo menos econômico e seu respectivo consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

        System.out.println("================================================");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma );

        System.out.println("================================================");
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma / carrosPopulares.size()));

        System.out.println("================================================");
        System.out.println("Remova os modelos com consumo igual a 15.6: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)){
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);

        System.out.println("================================================");
        System.out.println("Exiba todos os carros na ordem que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);

        System.out.println("================================================");
        System.out.println("Exiba o dicionário ordenado alfabeticamente pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("================================================");
        System.out.println("Apague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("================================================");
        System.out.println("Confira se o dicionário está vazia: ");
        System.out.println(carrosPopulares.isEmpty());
        System.out.println("Lista carrosPopulares: " + carrosPopulares);
    }
}
