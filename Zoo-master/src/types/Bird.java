package types;

import main.Animal;
import qualities.Flying;


public class Bird extends Animal implements Flying
{
    public Bird()
    {
        super("primate", "a lot of monkey types");

    }
    public Bird(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "hoots";
    }
    public String eat()
    {
        return "bananas";
    }
    public String fly() {
        return "runs climb walks";
    }

}

