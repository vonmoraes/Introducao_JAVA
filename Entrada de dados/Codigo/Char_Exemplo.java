import IO.*;

public class Char_Exemplo{

	public static void main( String [] args ){

			// Somente le o numero do teclado
			char valor1 = IO.readchar();
			// informa a mensagem e o usuario coloca o numero na mesma linha
			char valor2 = IO.readchar( "Digite um valor real: " );
			// informa a mensagem e o usuario coloca o numero na linha de baixo
			char valor3 = IO.readchar( "Digite outro valor real\n");

			IO.println("Valor lido para o numero1 = "+valor1 );
			IO.println("Valor lido para o numero2 = "+valor2 );
			IO.println("Valor lido para o numero3 = "+valor3 );
	}
}

/*
OBS: no valor2 eu usei o caractere '\n', ele serve para quebrar a linha. Igual quando fazem <br/> no HTML
*/
