package com.hikingweatherapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link routesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class routesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public routesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment routesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static routesFragment newInstance(String param1, String param2) {
        routesFragment fragment = new routesFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_routes, container, false);

        // spinner functionality
        Spinner spinner = v.findViewById(R.id.which_routes);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        getActivity().getApplicationContext(),
                        R.array.choose_shown_routes,
                        android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(
                android.R.layout.simple_spinner_item);

        spinner.setAdapter(adapter);

        // Respond to item selection in the spinner
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedValue = (String) parent.getItemAtPosition(position);

                // Perform actions based on the selected value
                switch (selectedValue) {
                    case "recentRoutes":
                        // Do something for Value 1
                        break;
                    case "Value 2":
                        // Do something for Value 2
                        break;
                    // Add more cases as needed for other values
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // Handle situation when nothing is selected
            }
        });

    // Return inflate layout
        return v;

    }



}