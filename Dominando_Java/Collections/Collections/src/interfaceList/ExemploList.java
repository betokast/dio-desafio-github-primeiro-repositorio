package interfaceList;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        //Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

        //FORMAS DE INICIALIZAR UMA LIST
        //Forma 1:
//        List<Double> notas = new ArrayList<>();

        //Forma 2:
//        ArrayList<Double> notas2 = new ArrayList<>();

        //Forma 3:
//        List<Double> notas3 = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        //Forma 4:
//        List<Double> notas4 = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas4.add(10d); //Dessa forma, não é possível adicionar ou remover elementos na lista. O comando ao lado ocasiona um erro
//        System.out.println(notas4);

        //Forma 5: Esta forma também impede de adicionar ou remover elementos
//        List<Double> notas5 = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
//        notas5.add(1d); //Operação não permitida
//        notas5.remove(5d); //Operação não permitida
//        System.out.println(notas5);

        System.out.println("Crie uma lista e adicione 7 notas");
        List<Double> notas = new ArrayList<>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        //Exibição
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        //Adição
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        //Substituição
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        //Verificação
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //Exibição na ordem de inserção
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for(Double nota : notas) System.out.println(nota);

        //Exibição de acordo com critério de ordem de inserção
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        //Exibição de acordo critério de comparação menor
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //Exibição de acordo critério de comparação maior
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //Exibição da soma de valores da list
        Iterator<Double> iterator = notas.iterator(); //Método que itera dentro da list
        Double soma = 0d;
        while(iterator.hasNext()){ //Método hasNext verifica se há próximo elemento
            Double next = iterator.next(); //Atribuição do próximo elemento à variável next
            soma += next; //Soma dos próximos elemento com a soma
        }
        System.out.println("Exiba a soma de valores: " + soma);

        //Exibição de média dos elementos da list
        System.out.println("Exiba a média das notas: " + soma/notas.size());

        //Remoção de determinado elemento da list
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        //Remoção de determinado elemento em determinada posição da list
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        //Remoção de determinado elemento de acordo com critério de comparação de tamanho
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        //Deleção de todos os elementos da list
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        //Verificação se a lista está vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
