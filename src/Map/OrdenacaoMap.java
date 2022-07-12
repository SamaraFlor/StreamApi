package Map;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {

	public static void main(String[] args) {
		System.out.println("--\tOrdem aleat�ria\t--");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem Inser��o\t--");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put(" Hawking, Stephen", new Livro("Uma Breve Hist�ria do Tempo", 256));
            put(" Duhigg, Charles", new Livro("O Poder do H�bito", 408));
            put(" Harari, Yuval Noah", new Livro("21 Li��es Para o S�culo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfab�tica autores\t--");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("--\tOrdem alfab�tica nomes dos livros\t--");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

           System.out.println("--\tOrdem n�mero de p�gina\t--"); 
           
           Set<Map.Entry<Integer, Livro>> meusLivros4 = new TreeSet<> (new ComparatorPaginas());
           meusLivros4.addAll((Collection<? extends Entry<Integer, Livro>>) meusLivros.entrySet());
           for (Map.Entry<Integer, Livro> livro : meusLivros4)
               System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());

      
	}

}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<Integer, Livro>>{

	@Override
	public int compare(Entry<Integer, Livro> l1, Entry<Integer, Livro> l2) {
		return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
	}
}
