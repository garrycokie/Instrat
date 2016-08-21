package com.smartfren.instrat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.smartfren.instrat.R;
import com.smartfren.instrat.entities.SurveyRequest;
import com.smartfren.instrat.entities.SurveyResponse;

import org.json.JSONException;
import org.json.JSONObject;

public class Block12Activity extends BaseStepsActivity {

    private EditText _txtQ134;
    private Spinner _spQ135;

    private String _Q134Value;
    private String _Q135Value;

    private String[] _Q135ItemArray;

    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_block12);
        extras = getIntent().getExtras();

        _Q135ItemArray = new String[]{ "Outlet lama (ada dalam list)", "Outlet baru (tidak ada dalam list)" };
        _spQ135 = (Spinner) findViewById(R.id.spQ135);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, this._Q135ItemArray);
        _spQ135.setAdapter(adapter);

        _txtQ134 = (EditText) findViewById(R.id.txtQ134);


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
            }

            @Override
            public void onContinueClicked() {
                // TODO: button continue clicked

                _Q134Value = _txtQ134.getText().toString();

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

                final SurveyResponse[] result = new SurveyResponse[1];

                SurveyRequest surveyRequest = new SurveyRequest();
                surveyRequest.userID = "BDG-001";
                surveyRequest.accessToken = "D4FA7538-57EE-436A-A85F-A206C6D15105";
                surveyRequest.kota = "Bandung" ;
                surveyRequest.tipeSurvey = "Full Audit Smartphone" ;
                surveyRequest.deviceSurveyID = "9C9E5710-7E94-46C2-B619-7F8FC0CD2CA1" ;
                surveyRequest.b1no2 = "b1no2";
                surveyRequest.b2no3 = "b1no2";
                surveyRequest.b2no4 = "b1no2";
                surveyRequest.b2no5 = "b1no2";
                surveyRequest.b3no6 = "b1no2";
                surveyRequest.b3no7 = "b1no2";
                surveyRequest.b3no8 = "b1no2";
                surveyRequest.b3no9 = "b1no2";
                surveyRequest.b3no10 = "b1no2";
                surveyRequest.b3no11 = "b1no2";
                surveyRequest.b3no12 = "b1no2";
                surveyRequest.b3no13 = "b1no2";
                surveyRequest.b3no14 = "b1no2";
                surveyRequest.b3no15 = "b1no2";
                surveyRequest.b3no16 = "b1no2";
                surveyRequest.b3no17 = "b1no2";
                surveyRequest.b3no18 = "b1no2";
                surveyRequest.b3no19 = "b1no2";
                surveyRequest.b3no20 = "b1no2";
                surveyRequest.b3no21 = "b1no2";
                surveyRequest.b3no22 = "b1no2";
                surveyRequest.b3no23 = "b1no2";
                surveyRequest.b3no24 = "b1no2";
                surveyRequest.b3no25 = "b1no2";
                surveyRequest.b3no26 = "b1no2";
                surveyRequest.b3no27 = "b1no2";
                surveyRequest.b3no28 = "b1no2";
                surveyRequest.b3no29 = "b1no2";
                surveyRequest.b3no30 = "b1no2";
                surveyRequest.b3no31 = "b1no2";
                surveyRequest.b3no32 = "b1no2";
                surveyRequest.b3no33 = "b1no2";
                surveyRequest.b3no34 = "b1no2";
                surveyRequest.b3no35 = "b1no2";
                surveyRequest.b3no36 = "b1no2";
                surveyRequest.b4no38 = "b1no2";
                surveyRequest.b4no39 = "b1no2";
                surveyRequest.b4no40 = "b1no2";
                surveyRequest.b4no41 = "b1no2";
                surveyRequest.b4no42 = "b1no2";
                surveyRequest.b4no43 = "b1no2";
                surveyRequest.b4no44 = "b1no2";
                surveyRequest.b4no45 = "b1no2";
                surveyRequest.b4no46 = "b1no2";
                surveyRequest.b4no47 = "b1no2";
                surveyRequest.b5no48 = "b1no2";
                surveyRequest.b5no49 = "b1no2";
                surveyRequest.b5no50 = "b1no2";
                surveyRequest.b5no51 = "b1no2";
                surveyRequest.b5no52 = "b1no2";
                surveyRequest.b5no52B = "b1no2";
                surveyRequest.b5no52C = "b1no2";
                surveyRequest.b5no52D = "b1no2";
                surveyRequest.b5no52E = "b1no2";
                surveyRequest.b5no53 = "b1no2";
                surveyRequest.b5no54 = "b1no2";
                surveyRequest.b5no55 = "b1no2";
                surveyRequest.b5no56 = "b1no2";
                surveyRequest.b5no57 = "b1no2";
                surveyRequest.b5no58 = "b1no2";
                surveyRequest.b5no59 = "b1no2";
                surveyRequest.b5no60 = "b1no2";
                surveyRequest.b5no60B = "b1no2";
                surveyRequest.b5no60C = "b1no2";
                surveyRequest.b5no61 = "b1no2";
                surveyRequest.b6no61B = "b1no2";
                surveyRequest.b6no61C = "b1no2";
                surveyRequest.b6no62 = "b1no2";
                surveyRequest.b6no63 = "b1no2";
                surveyRequest.b6no64 = "b1no2";
                surveyRequest.b6no65 = "b1no2";
                surveyRequest.b6no66 = "b1no2";
                surveyRequest.b6no67 = "b1no2";
                surveyRequest.b6no68 = "b1no2";
                surveyRequest.b6no69 = "b1no2";
                surveyRequest.b6no70 = "b1no2";
                surveyRequest.b6no71 = "b1no2";
                surveyRequest.b6no72 = "b1no2";
                surveyRequest.b6no73 = "b1no2";
                surveyRequest.b6no74 = "b1no2";
                surveyRequest.b6no75 = "b1no2";
                surveyRequest.b6no76 = "b1no2";
                surveyRequest.b6no77 = "b1no2";
                surveyRequest.b6no78 = "b1no2";
                surveyRequest.b6no79 = "b1no2";
                surveyRequest.b6no80 = "b1no2";
                surveyRequest.b6no81 = "b1no2";
                surveyRequest.b6no82 = "b1no2";
                surveyRequest.b6no83 = "b1no2";
                surveyRequest.b6no84 = "b1no2";
                surveyRequest.b6no85 = "b1no2";
                surveyRequest.b6no86 = "b1no2";
                surveyRequest.b6no87 = "b1no2";
                surveyRequest.b6no88 = "b1no2";
                surveyRequest.b6no89 = "b1no2";
                surveyRequest.b6no90 = "b1no2";
                surveyRequest.b6no91 = "b1no2";
                surveyRequest.b6no92 = "b1no2";
                surveyRequest.b6no93 = "b1no2";
                surveyRequest.b6no94 = "b1no2";
                surveyRequest.b6no95 = "b1no2";
                surveyRequest.b6no96 = "b1no2";
                surveyRequest.b6no97 = "b1no2";
                surveyRequest.b6no98 = "b1no2";
                surveyRequest.b6no99 = "b1no2";
                surveyRequest.b6no100 = "b1no2";
                surveyRequest.b7no101 = "b1no2";
                surveyRequest.b7no102 = "b1no2";
                surveyRequest.b7no103 = "b1no2";
                surveyRequest.b7no104 = "b1no2";
                surveyRequest.b7no105 = "b1no2";
                surveyRequest.b7no106 = "b1no2";
                surveyRequest.b7no107 = "b1no2";
                surveyRequest.b7no108 = "b1no2";
                surveyRequest.b7no109 = "b1no2";
                surveyRequest.b7no110 = "b1no2";
                surveyRequest.b7no111 = "b1no2";
                surveyRequest.b7no112 = "b1no2";
                surveyRequest.b7no113 = "b1no2";
                surveyRequest.b7no114 = "b1no2";
                surveyRequest.b7no115 = "b1no2";
                surveyRequest.b7no116 = "b1no2";
                surveyRequest.b7no117 = "b1no2";
                surveyRequest.b7no118 = "b1no2";
                surveyRequest.b7no119 = "b1no2";
                surveyRequest.b7no120 = "b1no2";
                surveyRequest.b8no121 = "b1no2";
                surveyRequest.b8no122 = "b1no2";
                surveyRequest.b8no123 = "b1no2";
                surveyRequest.b8no124 = "b1no2";
                surveyRequest.b8no125 = "b1no2";
                surveyRequest.b8no126 = "b1no2";
                surveyRequest.b8no127 = "b1no2";
                surveyRequest.b9no128 = "b1no2";
                surveyRequest.b10no129 = "b1no2";
                surveyRequest.b11no130 = "b1no2";
                surveyRequest.b11no131 = "b1no2";
                surveyRequest.b11no132 = "b1no2";
                surveyRequest.b11no133 = "b1no2";
                surveyRequest.b12no134 = "b1no2";
                surveyRequest.b12no135 = "b1no2";

                Gson gson2 = new Gson();
                String json2 = gson2.toJson(surveyRequest);

                String url2 = "http://192.168.1.106/Instrat2/survey.php"; // change to api url
                JSONObject param2 = null;
                try {
                    param2 = new JSONObject(json2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                final JsonObjectRequest jsonRequest2 = new JsonObjectRequest
                        (Request.Method.POST, url2, param2, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                // the response is already constructed as a JSONObject!
                                try {
                                    String userID = response.getString("userID");
                                    String status = response.getString("status");

                                    result[0] = new SurveyResponse();
                                    result[0].userID = userID;
                                    result[0].status = status;

                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        }, new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                error.printStackTrace();
                            }
                        });

                Volley.newRequestQueue(getApplicationContext()).add(jsonRequest2);
            }
        });
    }
}
