import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Test
{
    public static void main(String args[])
    {
        List<Notice> list = new ArrayList<>();
        list.add(new Notice(1,"睡觉啦！"));
        list.add(new Notice(2,"起床啦！"));
        list.add(new Notice(3,"吃饭啦！"));
        for (Notice notice : list)
            System.out.println(notice.getId() + " " + notice.getTitle());
        System.out.println();
        list.add(new Notice(4,"玩群星啦！"));
        Iterator<Notice> it = list.iterator();
        while (it.hasNext())
        {
            Notice tmp = new Notice(it.next());
            System.out.println(tmp.getId() + " " + tmp.getTitle());
        }
        System.out.println();
        list.remove(0);
        for (int i = 0;i < list.size();i++)
            System.out.println(list.get(i).getId() + " " + list.get(i).getTitle());
        System.out.println();
        list.get(0).setTitle("修改啦！");
        for (int i = 0;i < list.size();i++)
            System.out.println(list.get(i).getId() + " " + list.get(i).getTitle());
    }
}
