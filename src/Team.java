import java.util.Arrays;

public class Team {
    private String nameTeam;
    private Member[] team;

    public Team(String nameTeam, Member[] team) {
        this.nameTeam = nameTeam;
        //team = new Member[]{new Member("member1", 20, 15),new Member("member2", 27, 10),new Member("member3", 22, 8),new Member("member4", 19, 12)}
        this.team = team;
    }
     public void memberEndDistance(Obstacle c){
        for(Member m :team){
            if(m.run(c.getD())&&m.jump(c.getH()))
                System.out.println(m+ " прошел дистанцию "+ c);
            else
                System.out.println(m+ " не прошел дистанцию "+ c);
        }
     }

    public Member[] getTeam() {
        return team;
    }

    public void setTeam(Member[] team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Team{" +
                "nameTeam='" + nameTeam + '\'' +
                ", team=" + Arrays.toString(team) +
                '}';
    }
}
