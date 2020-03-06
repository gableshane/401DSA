package codechallenges.urlfix;

public class UrlSanitize {

    public static String fixURL(String url){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < url.length(); i++){
            if(url.charAt(i) == ' '){
                sb.append("%20");
            } else {
                sb.append(url.charAt(i));
            }
        }
        return sb.toString();
    }
}
