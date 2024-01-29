package fi.tuni.prog3.studentregister;

public class Course
{
    private String code;
    private String name;
    private Integer credits;

    public Course(String code, String name, int credits)
    {
        this.code = code;
        this.name = name;
        this.credits = credits;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    public Integer getCredits()
    {
        return credits;
    }

}
