package ar.edu.unlam.academia.grupo6;

import java.util.HashSet;
import java.util.Objects;

public class Curso {

	// ATRIBUTOS
	private Integer codigoCurso;
	private String tipoDeCurso;
	private Integer vigenciaCurso;
	private Integer duracionCurso;
	private Double valorCuota;
	private final Double VALOR_CLASE_EXTRA = 1000.0;
	private Instructor instructor;
	private Alumno alumno;
	private HashSet<Alumno> alumnos;
	private HashSet<Instructor> instructores;

	// CONSTRUCTORES
	public Curso(Integer codigoCurso, String tipoDeCurso, Integer duracionCurso, Double valorCuota) {
		this.codigoCurso = codigoCurso;
		this.duracionCurso = duracionCurso;
		this.tipoDeCurso = tipoDeCurso;
		this.valorCuota = valorCuota;
		this.vigenciaCurso = 31;

	}

	// METODOS

	public Integer getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getTipoDeCurso() {
		return tipoDeCurso;
	}

	public void setTipoDeCurso(String tipoDeCurso) {
		this.tipoDeCurso = tipoDeCurso;
	}

	public Integer getDuracionCurso() {
		return this.duracionCurso;
	}

	public void setDuracionCurso(Integer duracionCurso) {
		this.duracionCurso = duracionCurso;
	}

	public Double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(Double valorCuota) {
		this.valorCuota = valorCuota;
	}

	public Double getVALOR_CLASE_EXTRA() {
		return VALOR_CLASE_EXTRA;
	}

//ver q pasa si las clases ya empiezan con clase extra cero==>

//_--------------------------------------------

	/*
	 * public Integer queSePuedaAgregarUnaClaseExtraAlCurso(Integer
	 * cantidadDeClasesExtra) { Integer respuesta;
	 * 
	 * this.adicionarClaseExtra(cantidadDeClasesExtra);
	 * respuesta=this.mostrasAdicion();
	 * 
	 * 
	 * 
	 * return respuesta;
	 * 
	 * }
	 */
//----------------------------------------------------	
	public void adicionarClaseExtra(Integer agregarClaseExtra) {

		Integer totalClases = this.getDuracionCurso() + agregarClaseExtra;
		this.agregarClaseExtra(totalClases); // no uso set porqe modifico todo el codigo

	}

//-----------------------------	
	private void agregarClaseExtra(Integer totalClases) {
		this.duracionCurso = totalClases;
	}

	private Integer mostrasAdicion() {
		return this.duracionCurso;
	}
//------------------------

	// --------------------------------------------

	// este es como un set
	public void agregaUnALumno(Alumno nuevoAlumno) {
		this.alumno = nuevoAlumno;
		// this.alumnos.add(nuevoAlumno);

	}

	// este es como un get del set de arriba
	/*
	 * public Alumno mostrarALumno() { return alumno; }
	 */
	public Alumno mostrarALumno() {

		return alumno;
	}

//----------------------------------------	

	@Override
	public int hashCode() {
		return Objects.hash(codigoCurso);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(codigoCurso, other.codigoCurso);
	}

	public void agregarUnInstructor(Instructor instructor2) {
		this.instructor = instructor2;

	}

	public Instructor mostrarInstructor() {
		return instructor;
	}

	public Integer getVigenciaCurso() {
		return vigenciaCurso;
	}

	public void setVigenciaCurso(Integer vigenciaCurso) {
		this.vigenciaCurso = vigenciaCurso;
	}

}
