class House{

String address;
String color;
double area;

void opendoor(){
System.out.println("open door");
}

void closedoor(){
System.out.println("close door");  
}

public static void main(String [] args)
{
 House obj = new House ();
 obj.opendoor();
 obj.closedoor();
}
}

/*
  Object: is a bundle of data and its behaviour(often known as methods).

Objects have two characteristics: They have states and behaviors.

Examples of states and behaviors
Example 1:
Object: House
State: Address, Color, Area
Behavior: Open door, close door

*/
