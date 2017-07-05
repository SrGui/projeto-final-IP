import java.util.Random;

class MatrizSuperOt{
	private int[][] mat;
	private int tamLinha;
	private int tamColuna;

	MatrizSuperOt(){
		mat = new int[6][6];
		this.setTamanhoLinha(6);	
		this.setTamanhoColuna(6);
	}

	MatrizSuperOt(int numLinhas, int numColunas){
		mat = new int[numLinhas][numColunas];
		this.setTamanhoLinha(numLinhas);	
		this.setTamanhoColuna(numColunas);
	}


	public int getValor(int indiceI,int indiceJ){
		return mat[indiceI][indiceJ];
	}	
	
	public void setValor(int indiceI,int indiceJ, int novoValor){
		mat[indiceI][indiceJ] = novoValor;
	}

	public int getTamanhoLinha(){
		return tamLinha;
	}	
	
	public int getTamanhoColuna(){
		return tamColuna;
	}	

	private void setTamanhoLinha(int novoValor){
		tamLinha = novoValor;
	}

	private void setTamanhoColuna(int novoValor){
		tamColuna = novoValor;
	}

	public void imprime(){
		int conti,contj;	
		for(conti = 0; conti < this.getTamanhoLinha(); conti++){
			System.out.println();
			for(contj = 0; contj < this.getTamanhoColuna(); contj++){
				System.out.print(this.getValor(conti,contj) + " ");
			}
		}
		System.out.println();	
	}

	public void copiaMatriz(Matriz mat){
		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		for(conti = 0; conti < numL; conti++){
			for(contj = 0; contj < numC; contj++){
				this.setValor(conti,contj,mat[conti][contj]);
			}
		}
	}

	public void inicializaRandomico(){
		int conti,contj, novoValor, mult, numL, numC;
		Random gerador = new Random();
		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		for(conti = 0; conti < numL; conti++){
			for(contj = 0; contj < numC; contj++){
				mult = numL * numC;
				novoValor = gerador.nextInt(mult);
				this.setValor(conti,contj,novoValor);
			}
		}
	}

	// caso matriz nao quadrada, retorna -1
	public int retorneOrdem(){
		int numL, numC, ordem;

		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		ordem = -1;
		if(numL == numC){
			ordem = numL;
		}

		return ordem;
	}	

	private int detOrdem1(Matriz mat){
		return mat.getValor(0,0);
	}
	
	private int detOrdem2(Matriz mat){
		int diagonalP, diagonalI;

		diagonalP = mat.getValor(0,0) * mat.getValor(1,1);		
		diagonalI = mat.getValor(1,0) * mat.getValor(0,1);		

		return (diagonalP - diagonalI);
	}

	private int calculaSinal(int indiceL, int indiceC){
		int sinal;

		sinal = -1;

		if( ((indiceL + indiceC)% 2) == 0 ){
			sinal = 1;
		}

		return sinal;		
	}

	private String maisZeros (Matriz mat){
       int indiceC = 0, indiceL = 0, maiorC, maiorL, i, j, tempC = 0, tempL = 0, contC, contL;
       String resposta;
		  contL = mat.getTamanhoLinha();
		  contC = mat.getTamanhoColuna();
		  for(i = 0; i < contL; i++){
			  maiorC = 0;
			  maiorL = 0;
			  for(j = 0; j < contC; j++){
				  if(this.getValor(i,j) == 0){
					  maiorL++;
				  }
				  if(this.getValor(j,i) == 0){
					  maiorC++;
				  }
			  }
			  if(maiorL > tempL){
				  indiceL = i;
			  }
			  if(maiorC > tempC){
				  indiceC = i;
			  }
	           tempL = maiorL;
				  tempC = maiorC;
			  }
		  if(indiceL >= indiceC){
		
		  		if (indiceL > 9){
		  			resposta = indiceL + "L";	
		  		} else {
		  			resposta = "0" + indiceL + "L";
		  		}
		  	
		  		return resposta;
		  
		}else{
		  	if (indiceC > 9){
		  			resposta = indiceC + "C";	
		  		} else {
		  			resposta = "0" + indiceC + "C";
		  		}
		  	
		  		return resposta;
		  }
	  }

	public void copiaMatrizMaiorParaMenor(Matriz maior,Matriz menor,int isqn,int jsqn){
		int contAi,contAj,contBi,contBj,temp,numL,numC;
		numL = menor.getTamanhoLinha();
		numC = menor.getTamanhoColuna();

		contAi = 0;
		for(contBi = 0; contBi < numL; contBi++){
			if(contAi == isqn){
				contAi++;
			}
			contAj = 0;
			for(contBj = 0; contBj < numC; contBj++){
				if(contAj == jsqn){
					contAj++;
				}
				temp = maior.getValor(contAi,contAj);
				menor.setValor(contBi,contBj,temp);
				contAj++;
			}
			contAi++;
		}
	}

private int detZero(Matriz mat){
       int j, i, numL, numC, contC = 0, contL = 0,resposta = 0;
	      numL = mat.getTamanhoLinha();
		  numC = mat.getTamanhoColuna();
		  for(i = 0; i < numL; i++){
			  for(j = 0; j < numC; j++){
				  if(this.getValor(i,j) == 0){
					  contL++;
				  }
				  if(this.getValor(j,i) == 0){
					  contC++;
				  }
			  }
			}
			  if(contC == numC & contL == numL){
				  return(resposta);
			  }else{
			   resposta = -1;
			   return(resposta);	
			  }
			}
			  

	private int detOrdemN(Matriz mat){
		int sinal,cofator,detTemp,resposta,cont,numL,numC,numero, detZero;
		String cofatorMaisZero;
        char linhaoucoluna;
		Matriz matmenor;
		numL = this.getTamanhoLinha();
		numC = this.getTamanhoColuna();
		detZero = this.detZero(mat);
		if(detZero == 0){
          resposta = 0;
          return (resposta);
		}else{
		    resposta = 0;
		    for(cont = 0; cont < numL; cont++){
			  matmenor = new Matriz(numL-1,numC-1);
			  cofatorMaisZero = this.maisZeros(mat);
	  		  numero = Integer.parseInt(String.valueOf(cofatorMaisZero.substring(0, 2)));;
			  linhaoucoluna = cofatorMaisZero.charAt(2);
			  if(linhaoucoluna == 'C'){
			     cofator = mat.getValor(cont,numero);
			     sinal = this.calculaSinal(cont,numero);
			     this.copiaMatrizMaiorParaMenor(mat,matmenor,cont,numero);
		      }else{
		    	 cofator = mat.getValor(numero,cont);
		    	 sinal = this.calculaSinal(numero,cont);
		    	 this.copiaMatrizMaiorParaMenor(mat,matmenor,numero,cont);
		       }
		      if(cofator == 0){
				resposta = resposta + 0;
			  }else{
			    detTemp = matmenor.determinante();
			    resposta = resposta + (cofator * sinal * detTemp);
		       }
		     }
		return (resposta);
	    }
	}

	public int determinante(){
		int ordem,det;

		ordem = this.retorneOrdem();
		det = 0;

		if(ordem > 0){
			switch (ordem) {
			    case 1:  det = this.detOrdem1(this);
				     break;
			    case 2:  det = this.detOrdem2(this);;
				     break;
			    default: det = this.detOrdemN(this);;
				     break;
			}
			
		}
		else{
			System.out.println("Matriz nao eh quadrada!! retornando 0");
		}

		return det;
	}

}
