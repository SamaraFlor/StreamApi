package Map;

import java.text.CollationElementIterator;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Dada a população estimada de alguns estados do nordeste brasileiro, faça:
 Estado = PE - população = 9.616.621
 Estado = AL - população = 3.351.543
 Estado = CE - população  = 9.187.103
 Estado = RN - população = 3.534.265
 */
public class ExerciciosMap {

	public static void main(String[] args) {

		System.out.println("Lista de Estados: ");
		Map<String, Integer> estados = new HashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);

			}
		};
		System.out.println(estados);

		System.out.println("Substitua a população do estado RN por : 3.534.165");
		estados.put("RN", 3534165);
		System.out.println(estados);

		System.out.println("Confira se o estado da Paraíba (PB) consta, caso não  adicione " + estados.containsKey("PB")
				+ "   " + estados.put("PB", 4039277));

		System.out.println(estados);

		System.out.println("Exiba a população do estado PE: " + estados.get("PE"));

		System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
		Map<String, Integer> estados1 = new LinkedHashMap<>() {
			{
				put("PE", 9616621);
				put("AL", 3351543);
				put("CE", 9187103);
				put("RN", 3534265);

			}
		};
		System.out.println(estados1.toString());

		System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
		Map<String, Integer> estados2 = new TreeMap<>(estados);
		System.out.println(estados2);

		Collection<Integer> populacao = estados.values();
		String estadoMaiorPopulacao = "";
		String estadoMenorPopulacao = "";
		for (Map.Entry<String, Integer> entry : estados.entrySet()) {
			if (entry.getValue().equals(Collections.max(populacao)))
				estadoMaiorPopulacao = entry.getKey();
			if (entry.getValue().equals(Collections.min(populacao)))
				estadoMenorPopulacao = entry.getKey();
		}

		System.out.printf("Exiba o estado com o menor população     " + estadoMenorPopulacao,
				Collections.min(populacao));

		System.out.printf("        Exiba o estado com a maior população     " + estadoMaiorPopulacao,
				Collections.max(populacao));

		int soma = 0;
		Iterator<Integer> iterator = estados.values().iterator();
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		
		System.out.println ("\n Exiba a soma da população desses estados: " + soma);
		
		
		System.out.println ("\n Exiba media da população desses estados: " + soma/estados.size());
		
		 System.out.println("Remova os estados com a população menor que 4.000.000: ");
		 
		 Iterator<Integer> iterator1 = estados.values().iterator();
	      while(iterator1.hasNext()){
	          if(iterator1.next()< 4000000) iterator1.remove();
	          
	          System.out.println(estados);
	 		 }
	      
	     
	      System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
	      estados.clear();
	      
	
	      System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: " + estados.isEmpty());
	      
	      System.out.println(estados);
	}

	
}

class Estados {
	private String nome;
	private Integer numeroPopulacao;

	public Estados(String nome, Integer numeroPopulacao) {
		this.nome = nome;
		this.numeroPopulacao = numeroPopulacao;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroPopulacao() {
		return numeroPopulacao;
	}

	public void setNumeroPopulacao(Integer numeroPopulacao) {
		this.numeroPopulacao = numeroPopulacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroPopulacao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estados other = (Estados) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroPopulacao, other.numeroPopulacao);
	}

	@Override
	public String toString() {
		return "Estados [nome=" + nome + ", numeroPopulacao=" + numeroPopulacao + "]";
	}

}

class CompararNome implements Comparator<Map.Entry<String, Estados>> {

	@Override
	public int compare(Entry<String, Estados> e1, Entry<String, Estados> e2) {
		return e1.getValue().getNome().compareToIgnoreCase(e2.getValue().getNome());
	}

}
