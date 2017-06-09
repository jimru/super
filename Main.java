1001.Exception Handling -1(Arithmetic exception and Number format exception)

Given total runs scored and  total overs faced as the input. Write a program to calculate the run rate with the formula,
Run rate= total runs scored/total overs faced.
Use BufferedReader class to get the inputs from user.
 
This program may generate Arithmetic Exception / NumberFormatException. Use exception handling mechanisms to handle this exception. Use a single catch block. In the catch block, print the class name of the exception thrown.
 
Input and Output Format:
Refer sample input and output for formatting specifications.
All text in bold corresponds to input and the rest corresponds to output.
 
Sample Input and Output 1:
Enter the total runs scored
79
Enter the total overs faced
14
Current Run Rate : 5.64 
Sample Input and Output 2:
Enter the total runs scored
50
Enter the total overs faced
 0
java.lang.ArithmeticException
Sample Input and Output 3:
 
Enter the total runs scored
a
java.lang.NumberFormatException


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
       class Main
       {
       public static void main(String args[]) throws IOException{
              BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              float f = 0;
              try
              {
              System.out.println("Enter the total runs scored");
              int a=Integer.parseInt(br.readLine());
              System.out.println("Enter the total overs faced");
              int b=Integer.parseInt(br.readLine());
               f=a/b;
              }
              catch(java.lang.ArithmeticException x)
              {
            	  System.out.println(x.getClass());
            	  System.exit(0);
              }
              System.out.printf("Current Run Rate : %.2f",f);
              

       }

1002.Exception Handling -3(NullPointerException)
Create a class named Player with following private attributes
String name
String country
String skill
Generate approriate constructors  and getter ,setters. 
 
Create a class named PlayerBO
Include a method named displayPlayerDetails to display the details. The return type of the method is void 
 
Create a Main class to test the above class.

This program may generate NullPointerException when the user invokes a method with argument having null value. Use exception handling mechanisms to handle this exception. Use a single catch block. In the catch block, print the class name of the exception thrown.
Note:NullPointer Exception occurs when the displayPlayerDetails method is invoked with captain details as null

Input and Output Format:
Refer sample input and output for formatting specifications. 
Read the player details as array of objects
All text in bold corresponds to input and the rest corresponds to output.
 
Sample Input and Output 1:
Enter the number of players
2
Do you know the details of the captain? Type Yes / No
Yes
Enter name of the captain
Ms Dhoni
Enter country of the captain
India
Enter skillset of the captain
All Rounder
Enter name of player 1
Virat Kohli
Enter country of player 1
India
Enter skillset of player 1
Batsman
Enter name of player 2
Ashwin
Enter country of player 2
India
Enter skillset of player 2
Bowler
Ms Dhoni, India, All Rounder
Player Details
Virat Kohli, India, Batsman
Ashwin, India, Bowler

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of players");
int n=Integer.parseInt(br.readLine());
Player p1[]=new Player[n];
Player p[]=new Player[1];
PlayerBO z=new PlayerBO();
String a,b,c;
try
{
System.out.println("Do you know the details of the captain? Type Yes / No");
String s=br.readLine();
if(s.equals("Yes"))
{
for(int i=0;i<1;i++)
{
System.out.println("Enter name of the captain");
   a=br.readLine();
   System.out.println("Enter country of the captain");
   b=br.readLine();
System.out.println("Enter skillset of the captain");
c=br.readLine();
p[i]=new Player(a,b,c);
}
}
for(int i=0;i<n;i++)
{
System.out.println("Enter name of player "+(i+1));
   a=br.readLine();
System.out.println("Enter country of player "+(i+1));
b=br.readLine();
System.out.println("Enter skillset of player "+(i+1));
c=br.readLine();
   p1[i]=new Player(a,b,c);
}
z.displayPlayerDetails(p);
System.out.println("Player Details");
z.displayPlayerDetails(p);
}catch(Exception e)
{
System.out.println("Exception Occured : "+e.getClass().getName());
System.out.println("Captain details not available");
System.out.println("Player Details");
z.displayPlayerDetails(p1);
}
}

}


public class Player {
String name;
String country;
String skill;
public Player(String name, String country, String skill) {
super();
this.name = name;
this.country = country;
this.skill = skill;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getCountry() {
return country;
}
public void setCountry(String country) {
this.country = country;
}
public String getSkill() {
return skill;
}
public void setSkill(String skill) {
this.skill = skill;
}
@Override
public String toString() {
return name+", "+country+", "+skill;
}
}

public class PlayerBO {
void displayPlayerDetails(Player p[])
{
for(int i=0;i<p.length;i++)
{   
System.out.println(p[i].toString());
}
}
}

1004.Custom Exceptions [Age]
		Write a program to get the name and age of the player from the user and  display it. 
		player name is a string 
		player age is an integer value 
		Note : The player is eligible to participate in IPL when their age is 19 and above 
		  
		This program may generate   
		1. InvalidAgeRange Custom Exception when the player's age is below 19 
		 Use exception handling mechanisms to handle these exceptions 

		 Create a class called CustomException which extends Exception and it includes constructor to initialize the message. 
		 
		 Use appropriate exception handling mechanisms to handle these exceptions  
		 
		Input and Output Format:
		Refer sample input and output for formatting specifications.
		All text in bold corresponds to input and the rest corresponds to output.
		 
		Sample  Input/Output 1:
		Enter the player name
		Albie Morkel
		Enter the player age
		35
		Player name : Albie Morkel
		Player age : 35
		 
		Sample  Input/Output 2:
		Enter the player name
		Ishan Kishan
		Enter the player age
		16
		CustomException: InvalidAgeRangeException
		
		 class CustomException extends Exception
		 {
		     
		     public CustomException(String s)
		     {
		      super(s);   
		     }
		     
		 }
import java.io.*;
import java.util.*;

class Main {

  public static void main(String[] args)throws IOException  {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the player name");
		String a=br.readLine();
		System.out.println("Enter the player age");
		try{
		int n=Integer.parseInt(br.readLine());
		if(n<19)
		{
			throw new CustomException("InvalidAgeRangeException");
			
		}
		System.out.println("Player name : "+a);
		System.out.println("Player age : "+n);
		}
		catch(Exception x)
		{
			System.out.println(x);
		}

}
}

1005.Write a programme to read two strings from input.txt file which is separated by comma and display the string  in console. Use 3 classes Main, FileUtility and Player in which FileUtilty reads the value from input.txt into an arraylist.
Input format: Anup Kumar,U Mumba,AllRounder
                            Sooraj,Kerala,BatsMan
Output:
Player 1
Anup Kumar U Mumba AllRounder
Player 2
Sooraj Kerala BatsMan


Answer

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {
                
                public List<Player> readFileData(BufferedReader br) throws NumberFormatException, IOException
                {
                                List<Player> ml=new ArrayList<Player>();
                                String line = null;
                                while ((line = br.readLine()) != null) {
                                                
                                                String[] arr=line.split(",");

                                                                String cap=arr[0].trim();
                                                                String n=arr[1].trim();
                                                                String s=arr[2].trim();
                                                                ml.add(new Player(cap,n,s));
                                }
                                return ml;
                                
                }
                
}



public class Player extends FileUtility{
       
     String name,team,skill;
       
       public Player(String name, String team, String skill) {
              super();
              this.name = name;
              this.team = team;
              this.skill = skill;
       }
       Player()
       {
          
       }
       public String getName() {
              return name;
       }

       public void setName(String name) {
              this.name = name;
       }

       public String getTeam() {
              return team;
       }

       public void setTeam(String team) {
              this.team = team;
       }

       public String getSkill() {
              return skill;
       }

       public void setSkill(String skill) {
              this.skill = skill;
       }

       @Override
       public String toString() {
              return name + " " + team+ " " + skill;
       }
}



import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

                public static void main(String[] args) throws NumberFormatException, IOException {

                                InputStreamReader in=new InputStreamReader(new FileInputStream("input.txt"));
                                FileUtility fu=new FileUtility();
                                BufferedReader br = new BufferedReader(in);
                                List<Player> pl=new ArrayList<Player>();
                                pl=fu.readFileData(br);
                                int i =1;
                                   for(Player p:pl)
                                   {
                                     System.out.println("Player "+i);
                                     System.out.println(p);
                                     i++;
                                   }
                             
                }
}

		   

//STRINGS
2.    Number Validation
Write a program to read a string of 10 digit number , check whether the string contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit.
 
Include a class UserMainCode with a static method validateNumber which accepts a string as input .
The return type of the output should be 1 if the string meets the above specified format . In case the number does not meet the specified format then return -1 as output.
 
Create a class Main which would get the input as a String of numbers and call the static methodvalidateNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output is a string specifying the given string is valid or not .
Refer sample output for formatting specifications.
 
Sample Input 1:
123-456-7895
Sample Output 1:
Valid number format

Sample Input 2:
-123-12344322
Sample Output 2:
Invalid number format
importjava.util.Scanner;


publicclassUserMainCode {
	
	staticintvalidateNumber(String s1)
	 {
		
if(s1.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
	 {
		
	return 1;
	
	 }	

else
return -1;
	 }

	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=newScanner(System.in);
	        String n1=in.nextLine();
	int c=UserMainCode.validateNumber(n1);
	if(c==1)
		System.out.println("VALID");
	else
		System.out.println("INVALID");
		

	}
}

4.    Fetching Middle Characters from String
 
Write a program to read a string of even length and to fetch two middle most characters from the input string and return it as string output.
 
Include a class UserMainCode with a static method getMiddleChars which accepts a string of even length as input . The return type is a string which should be the middle characters of the string.
 
Create a class Main which would get the input as a string and call the static method getMiddleCharspresent in the UserMainCode.
 
Input and Output Format:
Input consists of a string of even length.
Output is a string .
Refer sample output for formatting specifications.
 
Sample Input 1:
this
Sample Output 1:
hi
 
Sample Input 1:
Hell
Sample Output 1:
el
importjava.util.Scanner;


publicclassUserMainCode {

	/**
	 * @paramargs
	 */
	staticvoidgetMiddleChars(String s1)
	 {
		int k=s1.length();
		int mid=k/2;
		StringBuffersb1= newStringBuffer();
		if(k%2==0)
		 {
			sb1.append(s1.charAt(mid-1));
			sb1.append(s1.charAt(mid));
		 }
		System.out.println(sb1);
		
	 }
	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=newScanner(System.in);
	        String n1=in.nextLine();
	UserMainCode.getMiddleChars(n1);

	}

}
 
5.    Check Characters in a String
Write a program to read a string  and to test whether first and last character are same. The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid.
 
Include a class UserMainCode with a static method checkCharacters which accepts a string as input .
The return type of this method is an int.  Output should be 1 if the first character and last character are same . If they are different then return -1 as output.
 
Create a class Main which would get the input as a string and call the static method checkCharacterspresent in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output is a string saying characters are same or not .
Refer sample output for formatting specifications.
 
Sample Input 1:
the picture was great
Sample Output 1:
Valid
 
Sample Input 1:
this
Sample Output 1:
Invalid
importjava.util.Scanner;


publicclassUserMainCode {

	/**
	 * @paramargs
	 */
	staticvoidcheckCharacters(String s1)
	 {
		int k=s1.length();
		char c=s1.charAt(0);
		char d=s1.charAt(k-1);
		if(c==d)
		 {
			System.out.println("VALID");
		 }
		else
		System.out.println("INVALID");
		
	 }
	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=newScanner(System.in);
	        String n1=in.nextLine();
	UserMainCode.checkCharacters(n1);

	}

}
6.    Forming New Word from a String
Write a program to read a string and a positive integer n as input and construct a string with first n and last n characters in the given string.
 
Include a class UserMainCode with a static method formNewWord which accepts a string and positive integer .
 
The return type of the output should be a string (value) of first n character and last n character.
 
Create a class Main which would get the input as a string and integer n and call the static methodformNewWord present in the UserMainCode.
 
Input and Output Format:
Input consists of a string of even length.
Output is a string .
Note: The given string length must be >=2n.
Refer sample output for formatting specifications.
 
Sample Input 1:
California
3
Sample Output 1:
Calnia
 
Sample Input 2:
this
1
Sample Output 2:
Ts
importjava.util.Scanner;


publicclassUserMainCode {

	/**
	 * @paramargs
	 */
	staticvoidcheckCharacters(String s1,int a)
	 {
		int k=s1.length();
		StringBuffer sb1= newStringBuffer();
if((2*a)<=k)
          {
	sb1.append(s1.substring(0,a));
	sb1.append(s1.substring(k-a));
		  }
System.out.println(sb1);
	 }
	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=newScanner(System.in);
	        String n1=in.nextLine();
	intnum=in.nextInt();
	UserMainCode.checkCharacters(n1,num);

	}

}
11.  String Encryption
Given an input as string and write code to encrypt the given string using following rules and return the encrypted string:
 
1. Replace the characters at odd positions by next character in alphabet.
2. Leave the characters at even positions unchanged.
 
Note:
- If an odd position charater is 'z' replace it by 'a'.
- Assume the first character in the string is at position 1.
 
Include a class UserMainCode with a static method encrypt which accepts a string.
 
The return type of the output is the encrypted string.
 
Create a Main class which gets string as an input and call the static method encrypt present in theUserMainCode.
 
Input and Output Format:
Input is a string .
Output is a string.
 
Sample Input 1:
curiosity
Sample Output 1:
dusipsjtz
 
Sample Input 2:
zzzz
Sample Output 2:
Azaz
importjava.util.Scanner;


publicclassUserMainCode {
	
	staticvoidcheckCharacters(String s1)
	 {
		int k=s1.length();
		StringBuffer sb1= newStringBuffer();
for(inti=0;i<k;i++)
        {   
	chard=s1.charAt(i);
	
	if((i+1)%2!=0)
	{
		if(d=='z')
	{
			sb1.append('a');   	
		}
           else if(d=='Z')
	     {
			sb1.append('A');   	
		}


	else
	   {
int c=(int)d;
	   ++c;
	sb1.append((char)c);
			
	  }
	}
	else
	{
		sb1.append(d);
	}

	
        }
System.out.println(sb1);
	 }

	Publicstaticvoidmain(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=newScanner(System.in);
	        String n1=in.nextLine();
	UserMainCode.checkCharacters(n1);

	}
}
12.  Password Validation
Given a method with a password in string format as input. Write code to validate the password using following rules:
 
- Must contain at least one digit
- Must contain at least one of the following special characters @, #, $
# Length should be between 6 to 20 characters.
 
Include a class UserMainCode with a static method validatePassword which accepts a password string as input.

If the password is as per the given rules return 1 else return -1.If the return value is 1 then print valid password else print as invalid password.

Create a Main class which gets string as an input and call the static method validatePassword present in the UserMainCode.
 
Input and Output Format:
Input is a string .
Output is a string .

 
Sample Input 1:
%Dhoom%
Sample Output 1:
Invalid password
 
Sample Input 2:
#@6Don
Sample Output 2:
Valid password
importjava.util.Scanner;
publicclassUserMainCode {
	
	staticvoidcheckCharacters(String s1)
	 {
		int k=s1.length();
if((k>=6 && k<=20) && s1.matches(".*[0-9]{1}.*") &&s1.matches(".*[@$#]{1}.*"))
	 {
		
	System.out.println("VALID");
	
	 }	

else
System.out.println("INVALID");
	 }

	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new scanner(System.in);
	        String n1=in.nextLine();
	UserMainCode.checkCharacters(n1);

	}
}
13.  Removing vowels from String
Given a method with string input. Write code to remove vowels from even position in the string.
 
Include a class UserMainCode with a static method removeEvenVowels which accepts a string as input.
 
The return type of the output is string after removing all the vowels.
 
Create a Main class which gets string as an input and call the static method removeEvenVowels present in the UserMainCode.
 
Input and Output Format:
Input is a string .
Output is a string .
Assume the first character is at position 1 in the given string.
 
Sample Input 1:
commitment
Sample Output 1:
cmmitmnt
 
Sample Input 2:
capacity
Sample Output 2:
Cpcty
importjava.util.Scanner;

publicclassUserMainCode {
publicstatic String removeEvenElements(String s1) 
        {
StringBuffer sb1=newStringBuffer();
for(inti=0;i<s1.length();i++)
      {
char k=s1.charAt(i);
if((i+1)%2!=0)
       {
sb1.append(k);
       }
else
      {
if(k!='a'&& k!='e'&& k!='i'&& k!='o'&& k!='u'&& k!='A'&& k!='E'&& k!='I'&& k!='O'&& k!='U')
    {
	sb1.append(k);
    }
    }
      }
return sb1.toString(); 
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(removeEvenElements(s1));
in.close();
    }
}
 
18.Calculate Electricity Bill
 
Given a method calculateElectricityBill() with three inputs. Write code to calculate the current bill.
 
Include a class UserMainCode with a static method calculateElectricityBill which accepts 3 inputs .The return type of the output should be an integer .
 
Create a class Main which would get the inputs and call the static method calculateElectricityBill present in the UserMainCode.
 
Input and Output Format:
Input consist of 3 integers.
First input is previous reading, second input is current reading and last input is per unit charge.
Reading Format - XXXXXAAAAA where XXXXX is consumer number and AAAAA is meter reading.
Output is a single integer corresponding to the current bill.
Refer sample output for formatting specifications.
 
Sample Input 1:
ABC2012345
ABC2012660
4
Sample Output 1:
1260
 
Sample Input 2:
ABCDE11111
ABCDE11222
3
Sample Output 2:
333
importjava.util.Scanner;

publicclassUserMainCode {
		
	staticintcalculateElectricityBill(String str1,String str2,int unit)
	{
		int e1=Integer.parseInt(str1.substring(5));
		int e2=Integer.parseInt(str2.substring(5));
		int total=(e2-e1)*unit;
		return total;
		
	}
		publicstaticvoid main(String args[])
	{
		String s1,s2;
		int n;
		Scanner in=newScanner(System.in);
		s1=in.nextLine();
		s2=in.nextLine();
		n=in.nextInt();
		intans=UserMainCode.calculateElectricityBill(s1,s2,n);
		System.out.println(ans);
		
	}

}

19.Sum of Digits in a String
 
Write code to get the sum of all the digits present in the given string.
 
Include a class UserMainCode with a static method sumOfDigits which accepts string input.
 
Return the sum as output. If there is no digit in the given string return -1 as output.
 
