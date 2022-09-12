package dehtiar.homeworks.homework_7;

public class HomeworkMethods {
    public static void main(String[] args) {
        findSymbolOccurance("Hello Java", 'J');
        findWordPosition("Apple", "plant");
        System.out.println(stringReverse("Hello"));
        System.out.println(isPalindrome("ERE"));
    }

    private static void findSymbolOccurance(String word, char sym) {
        int counter = 0;
        char[] result = word.toCharArray();
        for (char c : result) {
            if (c == sym) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    private static void findWordPosition(String source, String target) {
        int index = source.indexOf(target);
        System.out.println(index);
    }

    private static String stringReverse(String rev) {
        return new StringBuilder(rev).reverse().toString();
    }

    private static boolean isPalindrome(String str) {
        return str.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(str.replaceAll("\\W", "")).reverse().toString());
    }
}
