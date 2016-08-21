package com.smartfren.instrat.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.LoginEntity;

import java.util.UUID;

import io.realm.Realm;
import io.realm.RealmResults;

public class NewSurveyFragment extends Fragment {
    private static final String TAG = "NewSurveyFragment";

    private String _title;
    private int _page;

    private View fragmentView;
    private Button _btnNext;
    private Spinner _spQTipeSurvey;
    private Intent _currentIntent;

    private static final String ARG_TITLE = "FRAGMENT_TITLE";
    private static final String ARG_PAGE = "FRAGMENT_PAGE";

    private OnFragmentInteractionListener mListener;

    public NewSurveyFragment() {
        // Required empty public constructor
    }

    public static NewSurveyFragment newInstance(int page, String title) {
        NewSurveyFragment fragment = new NewSurveyFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        fragmentView = inflater.inflate(R.layout.fragment_new_survey, container, false);
        _btnNext = (Button) fragmentView.findViewById(R.id.btnNext);
        _spQTipeSurvey = (Spinner) fragmentView.findViewById(R.id.spQTipeSurvey);
        _currentIntent = getActivity().getIntent();

        _btnNext.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String tipeSurvey = _spQTipeSurvey.getSelectedItem().toString();
                Intent intent = new Intent(getActivity(), Block1Activity.class);

                Realm realm = Realm.getDefaultInstance();
                RealmResults<LoginEntity> loginData = realm.where(LoginEntity.class).findAll();
                LoginEntity loginEntity = loginData.first();

                Bundle extras = _currentIntent.getExtras();
                String deviceSurveyID = UUID.randomUUID().toString();
                intent.putExtra("DeviceSurveyID",deviceSurveyID);
                intent.putExtra("TipeSurvey", tipeSurvey);
                intent.putExtra("UserID", loginEntity.userID);
                intent.putExtra("AccessToken", loginEntity.accessToken);
                startActivity(intent);

            }
        });

        return fragmentView;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            _page = getArguments().getInt(ARG_PAGE);
            _title = getArguments().getString(ARG_TITLE);


        }
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public String getTitle() {
        return _title;
    }
}
