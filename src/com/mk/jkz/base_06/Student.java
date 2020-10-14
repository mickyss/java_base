package com.mk.jkz.base_06;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * @Author yanyc
 * @Description //TODO $
 * @Date 2020/3/15  10:09
 **/
public class Student {

    private String userName;

    private String userHeight;

    private String userWeight;

    private Integer score;




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

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
