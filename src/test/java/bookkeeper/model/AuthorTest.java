/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookkeeper.model;

import org.junit.Test;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 *
 * @author haswell
 */
public class AuthorTest {


	@Test
	public void ensureAuthorConstructedWithAFirstNameIsNamedThatName() {
		String anyFirstName = "Zoomer";
		Author a = new Author(anyFirstName, "Child");
		assertThat(a.getFirstName(), is(equalTo(anyFirstName)));
	}
	
}
