import java.util.ArrayList;
import java.util.Date;

public class SportsShow<T extends Player> {

    private String name;
    private Date date;
    private ArrayList<T> participants = new ArrayList<>();

    public SportsShow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPartisipants(ArrayList<T> partisipants) {
        this.participants = partisipants;
    }

    public boolean addPartisipant(T player){
        if (this.participants.contains(player)){
            System.out.println(player.getName() + " has already been added!");
            return false;
        }
        this.participants.add(player);
        System.out.println(player.getName() + " added to show!");
        return true;
    }

    public int sizeOfShow(){
        return participants.size();
    }

    public ArrayList<T> getParticipants() {
        return participants;
    }
}
