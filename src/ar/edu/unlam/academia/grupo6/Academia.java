package ar.edu.unlam.academia.grupo6;

import java.util.HashSet;

//ATRIBUTO 
//CONSTRUCTOR
//METODO

public class Academia {
	//ATRIBUTO 
	private String nombreDeLaAcademia;
	private HashSet<Curso>cursos;
	private HashSet<Instructor>instructores;
	private HashSet<Alumno>alumnos;
// esta clase contendria al instructor asignado y a los alumnos que se hayan ingresado al curso 
	//private List<Clase>clases;
	
	


	//CONSTRUCTOR
	public Academia(String nombreDeLaAcademia) {
		this.nombreDeLaAcademia = nombreDeLaAcademia;
		cursos = new HashSet<>();
		instructores = new HashSet<>();
		alumnos =new HashSet<>();
		
	}
	//METODO




	public String getNombreDeLaAcademia() {
		return nombreDeLaAcademia;
	}




	public void setNombreDeLaAcademia(String nombreDeLaAcademia) {
		this.nombreDeLaAcademia = nombreDeLaAcademia;
	}




	public HashSet<Curso> getCursos() {
		return cursos;
	}




	public void setCursos(HashSet<Curso> cursos) {
		this.cursos = cursos;
	}




	public Boolean IngrasarCursoEnLaAcademia(Curso nombreDelCurso) {
		return cursos.add(nombreDelCurso);
	}


	

	public Boolean registrarInstructorEnAcademia(Instructor nuevoInstructor) {
		boolean seRegistro= instructores.add(nuevoInstructor);
	//	System.out.println(instructores.size());
		return seRegistro;
	}




	public Boolean ingresarAlumnoALaAcademia(Alumno nuevoAlumno) {
		boolean seRegistro= alumnos.add(nuevoAlumno);

			return seRegistro;
	}




	public Boolean agregarUnaClaseExtraAUnCursoAUnaAcademia(Integer agregarClaseExtra,Integer codigoDelCurso) {
		Boolean sePudo=false ;
		for(Curso curso: cursos) {
			if(curso.getCodigoCurso().equals(codigoDelCurso)) {
			curso.adicionarClaseExtra(agregarClaseExtra);
			sePudo=true;
			
			}
			
		}
		return sePudo;
	}




	public Integer mostrarLaCantidadDeHorasDelCursoActualizado(Integer agregarClaseExtra, Integer codigoCurso) {
	Integer respuesta=0;
		for(Curso curso: cursos) {
			if(curso.getCodigoCurso().equals(codigoCurso)) {
			respuesta=curso.getDuracionCurso();
					
			}
			
		}
		return respuesta;
	}




	public Alumno buscarAlumnoPorLegajo(String legajo) {
		
		for(Alumno alumno:alumnos) {
			if(alumno.getLegajo().equals(legajo)) {
				return alumno;
			}
		}
		return null;
	}



/*
	public Boolean AgregoAlumnoAlCurso(Curso manejoInical, Alumno nuevoAlumno) {
		
		
		
		
		
		return null;
	}
*/
}

