package com.example.android.dotainfo;

public class Dotamatches {
    private Long mMatchid;

    private Integer mDuration;

    private Integer mRadiantTeamId;

    private String mRadiantName;

    private Integer mDireTeamId;

    private String mDireName;

    private Integer mRadiantScore;

    private Integer mDireScore;

    private Boolean mRadiantWin;

    public Dotamatches(Long matchid, Integer duration, Integer radiantTeamId,
                       String radiantName, Integer direTeamId, String direName,
                       Integer radiantScore, Integer direScore, Boolean radiantWin) {

        mMatchid = matchid;
        mDuration = duration;
        mRadiantTeamId = radiantTeamId;
        mRadiantName = radiantName;
        mDireTeamId = direTeamId;
        mDireName = direName;
        mRadiantScore = radiantScore;
        mDireScore = direScore;
        mRadiantWin = radiantWin;

    }

    public Long getMatchid()                 {return mMatchid;}

    public Integer getRadiantTeamId()           {return mRadiantTeamId;}

    public Integer getDuration()                {return mDuration;}

    public String  getRadiantName()             {return mRadiantName;}

    public String getDireName()                 {return mDireName;}

    public Integer getDireTeamId()              {return mDireTeamId;}

    public Integer getRadiantScore()            {return mRadiantScore;}

    public Integer getDireScore()              {return mDireScore;}

    public Boolean getRadiantWin()             {return mRadiantWin;}



}
