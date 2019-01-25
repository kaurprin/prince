package studentlist;

public class Student {
 
    private String name;
    private int id;
   private String DOB;
    
   
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
        name = givenName;
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

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }
            
    
}
