public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    //converts the string to lower case
    public static String lowerCase(String str) {
        String finalString = "";
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) <= 90 && str.charAt(i) >= 65){
                finalString = finalString + (char)(str.charAt(i) + 32);
            } else {
                finalString = finalString + str.charAt(i);
            }
        }
        return finalString;
    }

    //checks if 2 string are equal
    public static boolean equalsStrings(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        for (int i = 0 ; i < str1.length() ; i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    //checks if str1 contains str2
    public static boolean contains(String str1, String str2) {
        if (str1.length() < str2.length()){
            return false;
        }

        if (str1.length() == str2.length()){
            if (str1 == str2){
                return true;
            } else {
                return false;
            }
        }

        for (int i = 0 ; i <= str1.length() - str2.length() ; i++){
            String stringTemp = "";
            for (int j = 0 ; j < str2.length() ; j++){
                stringTemp = stringTemp + str1.charAt(j + i);
            }

            //checks if the strings are similar
            if (equalsStrings(stringTemp, str2)){
                return true;
            }
        }
        return false;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0 ; i < sentences.length ; i++){
            for (int j = 0 ; j < keywords.length ; j++){
                if (contains(lowerCase(sentences[i]), lowerCase(keywords[j]))){
                    System.out.println(sentences[i]);
                }
            } 
        }
    }
}
