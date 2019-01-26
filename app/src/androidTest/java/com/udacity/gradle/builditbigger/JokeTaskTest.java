package com.udacity.gradle.builditbigger;

import com.udacity.gradle.builditbigger.interfaces.JokeInterface;
import com.udacity.gradle.builditbigger.tasks.JokeTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.runner.AndroidJUnit4;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertFalse;

@RunWith(AndroidJUnit4.class)
public class JokeTaskTest {

    @Test
    public void TestJokeTask() throws ExecutionException, InterruptedException {

        String joke = new JokeTask(new JokeInterface() {
            @Override
            public void displayJoke(String joke) {

            }
        }).execute().get();

        assertFalse ("".equals(joke));
    }
}
