package Set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;ok
b) A quantidade de cores que o arco-íris tem;ultilizei size()
c) Exiba as cores em ordem alfabética; addAll()
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */
public class Exercicio1 {
	
	public static void main(String[] args) {
		
	
	 System.out.println("--\tOrdem aleatória\t--");
     Set<Cores> arcoIris = new HashSet<>(){{
         add(new Cores("azul", "claro"));
         add(new Cores("violeta","claro"));
         add(new Cores("verde", "escuro"));
         add(new Cores("vermelho", "claro"));
         add(new Cores("Rosa", "claro"));
         add(new Cores("Amarelo", "claro"));
     }};
     
     for (Cores cor: arcoIris) System.out.println(cor.getNome() + " - "
             + cor.getIntensidade());
    
     System.out.println("Cores" + arcoIris);
     
     System.out.println("Cores  " + arcoIris.size());
     
     System.out.println("--\tOrdem inserção\t--");
     
     
     Set<Cores> minhasCores1 = new LinkedHashSet<>() {{
    	  add(new Cores("azul", "claro"));
          add(new Cores("violeta","claro"));
          add(new Cores("verde", "escuro"));
          add(new Cores("vermelho", "claro"));
          add(new Cores("Rosa", "claro"));
          add(new Cores("Amarelo", "claro"));
     }};
     
     for (Cores cor: minhasCores1) System.out.println(cor.getNome() + " - "
             + cor.getIntensidade());
     

     System.out.println("--\tOrdem Nome/Intensidade");
     Set<Cores> minhasCores2 = new TreeSet<>(new ComparatorNomeIntensidade());
     minhasCores2.addAll(minhasCores1);
     for (Cores cor: minhasCores2) System.out.println(cor.getNome() + " - "
             + cor.getIntensidade());

     
     System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
     for (Cores cor: minhasCores1) {
         if(cor.startsWith("v")) System.out.println(cor);
     }
     
     System.out.println("Remova todas as cores que não começam com a letra “v”: ");
     Iterator<Cores> iterator2 = arcoIris.iterator();
     while (iterator2.hasNext()) {
         if (iterator2.next().startsWith("v")) iterator2.remove();
         if (!iterator2.next().startsWith("v")) iterator2.remove();
     }
     System.out.println(arcoIris);
     
     
     System.out.println("Limpe o conjunto: ");
    arcoIris.clear();
    minhasCores2.clear();

     System.out.println("Confira se o conjunto está vazio: " + arcoIris.isEmpty());
     
     System.out.println("Confira se o conjunto está vazio: " + minhasCores1.isEmpty());
	}
}

class Cores implements Comparable<Cores> {
	private String nome;
	private String intensidade;
	public Object getIntensidade;

	public Cores(String nome, String intensidade) {
		this.nome = nome;
		this.intensidade = intensidade;
	}

	public boolean startsWith(String string) {
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIntensidade() {
		return intensidade;
	}

	public void setIntensidade(String intensidade) {
		this.intensidade = intensidade;
	}

	@Override
	public int compareTo(Cores o) {
		return 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(intensidade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cores other = (Cores) obj;
		return Objects.equals(intensidade, other.intensidade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cores [nome=" + nome + ", intensidade=" + intensidade + "]";
	}
	
}

class ComparatorNomeIntensidade implements Comparator<Cores>{

	@Override
	public int compare(Cores c1, Cores c2) {
		 int nome = c1.getNome().compareTo(c2.getNome());
	        if (nome != 0) return nome;
	        
	        return compare(c1.getIntensidade(), c2.getIntensidade());
	        
	        
	}

	private int compare(String intensidade, String intensidade2) {
		return 0;
	}

 
}

