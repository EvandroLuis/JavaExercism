import java.util.Set;
import java.util.HashSet;

public class PangramChecker {


    public boolean isPangram(String input) {
        int alphabet_len=26;
        input= input.toLowerCase();
        input= input.replaceAll("[^a-z]", ""); //cleaning the string
        char[] characters = input.toCharArray();    //char array

        Set set=new HashSet();  //removing duplicate characters from the String
        StringBuilder sb = new StringBuilder();
        for (char c : characters) {
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }
        int cleanStringLenght = sb.toString().length();
        return cleanStringLenght == alphabet_len;
    }
}
