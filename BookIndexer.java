import java.util.*;

 

/**
 * BookIndexer class builds and display 
 * the index of notes.
 * Note that this class is not generic
 * and does not use generic constructs
 * in its body.
 */
public class BookIndexer {
	/**
	 * This field 
	 * is an object of a built-in class. 
	 * It maps heading/sub-heading pairs 
	 * to page numbers. 
	 * Note that heading and sub-heading 
	 * are Strings. Page numbers are 
	 * Integers. 
	 */
	Map<HeadSubhead<String,String>, TreeSet<Integer>> index;


	
	/**
	 * TODO: complete the constructor that 
	 * initializes the field described above.
	 */
	public BookIndexer( ) {	
		this.index = new TreeMap<HeadSubhead<String,String>, TreeSet<Integer>>();
	
	}
	
	/**
	 * a method that reads through notes
	 * and builds an index
	 * @param sc a Scanner object for reading from a file 
	 * containing notes.
	 */
	public void compileIndex( Scanner sc ) {
		// main sc = new Scanner(new FileReader(args[0]))
	  /* hs stores a heading and sub-heading pair.
	   * For every line of file with the correct structure, 
	   * create a new object of the HeadSubhead class. 
	   * */
		
		while(sc.hasNextLine())
		{
			HeadSubhead<String, String> hs = new HeadSubhead<String,String>();
			String test = sc.nextLine();
			if(!test.contains(":"))
			{
				System.err.print("incorrect syntax: scanned line does not contain a :");
			}
			else if (test.charAt(0) > 90)
			{
				System.err.print("incorrect syntax: scanned line does not contain heading beginning with uppercase letter");
			}
			else
			{
			String[] vals = test.split(":");
			int page = Integer.parseInt(vals[0]);
		 if (vals[1].contains("/"))
		 {
			
			 String[] vals2 = vals[1].trim().split("/");
			 if(vals2[1].charAt(0) < 90 )
			 {
				 System.err.print("incorrect syntax: scanned line does not contain subheading beginning with lowercase letter");
				}
			 else {
			 hs.set(vals2[0], vals2[1]); 
			 }
		 }
		 else
		 {
			 hs.set(vals[1].trim(), "");
			 
		 }
		 if (this.index.containsKey(hs))
		 {
			this.index.get(hs).add(page);
			
		 }
		 else {
			 
		 TreeSet<Integer> ts = new TreeSet<Integer>();
		 ts.add(page);
	     this.index.put(hs,ts );
		 }}}
		
		
	  
	}
	
	/**
	 * a method that displays an index
	 * to the standard output as shown in the description
	 * of the assignment.
	 */	
	
	public String pagePrinter(TreeSet<Integer> pages)
	{
		String all = new String();
		Iterator<Integer> pgs = pages.iterator();
		for(int i =0 ; i < pages.size() ; i++)
		{
			all = all + ", " + pgs.next();
		}
		return all;
	}
	public void displayCompiledIndex(  ) {
		String prev = new String();
		for (Map.Entry<HeadSubhead<String,String>, TreeSet<Integer>> entry:this.index.entrySet()) {

			if( !entry.getKey().getHead().equals(prev) && !entry.getKey().getSubHead().equals("") )
			{

				System.out.println(entry.getKey().getHead());
				System.out.println("       "+  entry.getKey().getSubHead() + ""+ pagePrinter(entry.getValue()));
			}
			else if (!entry.getKey().getHead().equals(prev))
			{

				System.out.println( entry.getKey().getHead()+""+ pagePrinter(entry.getValue()));
			}
			else
			{

				System.out.println("       " +  entry.getKey().getSubHead() + ""+ pagePrinter(entry.getValue()));
			}
			prev = entry.getKey().getHead();




		}
	}}
		
		
			

