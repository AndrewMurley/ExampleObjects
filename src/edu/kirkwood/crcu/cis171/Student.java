package edu.kirkwood.crcu.cis171;

/**
 * Created by k0765065 on 2/6/2017.
 */
public class Student {
    //public String firstname = "";
    //public String lastname = "";

    private String[] names = new String[2];

    public void setName(String first, String last)
    {
        this.names[0] = first;
        this.names[1] = last;
    }

    public String greet(){
        return "Hi " + names[0];
    }

    public String formalGreet(){
        return "Hello " + names[0] + " " + names[1];
    }
}
