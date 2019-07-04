package model;

import java.util.ArrayList;

public class Professor extends Pessoa {
	private String CPF;
	ArrayList<Curso> listaCurso = new ArrayList<Curso>();

	public Professor() {
		super();
		
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public ArrayList<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(ArrayList<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}
	
	public void addCurso(Curso curso) {
		listaCurso.add(curso);
		
	}
}
