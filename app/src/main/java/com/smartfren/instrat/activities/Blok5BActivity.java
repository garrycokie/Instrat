package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.smartfren.instrat.R;

public class Blok5BActivity extends BaseStepsActivity {
    private Spinner _spQ57A;
    private Spinner _spQ58A;
    private Spinner _spQ59A;
    private Spinner _spQ60A;
    private Spinner _spQ60BA;
    private Spinner _spQ60CA;
    private Spinner _spQ61A;
    private Bundle extras;

    public int SetSelectedSpinner(ArrayAdapter<CharSequence> adapter, String value)
    {
        if (!value.equals(null)) {
            int spinnerPosition = adapter.getPosition(value);
            return spinnerPosition;
        }
        else
        {
            return 0;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_blok5b);
        extras = getIntent().getExtras();

        _spQ57A = (Spinner) findViewById(R.id.spQ57A);
        _spQ58A = (Spinner) findViewById(R.id.spQ58A);
        _spQ59A = (Spinner) findViewById(R.id.spQ59A);
        _spQ60A = (Spinner) findViewById(R.id.spQ60A);
        _spQ60BA = (Spinner) findViewById(R.id.spQ60BA);
        _spQ60CA = (Spinner) findViewById(R.id.spQ60CA);
        _spQ61A = (Spinner) findViewById(R.id.spQ61A);

        ArrayAdapter<CharSequence> adapterQ57 = ArrayAdapter.createFromResource(this, R.array.page_blok5_q57A_list, R.layout.spinner_item);
        adapterQ57.setDropDownViewResource(R.layout.spinner_item);
        _spQ57A.setAdapter(adapterQ57);

        if(extras.getString("NO_57") != null)
        {
            int position = SetSelectedSpinner(adapterQ57, extras.getString("NO_57"));
            if(position > 0) {
                _spQ57A.setSelection(position);
            }
        }

        ArrayAdapter<CharSequence> adapterQBlok5 = ArrayAdapter.createFromResource(this, R.array.page_blok5_produkterlihat_list, R.layout.spinner_item);
        adapterQBlok5.setDropDownViewResource(R.layout.spinner_item);
        _spQ58A.setAdapter(adapterQBlok5);
        _spQ59A.setAdapter(adapterQBlok5);
        _spQ60A.setAdapter(adapterQBlok5);
        _spQ60BA.setAdapter(adapterQBlok5);
        _spQ60CA.setAdapter(adapterQBlok5);

        if(extras.getString("NO_58") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_58"));
            if(position > 0) {
                _spQ58A.setSelection(position);
            }
        }

        if(extras.getString("NO_59") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_59"));
            if(position > 0) {
                _spQ59A.setSelection(position);
            }
        }

        if(extras.getString("NO_60") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_60"));
            if(position > 0) {
                _spQ60A.setSelection(position);
            }
        }

        if(extras.getString("NO_60B") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_60B"));
            if(position > 0) {
                _spQ60BA.setSelection(position);
            }
        }

        if(extras.getString("NO_60C") != null)
        {
            int position = SetSelectedSpinner(adapterQBlok5, extras.getString("NO_60C"));
            if(position > 0) {
                _spQ60CA.setSelection(position);
            }
        }

        ArrayAdapter<CharSequence> adapterQ61 = ArrayAdapter.createFromResource(this, R.array.page_blok5_q61A_list, R.layout.spinner_item);
        adapterQ61.setDropDownViewResource(R.layout.spinner_item);
        _spQ61A.setAdapter(adapterQ61);

        if(extras.getString("NO_61") != null)
        {
            int position = SetSelectedSpinner(adapterQ61, extras.getString("NO_61"));
            if(position > 0) {
                _spQ61A.setSelection(position);
            }
        }

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                Intent intent = new Intent(Blok5BActivity.this, Blok5AActivity.class);
                intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                intent.putExtra("UserID", extras.getString("UserID"));
                intent.putExtra("AccessToken", extras.getString("AccessToken"));
                intent.putExtra("NO_1", extras.getString("NO_1"));
                intent.putExtra("NO_2", extras.getString("NO_2"));
                intent.putExtra("NO_3", extras.getString("NO_3"));
                intent.putExtra("NO_4", extras.getString("NO_4"));
                intent.putExtra("NO_5", extras.getString("NO_5"));
                intent.putExtra("NO_6", extras.getString("NO_6"));
                intent.putExtra("NO_7", extras.getString("NO_7"));
                intent.putExtra("NO_8", extras.getString("NO_8"));
                intent.putExtra("NO_9", extras.getString("NO_9"));
                intent.putExtra("NO_10", extras.getString("NO_10"));
                intent.putExtra("NO_11", extras.getString("NO_11"));
                intent.putExtra("NO_12", extras.getString("NO_12"));
                intent.putExtra("NO_13", extras.getString("NO_13"));
                intent.putExtra("NO_14", extras.getString("NO_14"));
                intent.putExtra("NO_15", extras.getString("NO_15"));
                intent.putExtra("NO_16", extras.getString("NO_16"));
                intent.putExtra("NO_17", extras.getString("NO_17"));
                intent.putExtra("NO_18", extras.getString("NO_18"));
                intent.putExtra("NO_19", extras.getString("NO_19"));
                intent.putExtra("NO_20", extras.getString("NO_20"));
                intent.putExtra("NO_21", extras.getString("NO_21"));
                intent.putExtra("NO_22", extras.getString("NO_22"));
                intent.putExtra("NO_23", extras.getString("NO_23"));
                intent.putExtra("NO_24", extras.getString("NO_24"));
                intent.putExtra("NO_25", extras.getString("NO_25"));
                intent.putExtra("NO_26", extras.getString("NO_26"));
                intent.putExtra("NO_27", extras.getString("NO_27"));
                intent.putExtra("NO_28", extras.getString("NO_28"));
                intent.putExtra("NO_29", extras.getString("NO_29"));
                intent.putExtra("NO_30", extras.getString("NO_30"));
                intent.putExtra("NO_31", extras.getString("NO_31"));
                intent.putExtra("NO_32", extras.getString("NO_32"));
                intent.putExtra("NO_33", extras.getString("NO_33"));
                intent.putExtra("NO_34", extras.getString("NO_34"));
                intent.putExtra("NO_35", extras.getString("NO_35"));
                intent.putExtra("NO_36", extras.getString("NO_36"));
                intent.putExtra("NO_38", extras.getString("NO_38"));
                intent.putExtra("NO_39", extras.getString("NO_39"));
                intent.putExtra("NO_40", extras.getString("NO_40"));
                intent.putExtra("NO_41", extras.getString("NO_41"));
                intent.putExtra("NO_42", extras.getString("NO_42"));
                intent.putExtra("NO_43", extras.getString("NO_43"));
                intent.putExtra("NO_44", extras.getString("NO_44"));
                intent.putExtra("NO_45", extras.getString("NO_45"));
                intent.putExtra("NO_46", extras.getString("NO_46"));
                intent.putExtra("NO_47", extras.getString("NO_47"));
                intent.putExtra("NO_48", extras.getString("NO_48"));
                intent.putExtra("NO_49", extras.getString("NO_49"));
                intent.putExtra("NO_50", extras.getString("NO_50"));
                intent.putExtra("NO_51", extras.getString("NO_51"));
                intent.putExtra("NO_52", extras.getString("NO_52"));
                intent.putExtra("NO_52B", extras.getString("NO_52B"));
                intent.putExtra("NO_52C", extras.getString("NO_52C"));
                intent.putExtra("NO_52D", extras.getString("NO_52D"));
                intent.putExtra("NO_52E", extras.getString("NO_52E"));
                intent.putExtra("NO_53", extras.getString("NO_53"));
                intent.putExtra("NO_54", extras.getString("NO_54"));
                intent.putExtra("NO_55", extras.getString("NO_55"));
                intent.putExtra("NO_56", extras.getString("NO_56"));
                startActivity(intent);
            }

