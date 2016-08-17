package com.smartfren.instrat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import com.smartfren.instrat.R;

public class Blok6Activity extends BaseStepsActivity {

    //61b
    private CheckBox _cbxBSimpati;
    private CheckBox _cbxBKartuAs;
    private CheckBox _cbxBKartuLoop;
    private CheckBox _cbxBBIM3;
    private CheckBox _cbxBMentari;
    private CheckBox _cbxBXL;
    private CheckBox _cbxBAxis;
    private CheckBox _cbxBTri;
    private CheckBox _cbxBSmartfren;
    private CheckBox _cbxBEsia;

    //61c
    private CheckBox _cbxCSimpati;
    private CheckBox _cbxCKartuAs;
    private CheckBox _cbxCKartuLoop;
    private CheckBox _cbxCBIM3;
    private CheckBox _cbxCMentari;
    private CheckBox _cbxCXL;
    private CheckBox _cbxCAxis;
    private CheckBox _cbxCTri;
    private CheckBox _cbxCSmartfren;
    private CheckBox _cbxCBolt;

    //62
    private CheckBox _cbxSamsung;
    private CheckBox _cbxBlackBerry;
    private CheckBox _cbxNokia;
    private CheckBox _cbxLenovo;
    private CheckBox _cbxAdvan;
    private CheckBox _cbxSony;
    private CheckBox _cbxIphone;
    private CheckBox _cbxMito;
    private CheckBox _cbxLG;
    private CheckBox _cbxHTC;
    private CheckBox _cbxPolytron;
    private CheckBox _cbxOppo;
    private CheckBox _cbxEvercross;
    private CheckBox _cbxAsus;
    private CheckBox _cbxAcer;
    private CheckBox _cbxXiaomi;
    private CheckBox _cbxHiSense;

    //63 Samsung
    private CheckBox _cbxSamsungGalaxyYoung2;
    private CheckBox _cbxSamsungGalaxyJ1;
    private CheckBox _cbxSamsungGalaxyJ2;
    private CheckBox _cbxSamsungGalaxyJ3;
    private CheckBox _cbxSamsungGalaxyJ5;
    private CheckBox _cbxSamsungGalaxyJ7;
    private CheckBox _cbxSamsungGalaxyJ1Ace;
    private CheckBox _cbxSamsungGalaxyA3;
    private CheckBox _cbxSamsungGalaxyA5;
    private CheckBox _cbxSamsungGalaxyA7;
    private CheckBox _cbxSamsungGalaxyVPlus;
    private CheckBox _cbxSamsungGalaxyNote5;
    private CheckBox _cbxSamsungGalaxyS6;
    private CheckBox _cbxSamsungGalaxyS5;
    private CheckBox _cbxSamsungGalaxyS7;
    private CheckBox _cbxSamsungGalaxyS7Edge;
    private CheckBox _cbxSamsungOther;

    private EditText _txtSamsungOtherValue;

    //69 Lenovo
    private CheckBox _cbxLenovoA6000;
    private CheckBox _cbxLenovoA6000Plus;
    private CheckBox _cbxLenovoA7000;
    private CheckBox _cbxLenovoP70;
    private CheckBox _cbxLenovoOther;

    private EditText _txtLenovoOtherValue;

    //71 Advan
    private CheckBox _cbxAdvanS35H;
    private CheckBox _cbxAdvanS35D;
    private CheckBox _cbxAdvanS35E;
    private CheckBox _cbxAdvanOther;

    private EditText _txtAdvanOtherValue;

    //73
    private CheckBox _cbxXperiaC5;
    private CheckBox _cbxXperiaE4;
    private CheckBox _cbxXperiaM5;
    private CheckBox _cbxXperiaM4;
    private CheckBox _cbxXperiaOther;

    private EditText _txtXperiaOtherValue;

    //79
    private CheckBox _cbxLGG4Dual;
    private CheckBox _cbxLGMagna;
    private CheckBox _cbxLGG4Stylus;
    private CheckBox _cbxLGOther;

    private EditText _txtLGOtherValue;

    //85
    private CheckBox _cbxOPPOMirror5;
    private CheckBox _cbxOPPOJoy3;
    private CheckBox _cbxOPPOJoyPlus;
    private CheckBox _cbxOPPONeo3;
    private CheckBox _cbxOPPONeo5;
    private CheckBox _cbxOPPOOther;

