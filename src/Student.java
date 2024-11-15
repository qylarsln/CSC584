
/**
 * Write a description of class Student here.
 * 
 * @author Zulaile Mabni 
 * @version (a version number or a date)
 */
class Student {
  private String name,status;
    private int studId;
    private int part;
    private double score;

    public Student ()
    {
        name = "";
        studId = 1;
        part = 1;
        score = 0;
        
    }

    public Student ( String nm, int sid, int pt, double sc)
    {
        name = nm;
        studId = sid;
        part = pt;
        score = sc;
    }

    public void setStudent ( String nm, int sid, int pt, double sc)
    {
        name = nm;
        studId = sid;
        part = pt;
        score = sc;
    }

    public String toString()
    {
        return "\nName : " + name +
        "\nStudent ID :  " + studId + 
        "\nPArt : " + part + "\nScore : " + score;
        
    }
    
    public String getName() { return name; }
    public int getStudId()      { return studId; }
    public int getPart()        { return part; }
    public double getScore()     { return score; }
    
    public double totalScore;
    public int age;
    public String noIC;
}
