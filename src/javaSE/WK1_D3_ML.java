package javaSE;
/*
 * Create a Computer class that has 3 variables. The first variable will have a name. 
 * The second variable will be the year of the computer. 
 * Last the final variable will be the cost of the computer. 
 * All 3 variable will be private fields and must use getters to retrieve the data 
 * and setters to set the variables.*/

public class WK1_D3_ML {
//Note:- WK1_D3_ML is a Computer class
	private String name;
	private int year;
	private double price;
		//constructor 
	    public WK1_D3_ML(String name,int year,double price) {
		this.name = name;
		this.year = year;
		this.price = price;
	}
	//using getters and setters since attributes are private	
	public String getName() {
		return this.name;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args) {
		WK1_D3_ML computer = new WK1_D3_ML("Apple",2021,550.99);
		System.out.println(computer.getName() + " computer made in " + computer.getYear() + " and costs " + computer.getPrice());
		computer.setName("Windows PC");
		computer.setYear(1996);
		computer.setPrice(450.89);
		System.out.println(computer.getName() + " computer made in " + computer.getYear() + " and costs " + computer.getPrice());
		System.out.println("******************************************************************");
		//instantiate Student class and print information 
		Student todd = new Student(0001,"Todd","Hopkins","Thop@gmail.org","123-456-7890");
		Student mario = new Student(0002,"Mario","Wells","Wario@gmail.org","123-456-7891");

		System.out.println(todd.fname + " " + todd.lname + " whose student id is " + todd.getid() + " has " + todd.getEmail() + " and phone number " + todd.getPhoneNum());
		System.out.println(mario.fname + " " + mario.lname + " whose student id is " + mario.getid() + " has " + mario.getEmail() + " and phone number " + mario.getPhoneNum());
		System.out.println("***************************************************");

		Bikes b = new Bikes(2);
		System.out.println("Bikes have " + b.getTyres() + " Tyres.");

		Cars c = new Cars(4);
		c.setName("Honda");
		System.out.println(c.getName() + " has " + c.getTyres() + " Tyres.");
		
		Rectangle r1 = new Rectangle(6,8);
		Rectangle r2 = new Rectangle(9,11);
		System.out.println("***************************************************");
		System.out.printf("The area of Rectangle1 with length %d and Width %d is %d%n", r1.getLength(), r1.getWidth(), r1.getArea());
		System.out.printf("The area of Rectangle2 with length %d and Width %d is %d%n", r2.getLength(), r2.getWidth(), r2.getArea());
		
		Triangle t = new Triangle();
		t.setLength(3);
		t.setWidth(4);
		t.setHeight(5);
		System.out.println("***************************************************");
		System.out.printf("Perimeter of the triangle with length = %d , width = %d , height = %d is : %d %n", t.getLength(),t.getWidth(),t.getHeight(),t.getPerimeter());
		System.out.printf("Area of the triangle with length = %d , width = %d , height = %d is : %d %n", t.getLength(),t.getWidth(),t.getHeight(),t.getArea());
		System.out.println("***************************************************");

		Employee e1 = new Employee("Robert",1994,"64C- WallsStreat");
		Employee e2 = new Employee("Sam",2000,"68D- WallsStreat");
		Employee e3 = new Employee("John",1999,"26B- WallsStreat");
		System.out.printf("%s joined in %d and lives in %s%n",e1.getName(),e1.getYear(),e1.getAddress());
		System.out.printf("%s joined in %d and lives in %s%n",e2.getName(),e2.getYear(),e2.getAddress());
		System.out.printf("%s joined in %d and lives in %s%n",e3.getName(),e3.getYear(),e3.getAddress());
	}

}

/* Create a class named Student that can hold the data for a single student from the following table. 
 * Make sure some data such as student email, student Phone number are private.
Student ID  First Name Last Name StudentEmail Student Phone

0001        Todd       Hopkins   Thop@gmail.org 123-456-7890
0002        Mario      Wells     Wario@gmail.org 123-456-7891
*/

class Student{
	private long sid;
	String fname, lname;
	private String email,phonenum;
	public Student(long id, String fname, String lname, String email, String phonenum){
		this.sid = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phonenum = phonenum;
	}
	public String getEmail() {
		return this.email;
	}
	public String getPhoneNum(){
		return this.phonenum;
	}
	public long getid() {
		return this.sid;
	}
	
}

/* Create a class Automobile with variables number_of_tires and type, inherit and create subclasses 
 * with two number of tires (bikes) and four number of tires and type car, truck or bus. 
 * When instantiating the object, use the constructor. */
 
class Automobile{
	String auto_type;
	int numOfTyres;
	
	public Automobile(int num) {
		this.numOfTyres = num;
	}
	
	public Automobile(String autoType, int numOfTyres){
		this.auto_type = autoType;
		this.numOfTyres = numOfTyres;	
	}
}

class Bikes extends Automobile{
	int numTyres;
	public Bikes(int num) {
		super(num);//calling parent constructor
		this.numTyres = num;
	}
	public int getTyres() {
		return this.numTyres;
	}
}

class Cars extends Automobile{
	int numTyres;
	String name;
	public Cars(int num) {
		super(num);
		this.numTyres = num;
	}
	public void setName(String name) {
		this.name = name;
		
	}
	public String getName() {
		return this.name;
	}
	public int getTyres() {
		return this.numTyres;
	}

}

/*Create two Rectangle objects with a method Area which returns the area of each triangle. 
 * Length and width of two triangles should be passed as parameters to the constructor (6,8) and (9,11).
 */
class Rectangle{
	int length;
	int width;
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	public int getArea() {
		return (this.length * this.width);
	}
}
/*  Write a program to print the area and perimeter of a triangle of sides of 3, 4 and 5 units 
	by creating a class named 'Triangle' without any parameter in its constructor. Use this two step process: 
	Step 1: Calculate "s" (half of the triangles perimeter): s =  a+b+c 
	Step 2: Then calculate the Area: herons formula A = sqrt( s(s-a)(s-b)(s-c) )
*/

class Triangle{
	int length;
	int width;
	int height;
	public Triangle() {
		
	}
	public void setLength(int a) {
		this.length = a;
	}
	public void setWidth(int b) {
		this.width = b;
	}
	public void setHeight(int c) {
		this.height = c;
	}
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	public int getHeight() {
		return this.height;
	}
	public int getPerimeter() {
		return (this.length + this.width + this.height);
	}
	public int getArea() {
		int s = this.getPerimeter();
		//sqrt( s(s-a)(s-b)(s-c) )
		return((int)(Math.sqrt(s*(s-this.getLength())* (s-this.getWidth()) * (s-this.getHeight()))));
	}
}

/*Write a program that would print the information (name, year of joining, salary, address) 
 of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address

Robert            1994                64C- WallsStreat

Sam                2000                68D- WallsStreat

John                1999                26B- WallsStreat
*/

class Employee{
	String eName;
	int eYear;
	private String eAddress;
	public Employee(String name, int year, String address) {
		this.eName = name;
		this.eYear = year;
		this.eAddress = address;
	}
	public String getName() {
		return this.eName;
	}
	public String getAddress() {
		return this.eAddress;
	}
	public int getYear() {
		return this.eYear;
	}
}