    private EditText _txtOPPOOtherValue;

    //87
    private CheckBox _cbxEvercrossA33A;
    private CheckBox _cbxEvercrossA5P;
    private CheckBox _cbxEvercrossA21B;
    private CheckBox _cbxEvercrossA35B;
    private CheckBox _cbxEvercrossWinner;
    private CheckBox _cbxEvercrossA54;
    private CheckBox _cbxEvercrossOther;

    private EditText _txtEvercrossOtherValue;

    //89
    private CheckBox _cbxAsusZenfone2Laser8;
    private CheckBox _cbxAsusZenfone2Laser16;
    private CheckBox _cbxAsusZenfoneGO;
    private CheckBox _cbxAsusZenfone4S;
    private CheckBox _cbxAsusNewZenfone4S;
    private CheckBox _cbxAsusZenfone2ZE551ML;
    private CheckBox _cbxAsusOther;

    private EditText _txtAsusOtherValue;

    //91
    private CheckBox _cbxAcerZ220;
    private CheckBox _cbxAcerZ520;
    private CheckBox _cbxAcerOther;

    private EditText _txtAcerOtherValue;

    //93
    private CheckBox _cbxXiaomiREDMI2Prime;
    private CheckBox _cbxXiaomiREDMI28GB;
    private CheckBox _cbxXiaomiREDMI216GB;
    private CheckBox _cbxXiaomiMi4I;
    private CheckBox _cbxXiaomiOther;

    private EditText _txtXiaomiValue;

    //96
    private CheckBox _cbxHiSensePureShot;
    private CheckBox _cbxHiSensePureShotPlus;
    private CheckBox _cbxHiSenseOther;

    private EditText _txtHiSenseOtherValue;

    //Exist or Non Exist Radio Group
    private RadioGroup _rdgBlackBerryExist;
    private RadioGroup _rdgNokiaExist;
    private RadioGroup _rdgIphoneExist;
    private RadioGroup _rdgHTCExist;
    private RadioGroup _rdgPolytronExist;
    private RadioGroup _rdgTelFlashExist;
    private RadioGroup _rdgHuwaweiExist;
    private RadioGroup _rdgZTEExist;
    private RadioGroup _rdgBoltExist;

    //Total count
    private EditText _txtTotalTypeSamsung;
    private EditText _txtTotalTypeBlackBerry;
    private EditText _txtTotalTypeNokia;
    private EditText _txtTotalTypeLenovo;
    private EditText _txtTotalTypeAdvan;
    private EditText _txtTotalTypeSony;
    private EditText _txtTotalTypeIphone;
    private EditText _txtTotalTypeMito;
    private EditText _txtTotalTypeLG;
    private EditText _txtTotalTypeHTC;
    private EditText _txtTotalTypePolytron;
    private EditText _txtTotalTypeOppo;
    private EditText _txtTotalTypeEvercross;
    private EditText _txtTotalTypeAsus;
    private EditText _txtTotalTypeAcer;
    private EditText _txtTotalTypeXiaomi;
    private EditText _txtTotalTypeHiSense;


    private String _no_61BValue;
    private String _no_61CValue;
    private String _no_62Value;
    private String _no_63Value;
    private String _no_64Value;
    private String _no_65Value;
    private String _no_66Value;
    private String _no_67Value;
    private String _no_68Value;
    private String _no_69Value;
    private String _no_70Value;
    private String _no_71Value;
    private String _no_72Value;
    private String _no_73Value;
    private String _no_74Value;
    private String _no_75Value;
    private String _no_76Value;
    private String _no_77Value;
    private String _no_78Value;
    private String _no_79Value;
    private String _no_80Value;
    private String _no_81Value;
    private String _no_82Value;
    private String _no_83Value;
    private String _no_84Value;
    private String _no_85Value;
    private String _no_86Value;
    private String _no_87Value;
    private String _no_88Value;
    private String _no_89Value;
    private String _no_90Value;
    private String _no_91Value;
    private String _no_92Value;
    private String _no_93Value;
    private String _no_94Value;
    private String _no_95Value;
    private String _no_96Value;
    private String _no_97Value;
    private String _no_98Value;
    private String _no_99Value;
    private String _no_10Value;

