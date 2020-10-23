package com.example.android.anglaisapp;

/**
 *{@Link Word} represents a vocabulary word that the user wants to learn. It contains default translation
 * a Miwok translation for that word
 */

public class Word {

/**English word **/
    private String mEnglishWord;

    /**English explanation for the word**/
    private String mEnglishExplanation;

    /**English example of the word**/
    private String mEnglishExample;

    private int mPronounciationId;



    /**ImageResource id**/
    private int mImageResourceId;
    public Word(String EnglishWord, String EnglishExplanation, String EnglishExample, int ImageResourceId, int PronounciationId)
    {
        mEnglishWord =EnglishWord;
        mEnglishExplanation = EnglishExplanation;
        mEnglishExample=EnglishExample;
      mImageResourceId=ImageResourceId;
      mPronounciationId=PronounciationId;


    }

    /**get Defaulttranslation for the word**/

    public String getEnglishWord(){

        return mEnglishWord;
    }

    /**get Miwoktranslation for the word**/

    public String getEnglishExplanation(){
        return mEnglishExplanation;
    }

    public String getEnglishExample(){
        return mEnglishExample;
    }
   public int getImageResourceId(){
        return mImageResourceId;
   }

    @Override
    public String toString() {
        return "Word{" +
                "mEnglishWord='" + mEnglishWord + '\'' +
                ", mEnglishExplanation='" + mEnglishExplanation + '\'' +
                ", mEnglishExample='" + mEnglishExample + '\'' +
                ", mPronounciationId=" + mPronounciationId +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }

    public int getPronounciationId(){
       return mPronounciationId;
}


}
