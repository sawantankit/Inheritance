package org.ankit.java;

class A
{
	
void methodA() 
	{
	
	System.out.println("This is Method A");
}	
}

class B extends A
{

	void methodB() {
	
	System.out.println("This is Method B");
}	
}

class C extends A
{
	void methodC() {
	
	System.out.println("This is Method C");
}	
}

class D extends A
{
	void methodD()
{
System.out.println("This is Method D");
}
}

public class Hierarchical{
	public static void main(String args[]) {
	
	B obj1 = new B();
	obj1.methodB();
	obj1.methodA();
	
	C obj2 = new C();
	obj2.methodC();
	obj2.methodA();
	
	D obj3 = new D();
	obj3.methodD();
	obj3.methodA();
	}
	}
