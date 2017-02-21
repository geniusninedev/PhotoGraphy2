package nineinfosys.photography.Category;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import nineinfosys.photography.R;


public class Category extends Fragment {


    ListView TutorialList;
    ArrayAdapter<String> adapter;

    String[] TutoriallList = new String[]{"Astrography  Photography",
            "Black & White Photography ",
            "Color Photography",
            "Wedding Photography",
            "Flash Photography",
            "Landscape Photography", "Nature Photography", "Photojournalism", "Panorama Photography", "Social Documentry Photography"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        View v = inflater.inflate(R.layout.activity_category, container, false);

        TutorialList = (ListView) v.findViewById(R.id.tutorials);
        adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_category, R.id.textViewtut, TutoriallList);
        TutorialList.setAdapter(adapter);
        TutorialList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(getActivity(), CategoryDetails.class);
                EnglishBegRef.putExtra("key", position);
                startActivity(EnglishBegRef);

            }
        });
        return  v;
    }


    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser) {
            Activity a = getActivity();
            if(a != null) a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        }
    }

}





