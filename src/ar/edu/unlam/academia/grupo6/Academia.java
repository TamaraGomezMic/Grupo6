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
	
	


	//CONSTRUCTOR
	public Academia(String nombreDeLaAcademia) {
		this.nombreDeLaAcademia = nombreDeLaAcademia;
		cursos = new HashSet<>();
		instructores = new HashSet<>();
		
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

}

