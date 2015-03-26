


public class Person implements Comparable<Person>
{
    private String name;

    public Person(String name)
    {
        name = this.name;
    }

    public int compareTo(Person other)
    {
        return this.name.compareTo(other.name);
    }

}
