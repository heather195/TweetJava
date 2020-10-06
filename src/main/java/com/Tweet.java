package com;

public class Tweet {

    /*
    private message:String<br/>
    public addLetter(c:char):void<br/>
    public deleteLetter():void<br/>

    Notes:
    A Tweet has a max character length of 140 characters
     */

    private String message;
    private static final int MAX_TWEET_LENGTH = 140;

    public Tweet() {
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addLetter(char c){
        if(this.message.length() < MAX_TWEET_LENGTH){
            setMessage(this.message + c);
        } else {
            System.out.println("Tweet too long!");
        }

    }

    public void deleteLetter(){
        setMessage((this.message).substring(0, (this.message).length()-1));
    }
}
