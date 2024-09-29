package desafioBibliotecaShaulin;

import java.util.Objects;

public class Student{
	
	private String name;
	private String matricula;

	public Student(String name, String matricula) {
		this.name = name;
		this.matricula = matricula;
	}
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Student: [nome=" + name + ", matricula=" + matricula + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(matricula, other.matricula) && Objects.equals(name, other.name);
	}
	
	
}
