
Action
QuestionText
Choice1
Choice2
Choice3
Choice4
ADD
Consider the following code and choose the correct option:class X { int x; X(int x){x=2;}}class Y extends X{ Y(){} void displayX(){System.out.print(x);}public static void main(String args[]){ new Y().displayX();}}
Compiles and display 2
Compiles and runs without any output
Compiles and display 0
Compilation error///
ADD
Consider the following code and choose the correct option:class Test{ private void display(){System.out.println("Display()");}private static void show() { display();System.out.println("show()");}public static void main(String arg[]){show();}}
Compiles and prints show()
Compiles and prints Display() show()
Compiles but throws runtime exception
Compilation error///
ADD
Consider the following code and choose the correct option:class A{ A(){System.out.print("From A");}}class B extends A{ B(int z){z=2;}public static void main(String args[]){ new B(3);}}
Compilation error
Comiples and prints From A//
Compiles but throws runtime exception
Compiles and display 3
ADD
class One{int var1;One (int x){var1 = x;}}class Derived extends One{int var2;void display(){System.out.println("var 1="+var1+"var2="+var2);}}class Main{public static void main(String[] args){Derived obj = new Derived();obj.display();}}consider the code above & select the proper output from the options.
0 , 0
compiles successfully but runtime error
compile error//
none of these
ADD
Consider the following code and choose the correct option:package aj; class A{ protected int j; }package bj; class B extends A{ public static void main(String ar[]){ System.out.print(new A().j=23);}}
code compiles fine and will display 23
code compiles but will not display output
j can not be initialized
compliation error//
ADD
class Order{Order(){System.out.println("Cat");}public static void main(String... Args){Order obj = new Order();System.out.println("Ant");}static{System.out.println("Dog");}{System.out.println("Man");}}consider the code above & select the proper output from the options.
compile error
Man Dog Cat Ant
Dog Man Cat Ant//
Cat Ant Dog Man
ADD
public class MyAr { public static void main(String argv[]) { MyAr m = new MyAr(); m.amethod(); } public void amethod() { final int i1; System.out.println(i1); }}What is the Output of the Program?
Unresolved compilation problem: The local variable i1 may not have been initialized//
Compilation and output of null
None of the given options
ADD
class MyClass1 { private int area(int side) { return(side * side); } public static void main(String args[ ]) { MyClass1 MC = new MyClass1( ); int area = MC.area(50); System.out.println(area); } } What would be the output?
Compilation error
Runtime Exception
2500//
50
ADD
class Sample{int a,b;Sample(){ a=1; b=2;System.out.println(a+"\t"+b);}Sample(int x){ this(10,20);a=b=x;System.out.println(a+"\t"+b);}Sample(int a,int b){ this();this.a=a;this.b=b;System.out.println(a+"\t"+b);}}class This2{ public static void main(String args[]){Sample s1=new Sample (100);}}What is the Output of the Program?
100 100 1 2 10 20
1 2 100 100 10 20
10 20 1 2 100 100//
1 2 10 20 100 100
ADD
Consider the following code and choose the correct option:public class MyClass { public static void main(String arguments[]) { amethod(arguments); } public void amethod(String[] arguments) { System.out.println(arguments[0]); System.out.println(arguments[1]); }}Command Line arguments - Hi, Hello
prints Hi Hello
Compiler Error//
Runs but no output
Runtime Error
ADD
Given: public class Yikes { public static void go(Long n) {System.out.print("Long ");} public static void go(Short n) {System.out.print("Short ");} public static void go(int n) {System.out.print("int ");} public static void main(String [] args) { short y = 6; long z = 7; go(y); go(z); } }What is the result?
int Long//
Short Long
Compilation fails.
An exception is thrown at runtime.
ADD
abstract class MineBase { abstract void amethod(); static int i;}public class Mine extends MineBase { public static void main(String argv[]){ int[] ar=new int[5]; for(i=0;i < ar.length;i++) System.out.println(ar[i]); }}
A Sequence of 5 zero's will be printed like 0 0 0 0 0
A Sequence of 5 one's will be printed like 1 1 1 1 1
IndexOutOfBoundes Error
Compilation Error occurs and to avoid them we need to declare Mine class as abstract//
ADD
What will be the result when you attempt to compile this program? public class Rand{ public static void main(String argv[]){ int iRand; iRand = Math.random(); System.out.println(iRand); }}
Compile time error referring to a cast problem//
A random number between 1 and 10
A random number between 0 and 1
A compile time error as random being an undefined method
ADD
Which of the following declarations are correct? (Choose TWO)
boolean b = TRUE;
byte b = 256;
String s = “null”;//
int i = new Integer(“56”);//
ADD
class A, B and C are in multilevel inheritance hierarchy repectively . In the main method of some other class if class C object is created, in what sequence the three constructors execute?
Constructor of A executes first, followed by the constructor of B and C//
Constructor of C executes first followed by the constructor of A and B
Constructor of C executes first followed by the constructor of B and A
Constructor of A executes first followed by the constructor of C and B
ADD
What will be the result when you try to compile and run the following code? private class Base{ Base(){ int i = 100; System.out.println(i); }}public class Pri extends Base{ static int i = 200; public static void main(String argv[]){ Pri p = new Pri(); System.out.println(i); }}
200
100 followed by 200
Compile time error//
100
ADD
Suppose class B is sub class of class A:A) If class A doesn't have any constructor, then class B also must not have any constructorB) If class A has parameterized constructor, then class B can have default as well as parameterized constructorC) If class A has parameterized constructor then call to class A constructor should be made explicitly by constructor of class B
Only B and C is TRUE//
Only A is TRUE
All are FALSE
Only A and C is TRUE
ADD
What will be printed out if you attempt to compile and run the following code ? public class AA { public static void main(String[] args) { int i = 9; switch (i) { default: System.out.println("default"); case 0: System.out.println("zero"); break; case 1: System.out.println("one"); case 2: System.out.println("two"); } }}
default zero one two
default zero//
Compilation Error
default
ADD
Consider the following code and choose the correct option:package aj; private class S{ int roll; S(){roll=1;} }package aj; class T { public static void main(String ar[]){ System.out.print(new S().roll);}}
Compiles but no output
Compiles and diplay 0
Compilation error//
Compiles and display 1
ADD
public class Q { public static void main(String argv[]) { int anar[] = new int[] { 1, 2, 3 }; System.out.println(anar[1]); }}
Compiler Error: anar is referenced before it is initialized
2//
1
Compiler Error: size of array must be defined
ADD
Which statements, when inserted at (1), will not result in compile-time errors?public class ThisUsage {int planets;static int suns;public void gaze() {int i;// (1) INSERT STATEMENT HERE}}
i = this.planets;//
i = this.suns;//
this = new ThisUsage();
this.i = 4;
ADD
Given the following code what will be output? public class Pass{ static int j=20; public static void main(String argv[]){ int i=10; Pass p = new Pass(); p.amethod(i); System.out.println(i); System.out.println(j); } public void amethod(int x){ x=x*2; j=j*2; }}
Error: amethod parameter does not match variable
10 and 40//
10, and 20
20 and 40
ADD
class Order{Order(){System.out.println("Cat");}public static void main(String... Args){System.out.println("Ant");}static{System.out.println("Dog");}{System.out.println("Man");}}consider the code above & select the proper output from the options.
Dog Ant
Dog Man Cat Ant
Man Dog Ant
Dog Man Ant
ADD
public class c123 { private c123() { System.out.println("Hellow"); } public static void main(String args[]) { c123 o1 = new c123(); c213 o2 = new c213(); }}class c213 { private c213() { System.out.println("Hello123"); }}What is the output?
Hellow
It is not possible to declare a constructor as private
Compilation Error
Runs without any output
ADD
class A { int i, j; A(int a, int b) { i = a; j = b; } void show() { System.out.println("i and j: " + i + " " + j); }}class B extends A { int k; B(int a, int b, int c) { super(a, b); k = c; } void show(String msg) { System.out.println(msg + k); }}class Override { public static void main(String args[]) { B subOb = new B(3, 5, 7); subOb.show("This is k: "); // this calls show() in B subOb.show(); // this calls show() in A }} What would be the ouput?
This is j: 5 i and k: 3 7
This is i: 3 j and k: 5 7
This is i: 7 j and k: 3 5
This is k: 7 i and j: 3 7
ADD
public class MyAr { static int i1; public static void main(String argv[]) { MyAr m = new MyAr(); m.amethod(); } public void amethod() { System.out.println(i1); }}What is the output of the program?
Compilation Error
Garbage Value
It is not possible to access a static variable in side of non static method
ADD
Given:package QB;class Meal { Meal() { System.out.println("Meal()"); }}class Cheese { Cheese() { System.out.println("Cheese()"); }}class Lunch extends Meal { Lunch() { System.out.println("Lunch()"); }}class PortableLunch extends Lunch { PortableLunch() { System.out.println("PortableLunch()"); }}class Sandwich extends PortableLunch { private Cheese c = new Cheese(); public Sandwich() { System.out.println("Sandwich()"); }}public class MyClass7 { public static void main(String[] args) { new Sandwich();
Meal() Lunch() PortableLunch() Cheese() Sandwich()
Meal() Cheese() Lunch() PortableLunch() Sandwich()
Meal() Lunch() PortableLunch() Sandwich() Cheese()
Cheese() Sandwich() Meal() Lunch() PortableLunch()
ADD
Consider the following code and choose the correct option:class A{ int a; A(int a){a=4;}}class B extends A{ B(){super(3);} void displayA(){System.out.print(a);}public static void main(String args[]){ new B().displayA();}}
compiles and display 0
compilation error
Compiles and display 4
Compiles and display 3
ADD
class Order{Order(){System.out.println("Cat");}public static void main(String... Args){Order obj = new Order();System.out.println("Ant");}static{System.out.println("Dog");}}consider the code above & select the proper output from the options.
Cat Ant Dog
Dog Cat Ant
Ant Cat Dog
none
ADD
What will happen if a main() method of a "testing" class tries to access a private instance variable of an object using dot notation?
The compiler will automatically change the private variable to a public variable
The compiler will find the error and will not make a .class file
The program will compile and run successfully
The program will compile successfully, but the .class file will not run correctly
ADD
What will be the result of compiling the following program?public class MyClass {long var;public void MyClass(long param) { var = param; } // (Line no 1)public static void main(String[] args) {MyClass a, b;a = new MyClass(); // (Line no 2) }}
The program will compile without errors.
A compilation error will occur at (Line no 2), since the class does not have a constructor that takes one argument of type int.
A compilation error will occur at (Line no 1), since constructors cannot specify a return value
A compilation error will occur at (2), since the class does not have a default constructor
ADD
public class MyClass { static void print(String s, int i) { System.out.println("String: " + s + ", int: " + i); } static void print(int i, String s) { System.out.println("int: " + i + ", String: " + s); } public static void main(String[] args) { print("String first", 11); print(99, "Int first"); }}What would be the output?
String: String first, int: 11 int: 99, String: Int first
int: 27, String: Int first String: String first, int: 27
Compilation Error
Runtime Exception
ADD
Here is the general syntax for method definition: accessModifier returnType methodName( parameterList ){ Java statements return returnValue;}What is true for the returnType and the returnValue?
The returnValue can be any type, but will be automatically converted to returnType when the method returns to the caller
If the returnType is void then the returnValue can be any type
The returnValue must be the same type as the returnType, or be of a type that can be converted to returnType without loss of information
The returnValue must be exactly the same type as the returnType.
ADD
11. class Mud {12. // insert code here13. System.out.println("hi");14. }15. }And the following five fragments:public static void main(String...a) {public static void main(String.* a) {public static void main(String... a) {public static void main(String[]... a) {public static void main(String...[] a) {How many of the code fragments, inserted independently at line 12, compile?
3
1
2
ADD
package QB; class Sphere { protected int methodRadius(int r) { System.out.println("Radious is: "+r); return 0; } }package QB;public class MyClass { public static void main(String[] args) { double x = 0.89; Sphere sp = new Sphere(); // Some code missing}} to get the radius value what is the code of line to be added ?
methodRadius(x);
sp.methodRadius(x);
Nothing to add
Sphere.methodRadius();
ADD
A) A call to instance method can not be made from static context.B) A call to static method can be made from non static context.
Only B is TRUE
Only A is TRUE
Both are TRUE
Both are FALSE
ADD
Consider the following code and choose the correct option:class A{ private void display(){ System.out.print("Hi");}public static void main(String ar[]){display();}}
Compiles and displays Hi
Compiles and throws run time exception
Compilation fails
Compiles but doesn't display anything
ADD
class One{int var1;One (int x){var1 = x;}}class Derived extends One{int var2;Derived(){super(10);var2=10;}void display(){System.out.println("var1="+var1+" , var2="+var2);}}class Main{public static void main(String[] args){Derived obj = new Derived();obj.display();}}consider the code above & select the proper output from the options.
var1=10 , var2=10
0,0
compile error
runtime error
ADD
public class MyAr { public static void main(String argv[]) { MyAr m = new MyAr(); m.amethod(); } public void amethod() { static int i1; System.out.println(i1); }}What is the Output of the Program?
Compile time error because i has not been initialized
Compilation and output of null
It is not possible to declare a static variable in side of non static method or instance method. Because Static variables are class level dependencies.
ADD
Consider the following code and choose the correct option:class A{ int z; A(int x){z=x;} }class B extends A{ public static void main(String arg){new B();}}
Compilation error
Compiles but throws run time exception
Compiles and displays nothing
None of the listed options
ADD
A) No argument constructor is provided to all Java classes by defaultB) No argument constructor is provided to the class only when no constructor is defined.C) Constructor can have another class object as an argumentD) Access specifiers are not applicable to Constructor
Only A is TRUE
All are TRUE
B and C is TRUE
All are FALSE
ADD
Which modifier is used to control access to critical code in multi-threaded programs?
default
public
transient
synchronized
ADD
public class c1 {private c1(){ System.out.println("Hello");}public static void main(String args[]){ c1 o1=new c1();}}What is the output?
Hello
It is not possible to declare a constructor private
Compilation Error
Can't create object because constructor is private
ADD
Which of the following sentences is true?A) Access to data member depends on the scope of the class and the scope of data membersB) Access to data member depends only on the scope of the data membersC) Access to data member depends on the scope of the method from where it is accessed
Only A and C is TRUE
All are TRUE
All are FALSE
Only A is TRUE
ADD
Consider the following code and choose the correct option:class Test{ private static void display(){System.out.println("Display()");}private static void show() { display();System.out.println("show()");}public static void main(String arg[]){show();}}
Compiles and prints show()
Compiles and prints Display() show()
Compiles but throws runtime exception
Compilation error
ADD
Consider the following code and choose the correct option:class A{ private static void display(){ System.out.print("Hi");}public static void main(String ar[]){display();}}
Compiles and display Hi
Compiles and throw run time exception
Compiles but doesn't display anything
Compilation fails
ADD
Which of the following will print -4.0
System.out.println(Math.ceil(-4.7));
System.out.println(Math.floor(-4.7));
System.out.println(Math.round(-4.7));
System.out.println(Math.min(-4.7));
ADD
class Test{static void method(){this.display();}static display(){System.out.println(("hello");}public static void main(String[] args){new Test().method();}}consider the code above & select the proper output from the options.
hello
Runtime Error
compiles but no output
does not compile
ADD
Consider the following code and choose the best option:class Super{ int x; Super(){x=2;}}class Sub extends Super { void displayX(){System.out.print(x);}public static void main(String args[]){ new Sub().displayX();}}
Compilation error
Compiles and display 0
Compiles and display 2
Compiles and runs without any output
ADD
Which modifier indicates that the variable might be modified asynchronously, so that all threads will get the correct value of the variable.
synchronized
volatile
transient
default
ADD
A constructor may return value including class type
true
false
ADD
Consider the following code and choose the correct option:package aj; class S{ int roll =23;private S(){} }package aj; class T { public static void main(String ar[]){ System.out.print(new S().roll);}}
Compilation error
Compiles and display 0
Compiles and display 23
Compiles but no output
ADD
What will happen when you attempt to compile and run this code?abstract class Base{ abstract public void myfunc(); public void another(){ System.out.println("Another method"); }}public class Abs extends Base{ public static void main(String argv[]){ Abs a = new Abs(); a.amethod(); } public void myfunc(){ System.out.println("My Func"); } public void amethod(){ myfunc(); }}
The code will compile and run, printing out the words "My Func"
The compiler will complain that the Base class has non abstract methods
The code will compile but complain at run time that the Base class has non abstract methods
The compiler will complain that the method myfunc in the base class has no body, nobody at all to print it
ADD
Given: class Pizza { java.util.ArrayList toppings; public final void addTopping(String topping) { toppings.add(topping); } } public class PepperoniPizza extends Pizza { public void addTopping(String topping) { System.out.println("Cannot add Toppings"); } public static void main(String[] args) { Pizza pizza = new PepperoniPizza(); pizza.addTopping("Mushrooms"); } }What is the result?
Compilation fails.
Cannot add Toppings
The code runs with no output.
A NullPointerException is thrown
ADD
When we use both implements & extends keywords in a single java program then what is the order of keywords to follow?
we must use always extends and later we must use implements keyword.
we must use always implements and later we must use extends keyword.
we can use in any order its not at all a problem
extends and implements can't be used together
ADD
Consider the following code and choose the correct option:interface employee{ void saldetails(); void perdetails();}abstract class perEmp implements employee{ public void perdetails(){ System.out.println("per details"); }} class Programmer extends perEmp{ public void saldetails(){ perdetails(); System.out.println("sal details"); } public static void main(String[] args) { perEmp emp=new Programmer(); emp.saldetails(); }}
sal details
sal details per details
compilation error
per details sal details
ADD
Consider the following code and choose the correct option:interface A{ int i=3;} interface B{ int i=4;}class Test implements A,B{ public static void main(String[] args) { System.out.println(i); }}
3
4
compilation error
Compiles but error at runtime
ADD
Consider the following code: // Class declarations:class Super {}class Sub extends Super {}// Reference declarations:Super x;Sub y;Which of the following statements is correct for the code: y = (Sub) x?
Illegal at compile time
Legal at compile time, but might be illegal at runtime//
Definitely legal at runtime, but the cast operator (Sub) is not strictly needed.
Definitely legal at runtime, and the cast operator (Sub) is needed.
ADD
Consider the following code and choose the correct option:class A{ void display(){ System.out.println("Hello A"); }}class B extends A{ void display(){ System.out.println("Hello B"); }}public class Test { public static void main(String[] args) { A a=new B(); B b= a; b.display(); }}
Hello A
Compilation error//
Hello B
Compiles but error at runtime
ADD
Which of these field declarations are legal in an interface? (Choose all applicable)
public static int answer = 42;//
int answer;
final static int answer = 42;//
public int answer = 42;//
ADD
Consider the following code and choose the correct option:abstract class Car{ abstract void accelerate(); }class Lamborghini extends Car{ @Override void accelerate() { System.out.println("90 mph"); } void nitroBooster(){ System.out.print("150 mph"); } public static void main(String[] args) { Car mycar=new Lamborghini(); mycar.nitroBooster(); }}
150 mph
Compilation error//
Compiles but error at run time
90 mph
ADD
Consider the code below & select the correct ouput from the options:1. public class Mountain {2. protected int height(int x) { return 0; }3. }4. class Alps extends Mountain {5. // insert code here6. }Which five methods, inserted independently at line 5, will compile? (Choose three.)A. public int height(int x) { return 0; }B. private int height(int x) { return 0; }C. private int height(long x) { return 0; }D. protected long height(long x) { return 0; }E. protected long height(int x) { return 0; }
A,B,E
A,C,D//
B,D,E
C,D,E
ADD
Consider the following code and choose the correct option:class A{ void display(byte a, byte b){ System.out.println("sum of byte"+(a+b)); } void display(int a, int b){ System.out.println("sum of int"+(a+b)); } public static void main(String[] args) { new A().display(3, 4); }}
sum of byte 7
Compilation error
sum of int7//
Compiles but error at runtime
ADD
Consider the following code and choose the correct option:interface console{ int line; void print();}class a implements console{ public void print(){ System.out.print("A");} public static void main(String ar[]){ new a().print();}}
A
Compilation error//
Compiles but error at run time
Runs but no output
ADD
Consider the following code and choose the correct option:class A{ void display(){ System.out.println("Hello A"); }}class B extends A{ void display(){ System.out.println("Hello B"); }}public class Test { public static void main(String[] args) { A a=new B(); B b= (B)a; b.display(); }}
Hello A
Compilation error
Hello B//
Compiles but error at runtime
ADD
Which of the following defines a legal abstract class?
class Vehicle { abstract void display(); }
abstract Vehicle { abstract void display(); }
class abstract Vehicle { abstract void display(); }
abstract class Vehicle { abstract void display(); { System.out.println("Car"); }}
ADD
Choose the correct declaration of variable in an interface:
public final data type varaibale=intialization;//
static data type variable;
static final data type varaiblename;
final data type variablename=intialization;
ADD
Given:11. class ClassA {}12. class ClassB extends ClassA {}13. class ClassC extends ClassA {}and:21. ClassA p0 = new ClassA();22. ClassB p1 = new ClassB();23. ClassC p2 = new ClassC();24. ClassA p3 = new ClassB();25. ClassA p4 = new ClassC();Which TWO are valid? (Choose two.)
p0 = p1;//
p2 = p4;
p1 = (ClassB)p3;//
p1 = p2;
ADD
Consider the following code and choose the correct option:class A{ void display(){ System.out.println("Hello A"); }}class B extends A{ void display(){ System.out.println("Hello B"); }}public class Test { public static void main(String[] args) { B b=(B) new A(); b.display(); }}
Hello A
Compilation error
Hello B
Compiles but error at runtime//
ADD
A class Animal has a subclass Mammal. Which of the following is true:
Because of single inheritance, Mammal can have no subclasses
Because of single inheritance, Mammal can have no other parent than Animal//
Because of single inheritance, Animal can have only one subclass
Because of single inheritance, Mammal can have no siblings.
ADD
Given: interface DeclareStuff { public static final int Easy = 3;void doStuff(int t); }public class TestDeclare implements DeclareStuff { public static void main(String [] args) {int x = 5; new TestDeclare().doStuff(++x);} void doStuff(int s) { s += Easy + ++s;System.out.println("s " + s); }} What is the result?
s 14
s 16
s 10
Compilation fails.//
ADD
Consider the following code and choose the correct option:interface console{ int line=10; void print();}class a implements console{ void print(){ System.out.print("A");} public static void main(String ar[]){ new a().print();}}
A
Compilation error//
Compiles but error at run time
Runs but no output
ADD
Which of the following is correct for an abstract class. (Choose TWO)
An abstract class is one which contains general purpose methods//
An abstract class is one which contains some defined methods and some undefined methods//
An abstract class is one which contains only static methods
Abstract class can be declared final
ADD
Which declaration can be inserted at (1) without causing a compilation error?interface MyConstants {int r = 42;int s = 69;// (1) INSERT CODE HERE}
int total = total + r + s;
final double circumference = 2 * Math.PI * r;//
protected int CODE = 31337;
int AREA = r * s;//
ADD
Given : Day d;BirthDay bd = new BirthDay("Raj", 25);d = bd; // Line XWhere Birthday is a subclass of Day. State whether the code given at Line X is correct:
No—there must always be an exact match between the variable and the object
No—but a object of parent type can be assigned to a variable of child type.
Yes—an object can be assigned to a reference variable of the parent type.//
Yes—any object can be assigned to any reference variable.
ADD
class Animal {void makeNoise() {System.out.println("generic noise"); }}class Dog extends Animal {void makeNoise() {System.out.println("bark"); }void playDead() { System.out.println("roll over"); }}class CastTest2 {public static void main(String [] args) {Animal a = new Dog();a.makeNoise();}}consider the code above & select the proper output from the options.
run time error
generic noise
bark///
compile error
ADD
interface Vehicle{void drive();}final class TwoWheeler implements Vehicle{int wheels = 2;public void drive(){System.out.println("Bicycle");}}class ThreeWheeler extends TwoWheeler{public void drive(){System.out.println("Auto");}}class Test{public static void main(String[] args){ThreeWheeler obj = new ThreeWheeler();obj.drive();}}consider the code above & select the proper output from the options.
Auto
Bicycle Auto
compile error//
runtime error
ADD
Select the correct statement:
Private methods cannot be overridden in subclasses//
A subclass can override any method in a superclass
An overriding method can declare that it throws checked exceptions that are not thrown by the method it is overriding
The parameter list of an overriding method can be a subset of the parameter list of the method that it is overriding
ADD
Consider the code below & select the correct ouput from the options:class A{ static int sq(int n){ return n*n; }}public class Test extends A{ static int sq(int n){ return super.sq(n); } public static void main(String[] args) { System.out.println(new Test().sq(3)); }}
3
Compilation error//
Compiles but error at run time
9
ADD
Given:public static void main( String[] args ) { SomeInterface x; ... } Can an interface name be used as the type of a variable
No—a variable must always be an object reference type
No—a variable must always be an object reference type or a primitive type
No—a variable must always be a primitive type
Yes—the variable can refer to any object whose class implements the interface//
ADD
Given :What would be the result of compiling and running the following program?// Filename: MyClass.javapublic class MyClass {public static void main(String[] args) {C c = new C();System.out.println(c.max(13, 29));}}class A {int max(int x, int y) { if (x>y) return x; else return y; }}class B extends A{int max(int x, int y) { return super.max(y, x) - 10; }}class C extends B {int max(int x, int y) { return super.max(x+10, y+10); }}
The code will fail to compile because the max() method in B passes the arguments in the call super.max(y, x) in the wrong order.
The code will fail to compile because a call to a max() method is ambiguous.
The code will compile and print 23, when run.
The code will compile and print 29, when run.//
ADD
Given:interface A { public void methodA(); }interface B { public void methodB(); }interface C extends A,B{ public void methodC(); } //Line 3class D implements B {public void methodB() { } //Line 5}class E extends D implements C { //Line 7public void methodA() { }public void methodB() { } //Line 9public void methodC() { }}What would be the result?
Compilation fails, due to an error in line 3
If you define D e = (D) (new E()), then e.methodB() invokes the version of methodB() defined at line 9//
Compilation fails, due to an error in line 7
If you define D e = (D) (new E()), then e.methodB() invokes the version of methodB() defined at line 5
ADD
Select the correct statement:
A super() or this() call must always be provided explicitly as the first statement in the body of a constructor.
If both a subclass and its superclass do not have any declared constructors, the implicit default constructor of the subclass will call super() when run//
If neither super() nor this() is declared as the first statement in the body of a constructor, this() will implicitly be inserted as the first statement.
If super() is the first statement in the body of a constructor, this() can be declared as the second statement
ADD
class Animal {void makeNoise() {System.out.println("generic noise"); }}class Dog extends Animal {void makeNoise() {System.out.println("bark"); }void playDead() { System.out.println("roll over"); }}class CastTest2 {public static void main(String [] args) {Dog a = (Dog) new Animal();a.makeNoise();}}consider the code above & select the proper output from the options.
run time error//
generic noise
bark
compile error
ADD
Consider the code below & select the correct ouput from the options:class Money {private String country = "Canada"; public String getC() { return country; } } class Yen extends Money { public String getC() { return super.country; } public static void main(String[] args) { System.out.print(new Yen().getC() ); } }
Canada
Compilation error//
Compiles but error at run time
null
ADD
Which Man class properly represents the relationship "Man has a best friend who is a Dog"?A)class Man extends Dog { }B)class Man implements Dog { }C)class Man { private BestFriend dog; }D)class Man { private Dog bestFriend; }
A
B
C
D//
ADD
Consider the following code and choose the correct option:interface Output{ void display(); void show();}class Screen implements Output{ void show() {System.out.println("show");} void display(){ System.out.println("display"); }public static void main(String[] args) { new Screen().display();}}
display
Compilation error//
Compiles but error at run time
Runs but no output
ADD
The concept of multiple inheritance is implemented in Java by(A) extending two or more classes(B) extending one class and implementing one or more interfaces(C) implementing two or more interfaces(D) all of these
(A)
(A) & (C)
(D)
(B) & © //
ADD
Consider the following code and choose the correct option:interface Output{ void display(); void show();}class Screen implements Output{ void display(){ System.out.println("display"); }public static void main(String[] args) { new Screen().display();}}
display
Compilation error//
Compiles but error at run time
Runs but no output
ADD
Given a derived class method which overrides one of it’s base class methods. With derived class object you can invoke the overridden base method using:
super keyword//
this keyword
by creating an instance of the base class
cannot call because it is overridden in derived class
ADD
Consider the following code and choose the correct option:abstract class Car{ abstract void accelerate(); }class Lamborghini extends Car{ @Override void accelerate() { System.out.println("90 mph"); } void nitroBooster(){ System.out.print("150 mph"); } public static void main(String[] args) { Car mycar=new Lamborghini(); Lamborghini lambo=(Lamborghini) mycar; lambo.nitroBooster();}}
150 mph//
Compilation error
90 mph
Compiles but error at runtime
ADD
Given the following classes and declarations, which statements are true?// Classesclass Foo {private int i;public void f() { /* ... */ }public void g() { /* ... */ }}class Bar extends Foo {public int j;public void g() { /* ... */ }}// Declarations:Foo a = new Foo();Bar b = new Bar();
The Bar class is a subclass of Foo.//
The statement a.j = 5; is legal.
The statement b.f(); is legal.//
The statement a.g(); is legal.//
ADD
All data members in an interface are by default
abstract and final
public and abstract
public ,static and final//
default and abstract
ADD
Consider the given code and select the correct output: class SomeException {}class A {public void doSomething() { }}class B extends A {public void doSomething() throws SomeException { }}
Compilation of both classes A & B will fail
Compilation of both classes will succeed
Compilation of class A will fail. Compilation of class B will succeed
Compilation of class B will fail. Compilation of class A will succeed//
ADD
Given:class A { final void meth() { System.out.println("This is a final method."); } } class B extends A { void meth() { System.out.println("Illegal!"); } } class MyClass8{ public static void main(String[] args) { A a = new A(); a.meth(); B b= new B(); b.meth(); } }What would be the result?
This is a final method illegal
This is a final method Some error message
Compilation error//
illegal Some error message
ADD
Consider the code below & select the correct ouput from the options:abstract class Ab{ public int getN(){return 0;}}class Bc extends Ab{ public int getN(){return 7;}}class Cd extends Bc { public int getN(){return 47;}}class Test{ public static void main(String[] args) { Cd cd=new Cd(); Bc bc=new Cd(); Ab ab=new Cd(); System.out.println(cd.getN()+" "+ bc.getN()+" "+ab.getN()); }}
0 0 0
47 7 0
Compilation error
47 47 47//
ADD
Given:interface DoMath { double getArea(int r); }interface MathPlus { double getVolume(int b, int h); }/* Missing Statements ? */Select the correct missing statements.
class AllMath extends DoMath { double getArea(int r); }
interface AllMath implements MathPlus { double getVol(int x, int y); }
abstract class AllMath implements DoMath, MathPlus { public double getArea(int rad) { return rad * rad * 3.14; } }//
class AllMath implements MathPlus { double getArea(int rad); }
ADD
interface interface_1 { void f1();}class Class_1 implements interface_1 { void f1() { System.out.println("From F1 funtion in Class_1 Class"); }}public class Demo1 { public static void main(String args[]) { Class_1 o11 = new Class_1(); o11.f1(); }}
From F1 function in Class_1 Class
Compile time error//
Create an object for Interface only
Runtime Error
ADD
interface A{}class B implements A{}class C extends B{}public class Test extends C{public static void main(String[] args) { C c=new C(); /* Line6 */}}Which code, inserted at line 6, will cause a java.lang.ClassCastException?
B b=c;
A a2=(B)c;
C c2=(C)(B)c;
A a1=(Test)c;//
ADD
Given the following classes and declarations, which statements are true?// Classesclass A {private int i;public void f() { /* ... */ }public void g() { /* ... */ }}class B extends A{public int j;public void g() { /* ... */ }}// Declarations:A a = new A();B b = new B();Select the three correct answers.
The B class is a subclass of A.//
The statement b.f(); is legal//
The statement a.j = 5; is legal.
The statement a.g(); is legal//
ADD
Which of the following statements is true regarding the super() method?
It can only be used in the parent's constructor
Only one child class can use it
It must be used in the last statement of the constructor.
It must be used in the first statement of the constructor.//
ADD
Is it possible if a class definition implements two interfaces, each of which has the same definition for the constant?
No—if a class implements several interfaces, each constant must be defined in only one interface
No—a class may not implement more than one interface
Yes— either of the two variables can be accessed through : interfaceName.variableName//
Yes—since the definitions are the same it will not matter
ADD
Consider the code below & select the correct ouput from the options:class Mountain{ int height; protected Mountain(int x) { height=x; } public int getH(){return height;}}class Alps extends Mountain{ public Alps(int h){ super(h); } public Alps(){ this(100); } public static void main(String[] args) { System.out.println(new Alps().getH()); }}
100//
Compilation error
Compiles but error at run time
Compiles but no output
ADD
Consider the following code and choose the correct option:interface employee{ void saldetails(); void perdetails();}abstract class perEmp implements employee{ public void perdetails(){ System.out.println("per details"); }} class Programmer extends perEmp{ public static void main(String[] args) { perEmp emp=new Programmer(); emp.saldetails(); }}
sal details
sal details per details
compilation error//
per details sal details
ADD
Consider the following code and choose the correct option:abstract class Fun{ void time(){ System.out.println("Fun Time"); }}class Run extends Fun{ void time(){ System.out.println("Fun Run"); } public static void main(String[] args) { Fun f1=new Run(); f1.time(); }}
Fun Time
Compilation error
Fun Run//
Compiles but error at runtime
ADD
What will be the result when you try to compile and run the following code? class Base1 { Base1() { int i = 100; System.out.println(i); }}public class Pri1 extends Base1 { static int i = 200; public static void main(String argv[]) { Pri1 p = new Pri1(); System.out.println(i); }}
Error at compile time
200
100 followed by 200//
100
ADD
What will be the output of the program? class SuperClass { public Integer getLength() { return new Integer(4); } } public class SubClass extends SuperClass { public Long getLength() { return new Long(5); } public static void main(String[] args) { SuperClass sp = new SuperClass(); SubClass sb = new SubClass(); System.out.println( sp.getLength().toString() + "," + sub.getLength().toString() ); } }
4, 4
4, 5
5, 4
Compilation fails//
ADD
What is the output for the following code:abstract class One{private abstract void test();}class Two extends One{void test(){System.out.println("hello");}}class Test{public static void main(String[] args){Two obj = new Two();obj.test();}}
run time exception
compile time error//
hello
hellohello
ADD
What is the output :interface A{void method1();void method2();}class Test implements A{public void method1(){System.out.println("hello");}}class RunTest{public static void main(String[] args){Test obj = new Test();obj.method1();}}
hello
compile error//
runtime error
none
ADD
What is the result of attempting to compile and run the following code? import java.util.Vector; import java.util.LinkedList; public class Test1{ public static void main(String[] args) { Integer int1 = new Integer(10); Vector vec1 = new Vector(); LinkedList list = new LinkedList(); vec1.add(int1); list.add(int1); if(vec1.equals(list)) System.out.println("equal"); else System.out.println("not equal"); } } 1. The code will fail to compile. 2. Runtime error due to incompatible object comparison 3. Will run and print "equal". 4. Will run and print "not equal".
1
2
3//
4
ADD
TreeSet<String> s = new TreeSet<String>(); TreeSet<String> subs = new TreeSet<String>(); s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e"); subs = (TreeSet)s.subSet("b", true, "d", true); s.add("g"); s.pollFirst(); s.pollFirst(); s.add("c2"); System.out.println(s.size() +" "+ subs.size());
The size of s is 4
The size of s is 5//
The size of subs is 3//
The size of s is 7
ADD
Which collection class allows you to grow or shrink its size and provides indexed access toits elements, but its methods are not synchronized?
java.util.HashSet
java.util.LinkedHashSet
java.util.List
java.util.ArrayList//
ADD
Which statement is true about the following program?import java.util.ArrayList;import java.util.Collections;import java.util.List;public class WhatISThis {public static void main(String[] na){List<StringBuilder> list=new ArrayList<StringBuilder>();list.add(new StringBuilder("B"));list.add(new StringBuilder("A"));list.add(new StringBuilder("C"));Collections.sort(list,Collections.reverseOrder());System.out.println(list.subList(1,2));}}
The program will compile and print the following output: [B]
The program will compile and print the following output: [B,A]
The program will compile and throw a runtime exception//
The program will not compile
ADD
static int binarySearch(List list, Object key) is a method of __________
Vector class
ArrayList class
Collection interface
Collections class
ADD
Given: public class Venus { public static void main(String[] args) { int [] x = {1,2,3}; int y[] = {4,5,6}; new Venus().go(x,y); } void go(int[]... z) { for(int[] a : z) System.out.print(a[0]); } } What is the result?
1
12
14
123
ADD
static void sort(List list) method is part of ________
Collection interface
Collections class
Vector class
ArrayList class
ADD
Consider the code below & select the correct ouput from the options:public class Test{ public static void main(String[] args) { String []colors={"orange","blue","red","green","ivory"}; Arrays.sort(colors); int s1=Arrays.binarySearch(colors, "ivory"); int s2=Arrays.binarySearch(colors, "silver"); System.out.println(s1+" "+s2); }}
2 -4
3 -5
2 -6
3 -4
ADD
Consider the following code was executed on June 01, 1983. What will be the output?class Test{ public static void main(String args[]){ Date date=new Date(); SimpleDateFormat sd; sd=new SimplpeDateFormat("E MMM dd yyyy"); System.out.print(sd.format(date));}}
Wed Jun 01 1983//
244 JUN 01 1983
PST JUN 01 1983
GMT JUN 01 1983
ADD
Consider the following code and choose the correct option:class Data{ Integer data; Data(Integer d){data=d;} public boolean equals(Object o){return true;} public int hasCode(){return 1;}}class Test{ public static void main(String ar[]){ Set<Data> s=new HashSet<Data>(); s.add(new Data(4)); s.add(new Data(2)); s.add(new Data(4)); s.add(new Data(1)); s.add(new Data(2)); System.out.print(s.size());}}
3
5//
compilation error
Compiles but error at run time
ADD
next() method of Scanner class will return _________
Integer
Long
int
String//
ADD
Given: public static Iterator reverse(List list) { Collections.reverse(list); return list.iterator(); } public static void main(String[] args) { List list = new ArrayList(); list.add("1"); list.add("2"); list.add("3"); for (Object obj: reverse(list)) System.out.print(obj + ", "); }What is the result?
3, 2, 1,
1, 2, 3,
Compilation fails.//
The code runs with no output.
ADD
Given:import java.util.Arrays;import java.util.HashSet;import java.util.Set;public class MainClass { public static void main(String[] a) { String elements[] = { "A", "B", "C", "D", "E" }; Set set = new HashSet(Arrays.asList(elements)); elements = new String[] { "A", "B", "C", "D" }; Set set2 = new HashSet(Arrays.asList(elements)); System.out.println(set.equals(set2)); }} What is the result of given code?
true
false//
Compile time error
Runtime Exception
ADD
import java.util.StringTokenizer;class ST{public static void main(String[] args){String input = "Today is$Holiday";StringTokenizer st = new StringTokenizer(input,"$");while(st.hasMoreTokens()){System.out.println(st.nextElement());}}
Today is Holiday
Today is Holiday//
Both
none of the listed options
ADD
int indexOf(Object o) - What does this method return if the element is not found in the List?
null
-1
none of the listed options
ADD
Consider the following code and choose the correct option:class Test{ public static void main(String args[]){ Integer arr[]={3,4,3,2}; Set<Integer> s=new TreeSet<Integer>(Arrays.asList(arr)); s.add(1); for(Integer ele :s){ System.out.println(ele); } }}
Compilation error
prints 3,4,2,1,
prints 1,2,3,4//
Compiles but exception at runtime
ADD
A) It is a good practice to store heterogenous data in a TreeSet.B) HashSet has default initial capacity (16) and loadfactor(0.75)C)HashSet does not maintain order of InsertionD)TreeSet maintains order of Inserstion
A and B is TRUE
A and D is TRUE
A and C is TRUE
B and C is TRUE//
ADD
Consider the following code and choose the correct option:class Test{ public static void main(String args[]){ TreeSet<Integer> ts=new TreeSet<Integer>(); ts.add(1); ts.add(8); ts.add(6); ts.add(4); SortedSet<Integer> ss=ts.subSet(2, 10); ss.add(9); System.out.println(ts); System.out.println(ss); }}
[1,4,6,8] [4,6,8,9]
[1,8,6,4] [8,6,4,9]
[1,4,6,8,9] [4,6,8,9]//
[1,4,6,8,9] [4,6,8]
ADD
Inorder to remove one element from the given Treeset, place the appropriate line of code public class Main { public static void main(String[] args) { TreeSet<Integer> tSet = new TreeSet<Integer>(); System.out.println("Size of TreeSet : " + tSet.size()); tSet.add(new Integer("1")); tSet.add(new Integer("2")); tSet.add(new Integer("3")); System.out.println(tSet.size()); // remove the one element from the Treeset System.out.println("Size of TreeSet after removal : " + tSet.size()); }}
tSet.clear(new Integer("1"));
tSetdelete(new Integer("1"));
tSet.remove(new Integer("1"));//
tSet.drop(new Integer("1"));
ADD
A)Property files help to decrease couplingB) DateFormat class allows you to format dates and times with customized styles.C) Calendar class allows to perform date calculation and conversion of dates and times between timezones.D) Vector class is not synchronized
A and B is TRUE
A and D is TRUE
A and C is TRUE//
B and D is TRUE
ADD
Which interface does java.util.Hashtable implement?
Java.util.Map//
Java.util.List
Java.util.Table
Java.util.Collection
ADD
Consider the following code and choose the correct option:public static void before() {Set set = new TreeSet();set.add("2");set.add(3);set.add("1");Iterator it = set.iterator();while (it.hasNext())System.out.print(it.next() + " ");}
The before() method will print 1 2
The before() method will print 1 2 3
The before() method will throw an exception at runtime//
The before() method will not compile
ADD
Given: import java.util.*; public class LetterASort{ public static void main(String[] args) { ArrayList<String> strings = new ArrayList<String>(); strings.add("aAaA"); strings.add("AaA"); strings.add("aAa"); strings.add("AAaa"); Collections.sort(strings); for (String s : strings) { System.out.print(s + " "); } } }What is the result?
Compilation fails.
aAaA aAa AAaa AaA
AAaa AaA aAa aAaA//
AaA AAaa aAaA aAa
ADD
Which collection class allows you to access its elements by associating a key with an element's value, and provides synchronization?
java.util.SortedMap
java.util.TreeMap
java.util.TreeSet
java.util.Hashtable//
ADD
Consider the following code and select the correct output:import java.util.ArrayList;import java.util.LinkedList;import java.util.List;public class Lists {public static void main(String[] args) {List<String> list=new ArrayList<String>();list.add("1");list.add("2");list.add(1, "3");List<String> list2=new LinkedList<String>(list);list.addAll(list2);list2 =list.subList(2,5);list2.clear();System.out.println(list);}}
[1,3,2]//
[1,3,3,2]
[1,3,2,1,3,2]
[3,1,2]
ADD
Given: public static Collection get() { Collection sorted = new LinkedList(); sorted.add("B"); sorted.add("C"); sorted.add("A"); return sorted; } public static void main(String[] args) { for (Object obj: get()) { System.out.print(obj + ", "); } }What is the result?
A, B, C,
B, C, A,//
Compilation fails.
An exception is thrown at runtime.
ADD
You wish to store a small amount of data and make it available for rapid access. You do not have a need for the data to be sorted, uniqueness is not an issue and the data will remain fairly static Which data structure might be most suitable for this requirement?1) TreeSet2) HashMap3) LinkedList4) an array
1
2
3
4//
ADD
Given:10. interface A { void x(); }11. class B implements A { public void x() { } public void y() { } }12. class C extends B { public void x() {} }And:20. java.util.List<a> list = new java.util.ArrayList</a>();21. list.add(new B());22. list.add(new C());23. for (A a:list) {24. a.x();25. a.y();;26. }What is the result?
Compilation fails because of an error in line 25//
The code runs with no output.
An exception is thrown at runtime
Compilation fails because of an error in line 21
ADD
A) Iterator does not allow to insert elements during traversalB) Iterator allows bidirectional navigation.C) ListIterator allows insertion of elements during traversalD) ListIterator does not support bidirectional navigation
A and B is TRUE
A and D is TRUE
A and C is TRUE//
B and D is TRUE
ADD
What will be the output of following code?class Test{ public static void main(String args[]){ TreeSet<Integer> ts=new TreeSet<Integer>(); ts.add(2); ts.add(3); ts.add(7); ts.add(5);SortedSet<Integer> ss=ts.subSet(1,7); ss.add(4); ss.add(6);System.out.print(ss);}}
[2,3,7,5]
[2,3,4,5,6]//
[2,3,7,5,4,6]
[2,3,4,5,6,7]
ADD
Object get(Object key) - What does this method return if the key is not found in the Map?
-1
null//
none of the listed options
ADD
Consider the following code and choose the correct output:class Test{ public static void main(String args[]){ TreeMap<Integer, String> hm=new TreeMap<Integer, String>(); hm.put(2,"Two"); hm.put(4,"Four"); hm.put(1,"One"); hm.put(6,"Six"); hm.put(7,"Seven"); SortedMap<Integer, String> sm=hm.subMap(2,7); SortedMap<Integer,String> sm2=sm.tailMap(4); System.out.print(sm2); }}
{2=Two, 4=Four, 6=Six, 7=Seven}
{4=Four, 6=Six, 7=Seven}
{4=Four, 6=Six}//
{2=Two, 4=Four, 6=Six}
ADD
Which of the given options is similar to the following code: value += sum++ ;
value = value + sum; sum = sum + 1;//
sum = sum + 1; value = value + sum;
value = value + sum;
value = value + ++sum;
ADD
Which will legally declare, construct, and initialize an array?
int [] myList = {"1", "2", "3"};
int [] myList = (5, 8, 2);
int myList [] [] = {4,9,7,0};
int myList [] = {4, 3, 7};//
ADD
Consider the code below & select the correct ouput from the options:public class Test { public static void main(String[] args) { String[] elements = { "for", "tea", "too" }; String first = (elements.length > 0) ?elements[0] : null; System.out.println(first); }}
Compilation error
The variable first is set to null.
The variable first is set to elements[0].//
Compiles but error at runtime
ADD
Consider the following code and choose the correct option: class Test{ interface Y{ void display(); } public static void main(String[] args) { new Y(){ public void display(){ System.out.println("Hello World"); } }.display(); }}
Hello World//
Compilation error
Compiles but error at run time
Compiles but run without output
ADD
class Test{ public static void main(String[] args){ byte b=(byte) (45 << 1); b+=4; System.out.println(b); }}What should be the output for the code written above?
48
94//
Compiles but error at run time
Compilation error
ADD
What is the value of y when the code below is executed?int a = 4; int b = (int)Math.ceil(a % 3 + a / 3.0);
1
2
3//
4
ADD
Consider the following code and choose the correct option:class Test{ interface Y{ void display(); } public static void main(String[] args) { Y y=new Y(){ public void display(){ System.out.println("Hello World"); } }; y.display(); }}
Hello World//
Compilation error
Compiles but error at run time
Compiles but run without output
ADD
What is the output of the following program?public class demo { public static void main(String[] args) { int arr[5]; for (int i = 0; i < arr.length; i++) { arr[i] = arr[i] + 10; } for (int j = 0; j < arr.length; j++) System.out.println(arr[j]); }}
A sequence of five 10's are printed
A sequence of Garbage Values are printed
compile time Error//
Compiles but no output
ADD
What will be the result of the following program?public class Init {String title;boolean published;static int total;static double maxPrice;public static void main(String[] args) {Init initMe = new Init();double price;if (true)price = 100.00;System.out.println("|" + initMe.title + "|" + initMe.published + "|" +Init.total + "|" + Init.maxPrice + "|" + price+ "|");}}
The program will compile, and print |null|false|0|0.0|0.0|, when run
The program will compile, and print |null|true|0|0.0|100.0|, when run
The program will compile, and print | |false|0|0.0|0.0|, when run
The program will compile, and print |null|false|0|0.0|100.0|, when run//
ADD
Consider the following code and choose the correct option:class Test{ static class A{ interface X{ int z=4; } } static void display(){ System.out.println(A.X.z); } public static void main(String[] args) { display(); }}
4//
Compilation error
Compiles but error at run time
ADD
Here is the general syntax for method definition: accessModifier returnType methodName( parameterList ){ Java statements return returnValue;}What is true for the returnType and the returnValue?
The returnValue must be exactly the same type as the returnType
The returnValue can be any type, but will be automatically converted to returnType when the method returns to the caller.
If the returnType is void then the returnValue can be any type
The returnValue must be the same type as the returnType, or be of a type that can be converted to returnType without loss of information.//
ADD
class C{public static void main (String[] args) {byte b1=33; //1b1++; //2byte b2=55; //3b2=b1+1; //4System.out.println(b1+""+b2);}}Consider the code above & select the correct output.
compile time error at line 2
compile time error at line 4//
prints 34,56
runtime exception
ADD
What will be the output of the program? public class CommandArgs { public static void main(String [] args) { String s1 = args[1]; String s2 = args[2]; String s3 = args[3]; String s4 = args[4]; System.out.print(" args[2] = " + s2); }}and the command-line invocation is > java CommandArgs 1 2 3 4
args[2] = 2
args[2] = 3
args[2] = null
An exception is thrown at runtime//
ADD
A) The purpose of the method overriding is to perform different operation, though input remains the same.B) one of the important Object Oriented principle is the code reusability that can be achieved using abstraction
Only A is TRUE//
Only B is True
Both A and B is True
Both A and B is FALSE
ADD
Consider the following code snippet: int i = 10;int n = ++i%5;What are the values of i and n after the code is executed?
10, 1
11, 1//
10, 0
11 , 0
ADD
Consider the following code and choose the correct option:class Test{ class A{ static int x=3; } static void display(){ System.out.println(A.x); } public static void main(String[] args) { display(); }}
3
Compilation error//
Compiles but error at run time
ADD
Consider the following code and choose the correct output:int value = 0;int count = 1;value = count++ ;System.out.println("value: "+ value + " count: " + count);
value: 0 count: 0
value: 0 count: 1
value: 1 count: 1
value: 1 count: 2//
ADD
What will be the output of the program? public class CommandArgsTwo { public static void main(String [] argh) { int x; x = argh.length; for (int y = 1; y <= x; y++) { System.out.print(" " + argh[y]); } }}and the command-line invocation is > java CommandArgsTwo 1 2 3
0 1 2
2 3
0 0 0
An exception is thrown at runtime//
ADD
class Test{public static void main(String[] args){int var;var = var +1;System.out.println("var ="+var);}}consider the code above & select the proper output from the options.
compiles and runs with no output
var = 1
does not compile//
run time error
ADD
Consider the following code and select the correct output:class Test{ interface Y{ void display(); } public static void main(String[] args) { new Y(){ public void display(){ System.out.println("Hello World"); } }; }}
Hello World
Compilation error
Compiles but error at run time
Compiles but run without output//
ADD
Which of the following will declare an array and initialize it with five numbers?
Array a = new Array(5);
int [] a = {23,22,21,20,19};
int a [] = new int[5];
int [5] array;
ADD
Which three are legal array declarations? (Choose THREE)
int [] myScores [];//
char [] myChars;//
int [6] myScores;
Dog myDogs [];//
ADD
What is the output of the following program?public class MyClass{public static void main( String[] args ){private static final int value =9;float total;total = value + value / 2;System.out.println( total );}}
13
13.5
13
Compilation error///
ADD
As per the following code fragment, what is the value of a?String s;int a;s = "Foolish boy.";a = s.indexOf("fool");
-1
4
random value
ADD
Consider the code below & select the correct ouput from the options:class Test{ public static void main(String[] args) { parse("Four"); } static void parse(String s){ try { double d=Double.parseDouble(s); }catch(NumberFormatException nfe){ d=0.0; }finally{ System.out.println(d); } }}
Compilation error//
A ParseException is thrown by the parse method at runtime
A NumberFormatException is thrown by the parse method at runtime
ADD
Consider the code below & select the correct ouput from the options:class A{ public int a=7; public void add(){ this.a+=2; System.out.print("a"); }}public class Test extends A{ public int a=2; public void add(){ this.a+=2; System.out.print("t"); } public static void main(String[] args) { A a =new Test(); a.add(); System.out.print(a.a); }}
t 7//
t 9
a 9
Compilation error
ADD
Consider the following code: int x, y, z;y = 1;z = 5;x = 0 - (++y) + z++;After execution of this, what will be the values of x, y and z?
x = -7, y = 1, z = 5
x = 3, y = 2, z = 6//
x = 4, y = 1, z = 5
x = 4, y = 2, z = 6
ADD
What will be the output of the program ? public class Test { public static void main(String [] args) { signed int x = 10; for (int y=0; y<5; y++, x--) System.out.print(x + ", "); }}
10, 9, 8, 7, 6,
9, 8, 7, 6, 5,
Compilation fails//
An exception is thrown at runtime
ADD
Consider the following code snippet: int i = 10;int n = i++%5;What are the values of i and n after the code is executed?
10, 1
11, 1
10, 0
11 , 0//
ADD
What is the output of the following: int a = 0;int b = 10;a = --b ;System.out.println("a: " + a + " b: " + b );
a: 9 b:11
a: 10 b: 9
a: 9 b:9//
a: 0 b:9
ADD
Consider the given code and select the correct output:class Test{ public static void main(String[] args){ int num1 = 012; int num2 = 0x110; int sum =num1+=num2; System.out.println("Ans = "+sum); }}
26
282//
Compiles but error at run time
Compilation error
ADD
What will happen if you attempt to compile and run the following code? Integer ten=new Integer(10);Long nine=new Long (9);System.out.println(ten + nine);int i=1;System.out.println(i + ten);
19 followed by 11//
19 follwed by 20
Compile time error
10 followed by 1
ADD
Which of the following are correct variable names? (Choose TWO)
int #ss;
int 1ah;
int _;//
int $abc;//
ADD
Which of the following lines of code will compile without warning or error? 1) float f=1.3; 2) char c="a"; 3) byte b=257; 4) boolean b=null; 5) int i=10;
Line 1, Line 5
Line 5//
Line 1, Line 3, Line 5
Line 3
ADD
Consider the code below & select the correct ouput from the options: public class Test { public static void main(String [] args) { int x = 5; boolean b1 = true; boolean b2 = false; if ((x == 4) && !b2 ) System.out.print("1 "); System.out.print("2 "); if ((b2 = true) && b1 ) System.out.print("3 "); }
2 3//
1 3
2
3
ADD
Consider the code below & select the correct ouput from the options:public class Test { public static void main(String[] args) { int x=5; Test t=new Test(); t.disp(x); System.out.println("main X="+x); }void disp(int x) { System.out.println("disp X = "+x++); }}
disp X = 6 main X=6
disp X = 5 main X=5//
disp X = 5 main X=6
Compilation error
ADD
Given the following piece of code:public class Test {public static void main(String args[]) {int i = 0, j = 5 ;for( ; (i < 3) && (j++ < 10) ; i++ ) {System.out.print(" " + i + " " + j );}System.out.print(" " + i + " " + j );}}what will be the output?
0 6 1 7 2 8 3 8//
0 6 1 7 2 8 3 9
0 5 1 5 2 5 3 5
compilation fails
ADD
Identify the statements that are correct:(A) int a = 13, a>>2 = 3(B) int b = -8, b>>1 = -4(C) int a = 13, a>>>2 = 3(D) int b = -8, b>>>1 = -4
(A), (B) & ©//
(A), (B), (C) & (D)
(C) & (D)
(A) & (B)
ADD
Consider the following code and choose the correct option:class Test{ class A{ interface X{ int z=4; } } static void display(){ System.out.println(new A().X.z); } public static void main(String[] args) { display(); }}
Compilation error//
Compiles but error at run time
4
ADD
Given class MybitShift { public static void main(String [] args) { int a = 0x5000000; System.out.print(a + " and "); a = a >>> 25; System.out.println(a); }}
83886080 and -2
2 and 83886080
2 and -83886080
83886080 and 2//
ADD
1. public class LineUp {2. public static void main(String[] args) {3. double d = 12.345;4. // insert code here5. }6. }Which code fragment, inserted at line 4, produces the output | 12.345|?A. System.out.printf("|%7f| \n", d);B. System.out.printf("|%3.7f| \n", d);C. System.out.printf("|%7.3d| \n", d);D. System.out.printf("|%7.3f| \n", d);
A
B
C
D//
ADD
Here is the general syntax for method definition: accessModifier returnType methodName( parameterList ){ Java statements return returnValue;}What is true for the accessModifier?
It must always be private or public
It can be omitted, but if not omitted there are several choices, including private and public//
The access modifier must agree with the type of the return value
It can be omitted, but if not omitted it must be private or public
ADD
Given classes A, B, and C, where B extends A, and C extends B, and where all classesimplement the instance method void doIt(). How can the doIt() method in A becalled from an instance method in C?
It is not possible//
super.doIt()
his.super.doIt()
((A) this).doIt();
ADD
State the class relationship that is being implemented by the following code:class Employee{private int empid;private String ename;public double getBonus(){Accounts acc = new Accounts();return acc.calculateBonus();}}class Accounts{public double calculateBonus(){//method's code}}
Aggregation
Simple Association
Dependency//
Composition
ADD
Say that class Rodent has a child class Rat and another child class Mouse. Class Mouse has a child class PocketMouse. Examine the following Rodent rod;Rat rat = new Rat();Mouse mos = new Mouse();PocketMouse pkt = new PocketMouse();Which one of the following will cause a compiler error?
rod = mos
pkt = rat//
pkt = null
rod = rat
ADD
How many objects and reference variables are created by the following lines of code?Employee emp1, emp2;emp1 = new Employee() ;Employee emp3 = new Employee() ;
Two objects and three reference variables.//
Three objects and two reference variables
Four objects and two reference variables
Two objects and two reference variables.
ADD
Consider the code below & select the correct ouput from the options:public class Test { int squares = 81; public static void main(String[] args) { new Test().go(); }void go() { incr(++squares); System.out.println(squares); } void incr(int squares) { squares += 10; } }
92
91
Compilation error
82//
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String name="ALDPR7882E"; System.out.println(name.endsWith("E") & name.matches("[A-Z]{5}[0-9]{4}[A-Z]"));}}
false
true//
1
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { StringBuffer sb=new StringBuffer("YamunaRiver"); System.out.println(sb.capacity()); }}
10
27//
24
11
ADD
Examine this code: String stringA = "Wild";String stringB = " Irish";String stringC = " Rose";String result;Which of the following puts a reference to "Wild Irish Rose" in result?
result = stringA.concat( stringB.concat( stringC ) );//
result.concat( stringA, stringB, stringC );
result+stringA+stringB+stringC;
result = concat(StringA).concat(StringB).concat(StringC)
ADD
A)A string buffer is a mutable sequence of characters.B) sequece of characters in the string buffer can not be changed.
Only A is TRUE//
Only B is TRUE
Both A and B is TRUE
Both A and B is FALSE
ADD
Consider the following code and choose the correct option:class Test { public static void main(String[] args) { new Test().display(1,"hi"); new Test().display(2,"hi", "world" ); } public void display(int x,String... s) { System.out.print(s[s.length-x] + " "); }}
hi hi//
hi world
world
Compilation error
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String name="vikaramaditya"; System.out.println(name.substring(2, 5).toUpperCase().charAt(2));}}
K
A
R//
I
ADD
For two string objects obj1 and obj2:A) Use of obj1 == obj2 tests whether two String object references refer to the same objectB) obj1.equals(obj2) compares the sequence of characters in obj1 and obj2.
Only A is TRUE
Only B is TRUE
Both A and B is TRUE//
Both A and B is FALSE
ADD
What will be the result when you attempt to compile and run the following code?. public class Conv { public static void main(String argv[]){ Conv c=new Conv(); String s=new String("ello"); c.amethod(s); } public void amethod(String s){ char c='H'; c+=s; System.out.println(c); }}
Compilation and output the string "Hello"
Compilation and output the string "ello"
Compilation and output the string elloH
Compile time error//
ADD
Examine this code: String stringA = "Hello ";String stringB = " World";String stringC = " Java";String result;Which of the following puts a reference to "Hello World Java" in result?
result = stringA.concat( stringB.concat( stringC ) );//
result.concat( stringA, stringB, stringC );
result+stringA+stringB+stringC;
result = concat(StringA).concat(StringB).concat(StringC)
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String name="vikaramaditya"; System.out.println(name.codePointAt(2)+name.charAt(3)); }}
203
204//
205
Compilation error
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { StringBuffer sb = new StringBuffer("antarctica"); sb.reverse(); sb.replace(2, 7, "c"); sb.delete(0,2); System.out.println(sb); }}
acctna
iccratna
ctna//
tna
ADD
Which code can be inserted at Line X to print "Equal"?public class EqTest{ public static void main(String argv[]){ EqTest e=new EqTest(); } EqTest(){ String s="Java"; String s2="java"; // Line X { System.out.println("Equal"); }else { System.out.println("Not equal"); } }}
if(s==s2)
if(s.equals(s2))
if(s.equalsIgnoreCase(s2))//
if(s.noCaseMatch(s2))
ADD
Given:public class Theory {public static void main(String[] args) {String s1 = "abc";String s2 = s1;s1 += "d";System.out.println(s1 + " " + s2 + " " + (s1==s2));StringBuffer sb1 = new StringBuffer("abc");StringBuffer sb2 = sb1;sb1.append("d");System.out.println(sb1 + " " + sb2 + " " + (sb1==sb2));}}Which are true? (Choose all that apply.)
Compilation fails
The first line of output is abc abc false
The first line of output is abcd abc false//
The second line of output is abcd abc false
ADD
Consider the following code and choose the correct option:class Test { public static void main(String args[]) { String name=new String("batman"); int ibegin=1; char iend=3; System.out.println(name.substring(ibegin, iend)); } }
bat
at//
atm
Compilation error
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String data="78"; System.out.println(data.append("abc")); }}
78abc
abc78
Compilation error//
Compiles but exception at run time
ADD
Given: String test = "This is a test"; String[] tokens = test.split("\s"); System.out.println(tokens.length);What is the result?
1
4
Compilation fails.//
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { StringBuffer sb = new StringBuffer("antarctica"); sb.reverse(); sb.insert(4, 'r'); sb.replace(2, 4, "c"); System.out.println(sb); }}
acitcratna
acitrcratna
accircratna
accrcratna//
ADD
Consider the following code and choose the correct option:class Test { public static void main(String[] args) { new Test().display("hi", 1); new Test().display("hi", "world", 2); } public void display(String... s, int x) { System.out.print(s[s.length-x] + " "); } }
hi hi
hi world
world
Compilation error///
ADD
What does this code write: StringTokenizer stuff = new StringTokenizer( "abc def+ghi", "+");System.out.println( stuff.nextToken() );System.out.println( stuff.nextToken() );
abc def
abc def ghi///
abc def +
abc def +ghi
ADD
Consider the following code and choose the correct option:class Test { public static void main(String args[]) { String s1 = "abc"; String s2 = "def"; String s3 = s1.concat(s2.toUpperCase( ) ); System.out.println(s1+s2+s3); } }
abcdefabcdef
abcabcDEFDEF
abcdefabcDEF//
none of the listed options
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String name="Anthony Gomes"; int a=111; System.out.println(name.indexOf(a)); }}
4//
2
6
Compilation error
ADD
class StringManipulation{public static void main(String[] args){String str = new String("Cognizant");str.concat(" Technology");StringBuffer sbf = new StringBuffer(" Solutions");System.out.println(str+sbf);}}consider the code above & select the proper output from the options.
Cognizant Technology Solutions
Cognizant Technology
Cognizant Solutions//
Technology Solutions
ADD
What is the result of the following: String ring = "One ring to rule them all,\n";String find = "One ring to find them.";if ( ring.startsWith("One") && find.startsWith("One") ) System.out.println( ring+find );else System.out.println( "Different Starts" );
One ring to rule them all, One ring to find them.//
One ring to rule them all, One ring to find them.
One ring to rule them all,\n One ring to find them.
Different Starts
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String name="Anthony Gomes"; System.out.println(name.replace('n', name.charAt(3)).compareTo(name)); }}
-6
6
Compilation error
ADD
Consider the following code and choose the correct option:class MyClass {String str1="str1";String str2 ="str2";String str3="str3";str1.concat(str2);System.out.println(str3.concat(str1));}}
The code will fail to compile because the expression str3.concat(str1) will not result in a valid argument for the println() method
The program will print str3str1str2,when run
The program will print str3,when run
The program will print str3str1,when run//
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { StringBuffer sb = new StringBuffer("antarctica"); sb.delete(0,6); System.out.println(sb); }}
tica//
anta
Compilation error
Complies but exception at run time
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { String data="7882"; data+=32; System.out.println(data); }}
788232//
7914
Compilation error
Compiles but exception at run time
ADD
class X2 { public X2 x; public static void main(String [] args) { X2 x2 = new X2(); /* Line 6 */ X2 x3 = new X2(); /* Line 7 */ x2.x = x3; x3.x = x2; x2 = new X2(); x3 = x2; /* Line 11 */ }}after line 11 runs, how many objects are eligible for garbage collection?
1
2///
3
ADD
Which statement is true?A. A class's finalize() method CANNOT be invoked explicitly.B. super.finalize() is called implicitly by any overriding finalize() method.C. The finalize() method for a given object is called no more than once by the garbage collector.D. The order in which finalize() is called on two objects is based on the order in which the twoobjects became finalizable.
A
B
C//
D
ADD
Which of the following allows a programmer to destroy an object x?
x.delete()
x.finalize()
Runtime.getRuntime().gc()
Only the garbage collection system can destroy an object.//
ADD
Given :public class MainOne { public static void main(String args[]) { String str = "this is java"; System.out.println(removeChar(str,'s')); } public static String removeChar(String s, char c) { String r = ""; for (int i = 0; i < s.length(); i++) { if (s.charAt(i) != c) r += s.charAt(i); } return r; } } What would be the result?
This is java
Thi is java
This i java
Thi i java//
ADD
Consider the following code and choose the correct option:public class X { public static void main(String [] args) { X x = new X(); X x2 = m1(x); /* Line 6 */ X x4 = new X(); x2 = x4; /* Line 8 */ doComplexStuff(); } static X m1(X mx) { mx = new X(); return mx; }}After line 8 runs. how many objects are eligible for garbage collection?
1//
2
3
ADD
How can you force garbage collection of an object?
Garbage collection cannot be forced//
Call System.gc()
Call System.gc() passing in a reference to the object to be garbage collected
Call Runtime.gc().
ADD
Which statements describe guaranteed behaviour of the garbage collection and finalization mechanisms? (Choose TWO)
An object is deleted as soon as there are no more references that denote the object
The finilize() method will eventually be called on every object
The finalize() method will never be called more than once on an object//
An object will not be garbage collected as long as it possible for a live thread to access it through a reference.//
ADD
Examine the following code: int count = 1; while ( ___________ ) { System.out.print( count + " " ); count = count + 1; } System.out.println( );What condition should be used so that the code prints: 1 2 3 4 5 6 7 8
count < 9//
count+1 <= 8
count < 8
count != 8
ADD
Given: public class Breaker2 { static String o = ""; public static void main(String[] args) { z: for(int x = 2; x < 7; x++) { if(x==3) continue; if(x==5) break z; o = o + x; } System.out.println(o); } }What is the result?
2
24//
234
246
ADD
Consider the following code and choose the correct option:class Test{ public static void main(String args[]){ String hexa = "0XFF"; int number = Integer.decode(hexa); System.out.println(number); }}
Compilation error
1515
255//
Compiles but error at run time
ADD
Given: class Atom { Atom() { System.out.print("atom "); } } class Rock extends Atom { Rock(String type) { System.out.print(type); }} public class Mountain extends Rock { Mountain() { super("granite "); new Rock("granite "); } public static void main(String[] a) { new Mountain(); } }What is the result?
Compilation fails.
granite granite
atom granite granite
atom granite atom granite///
ADD
Which of the following statements about arrays is syntactically wrong?
Person[] p [];
Person p[][] = new Person[2][];
Person[] p = new Person[5];
Person p[5];//
ADD
Given: public class Barn { public static void main(String[] args) { new Barn().go("hi", 1); new Barn().go("hi", "world", 2); } public void go(String... y, int x) { System.out.print(y[y.length - 1] + " "); } }What is the result?
hi hi
hi world
world world
Compilation fails.//
ADD
Given:int n = 10;switch(n){case 10: n = n + 1;case 15: n = n + 2;case 20: n = n + 3;case 25: n = n + 4;case 30: n = n + 5;}System.out.println(n);What is the value of ’n’ after executing the following code?
23
32
25//
Compilation Error
ADD
Given: public void go() { String o = ""; z: for(int x = 0; x < 3; x++) { for(int y = 0; y < 2; y++) { if(x==1) break; if(x==2 && y==1) break z; o = o + x + y; } } System.out.println(o); }What is the result when the go() method is invoked?
00
0001
000120//
00012021
ADD
What will be the output of the program? public class Switch2 { final static short x = 2; public static int y = 0; public static void main(String [] args) { for (int z=0; z < 3; z++) { switch (z) { case y: System.out.print("0 "); /* Line 11 */ case x-1: System.out.print("1 "); /* Line 12 */ case x: System.out.print("2 "); /* Line 13 */ } } }}
0 1 2
0 1 2 1 2 2
Compilation fails at line 11//
Compilation fails at line 12.
ADD
Consider the following code and choose the correct output:class Test{ public static void main(String args[]){ int a=5; if(a=3){ System.out.print("Three");}else{ System.out.print("Five");}}}
Compilation error//
Compiles but no output
Five
Three
ADD
public void foo( boolean a, boolean b){ if( a ) { System.out.println("A"); /* Line 5 */ } else if(a && b) /* Line 7 */ { System.out.println( "A && B"); } else /* Line 11 */ { if ( !b ) { System.out.println( "notB") ; } else { System.out.println( "ELSE" ) ; } } }What would be the result?
If a is true and b is false then the output is "notB"
If a is true and b is true then the output is "A && B"
If a is false and b is false then the output is "ELSE"
If a is false and b is true then the output is "ELSE"//
ADD
Consider the following code and choose the correct option: class Test{ public static void main(String args[]){ Long l=0l; System.out.println(l.equals(0));}}
Compilation error
true
false//
1
ADD
Consider the following code and choose the correct output:class Test{ public static void main(String args[]){ boolean flag=true; if(flag=false){ System.out.print("TRUE");}else{ System.out.print("FALSE");}}}
true
false//
compilation error
Compiles
ADD
class Test{ public static void main(String[] args) { int x=-1,y=-1; if(++x=++y) System.out.println("R.T. Ponting"); else System.out.println("C.H. Gayle"); }}consider the code above & select the proper output from the options.
R.T.Ponting
C.H.Gayle
Compile error///
none of the listed options
ADD
Given: public class Batman { int squares = 81; public static void main(String[] args) { new Batman().go(); } void go() { incr(++squares); System.out.println(squares); } void incr(int squares) { squares += 10; } }What is the result?
81
91
92
82///
ADD
Consider the following code and choose the correct option:class Test{ public static void main(String args[]){ int l=7; Long L = (Long)l; System.out.println(L); }}
7
Compilation error//
Compiles but error at run time
None of the listed options
ADD
public class SwitchTest { public static void main(String[] args) { System.out.println("value =" + switchIt(4)); } public static int switchIt(int x) { int j = 1; switch (x) { case 1: j++; case 2: j++; case 3: j++; case 4: j++; case 5: j++; default: j++; } return j + x; } }What will be the output of the program?
value = 6
value = 4
value = 2
value = 8//
ADD
Given: import java.util.*; public class Explorer3 { public static void main(String[] args) { TreeSet<Integer> s = new TreeSet<Integer>(); TreeSet<Integer> subs = new TreeSet<Integer>(); for(int i = 606; i < 613; i++) if(i%2 == 0) s.add(i); subs = (TreeSet)s.subSet(608, true, 611, true); subs.add(629); System.out.println(s + " " + subs); } }What is the result?
An exception is thrown at runtime.//
[608, 610, 612, 629] [608, 610, 629]
[608, 610, 612, 629] [608, 610]
Compilation fails.
ADD
Consider the code below & select the correct ouput from the options:public class Test{public static void main(String[] args) { String num=""; z: for(int x=0;x<3;x++) for(int y=0;y<2;y++){ if(x==1) break; if(x==2 && y==1) break z; num=num+x+y; }System.out.println(num);}}
0001
000120//
00012021
Compilation error
ADD
What will be the output of the program? int x = 3; int y = 1; if (x = y) /* Line 3 */{ System.out.println("x =" + x); }
x = 1
x = 3
Compilation fails.//
The code runs with no output.
ADD
Given: public static void test(String str) { int check = 4; if (check = str.length()) { System.out.print(str.charAt(check -= 1) +", "); } else { System.out.print(str.charAt(0) + ", "); } }and the invocation: test("four"); test("tee"); test("to");What is the result?
r, t, t,
r, e, o,
Compilation fails.///
An exception is thrown at runtime.
ADD
Which collection implementation is suitable for maintaining an ordered sequence of objects,when objects are frequently inserted in and removed from the middle of the sequence?
TreeMap
HashSet
Vector
LinkedList///
ADD
11. double input = 314159.26;12. NumberFormat nf = NumberFormat.getInstance(Locale.ITALIAN);13. String b;14. //insert code hereWhich code, inserted at line 14, sets the value of b to 314.159,26?
b = nf.parse( input );
b = nf.format( input );//
b = nf.equals( input );
b = nf.parseObject( input );
ADD
int I = 0; outer: while (true) { I++; inner: for (int j = 0; j < 10; j++) { I += j; if (j == 3) continue inner; break outer; } continue outer; }System.out.println(I);What will be thr result?
3
2
4
1///
ADD
What is the range of the random number r generated by the code below?int r = (int)(Math.floor(Math.random() * 8)) + 2;
2 <= r <= 9///
3 <= r <= 10
2<= r <= 10
3 <= r <= 9
ADD
Which of these statements are true?
HashTable is a sub class of Dictionary///
ArrayList is a sub class of Vector
LinkedList is a subclass of ArrayList
Stack is a subclass of Vector///
ADD
public class While { public void loop() { int x= 0; while ( 1 ) /* Line 6 */ { System.out.print("x plus one is " + (x + 1)); /* Line 8 */ } }}Which statement is true?
There are syntax errors on lines 1 and 6
There are syntax errors on lines 1, 6, and 8
There is a syntax error on line 6//
There is a syntax error on line 1
ADD
Cosider the following code and choose the correct option: class Test{ public static void main(String args[]){ System.out.println(Integer.parseInt("2147483648", 10)); }}
Compilation error
2.147483648E9
NumberFormatException at run time///
Compiles but no output
ADD
class AutoBox { public static void main(String args[]) { int i = 10; Integer iOb = 100; i = iOb; System.out.println(i + " " + iOb); } } whether this code work properly, if so what would be the result?
No, Compilation error
Yes, 10, 100
No, Runtime error
Yes, 100, 100///
ADD
Consider the following code and choose the correct output:public class Test{public static void main(String[] args) { int x = 0; int y = 10; do { y--; ++x; } while (x < 5); System.out.print(x + "," + y);}}
5,6
6,5
5,5///
6,6
ADD
Which of the following loop bodies DOES compute the product from 1 to 10 like (1 * 2 * 3 * 4 * 5 *6 * 7 * 8 * 9 * 10)?int s = 1;for (int i = 1; i <= 10; i++){<What to put here?>}
s += i * i;
s++;
s = s + s * i;
s *= i;///
ADD
Which of the following statements are true regarding wrapper classes? (Choose TWO)
String is a wrapper class
Double has a compareTo() method
Character has a intValue() method
Byte extends Number
ADD
import java.util.SortedSet;import java.util.TreeSet;public class Main { public static void main(String[] args) { TreeSet<String> tSet = new TreeSet<String>(); tSet.add("1"); tSet.add("2"); tSet.add("3"); tSet.add("4"); tSet.add("5"); SortedSet sortedSet =_____________("3"); System.out.println("Head Set Contains : " + sortedSet); }} What is the missing method in the code to get the head set of the tree set?
tSet.headSet
tset.headset
headSet
HeadSet
ADD
What will be the output of following code? TreeSet map = new TreeSet();map.add("one");map.add("two");map.add("three");map.add("four");map.add("one");Iterator it = map.iterator();while (it.hasNext() ) { System.out.print( it.next() + " " );}
one two three four
four three two one
four one three two
one two three four one
ADD
Consider the following code and choose the correct option: class Test{ public static void main(String args[]){ Long data=23; System.out.println(data); }}
23
Compilation error
Compiles but error at run time
None of the listed options
ADD
Which statements are true about maps? (Choose TWO)
The return type of the values() method is set
Changes made in the Set view returned by keySet() will be reflected in the original map///
The Map interface extends the Collection interface
All keys in a map are unique///
ADD
Given: public class Test { public enum Dogs {collie, harrier, shepherd}; public static void main(String [] args) { Dogs myDog = Dogs.shepherd; switch (myDog) { case collie: System.out.print("collie "); case default: System.out.print("retriever "); case harrier: System.out.print("harrier "); } } }What is the result?
harrier
shepherd
retriever
Compilation fails.//
ADD
Consider the following code and choose the correct option:class Test{ public static void main(String args[]){ Long L = null; long l = L; System.out.println(L); System.out.println(l); }}
0 null
Compiles but error at run time///
Compilation error
null 0
ADD
Consider the following code and choose the correct output:class Test{ public static void main(String args[]){ int num=3; switch(num){ case 1: case 3: case 4: { System.out.println("bat man"); } case 2: case 5: { System.out.println("spider man"); }break; } }}
bat man
Compilation error
bat man spider man//
spider man
ADD
Which of the following statements is TRUE regarding a Java loop?
An overflow error can only occur in a loop
A continue statement doesn’t transfer control to the test statement of the for loop
A loop may have multiple exit points//
If a variable of type int overflows during the execution of a loop, it will cause an exception
ADD
What is the value of ’n’ after executing the following code?int n = 10;int p = n + 5;int q = p - 10;int r = 2 * (p - q);switch(n){case p: n = n + 1;case q: n = n + 2;case r: n = n + 3;default: n = n + 4;}
14
28
Compilation Error///
10
ADD
Given:double height = 5.5; if(height-- >= 5.0) System.out.print("tall "); if(--height >= 4.0) System.out.print("average "); if(height-- >= 3.0) System.out.print("short "); else System.out.print("very short "); }What would be the Result?
very short
average
tall
tall short///
ADD
Consider the following code and choose the correct option:class Test{public static void main(String ar[]){ TreeMap<Integer,String> tree = new TreeMap<Integer,String>(); tree.put(1, "one"); tree.put(2, "two"); tree.put(3, "three"); tree.put(4,"Four"); System.out.println(tree.higherKey(2)); System.out.println(tree.ceilingKey(2)); System.out.println(tree.floorKey(1)); System.out.println(tree.lowerKey(1));}}
2 2 1 1
3 2 1 null///
4 2 1 1
3 2 1 1
ADD
What is the output of the following code :class try1{ public static void main(String[] args) { System.out.println("good"); while(false){ System.out.println("morning"); } }}
good
good morning morning ….
compiler error///
runtime error
ADD
Consider the following code and choose the correct output:class Test{ public static void main(String args[]){ int num='b'; switch(num){ default :{ System.out.print("default");} case 100 : case 'b' : case 'c' : { System.out.println("brownie"); break;} case 200: case 'e': { System.out.println("pastry"); }break; } }}
default
default brownie
compilation error
brownie///
ADD
What does the following code fragment write to the monitor? int sum = 21; if ( sum != 20 ) System.out.print("You win ");else System.out.print("You lose ");System.out.println("the prize.");What does the code fragment prints?
You win
You lose
You win the prize///
You lose the prize.
ADD
what will be the result of attempting to compile and run the following class?Public class IFTest{public static void main(String[] args){int i=10;if(i==10) if(i<10)System.out.println("a");elseSystem.out.println("b");}}
The code will fail to compile because the syntax of the if statement is incorrect
The code will fail to compile because the compiler will not be able to determine which if statement the else clause belongs to
The code will compile correctly and display the letter a,when run
The code will compile correctly and display the letter b,when run///
ADD
Given:static void myFunc() { int i, s = 0; for (int j = 0; j < 7; j++) { i = 0; do { i++; s++; } while (i < j); } System.out.println(s); } } What would be the result
20
21
22///
23
ADD
Choose TWO correct options:
To write an object to a file, you use the class ObjectFileWriter
To write characters to an outputstream, you have to make use of the class CharacterOutputStream.
OutputStream is the abstract superclass of all classes that represent an outputstream of bytes.////
Subclasses of the class Reader are used to read character streams.////
ADD
Consider the following code and choose the correct output:class Test{ public static void main(String args[]){ int num=3; switch(num){ default :{ System.out.print("default");} case 1: case 3: case 4: { System.out.println("apple"); break;} case 2: case 5: { System.out.println("black berry"); }break; } }}
compilation error
apple////
default
default apple
ADD
switch(x) { default: System.out.println("Hello"); }Which of the following are acceptable types for x? 1.byte 2.long 3.char 4.float 5.Short 6.Long
2 and 4
1 ,3 and 5////
3 and 5
4 and 6
ADD
What is the output :class One{ public static void main(String[] args) { int a=100; if(a>10) System.out.println("M.S.Dhoni"); else if(a>20) System.out.println("Sachin"); else if(a>30) System.out.println("Virat Kohli");} }
M.S.Dhoni////
all of these
Virat Kohli
M.S.Dhoni Sachin Virat Kohli
ADD
What is the output :class Test{ public static void main(String[] args) { int a=5,b=10,c=1; if(a>c){ System.out.println("success"); } else{ break; } } }
none of the listed options
runtime error
compiler error////
success
ADD
Consider the following code and choose the correct option:class Test{ public static void main(String args[]){ int x=034; int y=12; int ans=x+y; System.out.println(ans); }}
Compiles but error at run time
46
compilation error
40////
ADD
Given: public class Test { public enum Dogs {collie, harrier}; public static void main(String [] args) { Dogs myDog = Dogs.collie; switch (myDog) { case collie: System.out.print("collie "); case harrier: System.out.print("harrier "); } } }What is the result?
collie
harrier
Compilation fails.
collie harrier////
ADD
What will be the output of following code? import java.util.*; class I { public static void main (String[] args) { Object i = new ArrayList().iterator(); System.out.print((i instanceof List)+","); System.out.print((i instanceof Iterator)+","); System.out.print(i instanceof ListIterator); } }
Prints: false, false, false
Prints: false, false, true
Prints: false, true, false////
Prints: false, true, true
ADD
public class Test { public static void main(String [] args) { int x = 5; boolean b1 = true; boolean b2 = false; if ((x == 4) && !b2 ) System.out.print("1 "); System.out.print("2 "); if ((b2 = true) && b1 )System.out.print("3 "); } }What is the result?
1 2 3
3
2
2 3////
ADD
Given: int a = 5;int b = 5;int c = 5;if (a > 3)if (b > 4)if (c > 5)c += 1;elsec += 2;elsec += 3;c += 4;What is the value of variable c after executing the following code?
9
5
3
11////
ADD
Given: Float pi = new Float(3.14f); if (pi > 3) { System.out.print("pi is bigger than 3. "); } else { System.out.print("pi is not bigger than 3. "); } finally { System.out.println("Have a nice day."); }What is the result?
Compilation fails.////
pi is bigger than 3.
An exception occurs at runtime.
pi is bigger than 3. Have a nice day.
ADD
Consider the following code and choose the correct option:int i = l, j = -1; switch (i) { case 0, 1: j = 1; case 2: j = 2; default: j = 0; } System.out.println("j = " + j);
Compilation fails////
j = -1
j = 0
j = 1
ADD
What is the output :class try1{ public static void main(String[] args) { int x=1; if(x--) System.out.println("good"); else System.out.println("bad"); } }
run time error
good
compile error///
bad
ADD
Given: int x = 0; int y = 10; do { y--; ++x; } while (x < 5); System.out.print(x + "," + y);What is the result?
5,6
5,5///
6,5
6,6
ADD
What are the thing to be placed to complete the code?class Wrap { public static void main(String args[]) { _______________ iOb = ___________ Integer(100); int i = iOb.intValue(); System.out.println(i + " " + iOb); // displays 100 100 }}
int, int
Integer, new///
Integer, int
int, Integer
ADD
Which of the following options give the valid package names? (Choose 3)
dollorpack.$pack.$$pack////
$$.$$.$$///
_score.pack.__pack///
p@ckage.subp@ckage.innerp@ckage
ADD
The term 'Java Platform' refers to ________________.
Java Compiler (Javac)
Java Runtime Environment (JRE)////
Java Database Connectivity (JDBC)
Java Debugger
ADD
Which of the following statement gives the use of CLASSPATH?
Holds the location of Core Java Class Library (Bootstrap classes)
Holds the location of Java Extension Library
Holds the location of User Defined classes, packages and JARs///
Holds the location of Java Software
ADD
Which of the following options give the valid argument types for main() method? (Choose 2)
String[] args///
String args[]////
String [][]args
String args
ADD
Which of the following are true about packages? (Choose 2)
Packages can contain only Java Source files
Packages can contain both Classes and Interfaces (Compiled Classes)///
Packages can contain non-java elements such as images, xml files etc.////
Sub packages should be declared as private in order to deny importing them
ADD
Which of the following statements are true regarding java.lang.Object class? (Choose 2)
Object class is an abstract class
Object class cannot be instantiated directly
Object class has the core methods for thread synchronization///
Object class provides the method for Set implementation in Collection framework////
ADD
Which of the following option gives one possible use of the statement 'the name of the public class should match with its file name'?
To maintain the uniform standard
Helps the compiler to find the source file that corresponds to a class, when it does not find a class file while compiling////
Helps JVM to find and execute the classes
Helps Javadoc to build the Java Documentation easily
ADD
Consider the following code and choose the correct option:class Cthread extends Thread{ Cthread(){start();} public void run(){ System.out.print("Hi");}public static void main (String args[]){ Cthread th1=new Cthread();Cthread th2=new Cthread();}}
compilation error
will display Hi once
will create two child threads and display Hi twice///
will not create any child thread
ADD
public class MyRunnable implements Runnable { public void run() { // some code here }}which of these will create and start this thread?
new Thread(MyRunnable).run();
new MyRunnable().start();
new Runnable(MyRunnable).start();
new Thread(new MyRunnable()).start();////
ADD
Consider the following code and choose the correct option:class Nthread extends Thread{ public void run(){ System.out.print("Hi");} public static void main(String args[]){ Nthread th1=new Nthread(); Nthread th2=new Nthread();}
will not create any child thread////
Will create two child threads and display Hi twice
will display Hi once
compilation error
ADD
Consider the following code and choose the correct option:class Cthread extends Thread{ public void run(){ System.out.print("Hi");}public static void main (String args[]){ Cthread th1=new Cthread(); th1.run(); th1.start();th1.run();}}
will print Hi twice and throws Exception at run time
will print Hi Thrice////
Compilation error
will print Hi once
ADD
The following block of code creates a Thread using a Runnable target: Runnable target = new MyRunnable();Thread myThread = new Thread(target);Which of the following classes can be used to create the target, so that the preceding code compiles correctly?
public class MyRunnable extends Runnable{public void run(){}}
public class MyRunnable implements Runnable{void run(){}}
public class MyRunnable extends Object{public void run(){}}
public class MyRunnable implements Runnable{public void run(){}}////
ADD
What will be the output of the program? class MyThread extends Thread { MyThread() {} MyThread(Runnable r) {super(r); } public void run() { System.out.print("Inside Thread "); } } class MyRunnable implements Runnable { public void run() { System.out.print(" Inside Runnable"); } } class Test { public static void main(String[] args) { new MyThread().start(); new MyThread(new MyRunnable()).start(); } }
Prints "Inside Thread Inside Thread"////
Prints "Inside Thread Inside Runnable"
Does not compile
Throws exception at runtime
ADD
Which of the following methods are defined in class Thread? (Choose TWO)
run()////
notify()
terminate()
wait()
ADD
wait(), notify() and notifyAll() methods belong to ________
Thread class
none of the listed options
Interrupt class
Object class////
ADD
Consider the following code and choose the correct option:class A implements Runnable{ int k;public void run(){k++; } public static void main(String args[]){A a1=new A();a1.run();}
It will start a new thread
compilation error
Compiles but throws run time Exception
a1 is not a Thread///
ADD
class Cthread extends Thread{ public void run(){ System.out.print("Hi");}public static void main (String args[]){ Cthread th1=new Cthread(); th1.run(); th1.start(); th1.start();}}
will print Hi twice and throws exception at runtime///
will print Hi Once
will not print
will start two thread
ADD
What will be the output of the program? class MyThread extends Thread { public static void main(String [] args) { MyThread t = new MyThread(); t.start(); System.out.print("one. "); t.start(); System.out.print("two. "); } public void run() { System.out.print("Thread "); }}
Compilation fails
An exception occurs at runtime.////
It prints "Thread one. Thread two."
The output cannot be determined.
ADD
class PingPong2 {synchronized void hit(long n) {for(int i = 1; i < 3; i++)System.out.print(n + "-" + i + " ");}} public class Tester implements Runnable { static PingPong2 pp2 = new PingPong2(); public static void main(String[] args) { new Thread(new Tester()).start(); new Thread(new Tester()).start(); } public void run() { pp2.hit(Thread.currentThread().getId()); } }Which statement is true?
The output could be 6-1 6-2 5-1 7-1
The output could be 5-1 6-1 6-2 5-2
The output could be 6-1 5-2 6-2 5-1
The output could be 6-1 6-2 5-1 5-2///
ADD
Given: public class Threads4 { public static void main (String[] args) { new Threads4().go(); } public void go() { Runnable r = new Runnable() { public void run() { System.out.print("run"); } }; Thread t = new Thread(r); t.start(); t.start(); } }What is the result?
Compilation fails.
The code executes normally, but nothing is printed.
An exception is thrown at runtime.////
The code executes normally and prints "run".
ADD
A) Multiple processes share same memory locationB) Switching from one thread to another is easier than switching from one process to anotherC) Thread makes it possible to maximize resource utilizationD) Process is a light weight program
Only C and D is TRUE
Only A and B is TRUE
Only B and C is TRUE////
All are FALSE
ADD
Which of the following methods registers a thread in a thread scheduler?
start();////
register();
construct();
run();
ADD
Which of the following statements can be used to create a new Thread? (Choose TWO)
Implement java.lang.Thread and implement the run() method.
Implement java.lang.Thread and implement the start() method.
Implement java.lang.Runnable and implement the run() method///
Extend java.lang.Thread and override the run() method.////
ADD
class Thread2 { public static void main(String[] args) { new Thread2().go(); } public void go(){ Runnable rn=new Runnable(){ public void run(){ System.out.println("Good Day.."); } }; Thread t=new Thread(rn); t.start(); }}what should be the correct output for the code written above?
An exception is thrown at runtime.
Compilation fails.
The code executes normally and prints "Good Day.."/////
prints Good Day.. Twice
ADD
Assume the following method is properly synchronized and called from a thread A on an object B:wait(2000);After calling this method, when will the thread A become a candidate to get another turn at the CPU?
After thread A is notified, or after two seconds.////
Two seconds after thread A is notified.
Two seconds after lock B is released.
After the lock on B is released, or after two seconds.
ADD
A) Exception is the superclass of all errors and exceptions in the java languageB) RuntimeException and its subclasses are unchecked exception.
Both A and B are TRUE
Only B is TRUE/////
Only A is TRUE
Both A and B are FALSE
ADD
Select the variable which are in java.lang.annotation.RetentionPolicy class. (Choose THREE)
METHOD
SOURCE///
CLASS///
RUNTIME////
ADD
Custom annotations can be created using
@interface
@inherit
@include
all the listed options
ADD
Choose the meta annotations. (Choose THREE)
Override
Retention//
Depricated
Documented//
ADD
All annotation types should maually extend the Annotation interface. State TRUE/FALSE
true
false//
ADD
If no retention policy is specified for an annotation, then the default policy of __________ is used.
method
class//
source
runtime
ADD
Select the Uses of annotations. (Choose THREE)
Information For the Compiler//
Information for the JVM
Compile time and deploytime processing//
Runtime processing//
ADD
Which of the following is not an attribute of object?
State
Behaviour
Inheritance
Identity///
ADD
What is the advantage of runtime polymorphism?
Efficient utilization of memory at runtime
Code reuse
Code flexibility at runtime///
avoiding method name confusion at runtime
ADD
Which of the following is an example of IS A relationship?
Ford - Car///
Microprocessor - Computer
Tea -Cup
Driver -Car
ADD
Which of following set of functions are example of method overloading
void add(int x,int y) char add(int x,int y)
char add(float x) char add(float y)
void add(int x,int y) char add(char x,char y)///
void add(int x,int y) void sum(double x,double y)
ADD
Which of the following is not a valid relation between classes?
Composition
Inheritance
Instantiation
Segmentation///
ADD
Choose the correct option:
A try statement must have at least one corresponding catch block
Multiple catch statements can catch the same class of exception more than once.
An Error that might be thrown in a method must be declared as thrown by that method, or be handled within that method.
Except in case of VM shutdown, if a try block starts to execute, a corresponding finally block will always start to execute.///
ADD
consider the code & choose the correct output:class Threads2 implements Runnable { public void run() { System.out.println("run."); throw new RuntimeException("Problem"); } public static void main(String[] args) { Thread t = new Thread(new Threads2()); t.start(); System.out.println("End of method."); } }
End of method. java.lang.RuntimeException: Problem
java.lang.RuntimeException: Problem
End of method. run. java.lang.RuntimeException: Problem///
run java.lang.RuntimeException: Problem
ADD
Consider the following code:System.out.print("Start ");try { System.out.print("Hello world"); throw new FileNotFoundException();}System.out.print(" Catch Here "); /* Line 7 */catch(EOFException e) { System.out.print("End of file exception");}catch(FileNotFoundException e) { System.out.print("File not found");}given that EOFException and FileNotFoundException are both subclasses of IOException. If this block of code is pasted in a method, choose the best option.
Code output: Start Hello world End of file exception.
Code output: Start Hello world Catch Here File not found.
Code output: Start Hello world File Not Found
The code will not compile./////
ADD
Given:public class ExceptionTest { class TestException extends Exception {} public void runTest() throws TestException {} public void test() /* Line X */ { runTest(); } }At Line X, which code is necessary to make the code compile?
throw Exception
throws Exception///
No code is necessary
throws RuntimeException
ADD
Consider the following code and choose the correct option:class Test{ public static void parse(String str) { try { int num = Integer.parseInt(str); } catch (NumberFormatException nfe) { num = 0; } finally { System.out.println(num); } } public static void main(String[] args) { parse("one"); }
Compilation fails////
ParseException thrown at runtime
NumberFormatException thrown at runtime
ADD
Which of the following statements is true?
Any statement that can throw an Error must be enclosed in a try block.
Any statement that can throw an Exception must be enclosed in a try block.
catch(X x) can catch subclasses of X where X is a subclass of Exception.////
The Error class is a RuntimeException.
ADD
class Trial{public static void main(String[] args){try{System.out.println("One");int y = 2 / 0;System.out.println("Two");} catch(RuntimeException ex){System.out.println("Catch");} finally{System.out.println("Finally");}} }
One Two Catch Finally
One Catch
One Catch Finally////
One Two Catch
ADD
State True or False:The main() method of a program can declare that it throws checked exception.
true////
False
ADD
Given: static void test() { try { String x = null; System.out.print(x.toString() + " "); } finally { System.out.print("finally "); } } public static void main(String[] args) { try { test(); } catch (Exception ex) { System.out.print("exception "); } }What is the result?
Compilation fails.
finally exception////
finally
null
ADD
Which statement is true?
The notifyAll() method must be called from a synchronized context////
To call sleep(), a thread must own the lock on the object
The notify() method is defined in class java.lang.Thread
The notify() method causes a thread to immediately release its locks.
ADD
Which of the following is a checked exception?
Arithmetic Exception
IOException///
NullPointerException
ArrayIndexOutOfBoundsException
ADD
Given: public void testIfA() { if (testIfB("True")) { System.out.println("True"); } else { System.out.println("Not true"); } } public Boolean testIfB(String str) { return Boolean.valueOf(str); }What is the result when method testIfA is invoked?
true////
Not true
An exception is thrown at runtime.
none
ADD
Given the following program,which statements is true? Public class Exception { public static void main(String[] args) { try { if(args.length == 0) return;System.out.println(args[0]);}finally {System.out.println("The end");}}}
If run with no arguments,the program will produce no output
If run with no arguments,the program will produce "The end"/////
The program will throw an ArrayIndexOutOfBoundsException
If run with one arguments,the program will simply print the given argument
ADD
Consider the following code and choose the correct option:int array[] = new int[10];array[-1] = 0;
none of the listed options
runtime error///
does not compile
compiles successfully
ADD
class PropagateException{public static void main(String[] args){try{method();System.out.println("method() called");}catch(ArithmeticException ex){System.out.println("Arithmetic Exception");}catch(RuntimeException re){System.out.println("Runtime Exception");}}static void method(){int y = 2 / 0;}}consider the code above & select the proper output from the options.
Arithmetic Exception Runtime Exception
Runtime Exception
Arithmetic Exception///
compilation error
ADD
Which statement is true?
A static method cannot be synchronized.
If a class has synchronized code, multiple threads can still access the nonsynchronized code.////
Variables can be protected from concurrent access problems by marking them with the synchronized keyword.
When a thread sleeps, it releases its locks
ADD
What is wrong with the following code?Class MyException extends Exception{}public class Test{public void foo() {try {bar();} finally {baz();} catch(MyException e) {}}public void bar() throws MyException {throw new MyException();}public void baz() throws RuntimeException {throw new RuntimeException();}}
Since the method foo() does not catch the exception generated by the method baz(),it must declare the RuntimeException in a throws clause
A try block cannot be followed by both a catch and a finally block
An empty catch block is not allowed
A catch block cannot follow a finally block///
ADD
The exceptions for which the compiler doesn’t enforce the handle or declare rule
Checked exceptions
Unchecked exceptions////
Exception
all of these
ADD
Consider the following code and choose the correct option:class Test{ static void display(){ throw new RuntimeException(); } public static void main(String args[]){ try{display(); }catch(Exception e){ throw new NullPointerException();} finally{try{ display(); }catch(NullPointerException e){ System.out.println("caught");} finally{ System.out.println("exit");}}}}
caught exit
exit RuntimeException thrown at run time////
Compilation fails
exit
ADD
class X implements Runnable { public static void main(String args[]) { /* Missing code? */ } public void run() {} }Which of the following line of code is suitable to start a thread ?
Thread t = new Thread(); x.run();
Thread t = new Thread(X);
X run = new X(); Thread t = new Thread(run); t.start();////
Thread t = new Thread(X); t.start();
ADD
Which two can be used to create a new Thread?
Implement java.lang.Runnable and implement the run() method.////
Extend java.lang.Thread and override the run() method.///
Implement java.lang.Thread and implement the start() method.
Extend java.lang.Runnable and override the start() method.
ADD
Which four can be thrown using the throw statement? 1.Error 2.Event 3.Object 4.Throwable 5.Exception 6.RuntimeException
1, 4, 5 and 6///
1, 2, 3 and 4
2, 4, 5 and 6
2, 3, 4 and 5
ADD
Which of the following statements regarding static methods are correct? (2 answers)
static methods are difficult to maintain, because you can not change their implementation.
static methods can be called using an object reference to an object of the class in which this method is defined.///
static methods are always public, because they are defined at class-level.
static methods do not have direct access to non-static methods which are defined inside the same class.///
ADD
In the given code snippettry { int a = Integer.parseInt("one"); }what is used to create an appropriate catch block? (Choose all that apply.)A. ClassCastExceptionB. IllegalStateExceptionC. NumberFormatExceptionD. IllegalArgumentException
ClassCastException
NumberFormatException///
IllegalStateException
IllegalArgumentException///
ADD
Which of the following methods are static?
sleep()//
yield()///
join()
start()
ADD
class Trial{public static void main(String[] args){try{System.out.println("Try Block");} finally{System.out.println("Finally Block");}} }
Try Block Finally Block///
Try Block
Finally Block Try Block
Finally Block
ADD
class Animal { public String noise() { return "peep"; } } class Dog extends Animal { public String noise() { return "bark"; } } class Cat extends Animal { public String noise() { return "meow"; } }class try1{public static void main(String[] args){Animal animal = new Dog(); Cat cat = (Cat)animal; System.out.println(cat.noise());}}consider the code above & select the proper output from the options.
bark
meow
Compilation fails
An exception is thrown at runtime.////
ADD
Consider the following code and choose the correct option:class Test{ static void display(){ throw new RuntimeException(); } public static void main(String args[]){ try{ display(); }catch(Exception e){ throw new NullPointerException();} finally{try{ display(); }catch(NullPointerException e){ System.out.println("caught");}System.out.println("exit");}}}
caught exit
exit
Compilation fails
Compiles but exception at runtime////
ADD
Consider the following code and choose the correct option:class Test{static void test() throws RuntimeException { try { System.out.print("test "); throw new RuntimeException(); } catch (Exception ex) { System.out.print("exception "); } } public static void main(String[] args) { try { test(); } catch (RuntimeException ex) { System.out.print("runtime "); } System.out.print("end"); } }
test end
test runtime end
test exception runtime end
test exception end/////
ADD
class Test{public static void main(String[] args){try{Integer.parseInt("1.0");}catch(Exception e){System.out.println("Exception occurred");}catch(RuntimeException ex){System.out.println("RuntimeException");}} }consider the code above & select the proper output from the options.
Exception occurred
RuntimeException
Exception occurred RuntimeException
does not compile////
ADD
Which of the following statements are true? (Choose TWO)
Deadlock will not occur if wait()/notify() is used
The wait() method is overloaded to accept a duration///
A thread will resume execution as soon as its sleep duration expires.////
The notify() method is overloaded to accept a duration
ADD
class s implements Runnable { int x, y; public void run() { for(int i = 0; i < 1000; i++) synchronized(this) { x = 12; y = 12; } System.out.print(x + " " + y + " "); } public static void main(String args[]) { s run = new s(); Thread t1 = new Thread(run); Thread t2 = new Thread(run); t1.start(); t2.start(); } } What is the output?
prints 12 12 12 12///
DeadLock
Cannot determine output.
Compilation Error
ADD
Which can appropriately be thrown by a programmer using Java SE technology to createa desktop application?
ClassCastException
NullPointerException
NoClassDefFoundError
NumberFormatException////
ADD
What is the keyword to use when the access of a method has to be restricted to only one thread at a time
volatile
synchronized////
final
private
ADD
What will be the output of the program? public class RTExcept { public static void throwit () { System.out.print("throwit "); throw new RuntimeException(); } public static void main(String [] args) { try { System.out.print("hello "); throwit(); } catch (Exception re ) { System.out.print("caught "); } finally { System.out.print("finally "); } System.out.println("after "); }}
hello throwit caught
Compilation fails
hello throwit RuntimeException caught after
hello throwit caught finally after////
ADD
Consider the code below & select the correct ouput from the options:public class Test{ Integer i; int x; Test(int y){ x=i+y; System.out.println(x); }public static void main(String[] args) { new Test(new Integer(5));}}
5
Compilation error
Compiles but error at run time///
ADD
Consider the following code and choose the correct option:class Test{ static void display(){ throw new RuntimeException(); } public static void main(String args[]){ try{display(); }catch(Exception e){ } catch(RuntimeException re){} finally{System.out.println("exit");}}}
exit
Compiles and no output
Compilation fails////
Compiles but exception at runtime
ADD
A) Checked Exception must be explicity caught or propagated to the calling method B) If runtime system can not find an appropriate method to handle the exception, then the runtime system terminates and uses the default exception handler.
Only A is TRUE
Only B is TRUE
Bothe A and B is TRUE///
Both A and B is FALSE
ADD
public class MyProgram { public static void throwit() { throw new RuntimeException(); } public static void main(String args[]) { try { System.out.println("Hello world "); throwit(); System.out.println("Done with try block "); } finally { System.out.println("Finally executing "); } }}which answer most closely indicates the behavior of the program?
The program will not compile.
The program will print Hello world, then will print that a RuntimeException has occurred, then will print Done with try block, and then will print Finally executing.
The program will print Hello world, then will print that a RuntimeException has occurred, and then will print Finally executing.
The program will print Hello world, then will print Finally executing, then will print that a RuntimeException has occurred.////
ADD
If a method is capable of causing an exception that it does not handle, it must specify this behavior using throws so that callers of the method can guard themselves against such Exception
true////
false
ADD
class Trial{public static void main(String[] args){try{System.out.println("Java is portable");} } }
Java is portable
We cannot have a try block without a catch block
We cannot have a try block block without a catch / finally block////
Nothing is diaplayed
ADD
public static void parse(String str) {try {float f = Float.parseFloat(str);} catch (NumberFormatException nfe) {f = 0;} finally {System.out.println(f);}}public static void main(String[] args) {parse("invalid");}
Compilation fails////
A ParseException is thrown by the parse method at runtime.
A NumberFormatException is thrown by the parse method at runtime.
ADD
Which digit,and in what order,will be printed when the following program is run?Public class MyClass { public static void main(String[] args) { int k=0; try { int i=5/k; }catch(ArithmeticException e) { System.out.println("1"); }catch(RuntimeException e) { System.out.println("2"); return; }catch(Exception e) { System.out.println("3"); }finally{System.out.println("4");}System.out.println("5");}}
The program will only print 5
The program will only print 1 and 4 in order
The program will only print 1,2 and 4 in order
The program will only print 1 ,4 and 5 in order////
ADD
Given: public class TestSeven extends Thread { private static int x; public synchronized void doThings() { int current = x; current++; x = current; } public void run() { doThings(); }}Which statement is true?
Synchronizing the run() method would make the class thread-safe.
An exception is thrown at runtime.
Compilation fails.
Declaring the doThings() method as static would make the class thread-safe.///
ADD
Which of the following statements is/are true?Statement 1: Writing finally block is optional.Statement 2: When no exception occurs then complete try block and finally block will execute but no catch block will execute.
Both Statement 1 & Statement 2 are FALSE.
Statement 2 is TRUE but Statement 1 is FALSE.
Both Statement 1 & Statement 2 are TRUE.////
Statement 1 is TRUE but Statement 2 is FALSE.
ADD
Given:class X implements Runnable { public static void main(String args[]) { /* Some code */ } public void run() {} }Which of the following line of code is suitable to start a thread ?
X run = new X(); Thread t = new Thread(run); t.start();///
Thread t = new Thread(X);
Thread t = new Thread(); x.run();
Thread t = new Thread(X); t.start();
ADD
Given: class X { public void foo() { System.out.print("X "); } } public class SubB extends X { public void foo() throws RuntimeException { super.foo(); if (true) throw new RuntimeException(); System.out.print("B "); } public static void main(String[] args) { new SubB().foo(); } }What is the result?
X, followed by an Exception.///
No output, and an Exception is thrown.
X, followed by an Exception, followed by B.
none
ADD
Which three of the following are methods of the Object class? 1.notify(); 2.notifyAll(); 3.isInterrupted(); 4.synchronized(); 5.interrupt(); 6.wait(long msecs); 7.sleep(long msecs); 8.yield();
1, 2, 4
2, 4, 5
1, 2, 6///
2, 3, 4
ADD
public class RTExcept { public static void throwit () { System.out.print("throwit "); throw new RuntimeException(); } public static void main(String [] args) { try { System.out.print("hello "); throwit(); } catch (Exception re ) { System.out.print("caught "); } finally { System.out.print("finally "); } System.out.println("after "); }}
hello throwit caught finally after///
hello throwit caught
hello throwit RuntimeException caught after
Compilation fails
ADD
What will happen when you attempt to compile and run the following code?public class Bground extends Thread{public static void main(String argv[]){ Bground b = new Bground(); b.run(); } public void start(){ for (int i = 0; i <10; i++){ System.out.println("Value of i = " + i); } }}
A compile time error indicating that no run method is defined for the Thread class
A run time error indicating that no run method is defined for the Thread class
Clean compile and at run time the values 0 to 9 are printed out
Clean compile but no output at runtime///
ADD
Given two programs:1. package pkgA;2. public class Abc {3. int a = 5;4. protected int b = 6;5. public int c = 7;6. }3. package pkgB;4. import pkgA.*;5. public class Def {6. public static void main(String[] args) {7. Abc f = new Abc();8. System.out.print(" " + f.a);9. System.out.print(" " + f.b);10. System.out.print(" " + f.c);11. }12. }What is the result when the second program is run? (Choose all that apply)
5 6 7
5 followed by an exception
Compilation fails with an error on line 7
Compilation fails with an error on line 8/////
ADD
What will the output of following code?try { int x = 0; int y = 5 / x; } catch (Exception e) { System.out.println("Exception"); } catch (ArithmeticException ae) { System.out.println(" Arithmetic Exception"); } System.out.println("finished");
finished
Exception
compilation fails////
ArithmeticException
ADD
Given:11. class A {12. public void process() { System.out.print("A,"); }13. class B extends A {14. public void process() throws IOException {15. super.process();16. System.out.print("B,");17. throw new IOException();18. }19. public static void main(String[] args) {20. try { new B().process(); }21. catch (IOException e) { System.out.println("Exception"); }22. }What is the result?
Exception
A,B,Exception
Compilation fails because of an error in line 20.
Compilation fails because of an error in line 14./////
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { File file=new File("D:/jlist.lst"); byte buffer[]=new byte[(int)file.length()+1]; FileInputStream fis=new FileInputStream(file); fis.read(buffer); System.out.println(buffer); }}
reads data from file named jlist.lst in byte form and display it on console.
Compilation error////
reads data from file named jlist.lst in byte form and display garbage value
Compiles but error at runtime
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) throws IOException { File file=new File("D:/jlist.lst"); byte buffer[]=new byte[(int)file.length()+1]; FileInputStream fis=new FileInputStream(file); int ch=0; while((ch=fis.read())!=-1){ System.out.print((char)ch); } }}
reads data from file one byte at a time and display it on the console.////
Compilation error
reads data from file named jlist.lst in byte form and display garbage value
Compiles but error at runtime
ADD
import java.io.EOFException;import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.InputStreamReader;public class MoreEndings {public static void main(String[] args) {try {FileInputStream fis = new FileInputStream("seq.txt");InputStreamReader isr = new InputStreamReader(fis);int i = isr.read();while (i != -1) {System.out.print((char)i + "|");i = isr.read();}} catch (FileNotFoundException fnf) {System.out.println("File not found");} catch (EOFException eofe) {System.out.println("End of stream");} catch (IOException ioe) {System.out.println("Input error");}}}Assume that the file "seq.txt" exists in the current directory, has the requiredaccess permissions, and contains the string "Hello".Which statement about the program is true?
The program will not compile because a certain unchecked exception is not caught.
The program will compile and print H|e|l|l|o|Input error.
The program will compile and print H|e|l|l|o|End of stream.
The program will compile, print H|e|l|l|o|, and then terminate normally.///
ADD
Consider the following code and choose the correct output:public class Person{public void talk(){ System.out.print("I am a Person "); }}public class Student extends Person {public void talk(){ System.out.print("I am a Student "); }}what is the result of this piece of code:public class Test{public static void main(String args[]){Person p = new Student();p.talk();}}
I am a Person
I am a Student////
I am a Person I am a Student
I am a Student I am a Person
ADD
Consider the following code and choose the correct option:public class Test{ public static void main(String[] args) throws IOException { File file = new File("d:/temp.txt"); FileReader reader=new FileReader(file); reader.skip(7); int ch; while((ch=reader.read())!=-1){ System.out.print((char)ch); } }}
Skip the first seven characters and then starts reading file and display it on console////
Compilation error
Compiles and runs without output
Compiles but error at runtime
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) throws IOException { File file=new File("D:/jlist.lst"); byte buffer[]=new byte[(int)file.length()+1]; FileInputStream fis=new FileInputStream(file); fis.read(buffer); System.out.println(new String(buffer)); }}
reads data from file named jlist.lst in byte form and display it on console.////
Compilation error
reads data from file named jlist.lst in byte form and display garbage value
Compiles but error at runtime
ADD
Which of these are two legal ways of accessing a File named "file.tst" for reading. Select the correct option:A)FileReader fr = new FileReader("file.tst"); B)FileInputStream fr = new FileInputStream("file.tst");C)InputStreamReader isr = new InputStreamReader(fr, "UTF8"); D)FileReader fr = new FileReader("file.tst", "UTF8");
A,D
B,C
C,D
A,B////
ADD
Consider the following code and choose the correct option:class std{ int call; std(int c){call=c;} int getCall(){return call;}}public class Test{ public static void main(String[] args) throws IOException { File file=new File("d:/std.txt"); FileOutputStream fos=new FileOutputStream(file); ObjectOutputStream oos=new ObjectOutputStream(fos); std s1=new std(10); oos.writeObject(s1); oos.close(); }}
the state of the object s1 will be store to file std.txt
Compilation error
Compiles but error at run time////
the state of the object s1 will not be store to the file.
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) throws IOException { File file=new File("D:/jlist.lst"); byte buffer[]=new byte[(int)file.length()+1]; FileInputStream fis=new FileInputStream(file); int ch=0; while((ch=fis.read())!=-1){ System.out.print(ch); } }}
reads data from file one byte at a time and display it on the console.
Compilation error
reads data from file named jlist.lst in byte form and ascii value/////
Compiles but error at runtime
ADD
What happens when the constructor for FileInputStream fails to open a file for reading?
throws a DataFormatException
throws a FileNotFoundException////
throws a ArrayIndexOutOfBoundsException
returns null
ADD
import java.io.*;public class MyClass implements Serializable {private Tree tree = new Tree();public static void main(String [] args) {MyClass mc= new MyClass();try {FileOutputStream fs = new FileOutputStream(”MyClass.ser”);ObjectOutputStream os = new ObjectOutputStream(fs);os.writeObject(mc); os.close();} catch (Exception ex) { ex.printStackTrace(); }} }
Compilation fails////
An exception is thrown at runtime
An instance of MyClass is serialized
A instance of MyClass and an instance of Tree are both serialized
ADD
What is the DataOutputStream method that writes double precision floating point values to a stream?
writeBytes()
writeFloat()
write()
writeDouble()/////
ADD
Which of the following opens the file "myData.stuff" for output first deleting any file with that name?
FileOutputStream fos = new FileOutputStream( "myData.stuff", true )
FileOutputStream fos = new FileOutputStream( "myData.stuff")/////
DataOutputStream dos = new DataOutputStream( "myData.stuff" )
FileOutputStream fos = new FileOutputStream( new BufferedOutputStream( "myData.stuff") )
ADD
A file is readable but not writable on the file system of the host platform. What willbe the result of calling the method canWrite() on a File object representing this file?
A SecurityException is thrown
The boolean value false is returned////
The boolean value true is returned
The file is modified from being unwritable to being writable.
ADD
Consider the following code and choose the correct option:public class Test{ public static void main(String[] args) { File dir = new File("dir"); dir.mkdir(); File f1 = new File(dir, "f1.txt"); try { f1.createNewFile(); } catch (IOException e) { ; } File newDir = new File("newDir"); dir.renameTo(newDir);} }
The file system has a new empty directory named dir
The file system has a new empty directory named newDir
The file system has a directory named dir, containing a file f1.txt
The file system has a directory named newDir, containing a file f1.txt////
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) throws IOException { String data="Confidential info"; byte buffer[]=data.getBytes(); FileOutputStream fos=new FileOutputStream("d:/temp"); for(byte d : buffer){ fos.write(d); } }}
writes data to file in byte form.////
Compilation error
writes data to the file in character form.
Compiles but error at runtime
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { File file=new File("d:/prj,d:/lib"); file.mkdirs();}}
creates directories names prj and lib in d: drive
Compilation error
Compiles but error at run time
Compiles and executes but directories are not created////
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) throws IOException { File file=new File("d:/data"); byte buffer[]=new byte[(int)file.length()+1]; FileInputStream fis=new FileInputStream(file); fis.read(buffer); FileWriter fw=new FileWriter("d:/temp.txt"); fw.write(new String(buffer));}}
Transfer content of file data to the temp.txt
Compilation error
Compiles and runs but content not transferred to the temp.txt////
Compiles but error at runtime
ADD
Consider the following code and choose the correct option:class std implements Serializable{ int call; std(int c){call=c;} int getCall(){return call;}}public class Test{ public static void main(String[] args) throws IOException { File file=new File("d:/std.txt"); FileOutputStream fos=new FileOutputStream(file); ObjectOutputStream oos=new ObjectOutputStream(fos); std s1=new std(10); oos.writeObject(s1); oos.close(); }}
the state of the object s1 will be store to file std.txt////
Compilation error
Compiles but error at run time
the state of the object s1 will not be store to the file.
ADD
Given : import java.io.*; public class ReadingFor { public static void main(String[] args) { String s; try { FileReader fr = new FileReader("myfile.txt"); BufferedReader br = new BufferedReader(fr); while((s = br.readLine()) != null) System.out.println(s); br.flush(); } catch (IOException e) { System.out.println("io error"); } }}And given that myfile.txt contains the following two lines of data:abcdWhat is the result?
ab
abcd
ab cd
a b c d///
ADD
Consider the following code and choose the correct option:public class Test { public static void main(String[] args) { File file=new File("d:/prj/lib"); file.mkdirs();}}
creates directory d:/prj/lib////
Compilation error
Compiles but error at run time
Compiles and executes but directory is not created
ADD
import java.io.*;public class MyClass implements Serializable {private int a;public int getA() { return a; }publicMyClass(int a){this.a=a; }private void writeObject( ObjectOutputStream s)throws IOException {// insert code here}}Which code fragment, inserted at line 15, will allow Foo objects to becorrectly serialized and deserialized?
s.writeInt(x);
s.serialize(x);
s.defaultWriteObject();////
s.writeObject(x);
ADD
A) It is not possible to execute select query with execute() methodB) CallableStatement can executes store procedures only but not functions
Both A and B is FALSE///
Only A is TRUE
Only B is TRUE
Both A and B is TRUE
ADD
A) When one use callablestatement, in that case only parameters are send over network not sql query. B) In preparestatement sql query will compile for first time only
Both A and B is FALSE
Only A is TRUE
Only B is TRUE
Both A and B is TRUE///
ADD
getConnection() is method available in?
DriverManager Class///
Driver Interface
ResultSet Interface
Statement Interface
ADD
Sylvy wants to develop Student management system, which requires frequent insert operation about student details. In order to insert student record which statement interface will give good performance
Statement
CallableStatement
PreparedStatement////
RowSet
ADD
Which method will return boolean when we try to execute SQL Query from a JDBC program?
executeUpdate()
executeSQL()
execute()////
executeQuery()
ADD
An application can connect to different Databases at the same time. State TRUE/FALSE.
true////
false
ADD
A) By default, all JDBC transactions are auto commitB) PreparedStatement suitable for dynamic sql and requires one time compilationC) with JDBC it is possible to fetch information about the database
Only A and B is TRUE
Only B and C is True
Both A and C is TRUE
All are TRUE/////
ADD
how to register driver class in the memory?
Using forName() which is a static method
Using the static method registerDriver() method which is available in DriverManager Class.
Either forName() or registerDriver()///
None of the given options
ADD
What is the use of wasNull() in ResultSet interface?
There is no such method in ResultSet interface
It returns true when last read column contain SQL NULL else returns false///
It returns int value as mentioned below: > 0 if many columns Contain Null Value < 0 if no column contains Null Value = 0 if one column contains Null value
none of the listed options
ADD
Which of the following options contains only JDBC interfaces?
1) Driver 2) Connection 3) ResultSet 4) DriverManager 5) Class
1) Driver 2) Connection 3) ResultSet 4) ResultSetMetaData 5) Statement 6) DriverManager 7) PreparedStatement 8) Callablestatement 9) DataBaseMetaData
1) Driver 2) Connection 3) ResultSet 4) ResultSetMetaData 5) Statement 6) PreparedStatement 7) Callablestatement 8) DataBaseMetaData////
All of the given options
ADD
class CreateFile{public static void main(String[] args) {try {File directory = new File("c"); //Line 13File file = new File(directory,"myFile");if(!file.exists()) {file.createNewFile(); //Line 16}}catch(IOException e) {e.printStackTrace }}}}If the current direcory does not consists of directory "c", Which statements are true ? (Choose TWO)
Line 16 is never executed
An exception is thrown at runtime///
Line 13 creates a File object named “c”////
Line 13 creates a directory named “c” in the file system.
ADD
By default all JDBC transactions are autocommit. State TRUE/FALSE.
true////
false
ADD
Give Code snipet:{// SomecodeResultSet rs = st.executeQuery("SELECT * FROM survey"); while (rs.next()) { String name = rs.getString("name"); System.out.println(name); } rs.close();// somecode} What should be imported related to ResultSet?
java.sql.ResultSet///
java.sql.Driver
java.sql.DriverManager
java.sql.Connection
ADD
Consider the following code & select the correct option for output.String sql ="select empno,ename from emp"; PreparedStatement pst=cn.prepareStatement(sql); System.out.println(pst.toString()); ResultSet rs=pst.executeQuery(); System.out.println(rs.getString(1)+ " "+rs.getString(2));
will show first employee record
Compilation error
Compiles but error at run time////
Compiles but no output
ADD
What is the default type of ResultSet in JDBC applications?
Read Only, Forward Only////
Updatable, Forward only
Read only, Scroll Sensitive
Updatable, Scroll sensitive
ADD
Consider the code below & select the correct ouput from the options:String sql ="select * from ?"; String table=" txyz "; PreparedStatement pst=cn.prepareStatement(sql); pst.setString(1,table ); ResultSet rs=pst.executeQuery(); while(rs.next()){ System.out.println(rs.getString(1)); }
will show all row of first column
Compilation error
Compiles but error at run time///
Compiles but run without output
ADD
Cosider the following code & select the correct output.String sql ="select rollno, name from student"; PreparedStatement pst=cn.prepareStatement(sql); System.out.println(pst.toString()); ResultSet rs=pst.executeQuery(); while(rs.next()){ System.out.println(rs.getString(3)); }
will show only name
Compilation error
will show city
Compiles but error at run time////
ADD
Given :public class MoreEndings { public static void main(String[] args) throws Exception { Class driverClass = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");DriverManager.registerDriver((Driver) driverClass.newInstance());// Some code} Inorder to compile & execute this code, what should we import?
java.sql.Driver
java.sql.Driver
java.sql.Driver java.sql.DriverManager////
java.sql.DataSource
ADD
Which of the following methods finds the maximum number of connections that a specific driver can obtain?
Database.getMaxConnections
Connection.getMaxConnections
DatabaseMetaData.getMaxConnections///
ResultSetMetaData.getMaxConnections
ADD
Which of the following method can be used to execute to execute all type of queries i.e. either Selection or Updation SQL Queries?
executeAll()
executeAllSQL()
execute()////
executeQuery()
ADD
It is possible to insert/update record in a table by using ResultSet. State TRUE/FALSE
TRUE////
false
ADD
Which of the following methods are needed for loading a database driver in JDBC?
registerDriver() method
Class.forName()
registerDriver() method and Class.forName()////
getConnection
ADD
Carefully read the question and answer accordingly.________ determines which member of a class can be used by other classes.
specifier
Inheritance
Implementation
Access specifier///
ADD
Carefully read the question and answer accordingly.A class can be declared as _______ if you do not want the class to be subclassed. Usingthe __________keyword we can abstract a class from its implementation
protected ,interface
final,interface////
public,friend
final,protected
ADD
Carefully read the question and answer accordingly.What will be the output for following code?class Super{ int num=20; public void display() { System.out.println("super class method"); }}public class ThisUse extends Super{ int num; public ThisUse(int num) { this.num=num; } public void display() { System.out.println("display method"); } public void Show() { this.display(); display(); System.out.println(this.num); System.out.println(num); } public static void main(String[]args) { ThisUse o=new ThisUse(10); o.Show();
super class method display method 20 20
display method display method 10 10////
display method display method 20 20
super class method display method 10 10
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Variables{ public static void main(String[]args) { public int i=10; System.out.println(i++); }}
10
11
Compilation error
None of the listed options
ADD
Carefully read the question and answer accordingly.The constructor of a class must not have a return type.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.When one method is overridden in sub class the access specifier of the method in sub class should be equal as method in super class.State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.Which of the following method is used to initialize the instance variable of a class.
Class
Public
Constructor////
Destructor
ADD
Carefully read the question and answer accordingly.If display method in super class has a protected specifier then what should be the specifier for the overriding display method in sub class?
protected or default
protected or public///
None of the listed options
private
ADD
Carefully read the question and answer accordingly.What will be the output for following code?class Super{ static void show() { System.out.println("super class show method"); } static class StaticMethods { void show() { System.out.println("sub class show method"); } } public static void main(String[]args) { Super.show(); new Super.StaticMethods().show(); }}
super class show method sub class show method////
super class show method
sub class show method super class show method
Compilation Error
ADD
Carefully read the question and answer accordingly.Which of the following statements are true about Method Overriding?I: Signature must be same including return typeII: If the super class method is throwing the exception then overriding method should throw the same ExceptionIII: Overriding can be done in same classIV: Overriding should be done in two different classes with no relation between the classes
I///
II & IV
III
I & III
ADD
Carefully read the question and answer accordingly.A field with default access specifier can be accessed out side the package. State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.Which of the following are true about protected access specifier?
If one class is having protected method then the method is available for subclass which is present in another package////
A class can be declared as protected.
All members of abstract class are by default protected
Protected is default access modifier of a child class
ADD
Carefully read the question and answer accordingly.What will be the output of following code?class Super2{ public void display() {System.out.println("super class display method"); } public void exe() { System.out.println("super class exe method"); display(); }}public class InheritMethod extends Super2{ public void display() { System.out.println("sub class display method"); } public static void main(String [] args) { InheritMethod o=new InheritMethod(); o.exe(); } }
super class exe method sub class display method////
super class exe method super class display method
Compilation error
None of the listed options
ADD
Carefully read the question and answer accordingly.Which of the following are true about constructors?
Constructors can be overloaded////
Constructors can be overridden.
Constructor is a special type of method which may have return type.
Constructors should be called explicitly like methods
ADD
Carefully read the question and answer accordingly.Constructor of an class is executed each time when an object of that class is created
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The below code will compile & provide desired output:package p1;class Parent { private int doWork(){ System.out.println("Do Work - Parent"); return 0; }}class Child extends Parent { public void doWork(){ System.out.println("Do Work - Child"); }}class Test{ public static void main(String[] args) { new Child().doWork(); }}
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.public interface Status {/* insert code here */ int MY_VALUE = 10;}Which are valid on commented line?1.final2.static3.native4.public
1&2
1&2&3
2&3
1&2&4///
ADD
Carefully read the question and answer accordingly.What is the outputof below code:package p1;class Parent { public static void doWork() { System.out.println("Parent"); }}class Child extends Parent { public static void doWork() { System.out.println("Child"); }}class Test { public static void main(String[] args) { Child.doWork(); }}
Child Parent
Parent
Child////
Parent Child
ADD
Carefully read the question and answer accordingly.abstract public class Employee { protected abstract double getSalesAmount(); public double getCommision() { return getSalesAmount() * 0.15; }}class Sales extends Employee {// insert method here}Which two methods, inserted independently, correctly complete the Salesclass?1.double getSalesAmount() { return 1230.45; }2. public double getSalesAmount() { return 1230.45; }3.private double getSalesAmount() { return 1230.45; }4.protected double getSalesAmount() { return 1230.45; }
1&2
1&3
2&3
3&4
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.Object class provides a method named getClass() which returns runtime class of an object.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.A concrete class can extend more than one super class whether that super class is either concrete or abstract class
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Which of the following keywords ensures that a method cannot be overridden?
final///
protected
static
abstract
ADD
Carefully read the question and answer accordingly.public class Client1{ public static void main(String [] args) { PenDrive p; PenDrive.Vendor v1=new PenDrive.Vendor("WD",500); System.out.println(v1.getName()); System.out.println(v1.getPrice()); }}class PenDrive{ static class Vendor { String name; int price; public String getName(){ return name;} public int getPrice(){ return price;} Vendor(String name,int price) { this.name=name; this.price=price; } }}What will be the output of the given code?
Class cannot be defined inside another class
Runtime Error.
WD 500///
Compile Error.
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The below code will compile & provide desired output:package p1;abstract class LivingThings{ public abstract void resperate(); interface Living { public abstract void walk(); }}class Human implements LivingThings.Living{ @Override public void walk() { System.out.println("Human Can Walk"); }}class Test { public static void main(String[] args) { new Human().walk(); }}
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.What will be the output for following code?class super3{int i=10;public super3(int num){i=num;}}public class Inherite1 extends super3{ public Inherite1(int a){super(a);} public void Exe(){System.out.println(i);}public static void main(String[]args){ Inherite1 o=new Inherite1(50);super3 s=new Inherite1(20); System.out.println(s.i);o.Exe();}}
10 50
20 50///
20 10
10 20
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.An overriding method can also return a subtype of the type returned by the overridden method.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.An abstract class cannot contain non abstract methods
TRUE
FALSE////
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The super() call can only be used in constructor calls and not method calls.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The below code will compile & provide desired output:package p1;interface A { public abstract void methodOne();}interface B extends A { public abstract void methodTwo();}class C implements B{ @Override public void methodTwo() { System.out.println("Method Two Body"); }}class Test { public static void main(String[] args) { new C().methodTwo(); }}
TRUE
FALSE////
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.If any class has at least one abstract method you must declare it as abstract class
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.If any method overrides one of it’s super class methods, we can invoke the overridden method through the this keyword.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The below code will compile & provide desired output:package p1;interface Bounceable { void bounce(); void setBounceFactor(int bf); private class BusinessLogic { int var1; float var2; double result(int var1,float var2){ return var1*var2; } }}class Test { public static void main(String[] args) { System.out.println(new Bounceable.BusinessLogic().result(12,12345.22F)); }}
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.interface B{ public void bM1(); public void bM2();}abstract class A implements B{ public abstract void aM1(); public abstract void aM2(); public void bM1(){}}public class Demo extends A{}In above scenario class Demo must override which methods?
public void aM2(){}
public void aM1(){}
public void bM2(){}
All of the listed options///
ADD
Carefully read the question and answer accordingly.interface A{ public abstract void aM1(); public abstract void aM2();}interface B extends A{ public void bM1(); public void bM2();}public class Demo extends Object implements B{}In above scenario class Demo must override which methods?
public void aM1(){} public void aM2(){}
public void bM1(){} public void bM2(){}
public void aM1(){} public void aM2(){} public void bM1(){} public void bM2(){}/////
public void aM1(){} public void bM2(){}
ADD
Carefully read the question and answer accordingly.What is the output of below code:package p1;public class Test { public static void main(String[] args) { Test t1 = new Test(); Test t2 = new Test(); if (!t1.equals(t2)) System.out.println("they're not equal"); if (t1 instanceof Object) System.out.println("t1's an Object"); }}
they're not equal
t1's an Object
they're not equal t1's an Object////
No Output Will be Displayed
ADD
Carefully read the question and answer accordingly.Choose the correct option.Statement I: When an abstract class is sub classed, the subclass should provide the implementation for all the abstract methods in its parent class.Statement II: If the subclass does not implement the abstract method in its parent class, then the subclass must also be declared abstract.
Statement I & II are TRUE////
Statement I is TRUE & II is FALSE
Statement I is FALSE & II is TRUE
Statement I & II are FASLE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.Interface can be used when common functionalities have to be implemented differently across multiple classes.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Choose the correct option.Statement I: When all methods in a class are abstract the class can be declared as an interface.Choose the correct option.Statement II: An interface defines a contract for classes to implement the behavior.
Statement I & II are TRUE////
Statement I is TRUE & II is FALSE
Statement I is FALSE & II is TRUE
Statement I & II are FASLE
ADD
Carefully read the question and answer accordingly.What is the outputof below code:package p1;abstract class LivingThings{ public abstract int walk();}class Human extends LivingThings{ @Override public void walk() { System.out.println("Human Can Walk"); }}class Test { public static void main(String[] args) { new Human().walk(); }}
Human Can Walk
Compilation error////
Runtime Exception
No Output will be displayed
ADD
Carefully read the question and answer accordingly.abstract class Vehicle { public int speed() { return 0; }}class Car extends Vehicle { public int speed() { return 60; }}class RaceCar extends Car { public int speed() { return 120; }}public class Demo{ public static void main(String [] args) { RaceCar racer = new RaceCar(); Car car = new RaceCar(); Vehicle vehicle = new RaceCar(); System.out.println(racer.speed() + ", " + car.speed()+", " + vehicle.speed()); }
0, 0, 0
120, 60, 0
60,60,60
120, 120, 120///
ADD
Carefully read the question and answer accordingly.What will be the output of following code?class InterfaceDemo{ public static void main(String [] args) { new DigiCam(){}.doCharge(); new DigiCam(){ public void writeData (String msg) { System.out.println("You are Sending: "+msg); } }.writeData("MyFamily.jpg"); }//main}interface USB{ int readData(); void writeData(String input); void doCharge();}abstract class DigiCam implements USB{ public int readData(){ return 0;} public void writeData(String input){} public void doCharge() { System.out.println("DigiCam do Charge"); }}
DigiCam do Charge You are Sending: MyFamily.jpg
Compilation Error
DigiCam do Charge
Runtime Error
ADD
Carefully read the question and answer accordingly.public class Person { private String name; public Person(String name) { this.name = name; } public boolean equals(Person p) { return p.name.equals(this.name); }}Which statement is true?
The equals method does NOT properly override the Object class's equals method.///
Compilation fails because the private attribute p.name cannot be accessed.
This class must also implement the hashCode method as well.
The code will compile as Object class's equals method is overridden.
ADD
Carefully read the question and answer accordingly.Abstract classes can be used whenStatement I: Some implemented functionalities are common between classesStatement II: Some functionalities need to be implemented in sub classes that extends the abstract class
Statement I & II are TRUE///
Statement I is TRUE & II is FALSE
Statement I is FALSE & II is TRUE
Statement I & II are FASLE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The below code will compile & provide desired output:package p1;interface A { public abstract void methodOne();}interface B{ public abstract void methodTwo();}interface C{ public abstract void methodTwo();}class D implements B,C,A{ public void methodOne(){} public void methodTwo(){ System.out.println("Method Two");}}class Test { public static void main(String[] args) { new D().methodTwo(); }}
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of the following correctly fits for the definition 'holding instances of other objects'?
Aggregation///
Composition
Generic
Polymorphic
ADD
Carefully read the question and answer accordingly.What will be the output for following codepublic classMethodOverloading {int m=10,n;public void div(int a) throws Exception{n=m/a;System.out.println(n);}public void div(int a,int b) {n=a/b;}public static void main(String[]args) throws Exception{MethodOverloading o=new MethodOverloading();o.div(0);o.div(10,2);}}
It will print ArithmeticException and prints 5
It will give ArithmeticException//
It will print 5
None of the listed options
ADD
Carefully read the question and answer accordingly.class InterfaceDemo{ public static void main(String [] args) { DigiCam cam1=new DigiCam(); cam1.doCharge(); }//main}interface USB{ int readData(); boolean writeData(String input); void doCharge();}class DigiCam implements USB{ public int readData(){ return 0;} public boolean writeData(String input){ return false; } void doCharge(){ return;}}Which of the following is correct with respect to given code?
Code will not compile due to weaker access privilege.///
Code will Compile without any Error
Code will compile but wont print any message
Runtime Exception
ADD
Carefully read the question and answer accordingly.Choose the correct option.Statement I: A subclass inherits all of the “public” and “protected” members of its parent, no matter what package the subclass is in.Statement II: If the subclass of any class is in the same package then it inherits the default access members of the parent.
Statement I & II are TRUE////
Statement I is TRUE & II is FALSE
Statement I is FALSE & II is TRUE
Statement I & II are FASLE
ADD
Carefully read the question and answer accordingly.public abstract class Shape { private int x; private int y; public abstract void draw(); public void setAnchor(int x, int y) { this.x = x; this.y = y; } }Which two classes use the Shape class correctly? 1.public class Circle implements Shape {private int radius;}2.public abstract class Circle extends Shape {private int radius;}3.public class Circle extends Shape {private int radius;public void draw();}4.public class Circle extends Shape {private int radius;public void draw() {/* code here */}}
1&2
1&3
2&3
3&4///
ADD
Carefully read the question and answer accordingly.Which of the following is the correct syntax for suggesting that the JVM to performs garbage collection?
System.free();
System.setGarbageCollection();
System.out.gc();
System.gc();////
ADD
Carefully read the question and answer accordingly.Which of the following code snippets make objects eligible for Garbage Collection? Statement A: String s = "new string"; s = s.replace('e', '3');Statement B:String replaceable = "replaceable"; StringBuffer sb = new StringBuffer(replaceable);replaceable = null; sb = null;
Both Statements A and B////
Statement A alone
Statement B alone
Neither Statements A nor B
ADD
Carefully read the question and answer accordingly.After which line the object initially referred by str ("Hello" String object) is eligible for garbage collection?class Garbage{public static void main(string[]args){line 1:String str=new String("Hello");line 2. String str1=str;line 3.str=new String("Hi");line 4.str1=new String("Hello Again");5.return;}}
line 3
line 4////
line 5
line 1
ADD
Carefully read the question and answer accordingly.Statement A:finalize will always run before an object is garbage collectedStatement B:finalize method will be called only once by the garbage collectorwhich of the following is true?
Both Statements A and B are true////
Statement A is true and Statement B is false
Statement A is false and Statement B is true
Both Statements A and B are false
ADD
Carefully read the question and answer accordingly.How can you force garbage collection of an object?1.Garbage collection cannot be forced2.Call System.gc(). 3.Call Runtime.gc().4. Set all references to the object to new values(null, for example).
Option 2
Option 3
Option 1////
Option 4
ADD
Carefully read the question and answer accordingly.Members of the classs are accessed by _________ operator
address
dot////
scope resolution
none of these
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class VariableDec1{ public static void main(String[]args) { int I=32; char c=65; char a=c+I; System.out.println(a); }}
97
a
compilation error////
None of the listed options
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Variabledec {public static void main(String[]args){boolean x = true;int a;if(x) a = x ? 2: 1;else a = x ? 3: 4;System.out.println(a);}}
1
3
4
2////
ADD
Carefully read the question and answer accordingly.Garbage collector thread is a daemon thread.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Find the keyword which is not used to implement exception
try
catch
finally
access////
ADD
Carefully read the question and answer accordingly.The ++ operator postfix and prefix has the same effect
TRUE
FALSE////
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class VariableDec { public static void main(String[]args) { int x = 1; if(x>0 ) x = 3; switch(x) { case 1: System.out.println(1); case 0: System.out.println(0); case 2: System.out.println(2); break; case 3: System.out.println(3); default: System.out.println(4); break; } }}
1 0 2
3 4////
4
Compilation error
ADD
Carefully read the question and answer accordingly.Garbage collection guarantee that a program will not run out of memory. State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Operators { public static void main(String[]args) { int i=12; int j=13; int k=++i-j--; System.out.println(i); System.out.println(j); System.out.println(k); }}
12,12,-1
13,12,0////
13,13,0
12,13,-1
ADD
Carefully read the question and answer accordingly.Which of the following is not the Java keyword?
extends
implements
throwed////
Integer
ADD
Carefully read the question and answer accordingly._____________ Operator is used to create an object.
class
new////
print
main
ADD
Carefully read the question and answer accordingly.What is the correct structure of a java program?I: import statement II: class declaration III: package statement IV: method,variable declarations
III->I->II->IV.///
I->III->II->IV
I->III->IV->II
I->II->III->IV
ADD
Carefully read the question and answer accordingly. public class Threads { public static void main (String[] args) { new Threads().go(); } public void go() { Runnable r = new Runnable() { public void run() { System.out.print("Run"); } }; Thread t = new Thread(r); t.start(); t.start(); }}What will be the result?
An exception is thrown at runtime.///
The code executes normally and prints "Run".
The code executes normally, but nothing is printed.
Compilation fails.
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.Threads are small process which run in shared memory space within a process.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Predict the output of below code:package p1;class MyThread extends Thread { public void run(int a) { System.out.println("Important job running in MyThread"); } public void run(String s) { System.out.println("String in run"); }}class Test { public static void main(String[] args) { MyThread t1=new MyThread(); t1.start(); }}
Compile Error
Important job running in MyThread
String in run
Important job running in MyThread String in run
ADD
Carefully read the question and answer accordingly.What will be the output of below code:package p1;class MyThread extends Thread { public void run() { System.out.println("Important job running in MyThread"); }}class Test { public static void main(String[] args) { MyThread t1=new MyThread(); t1.run(); }}
Compile Error
Important job running in MyThread////
Runtime Exception
Non of the options
ADD
Carefully read the question and answer accordingly.class Background implements Runnable{int i = 0;public int run(){while (true) {i++;System.out.println("i="+i);}return 1;}}//End class
It will compile and the run method will print out the increasing value of i.
It will compile and calling start will print out the increasing value of i.
The code will cause an error at compile time.
Compilation will cause an error because while cannot take a parameter of true.
ADD
Carefully read the question and answer accordingly.Which of the following statements are true?Statement1: When a thread is sleeping as a result of sleep(), it releases its locks.Statement2: The Object.wait() method can be invoked only from a synchronized context.
Statement1 is TRUE but Statement2 is FALSE.
Statement2 is TRUE but Statement1 is FALSE.////
BOTH Statement1 & Statement2 are TRUE.
BOTH Statement1 & Statement2 are FALSE.
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The below code will compile & provide desired output:package p1;class MyThread extends Thread { public void run() { System.out.println("Important job running in MyThread"); } public void run(String s) { System.out.println("String in run is " + s); }}class Test { public static void main(String[] args) { MyThread t1=new MyThread(); t1.start(); }}
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.public class TestDemo implements Runnable { public void run() { System.out.print("Runner"); } public static void main(String[] args) { Thread t = new Thread(new TestDemo()); t.run(); t.run(); t.start(); }}What will be the result?
You cannot call run() method using Thread class object.
An exception is thrown at runtime.
The code executes and prints "Runner".
The code executes and prints "RunnerRunnerRunner".////
ADD
Carefully read the question and answer accordingly.You have created a TimeOut class as an extension of Thread, the purpose of which is to print a “Time’s Over” message if the Thread is not interrupted within 10 seconds of being started. Here is the run method that you have coded:public void run() {System.out.println(“Start!”);try {Thread.sleep(10000);System.out.println(“Time’s Over!”);} catch (InterruptedException e) {System.out.println(“Interrupted!”);}}Given that a program creates and starts a TimeOut object, which of the following statements is true?
Exactly 10 seconds after the start method is called, “Time’s Over!” will be printed.
Exactly 10 seconds after the “Start!” is printed, “Time’s Over!” will be printed.
The delay between “Start!” being printed and “Time’s Over!” will be 10 seconds plus or minus one tick of the system clock.
If “Time’s Over!” is printed, you can be sure that at least 10 seconds have elapsed since “Start!” was printed.
ADD
Carefully read the question and answer accordingly.Which of the below is invalid state of thread?
Runnable
Running
Dead
Blocked
ADD
Carefully read the question and answer accordingly.Which two statements are true?1.It is possible for more than two threads to deadlock at once.2.The JVM implementation guarantees that multiple threads cannot enter into adeadlocked state.3.Deadlocked threads release once their sleep() method's sleep duration has expired.4.If a piece of code is capable of deadlocking, you cannot eliminate the possibility ofdeadlocking by insertinginvocations of Thread.yield().
1&2
1&3
2&3
1&4////
ADD
Carefully read the question and answer accordingly.Which of these is not valid method in Thread class
void run()
void start()
boolean getPriority()////
boolean isAlive()
ADD
Carefully read the question and answer accordingly.Java provides ____ ways to create Threads.
One
Two///
Three
Four
ADD
Carefully read the question and answer accordingly.Inter thread communication is achieved using which of the below methods?
wait()
notify()
notifyAll()
all the options///
ADD
Carefully read the question and answer accordingly.Synchronization is achieved by using which of the below methods
Synchronized blocks///
Synchronized methods///
Synchronized classes
Synchronized abstract classes
ADD
Carefully read the question and answer accordingly.Which of these is not a benefit of Multithreading?
Reduce response time of process.
Support parallel operation of functions.
Increase system efficiency.
Requires less overheads compared to multitasking.
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class collection1{public static void main(String[]args){Collection c=new ArrayList();c.add(10);c.add("abc");Collection l=new HashSet();l.add(20);l.add("abc");l.add(30);c.addAll(l);c.removeAll(l);System.out.println( c );}}
[10,abc]
[10]////
Compilation error
[abc]
ADD
Carefully read the question and answer accordingly.Which of the following are not List implementations?1.Vector2.Hashtable3.LinkedList4.Properties
1&2
1&3
2&3
1&4
ADD
Carefully read the question and answer accordingly.Which of these interface(s) are part of Java’s core collection framework?
List////
Set////
SortedList
SortedQueue
ADD
Carefully read the question and answer accordingly.foreach loop is the only option to iterate over a Map
TRUE
FALSE////
ADD
Carefully read the question and answer accordingly.Consider the following code:01 import java.util.Set;02 import java.util.TreeSet;0304 class TestSet { 05 public static void main(String[] args) {06 Set set = new TreeSet<String>(); 07 set.add("Green World"); 08 set.add(1);09 set.add("Green Peace"); 10 System.out.println(set); 11 }12 }Which of the following option gives the output for the above code?
Prints the output [Green World, 1, Green Peace] at line no 9
Compilation error at line no 8
Throws Runtime Exception////
Prints the output [Green World, Green Peace] at line no 9
ADD
Carefully read the question and answer accordingly.LinkedList represents a collection that does not allow duplicate elements.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Under java.util package we have "Collections" as Class and "Collection" as Interface
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.What is the return type of next() in Iterator?
boolean
void
Object///
String
ADD
Carefully read the question and answer accordingly.Consider the following partial code:java.util.Date date = new java.util.Date();Which of the following statement is true regarding the above partial code?
Creates a Date object with 0 as default value
Creates a Date object with '01-01-1970 12:00:00 AM' as default value
Creates a Date object with current date and time as default value///
Creates a Date object with current date alone as default value
ADD
Carefully read the question and answer accordingly.Which of the following are true statements?
The Iterator interface declares only three methods: hasNext, next and remove.////
The ListIterator interface extends both the List and Iterator interfaces
The ListIterator interface provides the ability to determine its position in the List.///
The ListIterator interface provides forward and backward iteration capabilities.////
ADD
Carefully read the question and answer accordingly.What is the data type of m in the following code?import java.util.*;public class set1{ public static void main(String [] args) { Set s=new HashSet(); s.add(20); s.add("abc"); for( _____ m:s) System.out.println(m); }}
int
String
Object///
set1
ADD
Carefully read the question and answer accordingly.Enumeration is having remove() method.State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.The add method of Set returns false if you try to add a duplicate element.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.As per the below code find which statements are true. public class Test { public static void main(String[] args) { Line 1: ArrayList<String> myList=new List<String>(); Line 2: String string = new String(); Line 3: myList.add("string"); Line 4: int index = myList.indexOf("string"); System.out.println(index); }}
Line 1 has compilation error///
Line 2 has run time exceptions
In Line 4 null pointer exception will occur as String string contains null value
Line 4 has neither error nor exceptions.///
ADD
Carefully read the question and answer accordingly.State TRUE or FALSE.line 1: public class Test {line 2: public static void main(String[] args) {line 3: Queue queue = new LinkedList();line 4: queue.add("Hello");line 5: queue.add("World");line 6: List list = new ArrayList(queue);line 7: System.out.println(list); }line 8: }Above code will give run time error at line number 3.
TRUE
FALSE//
ADD
Carefully read the question and answer accordingly.The LinkedList class supports two constructors.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of these are interfaces in the collection framework
Hash Map
Array List
Collection///
Sorted Map///
ADD
Carefully read the question and answer accordingly.Which collection class allows you to associate its elements with key values
java.utill.Map
java.util.ArrayList
java.util.Dictionary///
java.util.HashMap//
ADD
Carefully read the question and answer accordingly.TreeSet uses which two interfaces to sort the data
Serializable
SortTable
SortedSet///
Comparable//
ADD
Carefully read the question and answer accordingly.Iterator i= new HashMap().entrySet().iterator();is this correct declaration
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which statement are true for the class HashSet?
The elements in the collection are accessed using a unique key.
The elements in the collection are guaranteed to be unique////
The elements in the collection are accessed using a unique key.
HashSet allows at most one null element////
ADD
Carefully read the question and answer accordingly.which are the Basic features of implementations of interfaces in Collections Framework in java?
All implementations are unsynchronized///
All implementations support having null elements.///
All implementations are serializable and cloneable///
all implementations are immutable and supports duplicates data
ADD
Carefully read the question and answer accordingly.Map is the super class of Dictionary class?
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.what is the way to iterate over the elements of a Map
for loop
list Iterator
foreach///
Iterator////
ADD
Carefully read the question and answer accordingly.Consider the following Statements:Statement A: The Iterator interface declares only two methods: hasMoreElements and nextElement.Statement B: The ListIterator interface extends both the List and Iterator interfaces.Which of the following option is correct regarding above given statements?
Both the Statements A and B are true
Statement A is true and Statement B is false
Statement A is false and Statement B is true
Both the statements A and B are false.////
ADD
Carefully read the question and answer accordingly.Consider the following list of code:A) Iterator iterator = hashMap.keySet().iterator();B) Iterator iterator = hashMap.iterator();C) Iterator iterator = hashMap.keyMap().iterator();D) Iterator iterator = hashMap.entrySet().iterator();E) Iterator iterator = hashMap.entrySet.iterator();Assume that hashMap is an instance of HashMap type collection implementation.Which of the following option gives the correct partial code about getting an Iterator to the HashMap entries?
A
B
C
D////
ADD
Carefully read the question and answer accordingly.List<Integer> newList=new ArrayList<integer>(); will Above statement create a new object of Array list successfully ?
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Is "Array" a subclass of "Collection" ?
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Is this true or false. Map interface is derived from the Collection interface.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Compare{ public static void main(String[]args) { String s=new String("abc"); String s1=new String("abc"); System.out.println(s.compareTo(s1)); }}
True
False
None of the listed options
ADD
Carefully read the question and answer accordingly.Method keySet() in Map returns a set view of the keys contained in that map.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of the following are synchronized?1.Hashtable2.Hashmap3.Vector4.ArrayList
1&2
1&3////
2&3
1&4
ADD
Carefully read the question and answer accordingly.Consider the following statements about the Map type Objects:Statement A: Changes made in the set view returned by keySet() will be reflected in the original map.Statement B: All Map implementations keep the keys sorted.Which of the following option is true regarding the above statements?
Both Statements A and B are true
Statement A is true and Statement B is false///
Statement A is false and Statement B is true
Both Statements A and B are false
ADD
Carefully read the question and answer accordingly.When comparable interface is used which method should be overridden?
comparator
compare
compareTo///
compareWith
ADD
Carefully read the question and answer accordingly.Iterator is having previous() method.State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.The ArrayList<String> is immutable.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.StringTokenizer implements the Enumeration interface
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class StringCompare{public static void main(String[]args){if("string"=="string")System.out.println("both strings are equal");elseSystem.out.println("both strings are not equal");}}
both strings are equal////
both strings are not equal
compilation error
Runtime error
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.The APIS of StringBuffer are synchronized unlike that of StringBuilder
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.StringBuilder is not thread-safe unlike StringBuffer
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class StringBuffer1{ public static void main(String[]args) { StringBuffer s1=new StringBuffer("welcome"); StringBuffer s2=new StringBuffer("welcome"); System.out.println(s1.equals(s2)); System.out.println(s1.equals(s1)); }}
true true
false true///
false false
true false
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class CompareStrings{public static void main(String[]args){String a=new String("string");String s=new String("string");if(a==s)System.out.println("both strings are equal");elseSystem.out.println("both strings are not equal");}}
both strings are equal
both strings are not equal////
compilation error
Strings cannot be compare using == operator
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.String class do not provides a method which is used to compare two strings lexicographically.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Choose the correct option.Statement I: StringBuilder offers faster performance than StringBufferStatement II: All the methods available on StringBuffer are also available on StringBuilder
Statement I & II are TRUE///
Statement I is TRUE & II is FALSE
Statement I is FALSE & II is TRUE
Statement I & II are FASLE
ADD
Carefully read the question and answer accordingly.endsWith() member methods of String class creates new String object. State True or False
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.Choose the correct option.Statement I: StringBuffer is efficient than “+” concatenationStatement II: Using API’s in StringBuffer the content and length of String can be changed which intern creates new object.
Statement I & II are TRUE
Statement I is TRUE & II is FALSE////
Statement I is FALSE & II is TRUE
Statement I & II are FASLE
ADD
Carefully read the question and answer accordingly.State whether TRUE or FALSE.String s = new String(); is valid statement in java
FALSE
TRUE///
ADD
Carefully read the question and answer accordingly.Consider the following code snippet: String thought = "Green"; StringBuffer bufferedThought = new StringBuffer(thought); String secondThought = bufferedThought.toString(); System.out.println(thought == secondThought);Which of the following option gives the output of the above code snippet?
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.String class contains API used for
Comparing strings
Searching strings
Extracting strings
All of above///
ADD
Carefully read the question and answer accordingly.What is the output of below code:package p1;public class Hackathon { public static void main(String[] args) { String x = "Java"; x.concat(" Rules!"); System.out.println("x = " + x); }}
Error
x = Java Rules
x = Rules
x = Java//
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class CompareStrings{public static void main(String[]args){if(" string ".trim()=="string")System.out.println("both strings are equal");elseSystem.out.println("both strings are not equal");}}
both strings are equal
both strings are not equal////
compilation error
Strings cannot be compare using == operator
ADD
Carefully read the question and answer accordingly.What will be the output for following code?import java.util.*;public class StringTokens{ public static void main(String[]args) { String s="India is a\n developing country"; StringTokenizer o=new StringTokenizer(s); System.out.println(o.countTokens()); }}
4
5///
6
None of the listed options
ADD
Carefully read the question and answer accordingly.What is the output of below code:package p1;public class Hackathon { public static void main(String[] args) { String x = "Java"; x.toUpperCase(); System.out.println("x = " + x); }}
x = JAVA
x=""
x = Java////
x="JAVA"
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Exe3 { public static void main(String[]args) { try { int i=10; int j=i/0; return; }catch(Exception e) { System.out.println("welcome"); } System.out.println("error"); }}1.welcome2.error3.compilation error
1&2///
1&2&3
1&3
2
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Exe3 {public static void main(String[]args){ try{int i=10;int j=i/0;return;}catch(Exception e){try{System.out.println("welcome");return;}catch(Exception e1){}System.out.println("error");}}}
welcome////
error
compilation error
None of the listed options
ADD
Carefully read the question and answer accordingly.What will be the output for following code?class super5{ void Get()throws Exception{System.out.println("IOException");}}public class Exception2 extends super5{public static void main(String[]args){super5 o=new super5();try{o.Get(); }catch(IOException e){}}}
IOException
Compilation error////
Runtime error
None of the listed options
ADD
Carefully read the question and answer accordingly.Propagating exceptions across modules is not possible without throw and throws keyword. State True or False.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.What will be the output of following code?public class Exception1{public static void main(String args[]) { int i=1, j=1;try {i++; j--;if(i/j > 1) i++;} catch(ArithmeticException e) {System.out.println(0);} catch(ArrayIndexOutOfBoundsException e) {System.out.println(1);} catch(Exception e) { System.out.println(2);} finally {System.out.println(3);}System.out.println(4);}}1.02.13.34.4.
1&2
1&2&3
1&3&4///
1&2&4
ADD
Carefully read the question and answer accordingly.try and throws keywords are used to manually throw an exception?
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.RuntimeException is the superclass of those exceptions that can be thrown during the normal operation of the Java Virtual Machine.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Error is the sub class of Throwable
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.At Point X in below code, which code is necessary to make the code compile?public class Test { class TestException extends Exception {} public void runTest() throws TestException {} public void test() /* Point X */ { runTest(); } }
throws RuntimeException
catch ( Exception e )
throws Exception///
No code is necessary.
ADD
Carefully read the question and answer accordingly.Consider the following code:1 public class FinallyCatch { 2 public static void main(String args[]) { 3 try {4 throw new java.io.IOException();5 }6 }7 }Which of the following is true regarding the above code?
Shows unhandled exception type IOException at line number 4
Shows unhandled exception type IOException at line number 5
Demands a finally block at line number 4
Demands a finally block at line number 5///
ADD
Carefully read the question and answer accordingly.Which is/are true among given statements
A ClassNotFoundException is thrown when the reported class is not found by the ClassLoader in the CLASSPATH.///
NoClassDefFoundError means that the class was found by the ClassLoader however when trying to load the class, it ran into an error reading the class definition.///
NoClassDefFoundError is a subClass of ClassNotFoundException
None of the options
ADD
Carefully read the question and answer accordingly.is it valid to place some code in between try and catch blocks.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Which is the super class for Exception and Error?
Throwable///
throws
throw
RuntimeException
ADD
Carefully read the question and answer accordingly.If you put a finally block after a try and its associated catch blocks, then once execution enters the try block, the code in that finally block will definitely be executed except in some circumstances.select the correct circumstance from given options:
An exception arising in the finally block itself///
The use of System.exit()///
finally block will be always executed in any circumstances.
The death of the thread///
ADD
Carefully read the question and answer accordingly.Which of the following are checked exceptions?1.ClassNotFoundException2.InterruptedException3.NullPointerException4.ArrayIndexOutOfBoundsException
1&2///
1&3
2&3
1&4
ADD
Carefully read the question and answer accordingly.Which of the following statement is true regarding try-catch-finally?
An exception which is not handled by a catch block will be handled by subsequent catch blocks
A catch block can have another try block nested inside
Both catch block and finally block can throw exceptions
All of the listed options///
ADD
Carefully read the question and answer accordingly.The finally block always executes when the try block exits.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.What will be the output of following code?try { System.out.println("Executing try"); } System.out.println("After try");catch (Exception ex) { System.out.println("Executing catch");}
Executing try After try Executing catch
Executing try Runtime Exception
Compile Time Exception///
Runtime Exception
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Exception1{public static void main(String args[]) { int i=1, j=1;try {i++; j--;if(i/j > 1) i++;} catch(Exception e) { System.out.println(2);} catch(ArithmeticException e) {System.out.println(0);} finally {System.out.println(3);}}}
2
3
compilation error///
ADD
Carefully read the question and answer accordingly. What will be the output of the below code?public class Test { public static void main(String[] args) { int a = 5, b = 0, c = 0; String s = new String(); try { System.out.print("hello "); System.out.print(s.charAt(0)); c = a / b; } catch (ArithmeticException ae) { System.out.print(" Math problem occur"); } catch (StringIndexOutOfBoundsException se) { System.out.print(" string problem occur"); } catch (Exception e) { System.out.print(" problem occurs"); } finally { System.out.print(" stopped"); } }}
hello 0 stopped
hello 0 Math problem occur stopped
hello Math problem occur string problem occur problem occurs stopped
hello string problem occur stopped///
ADD
Carefully read the question and answer accordingly.Which of these keywords is used to explicitly throw an exception?
try
finally
throw////
throwable
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Exception1{ public static void main(String[]args) { System.out.println("A"); try { System.exit(0); }catch(Exception e) { System.out.println("B"); } System.out.println("C"); }}}
A,C
A///
Compilation error
None of the listed options
ADD
Carefully read the question and answer accordingly.which of these are the subclass of Exception class
IOException////
Throwable
RunTimeException///
FileNotFindException////
ADD
Carefully read the question and answer accordingly.Which of these keywords are a part of exception handling?
try///
final
thrown
catch///
ADD
Carefully read the question and answer accordingly.Consider the following code:class MyException extends Throwable { }public class TestThrowable { public static void main(String args[]) { try { test(); } catch(Throwable ie) { System.out.println("Exception"); } } static void test() throws Throwable { throw new MyException(); }}Which of the following option gives the output for the above code?
Prints Exception////
Compiler time error User defined exceptions should extend Exception
Compile time error Cannot use Throwable to catch the exception
Run time error test() method does not throw a Throwable instance
ADD
Carefully read the question and answer accordingly.What will be the output of the program?public class Test { public static void aMethod() throws Exception { try { throw new Exception(); } finally { System.out.print("finally"); } } public static void main(String args[]) { try { aMethod(); } catch (Exception e) { System.out.print("exception "); } System.out.print("finished"); /* Line 24 */ }}
exception finished
Compilation fails
finally
finally exception finished///
ADD
Carefully read the question and answer accordingly.what are true for RuntimeException
Runtime exceptions need not be explicitly caught in try catch block as it can occur anywhere in a program.///
Runtime exceptions include arithmetic exceptions, pointer exceptions///
RuntimeException is a class of I/O exception
RunTimeException are the exceptions which forces the programmer to catch them explicitly in try-catch block
ADD
Carefully read the question and answer accordingly.Within try block if System.exit(0) is called then also finally block is going to be executed.State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.select true or false . Statement : Throwable is the super class of all exceptional type classes.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Select two runtime exceptions.1.SQLException2.NullPointerException3.FileNotFoundException4.ArrayIndexOutOfBoundsException5.IOException
1&2
1&5
2&3
1&4
ADD
Carefully read the question and answer accordingly.which are true for try block
Try block always needed a catch block followed
if exception occurs, control switches to following first Catch block
catch block is not mandate always only finally followed by try can/ be executed////
after switching from try block to catch block the control never come back to try block to execute rest of the code////
ADD
Carefully read the question and answer accordingly.Try can be followed with either catch or finally.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.which are correct for checked exceptions
A checked exception is a subclass of throwable class////
error and checked exceptions are same.
Checked exceptions are the object of the Exception class or any of its subclasses except Runtime Exception class.////
All runtime exceptions are checked exceptions
ADD
Carefully read the question and answer accordingly.What will be the output for following code?import java.io.*;public class Exception1{ public static void main(String[]args) { System.out.println("A"); try { } catch(IOException t) { System.out.println("B"); } System.out.println("C"); }}
Compile time error////
A
A,C
Runtime error
ADD
Carefully read the question and answer accordingly.Which of the following statement is true regarding implementing user defined exception mechanisms? Statement A: It is valid to derive a class from java.lang.ExceptionStatement B: It is valid to derive a class from java.lang.RuntimeException
Both Statements A and B are true///
Statement A is true and Statement B is false
Statement A is false and Statement B is true
Both Statements A and B are false
ADD
Carefully read the question and answer accordingly.which are the Unchecked exceptions
Class Cast Exception////
Array Index Out Of Bounds Exception///
ClassNotFoundException
Number Format Exception/////
ADD
Carefully read the question and answer accordingly.Which of the following exception is not mandatory to be handled in code?
IOException
FileNotFoundException
SQLException
NullPointerException////
ADD
Carefully read the question and answer accordingly.Statement 1:static variables can be serializedStatement2:transient variables cannot be serializedwhich of the following is true?
statement 1:true statement2:true
statement 1:false statement2:true////
statement 1:false statement2:false
statement 1:true statement2:false
ADD
Carefully read the question and answer accordingly.State TRUE or FALSE.getParent() gives the parent directory of the file and isFile() Tests whether the file denoted by the given abstract pathname is a normal file.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of these interface is not a member of java.io package?
DataInput
ObjectInput
ObjectFilter////
FileFilter
ADD
Carefully read the question and answer accordingly.BufferedWriter constructor CAN ACCEPT Filewriter Object as a parameter.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of these class are related to input and output stream in terms of functioning?
File
Writer////
Reader///
OutputStream///
ADD
Carefully read the question and answer accordingly.What is the output of this program?1. import java.io.*;2. class files {3. public static void main(String args[]) {4. File obj = new File("/java/system");5. System.out.print(obj.getName());6. }7. }
java/system
/java/system
system////
compilation error
ADD
Carefully read the question and answer accordingly.isFile() returns true if called on a file or when called on a directory
TRUE
FALSE////
ADD
Carefully read the question and answer accordingly.Serialization is representing object in a sequence of bytes. State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.An ObjectInputStream deserializes objects previously written using an ObjectOutputStream.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.InputStream is the class used for stream of characters.State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.select the correct statements about BufferedOutputStream class
BufferedOutputStream class is a member of Java.io package///
setting up BufferedOutputStreaman , an application can write bytes to the underlying output stream without necessarily causing a call to the underlying system for each byte written.////
it has flush() method////
As bytes from the stream are read or skipped, the internal buffer is refilled as necessary from the contained input stream, many bytes at a time.
ADD
Carefully read the question and answer accordingly.Which of the following is a marker interface used for object serialization?
Runnable
Serializable////
Externalizable
None of the listed options
ADD
Carefully read the question and answer accordingly.DataInputStream is not necessarily safe for multithreaded access.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of these class are the member class of java.io package?
ObjectInput
StringReader////
File////
String
ADD
Carefully read the question and answer accordingly.InputStreamReader is sub class of FilterReader.
TRUE
FALSE/////
ADD
Carefully read the question and answer accordingly.The InputStream.close() method closes this stream and releases all system resources
TRUE
FALSE////
ADD
Carefully read the question and answer accordingly.Serialization is JVM independent.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which of the following are abstract classes?1.Reader2.InputStreamReader3.InputStream4.OutputStream
1&2
1&2&3
1&3&4/////
1&2&4
ADD
Carefully read the question and answer accordingly.What is the value of variable "I" after execution of following code?public class Evaluate { public static void main(String[]args) { int i=10; if(((i++)>12)&&(++i<15)) System.out.println(i); else System.out.println(i); }}
10
11////
12
None of the listed options
ADD
Carefully read the question and answer accordingly._____________ is a multi way branch statement
switch////
continue
break
label
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Wrapper11 { public static void main(String[]args) { Long l=100; System.out.println(l); }}
100
Compilation error////
code will execute with out printing
runtime Exception
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class WrapperClass12 { public static void main(String[]args) { Boolean b=true; boolean a=Boolean.parseBoolean("tRUE"); System.out.println(b==a); }}
TRUE////
False
Compilation error
Runtime Exception
ADD
Carefully read the question and answer accordingly.We can use Wrapper objects of type int, short, char in switch case.State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.What is the number of bytes used by Java primitive long
The number of bytes is compiler dependent
2
4
8/////
ADD
Carefully read the question and answer accordingly.Data can be passed to the function ____
by value////
by reference
Both by value & reference
none of these
ADD
Carefully read the question and answer accordingly.Which of the following is a loop construct that will always be executed once?
switch
for
while////
do …. While
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class WrapperClass1 {public static void main(String[]args){String s="10Bangalore";int i=Integer.parseInt(s);System.out.println(i);}}
10Bangalore
10
Compilation error
Runtime Exception/////
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class Wrapper2 {public static void main(String[]args){Byte b=1;Byte a=2;System.out.println(a+b);}}
compiles and print 3////
compilation error
Runtime Error
compiles and prints 12
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class WrapperClass1 {public static void main(String[]args){Integer i=new Integer(10);Integer j=new Integer(10);System.out.println(i==j);}}
True
False////
compilation error
None of the listed options
ADD
Carefully read the question and answer accordingly.The result of 10.987+”30.765” is _________________.
10.98730.765////
10.9873.765
Compilation error
10.987
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class While {static int i;public static void main(String[]args){System.out.println(i);while(i<=5){i++;}System.out.println(i);}}
compilation error
0,6////
6,0
0,5
ADD
Carefully read the question and answer accordingly.What will be the output for following code?public class While {public static void main(String[]args){ int a='A';int i=a+32;while(a<='Z'){a++;}System.out.println(i);System.out.println(a);}}
A,Z
a,z
91,97
97,91////
ADD
Carefully read the question and answer accordingly.The ______ statement is used inside the switch to terminate a Statement sequence
break////
Jump
exit
goto
ADD
Carefully read the question and answer accordingly.What will be the output of below code?public class Test { public static void main(String[] args) { int i = 1; Integer I = new Integer(i); method(i); method(I); } static void method(Integer I) { System.out.print(" Wrapper"); } static void method(int i) { System.out.print(" Primitive"); }}
Primitive Wrapper///
Wrapper
Primitive
Wrapper Primitive
ADD
Carefully read the question and answer accordingly.What happens when the following code is compiled and run. Select the one correct answer. for(int i = 1; i < 3; i++) for(int j = 3; j >= 1; j--) assert i!=j : i;
The class compiles and runs, but does not print anything.
The number 1 gets printed with AssertionError////
The number 2 gets printed with AssertionError
The number 3 gets printed with AssertionError
ADD
Carefully read the question and answer accordingly.Each case in switch statement should end with ________ statement
default
break////
continue
new
ADD
Carefully read the question and answer accordingly.Which method executes a simple query and returns a single Result Set object?
executeUpdate()
executeQuery()////
execute()
noexecute()
ADD
Carefully read the question and answer accordingly.Which object allows you to execute parametrized queries?
ResultSet
Parametrized
PreparedStatement////
Condition
ADD
Carefully read the question and answer accordingly.Which statements about JDBC are true? 1.JDBC has 5 types of Drivers2.JDBC stands for Java DataBase Connectivity3.JDBC is an API to access relational databases, spreadsheets and flat files4.JDBC is an API to bridge the object-relational mismatch between OO programs and relational databases
1&2
3&4
2&3///
1&4
ADD
Carefully read the question and answer accordingly.Which type of Statement can execute parameterized queries?
PreparedStatement////
ParameterizedStatement
ParameterizedStatement and CallableStatement
All kinds of Statements (i.e. which implement a sub interface of Statement)
ADD
Carefully read the question and answer accordingly.You are using JDBC-ODBC bridge driver to establish a connection with a database. You have created a DSN Mydsn. Which statement will you use to connect to the database?
Connection cn=DriverManager.getConnection("jdbc:odbc");
Connection cn=DriverManager.getConnection("jdbc:odbc:Mydsn", "username", "password");///
Connection cn=DriverManager.getConnection("jdbc:odbc ","username", "password");
Connection cn=DriverManager.getConnection("jdbc:odbc:dsn" ,"username", "password");
ADD
Carefully read the question and answer accordingly.The method Class.forName() is a part of JDBC API. State True or False.
TRUE
FALSE///
ADD
Carefully read the question and answer accordingly.Connection object can be initialized using which method of the Driver Manager class?
putConnection()
setConnection()
Connection()
getConnetion()
ADD
Carefully read the question and answer accordingly.Which type of driver converts JDBC calls into the network protocol used by the database management system directly?
Type 1 driver
Type 2 driver
Type 3 driver
Type 4 driver///
ADD
Carefully read the question and answer accordingly.Which of the following is true with respect to code given below?import java.sql.*;public class OracleDemo{ public static void main(String [] args) throws SQLException,ClassNotFoundException { Class.forName("oracle.jdbc.driver.OracleDriver"); Connection con=DriverManager.getConnection("jdbc:oracle:thin:@PC188681:1521:training","scott","tiger"); Statement stmt=con.createStatement(); ResultSet rs=stmt.executeQuery("SELECT * FROM Person"); while(rs.next()) { System.out.println(rs.getString("column1")); } }}
The code will not compile as no try catch block specified
The code will display all values in column named column1/////
Class.forName must be mentioned after Connection statement
"SELECT * FROM Person" query must be passed as parameter to con.createStatement()
ADD
Carefully read the question and answer accordingly.The JDBC-ODBC Bridge driver translates the JDBC API to the ODBC API and used with which of the following:
JDBC drivers
ODBC drivers////
Both A and B
None of the above
ADD
Carefully read the question and answer accordingly.Type 1 & Type 3 driver types are not vendor specific implementation of Java driver. State True or False
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Which method executes an SQL statement that may return multiple results?
executeUpdate()
executeQuery()
execute()////
noexecute()
ADD
Carefully read the question and answer accordingly.Which package contains classes that help in connecting to a database, sending SQL statements to the database, and processing the query results
connection.sql
db.sql
pkg.sql
java.sql///
ADD
Carefully read the question and answer accordingly.What is the state of the parameters of the PreparedStatement object when the user clicks on the Query button?
initialized///
started
paused
stopped
ADD
Carefully read the question and answer accordingly.Which of the following listed option gives the valid type of object to store a date and time combination using JDBC API?
java.util.Date
java.sql.Date
java.sql.Time
java.sql.Timestamp////
ADD
Carefully read the question and answer accordingly.If your JDBC Connection is in auto-commit mode, which it is by default, then every SQL statement is committed to the database upon its completion. State True or False.
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.How can you execute a stored procedure in the database?
Call method execute() on a CallableStatement object////
Call method executeProcedure() on a Statement object
Call method execute() on a StoredProcedure object
Call method run() on a ProcedureCommand object
ADD
Carefully read the question and answer accordingly.Which object provides you with methods to access data from the table?
ResultSet//
Parametrized
TableStatement
Condition
ADD
Carefully read the question and answer accordingly.What is correct about DDL statements?
DDL statements are treated as normal SQL statements, and are executed by calling the execute() method on a Statement (or a sub interface thereof) object///
To execute DDL statements, you have to install additional support files
DDL statements cannot be executed by making use of JDBC, you should use the native database tools for this.
Support for DDL statements will be a feature of a future release of JDBC
ADD
Carefully read the question and answer accordingly.executeUpdate() & execute() are valid methods that can be used for executing DDL statements. State True or False
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.A Java program cannot directly communicate with an ODBC driver because of which of the following:
ODBC written in C language////
ODBC written in C# language
ODBC written in C++ language
ODBC written in Basic language
ADD
Carefully read the question and answer accordingly.Consider the following statements:Statement A: The PreparedStatement object enables you to execute parameterized queries.Statement B: The SQL query can use the placeholders which are replaced by the INPUT parameters at runtime. Which of the following option is True with respect to the above statements?
Both Statement A and Statement B are True.////
Statement A is True and Statement B is False.
Statement A is False and Statement B is True.
Both Statements A and B are False.
ADD
Carefully read the question and answer accordingly.Which packages contain the JDBC classes?
java.jdbc and javax.jdbc
java.jdbc and java.jdbc.sql
java.sql and javax.sql///
java.rdb and javax.rdb
ADD
Carefully read the question and answer accordingly.Which method sets the query parameters of the PreparedStatement Object?
putString()
insertString()
setString()///
setToString()
ADD
Carefully read the question and answer accordingly.Consider you are developing a JDBC application, where you have to retrieve the Employee information from the database table based on Employee id value passed at runtime as parameter. Which best statement API you will use to execute parameterized SQL statement at runtime?
Statement
PreparedStatement///
CallableStatement
None of the listed options
ADD
Carefully read the question and answer accordingly.Which collection class allows you to grow or shrink its size and provides indexed access to its elements, but whose methods are not synchronized?
java.util.HashSet
java.util.LinkedHashSet
java.util.List
java.util.ArrayList///
ADD
Carefully read the question and answer accordingly.Consider you are developing a JDBC application, where you have to retrieve Employee table schema information like table columns name, columns field length and data type etc. Which API you will use to retrieve table schema information?
ResultSet
ResultSetMetaData///
DataSource
Statement
ADD
Carefully read the question and answer accordingly.In Thread implementation methods like wait(), notify(), notifyAll() should be used in synchronized context . State true or false
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Consider you are developing an application where you have to store and retrieve data in character format in file. Which API you will use to store and retrieve the data in character format?
Reader and Writer Stream APIs///
InputStream and OutputStream Stream APIs
Collection APIs
None of the listed options
ADD
Carefully read the question and answer accordingly.Which of the following provides an efficient means of storing key/value pairs in sorted order, and allows rapid retrieval?
TreeMap///
HashMap
LinkedHashMap
Non of the listed options
ADD
Carefully read the question and answer accordingly.Consider you are developing a JDBC application, where you have to retrieve quarterly report from database by executing database store procedure created by database developer. Which statement API you will use to execute store procedure and retrieve ResultSet information?
Statement
PreparedStatement
CallableStatement///
None of the listed options
ADD
Carefully read the question and answer accordingly.Interfaces are mainly used to expose behavior or functionality not the implementation code. State true or false
TRUE////
FALSE
ADD
Carefully read the question and answer accordingly.Select the advantages of using Collection API’s in java application development.
Reduces programming effort
Allows interoperability among unrelated APIs
Reduces effort to learn and to use new APIs
Fosters software reuse
ADD
Carefully read the question and answer accordingly.Which statements are true about comparing two instances of the same class, given that the equals() and hashCode() methods have been properly overridden?
If the equals() method returns true, the hashCode() comparison == might return false
If the equals() method returns false, the hashCode() comparison == might return true////
If the hashCode() comparison == returns true, the equals() method must return true
If the hashCode() comparison == returns true, the equals() method might return true///
ADD
Carefully read the question and answer accordingly.Consider you are developing java application in a team consists of 20 developers and you have been asked to develop class by Name ProgrammerAnalyst and to ensure that other developers in team use ProgrammerAnalyst class only by creating object and team member should not be given provision to inherit and modify any functionality written in ProgrammerAnalyst class using inheritance. How do you achieve this requirement in development scenario?
Declare the ProgrammerAnalyst class has abstract
Declare the ProgrammerAnalyst class has private
Declare the ProgrammerAnalyst class has final///
None of the listed options
ADD
Carefully read the question and answer accordingly.Consider a development scenario where you want to write the object data into persistence storage devices (like file, disk etc.).Using which of the below concept you can achieve the given requirement?
finalization
Serialization///
Synchronization
Deserialization
ADD
Carefully read the question and answer accordingly.Which of the following statement is incorrect?
By multithreading CPU’s idle time is minimized, and we can take maximum use of it.
By multitasking CPU’s idle time is minimized, and we can take maximum use of it.
Two thread in Java can have same priority
A thread can exist only in two states, running and blocked.///
ADD
Carefully read the question and answer accordingly.Consider you are developing an ATM application for ABC Bank using java application. Several account holders of ABC Bank have opted for add-on cards. There is a chance that two users may access the same account at same time and do transaction simultaneously knowingly or unknowingly from different ATM machine from same or different bank branches. As developer you have to ensure that when one user login to account until he finishes his transaction account should be locked to other users who are trying access the same account. How do you implement given requirement programmatically using java?
Using Thread Synchronization//
Using object serialization
Using object deserialization
None of the listed options
ADD
Carefully read the question and answer accordingly.Which of these is executed first before execution of any other thing takes place in a program?
main method
finalize method
static block code///
private method
ADD
Carefully read the question and answer accordingly.Consider you are trying to persist or store object of Customer class using ObjectOutputStream class in java. When you are trying to persist customer object data java code is throwing runtime exception without persisting object information. Please suggest what is the key important factor you have consider in code in order to persist customer object data.
Check whether you have implemented Customer class with Serializable interface///
Check whether you have implemented Customer class with Externalizable interface
Check whether you have marked Customer class methods with synchronized keyword
None of the listed options
ADD
Carefully read the question and answer accordingly.Which class does not override the equals() and hashCode() methods, inheriting them directly from class Object?
java.lang.String
java.lang.Double
java.lang.StringBuffer///
java.lang.Character
ADD
Carefully read the question and answer accordingly.What will happen if two thread of same priority are called to be processed simultaneously?
Any one will be executed first lexographically
Both of them will be executed simultaneously
None of them will be executed
It is dependent on the operating system.///
ADD
Carefully read the question and answer accordingly.In Thread implementation making method synchronized is always better in order to increase application performance rather than using synchronize block to synchronize certain block of statements written in java inside the method. State True or False.
FALSE///
TRUE
ADD
Carefully read the question and answer accordingly.Which of the following is incorrect statement regarding the use of generics and parameterized types in Java?
Generics provide type safety by shifting more type checking responsibilities to the compiler.
Generics and parameterized types eliminate the need for down casts when using Java Collections.
When designing your own collections class (say, a linked list), generics and parameterized types allow you to achieve type safety with just a single class definition as opposed to defining multiple classes.///
All of the mentioned
ADD
Carefully read the question and answer accordingly.Consider the development scenario where you have created Employee class with implementation code and as per the project requirement you have to ensure that developer in team reusing code written in Employee class only using inheritance by extending the employee class but not by creating the instance of Employee object directly. Please suggest the solution to implement given requirement?
Mark Employee class with abstract keyword//
Mark Employee class with final keyword
Make Employee class methods private
Make Employee class methods public
ADD
Carefully read the question and answer accordingly.You need to store elements in a collection that guarantees that no duplicates are stored and all elements can be accessed in natural order. Which interface provides that capability?
java.util.Map
java.util.Set///
java.util.List
java.util.Collection
ADD
Carefully read the question and answer accordingly.Consider you are developing shopping cart application you have to store details of items purchased by the each customer in intermediate memory before storing purchase details in actual database permanently note that number of different items purchased by customer is not definite it may vary. How do you implement given requirement using java considering best performance of the application?
Implement using Arrays
Implement using Collection API’s.//
Implement using file API’s
None of the listed options