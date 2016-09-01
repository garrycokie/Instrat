package com.smartfren.instrat.activities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
import com.smartfren.instrat.utilities.SurveyListAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends Activity {

    private Button _btnSend;
    private Button _btnNew;
    private RealmResults<SurveyEntity> _surveyData;
    private RecyclerView _viewSurveyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        _btnSend = (Button)findViewById(R.id.btnSend);
        _btnNew = (Button)findViewById(R.id.btnNew);
        _viewSurveyList = (RecyclerView) findViewById(R.id.viewSurveyList);

        Realm realm = Realm.getDefaultInstance();
        _surveyData = realm.where(SurveyEntity.class).findAll();
        SurveyEntity[] arraySurvey = new SurveyEntity[_surveyData.size()];
        SurveyListAdapter adapter = new SurveyListAdapter(_surveyData.toArray(arraySurvey));

        _viewSurveyList.setLayoutManager(new LinearLayoutManager(this));
        _viewSurveyList.setAdapter(adapter);

        _btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog dialog = ProgressDialog.show(getApplicationContext(), "Loading", "Sending data, please wait...", true);

                for (SurveyEntity surveyItem : _surveyData) {
                    //TODO: send survey item
                }

                dialog.dismiss();
                /*
                final SurveyResponse[] result = new SurveyResponse[1];

                SurveyRequest surveyRequest = new SurveyRequest();
                surveyRequest.userID = loginEntity.userID;
                surveyRequest.accessToken = loginEntity.accessToken;
                surveyRequest.kota = loginEntity.namaKota ;
                surveyRequest.tipeSurvey = extras.getString("TipeSurvey") ;
                surveyRequest.deviceSurveyID = extras.getString("DeviceSurveyID") ;
                surveyRequest.b1no1 = NO_1;
                surveyRequest.b1no2 = NO_2;
                surveyRequest.b2no3 = NO_3;
                surveyRequest.b2no4 = NO_4;
                surveyRequest.b2no5 = NO_5;
                surveyRequest.b3no6 = NO_6;
                surveyRequest.b3no7 = NO_7;
                surveyRequest.b3no8 = NO_8;
                surveyRequest.b3no9 = NO_9;
                surveyRequest.b3no10 = NO_10;
                surveyRequest.b3no11 = NO_11;
                surveyRequest.b3no12 = NO_12;
                surveyRequest.b3no13 = NO_13;
                surveyRequest.b3no14 = NO_14;
                surveyRequest.b3no15 = NO_15;
                surveyRequest.b3no16 = NO_16;
                surveyRequest.b3no17 = NO_17;
                surveyRequest.b3no18 = NO_18;
                surveyRequest.b3no19 = NO_19;
                surveyRequest.b3no20 = NO_20;
                surveyRequest.b3no21 = NO_21;
                surveyRequest.b3no22 = NO_22;
                surveyRequest.b3no23 = NO_23;
                surveyRequest.b3no24 = NO_24;
                surveyRequest.b3no25 = NO_25;
                surveyRequest.b3no26 = NO_26;
                surveyRequest.b3no27 = NO_27;
                surveyRequest.b3no28 = NO_28;
                surveyRequest.b3no29 = NO_29;
                surveyRequest.b3no30 = NO_30;
                surveyRequest.b3no31 = NO_31;
                surveyRequest.b3no32 = NO_32;
                surveyRequest.b3no33 = NO_33;
                surveyRequest.b3no34 = NO_34;
                surveyRequest.b3no35 = NO_35;
                surveyRequest.b3no36 = NO_36;
                surveyRequest.b4no38 = NO_38;
                surveyRequest.b4no39 = NO_39;
                surveyRequest.b4no40 = NO_40;
                surveyRequest.b4no41 = NO_41;
                surveyRequest.b4no42 = NO_42;
                surveyRequest.b4no43 = NO_43;
                surveyRequest.b4no44 = NO_44;
                surveyRequest.b4no45 = NO_45;
                surveyRequest.b4no46 = NO_46;
                surveyRequest.b4no47 = NO_47;
                surveyRequest.b5no48 = NO_48;
                surveyRequest.b5no49 = NO_49;
                surveyRequest.b5no50 = NO_50;
                surveyRequest.b5no51 = NO_51;
                surveyRequest.b5no52 = NO_52;
                surveyRequest.b5no52B = NO_52B;
                surveyRequest.b5no52C = NO_52C;
                surveyRequest.b5no52D = NO_52D;
                surveyRequest.b5no52E = NO_52E;
                surveyRequest.b5no53 = NO_53;
                surveyRequest.b5no54 = NO_54;
                surveyRequest.b5no55 = NO_55;
                surveyRequest.b5no56 = NO_56;
                surveyRequest.b5no57 = NO_57;
                surveyRequest.b5no58 = NO_58;
                surveyRequest.b5no59 = NO_59;
                surveyRequest.b5no60 = NO_60;
                surveyRequest.b5no60B = NO_60B;
                surveyRequest.b5no60C = NO_60C;
                surveyRequest.b5no61 = NO_61;
                surveyRequest.b6no61B = NO_61B;
                surveyRequest.b6no61C = NO_61C;
                surveyRequest.b6no62 = NO_62;
                surveyRequest.b6no63 = NO_63;
                surveyRequest.b6no64 = NO_64;
                surveyRequest.b6no65 = NO_65;
                surveyRequest.b6no66 = NO_66;
                surveyRequest.b6no67 = NO_67;
                surveyRequest.b6no68 = NO_68;
                surveyRequest.b6no69 = NO_69;
                surveyRequest.b6no70 = NO_70;
                surveyRequest.b6no71 = NO_71;
                surveyRequest.b6no72 = NO_72;
                surveyRequest.b6no73 = NO_73;
                surveyRequest.b6no74 = NO_74;
                surveyRequest.b6no75 = NO_75;
                surveyRequest.b6no76 = NO_76;
                surveyRequest.b6no77 = NO_77;
                surveyRequest.b6no78 = NO_78;
                surveyRequest.b6no79 = NO_79;
                surveyRequest.b6no80 = NO_80;
                surveyRequest.b6no81 = NO_81;
                surveyRequest.b6no82 = NO_82;
                surveyRequest.b6no83 = NO_83;
                surveyRequest.b6no84 = NO_84;
                surveyRequest.b6no85 = NO_85;
                surveyRequest.b6no86 = NO_86;
                surveyRequest.b6no87 = NO_87;
                surveyRequest.b6no88 = NO_88;
                surveyRequest.b6no89 = NO_89;
                surveyRequest.b6no90 = NO_90;
                surveyRequest.b6no91 = NO_91;
                surveyRequest.b6no92 = NO_92;
                surveyRequest.b6no93 = NO_93;
                surveyRequest.b6no94 = NO_94;
                surveyRequest.b6no95 = NO_95;
                surveyRequest.b6no96 = NO_96;
                surveyRequest.b6no97 = NO_97;
                surveyRequest.b6no98 = NO_98;
                surveyRequest.b6no99 = NO_99;
                surveyRequest.b6no100 = NO_100;
                surveyRequest.b7no101 = NO_101;
                surveyRequest.b7no102 = NO_102;
                surveyRequest.b7no103 = NO_103;
                surveyRequest.b7no104 = NO_104;
                surveyRequest.b7no105 = NO_105;
                surveyRequest.b7no106 = NO_106;
                surveyRequest.b7no107 = NO_107;
                surveyRequest.b7no108 = NO_108;
                surveyRequest.b7no109 = NO_109;
                surveyRequest.b7no110 = NO_110;
                surveyRequest.b7no111 = NO_111;
                surveyRequest.b7no112 = NO_112;
                surveyRequest.b7no113 = NO_113;
                surveyRequest.b7no114 = NO_114;
                surveyRequest.b7no115 = NO_115;
                surveyRequest.b7no116 = NO_116;
                surveyRequest.b7no117 = NO_117;
                surveyRequest.b7no118 = NO_118;
                surveyRequest.b7no119 = NO_119;
                surveyRequest.b7no120 = NO_120;
                surveyRequest.b8no121 = NO_121;
                surveyRequest.b8no122 = NO_122;
                surveyRequest.b8no123 = NO_123;
                surveyRequest.b8no124 = NO_124;
                surveyRequest.b8no125 = NO_125;
                surveyRequest.b8no126 = NO_126;
                surveyRequest.b8no127 = NO_127;
                surveyRequest.b9no128 = NO_128;
                surveyRequest.b10no129 = NO_129;
                surveyRequest.b11no130 = NO_130;
                surveyRequest.b11no131 = NO_131;
                surveyRequest.b11no132 = NO_132;
                surveyRequest.b11no133 = NO_133;
                surveyRequest.b12no134 = NO_134;
                surveyRequest.b12no135 = NO_135;

                Gson gson2 = new Gson();
                String json2 = gson2.toJson(surveyRequest);

                String url2 = "http://instrat.asia/survey/survey.php"; // change to api url
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

                                    if(status.equals("OK")) {
                                        Toast.makeText(getApplicationContext(), "Survey Successfully SENT", Toast.LENGTH_SHORT).show();
                                    }
                                    else
                                    {
                                        Toast.makeText(getApplicationContext(), "Survey SENT FAILED", Toast.LENGTH_SHORT).show();
                                    }

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
                */
            }
        });

        _btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Block0Activity.class);
                startActivity(i);
            }
        });


    }
}
