package org.example.pojo;

public class ReagentsOutputList extends ReagentsList
{
    private char[] roId = new char[11];
    private String roUsage;

    //getters
    public char[] getRoId()
    {
        return roId;
    }


    public String getRoUsage()
    {
        return roUsage;
    }


    //setters
    public void setRoId(char[] roId)
    {
        this.roId = roId;
    }


    public void setRoUsage(String roUsage)
    {
        this.roUsage = roUsage;
    }


    @Override
    public String toString()
    {
        return super.toString() + "reagentsOutputList{" +
                "roId=" + roId +
                ", roUsage='" + roUsage + '\'' +
                '}';
    }
}
