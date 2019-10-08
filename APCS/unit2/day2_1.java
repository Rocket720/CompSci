public class day2_1{
    public static void main(String[] args){
        Dog d1 = new Dog();
      	Dog d2 = new Dog("Butch","Golden Retreiver");
      	Dog d3 = new Dog("Shaggy","Boxer",11,44,70);
      	d1.name = "Spot";
      	d1.breed = "Poodle";
      	d2.age = 5;
      	d1.age = 7;
      	d2.fetch = true;
      	System.out.println("We have "+Dog.numDogs+" dogs.");
      	System.out.println(d3.name+" is a "+d3.breed+". "+d3.name+" is "+d3.age+" years old, is "+d3.height+" inches tall and weighs "+d3.weight+" pounds.");
      	System.out.println("True or false? "+d2.name+" is old.");
      	System.out.println(d2.isOld()); //isOld() is a method
      	System.out.println("How old is "+d1.name+"?");
      	System.out.println(d1.name+" is "+d1.age+".");
      	System.out.println("True or false? "+d2.name+" fetches.");
      	System.out.println(d2.fetch);
      	System.out.println("True or false? "+d3.name+" fetches.");
      	System.out.println(d3.fetch);

    }
}

class Dog{
 	String name = "";
 	String breed = "";
 	int height = 0;
 	int weight = 0;
 	int age = 0;
 	boolean fetch = false;
 	static int numDogs = 0;
 	
 	Dog(){
      	numDogs++;
 	}
 	
 	Dog(String n, String b)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
 	}
 	Dog(String n, String b, int a)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
      	age = a;
 	}
 	Dog(String n, String b, int a, int h, int w)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
      	age = a;
      	height = h;
      	weight = w;
 	}
 	boolean isOld()
 	{
      	if (age>=10)
          	return true;
      	else
          	return false;
 	}
 
 	
}

 
public class Dog
{
 	String name = "";
 	String breed = "";
 	int height = 0;
 	int weight = 0;
 	int age = 0;
 	boolean fetch = false;
 	static int numDogs = 0;
 	
 	Dog()
 	{
      	numDogs++;
 	}
 	
 	Dog(String n, String b)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
 	}
 	Dog(String n, String b, int a)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
      	age = a;
 	}
 	Dog(String n, String b, int a, int h, int w)
 	{
      	numDogs++;
      	name = n;
      	breed = b;
      	age = a;
      	height = h;
      	weight = w;
 	}
 	boolean isOld()
 	{
      	if (age>=10)
          	return true;
      	else
          	return false;
 	}
 
 	
}
