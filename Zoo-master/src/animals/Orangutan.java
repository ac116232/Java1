package animals;


import types.Primate;

/**
 * Write a description of class animals.Orangutan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    // instance variables - replace the example below with your own
    private String age;

    /**
     * Constructor for objects of class animals.Orangutan
     */
    public Orangutan()
    {
        super("animals.Orangutan", "brown and sometimes mean");
        this.age = "very young";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     *
     */
    @Override
    public String makeNoise()
    {
        // put your code here
        return "screetches and throws feces.";
    }
}