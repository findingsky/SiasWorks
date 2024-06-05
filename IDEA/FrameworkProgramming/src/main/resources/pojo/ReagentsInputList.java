package pojo;

public class ReagentsInputList extends ReagentsList
{
    private char[] riId = new char[11];
    private char[] rFactory = new char[11];


    public char[] getRiId()
    {
        return riId;
    }


    public char[] getrFactory()
    {
        return rFactory;
    }


    public void setRiId(char[] riId)
    {
        this.riId = riId;
    }


    public void setrFactory(char[] rFactory)
    {
        this.rFactory = rFactory;
    }


    @Override
    public String toString()
    {
        return super.toString() + "\n" + "reagentsInputList [riId=" + riId + ", rFactory=" + rFactory + "]";
    }

    // 检查输入的试剂是否符合要求
    public boolean checkInput()
    {
        // 检查试剂ID是否符合要求
        if (riId == null || riId.length != 11)
        {
            return false;
        }
        // 检查试剂生产厂商是否符合要求
        if (rFactory == null || rFactory.length != 11)
        {
            return false;
        }
        return true;
    }
}
