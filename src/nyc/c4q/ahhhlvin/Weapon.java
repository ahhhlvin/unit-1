package nyc.c4q.ahhhlvin;
import java.util.ArrayList;

/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public abstract class Weapon extends Character
{

    ArrayList<String> weapons = new ArrayList<String>();


    public Weapon()
    {
        weapons.add("hands");
    }


    public ArrayList<String> getWeapon()
    {
        return weapons;
    }

    public ArrayList<String> addWeapon(String weapon) {
        weapons.add(weapon);
        return weapons;
    }


}
