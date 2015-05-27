package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.ConexionDB;


public class CadeteModel {
	
	

	//DEVOLVER Usuarios
	private static String Cadete_SEL="SELECT * FROM cadetes where id=29";
	
	
	private static String labyId="id";
	private static String labynombre="nombre";
	private static String labyapellidos="apellidos";
	private static String labyedad="edad";
	private static String labynacionalidad="nacionalidad";
	private static String labyequipo="equipo";
	
		
	//Conexion
	private Connection conexion = null;//maneja la conexión
	Statement instruccion = null;
	ResultSet conjuntoResultados = null;
	
	
	//usuariosDB
	private ArrayList<Cadete> jugones=null;
	
	
	
	public CadeteModel() {
		conexion=ConexionDB.getConexion();
		jugones= new ArrayList<Cadete>();
	}
	
	
	
	public ArrayList getJugones(){
		try{
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(Cadete_SEL);

			//Listaremos por pantalla los datos
			while( conjuntoResultados.next() ) {
				
				Cadete usuario=new Cadete(
						
						conjuntoResultados.getString(labynombre),
						conjuntoResultados.getInt(labyId),
						conjuntoResultados.getString(labyapellidos),
						conjuntoResultados.getInt(labyedad),
						conjuntoResultados.getString(labynacionalidad),
						conjuntoResultados.getInt(labyequipo));
				
				
				
				
				jugones.add (usuario);
				
				System.out.println(usuario);
				
			}// fin de while
			return jugones;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return jugones;
		}
		finally{
			try{
				//conjuntoResultados.close();
				instruccion.close();
				//conexion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}
	}
	
	

}