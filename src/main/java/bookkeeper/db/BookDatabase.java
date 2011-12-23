/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookkeeper.db;

import bookkeeper.model.Author;
import bookkeeper.model.Book;
import java.util.List;

/**
 *
 * @author haswell
 */
public interface BookDatabase {

	/**
	 * 
	 * @return the number of books in this database
	 */
	int size();


	/**
	 * Count the number of books associated with this author 
	 * @param author
	 * @return 
	 */

	int numberOfBooksByAuthor(Author author);

	
	void addBookForAuthor(Author author, Book book);

	List<Book> getBooksByAuthor(Author author);




	
}
