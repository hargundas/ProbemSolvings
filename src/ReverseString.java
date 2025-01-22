public class ReverseString {


    public static void main(String[] args){
        reverseString("hargun");
        reverseStringOptimized("hargun");
    }

    static String reverseString(String s){
        String str ="";
        char[] c = s.toCharArray();
        for(char ch : c ){
           str = ch + str ;
        }
        System.out.println(str);
        return str;
    }
    static String reverseStringOptimized(String s){
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        for(char ch : c ){
            sb.insert(0,ch);
        }
        String str = sb.toString();
        System.out.println(str);
        return str;
    }
}
