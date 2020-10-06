package com;

import org.junit.Assert;
import org.junit.Test;

public class TweetTest {

    // test adding a letter
    @Test
    public void testAddLetter(){
        Tweet tweet = new Tweet();
        tweet.addLetter('a');
        String expected = "a";
        Assert.assertEquals(expected, tweet.getMessage());
    }

    //test adding multiple letters
    @Test
    public void testAddMultipleLetters(){
        Tweet tweet = new Tweet();
        tweet.addLetter('a');
        tweet.addLetter('b');
        tweet.addLetter('c');
        String expected = "abc";
        Assert.assertEquals(expected, tweet.getMessage());
    }

    // test adding and deleting a letter
    @Test
    public void testAddDeleteLetters(){
        Tweet tweet = new Tweet();
        tweet.addLetter('a');
        tweet.addLetter('b');
        tweet.addLetter('c');
        tweet.deleteLetter();
        String expected = "ab";
        Assert.assertEquals(expected, tweet.getMessage());
    }

    @Test
    public void testMax140(){
        Tweet tweet = new Tweet();
        String testword = "";
        for(int i = 0; i < 140; i++){
            testword += "a";
            tweet.addLetter('a');
        }
        tweet.addLetter('b');
        tweet.addLetter('c');
        Assert.assertEquals(testword, tweet.getMessage());
    }

    // test deleting a letter from empty tweet
    /*
    @Test
    public void testDeleteFromEmpty(){
        Tweet tweet = new Tweet();
        tweet.deleteLetter();
    }*/

    // test if it will reject tweet over 140 characters


}