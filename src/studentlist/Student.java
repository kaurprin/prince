package studentlist;

public class Student {
 
    private String name;
    private int id;
    
   
    public Student()
    {
           this.name = "Not Set";
           this.id =0;
    }
    public Student(String givenName, int givenId)
    {
        this.name = givenName;
        this.id = givenId;
    }
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    public String getName()
    {
           return this.name;
    }
    
    public void setId(int givenId)
    {
        this.id = givenId;
    }
    public int getId()
    {
           return this.id;
    }
            
    
}
