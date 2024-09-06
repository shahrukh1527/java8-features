package com.demo.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movie{
	public String mname;
	public String hero;
	public String heroin;
	public String hit;
	
	public Movie(String mname,String hero,String heroin) {
		this.mname= mname;
		this.hero= hero;
		this.heroin=heroin;
	}
	
	public Movie(String mname,String hero,String heroin,String hit) {
		this.mname= mname;
		this.hero= hero;
		this.heroin=heroin;
		this.hit =hit;
	}
}

public class ConsumerDemo1 {

	public static void main(String[] args) {
      
		ArrayList<Movie> list = new ArrayList<Movie>();
		populate(list);
		
		Consumer<Movie> consumer = m-> {
			System.out.println(m.mname+" "+m.hero+" ");
		};
		
		Consumer<Movie> c1 = m-> {
			System.out.println("Movie "+m.mname+" is ready to release");
		};
		
		Consumer<Movie> c2 = m-> {
			System.out.println("Movie "+m.mname+" is released and it is "+m.hit);
		};
		
		Consumer<Movie> c3 = m-> {
			System.out.println("Movie "+m.mname+" is saved into DB");
			System.out.println();
		};
		
		for(Movie m:list) {
			consumer.accept(m);
		}
		
		//consumer chaining
		for(Movie m:list) {
			c1.andThen(c2).andThen(c3).accept(m);
		}

	}
	
	public static void populate(ArrayList<Movie> movies) {
		movies.add(new Movie("Bahubali", "prabhash", "anushka","hit"));
		movies.add(new Movie("PK", "Amir", "anushka sharma","flop"));
		movies.add(new Movie("DDLJ", "shahrukh", "kajol","hit"));
	}

}
