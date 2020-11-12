public class GenericTest
{
    public static void main(String args[])
    {
        Generic<String> genericString = new Generic("HHH");
        genericString.showKey(genericString);
        String str = genericString.showKeyName(genericString);
        System.out.println(str);
    }
}
