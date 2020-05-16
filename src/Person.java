public class Person {
    private String name;
    private String lastName;
    private String tcNo;
    private String motherland;

    public Person() {

    }

    public String getName(){return name;}

    public boolean setName(String name)
    {
        boolean res = false;
        if(this.name == null && name.startsWith("A")){
            this.name = name;
            res = true;
        }
        return res;
    }

    public String getLastName(){return name;}

    public boolean setLastName(String lname)
    {
        boolean res = false;
        if(lname.startsWith("Z")){
            this.lastName = lname;
            res = true;
        }
        return res;
    }

    public String getTC(){return name;}

    public boolean setTC(String tc)
    {
        boolean res = false;
        if(tc.endsWith("2")){
            this.tcNo = tc;
            res = true;
        }else if(tc.endsWith("4")){
            this.tcNo = tc;
            res = true;
        }
        return res;
    }

    public String getMotherLand(){return name;}

    public boolean setMotherLand(String ml)
    {
        boolean res = false;
        if(ml.endsWith("Izmir")){
            this.motherland = ml;
            res = true;
        }
        return res;
    }

}