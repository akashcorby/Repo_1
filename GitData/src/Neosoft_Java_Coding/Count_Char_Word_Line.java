package Neosoft_Java_Coding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//Q. Get the count of total characters, words and lines and also count the number repeated word in a given file in Java 

public class Count_Char_Word_Line 
{
	public static void main(String[] args) 
	{
		 String s = "C:\\Selenium Note Pad text\\text_2.txt";
         int lineCount=0;
         int wordCount=0;
         int charCount=0;
         
         try 
         {
			FileReader f = new FileReader(s);
			BufferedReader b = new BufferedReader(f);
			String r = b.readLine();
			
			Map<String,Integer> m = new HashMap<String,Integer>();
			
			while(r!=null)
			{
				lineCount++;
				
				String word[] = r.toLowerCase().split(" ");
				wordCount = wordCount + word.length;
				
				for(String words : word)
				{
				  if(!words.isBlank())
				  {	  
					if(m.containsKey(words))
					{
						m.put(words, m.get(words)+1);
					}
					else
					{
						m.put(words, 1);
					}
				  }	
					
					charCount = charCount + words.length();
				}
				r = b.readLine();//this method will take a control in next line of any text
			}
			System.out.println("Total Line Count :- "+lineCount);
			System.out.println("Total Word Count :- "+wordCount);
			System.out.println("Total Character Count :- "+charCount);
			m.forEach((k,v)-> System.out.println(k+ ":-" +v));
			
			Map<String,Integer> m1 = new HashMap<String,Integer>();
			
            m.entrySet().stream().filter(entry-> entry.getValue()==Collections.max(m.values()))
            .forEach(e-> m1.put(e.getKey(), e.getValue()));
            
            System.out.println("-----------------------");
            System.out.println(m1);
			
		 } 
         catch (FileNotFoundException e) 
         {
			e.printStackTrace();
		 } 
         catch (IOException e) 
         {
			e.printStackTrace();
		 }
         
	}

}


//https://www.geeksforgeeks.org/stream-in-java/
//https://www.youtube.com/watch?v=Zeoe2o-QIj0

/*Different Operations On Streams-

Intermediate Operations:

map: The map method is used to returns a stream consisting of the results of applying the given function to the elements of this stream.
     List number = Arrays.asList(2,3,4,5);
     List square = number.stream().map(x->x*x).collect(Collectors.toList());
filter: The filter method is used to select elements as per the Predicate passed as argument.
        List names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
sorted: The sorted method is used to sort the stream.
        List names = Arrays.asList("Reflection","Collection","Stream");
        List result = names.stream().sorted().collect(Collectors.toList());

Terminal Operations:

collect: The collect method is used to return the result of the intermediate operations performed on the stream.
         List number = Arrays.asList(2,3,4,5,3);
         Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
forEach: The forEach method is used to iterate through every element of the stream.
         List number = Arrays.asList(2,3,4,5);
         number.stream().map(x->x*x).forEach(y->System.out.println(y));
reduce: The reduce method is used to reduce the elements of a stream to a single value.
        The reduce method takes a BinaryOperator as a parameter.
        List number = Arrays.asList(2,3,4,5);
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);*/
