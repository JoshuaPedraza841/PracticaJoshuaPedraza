package practicajoshuapedraza;

import java.util.ArrayList;

public class CalculosMatematicos {
	
	public CalculosMatematicos() {		
	}

	public void calculosRefactorizados(int numero) {
		
		
		boolean noEsPrimo = factorialesprimosRefactorizado(numero);
		
        noEsPrimo = noEsPrimoRefactorizado(numero, noEsPrimo);
		
		if(noEsPrimo) {
			System.out.println("El número "+numero+ " NO es primo");
		} else System.out.println("El número "+numero+ " SI es primo");
	}			

    private boolean noEsPrimoRefactorizado(int numero, boolean noEsPrimo) {
        for (int  i = 2; i< numero ; i++) {
            noEsPrimo = false;
            if(numero%i==0) {
                noEsPrimo = true;
                i=numero;
            }
        }
        return noEsPrimo;
    }

    private boolean factorialesprimosRefactorizado(int numero) {
        // Calculamos los factoriales primos
        ArrayList<Integer> miArray = new ArrayList();
        boolean noEsPrimo = false;
        int j;
        //Añadimos el 1
        miArray.add(1);
        for (int  i = 2; i< numero ; i++) {
            noEsPrimo = false;
            j = 2;
            while(j<i) {
                if(i%j==0) {
                    noEsPrimo = true;
                    j=i;
                } else j++;
            }
            if(!noEsPrimo&&numero%i==0) {
                miArray.add(i);
            }
            
        }
        System.out.println("Los factoriales primos del número introducido son: "+miArray);
        return noEsPrimo;
    }
}
