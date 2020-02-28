
package mdc_algEuclides;


public class Mdc {
    private double num1;
    private double num2;
    
    public void setNum1(double _numero){
        if(_numero > 0 ){
			this.num1 = _numero;
		}
    }
    public double getNum1(){
        return this.num1;
    }
    public void setNum2( double _numero){
        if(_numero > 0){
			this.num2 = _numero;
		}
    }
    public double getNum2(){
        return this.num2;
    }
    
    //retorna o mdc entre dois numeros inteiro positivos atraves do algoritmo de euclides
    public int algEuclides(int num1,int num2){
        int divisor,dividendo,resto,numMDC;
        resto = -1;
        numMDC = -1;
        if(num1 < num2 ){//definicao de divisor e dividendo para evitar numeros decimais
            divisor = num1;
            dividendo = num2;
        }else{
            divisor = num2;
            dividendo = num1;
        }
        while(resto != 0){//loop de resolucao
            resto = dividendo % divisor;
            if(resto == 0){//sera executado quando o mdc for encontrado
                numMDC = divisor;
            }else{//repete o ciclo ate que o resto seja zero
                dividendo = divisor;
                divisor = resto;
                numMDC = divisor;
                resto = dividendo % divisor;
            }
        }
        return numMDC;
    }
}
