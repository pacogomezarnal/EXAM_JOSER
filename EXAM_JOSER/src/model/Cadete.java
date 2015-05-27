package model;

//Clase que almacenará todos los datos de un cadete
public class Cadete {
	
	
	//Propiedades
	
	private String nombre="";
	private int id=0;
	private String apellidos="";
	private int edad=0; 
	private String nacionalidad="";
	private int equipo=0; 

	//Constructores

	
	public Cadete(String nombre, int id, String apellidos, int edad, String nacionalidad, int equipo) {
		
		
		this.nombre=nombre;
		this.id=id;
		this.apellidos=apellidos;
		this.edad=edad;
		this.nacionalidad=nacionalidad;
		this.equipo=equipo;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEquipo() {
		return equipo;
	}

	public void setEquipo(int equipo) {
		this.equipo = equipo;
		
	}
	
	
	
	public String toString(){
		return this.nombre;
	}
	
	
	
}





