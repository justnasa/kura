package data;

public enum TeamEnum {
    CHICKEN(true,"CHICKEN"),
    EGG(false,"EGG");

    private boolean team;
    private String name;

    public boolean getTeam() {
        return team;
    }

    public String getName() {
        return name;
    }

    TeamEnum(boolean team, String name) {
        this.team = team;
        this.name = name;
    }
}
