
public class TestaCaracteres {
	
	public static void main(String[] args) {
		char umaLetra = 'a'; //Guarda uma letra, e é preciso ultilizar aspas simples
		System.out.println(umaLetra);
		
		char valor = 66;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor); 
		// Char transforma a letra em número mas na hora de exibir, converte para letra novamente
		
		String palavra = "Alura cursos online de tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
		//String de fato armazena as letras
	}

}
