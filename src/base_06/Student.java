package base_06;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/15  10:09
 **/
public class Student {

    private String userName;

    private String userHeight;

    private String userWeight;

    private String score;



    public static void clean(){
        System.out.println("扫得非常干净");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(String userHeight) {
        this.userHeight = userHeight;
    }

    public String getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(String userWeight) {
        this.userWeight = userWeight;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }
}
