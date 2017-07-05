class Main{
		
	public static void main(String[] args){
		Matriz mat1,mat2;
		int det;
		long inicio, fim, resultado;	

		mat1 = new Matriz(12,12);
		mat2 = new MatrizOt(12,12);
		mat3 = new MatrizSuperOt(12,12);
		
		mat1.inicializaRandomico();
		mat1.imprime();
		mat2.copiaMatriz(mat1);
		mat2.imprime();
		mat3.copiaMatriz(mat1);
		mat3.imprime();
	}

}
