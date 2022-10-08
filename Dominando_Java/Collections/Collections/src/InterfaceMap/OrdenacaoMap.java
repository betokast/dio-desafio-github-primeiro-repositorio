package InterfaceMap;
        //Dada as seguintes informações obre meus livros favoritos
        //e seus autores crie um dicionário e ordene este dicionário:
        //exibindo (Nome Autor — Nome Livro — páginas)

        //Autor = Hawking, Stephen — Livro = Uma Breve História do Tempo — páginas = 256
        //Autor = Duhig, Charles — Livro = O Poder do Hábito — páginas = 408
        //Autor = Harari, Yuval Noah — Livro = 21 Lições para o Século 21 — páginas = 432

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória\t--");
        Map<String, Livros> meusLivros = new HashMap<>(){{
           put("Hawking, Stephen", new Livros("Uma Breve História do Tempo", 256));
           put("Duhigg, Charles", new Livros("O Poder do Hábito", 408));
           put("Harari, Yuval Noah", new Livros("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livros> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<String, Livros> meusLivros1 = new LinkedHashMap<>(){{
           put("King, Stephen", new Livros("A Torre Negra", 262));
           put("Herbert, Frank", new Livros("Duna", 680));
           put("Clarke, Arthur C.", new Livros("2001 - Uma Odisséia no Espaço", 336));
        }};
        for(Map.Entry<String, Livros> livro1 : meusLivros1.entrySet()){
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética Autores\t--");
        Map<String, Livros> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livros> livro2 : meusLivros2.entrySet()){
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
        }

        System.out.println("--\tOrdem Alfabética Livros\t--");
        Set<Map.Entry<String, Livros>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livros> livro3 : meusLivros3){
            System.out.println(livro3.getKey() + " - " + livro3.getValue().getNome());
        }
//
//
//        System.out.println("--\tOrdem Número de páginas\t--");
    }
}

class Livros{
    private String nome;
    private Integer paginas;

    public Livros(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livros)) return false;
        Livros livros = (Livros) o;
        return nome.equals(livros.nome) && paginas.equals(livros.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livros>>{

    @Override
    public int compare(Map.Entry<String, Livros> l1, Map.Entry<String, Livros> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
