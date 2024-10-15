public class ReverseString{
    public static void main(String arge[])
    {
        String str="123";
        System.out.println(reverse(str));
    }

    public static String reverse(String in)
    {
        if(in == null)
        {
            throw new IllegalAccessError("Null is not a valid input");
        }
        StringBuilder out = new StringBuilder();
        char[] chars = in.toCharArray();
        for(int i=chars.length-1; i>=0; i--)
        {
            out.append(chars[i]);
        }
        return out.toString();
    }
}