import java.util.Scanner;

public class Student {
    private int idNum;
    public double gpa;
    private Address myAddress;

    public Student(int id, double g, String name, String street, String city, String state, String zip) {
        idNum = id;
        gpa = g;
        myAddress = new Address(name, street, city, state, zip);
    }
    //accessors
    public Address getAddress()
    { return myAddress; }
    public int getIdNum()
    { return idNum; }
    public double getGpa()
    { return gpa; }

    public void show() {
        System.out.print(idNum);
        System.out.print(gpa);
        System.out.print(myAddress.getName());
        System.out.print(myAddress.getStreet());
        System.out.print(myAddress.getCity());
        System.out.print(myAddress.getState());
        System.out.print(myAddress.getZip());
        System.out.print('\n');
    }

    public static void averageGpa(Student[] studentArray)
    {
        double total = 0;
        for (int i = 0; i < studentArray.length; i++) {
            total += studentArray[i].getGpa();
        }
        System.out.println(total / 10);

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Student[] studentArray = new Student[10];

		studentArray[0] = new Student(10000, 3.10, "Alice ", "Ant street", "Holy city ", "New York state ", "01234");
		studentArray[1] = new Student(20000, 3.20, "Brian ", "Bread street", "Sand city ", "Minnesota state ", "10983");
		studentArray[2] = new Student(30000, 3.30, "Cody ", "Cat street ", "Crowd city ", "Idaho state ", "23095");
		studentArray[3] = new Student(40000, 3.40, "Don ", "Dog street ", "Buffalo city ", "Alaska state ", "37561");
		studentArray[4] = new Student(50000, 3.50, "Enrique ", "Elephant street ", "Cringe city ", "Florida state ", "49100");
		studentArray[5] = new Student(60000, 3.60, "Frank ", "Fairy street ", "Floor city ", "Virginia state ", "50023");
		studentArray[6] = new Student(70000, 3.70, "Grant ", "Ground street ", "Kennel city ", "Kentucky state ", "64237");
		studentArray[7] = new Student(80000, 3.80, "Henry ", "Hawk street ", "Tree city ", "Washington state ", "72045");
		studentArray[8] = new Student(90000, 3.90, "Ian ", "Igloo street ", "Mac city ", "Arizona state ", "81542");
		studentArray[9] = new Student(100000, 4.00, "Amar ", "Dragon street ", "Union City ", "California ", "94587");
		Student.averageGpa(studentArray);
		for (Student st : studentArray) {
			st.show();
		}

        double total = 0;
        for (Student s : studentArray) {
            s.gpa = scan.nextDouble();
        }

        System.out.print("Which student's gpa would you like to see?: ");
        int a = scan.nextInt();
        System.out.println(studentArray[a].gpa);
        Student.averageGpa(studentArray);
    }


}
