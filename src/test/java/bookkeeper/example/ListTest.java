/**
 * A package is a location by which you can group classes with related functionality.
 * A package corresponds to a directory; for example,
 * bookkeeper.example corresponds to <package root>/bookkeeper/example
 * 
 * Any class within a package directory must declare itself as a member of that package
 * via a declaration like this.  
 * 
 * Before a class may be used by another class, the class must be imported from its package.
 * Packages may be imported from beneath their level, e.g.:
 * //in bookkeeper.example
 * package bookkeeper.example;
 * public class BookKeeperOtherStuffConsumer {
 *    OtherStuff stuff = new OtherStuff(); // This uses OtherStuff, declared below
 * 
 * }
 * //in bookkeeper.example.otherstuff
 * package bookkeeper.example.otherstuff;
 * public class OtherStuff {
 * }
 * 
 * 
 * 
 * 
 */

package bookkeeper.example;

/**
 *  Packages beginning with java or javax are typically a part of the core libraries
 *  (Java Development Kit, or JDK)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Packages beginning with something else are typically added as dependencies.
 * org.junit.* and org.hamcrest.* are resolved from the junit dependency declared
 * in pom.xml
 */


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
/**
 * import static <etc> just means that any static member should be imported from the specified
 * <i>class</i>.  Note that static imports are applied to classes, which regular imports
 * are applied to packages
 */
/**
 *
 * @author haswell
 */
public class ListTest {

	public void ensureListAddIncrementsSize() {
		List list = listOf();
		//assertThat is declared in org.junit.Assert.assertThat
		//is(), equalTo() are both declared in org.hamcrest.CoreMatchers.*

		assertThat(list.size(), is(equalTo(0))); //With static imports, this line is equivalent to:
		org.junit.Assert.assertThat(list.size(), org.hamcrest.CoreMatchers.is(org.hamcrest.CoreMatchers.equalTo(0))); //Pretty ugly, eh?
	}

	private <T> List<T> listOf(T...items) {
		return new ArrayList<T>(Arrays.asList(items));
	}
	
}
