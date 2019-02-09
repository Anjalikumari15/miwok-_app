package com.example.android.miwok;

/**
 * Created by ANJALI KUMARI on 01-10-2018.
 */

public class     Word {
    private String defaultTranslation;
    private String mivokTranslation;
    private final int NO_IMAGE_RESOURCE=-1;
    private int mResourceId=NO_IMAGE_RESOURCE;
    private int mAudioID;
    public Word(String miv_translation, String def_translation, int audioid)
    {
        defaultTranslation = def_translation;
        mivokTranslation = miv_translation;
        mAudioID = audioid;
    }
    public Word(String miv_translation, String def_translation, int resId,int audioid)
    {
        defaultTranslation = def_translation;
        mivokTranslation = miv_translation;
        mResourceId = resId;
        mAudioID = audioid;
    }
    public String getDefaultTranslation()
    {
        return defaultTranslation;
    }
    public String getMivokTranslation()
    {
        return mivokTranslation;
    }
    public int getResource_id() { return mResourceId;  }
    public boolean hasImage()
    {
        return mResourceId != NO_IMAGE_RESOURCE;
    }
    public int getAudioID() { return mAudioID; }
}