Create a class Main which would get the input and call the static method sumOfDigits present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output is a single integer which is the sum of digits in a given string.
Refer sample output for formatting specifications.
 
Sample Input 1:
good23bad4
Sample Output 1:
9

Sample Input 2:
good
Sample Output 2:
-1
importjava.util.Scanner;

publicclassUserMaincode
{
	staticintsumOfDigits(String str)
	{
		int k=str.length();
		int sum=0,i;
		for(i=0;i<k;i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				/*StringBuffer s=newStringBuffer();
				s.append(str.charAt(i));*/
				sum=sum+Integer.parseInt(str.charAt(i)+””); 
			}
		}
		if(sum>=0)
		return sum;
		else
			return -1;
		
	}
	
	publicstaticvoid main(String args[])
{
		String s1;
		Scanner in=newScanner(System.in);
		s1=in.nextLine();
		intans=UserMaincode.sumOfDigits(s1);
			System.out.println(ans);
		
}
}
 
20.String Concatenation
Write code to get two strings as input and If strings are of same length simply append them together and return the final string. If given strings are of different length, remove starting characters from the longer string so that both strings are of same length then append them together and return the final string.
 
Include a class UserMainCode with a static method concatstring which accepts two string input.
 
The return type of the output is a string which is the concatenated string.
 
Create a class Main which would get the input and call the static method concatstring present in the UserMainCode.
 
Input and Output Format:
Input consists of two strings.
Output is a string.
Refer sample output for formatting specifications.
 
Sample Input 1:
Hello
hi
Sample Output 1:
lohi

 
Sample Input 2:
Hello
Delhi
Sample Output 2:
HelloDelhi
importjava.util.Scanner;


public class UserMainCode {

	/**
	 * @paramargs
	 */
	static String concatstring(String s1,String s2)
	 {
		intk=s1.length();
		int a=s2.length();
		 String s3="0";
		
		if(k==a)
		 {
			s3=s1.concat(s2);
		 }
		if(k>a)
		 {
			s3=(s1.substring(k-a).concat(s2));
		 }
		if(k<a)
		 {
			 s3=((s1.concat(s2.substring(a-k))));
		 }
			
			return s3; 
			
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        String n1=in.nextLine();
        String n2=in.nextLine();
       String n3=UserMainCode.concatstring(n1,n2);
System.out.println(n3);
	}

}
 
21. Color Code
 
Write a program to read a string and validate whether the given string is a valid color code based on the following rules:
- Must start with "#" symbol
- Must contain six characters after #
- It may contain alphabets from A-F or digits from 0-9
 
Include a class UserMainCode with a static method validateColorCode which accepts a string. The return type (integer) should return 1 if the color is as per the rules else return -1.
Create a Class Main which would be used to accept a String and call the static method present in UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of a string (Valid or Invalid).
Refer sample output for formatting specifications.
Sample Input 1:
#FF9922
Sample Output 1:
Valid
 
Sample Input 2:
#FF9(22
Sample Output 2:
Invalid
importjava.util.Scanner;

publicclassUserMainCode {
publicstaticintvalidateColorCode(String s1) 
        {
	
	if(s1.matches("[#]{1}[A-F|0-9]{6}"))
		return 1;
	else
return -1; 
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
int k=UserMainCode.validateColorCode(s1);
if(k==1)
	System.out.println("VALID");
else
	System.out.println("INVALID");
in.close();
    }
}
22.Three Digits
Write a program to read a string and check if the given string is in the format "CTS-XXX" where XXX is a three digit number.
Include a class UserMainCode with a static method validatestrings which accepts a string. The return type (integer) should return 1 if the string format is correct else return -1.
Create a Class Main which would be used to accept a String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string (Valid or Invalid).
Refer sample output for formatting specifications.
Sample Input 1:
CTS-215
Sample Output 1:
Valid
 
Sample Input 2:
CTS-2L5
Sample Output 2:
Invalid
importjava.util.Scanner;

publicclassUserMainCode {
publicstaticintvalidatestrings(String s1) 
        {
	
	if(s1.matches("(CTS)[-]{1}[0-9]{3}"))
		return 1;
	else
return -1; 
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
int k=UserMainCode.validatestrings(s1);
if(k==1)
	System.out.println("VALID");
else
	System.out.println("INVALID");
in.close();
    }
}
27.Validating Input Password
102.Write a code get a password as string input and validate using the rules specified below. Apply following validations:
 
1. Minimum length should be 8 characters
2. Must contain any one of these three special characters @ or _ or #
3. May contain numbers or alphabets.
4. Should not start with special character or number
5. Should not end with special character
 
Include a class UserMainCode with a static method validatePassword which accepts password string as input and returns an integer. The method returns 1 if the password is valid. Else it returns -1.
 
 
Create a class Main which would get the input and call the static method validatePassword present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output is a string Valid or Invalid.
Refer sample output for formatting specifications.
 
Sample Input 1:
ashok_23
Sample Output 1:
Valid

Sample Input 2:
1980_200
Sample Output 2:
Invalid
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstaticintvalidatePassword(String s1) 
        {
	int k=s1.length();

	if(k>=8 && s1.matches(".*[@_#]{1}.*") && s1.matches("^[^@_#0-9].*") && s1.matches(".*[^@_#]$"))
	{

		return 1;  			
	}
	else
return -1;
	
	
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
int k=UserMainCode.validatePassword(s1);
if(k==1)
	System.out.println("VALID");
else
	System.out.println("INVALID");
in.close();
    }
}
 
 
28.iD Validation
Write a program to get two string inputs and validate the ID as per the specified format.
 
Include a class UserMainCode with a static method validateIDLocations which accepts two strings as input.
 
The return type of the output is a string Valid Id or Invalid Id.
 
Create a class Main which would get the input and call the static method validateIDLocations present in the UserMainCode.
 
Input and Output Format:
Input consists of two strings.
First string is ID and second string is location. ID is in the format CTS-LLL-XXXX where LLL is the first three letters of given location and XXXX is a four digit number.
 
Output is a string Valid id or Invalid id.
Refer sample output for formatting specifications.
 
Sample Input 1:
CTS-hyd-1234
hyderabad
Sample Output 1:
Valid id

Sample Input 2:
CTS-hyd-123
hyderabad
Sample Output 2:
Invalid id
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstatic String validateIDLocations(String s1,String s2) 
        {
	

	if(s1.matches("(CTS)[-]{1}[a-zA-Z]{3}[-]{1}[0-9]{4}"))
	{
		if(s1.charAt(4)==s2.charAt(0) && s1.charAt(5)==s2.charAt(1) && s1.charAt(6)==s2.charAt(2))
		return"valid"; 			
	}
return"invalid";
	
	
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
	String s2=in.nextLine();

System.out.println(UserMainCode.validateIDLocations(s1,s2));
in.close();

    }

}
29.Remove Elements
Write a program to remove all the elements of the given length and return the size of the final array as output. If there is no element of the given length, return the size of the same array as output.
 
Include a class UserMainCode with a static method removeElements which accepts a string array, the number of elements in the array and an integer. The return type (integer) should return the size of the final array as output.
Create a Class Main which would be used to accept Input String array and a number and call the static method present in UserMainCode.
Assume maximum length of array is 20.
Input and Output Format:
Input consists of a integers that corresponds to n, followed by n strings and finally m which corresponds to the length value.
Output consists of a single Integer.
Refer sample output for formatting specifications.
 
Sample Input 1:
5
a
bb
b
ccc
ddd
2
Sample Output 1:
4
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstaticintremoveElements(String s1[],int k) 
        {
	int a=s1.length;
for(inti=0;i<s1.length;i++)
                 {
	if(s1[i].length()==k)
		 --a;
		
                 }
	
		return a;				
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
int l=Integer.parseInt(in.nextLine());
	String s1[]=new String[l];
	for(inti=0;i<l;i++)
		s1[i]=in.nextLine();
	int k=Integer.parseInt(in.nextLine());
System.out.println(UserMainCode.removeElements(s1,k));
in.close();

    }
}
32.IP Validator
Write a program to read a string and validate the IP address. Print “Valid” if the IP address is valid, else print “Invalid”.
 
Include a class UserMainCode with a static method ipValidator which accepts a string. The return type (integer) should return 1 if it is a valid IP address else return 2.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string that corresponds to an IP.
Output consists of a string(“Valid” or “Invalid”).
Refer sample output for formatting specifications.
 
Note: An IP address has the format a.b.c.d where a,b,c,d are numbers between 0-255.
 
Sample Input 1:
132.145.184.210
Sample Output 1:
Valid
 
Sample Input 2:
132.145.184.290
Sample Output 2:
Invalid
 
importjava.util.Scanner;
importjava.util.StringTokenizer;
publicclassUserMainCode {
	
publicstaticStringipValidator(String s1) 
        {
	StringTokenizerst=newStringTokenizer(s1,".");
inti=0;  
	while(st.hasMoreTokens())
	{
		int k=Integer.parseInt(st.nextToken());
		if(k>=0 && k<=255)
			++i;
	}
if(i==4)
	return"VALID";
return"Invalid";
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(UserMainCode.ipValidator(s1));
in.close();

    }
}
 
34.File Extension
Write a program to read a file name as a string and find out the file extension and return it as output. For example, the file sun.gif has the extension gif.
 
Include a class UserMainCode with a static method fileIdentifier which accepts a string. The return type (string) should return the extension of the input string (filename).
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string that corresponds to a file name.
Output consists of a string(extension of the input string (filename)).
Refer sample output for formatting specifications.
Sample Input 1:
sun.gif
Sample Output 1:
Gif
importjava.util.Scanner;
importjava.util.StringTokenizer;
publicclassUserMainCode {
	
publicstaticStringipValidator(String s1) 
        {
	StringTokenizerst=newStringTokenizer(s1,".");
	st.nextToken();
		String s=st.nextToken();
	return s;
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(UserMainCode.ipValidator(s1));
in.close();

    }
}
 
35.Find common characters and unique characters in string
Given a method with two strings as input. Write code to count the common and unique letters in the two strings.
 
Note:
- Space should not be counted as a letter.
- Consider letters to be case sensitive. ie, "a" is not equal to "A".
 
Include a class UserMainCode with a static method commonChars which accepts two strings as input.
 
The return type of the output is the count of all common and unique characters in the two strings.
 
Create a class Main which would get the inputs and call the static method commonChars present in the UserMainCode.
 
Input and Output Format:
Input consists of two strings.
Output is an integer.
Refer sample output for formatting specifications.
 
Sample Input 1:
a black cow
battle ship
Sample Output 1:
2

[Explanation : b, l and a are the common letters between the 2 input strings. But 'a' appears more than once in the 1st string. So 'a' should not be considered while computing the count value.]
 

Sample Input 2:
australia
sri lanka
Sample Output 2:
4
importjava.util.Scanner;
publicclassUserMainCode
{
	
	staticintuniqueCounter(String s1,String s2)
	{
		inti,l=0,j;
		String temp,temp1;
		s1=s1.replaceAll("\\s","");
		s2=s2.replaceAll("\\s","");
		for(i=0;i<s1.length();i++)
		{   
			if(i!=0)
			temp=s1.substring(0,i).concat(s1.substring(i+1)); 
			else
		temp=s1.substring(i+1);
			String c=s1.charAt(i)+"";
			if((!temp.contains(c)) && s2.contains(c))
			{
				int k=s2.indexOf(c);
					if(k!=0)
					temp1=s1.substring(0,k).concat(s1.substring(k+1)); 
					else
				       temp1=s1.substring(k+1);
					String d=s1.charAt(k)+"";
					if(!temp.contains(c))
					{
						++l;
					}
			}
		}

			
		return l;
	}
	publicstaticvoid main(String args[])
	  {
		Scanner in=newScanner(System.in);
		String str=in.nextLine();
		String str1=in.nextLine();
		intans=UserMainCode.uniqueCounter(str,str1);
		System.out.println(ans);
		in.close();
	  }
}
 
36.Initial Format
Write a program to input a person's name in the format "FirstName LastName" and return the person name in the following format - "LastName, InitialOfFirstName".
 
Include a class UserMainCode with a static method nameFormatter which accepts a string. The return type (string) should return the expected format.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string that corresponds to a Person's name.
Output consists of a string(person's name in expected format).
Refer sample output for formatting specifications.
Sample Input :
Jessica Miller
Sample Output:
Miller, J
importjava.util.Scanner;
importjava.util.StringTokenizer;

publicclassUserMainCode {
	
publicstatic String nameFormatter(String s1) 
        {
	StringBuffersb=newStringBuffer();
	StringTokenizerst=newStringTokenizer(s1);
	String s2=st.nextToken();
	String s3=st.nextToken();
	sb.append(s3);
	sb.append(",");
	sb.append(s2.substring(0,1).toUpperCase());
	returnsb.toString();
		
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);  
	String s1=in.nextLine();	
System.out.println(UserMainCode.nameFormatter(s1));
in.close();

    }
}


37.Character cleaning
Write a program to input a String and a character, and remove that character from the given String. Print the final string.
Include a class UserMainCode with a static method removeCharacter which accepts a string and a character. The return type (string) should return the character cleaned string.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and a character.
Output consists of a string(the character cleaned string).
Refer sample output for formatting specifications.
 
Sample Input :
elephant
e
Sample Output:
Lphant
importjava.util.Scanner;


publicclassUserMainCode {

	/**
	 * @paramargs
	 */
	staticStringremoveCharacter(String s1,char s2)
	 {
		int k=s1.length();
		StringBuffer sb1= newStringBuffer();
		for(inti=0;i<k;i++)
		 {
			char c=s1.charAt(i);
			if(c!=s2)
				 sb1.append(c);
		 }
		return sb1.toString();
	 }
	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=newScanner(System.in);
	        String n1=in.nextLine();
	char n2=in.next().charAt(0);
	       String n3=UserMainCode.removeCharacter(n1,n2);
	System.out.println(n3);
	}

}
 
38.Vowel Check
Write a program to read a String and check if that String contains all the vowels. Print “yes” if the string contains all vowels else print “no”.
Include a class UserMainCode with a static method getVowels which accepts a string. The return type (integer) should return 1 if the String contains all vowels else return -1.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string(“yes” or “no”).
Refer sample output for formatting specifications.
Sample Input 1:
abceiduosp
Sample Output 1:
yes
 
Sample Input 2:
bceiduosp
Sample Output 2:
No
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstaticStringgetVowels(String s1) 
        {    String s=”yes”;
	if(s1.contains(“a”) && s1.contains(“e”) &&s1.contains(“i”) &&s1.contains(“o”) && s1.contains(“u”))
	       s=yes;
else
                    s=”no”;
				return s;	
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);  
	String s1=in.nextLine();	
System.out.println(UserMainCode.getVowels(s1));
in.close();

    }
}
39.Swap Characters
Write a program to input a String and swap the every 2 characters in the string. If size is an odd number then keep the last letter as it is. Print the final swapped string.
Include a class UserMainCode with a static method swapCharacter which accepts a string. The return type (String) should return the character swapped string.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
TRAINER
Sample Output 1:
RTIAENR
 
Sample Input 2:
TOM ANDJERRY
Sample output 2:
OT MNAJDREYR
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstatic String swapCharacter(String s1) 
        {
	StringBuffersb=newStringBuffer();
	for(inti=0;i<s1.length();i=i+2)
	{   charc,d;
		if(i!=s1.length()-1)
	    {
		 c=s1.charAt(i);
		d=s1.charAt(i+1);
		sb.append(d);
		sb.append(c);
	    }
	else
	    {
		c=s1.charAt(i);
		sb.append(c);
	     }
		
	}
	returnsb.toString();
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);  
	String s1=in.nextLine();	
System.out.println(UserMainCode.swapCharacter(s1));
in.close();

    }
}
 
42.Count Sequential Characters
109.Get a string as input and write code to count the number of characters which gets repeated 3 times consecutively and return that count (ignore case). If no character gets repeated 3 times consecutively return -1.
 
Include a class UserMainCode with a static method countSequentialChars which accepts a string as input.
 
The return type of the output is the repeat count.
 
Create a class Main which would get the input and call the static method countSequentialChars present in the UserMainCode.
 
Input and Output Format:
Input consists a string.
Output is an integer.
Refer sample output for formatting specifications.
 
Sample Input 1:
abcXXXabc
Sample Output 1:
1

Sample Input 2:
aaaxxyzAAAx
Sample Output 2:
2
importjava.util.Scanner;

publicclassUserMainCode {
		
	staticintcountSequentialChars(String s1)
	{
		Str1=s1.toUpper();
		int c=0;
		for(inti=0;i<str1.length()-1;i++)
		{
			if(str1.charAt(i)==str1.charAt(i+1))
			{
				if(str1.charAt(i+1)==str1.charAt(i+2))
{
					++c;
			i=i+2;
}		
			}
		}
		return c;
		
	}
		publicstaticvoid main(String args[])
	{
		String s1;
		Scanner in=newScanner(System.in);
		s1=in.nextLine();
		intans=UserMainCode.countSequentialChars(s1);
		System.out.println(ans);
		
	}

}
43.Length of the Largest Chunk
Write a program to read a string and find the length of the largest chunk in the string. If there are no chunk print “No chunks” else print the length.
NOTE: chunk is the letter which is repeating 2 or more than 2 times.
Include a class UserMainCode with a static method largestChunk which accepts a string. The return type (Integer) should return the length of the largest chunk if the chunk is present, else return -1.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
You are toooo good
Sample Output 1:
4
(Because the largest chunk is letter 'o' which is repeating 4 times)
 
Sample Input 2:
who are u
Sample Output 2:
No chunks
importjava.util.Scanner;
importjava.util.StringTokenizer;
publicclassUserMainCode {
		
	staticintlargestChunk(String str1)
	{
		intc,max=0,i=0,j=0;
		StringTokenizerst=newStringTokenizer(str1);
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
		for(i=0;i<s1.length()-1;i++)
		{   
			c=1;
			if(s1.charAt(i)==s1.charAt(i+1))
			{   ++c;
				for(j=i+2;j<s1.length();j++)
				{
					if(s1.charAt(i)==s1.charAt(j))
					{
						++c;
					}
					else
						break;
				}
			}
			if(c>max)
			{
				max=c;
				i=j-1;
			}
		}
		}
		return (max);
		
	}
		publicstaticvoid main(String args[])
	{
		String s1;
		Scanner in=newScanner(System.in);
		s1=in.nextLine();
		intans=UserMainCode.largestChunk(s1);
		if(ans>=2)
			System.out.println(ans);
		else
		System.out.println("No Chunks");
		
	}
 
