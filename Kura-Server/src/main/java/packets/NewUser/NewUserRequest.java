package packets.NewUser;

import packets.Request;

public class NewUserRequest implements Request {

    String name;

    public NewUserRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDestination() {
        return "newUser";
    }
}
