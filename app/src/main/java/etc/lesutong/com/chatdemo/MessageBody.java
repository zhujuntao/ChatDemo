package etc.lesutong.com.chatdemo;

public class MessageBody {

    public static final int TYPE_RECEIVE=0;//接收消息
    public static final int TYPE_SEND=1;//发送消息

    private String content;

    private int type;

    public MessageBody(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public static int getTypeReceive() {
        return TYPE_RECEIVE;
    }

    public static int getTypeSend() {
        return TYPE_SEND;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
