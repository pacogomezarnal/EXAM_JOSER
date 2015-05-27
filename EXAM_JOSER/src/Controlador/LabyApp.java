package Controlador;

import java.awt.EventQueue;

import model.ConexionDB;
import Vista.VistaPrincipal;

public class LabyApp {
	public static void main(String[] args) {

		
		//Establecemos la conexion con la base de datos
				ConexionDB thelaby;
				
				//Generamos el objeto
				thelaby=new ConexionDB ("localhost","thelaby","root","tonphp");
				
				if (thelaby.connectDB()==true) System.out.println("Conectados con éxito");
				else System.out.println("Error en la conexión");	
				
				
				
		
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						VistaPrincipal frame = new VistaPrincipal();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	}