            @Override
            public void onContinueClicked() {
                String A57 = _spQ57A.getSelectedItem().toString();
                String A58 = _spQ58A.getSelectedItem().toString();
                String A59 = _spQ59A.getSelectedItem().toString();
                String A60 = _spQ60A.getSelectedItem().toString();
                String A60B = _spQ60BA.getSelectedItem().toString();
                String A60C = _spQ60CA.getSelectedItem().toString();
                String A61 = _spQ61A.getSelectedItem().toString();

                Intent intent = new Intent(Blok5BActivity.this, Blok6Activity.class);
                intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                intent.putExtra("UserID", extras.getString("UserID"));
                intent.putExtra("AccessToken", extras.getString("AccessToken"));
                intent.putExtra("NO_1", extras.getString("NO_1"));
                intent.putExtra("NO_2", extras.getString("NO_2"));
                intent.putExtra("NO_3", extras.getString("NO_3"));
                intent.putExtra("NO_4", extras.getString("NO_4"));
                intent.putExtra("NO_5", extras.getString("NO_5"));
                intent.putExtra("NO_6", extras.getString("NO_6"));
                intent.putExtra("NO_7", extras.getString("NO_7"));
                intent.putExtra("NO_8", extras.getString("NO_8"));
                intent.putExtra("NO_9", extras.getString("NO_9"));
                intent.putExtra("NO_10", extras.getString("NO_10"));
                intent.putExtra("NO_11", extras.getString("NO_11"));
                intent.putExtra("NO_12", extras.getString("NO_12"));
                intent.putExtra("NO_13", extras.getString("NO_13"));
                intent.putExtra("NO_14", extras.getString("NO_14"));
                intent.putExtra("NO_15", extras.getString("NO_15"));
                intent.putExtra("NO_16", extras.getString("NO_16"));
                intent.putExtra("NO_17", extras.getString("NO_17"));
                intent.putExtra("NO_18", extras.getString("NO_18"));
                intent.putExtra("NO_19", extras.getString("NO_19"));
                intent.putExtra("NO_20", extras.getString("NO_20"));
                intent.putExtra("NO_21", extras.getString("NO_21"));
                intent.putExtra("NO_22", extras.getString("NO_22"));
                intent.putExtra("NO_23", extras.getString("NO_23"));
                intent.putExtra("NO_24", extras.getString("NO_24"));
                intent.putExtra("NO_25", extras.getString("NO_25"));
                intent.putExtra("NO_26", extras.getString("NO_26"));
                intent.putExtra("NO_27", extras.getString("NO_27"));
                intent.putExtra("NO_28", extras.getString("NO_28"));
                intent.putExtra("NO_29", extras.getString("NO_29"));
                intent.putExtra("NO_30", extras.getString("NO_30"));
                intent.putExtra("NO_31", extras.getString("NO_31"));
                intent.putExtra("NO_32", extras.getString("NO_32"));
                intent.putExtra("NO_33", extras.getString("NO_33"));
                intent.putExtra("NO_34", extras.getString("NO_34"));
                intent.putExtra("NO_35", extras.getString("NO_35"));
                intent.putExtra("NO_36", extras.getString("NO_36"));
                intent.putExtra("NO_38", extras.getString("NO_38"));
                intent.putExtra("NO_39", extras.getString("NO_39"));
                intent.putExtra("NO_40", extras.getString("NO_40"));
                intent.putExtra("NO_41", extras.getString("NO_41"));
                intent.putExtra("NO_42", extras.getString("NO_42"));
                intent.putExtra("NO_43", extras.getString("NO_43"));
                intent.putExtra("NO_44", extras.getString("NO_44"));
                intent.putExtra("NO_45", extras.getString("NO_45"));
                intent.putExtra("NO_46", extras.getString("NO_46"));
                intent.putExtra("NO_47", extras.getString("NO_47"));
                intent.putExtra("NO_48", extras.getString("NO_48"));
                intent.putExtra("NO_49", extras.getString("NO_49"));
                intent.putExtra("NO_50", extras.getString("NO_50"));
                intent.putExtra("NO_51", extras.getString("NO_51"));
                intent.putExtra("NO_52", extras.getString("NO_52"));
                intent.putExtra("NO_52B", extras.getString("NO_52B"));
                intent.putExtra("NO_52C", extras.getString("NO_52C"));
                intent.putExtra("NO_52D", extras.getString("NO_52D"));
                intent.putExtra("NO_52E", extras.getString("NO_52E"));
                intent.putExtra("NO_53", extras.getString("NO_53"));
                intent.putExtra("NO_54", extras.getString("NO_54"));
                intent.putExtra("NO_55", extras.getString("NO_55"));
                intent.putExtra("NO_56", extras.getString("NO_56"));
                intent.putExtra("NO_57", A57);
                intent.putExtra("NO_58", A58);
                intent.putExtra("NO_59", A59);
                intent.putExtra("NO_60", A60);
                intent.putExtra("NO_60B", A60B);
                intent.putExtra("NO_60C", A60C);
                intent.putExtra("NO_61", A61);
                startActivity(intent);
            }
        });
    }
}
