package desafioBibliotecaShaulin;

import java.util.ArrayList;
import java.util.List;

public class Services{
	private List<Book> books;
	private List<Student> students;

	//Contrutor
	public Services(List<Book> books, List<Student> students) {
		this.books = new ArrayList<>();
		this.students = new ArrayList<>();
	}

	//Books
	public void registerBook(Book book) {
		books.add(book);
	}
	
	public void ShowBook() {
		for( Book book: books) {
			if (book.isavailable() == true) {
			System.out.println("Livros disponiveis: " + book.getTitle() + " | id do livro: " + book.getId());
		}else {
		System.out.println("Livros indisponiveis: " + book.getTitle() + " | id do livro: " + book.getId());	
		}
	}			
}	
	
	//Students
	public void registerStudent(Student student) {
		students.add(student);
	}
	
	public void showStudent() {
		for( Student student: students) {
			System.out.println(student);
		}
	}
	
	//lends
	public void lendBooks(int id){	
		Book student = books.get(id);
		if (student.isavailable() == true) {
			System.out.println("livro disponivel, emprestimo autorizado");
			student.setavailable(false);
		}else{
			System.out.println("livro indisponivel, emprestimo negado");
		}
	}
	public void returnBooks(int id) {
		Book student = books.get(id);
		if (student.isavailable() == false) {
			System.out.println("livro devolvido, volte sempre!");
			student.setavailable(true);
		}else{
			System.out.println("livro errado ou este livro já foi devolvido");
		}
	}
}
	

