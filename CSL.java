public class CSL implements Football {
    private String homeTeamName;
    public int homeScored;
    private String visitingTeamName;
    private int visitingScored;
    private int quarter;

    public void setHomeTeam(String name) {
        this.homeTeamName = name;
    }

    public String getHomeTeam() {
        return this.homeTeamName;
    }

    public void setVisitingTeam(String name) {
        this.visitingTeamName = name;
    }

    public String getVisitingTeam() {
        return this.visitingTeamName;
    }

    public void setHomeScored(int points) {
        this.homeScored = points;
    }

    public int getHomeScored() {
        return this.homeScored;
    }

    public void setVisitingScored(int points) {
        this.visitingScored = points;
    }
    
    public int getVisitingScored() {
        return this.visitingScored;
    }

    public void endofQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getEndofQuarter() {
        return this.quarter;
    }

    public static void main(String[] args) {
        CSL c = new CSL();
        c.setHomeTeam("辽宁");
        c.setVisitingTeam("北京");
        c.setHomeScored(2);
        c.setVisitingScored(1);
        c.endofQuarter(2);
        System.out.println(c.getHomeTeam() + " " + c.getVisitingTeam() + " " + c.getHomeScored() + " " + c.getVisitingScored() + " " + c.getEndofQuarter());
    }

}