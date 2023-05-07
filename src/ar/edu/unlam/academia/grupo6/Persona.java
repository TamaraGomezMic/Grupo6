package ar.edu.unlam.academia.grupo6;

public abstract class Persona {

	
	//ATRIBUTOS
	private Long dni;
	private Integer codigo;
	private String nombre;
	private Long celular;
	private String email;
	private String direccion;
	
	
	
	//CONSTRUCTOR
	public Persona(Long dni, Integer codigo, String nombre, Long celular, String email, String direccion) {
		this.dni=dni;
		this.codigo=codigo;
		this.nombre=nombre;
		this.celular=celular;
		this.direccion=direccion;
		this.email=email;
	}



	public Long getDni() {
		return dni;
	}



	public void setDni(Long dni) {
		this.dni = dni;
	}



	public Integer getCodigo() {
		return codigo;
	}



	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Long getCelular() {
		return celular;
	}



	public void setCelular(Long celular) {
		this.celular = celular;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDireccion() {
		return direccion;
	}



	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	//METODO
}