44 .Unique Characters in a string
Write a program that takes a string and returns the number of unique characters in the string. If the given string doest not contain any unique characters return -1
 
Include a class UserMainCode with a static method uniqueCounter which accepts a string as input.
 
The return type of the output is the count of all unique characters in the strings.
 
Create a class Main which would get the input and call the static method uniqueCounter present in the UserMainCode.
 
Input and Output Format:
Input consists a string.
Output is an integer.
Refer sample output for formatting specifications.
 
Sample Input 1:
HelloWorld
Sample Output 1:
5

Sample Input 2:
coco
Sample Output 2:
-1
importjava.util.Scanner;
publicclassUserMainCode
{
	
	staticintuniqueCounter(String s)
	{
		inti,l=0;
		String temp;
		for(i=0;i<s.length();i++)
		{   
			if(i!=0)
			temp=s.substring(0,i).concat(s.substring(i+1)); 
			else
		temp=s.substring(i+1);
			String c=s.charAt(i)+"";
			if(!temp.contains(c))
			{
				++l;
			}
		}		
		return l;
	}
	publicstaticvoid main(String args[])
	  {
		Scanner in=newScanner(System.in);
		String str=in.nextLine();
		intans=UserMainCode.uniqueCounter(str);
		System.out.println(ans);
		in.close();
	  }
}
45.Name Shrinking
Write a program that accepts a string as input and converts the first two names into dot-separated initials and printa the output.

Input string format is 'fn mn ln'.   Output string format is 'ln [mn's 1st character].[fn's 1st character]'
 
Include a class UserMainCode with a static method getFormatedString which accepts a string. The return type (String) should return the shrinked name.
Create a Class Main which would be used to accept Input String and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a String.
Refer sample output for formatting specifications.
Sample Input:
Sachin Ramesh Tendulkar
Sample Output:
Tendulkar R.S
importjava.util.Scanner;
importjava.util.StringTokenizer;
publicclassUserMainCode {	
publicstatic String getFormatedString(String s1) 
        {
	StringBuffersb=newStringBuffer();
	StringTokenizerst=newStringTokenizer(s1);
	String s2=st.nextToken();
	String s3=st.nextToken();
	String s4=st.nextToken();
	sb.append(s4).append(" ");
	sb.append(s3.substring(0,1).toUpperCase());
	sb.append(".");
	sb.append(s2.substring(0,1).toUpperCase());
	returnsb.toString();		
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);  
	String s1=in.nextLine();	
System.out.println(UserMainCode.getFormatedString(s1));
in.close();

    }
}
46.Odd Digit Sum
Write a program to input a String array. The input may contain digits and alphabets (“de5g4G7R”). Extract odd digits from each string and find the sum and print the output.
For example, if the string is "AKj375A" then take 3+7+5=15 and not as 375 as digit.
Include a class UserMainCode with a static method oddDigitSum which accepts a string array and the size of the array. The return type (Integer) should return the sum.
Create a Class Main which would be used to accept Input Strings and call the static method present in UserMainCode.
Assume maximum length of array is 20.
Input and Output Format:
Input consists of an integer n, corresponds to the number of strings, followed by n Strings.
Output consists of an Integer.
Refer sample output for formatting specifications.
Sample Input :
3
cog2nizant1
al33k
d2t4H3r5
Sample Output :
15
(1+3+3+3+5)
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstaticintoddDigitSum(String s1[],int k) 
        {
	intsum=0;
for(inti=0;i<k;i++)
{
	for(int j=0;j<s1[i].length();j++)
	{
		char c=s1[i].charAt(j);
		if(c>='0'&& c<='9')
		{
			int x=Integer.parseInt(c+"");
			if(x%2!=0)
				sum=sum+x;
		}
			
	}
 }
	
		returnsum;				
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
int l=Integer.parseInt(in.nextLine());
	String s1[]=new String[l];
	for(inti=0;i<l;i++)
		s1[i]=in.nextLine();
System.out.println(UserMainCode.oddDigitSum(s1,l));
in.close();

    }
}
49.Color Code Validation
Give a String as colour code as input and write code to validate whether the given string is a valid color code or not.
 
Validation Rule:
String should start with the Character '#'.
Length of String is 7.
It should contain 6 Characters after '#' Symbol.
It should contain Characters between 'A-F' and Digits '0-9'.
If String acceptable the return true otherwise false.
 
 
Include a class UserMainCode with a static method validateColourCode which accepts a string as input.
 
The return type of the output is a boolean which returns true if its is a valid color code else it returns false.
 
Create a class Main which would get the input and call the static method validateColourCode present in the UserMainCode.
 
Input and Output Format:
Input consists a string corresponding to the color code.
Output is a boolean which returns true or false
Refer sample output for formatting specifications.
 
Sample Input 1:
#99FF33
Sample Output 1:
true

Sample Input 2:
#CCCC99#
Sample Output 2:
false

importjava.util.Scanner;

publicclassUserMainCode {
publicstatic String validateColorCode(String s1) 
        {
	
	if(s1.matches("[#]{1}[A-F|0-9]{6}"))
		return"true";
	else
return"false"; 
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(UserMainCode.validateColorCode(s1));

in.close();
    }
}


50.Repeating set of characters in a string
Get a string and a positive integer n as input .The last n characters should repeat the number of times given as second input.Write code to repeat the set of character from the given string.
 
Include a class UserMainCode with a static method getString which accepts a string and an integer n as input.
 
The return type of the output is a string with repeated n characters.
 
Create a class Main which would get the input and call the static method getString present in the UserMainCode.
 
Input and Output Format:
Input consists a string and a positive integer n.
Output is a string with repeated characters.
Refer sample output for formatting specifications.
 
Sample Input 1:
Cognizant
3
Sample Output 1:
Cognizantantantant

Sample Input 2:
myacademy
2
Sample Output 2:
Myacademymymy

 importjava.util.Scanner;

publicclassUserMainCode {
publicstaticStringgetString (String s1,int k) 
        {
	int x=s1.length();
	StringBuffersb=newStringBuffer(s1);
	String s2=s1.substring(x-k);
	for(inti=1;i<=k;i++)
		sb.append(s2);
	returnsb.toString();
        }

publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
	int a=in.nextInt();
System.out.println(UserMainCode.getString (s1,a));

in.close();
    }
}
 
54.Flush Characters
Write a program to read a string from the user and remove all the alphabets and spaces from the String, and only store special characters and digit in the output String. Print the output string.
 
Include a class UserMainCode with a static method getSpecialChar which accepts a string. The return type (String) should return the character removed string.
Create a Class Main which would be used to accept a string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a strings.
Output consists of an String (character removed string).
Refer sample output for formatting specifications.
 
Sample Input :
cogniz$#45Ant
Sample Output :
$#45
importjava.util.Scanner;

publicclassUserMainCode {
publicstatic String getString (String s1) 
        {
	int x=s1.length();
	StringBuffersb=newStringBuffer();
	for(inti=0;i<x;i++)
	    {   char c=s1.charAt(i);
		if((!Character.isAlphabetic(c)) && c!=’ ‘)
		sb.append(c);
	    }
	returnsb.toString();
        }

publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(UserMainCode.getString (s1));

in.close();
    }
}
 
55.String Repetition
 
Write a program to read a string and an integer and return a string based on the below rules.
If input2 is equal or greater than 3 then repeat the first three character of the String by given input2 times, separated by a space.
If input2 is 2 then repeat the first two character of String two times separated by a space,
If input2 is 1 then return the first character of the String.
Include a class UserMainCode with a static method repeatString which takes a string & integer and returns a string based on the above rules.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string and integer.
Output consists of a string.
Refer sample output for formatting specifications.

 
Sample Input 1:
COGNIZANT
4
Sample Output 1:
COG COG COG COG

 
Sample Input 2:
COGNIZANT
2
Sample Output 2:
CO CO
importjava.util.Scanner;
publicclassUserMainCode {
publicstaticStringrepeatString(String s1,int n) 
        {
	StringBuffersb=newStringBuffer();
for(inti=0;i<n;i++)
        {
	if(n>=3)
sb.append(s1.substring(0,3)).append(" ");
elseif(n==2)
sb.append(s1.substring(0,2)).append(" ");
elseif(n==1)
sb.append(s1.substring(0,1));
        }
returnsb.toString();
        }

publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
	int a=in.nextInt();
System.out.println(UserMainCode.repeatString(s1,a));

in.close();
    }
}
59.Simple String Manipulation
 
Write a program to read a string and return a modified string based on the following rules.
Return the String without the first 2 chars except when
keep the first char if it is 'j'
keep the second char if it is 'b'.
Include a class UserMainCode with a static method getString which accepts a string. The return type (string) should be the modified string based on the above rules. Consider all letters in the input to be small case.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
hello
Sample Output 1:
llo
Sample Input 2:
java
Sample Output 2:
Jva
importjava.util.Scanner;

publicclassUserMainCode {
publicstatic String getString(String s1) 
        {
	char c=s1.charAt(0);
	chard=s1.charAt(1);
	    String s=s1.substring(2);
	StringBuffersb=newStringBuffer();
if(c!='j'&&d!='b')
	sb.append(s);
elseif(c!='j'&&d=='b')
	sb.append(d).append(s);
elseif(c=='j'&&d!='b')
	sb.append(c).append(s);
else
	sb.append(s1);
returnsb.toString();
        }

publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(UserMainCode.getString(s1));

in.close();
    }
}
 
62.Count Vowels
 
Given a string input, write a program to find the total number of vowels in the given string.
 
Include a class UserMainCode with a static method “countVowels” that accepts a String argument and returns an int that corresponds to the total number of vowels in the given string.
 
Create a class Main which would get the String as input and call the static method countVowels present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of an integer..
 
Sample Input:
avinash
 
Sample Output:
3
importjava.util.Scanner;

publicclassUserMainCode {
publicstaticintcountVowels(String s1) 
        {
	    String s=s1.toLowerCase();
	int c=0;
	for(inti=0;i<s.length();i++)
	    {
		char k=s.charAt(i);
		if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u')
			++c;
	    }
	return c;
        }

publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
System.out.println(UserMainCode.countVowels(s1));

in.close();
    }
}
64.Reverse SubString
 
Given a string, startIndex and length, write a program to extract the substring from right to left. Assume the last character has index 0.
 
Include a class UserMainCode with a static method “reverseSubstring” that accepts 3 arguments and returns a string. The 1st argument corresponds to the string, the second argument corresponds to the startIndex and the third argument corresponds to the length.
 
Create a class Main which would get a String and 2 integers as input and call the static method reverseSubstring present in the UserMainCode.
 
Input and Output Format:
The first line of the input consists of a string.
The second line of the input consists of an integer that corresponds to the startIndex.
The third line of the input consists of an integer that corresponds to the length of the substring.
 
Sample Input:
rajasthan
2
3
 
Sample Output:
hts
 importjava.util.Scanner;

publicclassUserMainCode {
publicstatic String reverseSubstring(String s1,int n1,int n2) 
        {
	StringBuffersb=newStringBuffer(s1);
    String s=sb.reverse().toString();
returns.substring(n1,n1+n2);


        }

publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
	int n11=in.nextInt();
	int n21=in.nextInt();
System.out.println(UserMainCode.reverseSubstring(s1,n11,n21));

in.close();
    }
}
 
 
65.String Finder
 
Given three strings say Searchstring, Str1 and Str2 as input, write a program to find out if Str2 comes after Str1 in the Searchstring.
 
Include a class UserMainCode with a static method “stringFinder” that accepts 3 String arguments and returns an integer. The 3 arguments correspond to SearchString, Str1 and Str2. The function returns 1 if Str2 appears after Str1 in the Searchtring. Else it returns 2.
 
Create a class Main which would get 3 Strings as input and call the static method stringFinder present in the UserMainCode.
 
Input and Output Format:
Input consists of 3 strings.
The first input corresponds to the SearchString.
The second input corresponds to Str1.
The third input corresponds to Str2.
Output consists of a string that is either “yes” or “no”
 
 
Sample Input 1:
geniousRajKumarDev
Raj
Dev
 
Sample Output 1:
yes
 
Sample Input 2:
geniousRajKumarDev
Dev
Raj
 
Sample Output 2:
No
importjava.util.Scanner;
publicclassUserMainCode {
	
publicstaticintstringFinder(String s1,String s2,String s3) 
        {
	int l=0;
	if(s1.contains(s2)&& s1.contains(s3))
	{
	if(s1.indexOf(s2)<s1.lastindexOf(s3))
	{
	l=1;
	}
	else
	l=2;
	return l;
			
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);
	String s1=in.nextLine();
	String s2=in.nextLine();
	String s3=in.nextLine();
	intans=UserMainCode.stringFinder(s1,s2,s3);
	if(ans==1)
System.out.println("yes");
	else
	System.out.println("no");	
in.close();

    }
}
66.Phone Number Validator
 
Given a phone number as a string input, write a program to verify whether the phone number is valid using the following business rules:
-It should contain only numbers or dashes (-)
- dashes may appear at any position
-Should have exactly 10 digits
 
Include a class UserMainCode with a static method “validatePhoneNumber” that accepts a String input and returns a integer. The method returns 1 if the phone number is valid. Else it returns 2.
 
Create a class Main which would get a String as input and call the static method validatePhoneNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of a string that is either 'Valid' or 'Invalid'
 
Sample Input 1:
265-265-7777
 
Sample Output 1:
Valid
 
Sample Input 2:
265-65-7777
 
Sample Output 1:
Invalid

import java.util.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.*;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
	public static float sizeOfResultandHashMap(HashMap<Integer ,Float>hm)
	{  int k,count=0;
	float sum=0.0f;
	DecimalFormat f=new DecimalFormat("#.00");
		Iterator<Integer>i=hm.keySet().iterator();
		while(i.hasNext())
		{
			k=i.next();
			if(k%2==0)
			{
				sum=sum+hm.get(k);
				count++;
			}
		}
		float d=sum/count;
		String str=f.format(d);
		float d1=Float.parseFloat(str);
return d1;

	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
HashMap<Integer,Float>hm=new HashMap<Integer,Float>();
for(int i=0;i<n;i++)
 {
	hm.put(in.nextInt(),in.nextFloat());
 }
System.out.println(Main.sizeOfResultandHashMap(hm));

	}
}
 

41.Calculate Average – Hash Map
 
Write amethod that accepts the input data as a hash map and finds out the avg of all values whose keys are odd numbers. 

Include a class UserMainCode with a static method calculateAverage which accepts aHashMap<Integer,Double> and the size of the HashMap. The return type (Double) should return the calculated average. Round the average to two decimal places and return it.
Create a Class Main which would be used to accept Input values and store it as a hash map, and call the static method present in UserMainCode. 
Input and Output Format:
Input consists of an integer n corresponds to number of hash map values, followed by 2n values. (index followed by value).
Output consists of a Double.
Refer sample input and output for formatting specifications.
Sample Input :
4
1
3.41
2
4.1
3
1.61
4
2.5
Sample Output :
2.51
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
	public static double sizeOfResultandHashMap(HashMap<Integer ,Float>hm)
	{  int k,count=0;
	float sum=0.0f;
	DecimalFormat f=new DecimalFormat("#.00");
		Iterator<Integer>i=hm.keySet().iterator();
		while(i.hasNext())
		{
			k=i.next();
			if(k%2!=0)
			{
				sum=sum+hm.get(k);
				count++;
			}
		}
		float d=sum/count;
		String str=f.format(d);
		double d1=Double.parseDouble(str);
return d1;

	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
HashMap<Integer,Float>hm=new HashMap<Integer,Float>();
for(int i=0;i<n;i++)
 {
	hm.put(in.nextInt(),in.nextFloat());
 }
System.out.println(Main.sizeOfResultandHashMap(hm));

	}
}
 
48.Sum of Lowest marks
Given input as HashMap, value consists of marks and rollno as key.Find the sum of the lowest three subject marks from the HashMap.
 
Include a class UserMainCode with a static method getLowest which accepts a Hashmap with marks and rollno.
 
The return type of the output is the sum of lowest three subject marks.
 
Create a class Main which would get the input and call the static method getLowest present in the UserMainCode.
 
Input and Output Format:
First line of the input corresponds to the HashMap size.
Input consists a HashMap with marks and rollno.
Output is an integer which is the sum of lowest three subject marks.
Refer sample output for formatting specifications.
 
Sample Input 1:
5
1
54
2
85
3
74
4
59
5
57
Sample Output 1:
170

 
Sample Input 2:
4
10
56
20
58
30
87
40
54
Sample Output 2:
168
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
	public static int sizeOfResultandHashMap(HashMap<Integer ,Integer>hm)
	{  
int k=0;
int a[]=new int[hm.size()];
       Iterator<Integer> it=hm.values().iterator();
while(it.hasNext())
       {
	int  l=it.next();
	a[k]=l;
	   ++k;
       }
Arrays.sort(a);     
		return a[0]+a[1]+a[2];

	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
for(int i=0;i<n;i++)
 {
	hm.put(in.nextInt(),in.nextInt());
 }
System.out.println(Main.sizeOfResultandHashMap(hm));

	}
}
 
52.Removing elements from HashMap
Given a HashMap as input, write a program to perform the following operation :  If the keys are divisible by 3 then remove that key and its values and print the number of remaining keys in the hashmap.
 
Include a class UserMainCode with a static method afterDelete which accepts a HashMap as input.
 
The return type of the output is an integer which represents the count of remaining elements in the hashmap.
 
Create a class Main which would get the input and call the static method afterDelete present in the UserMainCode.
 
Input and Output Format:
First input corresponds to the size of hashmap
Input consists a HashMap
Output is an integer which is the count of remaining elements in the hashmap.
Refer sample output for formatting specifications.
 
Sample Input 1:
4
339
RON
1010
JONS
3366
SMITH
2020
TIM
Sample Output 1:
2
 
Sample Input 2:
5
1010
C2WE
6252
XY4E
1212
M2ED
7070
S2M41ITH
8585
J410N
Sample Output 2:
3
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
	public static int sizeOfResultandHashMap(HashMap<Integer ,String>hm)
	{  int k,count=0;
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			k=it.next();
			if(k%3!=0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
HashMap<Integer,String>hm=new HashMap<Integer,String>();
for(int i=0;i<n;i++)
 {
	hm.put(in.nextInt(),in.next());
 }
System.out.println(Main.sizeOfResultandHashMap(hm));
	}
}
11.Largest Key in HashMap
 
