package practicajoshuapedraza;

import java.util.ArrayList;

public class CalculosMatematicos {
	
	public CalculosMatematicos() {		
	}
        // Método para calcular el MCD usando el algoritmo de Euclides
        public void calcularMCD(int numA, int numB) {
        int a = numA, b = numB;
        while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
        }
        System.out.println("El máximo común divisor de "+numA+ " y "+numB+" es " + a);
        }

	public void calculos(int numero) {
		
		
		// Calculamos los factoriales primos
		ArrayList<Integer> miArray = new ArrayList();
		boolean noEsPrimo = false;
		int j;
		
		//AÃ±adimos el 1
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
		
		System.out.println("Los factoriales primos del nÃºmero introducido son: "+miArray);
		
		for (int  i = 2; i< numero ; i++) {
			noEsPrimo = false;			
			if(numero%i==0) {
				noEsPrimo = true;				
				i=numero;
			}
		}
		
		if(noEsPrimo) {
			System.out.println("El nÃºmero "+numero+ " NO es primo");
		} else System.out.println("El nÃºmero "+numero+ " SI es primo");
	}			
}
