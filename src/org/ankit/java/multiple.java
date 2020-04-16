package org.ankit.java;


class Parent {
void gajanan()
{
System.out.println("This is a Parent Class");
}
	
}

class Son extends Parent {
void sharad()
{
System.out.println("This is a Chil Class");
}
}

class Grandson extends Son {
void ankit()
{
System.out.println("This is a GrandChild Class");
}
}





public class multiple {

	public static void main(String[] args) {
	
	Grandson g = new Grandson();
	g.ankit();
	g.sharad();
	g.gajanan();

	}

}
