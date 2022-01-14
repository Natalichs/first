public class Main {

    public static void main(String[] args) {
        Team team = new Team("command", new Member[]{new Member("member1", 20, 15),new Member("member2", 27, 10),new Member("member3", 22, 8),new Member("member4", 19, 12)});
        Course course = new Course(new Obstacle[]{new Obstacle(1,2), new Obstacle(4,5), new Obstacle(20,15)});
        System.out.println(team);
        course.doIt(team);
    }
}