    private Button _btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block6);

        //checkboxes

        _cbxBSimpati =  (CheckBox) findViewById(R.id.cbxBSimpati);
        _cbxBKartuAs=  (CheckBox) findViewById(R.id.cbxBKartuAS);
        _cbxBKartuLoop=  (CheckBox) findViewById(R.id.cbxBKartuLoop);
        _cbxBBIM3=  (CheckBox) findViewById(R.id.cbxBIm3);
        _cbxBMentari=  (CheckBox) findViewById(R.id.cbxBMentari);
        _cbxBXL=  (CheckBox) findViewById(R.id.cbxBXL);
        _cbxBAxis=  (CheckBox) findViewById(R.id.cbxBAxis);
        _cbxBTri=  (CheckBox) findViewById(R.id.cbxBTri);
        _cbxBSmartfren=  (CheckBox) findViewById(R.id.cbxBSmartfren);
        _cbxBEsia=  (CheckBox) findViewById(R.id.cbxBEsia);


        _cbxCSimpati=  (CheckBox) findViewById(R.id.cbxCSimpati);
        _cbxCKartuAs=  (CheckBox) findViewById(R.id.cbxCKartuAS);
        _cbxCKartuLoop=  (CheckBox) findViewById(R.id.cbxCKartuLoop);
        _cbxCBIM3=  (CheckBox) findViewById(R.id.cbxCIm3);
        _cbxCMentari=  (CheckBox) findViewById(R.id.cbxCMentari);
        _cbxCXL=  (CheckBox) findViewById(R.id.cbxCXL);
        _cbxCAxis=  (CheckBox) findViewById(R.id.cbxCAxis);
        _cbxCTri=  (CheckBox) findViewById(R.id.cbxCTri);
        _cbxCSmartfren=  (CheckBox) findViewById(R.id.cbxCSmartfren);
        _cbxCBolt=  (CheckBox) findViewById(R.id.cbxCBolt);


        _cbxSamsung =  (CheckBox) findViewById(R.id.cbxSamsung);
        _cbxBlackBerry =  (CheckBox) findViewById(R.id.cbxBlackBerry);
        _cbxNokia =  (CheckBox) findViewById(R.id.cbxNokia);
        _cbxLenovo =  (CheckBox) findViewById(R.id.cbxLenovo);
        _cbxAdvan =  (CheckBox) findViewById(R.id.cbxAdvan);
        _cbxSony =  (CheckBox) findViewById(R.id.cbxSony);
        _cbxIphone =  (CheckBox) findViewById(R.id.cbxiPhone);
        _cbxMito =  (CheckBox) findViewById(R.id.cbxMito);
        _cbxLG =  (CheckBox) findViewById(R.id.cbxLG);
        _cbxHTC =  (CheckBox) findViewById(R.id.cbxHTC);
        _cbxPolytron =  (CheckBox) findViewById(R.id.cbxPolytron);
        _cbxOppo =  (CheckBox) findViewById(R.id.cbxOPPO);
        _cbxEvercross =  (CheckBox) findViewById(R.id.cbxEverCross);
        _cbxAsus =  (CheckBox) findViewById(R.id.cbxAsus);
        _cbxAcer =  (CheckBox) findViewById(R.id.cbxAcer);
        _cbxXiaomi =  (CheckBox) findViewById(R.id.cbxXiaomi);
        _cbxHiSense =  (CheckBox) findViewById(R.id.cbxHiSense);


        _cbxSamsungGalaxyYoung2 = (CheckBox) findViewById(R.id.cbxGlxYoung2);
        _cbxSamsungGalaxyJ1 = (CheckBox) findViewById(R.id.cbxGlxJ1);
        _cbxSamsungGalaxyJ2 = (CheckBox) findViewById(R.id.cbxGlxJ2);
        _cbxSamsungGalaxyJ3 = (CheckBox) findViewById(R.id.cbxGlxJ3);
        _cbxSamsungGalaxyJ5 = (CheckBox) findViewById(R.id.cbxGlxJ5);
        _cbxSamsungGalaxyJ7 = (CheckBox) findViewById(R.id.cbxGlxJ7);
        _cbxSamsungGalaxyJ1Ace = (CheckBox) findViewById(R.id.cbxGlxJ1Ace);
        _cbxSamsungGalaxyA3 = (CheckBox) findViewById(R.id.cbxGlxA3);
        _cbxSamsungGalaxyA5 = (CheckBox) findViewById(R.id.cbxGlxA5);
        _cbxSamsungGalaxyA7 = (CheckBox) findViewById(R.id.cbxGlxA7);
        _cbxSamsungGalaxyVPlus = (CheckBox) findViewById(R.id.cbxGlxVPlus);
        _cbxSamsungGalaxyNote5 = (CheckBox) findViewById(R.id.cbxGlxNote5);
        _cbxSamsungGalaxyS6 = (CheckBox) findViewById(R.id.cbxGlxS6);
        _cbxSamsungGalaxyS7 = (CheckBox) findViewById(R.id.cbxGlxS7);
        _cbxSamsungGalaxyS7Edge = (CheckBox) findViewById(R.id.cbxGlxS7Edge);
        _cbxSamsungOther = (CheckBox) findViewById(R.id.cbxSamsungOther);

        _txtSamsungOtherValue = (EditText) findViewById(R.id.txtSamsungOtherValue);


        _cbxLenovoA6000 = (CheckBox) findViewById(R.id.cbxLenovoA6000);
        _cbxLenovoA6000Plus = (CheckBox) findViewById(R.id.cbxLenovoA6000PLUS);
        _cbxLenovoA7000 = (CheckBox) findViewById(R.id.cbxLenovoA7000);
        _cbxLenovoP70 = (CheckBox) findViewById(R.id.cbxLenovoP7016GBLTE);
        _cbxLenovoOther = (CheckBox) findViewById(R.id.cbxLenovoOther);

        _txtLenovoOtherValue = (EditText) findViewById(R.id.txtLenovoOtherValue);

        _cbxAdvanS35H = (CheckBox) findViewById(R.id.cbxAdvanVANDROIDS35H);
        _cbxAdvanS35D = (CheckBox) findViewById(R.id.cbxAdvanVANDROIDS35D);
        _cbxAdvanS35E = (CheckBox) findViewById(R.id.cbxAdvanVANDROIDS35E);
        _cbxAdvanOther = (CheckBox) findViewById(R.id.cbxAdvanOther);

        _txtAdvanOtherValue = (EditText) findViewById(R.id.txtAdvanOtherValue);


        _cbxXperiaC5 = (CheckBox) findViewById(R.id.cbxSonyXperiaC5);
        _cbxXperiaE4 = (CheckBox) findViewById(R.id.cbxSonyXperiaE4);
        _cbxXperiaM5 = (CheckBox) findViewById(R.id.cbxSonyXpreiaM5Dual);
        _cbxXperiaM4 = (CheckBox) findViewById(R.id.cbxSonyXperiaAQUA);
        _cbxXperiaOther = (CheckBox) findViewById(R.id.cbxSonyOther);

        _txtXperiaOtherValue = (EditText) findViewById(R.id.txtSonyOtherValue);


        _cbxLGG4Dual = (CheckBox) findViewById(R.id.cbxLGG4Dual);
        _cbxLGMagna = (CheckBox) findViewById(R.id.cbxLGMagna);
        _cbxLGG4Stylus = (CheckBox) findViewById(R.id.cbxLGG4Stylus);
        _cbxLGOther = (CheckBox) findViewById(R.id.cbxLGOther);

        _txtLGOtherValue = (EditText) findViewById(R.id.txtLGOtherValue);


        _cbxOPPOMirror5 = (CheckBox) findViewById(R.id.cbxOppoMirror5);
        _cbxOPPOJoy3 = (CheckBox) findViewById(R.id.cbxOppoJoy3);
        _cbxOPPOJoyPlus = (CheckBox) findViewById(R.id.cbxOppoJoyPlus);
        _cbxOPPONeo3 = (CheckBox) findViewById(R.id.cbxOppoNeo3);
        _cbxOPPONeo5 = (CheckBox) findViewById(R.id.cbxOppoNeo5);
        _cbxOPPOOther = (CheckBox) findViewById(R.id.cbxOppoOther);

        _txtOPPOOtherValue = (EditText) findViewById(R.id.txtOppoOtherValue);


        _cbxEvercrossA33A = (CheckBox) findViewById(R.id.cbxEvercrossA33a);
        _cbxEvercrossA5P = (CheckBox) findViewById(R.id.cbxEvercrossA5p);
        _cbxEvercrossA21B = (CheckBox) findViewById(R.id.cbxEvercrossA12B);
        _cbxEvercrossA35B = (CheckBox) findViewById(R.id.cbxEvercrossA53b);
        _cbxEvercrossWinner = (CheckBox) findViewById(R.id.cbxEvercrossWinner);
        _cbxEvercrossA54 = (CheckBox) findViewById(R.id.cbxEvercrossA54Jump);
        _cbxEvercrossOther = (CheckBox) findViewById(R.id.cbxEvercrossOther);

        _txtEvercrossOtherValue = (EditText) findViewById(R.id.txtEvercrossOtherValue);


        _cbxAsusZenfone2Laser8 = (CheckBox) findViewById(R.id.cbxAsusZen2S8);
        _cbxAsusZenfone2Laser16 = (CheckBox) findViewById(R.id.cbxAsusZen2S16);
        _cbxAsusZenfoneGO = (CheckBox) findViewById(R.id.cbxAsusZenGo);
        _cbxAsusZenfone4S = (CheckBox) findViewById(R.id.cbxAsusZen4S);
        _cbxAsusNewZenfone4S = (CheckBox) findViewById(R.id.cbxAsusNewZen4S);
        _cbxAsusZenfone2ZE551ML = (CheckBox) findViewById(R.id.cbxAsusZen2ZE551);
        _cbxAsusOther = (CheckBox) findViewById(R.id.cbxAsusOther);

        _txtAsusOtherValue = (EditText) findViewById(R.id.txtAsusOterValue);


        _cbxAcerZ220 = (CheckBox) findViewById(R.id.cbxAcerLiqZ220);
        _cbxAcerZ520 = (CheckBox) findViewById(R.id.cbxAcerLiqZ520);
        _cbxAcerOther = (CheckBox) findViewById(R.id.cbxAcerOther);

        _txtAcerOtherValue = (EditText) findViewById(R.id.txtAcerOterValue);


        _cbxXiaomiREDMI2Prime = (CheckBox) findViewById(R.id.cbxXiaomiMI2Prime);
        _cbxXiaomiREDMI28GB = (CheckBox) findViewById(R.id.cbxXiaomiMI28);
        _cbxXiaomiREDMI216GB = (CheckBox) findViewById(R.id.cbxXiaomiMi216);
        _cbxXiaomiMi4I = (CheckBox) findViewById(R.id.cbxXiaomiMi4I);
        _cbxXiaomiOther = (CheckBox) findViewById(R.id.cbxXiaomiOther);

        _txtXiaomiValue = (EditText) findViewById(R.id.txtXiaomiOterValue);


        _cbxHiSensePureShot = (CheckBox) findViewById(R.id.cbxHiSensePure);
        _cbxHiSensePureShotPlus = (CheckBox) findViewById(R.id.cbxHiSensePurePlus);
        _cbxHiSenseOther = (CheckBox) findViewById(R.id.cbxHiSenseOther);

        _txtHiSenseOtherValue = (EditText) findViewById(R.id.txtHiSenseOterValue);


        //Exist or Non Exist Radio Group
        _rdgBlackBerryExist = (RadioGroup) findViewById(R.id.radGrIsBlackBerryExist);
        _rdgNokiaExist = (RadioGroup) findViewById(R.id.radGrIsNokiaExist);
        _rdgIphoneExist = (RadioGroup) findViewById(R.id.radGrIsIphoneExist);
        _rdgHTCExist = (RadioGroup) findViewById(R.id.radGrIsHTCExist);
        _rdgPolytronExist = (RadioGroup) findViewById(R.id.radGrIsPolytronExist);
        _rdgTelFlashExist = (RadioGroup) findViewById(R.id.radGrIsTelkomselFlashExist);
        _rdgHuwaweiExist = (RadioGroup) findViewById(R.id.radGrIsHuaweiExist);
        _rdgZTEExist = (RadioGroup) findViewById(R.id.radGrIsZTEExist);
        _rdgBoltExist = (RadioGroup) findViewById(R.id.radGrIsBoltExist);

        //Total count
        _txtTotalTypeSamsung= (EditText) findViewById(R.id.txtTotalSamsungTypeValue);
        _txtTotalTypeBlackBerry = (EditText) findViewById(R.id.txtTotalBlackBerryTypeValue);
        _txtTotalTypeNokia = (EditText) findViewById(R.id.txtTotalNokiaTypeValue);
        _txtTotalTypeLenovo = (EditText) findViewById(R.id.txtTotalLenovoTypeValue);
        _txtTotalTypeAdvan = (EditText) findViewById(R.id.txtTotalAdvanTypeValue);
        _txtTotalTypeSony = (EditText) findViewById(R.id.txtTotalSonyTypeValue);
        _txtTotalTypeIphone = (EditText) findViewById(R.id.txtTotalIphoneTypeValue);
        _txtTotalTypeMito = (EditText) findViewById(R.id.txtTotalMitoTypeValue);
        _txtTotalTypeLG = (EditText) findViewById(R.id.txtTotalLGTypeValue);
        _txtTotalTypeHTC = (EditText) findViewById(R.id.txtTotalHTCTypeValue);
        _txtTotalTypePolytron = (EditText) findViewById(R.id.txtTotalPolytronTypeValue);
        _txtTotalTypeOppo = (EditText) findViewById(R.id.txtTotalOppoTypeValue);
        _txtTotalTypeEvercross = (EditText) findViewById(R.id.txtTotalEvercrossTypeValue);
        _txtTotalTypeAsus = (EditText) findViewById(R.id.txtTotalAsusTypeValue);
        _txtTotalTypeAcer= (EditText) findViewById(R.id.txtTotalAcerTypeValue);
        _txtTotalTypeXiaomi = (EditText) findViewById(R.id.txtTotalXiaomiTypeValue);
        _txtTotalTypeHiSense = (EditText) findViewById(R.id.txtTotalHiSenseTypeValue);


        _cbxSamsung.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _cbxSamsungGalaxyYoung2.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyJ1.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyJ2.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyJ3.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyJ5.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyJ7.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyJ1Ace.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyA3.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyA5.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyA7.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyVPlus.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyNote5.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyS6.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyS7.setVisibility(View.VISIBLE);
                    _cbxSamsungGalaxyS7Edge.setVisibility(View.VISIBLE);
                    _cbxSamsungOther.setVisibility(View.VISIBLE);
                }
                else
                {
                    _cbxSamsungGalaxyYoung2.setVisibility(View.GONE);
                    _cbxSamsungGalaxyJ1.setVisibility(View.GONE);
                    _cbxSamsungGalaxyJ2.setVisibility(View.GONE);
                    _cbxSamsungGalaxyJ3.setVisibility(View.GONE);
                    _cbxSamsungGalaxyJ5.setVisibility(View.GONE);
                    _cbxSamsungGalaxyJ7.setVisibility(View.GONE);
                    _cbxSamsungGalaxyJ1Ace.setVisibility(View.GONE);
                    _cbxSamsungGalaxyA3.setVisibility(View.GONE);
                    _cbxSamsungGalaxyA5.setVisibility(View.GONE);
                    _cbxSamsungGalaxyA7.setVisibility(View.GONE);
                    _cbxSamsungGalaxyVPlus.setVisibility(View.GONE);
                    _cbxSamsungGalaxyNote5.setVisibility(View.GONE);
                    _cbxSamsungGalaxyS6.setVisibility(View.GONE);
                    _cbxSamsungGalaxyS7.setVisibility(View.GONE);
                    _cbxSamsungGalaxyS7Edge.setVisibility(View.GONE);
                    _cbxSamsungOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxLenovo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxLenovoA6000.setVisibility(View.VISIBLE);
                    _cbxLenovoA6000Plus.setVisibility(View.VISIBLE);
                    _cbxLenovoA7000.setVisibility(View.VISIBLE);
                    _cbxLenovoP70.setVisibility(View.VISIBLE);
                    _cbxLenovoOther.setVisibility(View.VISIBLE);
                }else {
                    _cbxLenovoA6000.setVisibility(View.GONE);
                    _cbxLenovoA6000Plus.setVisibility(View.GONE);
                    _cbxLenovoA7000.setVisibility(View.GONE);
                    _cbxLenovoP70.setVisibility(View.GONE);
                    _cbxLenovoOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxAdvan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxAdvanS35H.setVisibility(View.VISIBLE);
                    _cbxAdvanS35D.setVisibility(View.VISIBLE);
                    _cbxAdvanS35E.setVisibility(View.VISIBLE);
                    _cbxAdvanOther.setVisibility(View.VISIBLE);
                }else {
                    _cbxAdvanS35H.setVisibility(View.GONE);
                    _cbxAdvanS35D.setVisibility(View.GONE);
                    _cbxAdvanS35E.setVisibility(View.GONE);
                    _cbxAdvanOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxSony.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    _cbxXperiaC5.setVisibility(View.VISIBLE);
                    _cbxXperiaE4.setVisibility(View.VISIBLE);
                    _cbxXperiaM5.setVisibility(View.VISIBLE);
                    _cbxXperiaM4.setVisibility(View.VISIBLE);
                    _cbxXperiaOther.setVisibility(View.VISIBLE);
                } else {
                    _cbxXperiaC5.setVisibility(View.GONE);
                    _cbxXperiaE4.setVisibility(View.GONE);
                    _cbxXperiaM5.setVisibility(View.GONE);
                    _cbxXperiaM4.setVisibility(View.GONE);
                    _cbxXperiaOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxLG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    _cbxLGG4Dual.setVisibility(View.VISIBLE);
                    _cbxLGMagna.setVisibility(View.VISIBLE);
                    _cbxLGG4Stylus.setVisibility(View.VISIBLE);
                    _cbxLGOther.setVisibility(View.VISIBLE);
                } else {
                    _cbxLGG4Dual.setVisibility(View.GONE);
                    _cbxLGMagna.setVisibility(View.GONE);
                    _cbxLGG4Stylus.setVisibility(View.GONE);
                    _cbxLGOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxOppo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxOPPOMirror5.setVisibility(View.VISIBLE);
                    _cbxOPPOJoy3.setVisibility(View.VISIBLE);
                    _cbxOPPOJoyPlus.setVisibility(View.VISIBLE);
                    _cbxOPPONeo3.setVisibility(View.VISIBLE);
                    _cbxOPPONeo5.setVisibility(View.VISIBLE);
                    _cbxOPPOOther.setVisibility(View.VISIBLE);

                }else {
                    _cbxOPPOMirror5.setVisibility(View.GONE);
                    _cbxOPPOJoy3.setVisibility(View.GONE);
                    _cbxOPPOJoyPlus.setVisibility(View.GONE);
                    _cbxOPPONeo3.setVisibility(View.GONE);
                    _cbxOPPONeo5.setVisibility(View.GONE);
                    _cbxOPPOOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxEvercross.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxEvercrossA33A.setVisibility(View.VISIBLE);
                    _cbxEvercrossA5P.setVisibility(View.VISIBLE);
                    _cbxEvercrossA21B.setVisibility(View.VISIBLE);
                    _cbxEvercrossA35B.setVisibility(View.VISIBLE);
                    _cbxEvercrossWinner.setVisibility(View.VISIBLE);
                    _cbxEvercrossA54.setVisibility(View.VISIBLE);
                    _cbxEvercrossOther.setVisibility(View.VISIBLE);

                }else {
                    _cbxEvercrossA33A.setVisibility(View.GONE);
                    _cbxEvercrossA5P.setVisibility(View.GONE);
                    _cbxEvercrossA21B.setVisibility(View.GONE);
                    _cbxEvercrossA35B.setVisibility(View.GONE);
                    _cbxEvercrossWinner.setVisibility(View.GONE);
                    _cbxEvercrossA54.setVisibility(View.GONE);
                    _cbxEvercrossOther.setVisibility(View.GONE);

                }
            }
        });

        _cbxAsus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxAsusZenfone2Laser8.setVisibility(View.VISIBLE);
                    _cbxAsusZenfone2Laser16.setVisibility(View.VISIBLE);
                    _cbxAsusZenfoneGO.setVisibility(View.VISIBLE);
                    _cbxAsusZenfone4S.setVisibility(View.VISIBLE);
                    _cbxAsusNewZenfone4S.setVisibility(View.VISIBLE);
                    _cbxAsusZenfone2ZE551ML.setVisibility(View.VISIBLE);
                    _cbxAsusOther.setVisibility(View.VISIBLE);
                }else {
                    _cbxAsusZenfone2Laser8.setVisibility(View.GONE);
                    _cbxAsusZenfone2Laser16.setVisibility(View.GONE);
                    _cbxAsusZenfoneGO.setVisibility(View.GONE);
                    _cbxAsusZenfone4S.setVisibility(View.GONE);
                    _cbxAsusNewZenfone4S.setVisibility(View.GONE);
                    _cbxAsusZenfone2ZE551ML.setVisibility(View.GONE);
                    _cbxAsusOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxAcer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxAcerZ220.setVisibility(View.VISIBLE);
                    _cbxAcerZ520.setVisibility(View.VISIBLE);
                    _cbxAcerOther.setVisibility(View.VISIBLE);
                }else {
                    _cbxAcerZ220.setVisibility(View.GONE);
                    _cbxAcerZ520.setVisibility(View.GONE);
                    _cbxAcerOther.setVisibility(View.GONE);
                }
            }
        });
        _cbxXiaomi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxXiaomiREDMI2Prime.setVisibility(View.VISIBLE);
                    _cbxXiaomiREDMI28GB.setVisibility(View.VISIBLE);
                    _cbxXiaomiREDMI216GB.setVisibility(View.VISIBLE);
                    _cbxXiaomiMi4I.setVisibility(View.VISIBLE);
                    _cbxXiaomiOther.setVisibility(View.VISIBLE);
                }else {
                    _cbxXiaomiREDMI2Prime.setVisibility(View.GONE);
                    _cbxXiaomiREDMI28GB.setVisibility(View.GONE);
                    _cbxXiaomiREDMI216GB.setVisibility(View.GONE);
                    _cbxXiaomiMi4I.setVisibility(View.GONE);
                    _cbxXiaomiOther.setVisibility(View.GONE);
                }
            }
        });

        _cbxHiSense.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    _cbxHiSensePureShot.setVisibility(View.VISIBLE);
                    _cbxHiSensePureShotPlus.setVisibility(View.VISIBLE);
                    _cbxHiSenseOther.setVisibility(View.VISIBLE);
                }else {
                    _cbxHiSensePureShot.setVisibility(View.GONE);
                    _cbxHiSensePureShotPlus.setVisibility(View.GONE);
                    _cbxHiSenseOther.setVisibility(View.GONE);
                }
            }
        });


        _btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Intent intent = new Intent(Blok6Activity.this, Blok7Activity.class);
                intent.putExtra("NO_61B", _no_61BValue);
                intent.putExtra("NO_61C", _no_61CValue);
                intent.putExtra("NO_62",_no_62Value);
                intent.putExtra("NO_63",_no_63Value);
                intent.putExtra("NO_64",_no_64Value);
                intent.putExtra("NO_65",_no_65Value);
                intent.putExtra("NO_66",_no_66Value);
                intent.putExtra("NO_67",_no_67Value);
                intent.putExtra("NO_68",_no_68Value);
                intent.putExtra("NO_69",_no_69Value);
                intent.putExtra("NO_70",_no_70Value);
                intent.putExtra("NO_71",_no_71Value);
                intent.putExtra("NO_72",_no_72Value);
                intent.putExtra("NO_73",_no_73Value);
                intent.putExtra("NO_74",_no_74Value);
                intent.putExtra("NO_75",_no_75Value);
                intent.putExtra("NO_76",_no_76Value);
                intent.putExtra("NO_77",_no_77Value);
                intent.putExtra("NO_78",_no_78Value);
                intent.putExtra("NO_79",_no_79Value);
                intent.putExtra("NO_80",_no_80Value);
                intent.putExtra("NO_81",_no_81Value);
                intent.putExtra("NO_82",_no_82Value);
                intent.putExtra("NO_83",_no_83Value);
                intent.putExtra("NO_84",_no_84Value);
                intent.putExtra("NO_85",_no_85Value);
                intent.putExtra("NO_86",_no_86Value);
                intent.putExtra("NO_87",_no_87Value);
                intent.putExtra("NO_88",_no_88Value);
                intent.putExtra("NO_89",_no_89Value);
                intent.putExtra("NO_90",_no_90Value);
                intent.putExtra("NO_91",_no_91Value);
                intent.putExtra("NO_92",_no_92Value);
                intent.putExtra("NO_93",_no_93Value);
                intent.putExtra("NO_94",_no_94Value);
                intent.putExtra("NO_95",_no_95Value);
                intent.putExtra("NO_96",_no_96Value);
                intent.putExtra("NO_97",_no_97Value);
                intent.putExtra("NO_98",_no_98Value);
                intent.putExtra("NO_99",_no_99Value);
                intent.putExtra("NO_100", _no_10Value);
            }
        });


    }
}
