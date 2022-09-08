package com.example.lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {
    public class MinNum{

    }
    public class MaxNum{

    }
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    /*public void Cypher_correct() {
        Cipher AES = new Cipher ();
        for (int i = 0; i < 10; i++) {
            AES.secret = "Hello" + i;
            assertEquals(message:"Encode", AES.decrypt(AES.encrypt(strToEncrypt:"password")),actual:
            "password");
        }
    }
    @Test public void Cypher_MD5_correct1() {
        assertEquals(message:"Encodel", Cypher.md5(s:"Hel"),actual:
        "6b6e667a40e816c4da7bb4ab64cbb82b");
        assertEquals(message:"Encodel", Cypher.md5(:: "Hello"),acual:
        "8bla9953c4611296a827abf8c47804d7");
        assertEquals(message:"Encodel", Cypher.md5(s:"Hello world"),actual:
        "3e25960a79dbc69b674cd4ec67a72c62");
    }*/
}