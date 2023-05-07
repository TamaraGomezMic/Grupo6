package ar.edu.unlam.academia.grupo6;

import java.util.HashSet;

//ATRIBUTO 
//CONSTRUCTOR
//METODO

public class Academia {
	//ATRIBUTO 
	private String nombreDeLaAcademia;
	private HashSet<Curso>cursos;
	
	


	//CONSTRUCTOR
	public Academia(String nombreDeLaAcademia) {
		this.nombreDeLaAcademia = nombreDeLaAcademia;
		cursos = new HashSet<>();
		
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
}
