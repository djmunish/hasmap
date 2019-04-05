package com.company;
import java.util.*;

public class hackerRank {
    public static void main(String []args)
    {

        HashMap<String,Long> phoneBook = new HashMap<String,Long>();
        Scanner sc= new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());




        for(int i = 0 ; i<n ; i ++)
        {
            String [] inp = sc.nextLine().split("\\s+");
            String name = inp[0];
            Long number = Long.parseLong(inp[1]);a
            phoneBook.put(name, number);
        }

        while(sc.hasNext()) {
            String findNames = sc.next();
            System.out.println(findNames);
            if (phoneBook.containsKey(findNames)) {
                System.out.println(findNames + " = " + phoneBook.get(findNames));
            } else {
                System.out.println("Not Found");
            }
        }

    }
}


