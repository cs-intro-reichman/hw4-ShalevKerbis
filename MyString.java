public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
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

    //checks if 2 strings are similar
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

    /** If str1 contains str2, returns true; otherwise returns false. */
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
}
