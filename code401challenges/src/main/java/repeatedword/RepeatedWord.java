package repeatedword;

import java.util.*;

public class RepeatedWord {

    public static String repeatedWord(String input){
        HashSet hashy = new HashSet();
        int beg = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == ' ' || input.charAt(i) == '!' || input.charAt(i) == '.'){
                String word = input.substring(beg, i);
                if(hashy.contains(word)){
                    return word;
                } else {
                    hashy.add(word.toLowerCase());
                    beg = i + 1;
                }
            }
        }
        System.out.println(hashy.toString());
        return null;
    }
}
