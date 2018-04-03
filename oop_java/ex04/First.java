
class First {

	First(String name, int number){
		System.out.println("Number method in Second class is called");
		System.out.println("Method Hello in FirstClass is called");
		Hello(name);
	}

	void Hello(String  name, int number){
		System.out.println("Hello ," + name + " your number is " + number);
	}

	public static void main(String args[])
	{
		First one = new First(name, number);
		Second two = new Second(name, number);		
	}
}