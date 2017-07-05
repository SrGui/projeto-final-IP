import java.util.concurrent.TimeUnit;

class Main{
		
	public static void main(String[] args){
		Matriz mat1;
		MatrizOt mat2;
		MatrizSuperOt mat3;

		int det1, det2, det3;
		long inicio1, inicio2, inicio3, fim1, fim2, fim3, resultado1, resultado2, resultado3;
		double milliseconds1, milliseconds2, milliseconds3;	

		//MATRIZ 3 X 3

		mat1 = new Matriz(3,3);
		mat2 = new MatrizOt(3,3);
		mat3 = new MatrizSuperOt(3,3);
		resultado1 = 0;
		resultado2 = 0;
		resultado3 = 0;
		det1 = 0;
		det2 = 0;
		det3 = 0;


		System.out.println("--------Matriz 3x3--------");
		
		for (int i = 0; i < 3; i++){

			mat1.inicializaRandomico();
			inicio1 = System.nanoTime();
			det1 = mat1.determinante();
			fim1 = System.nanoTime();
			resultado1 =+ fim1 - inicio1;

			mat2.copiaMatriz(mat1);
			inicio2 = System.nanoTime();
			det2 = mat2.determinante();
			fim2 = System.nanoTime();
			resultado2 =+ fim2 - inicio2;

			mat3.copiaMatriz(mat1);
			inicio3 = System.nanoTime();
			det3 = mat3.determinante();
			fim3 = System.nanoTime();
			resultado3 =+ fim3 - inicio3;
		}

		resultado1 = resultado1/3;
		milliseconds1 = resultado1/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det1);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado1, milliseconds1);

		resultado2 = resultado2/3;
		milliseconds2 = resultado2/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det2);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado2, milliseconds2);


		resultado3 = resultado3/3;
		milliseconds3 = resultado3/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det3);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado3, milliseconds3);	


		//MATRIZ 5 X 5

		mat1 = new Matriz(5,5);
		mat2 = new MatrizOt(5,5);
		mat3 = new MatrizSuperOt(5,5);
		resultado1 = 0;
		resultado2 = 0;
		resultado3 = 0;
		det1 = 0;
		det2 = 0;
		det3 = 0;


		System.out.println("--------Matriz 5x5--------");
		
		for (int i = 0; i < 3; i++){

			mat1.inicializaRandomico();
			inicio1 = System.nanoTime();
			det1 = mat1.determinante();
			fim1 = System.nanoTime();
			resultado1 =+ fim1 - inicio1;

			mat2.copiaMatriz(mat1);
			inicio2 = System.nanoTime();
			det2 = mat2.determinante();
			fim2 = System.nanoTime();
			resultado2 =+ fim2 - inicio2;

			mat3.copiaMatriz(mat1);
			inicio3 = System.nanoTime();
			det3 = mat3.determinante();
			fim3 = System.nanoTime();
			resultado3 =+ fim3 - inicio3;
		}

		resultado1 = resultado1/3;
		milliseconds1 = resultado1/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det1);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado1, milliseconds1);

		resultado2 = resultado2/3;
		milliseconds2 = resultado2/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det2);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado2, milliseconds2);


		resultado3 = resultado3/3;
		milliseconds3 = resultado3/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det3);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado3, milliseconds3);


		//MATRIZ 7 X 7

		mat1 = new Matriz(7,7);
		mat2 = new MatrizOt(7,7);
		mat3 = new MatrizSuperOt(7,7);
		resultado1 = 0;
		resultado2 = 0;
		resultado3 = 0;
		det1 = 0;
		det2 = 0;
		det3 = 0;


		System.out.println("--------Matriz 7x7--------");
		
		for (int i = 0; i < 3; i++){

			mat1.inicializaRandomico();
			inicio1 = System.nanoTime();
			det1 = mat1.determinante();
			fim1 = System.nanoTime();
			resultado1 =+ fim1 - inicio1;

			mat2.copiaMatriz(mat1);
			inicio2 = System.nanoTime();
			det2 = mat2.determinante();
			fim2 = System.nanoTime();
			resultado2 =+ fim2 - inicio2;

			mat3.copiaMatriz(mat1);
			inicio3 = System.nanoTime();
			det3 = mat3.determinante();
			fim3 = System.nanoTime();
			resultado3 =+ fim3 - inicio3;
		}

		resultado1 = resultado1/3;
		milliseconds1 = resultado1/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det1);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado1, milliseconds1);

		resultado2 = resultado2/3;
		milliseconds2 = resultado2/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det2);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado2, milliseconds2);


		resultado3 = resultado3/3;
		milliseconds3 = resultado3/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det3);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado3, milliseconds3);


		//MATRIZ 9 X 9

		mat1 = new Matriz(9,9);
		mat2 = new MatrizOt(9,9);
		mat3 = new MatrizSuperOt(9,9);
		resultado1 = 0;
		resultado2 = 0;
		resultado3 = 0;
		det1 = 0;
		det2 = 0;
		det3 = 0;

		System.out.println("--------Matriz 9x9--------");
		for (int i = 0; i < 3; i++){

			mat1.inicializaRandomico();
			inicio1 = System.nanoTime();
			det1 = mat1.determinante();
			fim1 = System.nanoTime();
			resultado1 =+ fim1 - inicio1;

			mat2.copiaMatriz(mat1);
			inicio2 = System.nanoTime();
			det2 = mat2.determinante();
			fim2 = System.nanoTime();
			resultado2 =+ fim2 - inicio2;

			mat3.copiaMatriz(mat1);
			inicio3 = System.nanoTime();
			det3 = mat3.determinante();
			fim3 = System.nanoTime();
			resultado3 =+ fim3 - inicio3;
		}

		resultado1 = resultado1/3;
		milliseconds1 = resultado1/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det1);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado1, milliseconds1);

		resultado2 = resultado2/3;
		milliseconds2 = resultado2/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det2);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado2, milliseconds2);


		resultado3 = resultado3/3;
		milliseconds3 = resultado3/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det3);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado3, milliseconds3);


		//MATRIZ 11 X 11

		mat1 = new Matriz(11,11);
		mat2 = new MatrizOt(11,11);
		mat3 = new MatrizSuperOt(11,11);
		resultado1 = 0;
		resultado2 = 0;
		resultado3 = 0;
		det1 = 0;
		det2 = 0;
		det3 = 0;

		System.out.println("--------Matriz 11x11--------");

		for (int i = 0; i < 3; i++){

			mat1.inicializaRandomico();
			inicio1 = System.nanoTime();
			det1 = mat1.determinante();
			fim1 = System.nanoTime();
			resultado1 =+ fim1 - inicio1;

			mat2.copiaMatriz(mat1);
			inicio2 = System.nanoTime();
			det2 = mat2.determinante();
			fim2 = System.nanoTime();
			resultado2 =+ fim2 - inicio2;

			mat3.copiaMatriz(mat1);
			inicio3 = System.nanoTime();
			det3 = mat3.determinante();
			fim3 = System.nanoTime();
			resultado3 =+ fim3 - inicio3;
		}

		resultado1 = resultado1/3;
		milliseconds1 = resultado1/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det1);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado1, milliseconds1);

		resultado2 = resultado2/3;
		milliseconds2 = resultado2/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det2);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado2, milliseconds2);


		resultado3 = resultado3/3;
		milliseconds3 = resultado3/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det3);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado3, milliseconds3);


		//MATRIZ 12 X 12

		mat1 = new Matriz(12,12);
		mat2 = new MatrizOt(12,12);
		mat3 = new MatrizSuperOt(12,12);
		resultado1 = 0;
		resultado2 = 0;
		resultado3 = 0;
		det1 = 0;
		det2 = 0;
		det3 = 0;


		System.out.println("--------Matriz 12x12--------");
		
		for (int i = 0; i < 3; i++){

			mat1.inicializaRandomico();
			inicio1 = System.nanoTime();
			det1 = mat1.determinante();
			fim1 = System.nanoTime();
			resultado1 =+ fim1 - inicio1;

			mat2.copiaMatriz(mat1);
			inicio2 = System.nanoTime();
			det2 = mat2.determinante();
			fim2 = System.nanoTime();
			resultado2 =+ fim2 - inicio2;

			mat3.copiaMatriz(mat1);
			inicio3 = System.nanoTime();
			det3 = mat3.determinante();
			fim3 = System.nanoTime();
			resultado3 =+ fim3 - inicio3;
		}

		resultado1 = resultado1/3;
		milliseconds1 = resultado1/ 1000000.0;
		System.out.printf("A determinante com algotimo sem otimização é: %d%n", det1);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado1, milliseconds1);

		resultado2 = resultado2/3;
		milliseconds2 = resultado2/ 1000000.0;
		System.out.printf("A determinante com algotimo otimizado é: %d%n", det2);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado2, milliseconds2);


		resultado3 = resultado3/3;
		milliseconds3 = resultado3/ 1000000.0;
		System.out.printf("A determinante com algoritmo de própria otimização é: %d%n", det3);
		System.out.printf("O tempo médio gasto nesse algoritmo é de: %d nanosegundos e %.6f milisegundos%n%n", resultado3, milliseconds3);
	}

}
