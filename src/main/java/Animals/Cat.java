package Animals;

public class Cat extends Animal
{
    public String BadHabits;

    public Cat(String name, Gender gender, String badHabits)
    {
        super(name, gender);
        BadHabits = badHabits;
    }

    public String getBadHabits()
    {
        return BadHabits;
    }

    public void setBadHabits(String badHabits)
    {
        BadHabits = badHabits;
    }
}
