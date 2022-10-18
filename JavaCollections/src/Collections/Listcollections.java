package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listcollections
{

	public static void main(String[] args)
	{
		List<String> obj =new LinkedList<>();
		
       
        obj.add("India");
        obj.add("USA");
        obj.add("Uk");
        obj.add("nepal");
        obj.add("srilanka");
    
     
        
        System.out.println( obj.indexOf("nepal"));
       System.out.println(obj);
        
        List<String> obj1=new ArrayList<>();
        obj1.add("India");
        obj1.add("USA");
        obj1.add("Uk");
        System.out.println(obj1);
         
         obj1.add(1, "Nepal");
         System.out.println(obj1);
        
         obj1.remove(1);
    
        System.out.println(obj1);
        obj1.remove("Uk");
        System.out.println(obj1);
        
    }
}
