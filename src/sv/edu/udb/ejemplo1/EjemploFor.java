package sv.edu.udb.ejemplo1;

import javax.swing.JOptionPane;

public class EjemploFor {
	
	public static void main(String[] args) {
		//Declararemos 2 variables
		int NumInicial, NumFinal;
		//int Incremento;
		//int Aux;
		
		NumInicial = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Ingrese el numero inicial"));
		
		NumFinal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Ingrese el numero final"));
		
		//Incremento = Integer.parseInt(JOptionPane.showInputDialog(null,
		//		"Ingrese en cuanto quiere que crezca el numero"));
	
		/*if(Incremento<=0) {
			Incremento = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Ingrese en cuanto quiere que crezca el numero"));
		}*/
		
		//Ciclo repetitivo For
		//Este ciclo es determinista, es decir se ejecutara
		//El numero de veces que le indique en el codigo
		//Sus valores son (contador o bandera, limite final, incremento)
		for(int i=NumInicial;i<=NumFinal;i=i+4) {
			
			JOptionPane.showMessageDialog(null,"Ciclo For "+i);
		}
		
		//Las letras i,j,k se utilizan para contadores o banderas
				
	}
}
