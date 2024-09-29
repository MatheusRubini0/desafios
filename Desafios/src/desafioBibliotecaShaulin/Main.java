package desafioBibliotecaShaulin;


public class Main {

	public static void main(String[] args) {
		Services service = new Services(null, null);
		
		service.registerBook(new Book(1, "pequeno Principe", "Antoine de Saint-Exupéry", true)); //id, livro, autor, disponibilidade
		service.registerBook(new Book(2, "A Arte da Guerra", "Sunzi Suanjing", false)); //id, livro, autor, disponibilidade
		
		service.ShowBook();
		
		service.registerStudent(new Student("Joao", "literatura")); //estudante, curso
		
		service.showStudent();
	
		service.lendBooks(1);//emprestar livro 
		
		service.returnBooks(0); // retornar livro
	}

}