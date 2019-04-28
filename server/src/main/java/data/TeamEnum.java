package data;

public enum TeamEnum {
    CHICKEN(true),
    EGG(false);

    private boolean team;

    public boolean getTeam() {
        return team;
    }

    TeamEnum(boolean team) {
        this.team = team;
    }
}
