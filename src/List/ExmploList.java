package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExmploList {
	
	public static void main(String[] args) {
		
	// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//  List notas = new ArrayList(); //antes do java 5
	//generics e diamond operator
//  List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
    /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    System.out.println(notas);*/
	//ArrayList<Double> notas = new ArrayList<>();  
    List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    //notas.add(1d);
    //notas.remove(5d);
    System.out.println(notas);
    //notas.add(10d);

	
	
     System.out.println("Crie uma lista e adicione as sete notas: ");
//Generics(jdk 5) - Diamond Operator(jdk 7), list add adicionar
       List<Double> notas1 = new ArrayList<Double>(); 
		    notas1.add(7.0);
		    notas1.add(8.5);
		    notas1.add(9.3);
		    notas1.add(5.0);
		    notas1.add(7.0);
		    notas1.add(0.0);
		    notas1.add(3.6);
		    System.out.println(notas1.toString());

		    //inde.of mostrar poição
      System.out.println("Exiba a posição da nota 5.0: " + notas1.indexOf(5d));
      System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
      // add mais posição e valor para adicionar
      notas1.add(4, 8d);
      System.out.println(notas1);

      
      System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
       notas1.set(notas1.indexOf(5d), 6.0);
       System.out.println(notas1);

       System.out.println("Confira se a nota 5.0 está na lista: " + notas1.contains(5d));

       System.out.println("Exiba todas as notas na ordem em que foram informados: ");
       
       for (Double nota : notas1) System.out.println(nota);
       
       System.out.println("Exiba a terceira nota adicionada: " + notas1.get(2));
       // todas as notas
        System.out.println(notas.toString());

       System.out.println("Exiba a menor nota: " + Collections.min(notas1));

       System.out.println("Exiba a maior nota: " + Collections.max(notas1));

       Iterator<Double> iterator = notas1.iterator();
       
       
		Double soma = 0d;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas1.size()));

        System.out.println("Remova a nota 0: ");
        notas1.remove(0d);
        System.out.println(notas1);
	
	      System.out.println("Remova a nota da posição 0");
	      notas1.remove(0);
	      System.out.println(notas1);

       System.out.println("Remova as notas menores que 7 e exiba a lista: ");
       Iterator<Double> iterator1 = notas1.iterator();
		    while(iterator1.hasNext()) {
		        Double next = iterator1.next();
		        if(next < 7) iterator1.remove();
		    }
         System.out.println(notas1);
      
         
       System.out.println("Apague toda a lista");
       notas1.clear();
       System.out.println(notas1);
    
      System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
     
      
      // Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
      
      
       System.out.println("Crie uma lista chamada notas2 " + "");
       List<Double> notas2 = new ArrayList<Double>(); 
       notas2.add(7.0);
	    notas2.add(8.5);
	    notas2.add(9.3);
	    notas2.add(5.0);
	    notas2.add(7.0);
	    notas2.add(0.0);
	    notas2.add(3.6);
	    System.out.println(notas2.toString());

       
      System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));
      
      
      
     System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
     notas2.remove(0);
     System.out.println(notas2);


} 
	
}
