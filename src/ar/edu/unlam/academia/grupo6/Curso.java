package ar.edu.unlam.academia.grupo6;

import java.util.HashSet;
import java.util.Objects;

public class Curso {

	//ATRIBUTOS
	private Integer codigoCurso;
	private String tipoDeCurso;
	private final Integer VIGENCIA_DEL_CURSO = 31;
	private Integer duracionCurso;
	private Double valorCuota;
	private final Double VALOR_CLASE_EXTRA=1000.0;
	private Integer claseExtra=0;
	
	//CONSTRUCTORES
	public Curso(Integer codigoCurso, String tipoDeCurso, Integer duracionCurso,
			Double valorCuota) {
		
		this.codigoCurso = codigoCurso;
		this.duracionCurso = duracionCurso;
		this.tipoDeCurso = tipoDeCurso;
		this.valorCuota = valorCuota;
		
	
	}

	
	//METODOS

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

	public Integer getVigenciaCurso() {
		return VIGENCIA_DEL_CURSO;
	}

	public Integer getDuracionCurso() {
		return duracionCurso;
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
	

	public Integer getVIGENCIA_DEL_CURSO() {
		return VIGENCIA_DEL_CURSO;
	}

	public Double getVALOR_CLASE_EXTRA() {
		return VALOR_CLASE_EXTRA;
	}



	
//ver q pasa si las clases ya empiezan con clase extra cero==>
	public Integer getClaseExtra() {
		return claseExtra;
		//puse el cero arriba en el atributo 
	}

	public void setClaseExtra(Integer cantidadDeClasesExtra) {
		this.claseExtra = cantidadDeClasesExtra;
	}
	
	

	public Integer queSePuedaAgregarUnaClaseExtraAlCurso(Integer cantidadDeClasesExtra) {
		Integer respuesta;    
		 	    
		    this.setClaseExtra(cantidadDeClasesExtra);
		    respuesta=this.getClaseExtra();
		  // System.out.println(this.getClaseExtra());
		    
		 
		return respuesta;

	}
	public void adicionarClaseExtra(Integer agregarClaseExtra) {

		Integer totalHoras=this.getDuracionCurso()+agregarClaseExtra;
         this.setDuracionCurso(totalHoras);	

		
	}

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

}
