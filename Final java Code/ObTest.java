package testJava;
import java.util.*;
public class ObTest{
public static void main(String [] args) {
	
			String result="";
			HashMap<Integer, String> mapping= new HashMap<>();
			mapping.put(2, "abc");
			mapping.put(3, "def");
			mapping.put(4, "ghi");
			mapping.put(5, "jkl");
			mapping.put(6, "mno");
			mapping.put(7, "pqrs");
			mapping.put(8, "tuv");
			mapping.put(9, "wxyz");
			mapping.put(0, " ");
			Scanner sc= new Scanner(System.in);
			
			
			
			String[] n = sc.nextLine().split("\\s+");
			for(int i=0;i<n.length;i++)
			{
				String[] n1=n[i].split(",");
				if(n[i].contains(",")) 
				{
					
				
				String value=mapping.get(Integer.parseInt(n1[0]));
				
				int length=value.length();
				int reminder=(Integer.parseInt(n1[1])-1)%length;
				result=result+value.charAt(reminder);
				
				
			}
				else {
					
					String value=mapping.get(Integer.parseInt(n1[0]));
					
					result=result+value.charAt(0);
					
				}
			}
			System.out.println(result);
			
	      }
   }
