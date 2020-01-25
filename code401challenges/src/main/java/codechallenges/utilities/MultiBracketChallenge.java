package codechallenges.utilities;

public class MultiBracketChallenge {

    public static boolean multiBracketValidation(String input){
        int countRound = 0;
        int countSquiggles = 0;
        int countSquare = 0;
        char roundLeft = '(';
        char roundRight = ')';
        char squareLeft = '[';
        char squareRight = ']';
        char squiggleLeft = '{';
        char squiggleRight = '}';
        for(int i = 0; i < input.length(); i++){
            char s = input.charAt(i);
            if(s == roundLeft){
                countRound++;
            } else if (s == roundRight){
                countRound--;
            } else if (s == squareLeft){
                countSquare++;
            } else if (s == squareRight){
                countSquare--;
            } else if (s == squiggleLeft){
                countSquiggles++;
            } else if (s == squiggleRight){
                countSquiggles--;
            }
        }
        return countRound == 0 && countSquare == 0 && countSquiggles == 0;
    }
}
