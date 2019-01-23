package com.udacity.gradle.builditbigger.tasks;
import android.content.Context;
import android.os.AsyncTask;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.backend.myApi.MyApi;
import com.udacity.gradle.builditbigger.interfaces.JokeInterface;
import java.io.IOException;

public class JokeTask extends AsyncTask<Void, Void, String> {

    JokeInterface delegate;
    private static MyApi myApiService = null;

    public JokeTask(JokeInterface delegate){
        this.delegate = delegate;
    }

@Override
    protected String doInBackground(Void... voids) {
        String returnVal = "";

        if(myApiService == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null).setRootUrl("http://10.0.2.2:8080/_ah/api/");
            myApiService = builder.build();
        }
        try {
            returnVal = myApiService.getAJoke().execute().getData();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnVal;
    }

    @Override
    protected void onPostExecute(String joke) {
        if((joke != null) && (!"".equals(joke))){
            delegate.displayJoke(joke);
        }
    }
}
