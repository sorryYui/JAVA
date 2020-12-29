public class StudentProxy implements Person
{
    private Student student;
    public StudentProxy(Person student)
    {
        if (student.getClass() == Student.class)
            this.student = (Student) student;
    }
    public void giveMoney()
    {
        student.giveMoney();
    }
}
