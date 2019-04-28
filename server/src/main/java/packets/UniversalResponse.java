package packets;

public class UniversalResponse implements Response {

    private boolean success;

    public UniversalResponse(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
