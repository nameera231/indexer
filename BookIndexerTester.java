import java.io.*;
import java.util.Iterator;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BookIndexerTester {
	
    /**
     * 

     * 1. Create an object of the BookIndexer class.
     * 2. Call the compileIndex method. Pass to this
     * method the name of a file that contains notes.
     * 3. Call the displayCompiledIndex method.
     * @throws FileNotFoundException 
     */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader(args[0]));
		BookIndexer bi = new BookIndexer();
		bi.compileIndex(sc);
		bi.displayCompiledIndex();
		
	



		
	}

}
