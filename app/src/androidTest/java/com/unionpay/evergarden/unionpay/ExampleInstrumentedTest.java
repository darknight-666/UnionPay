package com.unionpay.evergarden.unionpay;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.unionpay.evergarden.unionpay.com.unionpay.evergarden.socket.Message.AIDIndexSock;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {



    @Test
    public void sock(){
        System.out.println("999999");
        AIDIndexSock aidIndexSock=new AIDIndexSock();
        aidIndexSock.Sock();
    }
}
