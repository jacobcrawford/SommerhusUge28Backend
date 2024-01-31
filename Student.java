import java.util.ArrayList;

public class Student implements Human {

    private String address;
    private Gender gender;
    private ArrayList<Human> friends;

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }

    @Override
    public ArrayList<Human> getFriends() {
        return this.friends;
    }
    
}