Write a program that construts a hashmap and returns the value corresponding to the largest key.
Include a class UserMainCode with a static method getMaxKeyValue which accepts a string. The return type (String) should be the value corresponding to the largest key.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers equals the integer key and value as string.
Output consists of a string which is the value of largest key.
Refer sample output for formatting specifications.
Sample Input 1:
3
12
amron
9
Exide
7
SF
Sample Output 1:
Amron
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
public static String sizeOfResultandHashMap(HashMap<Integer ,String>hm)
	{  
int max=0;
	    String s2="";
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
		int a=it.next();
		if(a>max)
		{
		max=a;
		String s3=hm.get(a);
		s2=s3;
		}
		}
		return s2;

	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
HashMap<Integer,String>hm=new HashMap<Integer,String>();
for(int i=0;i<n;i++)
 {
	hm.put(in.nextInt(),in.next());
 }
System.out.println(Main.sizeOfResultandHashMap(hm));
	}
}
17.Vowels, Arrays & ArrayLists
 
Write a program to read an array of strings and return an arraylist which consists of words whose both first and last characters are vowels. Assume all inputs are in lowecase.
Include a class UserMainCode with a static method matchCharacter which accepts a string array. The return type shoud be an arraylist which should contain elements as mentioned above.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' string correspond to the elements in the array.
Output consists of strings which are elements of arraylist
Refer sample output for formatting specifications.

 
Sample Input 1:
4
abcde
pqrs
abci
orto

 
Sample Output 1:
abcde
abci
orto
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main
{
	public static ArrayList<String>vowelCheck(String a[])
	{
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<a.length;i++)
		{
			if(a[i].matches("[a||e||i||o||u]{1}.*[a||e||i||o||u]{1}"))
			{
				al.add(a[i]);
			}
		}
		return al;
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] a=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.next();
		}
	ArrayList<String>arr=Main.vowelCheck(a);
	Iterator<String> it=arr.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
		

	}

}

18.Transfer from Hashmap to Arraylist
 
Write a program that constructs a hashmap with “employee id” as key and “name” as its value. Based on the rules below, on being satisfied, the name must be added to the arraylist.
i)First character should be small and the last character should be Capital.
ii)In name at least one digit should be there.
Include a class UserMainCode with a static method getName which accepts a hashmap. The return type is an arraylist as expected in the above statement
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2n+1 values. The first value corresponds to size of the hashmap. The next n pair of numbers contains the employee id and name.
Output consists of arraylist of strings as mentioned in the problem statement.
Refer sample output for formatting specifications.
Sample Input 1:
4
1
ravi5raJ
2
sita8gitA
3
ram8sitA
4
rahul
Sample Output 1:
ravi5raJ
sita8gitA
ram8sitA

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Main
{
	public static ArrayList<String>getName(HashMap<Integer,String>hm)
	{
		ArrayList<String> al=new ArrayList<String>();
		Iterator<String> it=hm.values().iterator();
		while(it.hasNext())
		{
			String s=it.next();
			if(s.matches("^[a-z].*") &&s.matches(".*[0-9]{1}.*") &&s.matches(".*[A-Z]$"))
				al.add(s);
			
		}
		return al;
		
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		for(int i=0;i<n;i++)
		{
			hm.put(in.nextInt(),in.next());
		}
	ArrayList<String>arr=Main.getName(hm);
	Iterator<String> it=arr.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
		

	}

}




28.Remove 3 Multiples
 
Write a program that accepts an ArrayList of integers as input and removes every 3rd element and prints the final ArrayList.
 
Suppose the given arrayList contains 10 elements remove the 3rd, 6th and 9th elements.
 
Include a class UserMainCode with a static method “removeMultiplesOfThree” that accepts an ArrayList<Integer> as arguement and returns an ArrayList<Integer>.
 
Create a class Main which would get the required input and call the static method removeMultiplesOfThree present in the UserMainCode.
 
Input and Output Format:
The first line of the input consists of an integer n, that corresponds to the number of elements to be added in the ArrayList.
The next n lines consist of integers that correspond to the elements in the ArrayList.
 
Output consists of an ArrayList of integers.
 
Sample Input:
6
3
1
11
19
17
19
 
Sample Output
3
1
19
17
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main
{
	public static ArrayList<Integer>getName(ArrayList<Integer> al)
	{
		ArrayList<Integer> array=new ArrayList<Integer>();
		Iterator<Integer> it=al.iterator();
		while(it.hasNext())
		{
			
			array.add(it.next());
			array.add(it.next());
			it.next();
		}
		return array;
		
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();	
	for(int i=0;i<n;i++)
	{
		al.add(in.nextInt());
	}
	ArrayList<Integer>arr=Main.getName(al);
	Iterator<Integer> it=arr.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
		

	}

}

52.Employees & Designations

A Company wants to obtain employees of a particular designation. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
    Read Employee details from the User. The details would include name and designaton in the given order. The datatype for name and designation is string.
    Build a hashmap which contains the name as key and designation as value.
    You decide to write a function obtainDesignation which takes the hashmap and designation as input and returns a string List of employee names who belong to that designation as output. Include this function in class UserMainCode. Display employee name's in ascending order.
Create a Class Main which would be used to read employee details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next two values indicate the employee name employee designation. The last string would be the designation to be searched.
Output consists of a array values containing employee names.
Refer sample output for formatting specifications.

Sample Input 1:
4
Manish
MGR
Babu
CLK
Rohit
MGR
Viru
PGR
MGR

Sample Output 1:
Manish
Rohit
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main
{
	public static ArrayList<String> getName(HashMap<String,String>hm,String s1)
	{
		ArrayList<String> al=new ArrayList<String>();
 for(Map.Entry<String,String> map:hm.entrySet())
 {
	 if(s1.equals(map.getValue()))
	 {
		al.add(map.getKey()); 
	 }
 }
 Collections.sort(al);
 return al;	
		
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashMap<String,String>hm=new HashMap<String,String>();
		for(int i=0;i<n;i++)
		{
			hm.put(in.next(),in.next());
		}
		String s=in.next();
ArrayList<String> l1=new ArrayList<String>();
l1=Main.getName(hm,s);
Iterator<String> it=l1.iterator();
 
while(it.hasNext())
{
String s2=it.next();
System.out.println(s2);
}
}
}
53.Grade Calculator

A School wants to give assign grades to its students based on their marks. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
    Read student details from the User. The details would include name, mark in the given order. The datatype for name is string, mark is float.
    You decide to build a hashmap. The hashmap contains name as key and mark as value.

BUSINESS RULE:
1. If Mark is less than 60, then grade is FAIL.
2. If Mark is greater than or equal to 60, then grade is PASS.
Note: FAIL/PASS should be in uppercase.
Store the result in a new Hashmap with name as Key and grade as value.
4. You decide to write a function calculateGrade which takes the above hashmap as input and returns the hashmap as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read student details in step 1 and build the hashmap. Call the static method present in UserMainCode.

Input and Output Format:

Input consists of student details. The first number indicates the size of the students. The next two values indicate the name, mark.

Output consists of a name and corresponding grade for each student.

Refer sample output for formatting specifications.

Sample Input 1:
3
Avi
76.36
Sunil
68.42
Raja
36.25

Sample Output 1:
Avi
PASS
Sunil
PASS
Raja
FAIL
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class Main
{
	public static LinkedHashMap<String,String>getName(LinkedHashMap<String,Float>hm)
	{
		LinkedHashMap<String,String> res=new LinkedHashMap<String,String>();
		for(Map.Entry<String,Float>map:hm.entrySet())
		{
			if(map.getValue()>=60)
			{
				res.put(map.getKey(),"PASS");
			}
			else
				res.put(map.getKey(),"FAIL");
		}

		return res;
		
	}
	public static void main(String[] args) throws IOException
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		LinkedHashMap<String,Float>hm=new LinkedHashMap<String,Float>();
		for(int i=0;i<n;i++)
		{
			hm.put(in.next(),in.nextFloat());
		}
		LinkedHashMap<String,String>arr=Main.getName(hm);
		for(Map.Entry<String,String>map:arr.entrySet())
		{
			System.out.println(map.getKey()+"\n"+map.getValue());
			
		}
	}
		

	}
}
56.ArrayList to String Array

Write a program that performs the following actions:
    Read n strings as input.
    Create an arraylist to store the above n strings in this arraylist.
    Write a function convertToStringArray which accepts the arraylist as input.
    The function should sort the elements (strings) present in the arraylist and convert them into a string array.
    Return the array.
Include a class UserMainCode with the static method convertToStringArray which accepts an arraylist and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of n+1 integers. The first integer denotes the size of the arraylist, the next n strings are values to the arraylist.
Output consists of an arrayas per step 4.
Refer sample output for formatting specifications.

Sample Input 1:
4
a
d
c
b
Sample Output 1:
a
b
c
d
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
public class Main
{
public static String[] convertToStringArray (ArrayList<String> l1,int n)
{
 String a[]=new String[n];
 int i=0;
 Iterator<String> it=l1.iterator();
 while(it.hasNext())
 {
	 a[i]=it.next();
	 ++i;
 }
 return a;
}
public static void main(String[] args)
{
	
Scanner sc=new Scanner(System.in);
int k1=Integer.parseInt(sc.nextLine());
ArrayList<String> l1=new ArrayList<String>();
for(int i=0;i<k1;i++)
{
l1.add(sc.next());
}
Collections.sort(l1);
String []s=Main.convertToStringArray(l1,k1);
for(String s1:s)
{
	System.out.println(s1);
}
}
} 
 
57.State ID generator

Write a program to generate the state ID.
     1)Read n Strings as input(as State Name).
     2)Create a String Array to Store the above Input.
     3)Write a function getStateId which accepts String Array as input.
     4)Create a HashMap<String,String> which stores state name as key and state Id as Value.
     5)The function getStateId returns the HashMap to the Main Class.

Include UserMainCode Class With static method getStateId which accepts String array and return a hashmap.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.


Input and Output Format:
Input Consists of an integer n denotes the size of the string array.
Output consists of an HashMap displayed in the string array order.

Sample Input 1:
3
Kerala
Gujarat
Goa

Sample Output 1:
KER:Kerala
GUJ:Gujarat
GOA:Goa
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;


class Main
{
public static LinkedHashMap<String, String>calculateElectricityBill(String a[])
{
	String s1="";
	LinkedHashMap<String,String>hm=new LinkedHashMap<String,String>();
	for(int i=0;i<a.length;i++)
	{
		
		s1=a[i].toUpperCase();
		hm.put(s1.substring(0,3),a[i]);
	
	}
return hm;
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String a[]=new String[n];	
for(int i=0;i<n;i++)
{
	a[i]=sc.next();
}		
	LinkedHashMap<String, String>ans=Main.calculateElectricityBill(a);
	Iterator<String> it=ans.keySet().iterator();
	while(it.hasNext())
	{
		String s2=it.next();
		String s3=ans.get(s2);
		System.out.println(s2+":"+s3);
	}

}
}
58.ArrayList to String Array

Write a program that performs the following actions:

1.Read m strings as input (fruit names).
2.Create an arraylist to store the above m strings in this arraylist.
3.Read n strings as input (fruit names).
4.Create an arraylist to store the above n strings in this arraylist.
5.Write a function fruitSelector which accepts the arraylists as input.
6.Remove all fruits whose name ends with 'a' or 'e' from first arrayList and remove all fruits whose name begins  with 'm' or 'a' from second arrayList then combine the two lists and return the final output as a String array.
7.If the array is empty the program will print as “No fruit found”
Include a class UserMainCode with the static method fruitSelector which accepts the two arraylists and returns an array.

Create a Class Main which would be used to read n strings and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer (m) denoting the size of first arraylist. The next m elements would be the values of the first arraylist. The next input would be n denoting the size of the second arraylist. The next n elements would be the values of the second arraylist.

Output consists of an array as per step 6. Refer sample output for formatting specifications.

Sample Input 1:
3
Apple
Cherry
Grapes
4
Orange
Mango
Melon
Apple
Sample Output 1:
Cherry
Grapes
Orange
import java.util.ArrayList;
import java.util.Scanner;


class Main
{
	static int j=0;
	public static String[] calculateElectricityBill(int n,ArrayList<String>al,int n1,ArrayList<String>al1)
	{
		String a[]=new String[n+n1];
		

		for(int i=0;i<n;i++)
		{
			String s1=al.get(i);
			
			if(s1.charAt(s1.length()-1)!='a'&& s1.charAt(s1.length()-1)!='e'
					&&s1.charAt(s1.length()-1)!='A'&& s1.charAt(s1.length()-1)!='E')
			{
				a[j]=s1;
				j++;
			}
		}
		for(int i=0;i<n1;i++)
		{
			String s1=al1.get(i);
			if(s1.charAt(0)!='A'&& s1.charAt(0)!='M'&& s1.charAt(0)!='a'&& s1.charAt(0)!='m')
			{
				a[j]=s1;
				j++;
			}
		}
		

	return a;
	}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<String> al=new ArrayList<String>();
	ArrayList<String> al1=new ArrayList<String>();	
for(int i=0;i<n;i++)
{
	al.add(sc.next());
}	
int n1=sc.nextInt();
for(int i=0;i<n1;i++)
  {
	al1.add(sc.next());
  }		
	String[]  ans=Main.calculateElectricityBill(n,al,n1,al1);
	for(int i=0;i<Main.j;i++)
		System.out.println(ans[i]);
		

}
}


59.Elements in ArrayList

Use Collection Methods.
Write a program that takes two ArrayLists as input and  finds out all elements present either in A or B, but not in both.

Include a class UserMainCode with the static method arrayListSubtractor which accepts the two arraylists and returns an array.

Create a Class Main which would be used to read the inputs and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer (m) denoting the size of first arraylist. The next m elements would be the values of the first arraylist. The next input would be n denoting the size of the second arraylist. The next n elements would be the values of the second arraylist.

Output consists of an array. The elements in the output array need to be printed in sorted order.

Refer sample output for formatting specifications.

Sample Input 1:
4
1
8
3
5
2
3
5
Sample Output 1:
1
8

Sample Input 2:
4
9
1
3
5
4
1
3
5
6
Sample Output 2:
6
9
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.util.Scanner;


class Main
{
	static int l=0;
	public static float calculateElectricityBill(int n,HashMap<String,Float>hm,int n1,String a[])
	{
		float f=0; 
		DecimalFormat df=new DecimalFormat("#.00");
	for(int i=0;i<n1;i++)
	{
		if(hm.containsKey(a[i]))
		{
			f=f+hm.get(a[i]);
		}
	}
	f=Float.parseFloat(df.format(f));
	return f;
	}



public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	HashMap<String,Float>hm=new HashMap<String,Float>();
	for(int i=0;i<n;i++)
	{
		hm.put(sc.next(),sc.nextFloat());
	}
	int n1=sc.nextInt();
	String s1[]=new String[n1];
	for(int i=0;i<n1;i++)
	  {
		s1[i]=sc.next();
	  }	

	System.out.println(Main.calculateElectricityBill(n,hm,n1,s1));		

}
}
 
55.Experience Validator
 
Write a program to valiadate the experience of an employee.
    An employee who has recently joined the organization provides his year of passing and total number of years of experience in String format. Write code to validate his experience against the current date.

1) Input consists of two String first represent the year of passed out and the second string reperesent the year of experience.
2) create a function with  name validateExp which accepts two string as input and boolean as output.
3) The difference between current year and year of pass should be more than or equal to Experience
Return true if all condition are true.

Note:Conside 2015 as the current year.

Include a class UserMainCode with the static function validateExp

Create a Class Main which would be used to accept the boolean and call the static method present in UserMainCode.

Input and Output Formate:
Input consists of two Strings.
output will display true if the given data are correct.

Sample Input:
2001
5

Sample Output:
TRUE
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
 
public class UserMainCode {
     public static boolean getvalues(String s,String s1)
       {
                                int y1=Integer.parseInt(s);
                  
                                int y2=2015;
                               
                                int y=Math.abs(y1-y2);
                                int e=Integer.parseInt(s1);
                                if(y>=e)
                                                return true;
                                else
                                                return false;
                               
                                }
       
                    public static void main(String args[]){
                       Scanner sc = new Scanner(System.in);
                 
                      String s=sc.nextLine();
                      String s1=sc.nextLine();
                     
                     System.out.print(UserMainCode.getvalues(s,s1));
                    }
                }
65.Even Sum & Duplicate Elements

Write a program to read a integer array, Remove the duplicate elements and display sum of even numbers in the output. If input array contain only odd number then return -1.
Include a class UserMainCode with a static method sumElements which accepts the integer array. The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
2
3
54
1
6
7
7
Sample Output 1:
62

Sample Input 2:
6
3
7
9
13
17
21
Sample Output 2:
-1
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


class Main
{
	static int l=0;
	public static int display(int n[])
	{
LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
int s=0;
for(int i=0;i<n.length;i++)
        {
h1.add(n[i]);
        }
        Iterator<Integer> it=h1.iterator();
while(it.hasNext())
        {
int k=it.next();
if(k%2==0)
 {
   s=s+k;
 }
  }
if(s>0)
return s;
else
return -1;
        }

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println(Main.display(a));
	

}
}
67.Integer Factorial

Give an array of integer as input, store the numbers and their factorials in an hashmap and print the same.
Include a class UserMainCode with a static method getFactorial which accepts the integer array. The return type is the hashmap which is printed key:value.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a number denoting the size of the array and followed by the elements.
Output consists of a hashmap printed in the output format .
Refer sample output for formatting specifications.

Sample Input1:
4
2
3
5
4
Sample Output1:
2:2
3:6
5:120
4:24

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

	
	class Main
	{
		static int l=0;
	public static LinkedHashMap<Integer,Integer> display(int n[])
		{
			LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer,Integer>();
			for(int i=0;i<n.length;i++)
		{
			int fact=1;
			for(int j=1;j<=n[i];j++)
			{fact=fact*j;}
			hm.put(n[i],fact);
			}
			return hm;

	        }
	
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int s=Integer.parseInt(sc.nextLine());
	int []a=new int[s];
		for(int i=0;i<s;i++)
		{
a[i]=sc.nextInt();
		}
LinkedHashMap<Integer,Integer>hm2=new LinkedHashMap<Integer,Integer>();
		hm2=Main.display(a);
		Iterator<Integer> it=hm2.keySet().iterator();
		while(it.hasNext())
		{
	int n=it.next();
	int fac=hm2.get(n);
		System.out.println(n+":"+fac);
		}
	
}
	}


