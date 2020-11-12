public class GenericTest
{
    public static void main(String args[])
    {
        Generic<Integer> genericInteger = new Generic(1);
        Generic<String> genericString = new Generic("111");
        System.out.println(genericInteger.getKey());
        System.out.println(genericInteger.getKey().getClass());
        System.out.println(genericString.getKey());
        System.out.println(genericString.getKey().getClass());
    }
}
