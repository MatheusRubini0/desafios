package desafioBibliotecaShaulin;

import java.util.Objects;

public class Book {
	
	public int id;
	private String title;
	private String author;
	private boolean available = true;
	
	

	public Book() {
	}

	public Book(int id, String title, String author, boolean available) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.available = available;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public boolean isavailable() {
		return available;
	}
	public void setavailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "Book: [Id=" + id + ", title=" + title + ", author=" + author + ", available=" + available + "] \n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, available, id, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && available == other.available && id == other.id
				&& Objects.equals(title, other.title);
	}
	
	
	
}
