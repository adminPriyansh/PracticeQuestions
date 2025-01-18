public class Main {
    public static void main(String[] args) {
        countLowerAndUpperCase("PriyansH");
        int a = strStr("hello","ll");
        System.out.println(a);
    }

    private static void countLowerAndUpperCase(String s){
        int countUP = 0;  int countLs= 0;
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                countUP++;
            } else {
                countLs++;
            }
        }
        System.out.println("UpperCase"+countUP+"LowerCase"+countLs);
    }

    //find-the-index-of-the-first-occurrence-in-a-string
    public static int strStr(String haystack, String needle) {
        int result = 0;

        if (haystack.contains(needle)) {
            boolean flag = false;
            for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
                if (haystack.startsWith(needle,i)) {
                    result = i;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("NONE");
            }
        } else {
            result = -1;
        }
        return result;
    }
}