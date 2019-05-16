package types;

import main.Animal;
import qualities.Walking;

public class Reptile extends Animal implements Walking
{
    public Reptile()
    {
        super("reptile", "a lot of lizard types");

    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "squeals";
    }
    public String eat()
    {
        return "bugs";
    }
    public String walk() {return "runs climb walks";}


}