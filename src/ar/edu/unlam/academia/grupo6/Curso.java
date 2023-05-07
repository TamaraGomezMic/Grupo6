package ar.edu.unlam.academia.grupo6;

public class Curso {
	//ATRIBUTOS
	private Integer codigoCurso;
	private String tipoDeCurso;
	private final Integer VIGENCIA_DEL_CURSO = 31;
	private Integer duracionCurso;
	private Double valorCuota;
	private Double valorClaseExtra;
	
	//CONSTRUCTORES
	
	public Curso(Integer codigoCurso, String tipoDeCurso, Integer duracionCurso,
			Double valorCuota, Double valorClaseExtra) {
		
		this.codigoCurso = codigoCurso;
		this.duracionCurso = codigoCurso;
		this.tipoDeCurso = tipoDeCurso;
		this.valorClaseExtra = valorClaseExtra;
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

	public Double getValorClaseExtra() {
		return valorClaseExtra;
	}

	public void setValorClaseExtra(Double valorClaseExtra) {
		this.valorClaseExtra = valorClaseExtra;
	}



}
