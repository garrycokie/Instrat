package com.smartfren.instrat.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.LoginEntity;
import com.smartfren.instrat.entities.SurveyEntity;
import com.smartfren.instrat.entities.SurveyRequest;
import com.smartfren.instrat.entities.SurveyResponse;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;

import io.realm.Realm;
import io.realm.RealmResults;

public class Block12Activity extends BaseStepsActivity {

    private EditText _txtQ134;
    private Spinner _spQ135;

    private String _Q134Value;
    private String _Q135Value;

    private TextView _errorQ134;
    private TextView _errorQ135;

    private String[] _Q135ItemArray;

    private Bundle extras;

    protected String GetBase64(BitmapDrawable drawable)
    {
        Bitmap bitmap = drawable.getBitmap();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, baos); //bm is the bitmap object
        byte[] b = baos.toByteArray();
        String encodedImage = Base64.encodeToString(b, Base64.DEFAULT);
        return encodedImage;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_block12);
        extras = getIntent().getExtras();

        _Q135ItemArray = new String[]{ "--Pilih Jawaban--","Outlet lama (ada dalam list)", "Outlet baru (tidak ada dalam list)" };
        _spQ135 = (Spinner) findViewById(R.id.spQ135);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, this._Q135ItemArray);
        _spQ135.setAdapter(adapter);

        _txtQ134 = (EditText) findViewById(R.id.txtQ134);
        _errorQ134 = (TextView) findViewById(R.id.errorQ134);
        _errorQ135 = (TextView) findViewById(R.id.errorQ135);

        _spQ135.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = parent.getItemAtPosition(position).toString();
                _Q135Value  = selectedItem;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: button back clicked

                String surveyType = extras.getString("TipeSurvey");

                if(surveyType.equals("Advocacy Harga"))
                {
                    Intent intent = new Intent(Block12Activity.this, Blok8Activity.class);
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
                    intent.putExtra("NO_57", extras.getString("NO_57"));
                    intent.putExtra("NO_58", extras.getString("NO_58"));
                    intent.putExtra("NO_59", extras.getString("NO_59"));
                    intent.putExtra("NO_60", extras.getString("NO_60"));
                    intent.putExtra("NO_60B", extras.getString("NO_60B"));
                    intent.putExtra("NO_60C", extras.getString("NO_60C"));
                    intent.putExtra("NO_61", extras.getString("NO_61"));
                    intent.putExtra("NO_61B", extras.getString("NO_61B"));
                    intent.putExtra("NO_61C", extras.getString("NO_61C"));
                    intent.putExtra("NO_62", extras.getString("NO_62"));
                    intent.putExtra("NO_63", extras.getString("NO_63"));
                    intent.putExtra("NO_64", extras.getString("NO_64"));
                    intent.putExtra("NO_65", extras.getString("NO_65"));
                    intent.putExtra("NO_66", extras.getString("NO_66"));
                    intent.putExtra("NO_67", extras.getString("NO_67"));
                    intent.putExtra("NO_68", extras.getString("NO_68"));
                    intent.putExtra("NO_69", extras.getString("NO_69"));
                    intent.putExtra("NO_70", extras.getString("NO_70"));
                    intent.putExtra("NO_71", extras.getString("NO_71"));
                    intent.putExtra("NO_72", extras.getString("NO_72"));
                    intent.putExtra("NO_73", extras.getString("NO_73"));
                    intent.putExtra("NO_74", extras.getString("NO_74"));
                    intent.putExtra("NO_75", extras.getString("NO_75"));
                    intent.putExtra("NO_76", extras.getString("NO_76"));
                    intent.putExtra("NO_77", extras.getString("NO_77"));
                    intent.putExtra("NO_78", extras.getString("NO_78"));
                    intent.putExtra("NO_79", extras.getString("NO_79"));
                    intent.putExtra("NO_80", extras.getString("NO_80"));
                    intent.putExtra("NO_81", extras.getString("NO_81"));
                    intent.putExtra("NO_82", extras.getString("NO_82"));
                    intent.putExtra("NO_83", extras.getString("NO_83"));
                    intent.putExtra("NO_84", extras.getString("NO_84"));
                    intent.putExtra("NO_85", extras.getString("NO_85"));
                    intent.putExtra("NO_86", extras.getString("NO_86"));
                    intent.putExtra("NO_87", extras.getString("NO_87"));
                    intent.putExtra("NO_88", extras.getString("NO_88"));
                    intent.putExtra("NO_89", extras.getString("NO_89"));
                    intent.putExtra("NO_90", extras.getString("NO_90"));
                    intent.putExtra("NO_91", extras.getString("NO_91"));
                    intent.putExtra("NO_92", extras.getString("NO_92"));
                    intent.putExtra("NO_93", extras.getString("NO_93"));
                    intent.putExtra("NO_94", extras.getString("NO_94"));
                    intent.putExtra("NO_95", extras.getString("NO_95"));
                    intent.putExtra("NO_96", extras.getString("NO_96"));
                    intent.putExtra("NO_97", extras.getString("NO_97"));
                    intent.putExtra("NO_98", extras.getString("NO_98"));
                    intent.putExtra("NO_99", extras.getString("NO_99"));
                    intent.putExtra("NO_100", extras.getString("NO_100"));
                    intent.putExtra("NO_101", extras.getString("NO_101"));
                    intent.putExtra("NO_102", extras.getString("NO_102"));
                    intent.putExtra("NO_103", extras.getString("NO_103"));
                    intent.putExtra("NO_104", extras.getString("NO_104"));
                    intent.putExtra("NO_105", extras.getString("NO_105"));
                    intent.putExtra("NO_106", extras.getString("NO_106"));
                    intent.putExtra("NO_107", extras.getString("NO_107"));
                    intent.putExtra("NO_108", extras.getString("NO_108"));
                    intent.putExtra("NO_109", extras.getString("NO_109"));
                    intent.putExtra("NO_110", extras.getString("NO_110"));
                    intent.putExtra("NO_111", extras.getString("NO_111"));
                    intent.putExtra("NO_112", extras.getString("NO_112"));
                    intent.putExtra("NO_113", extras.getString("NO_113"));
                    intent.putExtra("NO_114", extras.getString("NO_114"));
                    intent.putExtra("NO_115", extras.getString("NO_115"));
                    intent.putExtra("NO_116", extras.getString("NO_116"));
                    intent.putExtra("NO_117", extras.getString("NO_117"));
                    intent.putExtra("NO_118", extras.getString("NO_118"));
                    intent.putExtra("NO_119", extras.getString("NO_119"));
                    intent.putExtra("NO_120", extras.getString("NO_120"));
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(Block12Activity.this, Block11Activity.class);
                    Bundle extras = getIntent().getExtras();
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
                    intent.putExtra("NO_57", extras.getString("NO_57"));
                    intent.putExtra("NO_58", extras.getString("NO_58"));
                    intent.putExtra("NO_59", extras.getString("NO_59"));
                    intent.putExtra("NO_60", extras.getString("NO_60"));
                    intent.putExtra("NO_60B", extras.getString("NO_60B"));
                    intent.putExtra("NO_60C", extras.getString("NO_60C"));
                    intent.putExtra("NO_61", extras.getString("NO_61"));
                    intent.putExtra("NO_61B", extras.getString("NO_61B"));
                    intent.putExtra("NO_61C", extras.getString("NO_61C"));
                    intent.putExtra("NO_62", extras.getString("NO_62"));
                    intent.putExtra("NO_63", extras.getString("NO_63"));
                    intent.putExtra("NO_64", extras.getString("NO_64"));
                    intent.putExtra("NO_65", extras.getString("NO_65"));
                    intent.putExtra("NO_66", extras.getString("NO_66"));
                    intent.putExtra("NO_67", extras.getString("NO_67"));
                    intent.putExtra("NO_68", extras.getString("NO_68"));
                    intent.putExtra("NO_69", extras.getString("NO_69"));
                    intent.putExtra("NO_70", extras.getString("NO_70"));
                    intent.putExtra("NO_71", extras.getString("NO_71"));
                    intent.putExtra("NO_72", extras.getString("NO_72"));
                    intent.putExtra("NO_73", extras.getString("NO_73"));
                    intent.putExtra("NO_74", extras.getString("NO_74"));
                    intent.putExtra("NO_75", extras.getString("NO_75"));
                    intent.putExtra("NO_76", extras.getString("NO_76"));
                    intent.putExtra("NO_77", extras.getString("NO_77"));
                    intent.putExtra("NO_78", extras.getString("NO_78"));
                    intent.putExtra("NO_79", extras.getString("NO_79"));
                    intent.putExtra("NO_80", extras.getString("NO_80"));
                    intent.putExtra("NO_81", extras.getString("NO_81"));
                    intent.putExtra("NO_82", extras.getString("NO_82"));
                    intent.putExtra("NO_83", extras.getString("NO_83"));
                    intent.putExtra("NO_84", extras.getString("NO_84"));
                    intent.putExtra("NO_85", extras.getString("NO_85"));
                    intent.putExtra("NO_86", extras.getString("NO_86"));
                    intent.putExtra("NO_87", extras.getString("NO_87"));
                    intent.putExtra("NO_88", extras.getString("NO_88"));
                    intent.putExtra("NO_89", extras.getString("NO_89"));
                    intent.putExtra("NO_90", extras.getString("NO_90"));
                    intent.putExtra("NO_91", extras.getString("NO_91"));
                    intent.putExtra("NO_92", extras.getString("NO_92"));
                    intent.putExtra("NO_93", extras.getString("NO_93"));
                    intent.putExtra("NO_94", extras.getString("NO_94"));
                    intent.putExtra("NO_95", extras.getString("NO_95"));
                    intent.putExtra("NO_96", extras.getString("NO_96"));
                    intent.putExtra("NO_97", extras.getString("NO_97"));
                    intent.putExtra("NO_98", extras.getString("NO_98"));
                    intent.putExtra("NO_99", extras.getString("NO_99"));
                    intent.putExtra("NO_100", extras.getString("NO_100"));
                    intent.putExtra("NO_101", extras.getString("NO_101"));
                    intent.putExtra("NO_102", extras.getString("NO_102"));
                    intent.putExtra("NO_103", extras.getString("NO_103"));
                    intent.putExtra("NO_104", extras.getString("NO_104"));
                    intent.putExtra("NO_105", extras.getString("NO_105"));
                    intent.putExtra("NO_106", extras.getString("NO_106"));
                    intent.putExtra("NO_107", extras.getString("NO_107"));
                    intent.putExtra("NO_108", extras.getString("NO_108"));
                    intent.putExtra("NO_109", extras.getString("NO_109"));
                    intent.putExtra("NO_110", extras.getString("NO_110"));
                    intent.putExtra("NO_111", extras.getString("NO_111"));
                    intent.putExtra("NO_112", extras.getString("NO_112"));
                    intent.putExtra("NO_113", extras.getString("NO_113"));
                    intent.putExtra("NO_114", extras.getString("NO_114"));
                    intent.putExtra("NO_115", extras.getString("NO_115"));
                    intent.putExtra("NO_116", extras.getString("NO_116"));
                    intent.putExtra("NO_117", extras.getString("NO_117"));
                    intent.putExtra("NO_118", extras.getString("NO_118"));
                    intent.putExtra("NO_119", extras.getString("NO_119"));
                    intent.putExtra("NO_120", extras.getString("NO_120"));
                    intent.putExtra("NO_121", extras.getString("NO_121"));
                    intent.putExtra("NO_122", extras.getString("NO_122"));
                    intent.putExtra("NO_123", extras.getString("NO_123"));
                    intent.putExtra("NO_124", extras.getString("NO_124"));
                    intent.putExtra("NO_125", extras.getString("NO_125"));
                    intent.putExtra("NO_126", extras.getString("NO_126"));
                    intent.putExtra("NO_127", extras.getString("NO_127"));
                    intent.putExtra("NO_128", extras.getString("NO_128"));
                    intent.putExtra("NO_129", extras.getString("NO_129"));
                    intent.putExtra("NO_130", extras.getString("NO_130"));
                    intent.putExtra("NO_131", extras.getString("NO_131"));
                    intent.putExtra("NO_132", extras.getString("NO_132"));
                    intent.putExtra("NO_133", extras.getString("NO_133"));

                    startActivity(intent);
                }
            }

            @Override
            public void onContinueClicked() {
                // TODO: button continue clicked

                _Q134Value = _txtQ134.getText().toString();

                int validatedAnswer = 0;

                if (_Q134Value == null || _Q134Value.equals("") || _Q134Value.isEmpty()) {
                    _errorQ134.setError("error");
                    _errorQ134.setText("ID harus diisi");
                } else if (_Q134Value != null && !_Q134Value.equals("") && !_Q134Value.isEmpty() && _Q134Value.length() > 50) {
                    _errorQ134.setError("error");
                    _errorQ134.setText("ID tidak boleh lebih dari 50 karakter");
                } else {
                    _errorQ134.setError(null);
                    _errorQ134.setText("");
                    validatedAnswer++;
                }

                if(_Q135Value.equals("--Pilih Jawaban--") || _Q135Value == null || _Q135Value.equals("") || _Q135Value.isEmpty())
                {
                    _errorQ135.setError("error");
                    _errorQ135.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ135.setError(null);
                    _errorQ135.setText("");
                    validatedAnswer++;
                }

                /*
                Intent intent = new Intent(Block12Activity.this, Blok13Activity.class);
                Bundle extras = getIntent().getExtras();
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
                intent.putExtra("NO_57", extras.getString("NO_57"));
                intent.putExtra("NO_58", extras.getString("NO_58"));
                intent.putExtra("NO_59", extras.getString("NO_59"));
                intent.putExtra("NO_60", extras.getString("NO_60"));
                intent.putExtra("NO_60B", extras.getString("NO_60B"));
                intent.putExtra("NO_60C", extras.getString("NO_60C"));
                intent.putExtra("NO_61", extras.getString("NO_61"));
                intent.putExtra("NO_61B", extras.getString("NO_61B"));
                intent.putExtra("NO_61C", extras.getString("NO_61C"));
                intent.putExtra("NO_62", extras.getString("NO_62"));
                intent.putExtra("NO_63", extras.getString("NO_63"));
                intent.putExtra("NO_64", extras.getString("NO_64"));
                intent.putExtra("NO_65", extras.getString("NO_65"));
                intent.putExtra("NO_66", extras.getString("NO_66"));
                intent.putExtra("NO_67", extras.getString("NO_67"));
                intent.putExtra("NO_68", extras.getString("NO_68"));
                intent.putExtra("NO_69", extras.getString("NO_69"));
                intent.putExtra("NO_70", extras.getString("NO_70"));
                intent.putExtra("NO_71", extras.getString("NO_71"));
                intent.putExtra("NO_72", extras.getString("NO_72"));
                intent.putExtra("NO_73", extras.getString("NO_73"));
                intent.putExtra("NO_74", extras.getString("NO_74"));
                intent.putExtra("NO_75", extras.getString("NO_75"));
                intent.putExtra("NO_76", extras.getString("NO_76"));
                intent.putExtra("NO_77", extras.getString("NO_77"));
                intent.putExtra("NO_78", extras.getString("NO_78"));
                intent.putExtra("NO_79", extras.getString("NO_79"));
                intent.putExtra("NO_80", extras.getString("NO_80"));
                intent.putExtra("NO_81", extras.getString("NO_81"));
                intent.putExtra("NO_82", extras.getString("NO_82"));
                intent.putExtra("NO_83", extras.getString("NO_83"));
                intent.putExtra("NO_84", extras.getString("NO_84"));
                intent.putExtra("NO_85", extras.getString("NO_85"));
                intent.putExtra("NO_86", extras.getString("NO_86"));
                intent.putExtra("NO_87", extras.getString("NO_87"));
                intent.putExtra("NO_88", extras.getString("NO_88"));
                intent.putExtra("NO_89", extras.getString("NO_89"));
                intent.putExtra("NO_90", extras.getString("NO_90"));
                intent.putExtra("NO_91", extras.getString("NO_91"));
                intent.putExtra("NO_92", extras.getString("NO_92"));
                intent.putExtra("NO_93", extras.getString("NO_93"));
                intent.putExtra("NO_94", extras.getString("NO_94"));
                intent.putExtra("NO_95", extras.getString("NO_95"));
                intent.putExtra("NO_96", extras.getString("NO_96"));
                intent.putExtra("NO_97", extras.getString("NO_97"));
                intent.putExtra("NO_98", extras.getString("NO_98"));
                intent.putExtra("NO_99", extras.getString("NO_99"));
                intent.putExtra("NO_100", extras.getString("NO_100"));
                intent.putExtra("NO_101", extras.getString("NO_101"));
                intent.putExtra("NO_102", extras.getString("NO_102"));
                intent.putExtra("NO_103", extras.getString("NO_103"));
                intent.putExtra("NO_104", extras.getString("NO_104"));
                intent.putExtra("NO_105", extras.getString("NO_105"));
                intent.putExtra("NO_106", extras.getString("NO_106"));
                intent.putExtra("NO_107", extras.getString("NO_107"));
                intent.putExtra("NO_108", extras.getString("NO_108"));
                intent.putExtra("NO_109", extras.getString("NO_109"));
                intent.putExtra("NO_110", extras.getString("NO_110"));
                intent.putExtra("NO_111", extras.getString("NO_111"));
                intent.putExtra("NO_112", extras.getString("NO_112"));
                intent.putExtra("NO_113", extras.getString("NO_113"));
                intent.putExtra("NO_114", extras.getString("NO_114"));
                intent.putExtra("NO_115", extras.getString("NO_115"));
                intent.putExtra("NO_116", extras.getString("NO_116"));
                intent.putExtra("NO_117", extras.getString("NO_117"));
                intent.putExtra("NO_118", extras.getString("NO_118"));
                intent.putExtra("NO_119", extras.getString("NO_119"));
                intent.putExtra("NO_120", extras.getString("NO_120"));
                intent.putExtra("NO_121", extras.getString("NO_121"));
                intent.putExtra("NO_122", extras.getString("NO_122"));
                intent.putExtra("NO_123", extras.getString("NO_123"));
                intent.putExtra("NO_124", extras.getString("NO_124"));
                intent.putExtra("NO_125", extras.getString("NO_125"));
                intent.putExtra("NO_126", extras.getString("NO_126"));
                intent.putExtra("NO_127", extras.getString("NO_127"));
                intent.putExtra("NO_128", extras.getString("NO_128"));
                intent.putExtra("NO_129", extras.getString("NO_129"));
                intent.putExtra("NO_130", extras.getString("NO_130"));
                intent.putExtra("NO_131", extras.getString("NO_131"));
                intent.putExtra("NO_132", extras.getString("NO_132"));
                intent.putExtra("NO_133", extras.getString("NO_133"));
                intent.putExtra("NO_134", _Q134Value);
                intent.putExtra("NO_135", _Q135Value);
                */

                if(validatedAnswer == 2) {
                    Realm realm = Realm.getDefaultInstance();
                    RealmResults<LoginEntity> loginData = realm.where(LoginEntity.class).findAll();
                    LoginEntity loginEntity = loginData.first();

                    String NO_1 = extras.getString("NO_1");
                    String NO_2 = extras.getString("NO_2");
                    String NO_3 = extras.getString("NO_3");
                    String NO_4 = extras.getString("NO_4");
                    String NO_5 = extras.getString("NO_5");
                    String NO_6 = extras.getString("NO_6");
                    String NO_7 = extras.getString("NO_7");
                    String NO_8 = extras.getString("NO_8");
                    String NO_9 = extras.getString("NO_9");
                    String NO_10 = extras.getString("NO_10");
                    String NO_11 = extras.getString("NO_11");
                    String NO_12 = extras.getString("NO_12");
                    String NO_13 = extras.getString("NO_13");
                    String NO_14 = extras.getString("NO_14");
                    String NO_15 = extras.getString("NO_15");
                    String NO_16 = extras.getString("NO_16");
                    String NO_17 = extras.getString("NO_17");
                    String NO_18 = extras.getString("NO_18");
                    String NO_19 = extras.getString("NO_19");
                    String NO_20 = extras.getString("NO_20");
                    String NO_21 = extras.getString("NO_21");
                    String NO_22 = extras.getString("NO_22");
                    String NO_23 = extras.getString("NO_23");
                    String NO_24 = extras.getString("NO_24");
                    String NO_25 = extras.getString("NO_25");
                    String NO_26 = extras.getString("NO_26");
                    String NO_27 = extras.getString("NO_27");
                    String NO_28 = extras.getString("NO_28");
                    String NO_29 = extras.getString("NO_29");
                    String NO_30 = extras.getString("NO_30");
                    String NO_31 = extras.getString("NO_31");
                    String NO_32 = extras.getString("NO_32");
                    String NO_33 = extras.getString("NO_33");
                    String NO_34 = extras.getString("NO_34");
                    String NO_35 = extras.getString("NO_35");
                    String NO_36 = extras.getString("NO_36");
                    String NO_38 = extras.getString("NO_38");
                    String NO_39 = extras.getString("NO_39");
                    String NO_40 = extras.getString("NO_40");
                    String NO_41 = extras.getString("NO_41");
                    String NO_42 = extras.getString("NO_42");
                    String NO_43 = extras.getString("NO_43");
                    String NO_44 = extras.getString("NO_44");
                    String NO_45 = extras.getString("NO_45");
                    String NO_46 = extras.getString("NO_46");
                    String NO_47 = extras.getString("NO_47");
                    String NO_48 = extras.getString("NO_48");
                    String NO_49 = extras.getString("NO_49");
                    String NO_50 = extras.getString("NO_50");
                    String NO_51 = extras.getString("NO_51");
                    String NO_52 = extras.getString("NO_52");
                    String NO_52B = extras.getString("NO_52B");
                    String NO_52C = extras.getString("NO_52C");
                    String NO_52D = extras.getString("NO_52D");
                    String NO_52E = extras.getString("NO_52E");
                    String NO_53 = extras.getString("NO_53");
                    String NO_54 = extras.getString("NO_54");
                    String NO_55 = extras.getString("NO_55");
                    String NO_56 = extras.getString("NO_56");
                    String NO_57 = extras.getString("NO_57");
                    String NO_58 = extras.getString("NO_58");
                    String NO_59 = extras.getString("NO_59");
                    String NO_60 = extras.getString("NO_60");
                    String NO_60B = extras.getString("NO_60B");
                    String NO_60C = extras.getString("NO_60C");
                    String NO_61 = extras.getString("NO_61");
                    String NO_61B = extras.getString("NO_61B");
                    String NO_61C = extras.getString("NO_61C");
                    String NO_62 = extras.getString("NO_62");
                    String NO_63 = extras.getString("NO_63");
                    String NO_64 = extras.getString("NO_64");
                    String NO_65 = extras.getString("NO_65");
                    String NO_66 = extras.getString("NO_66");
                    String NO_67 = extras.getString("NO_67");
                    String NO_68 = extras.getString("NO_68");
                    String NO_69 = extras.getString("NO_69");
                    String NO_70 = extras.getString("NO_70");
                    String NO_71 = extras.getString("NO_71");
                    String NO_72 = extras.getString("NO_72");
                    String NO_73 = extras.getString("NO_73");
                    String NO_74 = extras.getString("NO_74");
                    String NO_75 = extras.getString("NO_75");
                    String NO_76 = extras.getString("NO_76");
                    String NO_77 = extras.getString("NO_77");
                    String NO_78 = extras.getString("NO_78");
                    String NO_79 = extras.getString("NO_79");
                    String NO_80 = extras.getString("NO_80");
                    String NO_81 = extras.getString("NO_81");
                    String NO_82 = extras.getString("NO_82");
                    String NO_83 = extras.getString("NO_83");
                    String NO_84 = extras.getString("NO_84");
                    String NO_85 = extras.getString("NO_85");
                    String NO_86 = extras.getString("NO_86");
                    String NO_87 = extras.getString("NO_87");
                    String NO_88 = extras.getString("NO_88");
                    String NO_89 = extras.getString("NO_89");
                    String NO_90 = extras.getString("NO_90");
                    String NO_91 = extras.getString("NO_91");
                    String NO_92 = extras.getString("NO_92");
                    String NO_93 = extras.getString("NO_93");
                    String NO_94 = extras.getString("NO_94");
                    String NO_95 = extras.getString("NO_95");
                    String NO_96 = extras.getString("NO_96");
                    String NO_97 = extras.getString("NO_97");
                    String NO_98 = extras.getString("NO_98");
                    String NO_99 = extras.getString("NO_99");
                    String NO_100 = extras.getString("NO_100");
                    String NO_101 = extras.getString("NO_101");
                    String NO_102 = extras.getString("NO_102");
                    String NO_103 = extras.getString("NO_103");
                    String NO_104 = extras.getString("NO_104");
                    String NO_105 = extras.getString("NO_105");
                    String NO_106 = extras.getString("NO_106");
                    String NO_107 = extras.getString("NO_107");
                    String NO_108 = extras.getString("NO_108");
                    String NO_109 = extras.getString("NO_109");
                    String NO_110 = extras.getString("NO_110");
                    String NO_111 = extras.getString("NO_111");
                    String NO_112 = extras.getString("NO_112");
                    String NO_113 = extras.getString("NO_113");
                    String NO_114 = extras.getString("NO_114");
                    String NO_115 = extras.getString("NO_115");
                    String NO_116 = extras.getString("NO_116");
                    String NO_117 = extras.getString("NO_117");
                    String NO_118 = extras.getString("NO_118");
                    String NO_119 = extras.getString("NO_119");
                    String NO_120 = extras.getString("NO_120");
                    String NO_121 = extras.getString("NO_121");
                    String NO_122 = extras.getString("NO_122");
                    String NO_123 = extras.getString("NO_123");
                    String NO_124 = extras.getString("NO_124");
                    String NO_125 = extras.getString("NO_125");
                    String NO_126 = extras.getString("NO_126");
                    String NO_127 = extras.getString("NO_127");
                    String NO_128 = extras.getString("NO_128");
                    String NO_129 = extras.getString("NO_129");
                    String NO_130 = extras.getString("NO_130");
                    String NO_131 = extras.getString("NO_131");
                    String NO_132 = extras.getString("NO_132");
                    String NO_133 = extras.getString("NO_133");
                    String NO_134 = _Q134Value;
                    String NO_135 = _Q135Value;

                    SurveyEntity surveyEntity = new SurveyEntity();
                    surveyEntity.userID = loginEntity.userID;
                    surveyEntity.kota = loginEntity.namaKota;
                    surveyEntity.tipeSurvey = extras.getString("TipeSurvey");
                    surveyEntity.deviceSurveyID = extras.getString("DeviceSurveyID");
                    surveyEntity.b1no1 = NO_1;
                    surveyEntity.b1no2 = NO_2;
                    surveyEntity.b2no3 = NO_3;
                    surveyEntity.b2no4 = NO_4;
                    surveyEntity.b2no5 = NO_5;
                    surveyEntity.b3no6 = NO_6;
                    surveyEntity.b3no7 = NO_7;
                    surveyEntity.b3no8 = NO_8;
                    surveyEntity.b3no9 = NO_9;
                    surveyEntity.b3no10 = NO_10;
                    surveyEntity.b3no11 = NO_11;
                    surveyEntity.b3no12 = NO_12;
                    surveyEntity.b3no13 = NO_13;
                    surveyEntity.b3no14 = NO_14;
                    surveyEntity.b3no15 = NO_15;
                    surveyEntity.b3no16 = NO_16;
                    surveyEntity.b3no17 = NO_17;
                    surveyEntity.b3no18 = NO_18;
                    surveyEntity.b3no19 = NO_19;
                    surveyEntity.b3no20 = NO_20;
                    surveyEntity.b3no21 = NO_21;
                    surveyEntity.b3no22 = NO_22;
                    surveyEntity.b3no23 = NO_23;
                    surveyEntity.b3no24 = NO_24;
                    surveyEntity.b3no25 = NO_25;
                    surveyEntity.b3no26 = NO_26;
                    surveyEntity.b3no27 = NO_27;
                    surveyEntity.b3no28 = NO_28;
                    surveyEntity.b3no29 = NO_29;
                    surveyEntity.b3no30 = NO_30;
                    surveyEntity.b3no31 = NO_31;
                    surveyEntity.b3no32 = NO_32;
                    surveyEntity.b3no33 = NO_33;
                    surveyEntity.b3no34 = NO_34;
                    surveyEntity.b3no35 = NO_35;
                    surveyEntity.b3no36 = NO_36;
                    surveyEntity.b4no38 = NO_38;
                    surveyEntity.b4no39 = NO_39;
                    surveyEntity.b4no40 = NO_40;
                    surveyEntity.b4no41 = NO_41;
                    surveyEntity.b4no42 = NO_42;
                    surveyEntity.b4no43 = NO_43;
                    surveyEntity.b4no44 = NO_44;
                    surveyEntity.b4no45 = NO_45;
                    surveyEntity.b4no46 = NO_46;
                    surveyEntity.b4no47 = NO_47;
                    surveyEntity.b5no48 = NO_48;
                    surveyEntity.b5no49 = NO_49;
                    surveyEntity.b5no50 = NO_50;
                    surveyEntity.b5no51 = NO_51;
                    surveyEntity.b5no52 = NO_52;
                    surveyEntity.b5no52B = NO_52B;
                    surveyEntity.b5no52C = NO_52C;
                    surveyEntity.b5no52D = NO_52D;
                    surveyEntity.b5no52E = NO_52E;
                    surveyEntity.b5no53 = NO_53;
                    surveyEntity.b5no54 = NO_54;
                    surveyEntity.b5no55 = NO_55;
                    surveyEntity.b5no56 = NO_56;
                    surveyEntity.b5no57 = NO_57;
                    surveyEntity.b5no58 = NO_58;
                    surveyEntity.b5no59 = NO_59;
                    surveyEntity.b5no60 = NO_60;
                    surveyEntity.b5no60B = NO_60B;
                    surveyEntity.b5no60C = NO_60C;
                    surveyEntity.b5no61 = NO_61;
                    surveyEntity.b6no61B = NO_61B;
                    surveyEntity.b6no61C = NO_61C;
                    surveyEntity.b6no62 = NO_62;
                    surveyEntity.b6no63 = NO_63;
                    surveyEntity.b6no64 = NO_64;
                    surveyEntity.b6no65 = NO_65;
                    surveyEntity.b6no66 = NO_66;
                    surveyEntity.b6no67 = NO_67;
                    surveyEntity.b6no68 = NO_68;
                    surveyEntity.b6no69 = NO_69;
                    surveyEntity.b6no70 = NO_70;
                    surveyEntity.b6no71 = NO_71;
                    surveyEntity.b6no72 = NO_72;
                    surveyEntity.b6no73 = NO_73;
                    surveyEntity.b6no74 = NO_74;
                    surveyEntity.b6no75 = NO_75;
                    surveyEntity.b6no76 = NO_76;
                    surveyEntity.b6no77 = NO_77;
                    surveyEntity.b6no78 = NO_78;
                    surveyEntity.b6no79 = NO_79;
                    surveyEntity.b6no80 = NO_80;
                    surveyEntity.b6no81 = NO_81;
                    surveyEntity.b6no82 = NO_82;
                    surveyEntity.b6no83 = NO_83;
                    surveyEntity.b6no84 = NO_84;
                    surveyEntity.b6no85 = NO_85;
                    surveyEntity.b6no86 = NO_86;
                    surveyEntity.b6no87 = NO_87;
                    surveyEntity.b6no88 = NO_88;
                    surveyEntity.b6no89 = NO_89;
                    surveyEntity.b6no90 = NO_90;
                    surveyEntity.b6no91 = NO_91;
                    surveyEntity.b6no92 = NO_92;
                    surveyEntity.b6no93 = NO_93;
                    surveyEntity.b6no94 = NO_94;
                    surveyEntity.b6no95 = NO_95;
                    surveyEntity.b6no96 = NO_96;
                    surveyEntity.b6no97 = NO_97;
                    surveyEntity.b6no98 = NO_98;
                    surveyEntity.b6no99 = NO_99;
                    surveyEntity.b6no100 = NO_100;
                    surveyEntity.b7no101 = NO_101;
                    surveyEntity.b7no102 = NO_102;
                    surveyEntity.b7no103 = NO_103;
                    surveyEntity.b7no104 = NO_104;
                    surveyEntity.b7no105 = NO_105;
                    surveyEntity.b7no106 = NO_106;
                    surveyEntity.b7no107 = NO_107;
                    surveyEntity.b7no108 = NO_108;
                    surveyEntity.b7no109 = NO_109;
                    surveyEntity.b7no110 = NO_110;
                    surveyEntity.b7no111 = NO_111;
                    surveyEntity.b7no112 = NO_112;
                    surveyEntity.b7no113 = NO_113;
                    surveyEntity.b7no114 = NO_114;
                    surveyEntity.b7no115 = NO_115;
                    surveyEntity.b7no116 = NO_116;
                    surveyEntity.b7no117 = NO_117;
                    surveyEntity.b7no118 = NO_118;
                    surveyEntity.b7no119 = NO_119;
                    surveyEntity.b7no120 = NO_120;
                    surveyEntity.b8no121 = NO_121;
                    surveyEntity.b8no122 = NO_122;
                    surveyEntity.b8no123 = NO_123;
                    surveyEntity.b8no124 = NO_124;
                    surveyEntity.b8no125 = NO_125;
                    surveyEntity.b8no126 = NO_126;
                    surveyEntity.b8no127 = NO_127;
                    surveyEntity.b9no128 = NO_128;
                    surveyEntity.b10no129 = NO_129;

                    if(!NO_130.isEmpty() && !NO_130.equals(""))
                    {
                        surveyEntity.b11no130 = GetBase64((BitmapDrawable)Drawable.createFromPath(NO_130));
                    }
                    else
                    {
                        surveyEntity.b11no130 = "";
                    }

                    if(!NO_131.isEmpty() && !NO_131.equals(""))
                    {
                        surveyEntity.b11no131 = GetBase64((BitmapDrawable)Drawable.createFromPath(NO_131));
                    }
                    else
                    {
                        surveyEntity.b11no131 = "";
                    }

                    if(!NO_132.isEmpty() && !NO_132.equals(""))
                    {
                        surveyEntity.b11no132 = GetBase64((BitmapDrawable)Drawable.createFromPath(NO_132));
                    }
                    else
                    {
                        surveyEntity.b11no132 = "";
                    }

                    if(!NO_133.isEmpty() && !NO_133.equals(""))
                    {
                        surveyEntity.b11no133 = GetBase64((BitmapDrawable)Drawable.createFromPath(NO_133));
                    }
                    else
                    {
                        surveyEntity.b11no133 = "";
                    }

                    surveyEntity.b12no134 = NO_134;
                    surveyEntity.b12no135 = NO_135;
                    surveyEntity.status = "Pending";
                    realm.beginTransaction();
                    realm.copyToRealm(surveyEntity);
                    realm.commitTransaction();

                    Toast.makeText(getApplicationContext(), "Survey Successfully saved", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Block12Activity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                }
            }
        });
    }
}
