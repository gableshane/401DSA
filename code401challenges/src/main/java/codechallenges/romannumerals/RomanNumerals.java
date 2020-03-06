package codechallenges.romannumerals;

public class RomanNumerals {

    public static String convertToRomanNumerals(int year){
        StringBuilder sb = new StringBuilder();

        while(year >= 1000){
            sb.append("M");
            year -= 1000;
        }
        while(year >= 500){
            if(year >= 900){
                sb.append("CM");
                year -= 900;
            } else {
                sb.append("D");
                year -= 500;
            }

        }
        while(year >= 100){
            if(year >= 400){
                sb.append("CD");
                year -= 400;
            } else {
                sb.append("C");
                year -= 100;
            }
        }
        while(year >= 50){
            sb.append("L");
            year -= 50;
        }
        while(year >= 10){
            if(year >= 40){
                sb.append("XL");
                year -= 40;
            } else {
                sb.append("X");
                year -= 10;
            }
        }
        while(year >= 5){
            if(year == 9){
                sb.append("IX");
                year -= 9;
            } else {
                sb.append("V");
                year -= 5;
            }

        }
        while(year >= 1){
            if(year == 4){
                sb.append("IV");
                year -= 4;
            } else {
                sb.append("I");
                year -= 1;
            }
        }
        return sb.toString();
    }
}