Unique Even Sum
Write a program to read an array, eliminate duplicate elements and calculate the sum of even numbers (values) present in the array.
Include a class UserMainCode with a static method addUniqueEven which accepts a single integer array. The return type (integer) should be the sum of the even numbers. In case there is no even number it should return -1.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
In case there is no even integer in the input array, print no even numbers as output. Else print the sum.
Refer sample output for formatting specifications. 
Assume that the maximum number of elements in the array is 20.
Sample Input 1:
4
2
5
1
4
Sample Output 1:
6
Sample Input 2:
3
1
1
1
Sample Output 2:
no even numbers

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


class Main
{
	static int l=0;
	public static int display(int n[])
	{
LinkedHashSet<Integer>h1=new LinkedHashSet<Integer>();
int s=0;
for(int i=0;i<n.length;i++)
        {
h1.add(n[i]);
        }
        Iterator<Integer> it=h1.iterator();
while(it.hasNext())
        {
int k=it.next();
if(k%2==0)
 {
    s=s+k;
 }
        }
if(s>0)
return s;
else
return -1;
        }

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	
	for(int i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println(Main.display(a));
	

}
}


Palindrome & Vowels
Write a program to check if a given string is palindrome and contains at least two different vowels.
Include a class UserMainCode with a static method checkPalindrome which accepts a string. The return type (integer) should be 1 if the above condition is satisfied, otherwise return -1.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Note – Case Insensitive while considering vowel, i.e a & A are same vowel, But Case sensitive while considering palindrome i.e abc CbA are not palindromes.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single Integer.
Refer sample output for formatting specifications.
Sample Input 1:
abceecba
Sample Output 1:
valid
Sample Input 2:
abcd
Sample Output 2:
invalid

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
	class Main
	{
		static int l=0;
	public static void display(String s)
		{
	      StringBuffer sb=new StringBuffer(s);
	      
	      int k=0;
	     LinkedHashSet<Character>l1=new LinkedHashSet<Character>();
	    
	       String s2=sb.reverse().toString();
	       if(s2.equals(s))
	       {
	        String s3=s2.toLowerCase();
	       
	        for(int i=0;i<s3.length();i++)
	        {
	         l1.add(s3.charAt(i));
	        
	        }
	        Iterator<Character> it=l1.iterator();
	        while(it.hasNext())
	        {
	         char a=it.next();
	       
	        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
	        k++;
	        }
	       }
	       if(k>=2)
	      System.out.println("Valid");
	       else
	       System.out.println("Invalid");
	       }
	
	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    String s=sc.nextLine();
		Main.display(s);
		
		
	
		}
	}


ArrayList Manipulation
Write a program that performs the following actions:
Read 2n integers as input.
Create two arraylists to store n elements in each arraylist.
Write a function generateOddEvenList which accepts these two arraylist as input.
The function fetch the odd index elements from first array list and even index elements from second array list and add them to a new array list according to their index.
Return the arraylist.
Include a class UserMainCode with the static method generateOddEvenList which accepts two arraylist and returns an arraylist.
Create a Class Main which would be used to read 2n integers and call the static method present in UserMainCode.
Note:
- The index of first element is 0.
- Consider 0 as an even number.
- Maintain order in the output array list
Input and Output Format:
Input consists of 2n+1 integers. The first integer denotes the size of the arraylist, the next n integers are values to the first arraylist, and the last n integers are values to the second arraylist.
Output consists of a modified arraylist as per step 4.
Refer sample output for formatting specifications.
Sample Input 1:
5
12
13
14
15
16
2
3
4
5
6
Sample Output 1:
2
13
4
15
6

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
	static int l=0;
	public static ArrayList<Integer> display(ArrayList<Integer> al1,ArrayList<Integer> al2)
	{
		ArrayList<Integer>al3=new ArrayList<Integer>();
		for(int i=0;i<al1.size();i++)
		{
		if(i%2==0)
		al3.add(al2.get(i));
		else
		al3.add(al1.get(i));
		}
		return al3;

        }

public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int s=Integer.parseInt(sc.nextLine());
	ArrayList<Integer>al1=new ArrayList<Integer>();
	ArrayList<Integer>al2=new ArrayList<Integer>();
	for(int i=0;i<s;i++)
	al1.add(sc.nextInt());
	for(int i=0;i<s;i++)
	al2.add(sc.nextInt());
	ArrayList<Integer>al3=new ArrayList<Integer>();
	al3=Main.display(al1,al2);
	Iterator<Integer> it=al3.iterator();
	while(it.hasNext())
	{
	int n=it.next();
	System.out.println(n);
	}

	

}
}

Duplicate Characters
Write a Program which removes duplicate characters from the string. Your program should read a sentence (string) as input from user and return a string removing duplicate characters. Retain the first occurance of the duplicate character. Assume the characters are case – sensitive.
Include a class UserMainCode with a static method removeDuplicates which accepts a string. The return type is the modified sentence of type string.
Create a Class Main which would be used to accept the input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
hi this is sample test
Sample Output 1:
hi tsample
Sample Input 2:
ABC DEF
Sample Output 2:
ABC DEF

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {	
public static String nameFormatter(String s1) 
        {   String temp;
	StringBuffer sb=new StringBuffer();
	LinkedHashSet<Character>hs=new LinkedHashSet<Character>();
	for(int i=0;i<s1.length();i++)
	{	
	hs.add(s1.charAt(i));
	}
	Iterator<Character>itr=hs.iterator();
	while(itr.hasNext())
	{
	char o=itr.next();
	sb.append(o);
	}
	return sb.toString();	
        }
public static void main(String[] args) {
                    Scanner in=new Scanner(System.in);  
	String s1=in.nextLine();	
System.out.println(Main.nameFormatter(s1));
in.close();

    }
}


Mastering Hashmap
You have recently learnt about hashmaps and in order to master it, you try and use it in all of your programs.
Your trainer / teacher has given you the following exercise:
Read 2n numbers as input where the first number represents a key and second one as value. Both the numbers are of type integers.
Write a function getAverageOfOdd to find out average of all values whose keys are represented by odd numbers. Assume the average is an int and never a decimal number. Return the average as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read 2n numbers and build the hashmap. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of a 2n+ 1 integers. The first integer specifies the value of n (essentially the hashmap size). The next pair of n numbers denote the key and value.
Output consists of an integer representing the average.
Refer sample output for formatting specifications.
Sample Input 1:
4
2
34
1
4
5
12
4
22
Sample Output 1:
8

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
class Main
{
	public static int display(HashMap<Integer,Integer> h1)
	{
		int av=0,c=0,s=0;
        Iterator<Integer> it=h1.keySet().iterator();
while(it.hasNext())
        {
int a=it.next();
if(a%2!=0)
               {
int b=h1.get(a);
                  s=s+b;
c++;
               }
        }
av=s/c;
return av;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
	for(int i=0;i<n;i++)
	{
	h1.put(sc.nextInt(),sc.nextInt());
	}
	System.out.println(Main.display(h1));

}
}

Managers & Hashmaps
A Company wants to automate its payroll process. You have been assigned as the programmer to build this package. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
1.    Read Employee details from the User. The details would include id, designation and salary in the given order. The datatype for id is integer, designation is string and salary is integer.
2.    You decide to build two hashmaps. The first hashmap contains employee id as key and designation as value, and the second hashmap contains same employee ids as key and salary as value.
3.    The company decides to hike the salary of managers by 5000. You decide to write a function increaseSalarieswhich takes the above hashmaps as input and returns a hashmap with only managers id and their increased salary as output. Include this function in class UserMainCode.
Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps.
Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next three values indicate the employee id, employee designation and employee salary.
Output consists of a single string. Refer sample output for formatting specifications.
Sample 
Input 1:
2
2
programmer
3000
8
manager
50000
Sample Output 1:
8
55000

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class UserMainCode2

{

public static HashMap<Integer,Integer>

display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)

{

Iterator<Integer> it=hm.keySet().iterator();

Iterator<Integer> it1=hm1.values().iterator();

HashMap<Integer,Integer>hm3=new HashMap<Integer,Integer>();

while(it.hasNext())

{

int a=it.next();

String s=hm.get(a);

int b=it1.next();

if(s.equals("manager"))

{

hm3.put(a,b+5000);

}

}

return hm3;

}
}

 class Main
{
public static void main(String[] args) {

Scanner in=new Scanner(System.in);

int n=Integer.parseInt(in.nextLine());

HashMap<Integer,String>hm=new HashMap<Integer,String>();

HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();

for(int i=0;i<n;i++)

{

int a=in.nextInt();

String s=in.next();

int sal=in.nextInt();

hm.put(a,s);

hm1.put(a,sal);

}

HashMap<Integer,Integer>hm3=UserMainCode2.display(hm,hm1);

Iterator<Integer>it=hm3.keySet().iterator();

for(int i=0;i<hm3.size();i++)

{

int k=it.next();

int fac=hm3.get(k);

System.out.println(k+"\n"+fac);

}

}

}Check first and last word
Write a program to check if the first word and the last word in the input string match. 
Include a class UserMainCode with a static method “check” that accepts a string argument and returns an int. If the first word and the last word in the string match, the method returns the number of characters in the word. Else the method returns the sum of the number of characters in the first word and last word.
Create a class Main which would get the input as a String and call the static method check present in the UserMainCode.
Input and Output Format:
Input consists of a string.
Output is an integer.
Sample Input 1:
how are you you are how
Sample Output 1:
3
Sample Input 2:
how is your child
Sample Output 2:
8

import java.util.Scanner;
publicclass UserMainCode {
	
	staticint validateNumber(String s1)
	 {
		int a=s1.indexOf(" ");
		int b=s1.lastIndexOf(" ");
		String s=s1.substring(0,a);
		String s2=s1.substring(b+1);
		if(s.equals(s2))
			return s.length();
		return (s.length()+s2.length());
	 }

	publicstaticvoid main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
	        String n1=in.nextLine();
	System.out.println(UserMainCode.validateNumber(n1));
	
		

	}
}
14.Retirement
 
Given an input as HashMap which contains key as the ID and dob as value of employees, write a program to find out employees eligible for retirement. A person is eligible for retirement if his age is greater than or equal to 60.
 
Assume that the current date is 01/01/2014.
 
Include a class UserMainCode with a static method “retirementEmployeeList” that accepts a HashMap<String,String> as input and returns a ArrayList<String>. In this method, add the Employee IDs of all the retirement eligible persons to list and return the sorted list.
(Assume date is in dd/MM/yyyy format).
 
Create a class Main which would get the HashMap as input and call the static method retirementEmployeeList present in the UserMainCode.
 
Input and Output Format:
The first line of the input consists of an integer n, that corresponds to the number of employees.
The next 2 lines of the input consists of strings that correspond to the id and dob of employee 1.
The next 2 lines of the input consists of strings that correspond to the id and dob of employee 2.
and so on...
Output consists of the list of employee ids eligible for retirement in sorted order.
 
Sample Input :
4
C1010
02/11/1987
C2020
15/02/1980
C3030
14/12/1952
T4040
20/02/1950
 
Sample Output :
[C3030, T4040]

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class UserMainCode
{
    public static ArrayList<String>  retirementEmployeeList (HashMap<String,String> hm)
    {
    	String s1="01/01/2014";
    	int year;
    	ArrayList <String> al=new ArrayList <String>();
    	for(Map.Entry<String,String> map:hm.entrySet())
    	{
    		String s=map.getValue();
    		if(s.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"))
    		{
    			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
    			sdf.setLenient(false);
    	          try
    	          {
    	        	  Calendar c=Calendar.getInstance();
    	        		 Date d1=sdf.parse(s1);
    	        		 Date d2=sdf.parse(s);
    	        		c.setTime(d1);
    	        		int y1=c.get(Calendar.YEAR);
    	        		int m1=c.get(Calendar.MONTH);
    	        		int d11=c.get(Calendar.DATE);
    	        		c.setTime(d2);
    	        		int y2=c.get(Calendar.YEAR);
    	        		int m2=c.get(Calendar.MONTH);
    	        		int d22=c.get(Calendar.DATE);
    	        		 year=Math.abs(y2-y1);
    	        		if(m1>m2)
    	        	     year--;
    	        	  else if(m2==m1 && d11>d22)
    	        			year--;
    	        	 
    	        	  if(year>=60)
    	        	  {
    	        		  String k=map.getKey();
    	        		  al.add(k);   
    	        	  }
    		}
    	          catch(ParseException e)
    	          {
    	        	  return al;
    	          }
    		}
    		
    		
    	}

    	Collections.sort(al);
		return al;
}
    public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
    	int n=Integer.parseInt(sc.nextLine());
    	LinkedHashMap<String,String>a1=new LinkedHashMap<String,String>();
    	for(int i=0;i<n;i++)
    	{
    	a1.put(sc.nextLine(),sc.nextLine());
    	}
    	ArrayList<String> l1=new ArrayList<String>();
    	l1=UserMainCode.retirementEmployeeList(a1);
    	System.out.println(l1);
    	}
} 

17.Unique Characters
 
Given a String as input , write a program to count and print the number of unique characters in it.
 
Include a class UserMainCode with a static method “checkUnique” that accepts a String as input and returns the number of unique characters in it. If there are no unique characters in the string, the method returns -1.
 
Create a class Main which would get a String as input and call the static method checkUnique present in the UserMainCode.
 
Input and Output Format:
Input consists of a string.
Output consists of an integer.
 
Sample Input 1:
HOWAREYOU
 
Sample Output 1:
7
 
(Hint :Unique characters are : H,W,A,R,E,Y,U and other characters are repeating)
 
Sample Input 2:
MAMA
 
Sample Output2:
-1
import java.util.Scanner;
public class Main
{
	
	static int uniqueCounter(String s)
	{
		int i,l=0;
		String temp;
		for(i=0;i<s.length();i++)
		{   
			if(i!=0)
			temp=s.substring(0,i).concat(s.substring(i+1)); 
			else
		temp=s.substring(i+1);
			String c=s.charAt(i)+"";
			if(!temp.contains(c))
			{
				++l;
			}
			//else
				//return -1;
		}		
		return l;
	}
	public static void main(String args[])
	  {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		int ans=Main.uniqueCounter(str);
		if(ans==0)
			System.out.println("-1");
		else
		System.out.println(ans);
		in.close();
	  }
}
 
 
19. ArrayList and Set Operations 
Write a program that performs the following actions:
1.    Read 2n integers as input & a set operator (of type char).
2.    Create two arraylists to store n elements in each arraylist.
3.    Write a function performSetOperations which accepts these two arraylist and the set operator as input.
4.    The function would perform the following set operations:.

'+' for SET-UNION

'*' for SET-INTERSECTION

'-' for SET-DIFFERENCE

Refer to sample inputs for more details.
5.    Return the resultant arraylist.

Include a class UserMainCode with the static method performSetOperations which accepts two arraylist and returns an arraylist.

Create a Class Main which would be used to read 2n+1 integers and call the static method present in UserMainCode.

Note:

- The index of first element is 0.


 

Input and Output Format:

Input consists of 2n+2 integers. The first integer denotes the size of the arraylist, the next n integers are values to the first arraylist, and the next n integers are values to the second arraylist and the last input corresponds to that set operation type.

Output consists of a modified arraylist as per step 4.

Refer sample output for formatting specifications.

Sample Input 1:

3

1

2

3

3

5

7

+

Sample Output 1:

1

2

3

5
7
Sample Input 2:
4
10
9
8
7
2
4
6
8
*
Sample Output 2:
8

 
Sample Input 3:
4
5
10
15
20
0
10
12
20
-
Sample Output 3:
5
15

import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class UserMainCode {
public static ArrayList<Integer> getvalues(ArrayList<Integer>a1,ArrayList<Integer>a2,char c)
{
   ArrayList<Integer>op1=new ArrayList<Integer>();
   HashSet<Integer> set1 = new HashSet<Integer>(a1);
   HashSet<Integer> set2 = new HashSet<Integer>(a2);
   HashSet<Integer> set3 = new HashSet<Integer>();
      switch(c)
   {
      case '+':
           set3.addAll(set1);
           set3.addAll(set2);
           op1.addAll(set3);
           break;
      case '*':
        set1.retainAll(set2);
        op1.addAll(set1);
        break;
      case '-':
    	  set1.removeAll(set2);
    	  op1.addAll(set1);
         break;
    }
   Collections.sort(op1);
         return op1;
  }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    ArrayList<Integer>a1=new ArrayList<Integer>();
    ArrayList<Integer>a2=new ArrayList<Integer>();
   for(int i=0;i<n;i++)
              a1.add(Integer.parseInt(sc.nextLine()));
   for(int i=0;i<n;i++)
             a2.add(Integer.parseInt(sc.nextLine())); 
   char c=sc.nextLine().charAt(0);
    System.out.println(UserMainCode.getvalues(a1,a2,c));
 }
}
23. All Vowels
 
Write a Program to check if given word contains exactly five vowels and the vowels are in alphabetical order. Return 1 if the condition is satisfied else return -1. Assume there is no repetition of any vowel in the given string and all letters are in lower case.
Include a class UserMainCode with a static method testOrderVowels which accepts a string The return type is integer based on the condition stated above.
Create a Class Main which would be used to accept two Input strings and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
acebisouzz

 
Sample Output 1:
valid
 
Sample Input 2:
 
alphabet
 
 
Sample Output 2:
Invalid
importjava.util.Scanner;

publicclassUserMainCode {
	
publicstaticStringgetVowels(String s1) 
        {    String s=”yes”;
	if(s1.contains(“a”) && s1.contains(“e”) &&s1.contains(“i”) &&s1.contains(“o”) && s1.contains(“u”))
	       s=yes;
else
                    s=”no”;
				return s;	
        }
publicstaticvoid main(String[] args) {
                    Scanner in=newScanner(System.in);  
	String s1=in.nextLine();	
System.out.println(UserMainCode.getVowels(s1));
in.close();

    }
}
27.Employee Bonus
 

