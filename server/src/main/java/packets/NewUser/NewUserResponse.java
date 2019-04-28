package packets.NewUser;

import packets.Response;

public class NewUserResponse implements Response {

    private int id;
    private boolean team;

    public NewUserResponse(int id, boolean team) {
        this.id = id;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTeam() {
        return team;
    }

    public void setTeam(boolean team) {
        this.team = team;
    }
}
