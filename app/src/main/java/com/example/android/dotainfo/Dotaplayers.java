package com.example.android.dotainfo;

public class Dotaplayers{

    private int mAccountId;

    private String mSteamid;

    private String mAvatar;

    //private String mAvatarmedium;

    //private String mAvatarfull;

    private String mProfileurl;

    private String mPersonaname;

    //private String mLastLogin;

    //private String mFullHistoryTime;

    //private Integer mCheese;

    //private Boolean mFhUnavailable;

    private String mLoccountrycode;

    private String mName;


    //private Integer mFantasyRole;

    //private Integer mTeamId;

    private String mTeamName;

    //private String mTeamTag;

    //private Boolean mIsLocked;

    private boolean mIsPro;

    //private Integer mLockedUntil;



    public Dotaplayers(int accountId, String steamid, String avatar, String profileurl, String personaname,
                       String loccountrycode, String name,   String teamName, boolean isPro) {

        mAccountId= accountId;
        mSteamid=steamid ;
        mAvatar=avatar ;
        //mAvatarmedium=avatarmedium ;
        //mAvatarfull=avatarfull ;
        mProfileurl=profileurl ;
        mPersonaname=personaname ;
        //mLastLogin=lastLogin ;
        //mFullHistoryTime=fullHistoryTime ;
        //mCheese=cheese ;
        //mFhUnavailable= fhUnavailable;
        mLoccountrycode=loccountrycode ;
        mName= name;

        //mFantasyRole= fantasyRole;
        //mTeamId= teamId;
        mTeamName=teamName ;
        //mTeamTag=teamTag ;
        //mIsLocked=isLocked ;
        mIsPro=isPro ;
        //mLockedUntil= lockedUntil;

    }

    public Integer getAccountId()             {return mAccountId;}

    public String getSteamid()                {return mSteamid;}

    public String getAvatar()                 {return mAvatar;}

    //public String getAvatarmedium()           {return mAvatarmedium;}

    //public String getAvatarfull()             {return mAvatarfull;}

    public String getProfileurl()             {return mProfileurl;}

    public String getPersonaname()            {return mPersonaname;}

    //public String getLastLogin()              {return mLastLogin;}

    //public String getFullHistoryTime()        {return mFullHistoryTime;}

    //public Integer getCheese()                {return mCheese;}

    //public Boolean getFhUnavailable()         {return mFhUnavailable;}

    public String getLoccountrycode()         {return mLoccountrycode;}

    public String getName()                   {return mName;}



    //public Integer getFantasyRole()               {return mFantasyRole;}

    //public Integer getTeamId()                    {return mTeamId;}

    public String getTeamName()               {return mTeamName;}

    //public String getTeamTag()                {return mTeamTag;}

    //public Boolean getIsLocked()               {return mIsLocked;}

    public Boolean getIsPro()                  {return mIsPro;}

   // public Integer getLockedUntil()               {return mLockedUntil;}



}