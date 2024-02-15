package com.example.sda_project;

public class Feedback {
    private String FeedBack;
    public Feedback(){FeedBack = null;}
    public Feedback (String FeedBack){this.FeedBack = FeedBack;}

    public boolean setFeedBack(String feedBack) {
        FeedBack = feedBack;
        return true;
    }

    public String getFeedBack() {
        return FeedBack;
    }
}
