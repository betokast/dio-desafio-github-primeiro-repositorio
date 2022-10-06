package InterfaceSet;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {


        //Iniciando o set
        System.out.println("Crie um conjunto e adicione notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("======================================================");

        //Exibição de um elemento de acordo com sua determinada posição
        System.out.println("Exiba a posição da nota 5.0: ");
        System.out.println("Não possível fazer essa busca de acordo com a posição porque o Set não possui get");
        //A sua inserção é totalmente aleatória

        System.out.println("======================================================");

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        System.out.println("Pelo mesmo motivo anterior, não é possível trabalhar com posição no Set");

        System.out.println("======================================================");

        System.out.println("Substitua a nota 5.0 pela nota 6.0");
        System.out.println("Da mesma forma, tal implementação seria possível apenas na List");

        System.out.println("======================================================");

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        System.out.println("======================================================");

        System.out.println("Exiba a terceira nota: ");
        System.out.println("Não é possível pelos mesmos motivos anteriores");

        System.out.println("======================================================");

        //Exibição do menor elemento
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("======================================================");

        //Exibição do maior elemento
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("======================================================");

        //Operação de soma dos elementos do conjunto
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("======================================================");

        //Operação de média dos elementos
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("======================================================");

        //Remoção de determinado elemento
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("======================================================");

        //Remoção de determinado elemento de acordo com um critério de comparação
        System.out.println("Remova as notas menores do que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("======================================================");

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("======================================================");

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("======================================================");

        System.out.println("Apague todos os elementos do conjunto: ");
        notas.clear();

        System.out.println(notas);

        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());

    }
}
