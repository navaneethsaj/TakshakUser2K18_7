package takshak.mace.takshak2k18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RegisteredEvents extends AppCompatActivity {
    ArrayList<String> eventList;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registered_events);

        eventList = new ArrayList<>();
        eventList.add("event1");
        eventList.add("event2");
        eventList.add("event3");
        eventList.add("event4");

        listView = findViewById(R.id.eventlistview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_view, R.id.textviewMy, eventList);
        listView.setAdapter(arrayAdapter);

    }
}
