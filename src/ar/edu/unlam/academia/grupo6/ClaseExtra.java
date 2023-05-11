package ar.edu.unlam.academia.grupo6;

import java.util.Objects;

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
		ClaseExtra other = (ClaseExtra) obj;
		return Objects.equals(codigoCurso, other.codigoCurso);
	}

//esta clase es para instanciar clases extra dentro del alumno

}
