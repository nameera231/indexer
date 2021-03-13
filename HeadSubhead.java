import java.io.*;
import java.util.*;
/**
 *  a generic class that 
 * represents the heading and sub-heading of a book index.
 * Any two objects of this class need to be Comparable.
 * Note that comparing two objects of this class requires 
 * that HeadType and SubheadType are Comparable too.
 */
public class HeadSubhead<HeadType extends Comparable<HeadType>, SubheadType extends Comparable<SubheadType>> implements Comparable<HeadSubhead<HeadType,SubheadType>>{

	/**
	 * 
	 */
	HeadType h;
	SubheadType s;
	
	
	/**
	 * a method that sets fields.
	 * @param head heading of an entry
	 * @param subhead sub-heading of an entry
	 */
     public void set(HeadType head, SubheadType subhead) {
    	 this.h = head;
    	 this.s = subhead;
     }
	
	/**
	 * a method that returns
	 * the heading.
	 * @return heading
	 */
     
     public HeadType getHead( ) {    	 
    	 return this.h;
     }
	
	/**
	 * a method that returns
	 * the sub-heading.
	 * @return sub-heading
	 */
     public SubheadType getSubHead( ) {    	 
    	 return this.s;
     }     
     
	
	/**
	 *  a method that compares two 
	 * objects of the HeadSubhead class.
	 * This method overrides the compareTo method.
	 * @param an instance of the HeadSubhead class
	 * @return an integer that indicates if 
	 * this object is alphabetically smaller, 
	 * larger, or equal to the object passed into
	 * the method.  
	 */
     
     // first compare headtype
     @Override
     public int compareTo(HeadSubhead<HeadType,SubheadType> obj)
     {
    	 if (this.getHead().compareTo(obj.getHead()) == 0)
    	 {
    		 if(this.getSubHead().compareTo(obj.getSubHead())==0)
    		 {
    			 return 0;
    		 }
    		 else if(this.getSubHead().compareTo(obj.getSubHead())> 0)
    		 {
    			 return 1;
    		 }
    		 else 
    		 {
    			 return -1;
    		 }
    	 }
    	 else if(this.getHead().compareTo(obj.getHead())> 0)
    			 {
    		 return 1;
    			 }
    	 else 
    	 {
    		 return -1;
    	 }}
 
}
