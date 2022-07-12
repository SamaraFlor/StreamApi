package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

public class ResolvendoCrime {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	   List<String>respostas = new ArrayList<>();

	   
	   System.out.println("Algumas perguntas sobre o crime  ");
	   
	   System.out.println("Telefonou para a vítima?");
	   String resposta = entrada.next();
	   System.out.println("Esteve no local do crime?");
	  resposta = entrada.next();
	   System.out.println("Mora perto da vítima?");
	  resposta = entrada.next();
	   System.out.println("Devia para a vítima?");
       resposta = entrada.next();
	   System.out.println("Já trabalhou com a vítima?");
	    resposta = entrada.next();
	    
	    int count = 0;
	    //Exemplo da Interface Iterator
        Iterator<String> contador = respostas.iterator();
        //  método hasNext() determina se existem mais elementos para serem iterados.
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")) {
                count ++;
            }
        
         }
        
        switch (count) {
		case 2:
			System.out.println("Supeita");
			break;
		case 3:
		case 4:
			System.out.println("Cumplice");
			break;
		case 5:
			System.out.println("Assassina");
			break;	
		default:
			System.out.println("inocente");
			
		}
	}

}
