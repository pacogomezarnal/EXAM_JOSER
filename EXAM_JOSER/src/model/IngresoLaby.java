package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Cadete;
import model.ConexionDB;

//Clase que comprueba el codigo de entrada
public class IngresoLaby {


	//DEVOLVER Usuarios
	private static String Cadete_SEL="SELECT * FROM cadetes";
	
	
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
	
	
	
	public IngresoLaby() {
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

/*
	//CONSULTA A LA BASE DE DATOS
	private final static String CHECK_SEL="SELECT cod FROM cod WHERE id=";
	private final static String COD_COL="cod";
	
	//Conexion
	private Connection conexion = null;// maneja la conexió
	private Statement instruccion = null;
	private ResultSet conjuntoResultados = null;

	public IngresoLaby() {
		//Obtenemos la conexion de datos
		conexion=ConexionDB.getConexion();		
	}
	
	public String checkCod(int id,String apellido){
		try{
			String cod="";
			instruccion = this.conexion.createStatement();
			conjuntoResultados = instruccion.executeQuery(CHECK_SEL+String.valueOf(id));
			
			//Listaremos por pantalla los datos
			while(conjuntoResultados.next() ) {
				if(apellido.equals(conjuntoResultados.getString(COD_COL))) cod="CODIGO CORRECTO ENHORABUENA. LLAMA A TU INSTRUCTOR";
				else return cod="CODIGO INCORRECTO COMPRUEBA TODOS LOS PASOS";
			}// fin de while
			return cod;
		}
		catch( SQLException excepcionSql ) 
		{
			excepcionSql.printStackTrace();
			return "ERROR EN LA CONEXION. LLAMA A TU INSTRUCTOR";
		}
		finally{
			try{
				conjuntoResultados.close();
				instruccion.close();
			}
			catch( SQLException excepcionSql ) 
			{
				excepcionSql.printStackTrace();
			}
		}	
	}

}*/
