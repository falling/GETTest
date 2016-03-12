package bean;

/**
 * Created by falling on 2016/3/11.
 */
public class OrderBean {
    private int order_id;          //单号id
    private int release_user_id;   //发布人ID
    private String time;           //发布时间
    private String location;       //交任务地点
    private String content;        //任务内容
    private String lable;          //任务标签（跑腿，代买。。。）
    private double tip;            // 小费
    private int acceptance_user_id;//接单人ID
    private int score;             //评分
    private String state;          //状态

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getRelease_user_id() {
        return release_user_id;
    }

    public void setRelease_user_id(int release_user_id) {
        this.release_user_id = release_user_id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public int getAcceptance_user_id() {
        return acceptance_user_id;
    }

    public void setAcceptance_user_id(int acceptance_user_id) {
        this.acceptance_user_id = acceptance_user_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
