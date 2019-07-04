package control;

import java.util.Scanner;

import model.Aluno;
import model.Curso;
import model.Professor;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Aluno aluno = new Aluno();
		Professor professor = new Professor();

		System.out.println("Digite a matricula do aluno: ");
		String matricula = leia.nextLine();

		System.out.println("Digite o CPF do professor: ");
		String cpf = leia.nextLine();

		professor.setCPF(cpf);

		System.out.println(professor.getCPF());

		aluno.setMatricula(matricula);

		System.out.println(aluno.getMatricula());

		System.out.println("Digite o nome do curso: ");
		String curso = leia.nextLine();

		System.out.println("Digite a carga horaria: ");
		double cargaHoraria = leia.nextDouble();

		Curso curso1 = new Curso();

		curso1.setNome(curso);
		curso1.setCargaHoraria(cargaHoraria);

		professor.addCurso(curso1);
		for (Curso e : professor.getListaCurso()) {
			System.out.println("Nome do curso: " + e.getNome());
			
		}
		
		aluno.addCurso(curso1);
		
		for (Curso e : aluno.getListaCurso()) {
		System.out.println("Nome do curso: " + e.getNome());
		
	
		}
		
	}

}