A Company wants to give away bonus to its employees. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
Read Employee details from the User. The details would include id, DOB (date of birth) and salary in the given order. The datatype for id is integer, DOB is string and salary is integer.
You decide to build two hashmaps. The first hashmap contains employee id as key and DOB as value, and the second hashmap contains same employee ids as key and salary as value.
If the age of the employee in the range of 25 to 30 years (inclusive), the employee should get bonus of 20% of his salary and in the range of 31 to 60 years (inclusive) should get 30% of his salary. store the result in TreeMap in which Employee ID as key and revised salary as value. Assume the age is caculated based on the date 01-09-2014. (Typecast the bonus to integer).
Other Rules:
a. If Salary is less than 5000 store -100.
b. If the age is less than 25 or greater than 60 store -200.
c. a takes more priority than b i.e both if a and b are true then store -100.
You decide to write a function calculateRevisedSalary which takes the above hashmaps as input and returns the treemap as output. Include this function in class UserMainCode.

 
Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the employees. The next three values indicate the employee id, employee DOB and employee salary. The Employee DOB format is “dd-mm-yyyy”
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
2
1010
20-12-1987
10000
2020
01-01-1985
14400

 
Sample Output 1:
1010
12000
2020
17280
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
public class UserMainCode
{ 
public static TreeMap<Integer,Integer> display(HashMap<Integer,String>hm,HashMap<Integer,Integer>hm1)
{
TreeMap<Integer,Integer>hm2=new TreeMap<Integer,Integer>();
Iterator<Integer> it=hm.keySet().iterator();
 
while(it.hasNext())
{
int y=it.next();
String dob=hm.get(y);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
String now="01-09-2014";
try
{
Calendar c=Calendar.getInstance();
Date d1=sdf.parse(now);
Date d2=sdf.parse(dob);
c.setTime(d1);
int y1=c.get(Calendar.YEAR);
int m1=c.get(Calendar.MONTH);
int day1=c.get(Calendar.DATE);
c.setTime(d2);
int y2=c.get(Calendar.YEAR);
int m2=c.get(Calendar.MONTH);
int day2=c.get(Calendar.DATE);

int age=y1-y2;
if(m1<m2)
age--;
else if(m1==m2 && day1<day2)
age--;
if(hm1.get(y)<5000)
{
   hm2.put(y,-200);
}
else if((age<25 || age>60) && hm1.get(y)<5000 )
	hm2.put(y,-100);
else if(age>=25 && age<=30)
{float bonus=(float)0.2*hm1.get(y)+hm1.get(y);
hm2.put(y,(int)bonus );
}
else if(age>30 && age<=60)
{ float bonus=(float) (0.3*hm1.get(y))+hm1.get(y);
hm2.put(y,(int)bonus );
}
else if(age<25 || age>60)
hm2.put(y,-200);
}
catch(Exception e)
{e.printStackTrace();
}}
return hm2;
}
public static void main(String args[])
{
HashMap<Integer,String>hm=new HashMap<Integer,String>();
HashMap<Integer,Integer>hm1=new HashMap<Integer,Integer>();
TreeMap<Integer,Integer>hm2=new TreeMap<Integer,Integer>();
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
for(int i=0;i<s;i++)
{
int id=Integer.parseInt(sc.nextLine());
String ss=sc.nextLine();
int salary=Integer.parseInt(sc.nextLine());
hm.put(id,ss);
 
 
hm1.put(id,salary);
}
hm2=UserMainCode.display(hm,hm1);
Iterator<Integer> it=hm2.keySet().iterator();
for(int i=0;i<s;i++)
{
int id=it.next();
int bonus=hm2.get(id);
System.out.println(id);
System.out.println(bonus);
}
}
}
 

 

 

28. Grade Calculator
 
A School wants to assign grades to its students based on their marks. You have been assigned as the programmer to automate this process. You would like to showcase your skills by creating a quick prototype. The prototype consists of the following steps:
Read student details from the User. The details would include roll no, mark in the given order. The datatype for id is integer, mark is integer.
You decide to build a hashmap. The hashmap contains roll no as key and mark as value.
BUSINESS RULE:
1. If Mark is greater than or equal to 80 store medal as ""GOLD"".
2. If Mark is less then to 80 and greater than or equal to 60 store medal as ""SILVER"".
3 .If Mark is less then to 60 and greater than or equal to 45 store medal as ""BRONZE"" else store ""FAIL"".
Store the result in TreeMap in which Roll No as Key and grade as value.
4. You decide to write a function calculateGrade which takes the above hashmaps as input and returns the treemap as output. Include this function in class UserMainCode.

 
Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of employee details. The first number indicates the size of the students. The next two values indicate the roll id, mark.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
2
1010
80
100
40
Sample Output 1:
100
FAIL
1010
GOLD
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserMainCode
{
public static TreeMap<Integer,String> calculateGrade (HashMap<Integer,Integer> h1)
{
	TreeMap<Integer,String> hm=new TreeMap<Integer,String>();
 for(Map.Entry<Integer,Integer> map:h1.entrySet())
 {
	if(map.getValue()>=80) 
		hm.put(map.getKey(),"GOLD");
	else if(map.getValue()>=60) 
		hm.put(map.getKey(),"SILVER");
	else if(map.getValue()>=45) 
		hm.put(map.getKey(),"BRONZE");
	else
		hm.put(map.getKey(),"FAIL");
 }
 return hm;
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
for(int i=0;i<s;i++)
{
hm.put(sc.nextInt(),sc.nextInt());
}
TreeMap<Integer,String>hm1=new TreeMap<Integer,String>();
hm1=UserMainCode.calculateGrade(hm);
Iterator<Integer> it=hm1.keySet().iterator();
for(int i=0;i<s;i++)
{
int n=it.next();
String fac=hm1.get(n);
System.out.println(n);
System.out.println(fac);
}
}
}37.Symmetric Difference

Write a program to read two integer array and calculate the symmetric difference of the two arrays. Finally Sort the array.
Symmetric difference is the difference of A Union B and A Intersection B ie. [ (A U B) - (A ^ B)]
Union operation merges the two arrays and makes sure that common elements appear only once. Intersection operation includes common elements from both the arrays.
Ex - A={12,24,7,36,14} and B={11,26,7,14}.
A U B ={ 7,11,12,14,24,26,36} and
A ^ B = {7,14}
Symmetric difference of A and B after sorting= [A U B] - [ A ^ B] = {11,12,24,26,36}.
Include a class UserMainCode with a static method getSymmetricDifference which accepts the integer array. The return type is an integer array.
Create a Class Main which would be used to accept the two integer arrays and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values. The same sequnce is followed for the next array.
Output consists of sorted symmetric difference array.
Refer sample output for formatting specifications.

Sample Input 1:
5
11
5
14
26
3
3
5
3
1
Sample Output 1:
1
11
14
26

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
public class UserMainCode
{
public static int[] getSymmetricDifference (int[] a1,int[] a2)
{ 
HashSet<Integer> set1 = new HashSet<Integer>();
HashSet<Integer> set2 = new HashSet<Integer>();
for(int i=0;i<a1.length;i++)
	set1.add(a1[i]);
for(int i=0;i<a2.length;i++)
	set2.add(a2[i]);
HashSet<Integer> set3 = new HashSet<Integer>();
set3.addAll(set1);
set3.addAll(set2);
set1.retainAll(set2);
set3.removeAll(set1);
     int k[]=new int[set3.size()];
     int i=0;
     Iterator<Integer> itr=set3.iterator();
     while(itr.hasNext())
     {
        k[i]=itr.next();
        ++i;
     }
     Arrays.sort(k);
return k;
    
}
public static void main(String[] args)
{
                int n,m;
                Scanner sin = new Scanner(System.in);
                n = sin.nextInt();
                int[] a1 = new int[n];
                for(int i=0;i<n;i++)
                {
                                a1[i] = sin.nextInt();
                }
                m = sin.nextInt();
                int[] a2 = new int[m];
                for(int i=0;i<m;i++)
                {
                                a2[i] = sin.nextInt();
                }
                int[] result = UserMainCode.getSymmetricDifference (a1,a2);
                for(int i=0;i<result.length;i++)
                                System.out.println(result[i]);
}
}
 
42.Interest Calculation
 
Write a  program to calculate amount of the acccount holders based on the below mentioned prototype:
1. Read account details from the User. The details would include id, DOB (date of birth) and amount in the given order. The datatype for id is string, DOB is string and amount is integer.
2. You decide to build two hashmaps. The first hashmap contains employee id as key and DOB as value, and the second hashmap contains same employee ids as key and amount as value.
3. Rate of interest as on 01/01/2015:
    a. If the age greater than or equal to 60 then interest rate is 10% of Amount.
    b.If the age less then to 60 and greater than or equal to 30 then interest rate is 7% of Amount.
    v. If the age less then to 30 interest rate is 4% of Amount.
4. Revised Amount= principle Amount + interest rate.
5.  You decide to write a function calculateInterestRate which takes the above hashmaps as input and returns the treemap  as output. Include this function in class UserMainCode.

Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.

Input and Output Format:
Input consists of account details. The first number indicates the size of the acoount. The next three values indicate the user id, DOB and amount. The Employee DOB format is “dd-mm-yyyy”
Output consists of the user id and the amount for each user one in a line.
Refer sample output for formatting specifications.

Sample Input 1:
4
SBI-1010
20-01-1987
10000
SBI-1011
03-08-1980
15000
SBI-1012
05-11-1975
20000
SBI-1013
02-12-1950
30000
Sample Output 1:
SBI-1010:10400
SBI-1011:16050
SBI-1012:21400
SBI-1013:33000
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Scanner; 
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode
{
public static TreeMap<String,Integer> display (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int year=0,amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
	Calendar c=Calendar.getInstance();
	 Date d1=sdf.parse(dor);
	 Date d2=sdf1.parse(now);
	c.setTime(d1);
	int y1=c.get(Calendar.YEAR);
	int m1=c.get(Calendar.MONTH);
	int d11=c.get(Calendar.DATE);
	c.setTime(d2);
	int y2=c.get(Calendar.YEAR);
	int m2=c.get(Calendar.MONTH);
	int d22=c.get(Calendar.DATE);
	 year=Math.abs(y2-y1);
	if(m1>m2)
     year--;
  else if(m2==m1 && d11>d22)
		year--;

	if(year>=60)
		dis=0.1*amount+amount;
		else if(year<60 && year>=30 )
		dis=0.07*amount+amount;
		else
		dis=0.04*amount+amount;
		tm.put(id,(int)dis);

}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
 
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=UserMainCode.display(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}
43.Discount Rate Calculation

Write a  program to calculate discount of the acccount holders based on the transaction amount and registration date using below mentioned prototype:
1. Read account details from the User. The details would include id, DOR (date of registration) and transaction amount in the given order. The datatype for id is string, DOR is string and transaction amount is integer.
2. You decide to build two hashmaps. The first hashmap contains employee id as key and DOR as value, and the second hashmap contains same employee ids as key and amount as value.
3. Discount Amount as on 01/01/2015:
    a. If the transaction amount greater than or equal to 20000 and registration greater than or equal to 5     year then discount rate is 20% of transaction amount.
    b. If the transaction amount greater than or equal to 20000 and registration less then to 5 year then     discount rate is 10% of transaction amount.
    c. If the transaction amount less than to 20000 and registration greater than or equal to 5 year then     discount rate is 15% of transaction amount.
    d. If the transaction amount less than to 20000 and registration less then to 5 year then discount rate     is 5% of transaction amount.
4. You decide to write a function calculateDiscount which takes the above hashmaps as input and returns the treemap  as output. Include this function in class UserMainCode.

Create a Class Main which would be used to read employee details in step 1 and build the two hashmaps. Call the static method present in UserMainCode.
Input and Output Format:
Input consists of transaction details. The first number indicates the size of the employees. The next three values indicate the user id, user DOR and transaction amount. The DOR (Date of Registration) format is “dd-mm-yyyy”
Output consists of a string which has the user id and discount amount one in a line for each user.
Refer sample output for formatting specifications.
Sample Input 1:
4
A-1010
20-11-2007
25000
B-1011
04-12-2010
30000
C-1012
11-11-2005
15000
D-1013
02-12-2012
10000
Sample Output 1:
A-1010:5000
B-1011:3000
C-1012:2250
D-1013:500


import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Scanner; 
import java.text.SimpleDateFormat;
import java.util.Date;
public class UserMainCode
{
public static TreeMap<String,Integer> display (HashMap<String,String>hm,HashMap<String,Integer>hm1)
{
int year=0,amount=0;
double dis=0;
String now="01/01/2015";
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
Iterator<String> it=hm.keySet().iterator();
while(it.hasNext())
{
String id=it.next();
String dor=hm.get(id);
amount=hm1.get(id);
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
try
{
	Calendar c=Calendar.getInstance();
	 Date d1=sdf.parse(dor);
	 Date d2=sdf1.parse(now);
	c.setTime(d1);
	int y1=c.get(Calendar.YEAR);
	int m1=c.get(Calendar.MONTH);
	int d11=c.get(Calendar.DATE);
	c.setTime(d2);
	int y2=c.get(Calendar.YEAR);
	int m2=c.get(Calendar.MONTH);
	int d22=c.get(Calendar.DATE);
	 year=Math.abs(y2-y1);
	if(m1>m2)
     year--;
  else if(m2==m1 && d11>d22)
		year--;

if(year>=5 && amount>=20000)
dis=0.2*amount;
else if(year<5 && amount>=20000)
dis=0.1*amount;
else if(year>=5 && amount<20000)
dis=0.15*amount;
else
dis=0.05*amount;
tm.put(id,(int)dis);
}
catch(Exception e)
{
e.printStackTrace();
}
}
return tm;
}
public static void main(String []args){
Scanner sc=new Scanner(System.in);
int s=Integer.parseInt(sc.nextLine());
HashMap<String,String>hm=new HashMap<String,String>();
HashMap<String,Integer>hm1=new HashMap<String,Integer>();
for(int i=0;i<s;i++)
{
String id=sc.nextLine();
hm.put(id, sc.nextLine());
hm1.put(id,Integer.parseInt(sc.nextLine()));
 
}
TreeMap<String,Integer>tm=new TreeMap<String,Integer>();
tm=UserMainCode.display(hm,hm1);
Iterator<String> it=tm.keySet().iterator();
while(it.hasNext())
{
String n=it.next();
int fac=tm.get(n);
System.out.println(n+":"+fac);
}
}
}

//DATE AND TIME

9.    Validating Date Format
Obtain a date string in the format dd/mm/yyyy. Write code to validate the given date against the given format.
 
Include a class UserMainCode with a static method validateDate which accepts a string .
 
The return type of the validateDate method is 1 if the given date format matches the specified format , If the validation fails return the output as -1.
 
Create a Main class which gets date string as an input and call the static method validateDate present in the UserMainCode.
 
Input and Output Format:
Input is a string .
Refer sample output for formatting specifications
 
Sample Input 1:
12/06/1987
Sample Output 1:
Valid date format
 
Sample Input 2:
03/1/1987
Sample Output 2:
Invalid date format
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	public class UserMainCode {

	public static int validateDate(String s1) 
	{
	if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
	{
	SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	sdf.setLenient(false);
	try {
	Date d1=sdf.parse(s1);
	return 1;
	} 
	catch (ParseException e) 
	{
	return -1;
	}
	}
	else
		return -1;
	

	}
	
	}
	
 
 
10.  Validate Time
Obtain a time string as input in the following format 'hh:mm am' or 'hh:mm pm'. Write code to validate it using the following rules:
 
- It should be a valid time in 12 hrs format
- It should have case insensitive AM or PM
 
Include a class UserMainCode with a static method validateTime which accepts a string.
 
If the given time is as per the given rules then return 1 else return -1.If the value returned is 1 then print as valid time else print as Invalid time.
 
Create a Main class which gets time(string value) as an input and call the static method validateTimepresent in the UserMainCode.
 
Input and Output Format:
Input is a string .
Output is a string .

 
Sample Input 1:
09:59 pm
Sample Output 1:
Valid time
 
Sample Input 2:
10:70 AM
Sample Output 2:
Invalid time
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

	public class UserMainCode {

	public static int validateTime(String s1) 
	{
	if(s1.matches("[0-9]{2}:[0-9]{2}\\s(am|pm|AM|PM)"))
	{
	SimpleDateFormat sdf= new SimpleDateFormat("h:mm");
	sdf.setLenient(false);
	try {
	Date d1=sdf.parse(s1);
	return 1;
	} 
	catch (ParseException e) 
	{
	return -1;
	}
	}
	else
		return -1;
	}
	
	}
	




30.Find the difference between Dates in months
Given a method with two date strings in yyyy-mm-dd format as input. Write code to find the difference between two dates in months.
 
Include a class UserMainCode with a static method getMonthDifference which accepts two date strings as input.
 
The return type of the output is an integer which returns the diffenece between two dates in months.
 
Create a class Main which would get the input and call the static method getMonthDifference present in the UserMainCode.
 
Input and Output Format:
Input consists of two date strings.
Format of date : yyyy-mm-dd.
 
Output is an integer.
Refer sample output for formatting specifications.
 
Sample Input 1:
2012-03-01
2012-04-16
Sample Output 1:
1

 
Sample Input 2:
2011-03-01
2012-04-16
Sample Output 2:
13
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
public static int getMonthDifference (String s1,String s2) 
{
	int res=0;
	if(s1.matches("[0-9]{4}[-]{1}[0-9]{2}-[0-9]{2}") && s2.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"))
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		try
		{
			Date d1=sdf.parse(s1);
			Date d2=sdf.parse(s2);
			Calendar c1=Calendar.getInstance();
			Calendar c2=Calendar.getInstance();
			//while creating calendar object by default it is current date and time in order to set the date.
			c1.setTime(d1);
			c2.setTime(d2);
			int mon1=c1.get(Calendar.MONTH);
	        int year1=c1.get(Calendar.YEAR);
	        
	        int mon2=c2.get(Calendar.MONTH);
	        int year2=c2.get(Calendar.YEAR);
	        if(year1>=year2)
	        {
	        	res=Math.abs((year1-year2)*12+(mon1-mon2));
	        }
	        else
	        	res=Math.abs((year2-year1)*12+(mon2-mon1));
	        	return res;
		}
		catch(ParseException e)
		{
			return -1;
	
		}
	}
	else
			return -1;
}
}

 
33.Difference between two dates in days
Get two date strings as input and write code to find difference between two dates in days.
 
