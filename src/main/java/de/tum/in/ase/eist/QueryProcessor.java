package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Kareem";
        } else if (query.contains("+")){ // TODO extend the programm here
            StringBuilder sb = new StringBuilder();
            String temp = query;
            int iterator = 0;
            int iterator2 = 0;
            int[] numbers = new int[100];
            for(Character number : temp.toCharArray() ){
                if(number >= 48 && number <= 57){
                    iterator2++;
                    numbers[iterator] = Character.getNumericValue(number);
                    iterator++;
                }
            }
            int result = 0;
            for (int i = 0; i < iterator2; i++) {
                result += numbers[i];
            }
            return String.valueOf(result);
        }
        return query;
    }
}
