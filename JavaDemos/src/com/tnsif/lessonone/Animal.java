package com.tnsif.lessonone;

 //abstract class
abstract class AAnimal
{
	// abstract method(does not have abody)
	public abstract void animalsSound();
	//regular method
	public void sleep()
	{
		System.out.println("Zzzzzz");
	}
}

//subclass (inherit from AAnimal
class Dog extends AAnimal
{
	public void animalsSound()
	{
		System.out.println("Boo ooo");
	}
}

public class Animal
{

	public static void main(String[] args)
	{
	    Dog obj =new Dog();
	    obj.animalsSound();
	    obj.sleep();

	}

}
