package com.example.mahiro.cs273superheroes;

/**
 * Created by Mahiro on 2016/10/09.
 */

public class SuperHeroes {
    private String mUsername;
    private String mName;
    private String mSuperpower;
    private String mOneThing;
    private String mImageName;

    public SuperHeroes() {
        mUsername = "";
        mName = "";
        mSuperpower = "";
        mOneThing = "";
        mImageName = "";

    }

    public String getUsername() {
        return mUsername;
    }

    public void setUsername(String username) {
        mUsername = username;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getSuperpower() {
        return mSuperpower;
    }

    public void setSuperpower(String superpower) {
       mSuperpower = superpower;
    }

    public String getOneThing() {
        return mOneThing;
    }

    public void setOnething(String onething) {
        mOneThing = onething;
    }

    public String getImageName() {
        return mImageName;
    }

    public void setImageName(String imageName) {
        mImageName = imageName;
    }
}
