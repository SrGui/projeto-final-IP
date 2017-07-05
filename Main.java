import java.util.concurrent.TimeUnit;

class Main{
		
	public static void main(String[] args){
		Matriz mat1;
		MatrizOt mat2;
		MatrizSuperOt mat3;

		int det;
		long inicio, fim, resultado;
		double milliseconds;	

		//MATRIZ 3 X 3

		mat1 = new Matriz(3,3);
		mat2 = new MatrizOt(3,3);
		mat3 = new MatrizSuperOt(3,3);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);


		System.out.println("--------Matriz 3x3--------");
		
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
		
		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);	


		//MATRIZ 5 X 5

		mat1 = new Matriz(5,5);
		mat2 = new MatrizOt(5,5);
		mat3 = new MatrizSuperOt(5,5);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);


		System.out.println("--------Matriz 5x5--------");
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
		
		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);


		//MATRIZ 7 X 7

		mat1 = new Matriz(7,7);
		mat2 = new MatrizOt(7,7);
		mat3 = new MatrizSuperOt(7,7);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);


		System.out.println("--------Matriz 7x7--------");
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
		
		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);


		//MATRIZ 9 X 9

		mat1 = new Matriz(9,9);
		mat2 = new MatrizOt(9,9);
		mat3 = new MatrizSuperOt(9,9);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);


		System.out.println("--------Matriz 9x9--------");
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
		
		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);


		//MATRIZ 11 X 11

		mat1 = new Matriz(11,11);
		mat2 = new MatrizOt(11,11);
		mat3 = new MatrizSuperOt(11,11);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);


		System.out.println("--------Matriz 11x11--------");
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
		
		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);


		//MATRIZ 12 X 12

		mat1 = new Matriz(12,12);
		mat2 = new MatrizOt(12,12);
		mat3 = new MatrizSuperOt(12,12);
		
		mat1.inicializaRandomico();
		mat2.copiaMatriz(mat1);
		mat3.copiaMatriz(mat1);


		System.out.println("--------Matriz 12x12--------");
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
		
		inicio = System.nanoTime();
		det = mat2.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);

		inicio = System.nanoTime();
		det = mat3.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		milliseconds = resultado/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det);
		System.out.printf("O tempo gasto nesse algoritmo de própria otimização é: %d nanosegundos e %.6f milisegundos%n%n", resultado, milliseconds);
	}

}
