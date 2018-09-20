public class Main {

    public static void main(String[] args){
        FootballPlayer brian = new FootballPlayer("Brian Ma");
        FootballPlayer shelby = new FootballPlayer("Shelby Stanton");
        BaseballPlayer matt = new BaseballPlayer("Matt Watson");
        SoccerPlayer ryan = new SoccerPlayer("Ryan Stockwell");

        SportsShow<FootballPlayer> footballShow = new SportsShow<>("Bletchley Road Massive");
        footballShow.addPartisipant(brian);
        footballShow.addPartisipant(shelby);
        //Following lines won't work due to generics enforcing correct type when making a show.
        //footballShow.addPartisipant(matt);
        //footballShow.addPartisipant(ryan);

        SportsShow<BaseballPlayer> baseballShow = new SportsShow<>("Bletchly Wackers");

        SportsShow<SoccerPlayer> soccerShow = new SportsShow<>("Bletchly Goals");

        baseballShow.addPartisipant(matt);

        System.out.println("The size of the football show is " + Integer.toString(footballShow.sizeOfShow()));

        for (Player p : footballShow.getParticipants()){
            System.out.println(p.getName() + " is in the show hoorarr!!");
        }

        System.out.println("The size of the baseball show is " + Integer.toString(baseballShow.sizeOfShow()));

        for (Player p : baseballShow.getParticipants()){
            System.out.println(p.getName() + " is in the show hoorarr!!");
        }

        System.out.println("The size of the soccer show is " + Integer.toString(soccerShow.sizeOfShow()));

        for (Player p : soccerShow.getParticipants()){
            System.out.println(p.getName() + " is in the show hoorarr!!");
        }

    }
}