Include a class UserMainCode with a static method getDateDifference which accepts two date strings as input.
 
The return type of the output is an integer which returns the diffenece between two dates in days.
 
Create a class Main which would get the input and call the static method getDateDifference present in the UserMainCode.
 
Input and Output Format:
Input consists of two date strings.
Format of date : yyyy-mm-dd.
 
Output is an integer.
Refer sample output for formatting specifications.
 
Sample Input 1:
2012-03-12
2012-03-14
Sample Output 1:
2

Sample Input 2:
2012-04-25
2012-04-28
Sample Output 2:
3
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner; 

public class UserMainCode {
public static int getDateDifference (String s1,String s2) 
{

	if(s1.matches("[0-9]{4}[-]{1}[0-9]{2}-[0-9]{2}") && s2.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}"))
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setLenient(false);
		try
		{
			Date d1=sdf.parse(s1);
			Date d2=sdf.parse(s2);
			Calendar c1=Calendar.getInstance();
			Calendar c2=Calendar.getInstance();
			
			c1.setTime(d1);
			c2.setTime(d2);
			
			long k=c1.getTimeInMillis();
			long l=c2.getTimeInMillis();
			long diff=l-k;
			int res=(int)diff/(1000*24*60*60);
	        
	        	return Math.abs(res);
		}
		catch(ParseException e)
		{
			return -1;
	
		}
	}
	else
			return -1;
}
}

51.Finding the day of birth
Given an input as date of birth of person, write a program to calculate on which day (MONDAY,TUESDAY....) he was born store and print the day in Upper Case letters.

Include a class UserMainCode with a static method calculateBornDay which accepts a string as input.
 
The return type of the output is a string which should be the day in which the person was born.
 
Create a class Main which would get the input and call the static method calculateBornDay present in the UserMainCode.
 
Input and Output Format:
NOTE: date format should be(dd-MM-yyyy)
Input consists a date string.
Output is a string which the day in which the person was born.
Refer sample output for formatting specifications.
 
Sample Input 1:
29-07-2013
Sample Output 1:
MONDAY

Sample Input 2:
14-12-1992
Sample Output 2:
MONDAY
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {


public static String calculateBornDay (String s1)
{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat sdf1=new SimpleDateFormat("EEEE");
	sdf.setLenient(false);
	sdf1.setLenient(false);
	if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}"))
	{
		try
		{
			Date d1=sdf.parse(s1);
			String dayname=sdf1.format(d1);
			return dayname.toUpperCase();
		}
		catch(ParseException p)
		{
			return "Invalid";
		}
	}
	else
	{
		return "Invalid";
	}
}
}
 
53.Experience Calculator
Write a program to read Date of Joining and current date as Strings and Experience as integer and validate whether the given experience and calculated experience are the same. Print “true” if same, else “false”.

 
Include a class UserMainCode with a static method calculateExperience which accepts 2 strings and an integer. The return type is boolean.
Create a Class Main which would be used to accept 2 string (dates) and an integer and call the static method present in UserMainCode.
Input and Output Format:
Input consists of 2 strings and an integer, where the 2 strings corresponds to the date of joining and current date, and the integer is the experience.
Output is either “true” or “false”.
Refer sample output for formatting specifications.
 
Sample Input 1:
11/01/2010
01/09/2014
4
Sample Output 1:
true
 
Sample Input 2:
11/06/2009
01/09/2014
4
Sample Output 2:
False
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode
{
public static boolean calculateExperience(String s1, String s2,int n) 
{
	if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}") && s2.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
	{

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
		try
		{
			Calendar c1=Calendar.getInstance();
			Calendar c2=Calendar.getInstance();
			Date d1=sdf.parse(s1);
			Date d2=sdf.parse(s2);
			c1.setTime(d1);
			c2.setTime(d2);
			int y1=c1.get(Calendar.YEAR);
			int m1=c1.get(Calendar.MONTH);
			int d11=c1.get(Calendar.DATE);
			
			int y2=c2.get(Calendar.YEAR);
			int m2=c2.get(Calendar.MONTH);
			int d22=c2.get(Calendar.DATE);
			
			int k=Math.abs(y2-y1);
			if(m1>m2)
		      k--;
		   else if(m2==m1 && d11>d22)
				k--;
			if(k==n)
			 {
				return true;
			 }
		}
	catch(ParseException e)
		{
			return false;
		
	    }
}
		return false;
	}
}

			


60.Date Validation
 
Write a program to read a string representing a date. The date can be in any of the three formats
1:dd-MM-yyyy 2: dd/MM/yyyy 3: dd.MM.yyyy
If the date is valid, print valid else print invalid.
Include a class UserMainCode with a static method getValidDate which accepts a string. The return type (integer) should be based on the validity of the date.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
03.12.2013
Sample Output 1:
valid
 
Sample Input 2:
03$12$2013
Sample Output 3:
Invalid
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Date;
importjava.util.Scanner;
publicclassUserMainCode {
publicstatic String getvalues(String str) 
{
if(str.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}") || str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}") || str.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))
{

	SimpleDateFormatsdf = newSimpleDateFormat("dd-MM-yyyy");
	SimpleDateFormat sdf1 = newSimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = newSimpleDateFormat("dd.MM.yyyy");
    String s1;
	sdf.setLenient(false);
sdf1.setLenient(false);
sdf2.setLenient(false);
	try
	{
		
		 Date d1=sdf.parse(str);
		return"valid";
	}
	catch(ParseException e)
	{
		try
		{
		Date d2=sdf1.parse(str);
		return"valid";
		}
	catch(ParseException e1)
	    {
		try
		{
		 Date d3=sdf2.parse(str);
		return"valid";
		}
		catch(ParseException e2)
	    {
			return"invalid";
	    }
	    }
	
    }
}
else
return “invalid”;
}
publicstaticvoid main(String[] args) 
{

Scanner in=newScanner(System.in);
String s1=in.next();
System.out.println(UserMainCode.getvalues(s1));
}
}
63.Month Name
 
Given a date as a string input in the format dd-mm-yy, write a program to extract the month and to print the month name in upper case.
 
Include a class UserMainCode with a static method “getMonthName” that accepts a String argument and returns a String that corresponds to the month name.
 
Create a class Main which would get the String as input and call the static method getMonthName present in the UserMainCode.
 
The month names are {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}
 
Input and Output Format:
Input consists of a String.
Output consists of a String.
 
Sample Input:
01-06-82
 
Sample Output:
JUNE
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
public static String getMonthName(String s1) 
{
if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{2}"))
{	
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
	SimpleDateFormat sdf1 = new SimpleDateFormat("MMMM");
    
	sdf.setLenient(false);
    sdf1.setLenient(false);
	try
	{
	     Date d1=sdf.parse(s1);
	     String month=sdf1.format(d1);
	     return month.toUpperCase();
		}
	catch(ParseException e)
	{
		return "Invalid";
	
    }
 
}
else
return "Invalid";

}

	
	

}

 k67.Month : Number of Days
 
Given two inputs year and month (Month is coded as: Jan=0, Feb=1 ,Mar=2 ...), write a program to find out total number of days in the given month for the given year.
 
Include a class UserMainCode with a static method “getNumberOfDays” that accepts 2 integers as arguments and returns an integer. The first argument corresponds to the year and the second argument corresponds to the month code. The method returns an integer corresponding to the number of days in the month.
 
Create a class Main which would get 2 integers as input and call the static method getNumberOfDays present in the UserMainCode.
 
Input and Output Format:
Input consists of 2 integers that correspond to the year and month code.
Output consists of an integer that correspond to the number of days in the month in the given year.
 
Sample Input:
2000
1
 
Sample Output:
29

import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class UserMainCode {
public static int getNumberOfDays (int s1,int s2) 
{
	int k;
	Calendar c=Calendar.getInstance();
	c.set(Calendar.YEAR,s1);
	c.set(Calendar.MONTH,s2);
	GregorianCalendar g=new GregorianCalendar();
boolean b=g.isLeapYear(s1);
if(b || s2!=1)
	 k=c.getActualMaximum(c.DAY_OF_MONTH);
else
	k=28;
	return k;
}
}


13.Day of the Week
 
Write a program to read a date as string (MM-dd-yyyy) and return the day of week on that date.
Include a class UserMainCode with a static method getDay which accepts the string. The return type (string) should be the day of the week.
Create a Class Main which would be used to accept Input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.
Sample Input 1:
07-13-2012
Sample Output 1:
Friday
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
	public static String getDay(String s1) 
	{
	if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}"))
	{
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
	   
		sdf.setLenient(false);
	    sdf1.setLenient(false);
		try
		{
		Date d1=sdf.parse(s1);
		String day=sdf1.format(d1);
	        return day;
		}
		catch(ParseException e)
		{
			return"Invalid";
		
	    }

	}
	else
	return "Invalid";

}
}


21.Date Format Conversion
 
Given a date string in the format dd/mm/yyyy, write a program to convert the given date to the format dd-mm-yy.
 
Include a class UserMainCode with a static method “convertDateFormat” that accepts a String and returns a String.
 
Create a class Main which would get a String as input and call the static method convertDateFormat present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String.
 
Sample Input:
12/11/1998
 
Sample Output:
12-11-98


import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
public static String convertDateFormat(String s1) 
{
if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf1 =new SimpleDateFormat("dd-MM-yy");
    
	sdf.setLenient(false);
    sdf1.setLenient(false);
	try
	{
	     Date d1=sdf.parse(s1);
	     String covdate=sdf1.format(d1);
	     return covdate;
       }
	catch(ParseException e)
	{
		return "Invalid";
	
       }

}
else
return "Invalid";
}
}


 
25.Next Year day
 
Given a date string in dd/mm/yyyy format, write a program to calculate the day which falls on the same date next year. Print the output in small case.
 
The days are sunday, monday, tuesday, wednesday, thursday, friday and saturday.
 
Include a class UserMainCode with a static method “nextYearDay” that accepts a String and returns a String.
 
Create a class Main which would get a String as input and call the static method nextYearDay present in the UserMainCode.
 
Input and Output Format:
Input consists of a String.
Output consists of a String.
 
Sample Input:
13/07/2012
 
Sample Output:
Saturday
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class UserMainCode {
	public static String nextYearDay (String s1) 
	{
	if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
	{

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("EEEE");
	   
		sdf.setLenient(false);
	      sdf1.setLenient(false);
		try
		{
	          Calendar c=Calendar.getInstance();
		     Date d1=sdf.parse(s1);
		    c.setTime(d1);
		    c.add(Calendar.YEAR,1);
		     Date d2=c.getTime();
		     String day=sdf1.format(d2);
	            return day;
			}
		catch(ParseException e)
		{
			return "Invalid";
		
	    }
	}
	else
	return "Invalid";
	}
}

54.DOB - Validation

Write a program to validate the Date of Birth given as input in String format (MM/dd/yyyy) as per the validation rules given below. Return true for valid dates else return false.
1. Value should not be null
2. month should be between 1-12, date should be between 1-31 and year should be a four digit number.
Include a class UserMainCode with a static method ValidateDOB which accepts the string. The return type is TRUE / FALSE.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
12/23/1985

Sample Output 1:
TRUE

Sample Input 2:
31/12/1985

Sample Output 2:
FALSE
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Date;
importjava.util.Scanner;

public class UserMainCode {

public static String getvalues(String s1) 
{
if(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{
SimpleDateFormatsdf=newSimpleDateFormat("MM/dd/yyyy");
sdf.setLenient(false);
try {
Date d1=sdf.parse(s1);
return"valid";
} catch (ParseException e) 
{
	return"Invalid";
}
}
else
return"Invalid";

}

publicstaticvoid main(String[] args) 
{

Scanner in=newScanner(System.in);
String s1=in.next();
System.out.println(UserMainCode.getvalues(s1));
}
}

61.String Processing - ZigZag

Write a program to read a string containing date in DD-MM-YYYY format. find the number of days in the given month.

Note - In leap year February has got 29 days.

Include a class UserMainCode with a static method getLastDayOfMonth which accepts the string. The return type is the integer having number of days.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
12-06-2012
Sample Output 1:
30

Sample Input 2:
10-02-2012
Sample Outpuht 2:
29
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Calendar;
importjava.util.Date;
importjava.util.Scanner;
publicclassUserMainCode {
publicstaticintgetvalues(String s1) 
{
if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}"))
{
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	sdf.setLenient(false);
	try {
	Date d1=sdf.parse(s1);
	Calendar c=Calendar.getInstance();
	c.setTime(d1);
	int k=c.getActualMaximum(c.DAY_OF_MONTH);
	return k;
	} 
	catch (ParseException e) 
	{
		return -1;
	}
}
else
return -1;
}
publicstaticvoid main(String[] args) 
{
Scanner in=newScanner(System.in);
String s1=in.nextLine();
System.out.println(UserMainCode.getvalues(s1));
}
}
62.Leap Year

Write a program to read a string containing date in DD/MM/YYYY format and check if its a leap year. If so, return true else return false.

Include a class UserMainCode with a static method isLeapYear which accepts the string. The return type is the boolean indicating TRUE / FALSE.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a string.

Output consists of TRUE / FALSE.

Refer sample output for formatting specifications.

Sample Input 1:

23/02/2012

Sample Output 1:

TRUE

Sample Input 2:

12/12/2011

Sample Output 2:

FALSE
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Calendar;
importjava.util.Date;
importjava.util.GregorianCalendar;
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Calendar;
importjava.util.Date;
importjava.util.GregorianCalendar;
importjava.util.Scanner;
publicclassUserMainCode {
publicstaticbooleangetvalues(String s1) 
{
if(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{
SimpleDateFormatsdf=newSimpleDateFormat("dd/MM/yyyy");
try
    {
    Date d1=sdf.parse(s1);
GregorianCalendar g=newGregorianCalendar();
    Calendar c=Calendar.getInstance();
c.setTime(d1);
int n1=c.get(Calendar.YEAR);
boolean b=g.isLeapYear(n1);
return b;
}
catch (ParseException e) 
	{
		returnfalse;
	}
}
else
returnfalse;
}
publicstaticvoid main(String[] args) 
{
Scanner in=newScanner(System.in);
String s1=in.nextLine();
System.out.println(UserMainCode.getvalues(s1));
}
}

38.Day of Week

Write a program to read a string  containing date in DD/MM/YYYY format and prints the day of the week that date falls on.
Return the day in lowercase letter (Ex: monday)

Include a class UserMainCode with a static method getDayOfWeek which accepts the string. The return type is the string.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
02/04/1985
Sample Output 1:
Tuesday
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Date;
importjava.util.Scanner;
publicclassUserMainCode {
publicstatic String getvalues(String str) 
{
if(str.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{
	SimpleDateFormatsdf = newSimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf1 = newSimpleDateFormat("EEEE");
    String s1;
	sdf.setLenient(false);
sdf1.setLenient(false);
	try
	{
	     Date d1=sdf.parse(str);
	     s1=sdf1.format(d1);
		}
	catch(ParseException e)
	{
		return"Invalid";
	
    }
	return s1;
}
else
return"Invalid";
}
publicstaticvoid main(String[] args) 
{

Scanner in=newScanner(System.in);
String s1=in.next();
System.out.println(UserMainCode.getvalues(s1));
}
}

39.Add Time

Write a program to read  two String variables containing time intervals in hh:mm:ss format. Add the two time intervals and return a string in days:hours:minutes:seconds format where DD is number of days.
Hint: Maximum value for hh:mm:ss is 23:59:59

Include a class UserMainCode with a static method addTime which accepts the string values. The return type is the string.
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
12:45:30
13:50:45
Sample Output 1:
1:2:36:15

Sample Input 2:
23:59:59
23:59:59
Sample Output 2:
1:23:59:58
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Calendar;
importjava.util.Date;
importjava.util.Scanner;
importjava.util.TimeZone;
publicclassUserMainCode {
publicstatic String getvalues(String s1,String s2) 
{
if(s1.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}") && s1.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}"))
{
	try
	{
	SimpleDateFormatsdf=newSimpleDateFormat("HH:mm:ss");
               sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
    Date d=sdf.parse(s1);
    Date d1=sdf.parse(s2);
	Calendar c=Calendar.getInstance();
      c.setTimeZone(TimeZone.getTimeZone("UTC"));
	c.setTime(d);
	int h=c.get(Calendar.HOUR_OF_DAY);
	int min=c.get(Calendar.MINUTE);
	int sec=c.get(Calendar.SECOND);
	c.setTime(d1);
	int h1=c.get(Calendar.HOUR_OF_DAY);
	int min1=c.get(Calendar.MINUTE);
	int sec1=c.get(Calendar.SECOND);
	intsec2=(sec+sec1);
	int min2=(min+min1);
	int h2=(h+h1);
	int day=0;
if(sec2>60)
{
sec2=sec2-60;
min2++;

}
if(min2>60)
{
min2=min2-60;
h2++;
}
if(h2>=24)
{
h2=h2-24;
day++;
}
String dd,hh,mm,ss,ans="";
dd=String.valueOf(day);
hh=String.valueOf(h2);
mm=String.valueOf(min2);
ss=String.valueOf(sec2);
ans=dd+":"+hh+":"+mm+":"+ss;
returnans;
	}
	catch(ParseException e)
	{
		return"invalid";
	}
}
return"invalid";
}
publicstaticvoid main(String[] args) 
{

Scanner in=newScanner(System.in);
String s1=in.next();
String s2=in.next();
System.out.println(UserMainCode.getvalues(s1,s2));
}
}


 
41.Date Format

Write a program to read  two String variables in DD-MM-YYYY.Compare the two dates and return the older date in 'MM/DD/YYYY' format.

Include a class UserMainCode with a static method findOldDate which accepts the string values. The return type is the string.
Create a Class Main which would be used to accept the two string values and call the static method present in UserMainCode.

Input and Output Format:
Input consists of two string.
Output consists of a string.
Refer sample output for formatting specifications.

