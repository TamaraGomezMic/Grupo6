package ar.edu.unlam.academia.grupo6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;

public class Alumno extends Persona{
//atributo

	private LocalDate fechaDelInscripcion;
	private LocalDate fechaDelFinalizacion;
	private String estado;
	private Integer asistencia;
	private Integer cantidadDeCursosInscripto;
//-------------------------------------------
	private Curso curso;
	private HashSet<Curso>cursos;
	private Integer claseExtraSolicitadas;
	private HashSet<ClaseExtra>clasesExtras;
//voy a tener q hacer una lista d eclases extra codigo y cantidad de classes,
//-------------------------------------------
	
	
	//constructor
	public Alumno(String legajo, Long dni, String nombre, Long celular, String email, String direccion, 
	LocalDate fechaDelInscripcion, LocalDate fechaDelFinalizacion, String estado) {
	super(legajo,dni, nombre,celular, email, direccion);
	this.fechaDelFinalizacion=fechaDelFinalizacion;
	this.fechaDelInscripcion=fechaDelInscripcion;
	this.cantidadDeCursosInscripto = 0;
	this.estado=estado;
	cursos = new HashSet<>();
	clasesExtras=new HashSet<>();
	this.claseExtraSolicitadas=0;
	}
	
	
	public Alumno() {
		super();
		
		
	}

//metodos



	public LocalDate getFechaDelInscripcion() {
		return fechaDelInscripcion;
	}


	public void setFechaDelInscripcion(LocalDate fechaDelInscripcion) {
		this.fechaDelInscripcion = fechaDelInscripcion;
	}


	public LocalDate getFechaDelFinalizacion() {
		return fechaDelFinalizacion;
	}


	public void setFechaDelFinalizacion(LocalDate fechaDelFinalizacion) {
		this.fechaDelFinalizacion = fechaDelFinalizacion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		//preguntar si se pone asi
		this.estado="activo";
		this.estado = estado;
	}
	
    public Integer getAsistencia() {
		return asistencia;
	}


	public void setAsistencia(Integer asistencia) {
		this.asistencia = asistencia;
	}


	public Integer getCantidadDeCursosInscripto() {
		return cantidadDeCursosInscripto;
	}


	public void setCantidadDeCursosInscripto(Integer cantidadDeCursosInscripto) {
		this.cantidadDeCursosInscripto = cantidadDeCursosInscripto;
	}

//--------------------------------------------------
	public void agregarUnCurso(String legajo) {
		if(this.getLegajo().equals(legajo)) {
			this.cantidadDeCursosInscripto +=1 ;
			
			//entrar a la lista de clases
		}
		
	}

//-------------------------------------------
	public void agregarUnCursoAlumno(Curso curso) {//para agregar un curso a un alumno
	cursos.add(curso);//a este alumno le agrego un curso
		
	}

//-------------------------------------------
	public Integer agregarUnaClaseExtraDeUnCursoDeUnAlumnoAUnaAcademia( Integer codigoCurso,
			Integer cantidadDeClasesExtra, String legajo) {
		Integer respuesta=0;
		
		for(Curso curso: cursos) {
			if(curso.getCodigoCurso().equals(codigoCurso)&&curso.mostrarALumno().getLegajo().equals(legajo)) {
				
				//AGREGE UNA CLASE EXTRA DE UN CURSO DETERMINADO AL ARRAY DE CLASES EXTRAS DEL ALUMNO
			  this.clasesExtras.add(new ClaseExtra(codigoCurso,cantidadDeClasesExtra ));
		       
				respuesta= this.cuantasClasesTiene(codigoCurso);

			
			}
		
		}
		return respuesta;
	}

//--------------------------------------------------------------------------
   public Integer cuantasClasesTiene(Integer codigoCurso) {
	   Integer totalDeClases=0;
	for(ClaseExtra claseExtra: clasesExtras) {
		if(claseExtra.getCodigoCurso().equals(codigoCurso)) {
			
		 totalDeClases=  duracionOriginalDelCurso(codigoCurso) + claseExtra.getClasesExtra();
		
		}
		//System.out.println(duracionOriginalDelCurso(codigoCurso));
		
	}
		return totalDeClases;

}
//--------------------------------------------------------------
//cree este metodo busca segun el codigo de curso cuantas clases tiene
private Integer duracionOriginalDelCurso(Integer codigoCurso) {
	for(Curso curso:cursos) {
		if(curso.getCodigoCurso().equals(codigoCurso)) {
			return curso.getDuracionCurso();
		}
	}
	return null;
}
//--------------------------------------------------

}
