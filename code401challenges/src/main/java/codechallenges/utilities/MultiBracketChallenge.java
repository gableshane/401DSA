package codechallenges.utilities;

public class MultiBracketChallenge {

    public static boolean multiBracketValidation(String input){
        int countRound = 0;
        int countSquiggles = 0;
        int countSquare = 0;
        char roundleft = '(';
        char roundright = ')';
        for(int i = 0; i < input.length(); i++){
            char s = input.charAt(i);
            if(s == roundleft){
                countRound++;
            } else if (s == roundleft){
                roundright++;
            }
        }
        return
    }
}
