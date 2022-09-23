package com.tnsif.lessonone;

abstract class BBangalore_rules
{
		abstract void speedlimit();
		abstract void rashdriving();
		abstract  void rule3();
		void electricity()
		{
			System.out.println("No fine ");
		}
		void slow_Moving()
		{
			System.out.println("No fine for slow moving ");
		}
}
class Sseltos extends BBangalore_rules
{
   void speedlimit()
   {
	   System.out.println("is 80 "); 
   }
   void rule3()
   {
	   System.out.println("rule 3  "); 
   }
	void electricity()
	{
		System.out.println("No fine ");
	}
	 void rashdriving()
		{
			System.out.println("Alarm alert");
		}
	}
public class FirstProgram {

	public static void main(String[] args) {
		
		Sseltos obj =new Sseltos();
		obj.electricity();
		obj.rashdriving();
		obj.rule3();
		obj.speedlimit();

	}

}
