package exercise;

public class Person {
    public int id;
    public String name;
    public String family;
    public String toString(){
        return String.format("%10s  %10s" , name, family);
    }
}
