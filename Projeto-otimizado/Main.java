class Main{
		
	public static void main(String[] args){
		Matriz mat1,mat2;
		int det;
		long inicio, fim, resultado;	

		mat1 = new Matriz(12,12);
		mat1.inicializaRandomico();
		mat1.imprime();
		inicio = System.nanoTime();
		det = mat1.determinante();
		fim = System.nanoTime();
		resultado = fim - inicio;
		System.out.println(det);
		System.out.println(resultado);

		


	}

}
