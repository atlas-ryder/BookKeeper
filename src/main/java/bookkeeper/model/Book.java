/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookkeeper.model;

import java.util.Date;

/**
 *
 * @author haswell
 */
public class Book {

	private final Author author;

	private final String title;

	private final Date publicationDate;

	private final int edition;

	public Book(Author author, String title, Date publicationDate, int edition) {
		this.author = author;
		this.title = title;
		this.publicationDate = publicationDate;
		this.edition = edition;
	}

	/**
	 * @return the author
	 */
	public Author getAuthor() {
		return author;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the publicationDate
	 */
	public Date getPublicationDate() {
		return publicationDate;
	}

	/**
	 * @return the edition
	 */
	public int getEdition() {
		return edition;
	}



	/**
	 * This method determines whether books are equal
	 * 
	 * This should be reflexive, (i.e. 
	 * given: Book b1 = //createBook
	 * b1.equals(b2) must be true
	 * 
	 * Symmetric: 
	 * given: Book b1, b2;
	 * b1 = //createBook
	 * b2 = //create same book as b1
	 * b1.equals(b2) must be true
	 * b2.equals(b1) must be true
	 * 
	 * And Transitive:
	 * given: Book b1, b2, b3 = //create same book
	 * if b1.equals(b2) is true
	 * and (b2.equals(b3)) is true
	 * then b1.equals(b3) must be true
	 * 
	 * 
	 * @param obj
	 * @return 
	 */


	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Book other = (Book) obj;
		if (this.author != other.author && (this.author == null || !this.author.equals(other.author))) {
			return false;
		}
		if ((this.title == null) ? (other.title != null) : !this.title.equals(other.title)) {
			return false;
		}
		if (this.publicationDate != other.publicationDate && (this.publicationDate == null || !this.publicationDate.equals(other.publicationDate))) {
			return false;
		}
		if (this.edition != other.edition) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 3;
		hash = 29 * hash + (this.author != null ? this.author.hashCode() : 0);
		hash = 29 * hash + (this.title != null ? this.title.hashCode() : 0);
		hash = 29 * hash + (this.publicationDate != null ? this.publicationDate.hashCode() : 0);
		hash = 29 * hash + this.edition;
		return hash;
	}

	
}
