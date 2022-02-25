package sv.edu.udb.ejemplo1;

import javax.swing.JOptionPane;

public class EjemploDoWhile {
	public static void main(String[] args) {
		//Declararemos 2 variables
		int NumInicial, NumFinal;
		int Incremento;
		int Aux;
		
		NumInicial = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Ingrese el numero inicial"));
		
		NumFinal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Ingrese el numero final"));
		
		Incremento = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Ingrese en cuanto quiere que crezca el numero"));
	
		/*if(Incremento<=0) {
			Incremento = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Ingrese en cuanto quiere que crezca el numero"));
		}*/
		
		Aux = NumInicial;
		//Ciclo repetitivo Do-While
		//Este ciclo ejecutara el codigo primero (al menos una vez)
		//Luego preguntara si se cumple la condicion
		do {
			
			JOptionPane.showMessageDialog(null,"Ciclo Do-While "+Aux);
			//System.out.println("Numero: "+Aux);
			Aux = Aux + Incremento;
		}while(Aux<=NumFinal);
		
	}
}
