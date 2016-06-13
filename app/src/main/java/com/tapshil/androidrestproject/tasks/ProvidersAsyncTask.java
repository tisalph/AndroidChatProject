package com.tapshil.androidrestproject.tasks;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.tapshil.androidrestproject.MainActivity;
import com.tapshil.androidrestproject.R;

/**
 * Created by tdesai on 6/6/2016.
 */
public class ProvidersAsyncTask extends AsyncTask<String, Integer, String> {

    private ProgressDialog progDialog;
    private Context context;
    private MainActivity activity;

    ProvidersAsyncTask(MainActivity activity){
        this.activity = activity;
        this.context = activity.getApplicationContext();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
      //  progDialog = ProgressDialog.show(this.activity, "Search", this.context.getResources().getString(R.string.looking_for_tracks) , true, false);
    }

    @Override
    protected String doInBackground(String... params) {
        return null;
    }
}
