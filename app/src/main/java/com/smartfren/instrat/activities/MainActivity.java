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

                for (final SurveyEntity surveyItem : _surveyData) {
                    //TODO: send survey item

                    final Realm realm = Realm.getDefaultInstance();
                    RealmResults<LoginEntity> loginData = realm.where(LoginEntity.class).findAll();
                    LoginEntity loginEntity = loginData.first();

                    String userID = loginEntity.userID ;
                    String accessToken = loginEntity.accessToken;
                    String kota = loginEntity.namaKota;
                    String tipeSurvey = surveyItem.tipeSurvey;
                    String deviceSurveyID = surveyItem.deviceSurveyID;

                    String NO_1 = surveyItem.b1no1 ;
                    String NO_2 = surveyItem.b1no2 ;
                    String NO_3 = surveyItem.b2no3 ;
                    String NO_4 = surveyItem.b2no4 ;
                    String NO_5 = surveyItem.b2no5 ;
                    String NO_6 = surveyItem.b3no6 ;
                    String NO_7 = surveyItem.b3no7 ;
                    String NO_8 = surveyItem.b3no8 ;
                    String NO_9 = surveyItem.b3no9 ;
                    String NO_10 =surveyItem.b3no10 ;
                    String NO_11 =surveyItem.b3no11 ;
                    String NO_12 =surveyItem.b3no12 ;
                    String NO_13 =surveyItem.b3no13 ;
                    String NO_14 =surveyItem.b3no14 ;
                    String NO_15 =surveyItem.b3no15 ;
                    String NO_16 =surveyItem.b3no16 ;
                    String NO_17 =surveyItem.b3no17 ;
                    String NO_18 =surveyItem.b3no18 ;
                    String NO_19 =surveyItem.b3no19 ;
                    String NO_20 =surveyItem.b3no20 ;
                    String NO_21 =surveyItem.b3no21 ;
                    String NO_22 =surveyItem.b3no22 ;
                    String NO_23 =surveyItem.b3no23 ;
                    String NO_24 =surveyItem.b3no24 ;
                    String NO_25 =surveyItem.b3no25 ;
                    String NO_26 =surveyItem.b3no26 ;
                    String NO_27 =surveyItem.b3no27 ;
                    String NO_28 =surveyItem.b3no28 ;
                    String NO_29 =surveyItem.b3no29 ;
                    String NO_30 =surveyItem.b3no30 ;
                    String NO_31 =surveyItem.b3no31 ;
                    String NO_32 =surveyItem.b3no32 ;
                    String NO_33 =surveyItem.b3no33 ;
                    String NO_34 =surveyItem.b3no34 ;
                    String NO_35 =surveyItem.b3no35 ;
                    String NO_36 =surveyItem.b3no36 ;
                    String NO_38 =surveyItem.b4no38 ;
                    String NO_39 =surveyItem.b4no39 ;
                    String NO_40 =surveyItem.b4no40 ;
                    String NO_41 =surveyItem.b4no41 ;
                    String NO_42 =surveyItem.b4no42 ;
                    String NO_43 =surveyItem.b4no43 ;
                    String NO_44 =surveyItem.b4no44 ;
                    String NO_45 =surveyItem.b4no45 ;
                    String NO_46 =surveyItem.b4no46 ;
                    String NO_47 =surveyItem.b4no47 ;
                    String NO_48 =surveyItem.b5no48 ;
                    String NO_49 =surveyItem.b5no49 ;
                    String NO_50 =surveyItem.b5no50 ;
                    String NO_51 =surveyItem.b5no51 ;
                    String NO_52 =surveyItem.b5no52 ;
                    String NO_52B = surveyItem.b5no52B;
                    String NO_52C = surveyItem.b5no52C;
                    String NO_52D = surveyItem.b5no52D;
                    String NO_52E = surveyItem.b5no52E;
                    String NO_53 =surveyItem.b5no53 ;
                    String NO_54 =surveyItem.b5no54 ;
                    String NO_55 =surveyItem.b5no55 ;
                    String NO_56 =surveyItem.b5no56 ;
                    String NO_57 =surveyItem.b5no57 ;
                    String NO_58 =surveyItem.b5no58 ;
                    String NO_59 =surveyItem.b5no59 ;
                    String NO_60 =surveyItem.b5no60 ;
                    String NO_60B = surveyItem.b5no60B ;
                    String NO_60C  = surveyItem.b5no60C ;
                    String NO_61 = surveyItem.b5no61;
                    String NO_61B = surveyItem.b6no61B ;
                    String NO_61C = surveyItem.b6no61C ;
                    String NO_62 =surveyItem.b6no62 ;
                    String NO_63 =surveyItem.b6no63 ;
                    String NO_64 =surveyItem.b6no64 ;
                    String NO_65 =surveyItem.b6no65 ;
                    String NO_66 =surveyItem.b6no66 ;
                    String NO_67 =surveyItem.b6no67 ;
                    String NO_68 =surveyItem.b6no68 ;
                    String NO_69 =surveyItem.b6no69 ;
                    String NO_70 =surveyItem.b6no70 ;
                    String NO_71 =surveyItem.b6no71 ;
                    String NO_72 =surveyItem.b6no72 ;
                    String NO_73 =surveyItem.b6no73 ;
                    String NO_74 =surveyItem.b6no74 ;
                    String NO_75 =surveyItem.b6no75 ;
                    String NO_76 =surveyItem.b6no76 ;
                    String NO_77 =surveyItem.b6no77 ;
                    String NO_78 =surveyItem.b6no78 ;
                    String NO_79 =surveyItem.b6no79 ;
                    String NO_80 =surveyItem.b6no80 ;
                    String NO_81 =surveyItem.b6no81 ;
                    String NO_82 =surveyItem.b6no82 ;
                    String NO_83 =surveyItem.b6no83 ;
                    String NO_84 =surveyItem.b6no84 ;
                    String NO_85 =surveyItem.b6no85 ;
                    String NO_86 =surveyItem.b6no86 ;
                    String NO_87 =surveyItem.b6no87 ;
                    String NO_88 =surveyItem.b6no88 ;
                    String NO_89 =surveyItem.b6no89 ;
                    String NO_90 =surveyItem.b6no90 ;
                    String NO_91 =surveyItem.b6no91 ;
                    String NO_92 =surveyItem.b6no92 ;
                    String NO_93 =surveyItem.b6no93 ;
                    String NO_94 =surveyItem.b6no94 ;
                    String NO_95 =surveyItem.b6no95 ;
                    String NO_96 =surveyItem.b6no96 ;
                    String NO_97 =surveyItem.b6no97 ;
                    String NO_98 =surveyItem.b6no98 ;
                    String NO_99 =surveyItem.b6no99 ;
                    String NO_100 = surveyItem.b6no100;
                    String NO_101 = surveyItem.b7no101;
                    String NO_102 = surveyItem.b7no102;
                    String NO_103 = surveyItem.b7no103;
                    String NO_104 = surveyItem.b7no104;
                    String NO_105 = surveyItem.b7no105;
                    String NO_106 = surveyItem.b7no106;
                    String NO_107 = surveyItem.b7no107;
                    String NO_108 = surveyItem.b7no108;
                    String NO_109 = surveyItem.b7no109;
                    String NO_110 = surveyItem.b7no110;
                    String NO_111 = surveyItem.b7no111;
                    String NO_112 = surveyItem.b7no112;
                    String NO_113 = surveyItem.b7no113;
                    String NO_114 = surveyItem.b7no114;
                    String NO_115 = surveyItem.b7no115;
                    String NO_116 = surveyItem.b7no116;
                    String NO_117 = surveyItem.b7no117;
                    String NO_118 = surveyItem.b7no118;
                    String NO_119 = surveyItem.b7no119;
                    String NO_120 = surveyItem.b7no120;
                    String NO_121 = surveyItem.b8no121;
                    String NO_122 = surveyItem.b8no122;
                    String NO_123 = surveyItem.b8no123;
                    String NO_124 = surveyItem.b8no124;
                    String NO_125 = surveyItem.b8no125;
                    String NO_126 = surveyItem.b8no126;
                    String NO_127 = surveyItem.b8no127;
                    String NO_128 = surveyItem.b9no128;
                    String NO_129 = surveyItem.b10no129;
                    String NO_130 = surveyItem.b11no130;
                    String NO_131 = surveyItem.b11no131;
                    String NO_132 = surveyItem.b11no132;
                    String NO_133 = surveyItem.b11no133;
                    String NO_134 = surveyItem.b12no134;
                    String NO_135 = surveyItem.b12no135;

                final SurveyResponse[] result = new SurveyResponse[1];

                SurveyRequest surveyRequest = new SurveyRequest();
                surveyRequest.userID = userID;
                surveyRequest.accessToken = accessToken;
                surveyRequest.kota = kota ;
                surveyRequest.tipeSurvey = tipeSurvey ;
                surveyRequest.deviceSurveyID = deviceSurveyID ;
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
                                        SurveyEntity deletedSurvey = realm.where(SurveyEntity.class).equalTo("deviceSurveyID", surveyItem.deviceSurveyID).findFirst();
                                        realm.beginTransaction();
                                        deletedSurvey.deleteFromRealm();
                                        realm.commitTransaction();
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

                }

                dialog.dismiss();

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
