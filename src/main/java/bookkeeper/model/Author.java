/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookkeeper.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author haswell
 */
public class Author {
	private final List<Book> books;

	private final String firstName;
	private final String lastName;


	private Author(List<Book> books, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.books = books;
	}

	public Author(String firstName, String lastName) {
		this(new ArrayList<Book>(), firstName, lastName);
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	
	public boolean authoredBook(Book book) {
		return true;
	}



	public void addBook(Book book) {
	}

	public List<Book> getBooks() {
		return Collections.unmodifiableList(books);
	}

	public int getNumberOfBooksAuthored() {
		return books.size();
	}

	
	
}
