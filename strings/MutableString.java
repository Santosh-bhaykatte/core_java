package core_Java.strings;

public class MutableString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        //append(str)
        sb.append(" World");
        System.out.println("append: "+ sb);

        //insert(int index, value)
        sb.insert(5, " Java");
        System.out.println("insert: "+ sb);

        //replace(int start, int end, String str)
        sb.replace(6, 10, "Tony");
        System.out.println("replace: "+ sb);

        //delete(int start, int end)
        sb.delete(5, 10);
        System.out.println("delete: "+ sb);

        //deleteCharAt(int index)
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: "+ sb);

        sb.insert(5, " ");
        System.out.println(sb);

        //reverse()
        System.out.println("reverse: "+ sb.reverse());
        sb.reverse();

        //length()
        System.out.println("length: "+ sb.length());

        //setLength(int newLength)
        sb.setLength(5);
        System.out.println("setLength: "+ sb);

        //charAt(int index)
        System.out.println("charAt: "+ sb.charAt(0));

        //setCharAt(int index, char ch)
        sb.setCharAt(0, 'Y');
        System.out.println("setCharAt: "+ sb);

        //substring(int from, int to)
        String str = sb.substring(2);
        System.out.println("substring: "+ str);

        //indexOf(String str)
        System.out.println("indexOf: "+ sb.indexOf("llo"));

        //lastIndexOf(String str)
        System.out.println("lastIndexOf: "+ sb.lastIndexOf("l"));
    }
}
