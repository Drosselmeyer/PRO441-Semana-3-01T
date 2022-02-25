package sv.edu.udb.ejemplo1;
import javax.swing.*;

public class EjemploWhile {

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
		//Ciclo repetitivo While
		//Este ciclo necesita cumplir la condicion primero
		//para ejecutar el codigo
		while(Aux<=NumFinal) {
		
			JOptionPane.showMessageDialog(null,"Ciclo While "+Aux);
			//System.out.println("Numero: "+Aux);
			Aux = Aux + Incremento;
		}
		
	}
}
