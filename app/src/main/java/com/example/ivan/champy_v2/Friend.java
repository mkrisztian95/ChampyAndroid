package com.example.ivan.champy_v2;

/**
 * Created by ivan on 05.02.16.
 */
public class Friend {
    private String mName;
    private String mPicture;
    private String mID;
    private String mChallenges;
    private String mWins;
    private String mTotal;
    private String mLevel;
   // private List<Friend> friends;

    public String getmChallenges() {
        return mChallenges;
    }

    public void setmChallenges(String mChallenges) {
        this.mChallenges = mChallenges;
    }

    public String getmWins() {
        return mWins;
    }

    public void setmWins(String mWins) {
        this.mWins = mWins;
    }

    public String getmTotal() {
        return mTotal;
    }

    public void setmTotal(String mTotal) {
        this.mTotal = mTotal;
    }

    public String getmLevel() {
        return mLevel;
    }

    public void setmLevel(String mLevel) {
        this.mLevel = mLevel;
    }

    public Friend(String name, String picture, String ID, String challenges, String wins, String total, String level) {
        mName = name;
        mPicture = picture;
        mID = ID;
        mChallenges = challenges;
        mWins = wins;
        mTotal = total;
        mLevel = level;
    }

    public String getName() {
        return mName;
    }

    public String getPicture() {
        return mPicture;
    }

    public String  getID(){ return  mID; }



    public void setID(String id) { mID = id; }

    private static int lastFriendId = 0;

}
