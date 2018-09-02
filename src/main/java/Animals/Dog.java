package Animals;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dog extends Animal
{
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public Date LastWalk;
    public boolean NeedsWalk;
//    {
//        get
//        {
//            return (Date today =  - this.LastWalk > 0;
//        )
//    }

    public Dog(String name, Animals.Gender gender)
    {
        super(name, gender);
        //LastWalk = lastWalk;
    }

    //tostring toevoegen
//    public String ToString()
//{
//    return super.ToString() +
//            ", last walk: "+ this.LastWalk.ToShortDateString();
//}
}
