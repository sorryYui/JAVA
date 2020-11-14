public class Notice
{
    public Notice(int id,String title)
    {
        this.id = id;
        this.title = title;
    }
    public Notice(final Notice tmp)
    {
        this.id = tmp.getId();
        this.title = tmp.getTitle();
    }
    public int getId()
    {
        return id;
    }
    public String getTitle()
    {
        return title;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }
    private int id;
    private String title;
}
