package collections.sowmya;
import java.util.Iterator;
import java.util.LinkedList;
public class Linked{
   public static void main(String args[]){

     LinkedList<String> list=new LinkedList<String>();

     //Adding elements to the Linked list
     list.add("sowmya");
     list.add("shiva");
     list.add("arun");
     list.add("rachana");
     list.add("prashanthi");
     list.add("teju");
     list.add("vanaja");
     list.add("charan");
     list.add("prajyoth");
     list.add("santhosh");
     list.add("akhil");
     list.add(11,"laxmi");
 
     System.out.println(list);
    
     //using index print value
     System.out.println("LinkedList Elements :");
     int i = 0;
	while (list.size() > i) {
   	  System.out.println(list.get(i));
   	  i++;
         }
	
     
  //Adding an element to the first position
     list.addFirst("chintu");
     
     //Adding an element using position
    list.add(2, "vikas");
     list.add(5, "vilash");
   
//removing an element
     list.remove("swetha"); 
     list.remove("laxmi");  
     list.remove("santhosh");  
  
     //adding
     list.add(11,"chotu");
     list.add("rupak");
     System.out.println(list);
     
     //adding
     list.add(1,"sai charan");
     list.add(5,"vilash");
     list.add(7,"tinku");
     list.add(9,"vishal");
     System.out.println(list);
     //removing
     list.remove("charan"); 
     list.remove("arun");  
     list.remove("vanaja");  
     
     System.out.println(list);
     Iterator<String> iterator=list.iterator();
     while(iterator.hasNext()){
       System.out.println(iterator.next());
         }
   } 
}
	