package com.example.android.miwok;

import java.util.ArrayList;
import java.util.jar.Attributes;
import java.lang.Object;
/**
 * Created by nmatveev on 28.08.2017.
 */

public class ReportCard {
    private String mName;
    private String mMathGrade;
    private String mEnglishGrade;
    private String mBiologyGrade;



    public ReportCard(String name,int mathGrade,int englishGrade,int biologyGrade){
        mName = name;
        mMathGrade = String.valueOf(mathGrade);
        mEnglishGrade = String.valueOf(englishGrade);
        mBiologyGrade = String.valueOf(biologyGrade);

    }

    public String getMathGrade(){
        return mMathGrade;
    }

    public String getEngGrade(){
        return mEnglishGrade;
    }

    public String getBioGrade(){
        return mBiologyGrade;
    }

    public void setEngGrade(int grade){
        mEnglishGrade = String.valueOf(grade);
    }

    public void setBioGrade(int grade){
        mBiologyGrade = String.valueOf(grade);
    }


    public void setMathGrade(int grade){
        mMathGrade = String.valueOf(grade);
    }


    @Override
    public String toString() {
        //Your code here!  Return a representation of
        //the report card rather than the empty string
       String reportCard = "Name:" +mName + "; " + "Mathematics grade:" + mMathGrade + "; " + "English grade:" + mEnglishGrade + "; " + "Biology grade:" + mBiologyGrade + ";";

        return reportCard;
    }
}
