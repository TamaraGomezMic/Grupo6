package ar.edu.unlam.academia.grupo6;

public class ClaseExtra {
private Integer clasesExtra;
private Integer codigoCurso;


public ClaseExtra(Integer codigoCurso, Integer clasesExtra) {
	this.clasesExtra = clasesExtra;
	this.codigoCurso = codigoCurso;
}

public Integer getClasesExtra() {
	return clasesExtra;
}

public Integer getCodigoCurso() {
	return codigoCurso;
}

//esta clase es para instanciar clases extra dentro del alumno



}
