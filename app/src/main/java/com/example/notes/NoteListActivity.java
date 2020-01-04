package com.example.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.notes.model.Note;

public class NoteListActivity extends AppCompatActivity {

    private  final String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");

        Note note = new Note("some title", "some content", "some date");
        Note note1 = new Note();
        String title = note.getTitle();
        String content = note.getContent();
        String date = note.getTimeStamp();
    }
}
