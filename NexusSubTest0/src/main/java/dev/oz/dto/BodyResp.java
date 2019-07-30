package dev.oz.dto;

public class BodyResp {
    Body body;
    int status;

    public BodyResp(Body body, int status) {
        this.body = body;
        this.status = status;
    }

    @Override
    public String toString() {
        return "BodyResp{" +
                "body=" + body +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
