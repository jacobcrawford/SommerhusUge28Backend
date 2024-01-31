import java.util.ArrayList;

public interface Human extends Organism{
    String getAddress();
    Gender getGender();
    ArrayList<Human> getFriends();
}
