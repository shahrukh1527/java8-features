package com.demo.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	public String username;
	public String password;
	
	public User(String username,String password) {
		this.username= username;
		this.password=password;
	}
}
public class PredicateDemo5 
{
   public static void main(String[] args) {
     Predicate<User> validUserPredicate = user -> user.username.equals("durga") && user.password.equals("java");
     
     
     
     try(Scanner sc = new Scanner(System.in);) {
         System.out.println("Enter username");
         String uname=  sc.nextLine();

         System.out.println("Enter password");
         String upass=  sc.nextLine();
         
         User user = new User(uname, upass);
         
         if(validUserPredicate.test(user)) {
        	 System.out.println("valid user");
         } else {
        	 System.out.println("invalid user");
         }
     }
}
}
