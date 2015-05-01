package nyc.c4q.ahhhlvin;
/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public abstract class Character implements Attributes
{

    private int HP;
    private String name;
    private String specialty;

    public Character()
    {
    }

    public Character(int HP, String name, String specialty)
    {
        this.HP = HP;
        this.name = name;
        this.specialty = specialty;

    }


    public int getHP()
    {
        return HP;
    }

    public void setHP(int HP)
    {
        this.HP = HP;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSpecialty()
    {
        return specialty;
    }

    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    @Override
    public String getKillAbility()
    {
        return null;
    }
}
