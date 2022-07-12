package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
1. "Telefonou para a v�tima?"
2. "Esteve no local do crime?"
3. "Mora perto da v�tima?"
4. "Devia para a v�tima?"
5. "J� trabalhou com a v�tima?"
Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", entre 3 e 4 como
"C�mplice" e 5 como "Assassina". Caso contr�rio, ele ser� classificado como "Inocente".
*/

public class ResolvendoCrime {

	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	   List<String>respostas = new ArrayList<>();

	   
	   System.out.println("Algumas perguntas sobre o crime  ");
	   
	   System.out.println("Telefonou para a v�tima?");
	   String resposta = entrada.next();
	   System.out.println("Esteve no local do crime?");
	  resposta = entrada.next();
	   System.out.println("Mora perto da v�tima?");
	  resposta = entrada.next();
	   System.out.println("Devia para a v�tima?");
       resposta = entrada.next();
	   System.out.println("J� trabalhou com a v�tima?");
	    resposta = entrada.next();
	    
	    int count = 0;
	    //Exemplo da Interface Iterator
        Iterator<String> contador = respostas.iterator();
        //  m�todo hasNext() determina se existem mais elementos para serem iterados.
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
