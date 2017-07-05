class Main{
		
	public static void main(String[] args){
		Matriz mat1;
		MatrizOt mat2;
		MatrizSuperOt mat3;

		int det;
		long inicio, fim, resultado;	

		mat1 = new Matriz(3,3);
		mat2 = new MatrizOt(3,3);
		mat3 = new MatrizSuperOt(3,3);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);

		System.out.println("--------Matriz 3x3--------")
		
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		System.out.printf("A determinante da matriz 3x3 com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos%n%n", resultado);

		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		System.out.printf("A determinante da matriz 3x3 com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos%n%n", resultado);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		System.out.printf("A determinante da matriz 3x3 com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos%n%n%n%n%n%n", resultado);
	}

}
