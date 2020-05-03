package com.example.third_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private ArrayAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);



        final String[] values = new String[]{"01012", "01013", "01019", "01029", "01039", "01059", "01109", "01112", "01113", "01119", "01121", "01129", "01139", "01211", "01219", "01229", "01231", "01239", "01311", "01319", "01329", "01339", "01341", "01349", "01411", " 01419", " 01421", "01429", "01511", "01519", "01521", "01529", "01541", "01549", "01541", "01559", "01611", "01619"};



        ListView listView = (ListView) v.findViewById(R.id.List_item);
        EditText theFilter = (EditText) v.findViewById(R.id.SearchFilter);



                adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                values



        );

        listView.setAdapter(adapter);


        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                (HomeFragment.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    Intent myintent = new Intent(view.getContext(), Code1.class);
                    startActivityForResult(myintent,01012);
                }
                if (position==1) {
                    Intent myintent = new Intent(view.getContext(), Code2.class);
                    startActivityForResult(myintent, 01013);
                }
                if (position==2) {
                    Intent myintent = new Intent(view.getContext(), Code3.class);
                    startActivityForResult(myintent, 2);
                }
                if (position==3) {
                    Intent myintent = new Intent(view.getContext(), Code4.class);
                    startActivityForResult(myintent, 3);
                }
                if (position==4) {
                    Intent myintent = new Intent(view.getContext(), Code5.class);
                    startActivityForResult(myintent, 4);
                }
                if (position==5) {
                    Intent myintent = new Intent(view.getContext(), Code6.class);
                    startActivityForResult(myintent, 5);
                }
                if (position==6) {
                    Intent myintent = new Intent(view.getContext(), Code7.class);
                    startActivityForResult(myintent, 6);
                }
                if (position==7) {
                    Intent myintent = new Intent(view.getContext(), Code8.class);
                    startActivityForResult(myintent, 7);
                }
                if (position==8) {
                    Intent myintent = new Intent(view.getContext(), Code9.class);
                    startActivityForResult(myintent, 8);
                }
                if (position==9) {
                    Intent myintent = new Intent(view.getContext(), Code10.class);
                    startActivityForResult(myintent, 9);
                }

            }
        });



        return v;
    }
}
