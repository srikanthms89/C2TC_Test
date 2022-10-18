package Collections;


import java.util.LinkedList;
//import java.util.Queue;

public class App
{

	public static void main(String[] args)
	{
		
		LinkedList<String> obj =new LinkedList<>();
		obj.add("India");
		obj.add("USA");
		obj.add("Uk");
		obj.add("Nepal");
		obj.add("Russia");
		System.out.println(obj);
		//modify
		obj.set(1, "Austrlia");
		System.out.println(obj);
		//delete
		obj.poll();
		System.out.println(obj);
       obj.addFirst("India");
       obj.addLast("Srilanka");
       System.out.println(obj);
		
	}

}