import java.lang.annotation.Documented;
@Documented
public @interface myat
{
    String name() default  "HHH";
    int id() default 1;
}
