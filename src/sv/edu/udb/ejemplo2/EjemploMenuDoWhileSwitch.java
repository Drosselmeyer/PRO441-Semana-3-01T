package sv.edu.udb.ejemplo2;

import javax.swing.JOptionPane;

public class EjemploMenuDoWhileSwitch {
	public static void main(String[] args) {

		//Registro de datos de matricula
		String Nombre="";
		int Edad=0;
		String Ciclo="";
		String Carrera="";
		int Option=6;
		
		JOptionPane.showMessageDialog(null,
				"Programa de registro de matricula UDB");
	
		do {
			Option = Integer.parseInt(
					JOptionPane.showInputDialog(null,
					  "Ingrese la opción que desea realizar:\n"
					+ "1. Registro de Nombre\n"
					+ "2. Registro de Edad\n"
					+ "3. Registro de Carrera\n"
					+ "4. Registro de Ciclo\n"
					+ "5. Mostrar Información\n"
					+ "6. Salir"));
			
			switch(Option){
			case 1:
				Nombre = JOptionPane.showInputDialog(null,
						"Ingrese el nombre del alumno");
				break;
			case 2:
				Edad = Integer.parseInt(
						JOptionPane.showInputDialog(null,
						"Ingrese la edad del alumno"));
				break;
			case 3:
				Carrera = JOptionPane.showInputDialog(null,
						"Ingrese la carrera del alumno");
				break;
			case 4:
				Ciclo = JOptionPane.showInputDialog(null,
						"Ingrese el ciclo a cursar");
				break;
			case 5:
				JOptionPane.showMessageDialog(null,
						  "Los datos del alumno son:\n"
						+ "Nombre: "+Nombre+"\n"
						+ "Edad: " +Edad+"\n"
						+ "Carrera: "+Carrera+"\n"
						+ "Ciclo: "+Ciclo);
				break;
			case 6:
				JOptionPane.showMessageDialog(null,
						"Saliendo del sistema..");
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Ingrese una opción válida");
				break;
			}
		}while(Option!=6);
	}
}
