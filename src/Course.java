public class Course {
    private Obstacle[] course;

    public Course(Obstacle[] course) {
        this.course = course;
    }

    public void doIt(Team team){
        Member[] members = team.getTeam();
        for(Member m: members) {
            int i =0;
            for (Obstacle o : course){
                if (m.run(o.getD())&&m.jump(o.getH())){
                    i++;
                }
            }
            if (i>=course.length)
                System.out.println(m +" прошел дистанцию");
        }
    }

}
