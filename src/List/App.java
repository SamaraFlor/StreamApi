package List;
import java.io.IOException;
import java.util.Scanner;
 


/*
 * Desafio
O objetivo deste desafio � resolv�-lo utilizando o seu conhecimento sobre Arrays, 
uma estrutura de dados que armazena uma cole��o de dados em um bloco de mem�ria.

Desenvolva um programa que guarde em um vetor nomes de funcion�rios de uma empresa.  
Deve-se permitir que, ao indicar o �ndice do vetor, seja indicado qual funcion�rio est� armazenado 
dentro dessa mem�ria.

Entrada
As primeiras 5 linhas da entrada dever� contaro o vetor NOMES com 5 espa�os na memoria, 
a �ltima linha dever� conter a posi��o escolhida do vetor.

Sa�da
A sa�da dever� retornar o nome de acordo com a posi��o do vetor escolhida anteriormente, conforme exemplo abaixo.

 
 */
public class App { 
 
    public static void main(String[] args) throws IOException {
 
            Scanner input = new Scanner(System.in);
            String[] nomes = new String[5];
            
            
            for (int i = 0; i < nomes.length; i++)
            {

                nomes[i] = input.nextLine();
            }
 
            int pos = input.nextInt();
            System.out.println( "Informe nome");
           
    }
}
