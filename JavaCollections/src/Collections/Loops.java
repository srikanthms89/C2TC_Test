package Collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Loops
{
	   void display(List<String> list)
	   {
		   Iterator<String> obj= list.listIterator();
		   
		   while(obj.hasNext())
		   {
			   System.out.println("Elements are :" +obj.next());
		   }
	   }

	public static void main(String[] args)
	{
            List<String> obj1 = new LinkedList<> ();
            obj1.add("aaa");
            obj1.add("bbb");
            obj1.add("jjj");
            obj1.add("kkk");
            obj1.add("ccc");   
            Loops obj2= new Loops();
            Collections.reverse(obj1);
            
            obj2.display(obj1);
           
            
	}

}