Sample Input 1:
05-12-1987
8-11-2010
Sample Output 1:
12/05/1987
importjava.text.ParseException;
importjava.text.SimpleDateFormat;
importjava.util.Calendar;
importjava.util.Date;
importjava.util.Scanner;
publicclassUserMainCode {
publicstatic String getvalues(String s1,String s2) 
{
if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}")&&s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
{

SimpleDateFormatsdf=newSimpleDateFormat("dd-MM-yyyy");
SimpleDateFormat sdf1=newSimpleDateFormat("MM/dd/yyyy");
try
    {
    Date d1=sdf.parse(s1);
    Date d2=sdf.parse(s2);
    Calendar cal=Calendar.getInstance();
cal.setTime(d1);
long y=cal.getTimeInMillis();
cal.setTime(d2);
long y1=cal.getTimeInMillis();
    String s3=sdf1.format(d1);
    String s4=sdf1.format(d2);
if(y<y1)
return  s3;
else
return s4;
    }
catch(ParseException e)
    {
	return"invalid";
    }
}
else
return"invalid";


}
publicstaticvoid main(String[] args) 
{

Scanner in=newScanner(System.in);
String s1=in.next();
String s2=in.next();
System.out.println(UserMainCode.getvalues(s1,s2));
}
}
 

//NORMAL LOGIC
1.    Check Sum of Odd Digits
Write a program to read a number , calculate the sum of odd digits (values) present in the given number.

Include a class UserMainCode with a static method checkSum which accepts a positive integer . The return type should be 1 if the sum is odd . In case the sum is even return -1 as output.

Create a class Main which would get the input as a positive integer and call the static method checkSum present in the UserMainCode.

Input and Output Format: 
Input consists of a positive integer n.
Refer sample output for formatting specifications.

Sample Input 1:
56895
Sample Output 1:
Sum of odd digits is odd.
 
Sample Input 2:
84228
Sample Output 2:
Sum of odd digits is even.


import java.io.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayDiff 
{

	/**
	 * @param args
	 */
	static int getDiff(int n,int a1[])
	{
		
		int len=a1.length;
		
		Arrays.sort(a1);
		
		int dif=a1[len-1]-a1[0];
		if(len==1)
		{
			return a1[0];
		}
		else
		return dif;
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(ArrayDiff.getDiff(n,a));
		
	}

}
 
16.Find the element position in a reversed string array
Given a method with an array of strings and one string variable as input. Write code to sort the given array in reverse alphabetical order and return the postion of the given string in the array.
 
Include a class UserMainCode with a static method getElementPosition which accepts an array of strings and a string variable as input.
 
The return type of the output is an integer which is the position of given string value from the array.
 
Create a Main class which gets string array and a string variable as an input and call the static methodgetElementPosition present in the UserMainCode.
 
Input and Output Format:
Input is an string array. First element in the input represents the size the array
Assume the position of first element is 1.
 
Output is an integer which is the position of the string variable
 
Sample Input 1:
4
red
green
blue
ivory
ivory
 
Sample Output 1:
2
 
Sample Input 2:
3
grape
mango
apple
apple
 
Sample Output 2:
3

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;
import java.io.*;
import java.io.*;
import java.io.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.io.*;
import java.io.*;
import java.io.*;
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

 
 
public class Main {
               
                public static void main(String args[]) throws Exception {
                               
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                int n = Integer.parseInt(br.readLine());
                                ArrayList<Integer> inpList = new ArrayList<Integer>();
                                for(int i=0;i<n*2;i++) {
                                                inpList.add(Integer.parseInt(br.readLine()));
                                }
                                System.out.println(UserMainCode.getYear(inpList));                    
                }
}
 
 
 

 
class UserMainCode {
               
                public static Integer getYear(ArrayList<Integer> inpList) {
                                int i,maxyear=0,maxcount=0;
                                for(i=0;i<inpList.size();i++)
                                {
                                                int num=inpList.get(i);
                                                if(maxcount<num)
                                                                maxcount=num;
                                }
                                maxyear=inpList.get((inpList.indexOf(maxcount))-1);
                                return maxyear;
                }                             
}
 

20.Sum Non Prime Numbers
 
Write a program to calculate the sum of all the non prime positive numbers less than or equal to the given number.
 
Note: prime is a natural number greater than 1 that has no positive divisors other than 1 and itself
 
Example:
input = 9
Prime numbers = 2,3,5 and 7
output = 1+4+6+8+9=28
 
Include a class UserMainCode with a static method “addNumbers” that accepts an integer arguement and returns an integer.
 
Create a class Main which would get an integer as input and call the static method validateNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of an integer.
Output consists of an integer.
 
Sample Input:
9
 
Sample Output:
28

 import java.io.*;
import java.io.*;
import java.io.*;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
getvalues(n);
}
public static void getvalues(int n) {
int rem = 0, i = 0;
int a[] = new int[10];
while (n > 0) {
rem = n % 10;
a[i] = rem;
n = n / 10;
i++;
}
int sume = 0, sumo = 0;
for (int j = i - 1; j >= 0; j -= 2) {
sumo = sumo + a[j];
}
for (int j = i - 2; j >= 0; j -= 2) {
sume = sume + a[j];
}
if (sume == sumo) {
System.out.println("yes");
} else
System.out.println("no");
}
}
 
 
 
30.Programming Logic

Write a Program that accepts three integer values (a,b,c) and returns their sum. However, if one of the values is 13 then it does not count towards the sum and the next number also does not count. So for example, if b is 13, then both b and c do not count.

Include a class UserMainCode with a static method getLuckySum which accepts three integers. The return type is integer representing the sum.

Create a Class Main which would be used to accept the input integers and call the static method present in UserMainCode.

Input and Output Format:

Input consists of three integers.

Output consists of a single integer.

Refer sample output for formatting specifications.

Sample Input 1:
1
2
3

Sample Output 1:
6


Sample Input 2:
1
2
13

Sample Output 2:
3


Sample Input 3:
13
3
8

Sample Output 3:
8
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;


public class Triplets 
{

	/**
	 * @param args
	 */
	static boolean check(int a[])
	{
		boolean result=false;
		
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			if((a[i]==a[i+1]) && (a[i+1]==a[i+2]))
			{
				result=true;
			}
			
		}
		
		return result;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
             a[i] = sc.nextInt();
        }
        System.out.println(Triplets.check(a));
	}

}
 
 
42.Median Calculation

Write a program to accept an int array as input, and calculate the median of the same.

Median Calculation Procedure:
    Sort the sequence of numbers.
    The total number count is odd, Median will be the middle number.

    The total number count is even, Median will be the average of two middle numbers, After calculating the average, round the number to nearest integer.

Include a class UserMainCode with a static method calculateMedian which accepts the int array. The return type is the integer which would be the median.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of integers.
Output consists of a integer.
Refer sample output for formatting specifications.

Sample Input 1:
7
1
2
1
4
7
1
2

Sample Output 1:
2

Sample Input 2:
6
52
51
81
84
60
88

Sample Output 2:
71

import java.util.Arrays;
import java.util.Scanner;


public class MedianCalculation 
{

	/**
	 * @param args
	 */
	static int calc(int a[])
	{
		int len=a.length;
		Arrays.sort(a);
		int mid1,mid2,result=0;
		if(len%2==0)
		{
			mid1 = len/2;
			mid2 = mid1+1;
			float add = a[mid1-1]+a[mid2-1];
			float div = add/2;
			result = Math.round(div);

		}
		else
		{
			mid1 = len/2;
			result=a[mid1];
		}
		return result;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
             a[i] = sc.nextInt();
        }
        System.out.println(MedianCalculation.calc(a));
	}

}
 

43.Sequence in Array

Write a program to accept an int array as input, and check if [1,2,3] appears somewhere in the same sequence.

Include a class UserMainCode with a static method searchSequence which accepts the int array. The return type is a boolean which returns true or false.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a an integer which denotes the size of the array followed by the array of integers.
Output should print true or false.
Refer sample output for formatting specifications.

Sample Input 1:
9
11
-2
5
1
2
3
4
5
6

Sample Output 1:
TRUE

Sample Input 2:
6
-2
5
1
3
2
6

Sample Output 2:
FALSE

import java.util.Scanner;


public class ArraySequence 
{

	/**
	 * @param args
	 */
	static boolean checkSeq(int n,int a[])
	{
		boolean result=false;
		int len=a.length;
		for(int i=0;i<len-1;i++)
		{
			if((a[i]==1) && (a[i+1]==2) && (a[i+2]==3))
				result=true;
		}
		return result;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
             a[i] = sc.nextInt();
        }
        
        System.out.println(ArraySequence.checkSeq(n,a));
	}

}


 

50.Perfect Number

Write a program to that takes a positive integer and returns true if the number is perfect number.

A positive integer is called a perfect number if the sum of all its factors (excluding the number itself, i.e., proper divisor) is equal to its value.

For example, the number 6 is perfect because its proper divisors are 1, 2, and 3, and 6=1+2+3; but the number 10 is not perfect because its proper divisors are 1, 2, and 5, and 1+2+5 is not equal to 10

Include a class UserMainCode with a static method getPerfection which accepts the number. The return type is boolean (true / false).

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a integer.
Output consists of TRUE / FALSE.
Refer sample output for formatting specifications.

Sample Input 1:
28

Sample Output 1:
TRUE

import java.util.Scanner;


public class PerfectNumber 
{

	/**
	 * @param args
	 */
	
	static boolean perfect(int n)
	{
		boolean res=false;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			sum=sum+i;
		}
			if(sum==n)
			res = true;
			else
			res=false;
			
			return res;
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(PerfectNumber.perfect(n));
	}

}


 

64.Largest Span

Write a program to read a integer array, find the largest span in the array.
Span is the count of all the elements between two repeating elements including the repeated elements.
Include a class UserMainCode with a static method getLargestSpan which accepts the integer array. The return type is integer.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:
Input consists of an integer n which is the number of elements followed by n integer values.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
6
4
2
1
4
5
7
Sample Output 1:
4
import java.util.Scanner;
 
public class Main {
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
 
 int n=sc.nextInt();
 int []a=new int[n];
 for(int i=0;i<n;i++)
 {
                 a[i]=sc.nextInt();
 }
 System.out.print(UserMainCode.display(a,n));
}}
public class UserMainCode {
                                public static int display(int[] x,int n)
                                {
                                                int gap=0,max=0;
                                                for(int i=0;i<n;i++)
                                                {
                                                                for(int j=i+1;j<n;j++)
                                                                {
                                                                                if(x[i]==x[j])
                                                                                {
                                                                                                gap=j;
                                                                                }
                                                                }
                                                                if(gap-i>max)
                                                                                max=gap-i;
                                                               
                                                }
                                                return max+1;
                                }
 
                }
 
15.Kaprekar Number
 
Write a program to check whether the given input number is a Kaprekar number or not.
Note : A positive whole number ‘n’ that has ‘d’ number of digits is squared and split into two pieces, a right-hand piece that has ‘d’ digits and a left-hand piece that has remaining ‘d’ or ‘d-1’ digits. If the sum of the two pieces is equal to the number, then ‘n’ is a Kaprekar number.
 
If its Kaprekar number assign to output variable 1 else -1.
Example 1:
Input1:9
9^2 = 81, right-hand piece of 81 = 1 and left hand piece of 81 = 8
Sum = 1 + 8 = 9, i.e. equal to the number. Hence, 9 is a Kaprekar number.
 
Example 2:
Input1:45
Hint:
45^2 = 2025, right-hand piece of 2025 = 25 and left hand piece of 2025 = 20
Sum = 25 + 20 = 45, i.e. equal to the number. Hence, 45 is a Kaprekar number."
 
Include a class UserMainCode with a static method “getKaprekarNumber” that accepts an integer argument and returns an integer. The method returns 1 if the input integer is a Kaprekar number. Else the method returns -1.
 
Create a class Main which would get the an Integer as input and call the static method getKaprekarNumber present in the UserMainCode.
 
Input and Output Format:
Input consists of an integer.
Output consists of a single string that is either “Kaprekar Number” or “Not A Kaprekar Number”
 
Sample Input 1:
9
 
Sample Output 1:
Kaprekar Number
 
Sample Input 2:
45
 
Sample Output 2:
Kaprekar Number
 
Sample Input 3:
4
 
Sample Output 3:
Not A Kaprekar Number
import java.util.Scanner;
 
 
public class Main{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
 
useerm.display(n);
}}
 
 
class useerm{
public static void display(int a)
{
 int count=0,j=0;
 int a1=a;
 while(a1!=0)
 {
                 count=count+1;
                 a1=a1/10;
 }
 int square=a*a;
 String s=Integer.toString(square);
 String s1=s.substring(0,count);
 String s2=s.substring(count);
 int x=Integer.parseInt(s1);
 int y=Integer.parseInt(s2);
 int result =x+y;
 if(result==a){
                 j=1;
                 
 }
 else
 {
                 j=2;
 }
 if(j==1)
 {
	 System.out.println("Kaprekar Number");
 }
 else 
	 System.out.println("not an Kaprekar Number");
}}


 
 18.average of primes
 
Write a program to read an array and find average of all elements located at index i, where i is a prime number. Type cast the average to an int and return as output. The index starts from 0.
Include a class UserMainCode with a static method addPrimeIndex which accepts a single integer array. The return type (integer) should be the average of all elements located at index i where i is a prime number.
Create a Class Main which would be used to accept Input array and call the static method present in UserMainCode.
Input and Output Format:
Input consists of n+1 integers. The first integer corresponds to n, the number of elements in the array. The next 'n' integers correspond to the elements in the array.
Output consists of a single Integer.
Refer sample output for formatting specifications.

 
Assume that the maximum number of elements in the array is 20 and minimum number of elements is 3.

 
Sample Input 1:
4
2
5
2
4
Sample Output 1:
3

import java.util.Scanner;


public class AvgPrimeIndex
{

	/**
	 * @param args
	 */
	
	static int getvalues(int n,int a[])
	{
		int sum=0,sum_count=0;
        int len=a.length;
        		for(int i=0;i<len;i++)
        		{
                        int count=0;
                        for(int j=1;j<=i;j++)
                        {
                        	if(i%j==0)
                        	{
                        			count++;
                        			
                        	}
       
                        }
                        if(count==2)
                        {
                        	sum=sum+a[i];
                        	sum_count++;
                        }
        		}
       
        int avg=sum/sum_count;
        return avg;


		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
             a[i] = sc.nextInt();
        }
       
        System.out.println(AvgPrimeIndex.getvalues(n,a));

	}

}




25.Sum of Digits
 
Write a Program that accepts a word as a parameter, extracts the digits within the string and returns its sum.
Include a class UserMainCode with a static method getdigits which accepts a string. The return type is integer representing the sum.
Create a Class Main which would be used to accept the input string and call the static method present in UserMainCode.
Input and Output Format:
Input consists of a string with maximum size of 100 characters.
Output consists of a single string.
Refer sample output for formatting specifications.
Sample Input 1:
abc12de4

 
Sample Output 1:
7
import java.util.Scanner;


public class SumOfDigits 
{

	/**
	 * @param args
	 */
	static int sum(String s1)
	{
		int len=s1.length();
		int sum=0;
		for(int i=0;i<len;i++)
		{
			char c=s1.charAt(i);
			if(Character.isDigit(c))
			{
				String ss=c+"";
				sum=sum+Integer.parseInt(ss);
			}
		}
		return sum;
		
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(SumOfDigits.sum(s));
	}

}


 29.Digits - II

Write a program to read a non-negative integer n, compute the sum of its digits. If sum is greater than 9 repeat the process and calculate the sum once again until the final sum comes to single digit.Return the single digit.
Include a class UserMainCode with a static method getDigitSum which accepts the integer value. The return type is integer.
Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:
Input consists of a integer.
Output consists of integer.
Refer sample output for formatting specifications.

Sample Input 1:
9999
Sample Output 1:
9

Sample Input 2:
698
Sample Output 2:
5

import java.util.Scanner;


public class Digits 
{

	/**
	 * @param args
	 */
	
	static int sum(int n)
	{
		
	
		int sum = 0 ;
        //int n1=n;
        while(n>10)
        {
          int r = 0 ;
          sum = 0;
          while(n!=0)
          {
             r = n%10;
             sum=sum+r;
             n=n/10;
           }
           n=sum;
        }
        return sum;

	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Digits.sum(n));
	}

}

31.Shift Left

Write a program to read a integer array of scores, and return a version of the given array where all the 5's have been removed. The remaining elements should shift left towards the start of the array as needed,

and the empty spaces at the end of the array should be filled with 0.

So {1, 5, 5, 2} yields {1, 2, 0, 0}.

Include a class UserMainCode with a static method shiftLeft which accepts the integer array. The return type is modified array.

Create a Class Main which would be used to accept the integer array and call the static method present in UserMainCode.

Input and Output Format:

Input consists of an integer n which is the number of elements followed by n integer values.

Output consists of modified array.

Refer sample output for formatting specifications.

Sample Input 1:
7
1
5
2
4
5
3
5

Sample Output 1:
1
2
4
3
0
0
0

import java.util.Scanner;


public class ShiftLeft 
{

	/**
	 * @param args
	 */
	static int[] shift(int n,int a[])
	{
		int ans[]=new int[a.length];
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=5)
			{
				ans[k]=a[i];
				k++;
			}
		}
		return ans;
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int res[]=new int[n];
		res=ShiftLeft.shift(n,a);
		for(int i=0;i<n;i++)
		{
		System.out.println(res[i]);
		}

		

	}

}



35.Sequence Sum

Write a program to read a non-negative integer n, and find sum of fibonanci series for n number..

Include a class UserMainCode with a static method getFibonacciSum which accepts the integer value. The return type is integer.

The fibonacci seqence is a famous bit of mathematics, and it happens to have a recursive definition.

The first two values in the sequnce are 0 and 1.

Each subsequent value is the sum of the previous two values, so the whole seqence is 0,1,1,2,3,5 and so on.

You will have to find the sum of the numbers of the Fibonaaci series for a given int n.

Create a Class Main which would be used to accept the string and call the static method present in UserMainCode.

Input and Output Format:

Input consists of a integer.

Output consists of integer.

Refer sample output for formatting specifications.

Sample Input 1:

5

Sample Output 1:

7


import java.util.Scanner;


public class SeqSum
{

	/**
	 * @param args
	 */
	static int sumOfFib(int n)
	{
		 int first = 0, second = 1, next,sum=0;;  
		for (int i = 0 ; i < n ; i++ )
		   {
		      if ( i <= 1 )
		         next = i;
		      else
		      {
		         next = first + second;
		         first = second;
		         second = next;
		      }
		     
		      sum=sum+next;
		   }
		
		 return sum;

		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(sumOfFib(n));
	}

}


