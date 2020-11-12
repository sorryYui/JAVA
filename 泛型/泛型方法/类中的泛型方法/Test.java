public class Test
{
    public static void main(String args[])
    {
        Generic<Fruit> genericFruit = new Generic();
        Fruit apple = new Apple();
        Person person = new Person();
        genericFruit.show_1(apple);
        //genericFruit.show_1(person);
        genericFruit.show_2(person);
        genericFruit.show_3(person);
    }
}
