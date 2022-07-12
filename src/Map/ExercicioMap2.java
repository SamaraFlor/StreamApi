package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


/*
Faça um programa que simule um lançamento de dados. Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi conseguido.
 */
public class ExercicioMap2 {
	public static void main(String[] args) {
		
		int quantidade = 100;
		
		 List<Integer> valores = new ArrayList<>();
	    
		 Random geradorValores = new Random();
	     
	     for (int i = 0; i < quantidade; i++) {
	         int number = geradorValores.nextInt(7);
	         valores.add(number);
	     }

	        Map<Integer, Integer> lancamentos = new HashMap<>();
	        for (Integer resultado : valores) {
	            if (lancamentos.containsKey(resultado))
	                lancamentos.put(resultado, (lancamentos.get(resultado) + 1));
	            else lancamentos.put(resultado, 1);
	        }
          
	        System.out.println("\nValor " + " Quant. de vezes");
	        for (Map.Entry<Integer, Integer> entry : lancamentos.entrySet()) {
	            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
	        }
	
}
}