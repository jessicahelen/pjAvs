package model;

import java.util.ArrayList;

public class Aluno extends Pessoa {
	private String matricula;
	private ArrayList<Curso> listaCurso = new ArrayList<Curso>();

	public Aluno() {
		super();

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(ArrayList<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}
	
	public void addCurso(Curso novoCurso) {
		listaCurso.add(novoCurso);
	}
}

