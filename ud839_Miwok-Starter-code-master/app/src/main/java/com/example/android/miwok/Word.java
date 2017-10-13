package com.example.android.miwok;

/**
 * Created by nmatveev on 20.07.2017.
 */
public class Word {
    // word which use local langu
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourseId;
    private int mAudioResourseId;

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourseId=" + mImageResourseId +
                ", mAudioResourseId=" + mAudioResourseId +
                '}';
    }

    public Word (String wordMiwok, String wordDefault, int audioResourse){
        mDefaultTranslation = wordDefault;
        mMiwokTranslation = wordMiwok;
        mAudioResourseId = audioResourse;

    }

    public Word(String wordMiwok,String wordDefault,int imageResourseId,int audioResourse){
        mMiwokTranslation = wordMiwok;
        mDefaultTranslation = wordDefault;
        mImageResourseId = imageResourseId;
        mAudioResourseId = audioResourse;

    }


    public String getMiwokTranslation(){
        return mMiwokTranslation;

    }

    public int getImageResourseId(){
        return mImageResourseId;
    }

    public boolean hasImage(){
        if (mImageResourseId !=0){
            return true;
        }
        return false;
    }

    public String getDefaultTraslation(){
        return mDefaultTranslation;
    }

    public int getAudioResourceId(){
        return mAudioResourseId;
    }
}

