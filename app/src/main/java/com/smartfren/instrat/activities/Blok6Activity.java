package com.smartfren.instrat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.Helper;

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

    // cbx labels
    private TextView _txtSamsungLabel;
    private TextView _txtBlackBerryLabel;
    private TextView _txtNokiaLabel;
    private TextView _txtLenovoLabel;
    private TextView _txtAdvanLabel;
    private TextView _txtSonyLabel;
    private TextView _txtIphoneLabel;
    private TextView _txtMitoLabel;
    private TextView _txtLGLabel;
    private TextView _txtHTCLabel;
    private TextView _txtPolytronLabel;
    private TextView _txtOppoLabel;
    private TextView _txtEvercrossLabel;
    private TextView _txtAsusLabel;
    private TextView _txtAcerLabel;
    private TextView _txtXiaomiLabel;
    private TextView _txtHiSenseLabel;

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
    //private CheckBox _cbxSamsungGalaxyS5;
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

    private EditText _txtXiaomiOtherValue;

    //96
    private CheckBox _cbxHiSensePureShot;
    private CheckBox _cbxHiSensePureShotPlus;
    private CheckBox _cbxHiSenseOther;

    private EditText _txtHiSenseOtherValue;

    //Exist or Non Exist Radio Group
    private RadioGroup _rdgBlackBerryExist;
    private RadioGroup _rdgNokiaExist;
    private RadioGroup _rdgIphoneExist;
    private RadioGroup _rdgMitoExist;
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

    //Total count label
    private TextView _txtTotalTypeSamsungLabel;
    private TextView _txtTotalTypeBlackBerryLabel;
    private TextView _txtTotalTypeNokiaLabel;
    private TextView _txtTotalTypeLenovoLabel;
    private TextView _txtTotalTypeAdvanLabel;
    private TextView _txtTotalTypeSonyLabel;
    private TextView _txtTotalTypeIphoneLabel;
    private TextView _txtTotalTypeMitoLabel;
    private TextView _txtTotalTypeLGLabel;
    private TextView _txtTotalTypeHTCLabel;
    private TextView _txtTotalTypePolytronLabel;
    private TextView _txtTotalTypeOppoLabel;
    private TextView _txtTotalTypeEvercrossLabel;
    private TextView _txtTotalTypeAsusLabel;
    private TextView _txtTotalTypeAcerLabel;
    private TextView _txtTotalTypeXiaomiLabel;
    private TextView _txtTotalTypeHiSenseLabel;


    // error checkboxes
    private TextView _error61b;
    private TextView _error61c;
    private TextView _error62;
    private TextView _errorSamsung;
    private TextView _errorLenovo;
    private TextView _errorAdvan;
    private TextView _errorSony;
    private TextView _errorLG;
    private TextView _errorOppo;
    private TextView _errorEvercross;
    private TextView _errorAsus;
    private TextView _errorAcer;
    private TextView _errorXiaomi;
    private TextView _errorHiSense;


    // error text count
    private TextView _errorTotalTypeSamsung;
    private TextView _errorTotalTypeBlackBerry;
    private TextView _errorTotalTypeNokia;
    private TextView _errorTotalTypeLenovo;
    private TextView _errorTotalTypeAdvan;
    private TextView _errorTotalTypeSony;
    private TextView _errorTotalTypeIphone;
    private TextView _errorTotalTypeMito;
    private TextView _errorTotalTypeLG;
    private TextView _errorTotalTypeHTC;
    private TextView _errorTotalTypePolytron;
    private TextView _errorTotalTypeOppo;
    private TextView _errorTotalTypeEvercross;
    private TextView _errorTotalTypeAsus;
    private TextView _errorTotalTypeAcer;
    private TextView _errorTotalTypeXiaomi;
    private TextView _errorTotalTypeHiSense;


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
    private String _no_100Value;
    private Bundle extras;

    protected String GetCheckBoxValue(CheckBox cb, String result)
    {
        if(cb.isChecked())
        {
            result = result + ";"+ cb.getText().toString();
        }
        return result;
    }

    protected String GetEditTextValue(EditText edtxt, String result)
    {
        if(edtxt!= null)
        {
            String text = edtxt.getText().toString();
            if(!text.equals("") && !text.isEmpty()) {
                result = result + ";" + text;
            }
        }

        return result;
    }

    protected String GetRadioGroupValue(RadioGroup rdg, String result)
    {
        int radioButtonID = rdg.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) rdg.findViewById(radioButtonID);
        result = radioButton.getText().toString();

        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_block6);
        extras = getIntent().getExtras();

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

        _txtXiaomiOtherValue = (EditText) findViewById(R.id.txtXiaomiOterValue);


        _cbxHiSensePureShot = (CheckBox) findViewById(R.id.cbxHiSensePure);
        _cbxHiSensePureShotPlus = (CheckBox) findViewById(R.id.cbxHiSensePurePlus);
        _cbxHiSenseOther = (CheckBox) findViewById(R.id.cbxHiSenseOther);

        _txtHiSenseOtherValue = (EditText) findViewById(R.id.txtHiSenseOterValue);


        //Exist or Non Exist Radio Group
        _rdgBlackBerryExist = (RadioGroup) findViewById(R.id.radGrIsBlackBerryExist);
        _rdgNokiaExist = (RadioGroup) findViewById(R.id.radGrIsNokiaExist);
        _rdgIphoneExist = (RadioGroup) findViewById(R.id.radGrIsIphoneExist);
        _rdgMitoExist = (RadioGroup) findViewById(R.id.radGrIsMitoExist);
        _rdgHTCExist = (RadioGroup) findViewById(R.id.radGrIsHTCExist);
        _rdgPolytronExist = (RadioGroup) findViewById(R.id.radGrIsPolytronExist);
        _rdgTelFlashExist = (RadioGroup) findViewById(R.id.radGrIsTelkomselFlashExist);
        _rdgHuwaweiExist = (RadioGroup) findViewById(R.id.radGrIsHuaweiExist);
        _rdgZTEExist = (RadioGroup) findViewById(R.id.radGrIsZTEExist);
        _rdgBoltExist = (RadioGroup) findViewById(R.id.radGrIsBoltExist);


        // radio default value
        _rdgNokiaExist.check(R.id.radIsNokiaExistTrue);
        _rdgBlackBerryExist.check(R.id.radIsBlackBerryExistTrue);
        _rdgIphoneExist.check(R.id.radIsIphoneExistTrue);
        _rdgMitoExist.check(R.id.radIsMitoExistTrue);
        _rdgHTCExist.check(R.id.radIsHTCExistTrue);
        _rdgPolytronExist.check(R.id.radIsPolytronExistTrue);
        _rdgTelFlashExist.check(R.id.radIsTelkomselFlashExistFalse);
        _rdgHuwaweiExist.check(R.id.radIsHuaweiExistFalse);
        _rdgZTEExist.check(R.id.radIsZTEExistFalse);
        _rdgBoltExist.check(R.id.radIsBoltExistFalse);

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

        //Total count label
        _txtTotalTypeSamsungLabel = (TextView) findViewById(R.id.txtTotalSamsungType);
        _txtTotalTypeBlackBerryLabel = (TextView) findViewById(R.id.txtTotalBlackBerryType);
        _txtTotalTypeNokiaLabel = (TextView) findViewById(R.id.txtTotalNokiaType);
        _txtTotalTypeLenovoLabel = (TextView) findViewById(R.id.txtTotalLenovoType);
        _txtTotalTypeAdvanLabel = (TextView) findViewById(R.id.txtTotalAdvanType);
        _txtTotalTypeSonyLabel = (TextView) findViewById(R.id.txtTotalSonyType);
        _txtTotalTypeIphoneLabel = (TextView) findViewById(R.id.txtTotalIphoneType);
        _txtTotalTypeMitoLabel = (TextView) findViewById(R.id.txtTotalMitoType);
        _txtTotalTypeLGLabel = (TextView) findViewById(R.id.txtTotalLGType);
        _txtTotalTypeHTCLabel = (TextView) findViewById(R.id.txtTotalHTCType);
        _txtTotalTypePolytronLabel = (TextView) findViewById(R.id.txtTotalPolytronType);
        _txtTotalTypeOppoLabel = (TextView) findViewById(R.id.txtTotalOppoType);
        _txtTotalTypeEvercrossLabel = (TextView) findViewById(R.id.txtTotalEvercrossType);
        _txtTotalTypeAsusLabel = (TextView) findViewById(R.id.txtTotalAsusType);
        _txtTotalTypeAcerLabel = (TextView) findViewById(R.id.txtTotalAcerType);
        _txtTotalTypeXiaomiLabel = (TextView) findViewById(R.id.txtTotalXiaomiType);
        _txtTotalTypeHiSenseLabel = (TextView) findViewById(R.id.txtTotalHiSenseType);


        //checkboxes error
        _error61b = (TextView) findViewById(R.id.error61b);
        _error61c = (TextView) findViewById(R.id.error61c);
        _error62 = (TextView) findViewById(R.id.error62);
        _errorSamsung = (TextView) findViewById(R.id.errorSamsung);
        _errorLenovo = (TextView) findViewById(R.id.errorLenovo);
        _errorAdvan = (TextView) findViewById(R.id.errorAdvan);
        _errorSony = (TextView) findViewById(R.id.errorSony);
        _errorLG = (TextView) findViewById(R.id.errorLG);
        _errorOppo = (TextView) findViewById(R.id.errorOppo);
        _errorEvercross = (TextView) findViewById(R.id.errorEvercross);
        _errorAsus = (TextView) findViewById(R.id.errorAsus);
        _errorAcer = (TextView) findViewById(R.id.errorAcer);
        _errorXiaomi = (TextView) findViewById(R.id.errorXiaomi);
        _errorHiSense = (TextView) findViewById(R.id.errorHiSense);

        //Total count error
        _errorTotalTypeSamsung = (TextView) findViewById(R.id.errorTotalSamsungTypeValue);
        _errorTotalTypeBlackBerry = (TextView) findViewById(R.id.errorTotalBlackBerryTypeValue);
        _errorTotalTypeNokia = (TextView) findViewById(R.id.errorTotalNokiaTypeValue);
        _errorTotalTypeLenovo = (TextView) findViewById(R.id.errorTotalLenovoTypeValue);
        _errorTotalTypeAdvan = (TextView) findViewById(R.id.errorTotalAdvanTypeValue);
        _errorTotalTypeSony = (TextView) findViewById(R.id.errorTotalSonyTypeValue);
        _errorTotalTypeIphone = (TextView) findViewById(R.id.errorTotalIphoneTypeValue);
        _errorTotalTypeMito = (TextView) findViewById(R.id.errorTotalMitoTypeValue);
        _errorTotalTypeLG = (TextView) findViewById(R.id.errorTotalLGTypeValue);
        _errorTotalTypeHTC = (TextView) findViewById(R.id.errorTotalHTCTypeValue);
        _errorTotalTypePolytron = (TextView) findViewById(R.id.errorTotalPolytronTypeValue);
        _errorTotalTypeOppo = (TextView) findViewById(R.id.errorTotalOppoTypeValue);
        _errorTotalTypeEvercross = (TextView) findViewById(R.id.errorTotalEvercrossTypeValue);
        _errorTotalTypeAsus = (TextView) findViewById(R.id.errorTotalAsusTypeValue);
        _errorTotalTypeAcer = (TextView) findViewById(R.id.errorTotalAcerTypeValue);
        _errorTotalTypeXiaomi = (TextView) findViewById(R.id.errorTotalXiaomiTypeValue);
        _errorTotalTypeHiSense = (TextView) findViewById(R.id.errorTotalHiSenseTypeValue);

        //cbx labels
        _txtSamsungLabel = (TextView) findViewById(R.id.txtSmartphoneSamsung);
        _txtBlackBerryLabel = (TextView) findViewById(R.id.txtIsBlackberryExsist);
        _txtNokiaLabel = (TextView) findViewById(R.id.txtIsNokiaExist);
        _txtLenovoLabel = (TextView) findViewById(R.id.txtLenovoSell);
        _txtAdvanLabel = (TextView) findViewById(R.id.txtAdvanSell);
        _txtSonyLabel = (TextView) findViewById(R.id.txtSonySell);
        _txtIphoneLabel = (TextView) findViewById(R.id.txtIsIphoneExist);
        _txtMitoLabel = (TextView) findViewById(R.id.txtIsMitoExist);
        _txtLGLabel = (TextView) findViewById(R.id.txtLGSell);
        _txtHTCLabel = (TextView) findViewById(R.id.txtIsHTCExist);
        _txtPolytronLabel = (TextView) findViewById(R.id.txtIsPolytronExist);
        _txtOppoLabel = (TextView) findViewById(R.id.txtOppoSell);
        _txtEvercrossLabel = (TextView) findViewById(R.id.txtEvercrossSell);
        _txtAsusLabel = (TextView) findViewById(R.id.txtAsusSell);
        _txtAcerLabel = (TextView) findViewById(R.id.txtAcerSell);
        _txtXiaomiLabel = (TextView) findViewById(R.id.txtXiaomiSell);
        _txtHiSenseLabel = (TextView) findViewById(R.id.txtHiSenseSell);

        //everything is gone on the beginning

        Helper.Hide(_cbxSamsungGalaxyYoung2);
        Helper.Hide(_cbxSamsungGalaxyJ1);
        Helper.Hide(_cbxSamsungGalaxyJ2);
        Helper.Hide(_cbxSamsungGalaxyJ3);
        Helper.Hide(_cbxSamsungGalaxyJ5);
        Helper.Hide(_cbxSamsungGalaxyJ7);
        Helper.Hide(_cbxSamsungGalaxyJ1Ace);
        Helper.Hide(_cbxSamsungGalaxyA3);
        Helper.Hide(_cbxSamsungGalaxyA5);
        Helper.Hide(_cbxSamsungGalaxyA7);
        Helper.Hide(_cbxSamsungGalaxyVPlus);
        Helper.Hide(_cbxSamsungGalaxyNote5);
        Helper.Hide(_cbxSamsungGalaxyS6);
        Helper.Hide(_cbxSamsungGalaxyS7);
        Helper.Hide(_cbxSamsungGalaxyS7Edge);
        Helper.Hide(_cbxSamsungOther);

        Helper.Hide(_cbxLenovoA6000);
        Helper.Hide(_cbxLenovoA6000Plus);
        Helper.Hide(_cbxLenovoA7000);
        Helper.Hide(_cbxLenovoP70);
        Helper.Hide(_cbxLenovoOther);

        Helper.Hide(_cbxAdvanS35H);
        Helper.Hide(_cbxAdvanS35D);
        Helper.Hide(_cbxAdvanS35E);
        Helper.Hide(_cbxAdvanOther);

        Helper.Hide(_cbxXperiaC5);
        Helper.Hide(_cbxXperiaE4);
        Helper.Hide(_cbxXperiaM5);
        Helper.Hide(_cbxXperiaM4);
        Helper.Hide(_cbxXperiaOther);

        Helper.Hide(_cbxLGG4Dual);
        Helper.Hide(_cbxLGMagna);
        Helper.Hide(_cbxLGG4Stylus);
        Helper.Hide(_cbxLGOther);

        Helper.Hide(_cbxOPPOMirror5);
        Helper.Hide(_cbxOPPOJoy3);
        Helper.Hide(_cbxOPPOJoyPlus);
        Helper.Hide(_cbxOPPONeo3);
        Helper.Hide(_cbxOPPONeo5);
        Helper.Hide(_cbxOPPOOther);

        Helper.Hide(_cbxEvercrossA33A);
        Helper.Hide(_cbxEvercrossA5P);
        Helper.Hide(_cbxEvercrossA21B);
        Helper.Hide(_cbxEvercrossA35B);
        Helper.Hide(_cbxEvercrossWinner);
        Helper.Hide(_cbxEvercrossA54);
        Helper.Hide(_cbxEvercrossOther);

        Helper.Hide(_cbxAsusZenfone2Laser8);
        Helper.Hide(_cbxAsusZenfone2Laser16);
        Helper.Hide(_cbxAsusZenfoneGO);
        Helper.Hide(_cbxAsusZenfone4S);
        Helper.Hide(_cbxAsusNewZenfone4S);
        Helper.Hide(_cbxAsusZenfone2ZE551ML);
        Helper.Hide(_cbxAsusOther);

        Helper.Hide(_cbxAcerZ220);
        Helper.Hide(_cbxAcerZ520);
        Helper.Hide(_cbxAcerOther);

        Helper.Hide(_cbxXiaomiREDMI2Prime);
        Helper.Hide(_cbxXiaomiREDMI28GB);
        Helper.Hide(_cbxXiaomiREDMI216GB);
        Helper.Hide(_cbxXiaomiMi4I);
        Helper.Hide(_cbxXiaomiOther);

        Helper.Hide(_cbxHiSensePureShot);
        Helper.Hide(_cbxHiSensePureShotPlus);
        Helper.Hide(_cbxHiSenseOther);

        Helper.Hide(_txtTotalTypeSamsung);
        Helper.Hide(_txtTotalTypeBlackBerry);
        Helper.Hide(_txtTotalTypeNokia);
        Helper.Hide(_txtTotalTypeLenovo);
        Helper.Hide(_txtTotalTypeAdvan);
        Helper.Hide(_txtTotalTypeSony);
        Helper.Hide(_txtTotalTypeIphone);
        Helper.Hide(_txtTotalTypeMito);
        Helper.Hide(_txtTotalTypeLG);
        Helper.Hide(_txtTotalTypeHTC);
        Helper.Hide(_txtTotalTypePolytron);
        Helper.Hide(_txtTotalTypeOppo);
        Helper.Hide(_txtTotalTypeEvercross);
        Helper.Hide(_txtTotalTypeAsus);
        Helper.Hide(_txtTotalTypeAcer);
        Helper.Hide(_txtTotalTypeXiaomi);
        Helper.Hide(_txtTotalTypeHiSense);

        Helper.Hide(_txtTotalTypeSamsungLabel);
        Helper.Hide(_txtTotalTypeBlackBerryLabel);
        Helper.Hide(_txtTotalTypeNokiaLabel);
        Helper.Hide(_txtTotalTypeLenovoLabel);
        Helper.Hide(_txtTotalTypeAdvanLabel);
        Helper.Hide(_txtTotalTypeSonyLabel);
        Helper.Hide(_txtTotalTypeIphoneLabel);
        Helper.Hide(_txtTotalTypeMitoLabel);
        Helper.Hide(_txtTotalTypeLGLabel);
        Helper.Hide(_txtTotalTypeHTCLabel);
        Helper.Hide(_txtTotalTypePolytronLabel);
        Helper.Hide(_txtTotalTypeOppoLabel);
        Helper.Hide(_txtTotalTypeEvercrossLabel);
        Helper.Hide(_txtTotalTypeAsusLabel);
        Helper.Hide(_txtTotalTypeAcerLabel);
        Helper.Hide(_txtTotalTypeXiaomiLabel);
        Helper.Hide(_txtTotalTypeHiSenseLabel);

        Helper.Hide(_rdgBlackBerryExist);
        Helper.Hide(_rdgNokiaExist);
        Helper.Hide(_rdgIphoneExist);
        Helper.Hide(_rdgMitoExist);
        Helper.Hide(_rdgHTCExist);
        Helper.Hide(_rdgPolytronExist);

        Helper.Hide(_txtSamsungOtherValue);
        Helper.Hide(_txtAdvanOtherValue);
        Helper.Hide(_txtLenovoOtherValue);
        Helper.Hide(_txtXperiaOtherValue);
        Helper.Hide(_txtLGOtherValue);
        Helper.Hide(_txtOPPOOtherValue);
        Helper.Hide(_txtEvercrossOtherValue);
        Helper.Hide(_txtAsusOtherValue);
        Helper.Hide(_txtAcerOtherValue);
        Helper.Hide(_txtXiaomiOtherValue);
        Helper.Hide(_txtHiSenseOtherValue);

        Helper.Hide(_txtSamsungLabel);
        Helper.Hide(_txtBlackBerryLabel);
        Helper.Hide(_txtNokiaLabel);
        Helper.Hide(_txtLenovoLabel);
        Helper.Hide(_txtAdvanLabel);
        Helper.Hide(_txtSonyLabel);
        Helper.Hide(_txtIphoneLabel);
        Helper.Hide(_txtMitoLabel);
        Helper.Hide(_txtLGLabel);
        Helper.Hide(_txtHTCLabel);
        Helper.Hide(_txtPolytronLabel);
        Helper.Hide(_txtOppoLabel);
        Helper.Hide(_txtEvercrossLabel);
        Helper.Hide(_txtAsusLabel);
        Helper.Hide(_txtAcerLabel);
        Helper.Hide(_txtXiaomiLabel);
        Helper.Hide(_txtHiSenseLabel);

        Helper.Hide(_error61b);
        Helper.Hide(_error61c);
        Helper.Hide(_error62);
        Helper.Hide(_errorSamsung);
        Helper.Hide(_errorLenovo);
        Helper.Hide(_errorAdvan);
        Helper.Hide(_errorSony);
        Helper.Hide(_errorLG);
        Helper.Hide(_errorOppo);
        Helper.Hide(_errorEvercross);
        Helper.Hide(_errorAsus);
        Helper.Hide(_errorAcer);
        Helper.Hide(_errorXiaomi);
        Helper.Hide(_errorHiSense);
        Helper.Hide(_errorTotalTypeSamsung);
        Helper.Hide(_errorTotalTypeBlackBerry);
        Helper.Hide(_errorTotalTypeNokia);
        Helper.Hide(_errorTotalTypeLenovo);
        Helper.Hide(_errorTotalTypeAdvan);
        Helper.Hide(_errorTotalTypeSony);
        Helper.Hide(_errorTotalTypeIphone);
        Helper.Hide(_errorTotalTypeMito);
        Helper.Hide(_errorTotalTypeLG);
        Helper.Hide(_errorTotalTypeHTC);
        Helper.Hide(_errorTotalTypePolytron);
        Helper.Hide(_errorTotalTypeOppo);
        Helper.Hide(_errorTotalTypeEvercross);
        Helper.Hide(_errorTotalTypeAsus);
        Helper.Hide(_errorTotalTypeAcer);
        Helper.Hide(_errorTotalTypeXiaomi);
        Helper.Hide(_errorTotalTypeHiSense);



        _cbxSamsungOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtSamsungOtherValue);
                }
                else
                {
                    Helper.Hide( _txtSamsungOtherValue);
                }
            }
        });

        _cbxLenovoOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtLenovoOtherValue);
                }
                else
                {
                    Helper.Hide(_txtLenovoOtherValue);
                }
            }
        });

        _cbxAdvanOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtAdvanOtherValue);
                }
                else
                {
                    Helper.Hide(_txtAdvanOtherValue);
                }
            }
        });

        _cbxXperiaOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtXperiaOtherValue);
                }
                else
                {
                    Helper.Hide(_txtXperiaOtherValue);
                }
            }
        });


        _cbxLGOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtLGOtherValue);
                }
                else
                {
                    Helper.Hide(_txtLGOtherValue);
                }
            }
        });

        _cbxOPPOOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtOPPOOtherValue);
                }
                else
                {
                    Helper.Hide(_txtOPPOOtherValue);
                }
            }
        });

        _cbxEvercrossOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtEvercrossOtherValue);
                }
                else
                {
                    Helper.Hide(_txtEvercrossOtherValue);
                }
            }
        });

        _cbxAsusOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtAsusOtherValue);
                }
                else
                {
                    Helper.Hide(_txtAsusOtherValue);
                }
            }
        });

        _cbxAcerOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtAcerOtherValue);
                }
                else
                {
                    Helper.Hide(_txtAcerOtherValue);
                }
            }
        });

        _cbxXiaomiOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtXiaomiOtherValue);
                }
                else
                {
                    Helper.Hide( _txtXiaomiOtherValue);
                }
            }
        });

        _cbxHiSenseOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Helper.Show(_txtHiSenseOtherValue);
                }
                else
                {
                    Helper.Hide(_txtHiSenseOtherValue);
                }
            }
        });

        _cbxSamsung.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_cbxSamsungGalaxyYoung2);
                    Helper.Show(_cbxSamsungGalaxyJ1);
                    Helper.Show(_cbxSamsungGalaxyJ2);
                    Helper.Show(_cbxSamsungGalaxyJ3);
                    Helper.Show(_cbxSamsungGalaxyJ5);
                    Helper.Show(_cbxSamsungGalaxyJ7);
                    Helper.Show(_cbxSamsungGalaxyJ1Ace);
                    Helper.Show(_cbxSamsungGalaxyA3);
                    Helper.Show(_cbxSamsungGalaxyA5);
                    Helper.Show(_cbxSamsungGalaxyA7);
                    Helper.Show(_cbxSamsungGalaxyVPlus);
                    Helper.Show(_cbxSamsungGalaxyNote5);
                    Helper.Show(_cbxSamsungGalaxyS6);
                    Helper.Show(_cbxSamsungGalaxyS7);
                    Helper.Show(_cbxSamsungGalaxyS7Edge);
                    Helper.Show(_cbxSamsungOther);
                    Helper.Show(_txtTotalTypeSamsungLabel);
                    Helper.Show(_txtTotalTypeSamsung);
                    Helper.Show(_txtSamsungLabel);
                    Helper.Show(_errorSamsung);
                    Helper.Show(_errorTotalTypeSamsung);
                }
                else
                {
                    Helper.Hide(_cbxSamsungGalaxyYoung2);
                    Helper.Hide(_cbxSamsungGalaxyJ1);
                    Helper.Hide(_cbxSamsungGalaxyJ2);
                    Helper.Hide(_cbxSamsungGalaxyJ3);
                    Helper.Hide(_cbxSamsungGalaxyJ5);
                    Helper.Hide(_cbxSamsungGalaxyJ7);
                    Helper.Hide(_cbxSamsungGalaxyJ1Ace);
                    Helper.Hide(_cbxSamsungGalaxyA3);
                    Helper.Hide(_cbxSamsungGalaxyA5);
                    Helper.Hide(_cbxSamsungGalaxyA7);
                    Helper.Hide(_cbxSamsungGalaxyVPlus);
                    Helper.Hide(_cbxSamsungGalaxyNote5);
                    Helper.Hide(_cbxSamsungGalaxyS6);
                    Helper.Hide(_cbxSamsungGalaxyS7);
                    Helper.Hide(_cbxSamsungGalaxyS7Edge);
                    Helper.Hide(_cbxSamsungOther);
                    Helper.Hide(_txtTotalTypeSamsungLabel);
                    Helper.Hide(_txtTotalTypeSamsung);
                    Helper.Hide(_txtSamsungLabel);
                    Helper.Hide(_errorSamsung);
                    Helper.Hide(_errorTotalTypeSamsung);
                }
            }
        });

        _cbxLenovo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxLenovoA6000);
                    Helper.Show(_cbxLenovoA6000Plus);
                    Helper.Show(_cbxLenovoA7000);
                    Helper.Show(_cbxLenovoP70);
                    Helper.Show(_cbxLenovoOther);
                    Helper.Show(_txtTotalTypeLenovo);
                    Helper.Show(_txtTotalTypeLenovoLabel);
                    Helper.Show(_txtLenovoLabel);
                    Helper.Show(_errorLenovo);
                    Helper.Show(_errorTotalTypeLenovo);
                }else {
                    Helper.Hide(_cbxLenovoA6000);
                    Helper.Hide(_cbxLenovoA6000Plus);
                    Helper.Hide(_cbxLenovoA7000);
                    Helper.Hide(_cbxLenovoP70);
                    Helper.Hide(_cbxLenovoOther);
                    Helper.Hide(_txtTotalTypeLenovo);
                    Helper.Hide(_txtTotalTypeLenovoLabel);
                    Helper.Hide(_txtLenovoLabel);
                    Helper.Hide(_errorLenovo);
                    Helper.Hide(_errorTotalTypeLenovo);
                }
            }
        });

        _cbxAdvan.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxAdvanS35H);
                    Helper.Show(_cbxAdvanS35D);
                    Helper.Show(_cbxAdvanS35E);
                    Helper.Show(_cbxAdvanOther);
                    Helper.Show(_txtTotalTypeAdvan);
                    Helper.Show(_txtTotalTypeAdvanLabel);
                    Helper.Show(_txtAdvanLabel);
                    Helper.Show(_errorAdvan);
                    Helper.Show(_errorTotalTypeAdvan);
                }else {
                    Helper.Hide(_cbxAdvanS35H);
                    Helper.Hide(_cbxAdvanS35D);
                    Helper.Hide(_cbxAdvanS35E);
                    Helper.Hide(_cbxAdvanOther);
                    Helper.Hide(_txtTotalTypeAdvan);
                    Helper.Hide(_txtTotalTypeAdvanLabel);
                    Helper.Hide(_txtAdvanLabel);
                    Helper.Hide(_errorAdvan);
                    Helper.Hide(_errorTotalTypeAdvan);
                }
            }
        });

        _cbxSony.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Helper.Show(_cbxXperiaC5);
                    Helper.Show(_cbxXperiaE4);
                    Helper.Show(_cbxXperiaM5);
                    Helper.Show(_cbxXperiaM4);
                    Helper.Show(_cbxXperiaOther);
                    Helper.Show(_txtTotalTypeSony);
                    Helper.Show(_txtTotalTypeSonyLabel);
                    Helper.Show(_txtSonyLabel);
                    Helper.Show(_errorSony);
                    Helper.Show(_errorTotalTypeSony);
                } else {
                    Helper.Hide(_cbxXperiaC5);
                    Helper.Hide(_cbxXperiaE4);
                    Helper.Hide(_cbxXperiaM5);
                    Helper.Hide(_cbxXperiaM4);
                    Helper.Hide(_cbxXperiaOther);
                    Helper.Hide(_txtTotalTypeSony);
                    Helper.Hide(_txtTotalTypeSonyLabel);
                    Helper.Hide(_txtSonyLabel);
                    Helper.Hide(_errorSony);
                    Helper.Hide(_errorTotalTypeSony);
                }
            }
        });

        _cbxLG.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Helper.Show(_cbxLGG4Dual);
                    Helper.Show(_cbxLGMagna);
                    Helper.Show(_cbxLGG4Stylus);
                    Helper.Show(_cbxLGOther);
                    Helper.Show(_txtTotalTypeLG);
                    Helper.Show(_txtTotalTypeLGLabel);
                    Helper.Show(_txtLGLabel);
                    Helper.Show(_errorLG);
                    Helper.Show(_errorTotalTypeLG);
                } else {
                    Helper.Hide(_cbxLGG4Dual);
                    Helper.Hide(_cbxLGMagna);
                    Helper.Hide(_cbxLGG4Stylus);
                    Helper.Hide(_cbxLGOther);
                    Helper.Hide(_txtTotalTypeLG);
                    Helper.Hide(_txtTotalTypeLGLabel);
                    Helper.Hide(_txtLGLabel);
                    Helper.Hide(_errorLG);
                    Helper.Hide(_errorTotalTypeLG);
                }
            }
        });

        _cbxOppo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxOPPOMirror5);
                    Helper.Show(_cbxOPPOJoy3);
                    Helper.Show(_cbxOPPOJoyPlus);
                    Helper.Show(_cbxOPPONeo3);
                    Helper.Show(_cbxOPPONeo5);
                    Helper.Show(_cbxOPPOOther);
                    Helper.Show(_txtTotalTypeOppo);
                    Helper.Show(_txtTotalTypeOppoLabel);
                    Helper.Show(_txtOppoLabel);
                    Helper.Show(_errorOppo);
                    Helper.Show(_errorTotalTypeOppo);
                }else {
                    Helper.Hide(_cbxOPPOMirror5);
                    Helper.Hide(_cbxOPPOJoy3);
                    Helper.Hide(_cbxOPPOJoyPlus);
                    Helper.Hide(_cbxOPPONeo3);
                    Helper.Hide(_cbxOPPONeo5);
                    Helper.Hide(_cbxOPPOOther);
                    Helper.Hide(_txtTotalTypeOppo);
                    Helper.Hide(_txtTotalTypeOppoLabel);
                    Helper.Hide(_txtOppoLabel);
                    Helper.Hide(_errorOppo);
                    Helper.Hide(_errorTotalTypeOppo);
                }
            }
        });

        _cbxEvercross.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxEvercrossA33A);
                    Helper.Show(_cbxEvercrossA5P);
                    Helper.Show(_cbxEvercrossA21B);
                    Helper.Show(_cbxEvercrossA35B);
                    Helper.Show(_cbxEvercrossWinner);
                    Helper.Show(_cbxEvercrossA54);
                    Helper.Show(_cbxEvercrossOther);
                    Helper.Show(_txtTotalTypeEvercross);
                    Helper.Show(_txtTotalTypeEvercrossLabel);
                    Helper.Show(_txtEvercrossLabel);
                    Helper.Show(_errorEvercross);
                    Helper.Show(_errorTotalTypeEvercross);

                }else {
                    Helper.Hide(_cbxEvercrossA33A);
                    Helper.Hide(_cbxEvercrossA5P);
                    Helper.Hide(_cbxEvercrossA21B);
                    Helper.Hide(_cbxEvercrossA35B);
                    Helper.Hide(_cbxEvercrossWinner);
                    Helper.Hide(_cbxEvercrossA54);
                    Helper.Hide(_cbxEvercrossOther);
                    Helper.Hide(_txtTotalTypeEvercross);
                    Helper.Hide(_txtTotalTypeEvercrossLabel);
                    Helper.Hide(_txtEvercrossLabel);
                    Helper.Hide(_errorEvercross);
                    Helper.Hide(_errorTotalTypeEvercross);
                }
            }
        });

        _cbxAsus.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxAsusZenfone2Laser8);
                    Helper.Show(_cbxAsusZenfone2Laser16);
                    Helper.Show(_cbxAsusZenfoneGO);
                    Helper.Show(_cbxAsusZenfone4S);
                    Helper.Show(_cbxAsusNewZenfone4S);
                    Helper.Show(_cbxAsusZenfone2ZE551ML);
                    Helper.Show(_cbxAsusOther);
                    Helper.Show(_txtTotalTypeAsus);
                    Helper.Show(_txtTotalTypeAsusLabel);
                    Helper.Show(_txtAsusLabel);
                    Helper.Show(_errorAsus);
                    Helper.Show(_errorTotalTypeAsus);
                }else {
                    Helper.Hide(_cbxAsusZenfone2Laser8);
                    Helper.Hide(_cbxAsusZenfone2Laser16);
                    Helper.Hide(_cbxAsusZenfoneGO);
                    Helper.Hide(_cbxAsusZenfone4S);
                    Helper.Hide(_cbxAsusNewZenfone4S);
                    Helper.Hide(_cbxAsusZenfone2ZE551ML);
                    Helper.Hide(_cbxAsusOther);
                    Helper.Hide(_txtTotalTypeAsus);
                    Helper.Hide(_txtTotalTypeAsusLabel);
                    Helper.Hide(_txtAsusLabel);
                    Helper.Hide(_errorAsus);
                    Helper.Hide(_errorTotalTypeAsus);
                }
            }
        });

        _cbxAcer.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxAcerZ220);
                    Helper.Show(_cbxAcerZ520);
                    Helper.Show(_cbxAcerOther);
                    Helper.Show(_txtTotalTypeAcer);
                    Helper.Show(_txtTotalTypeAcerLabel);
                    Helper.Show(_txtAcerLabel);
                    Helper.Show(_errorAcer);
                    Helper.Show(_errorTotalTypeAcer);
                }else {
                    Helper.Hide(_cbxAcerZ220);
                    Helper.Hide(_cbxAcerZ520);
                    Helper.Hide(_cbxAcerOther);
                    Helper.Hide(_txtTotalTypeAcer);
                    Helper.Hide(_txtTotalTypeAcerLabel);
                    Helper.Hide(_txtAcerLabel);
                    Helper.Hide(_errorAcer);
                    Helper.Hide(_errorTotalTypeAcer);
                }
            }
        });
        _cbxXiaomi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxXiaomiREDMI2Prime);
                    Helper.Show(_cbxXiaomiREDMI28GB);
                    Helper.Show(_cbxXiaomiREDMI216GB);
                    Helper.Show(_cbxXiaomiMi4I);
                    Helper.Show(_cbxXiaomiOther);
                    Helper.Show(_txtTotalTypeXiaomi);
                    Helper.Show(_txtTotalTypeXiaomiLabel);
                    Helper.Show(_txtXiaomiLabel);
                    Helper.Show(_errorXiaomi);
                    Helper.Show(_errorTotalTypeXiaomi);
                }else {
                    Helper.Hide(_cbxXiaomiREDMI2Prime);
                    Helper.Hide(_cbxXiaomiREDMI28GB);
                    Helper.Hide(_cbxXiaomiREDMI216GB);
                    Helper.Hide(_cbxXiaomiMi4I);
                    Helper.Hide(_cbxXiaomiOther);
                    Helper.Hide(_txtTotalTypeXiaomi);
                    Helper.Hide(_txtTotalTypeXiaomiLabel);
                    Helper.Hide(_txtXiaomiLabel);
                    Helper.Hide(_errorXiaomi);
                    Helper.Hide(_errorTotalTypeLG);
                }
            }
        });

        _cbxBlackBerry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_rdgBlackBerryExist);
                    Helper.Show(_txtTotalTypeBlackBerry);
                    Helper.Show(_txtTotalTypeBlackBerryLabel);
                    Helper.Show(_txtBlackBerryLabel);
                    Helper.Show(_errorTotalTypeBlackBerry);
                }else {
                    Helper.Hide(_rdgBlackBerryExist);
                    Helper.Hide(_txtTotalTypeBlackBerry);
                    Helper.Hide(_txtTotalTypeBlackBerryLabel);
                    Helper.Hide(_txtBlackBerryLabel);
                    Helper.Hide(_errorTotalTypeBlackBerry);
                }
            }
        });

        _cbxNokia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_rdgNokiaExist);
                    Helper.Show(_txtTotalTypeNokia);
                    Helper.Show(_txtTotalTypeNokiaLabel);
                    Helper.Show(_txtNokiaLabel);
                    Helper.Show(_errorTotalTypeNokia);
                }else {
                    Helper.Hide(_rdgNokiaExist);
                    Helper.Hide(_txtTotalTypeNokia);
                    Helper.Hide(_txtTotalTypeNokiaLabel);
                    Helper.Hide(_txtNokiaLabel);
                    Helper.Hide(_errorTotalTypeNokia);
                }
            }
        });

        _cbxIphone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_rdgIphoneExist);
                    Helper.Show(_txtTotalTypeIphone);
                    Helper.Show(_txtTotalTypeIphoneLabel);
                    Helper.Show(_txtIphoneLabel);
                    Helper.Show(_errorTotalTypeIphone);
                }else {
                    Helper.Hide(_rdgIphoneExist);
                    Helper.Hide(_txtTotalTypeIphone);
                    Helper.Hide(_txtTotalTypeIphoneLabel);
                    Helper.Hide(_txtIphoneLabel);
                    Helper.Hide(_errorTotalTypeIphone);
                }
            }
        });

        _cbxMito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_rdgMitoExist);
                    Helper.Show(_txtTotalTypeMito);
                    Helper.Show(_txtTotalTypeMitoLabel);
                    Helper.Show(_txtMitoLabel);
                    Helper.Show(_errorTotalTypeMito);
                }else {
                    Helper.Hide(_rdgMitoExist);
                    Helper.Hide(_txtTotalTypeMito);
                    Helper.Hide(_txtTotalTypeMitoLabel);
                    Helper.Hide(_txtMitoLabel);
                    Helper.Hide(_errorTotalTypeMito);
                }
            }
        });

        _cbxHTC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_rdgHTCExist);
                    Helper.Show(_txtTotalTypeHTC);
                    Helper.Show(_txtTotalTypeHTCLabel);
                    Helper.Show(_txtHTCLabel);
                    Helper.Show(_errorTotalTypeHTC);
                }else {
                    Helper.Hide(_rdgHTCExist);
                    Helper.Hide(_txtTotalTypeHTC);
                    Helper.Hide(_txtTotalTypeHTCLabel);
                    Helper.Hide(_txtHTCLabel);
                    Helper.Hide(_errorTotalTypeHTC);
                }
            }
        });

        _cbxPolytron.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Helper.Show(_rdgPolytronExist);
                    Helper.Show(_txtTotalTypePolytron);
                    Helper.Show(_txtTotalTypePolytronLabel);
                    Helper.Show(_txtPolytronLabel);
                    Helper.Show(_errorTotalTypePolytron);
                }else {
                    Helper.Hide(_rdgPolytronExist);
                    Helper.Hide(_txtTotalTypePolytron);
                    Helper.Hide(_txtTotalTypePolytronLabel);
                    Helper.Hide(_txtPolytronLabel);
                    Helper.Hide(_errorTotalTypePolytron);
                }
            }
        });


        _cbxHiSense.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    Helper.Show(_cbxHiSensePureShot);
                    Helper.Show(_cbxHiSensePureShotPlus);
                    Helper.Show(_cbxHiSenseOther);
                    Helper.Show(_txtTotalTypeHiSense);
                    Helper.Show(_txtTotalTypeHiSenseLabel);
                    Helper.Show(_txtHiSenseLabel);
                    Helper.Show(_errorHiSense);
                    Helper.Show(_errorTotalTypeHiSense);
                }else {

                    Helper.Hide(_cbxHiSensePureShot);
                    Helper.Hide(_cbxHiSensePureShotPlus);
                    Helper.Hide(_cbxHiSenseOther);
                    Helper.Hide(_txtHiSenseLabel);
                    Helper.Hide(_txtTotalTypeHiSense);
                    Helper.Hide(_txtTotalTypeHiSenseLabel);
                    Helper.Hide(_txtHiSenseLabel);
                    Helper.Hide(_errorHiSense);
                    Helper.Hide(_errorTotalTypeHiSense);
                }
            }
        });


        // load value back button
        _no_61BValue = extras.getString("NO_61B");
        _no_61CValue = extras.getString("NO_61C");
        _no_62Value = extras.getString("NO_62");
        _no_63Value = extras.getString("NO_63");
        _no_64Value = extras.getString("NO_64");
        _no_65Value = extras.getString("NO_65");
        _no_66Value = extras.getString("NO_66");
        _no_67Value = extras.getString("NO_67");
        _no_68Value = extras.getString("NO_68");
        _no_69Value = extras.getString("NO_69");
        _no_70Value = extras.getString("NO_70");
        _no_71Value = extras.getString("NO_71");
        _no_72Value = extras.getString("NO_72");
        _no_73Value = extras.getString("NO_73");
        _no_74Value = extras.getString("NO_74");
        _no_75Value = extras.getString("NO_75");
        _no_76Value = extras.getString("NO_76");
        _no_77Value = extras.getString("NO_77");
        _no_78Value = extras.getString("NO_78");
        _no_79Value = extras.getString("NO_79");
        _no_80Value = extras.getString("NO_80");
        _no_81Value = extras.getString("NO_81");
        _no_82Value = extras.getString("NO_82");
        _no_83Value = extras.getString("NO_83");
        _no_84Value = extras.getString("NO_84");
        _no_85Value = extras.getString("NO_85");
        _no_86Value = extras.getString("NO_86");
        _no_87Value = extras.getString("NO_87");
        _no_88Value = extras.getString("NO_88");
        _no_89Value = extras.getString("NO_89");
        _no_90Value = extras.getString("NO_90");
        _no_91Value = extras.getString("NO_91");
        _no_92Value = extras.getString("NO_92");
        _no_93Value = extras.getString("NO_93");
        _no_94Value = extras.getString("NO_94");
        _no_95Value = extras.getString("NO_95");
        _no_96Value = extras.getString("NO_96");
        _no_97Value = extras.getString("NO_97");
        _no_98Value = extras.getString("NO_98");
        _no_99Value = extras.getString("NO_99");
        _no_100Value = extras.getString("NO_100");


        if(_no_61BValue != null && !_no_61BValue.isEmpty() && !_no_61BValue.equals(""))
        {
            if(_no_61BValue.contains("SimPATI"))
            {
                _cbxBSimpati.setChecked(true);
            }
            if(_no_61BValue.contains("Kartu As"))
            {
                _cbxBKartuAs.setChecked(true);
            }
            if(_no_61BValue.contains("Kartu Loop"))
            {
                _cbxBKartuLoop.setChecked(true);
            }
            if(_no_61BValue.contains("IM 3"))
            {
                _cbxBBIM3.setChecked(true);
            }
            if(_no_61BValue.contains("Mentari"))
            {
                _cbxBMentari.setChecked(true);
            }
            if(_no_61BValue.contains("XL"))
            {
                _cbxBXL.setChecked(true);
            }
            if(_no_61BValue.contains("Axis"))
            {
                _cbxBAxis.setChecked(true);
            }
            if(_no_61BValue.contains("3 (tri)"))
            {
                _cbxBTri.setChecked(true);
            }
            if(_no_61BValue.contains("smartfren (CDMA)"))
            {
                _cbxBSmartfren.setChecked(true);
            }
            if(_no_61BValue.contains("Esia (CDMA)"))
            {
                _cbxBEsia.setChecked(true);
            }

        }

        if(_no_61CValue != null && !_no_61CValue.isEmpty() && !_no_61CValue.equals(""))
        {
            if(_no_61CValue.contains("SimPATI"))
            {
                _cbxCSimpati.setChecked(true);
            }
            if(_no_61CValue.contains("Kartu As"))
            {
                _cbxCKartuAs.setChecked(true);
            }
            if(_no_61CValue.contains("Kartu Loop"))
            {
                _cbxCKartuLoop.setChecked(true);
            }
            if(_no_61CValue.contains("IM 3"))
            {
                _cbxCBIM3.setChecked(true);
            }
            if(_no_61CValue.contains("Mentari"))
            {
                _cbxCMentari.setChecked(true);
            }
            if(_no_61CValue.contains("XL"))
            {
                _cbxCXL.setChecked(true);
            }
            if(_no_61CValue.contains("Axis"))
            {
                _cbxCAxis.setChecked(true);
            }
            if(_no_61CValue.contains("3 (tri)"))
            {
                _cbxCTri.setChecked(true);
            }
            if(_no_61CValue.contains("smartfren"))
            {
                _cbxCSmartfren.setChecked(true);
            }
            if(_no_61CValue.contains("Bolt"))
            {
                _cbxCBolt.setChecked(true);
            }
        }


        if(_no_62Value != null && !_no_62Value.isEmpty() && !_no_62Value.equals(""))
        {
            if(_no_62Value.contains("Samsung"))
            {
                _cbxSamsung.setChecked(true);

                Helper.Show(_cbxSamsungGalaxyYoung2);
                Helper.Show(_cbxSamsungGalaxyJ1);
                Helper.Show(_cbxSamsungGalaxyJ2);
                Helper.Show(_cbxSamsungGalaxyJ3);
                Helper.Show(_cbxSamsungGalaxyJ5);
                Helper.Show(_cbxSamsungGalaxyJ7);
                Helper.Show(_cbxSamsungGalaxyJ1Ace);
                Helper.Show(_cbxSamsungGalaxyA3);
                Helper.Show(_cbxSamsungGalaxyA5);
                Helper.Show(_cbxSamsungGalaxyA7);
                Helper.Show(_txtSamsungOtherValue);
                Helper.Show(_cbxSamsungOther);
                Helper.Show(_cbxSamsungGalaxyS7);
                Helper.Show(_cbxSamsungGalaxyVPlus);
                Helper.Show(_cbxSamsungGalaxyNote5);
                Helper.Show(_cbxSamsungGalaxyS6);
                Helper.Show(_txtTotalTypeSamsungLabel);
                Helper.Show(_txtTotalTypeSamsung);

                if(_no_63Value != null && !_no_63Value.isEmpty() && !_no_63Value.equals(""))
                {

                    if(_no_63Value.contains("Galaxy YOUNG 2 - G130"))
                    {
                        _no_63Value.replace("Galaxy YOUNG 2 - G130","");
                        _cbxSamsungGalaxyYoung2.setChecked(true);
                    }
                    if(_no_63Value.contains("Galaxy J1"))
                    {
                        _no_63Value.replace("Galaxy J1","");
                        _cbxSamsungGalaxyJ1.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy J2"))
                    {
                        _no_63Value.replace("Galaxy J2","");
                        _cbxSamsungGalaxyJ2.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy J3"))
                    {
                        _no_63Value.replace("Galaxy J3","");
                        _cbxSamsungGalaxyJ3.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy J5"))
                    {
                        _no_63Value.replace("Galaxy J5","");
                        _cbxSamsungGalaxyJ5.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy J7"))
                    {
                        _no_63Value.replace("Galaxy J7","");
                        _cbxSamsungGalaxyJ7.setChecked(true);
                    }
                    if(_no_63Value.contains("Galaxy J1 Ace"))
                    {
                        _no_63Value.replace("Galaxy J1 Ace","");
                        _cbxSamsungGalaxyJ1Ace.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy A3"))
                    {
                        _no_63Value.replace("Galaxy A5","");
                        _cbxSamsungGalaxyA3.setChecked(true);
                    }
                    if(_no_63Value.contains("Galaxy A5"))
                    {
                        _no_63Value.replace("Galaxy A5","");
                        _cbxSamsungGalaxyA5.setChecked(true);
                    }
                    if(_no_63Value.contains("Galaxy A7"))
                    {
                        _no_63Value.replace("Galaxy A7","");
                        _cbxSamsungGalaxyA7.setChecked(true);
                    }
                    if(_no_63Value.contains("Galaxy V Plus"))
                    {
                        _no_63Value.replace("Galaxy V Plus","");
                        _cbxSamsungGalaxyVPlus.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy Note 5"))
                    {
                        _no_63Value.replace("Galaxy Note 5","");
                        _cbxSamsungGalaxyNote5.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy S6"))
                    {
                        _no_63Value.replace("Galaxy S6","");
                        _cbxSamsungGalaxyS6.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy S7"))
                    {
                        _no_63Value.replace("Galaxy S7","");
                        _cbxSamsungGalaxyS7.setChecked(true);

                    }
                    if(_no_63Value.contains("Galaxy S7 Edge"))
                    {
                        _no_63Value.replace("Galaxy S7 Edge","");
                        _cbxSamsungGalaxyS7Edge.setChecked(true);
                    }


                    if(_no_63Value != null && !_no_63Value.isEmpty() && !_no_63Value.equals(""))
                    {
                        _no_63Value.replace(";","");
                        _cbxSamsungOther.setChecked(true);
                        _txtSamsungOtherValue.setText(_no_63Value);
                    }
                }

                if(_no_64Value != null && !_no_64Value.isEmpty() && !_no_64Value.equals(""))
                {
                    _txtTotalTypeSamsung.setText(_no_64Value);
                }

            }
            if(_no_62Value.contains("BlackBerry"))
            {
                _cbxBlackBerry.setChecked(true);

                Helper.Show(_rdgBlackBerryExist);
                Helper.Show(_txtTotalTypeBlackBerry);
                Helper.Show(_txtTotalTypeBlackBerryLabel);

                if(_no_65Value != null && !_no_65Value.isEmpty() && !_no_65Value.equals(""))
                {
                    if(_no_65Value.equals("Ya"))
                    {
                        _rdgBlackBerryExist.check(R.id.radIsBlackBerryExistTrue);
                    }
                    else
                    {
                        _rdgBlackBerryExist.check(R.id.radIsBlackBerryExistFalse);
                    }
                }

                if(_no_66Value != null && !_no_66Value.isEmpty() && !_no_66Value.equals(""))
                {
                    _txtTotalTypeBlackBerryLabel.setText(_no_66Value);
                }
            }
            if(_no_62Value.contains("Nokia (Microsoft)"))
            {
                _cbxNokia.setChecked(true);

                Helper.Show(_rdgNokiaExist);
                Helper.Show(_txtTotalTypeNokia);
                Helper.Show(_txtTotalTypeNokiaLabel);

                if(_no_67Value != null && !_no_67Value.isEmpty() && !_no_67Value.equals(""))
                {
                    if(_no_67Value.equals("Ya"))
                    {
                        _rdgNokiaExist.check(R.id.radIsNokiaExistTrue);
                    }
                    else
                    {
                        _rdgNokiaExist.check(R.id.radIsNokiaExistFalse);
                    }
                }

                if(_no_68Value != null && !_no_68Value.isEmpty() && !_no_68Value.equals(""))
                {
                    _txtTotalTypeNokia.setText(_no_66Value);
                }
            }
            if(_no_62Value.contains("Lenovo"))
            {
                _cbxLenovo.setChecked(true);

                Helper.Show(_cbxLenovoA6000);
                Helper.Show(_cbxLenovoA6000Plus);
                Helper.Show(_cbxLenovoA7000);
                Helper.Show(_cbxLenovoP70);
                Helper.Show(_cbxLenovoOther);
                Helper.Show(_txtLenovoOtherValue);
                Helper.Show(_txtTotalTypeLenovoLabel);
                Helper.Show(_txtTotalTypeLenovo);

                if(_no_69Value != null && !_no_69Value.isEmpty() && !_no_69Value.equals(""))
                {
                    if(_no_69Value.contains("Lenovo A6000"))
                    {
                        _no_69Value.replace("Lenovo A6000","");
                        _cbxLenovoA6000.setChecked(true);
                    }
                    if(_no_69Value.contains("Lenovo A6000 PLUS"))
                    {
                        _no_69Value.replace("Lenovo A6000 PLUS","");
                        _cbxLenovoA6000Plus.setChecked(true);
                    }
                    if(_no_69Value.contains("Lenovo A7000 LTE"))
                    {
                        _no_69Value.replace("Lenovo A7000 LTE","");
                        _cbxLenovoA7000.setChecked(true);
                    }
                    if(_no_69Value.contains("Lenovo P70 16GB LTE"))
                    {
                        _no_69Value.replace("Lenovo P70 16GB LTE","");
                        _cbxLenovoP70.setChecked(true);
                    }


                    if(_no_69Value != null && !_no_69Value.isEmpty() && !_no_69Value.equals(""))
                    {
                        _no_69Value.replace(";","");
                        _cbxLenovoOther.setChecked(true);
                        _txtLenovoOtherValue.setText(_no_63Value);
                    }
                }

                if(_no_70Value != null && !_no_70Value.isEmpty() && !_no_70Value.equals(""))
                {
                    _txtTotalTypeLenovo.setText(_no_70Value);

                }
            }
            if(_no_62Value.contains("Advan"))
            {
                _cbxCMentari.setChecked(true);

                Helper.Show(_cbxAdvan);
                Helper.Show(_cbxAdvanS35H);
                Helper.Show(_cbxAdvanS35D);
                Helper.Show(_cbxAdvanS35E);
                Helper.Show(_cbxAdvanOther);
                Helper.Show(_txtAdvanOtherValue);
                Helper.Show(_txtTotalTypeAdvanLabel);
                Helper.Show(_txtTotalTypeAdvan);

                if(_no_71Value != null && !_no_71Value.isEmpty() && !_no_71Value.equals(""))
                {
                    if(_no_71Value.contains("Advan VANDROID S35H"))
                    {
                        _no_71Value.replace("Advan VANDROID S35H","");
                        _cbxAdvanS35H.setChecked(true);
                    }
                    if(_no_71Value.contains("Advan VANDROID S35D"))
                    {
                        _no_71Value.replace("Advan VANDROID S35D","");
                        _cbxAdvanS35D.setChecked(true);
                    }
                    if(_no_71Value.contains("Advan VANDROID S35E")) {
                        _no_71Value.replace("Advan VANDROID S35E","");
                        _cbxAdvanS35E.setChecked(true);
                    }

                    if(_no_71Value != null && !_no_71Value.isEmpty() && !_no_71Value.equals(""))
                    {
                        _no_71Value.replace(";","");
                        _cbxAdvanOther.setChecked(true);
                        _txtAdvanOtherValue.setText(_no_71Value);
                    }
                }

                if(_no_72Value != null && !_no_72Value.isEmpty() && !_no_72Value.equals(""))
                {
                    _txtTotalTypeAdvan.setText(_no_72Value);

                }
            }
            if(_no_62Value.contains("Sony"))
            {
                _cbxSony.setChecked(true);

                Helper.Show(_cbxXperiaC5);
                Helper.Show(_cbxXperiaE4);
                Helper.Show(_cbxXperiaM5);
                Helper.Show(_cbxXperiaM4);
                Helper.Show(_cbxXperiaOther);
                Helper.Show(_txtXperiaOtherValue);
                Helper.Show(_txtTotalTypeSony);
                Helper.Show(_txtTotalTypeSonyLabel);

                if(_no_73Value != null && !_no_73Value.isEmpty() && !_no_73Value.equals(""))
                {
                    if(_no_73Value.contains("XPeria C5 Ultra Dual E5563"))
                    {
                        _no_73Value.replace("XPeria C5 Ultra Dual E5563F","");
                        _cbxXperiaC5.setChecked(true);
                    }
                    if(_no_73Value.contains("XPeria E4 DUAL"))
                    {
                        _no_73Value.replace("XPeria E4 DUAL","");
                        _cbxXperiaE4.setChecked(true);
                    }
                    if(_no_73Value.contains("XPeria M5 Dual E5663")) {
                        _no_73Value.replace("XPeria M5 Dual E5663","");
                        _cbxXperiaM5.setChecked(true);
                    }
                    if(_no_73Value.contains("XPeria M4 AQUA E2353 NFC LTE3")) {
                        _no_73Value.replace("XPeria M4 AQUA E2353 NFC LTE3","");
                        _cbxXperiaM4.setChecked(true);
                    }

                    if(_no_73Value != null && !_no_73Value.isEmpty() && !_no_73Value.equals(""))
                    {
                        _no_73Value.replace(";","");
                        _cbxXperiaOther.setChecked(true);
                        _txtXperiaOtherValue.setText(_no_73Value);
                    }
                }

                if(_no_74Value != null && !_no_74Value.isEmpty() && !_no_74Value.equals(""))
                {
                    _txtTotalTypeSony.setText(_no_74Value);

                }
            }
            if(_no_62Value.contains("iPhone"))
            {
                _cbxIphone.setChecked(true);

                Helper.Show(_rdgIphoneExist);
                Helper.Show(_txtTotalTypeIphone);
                Helper.Show(_txtTotalTypeIphoneLabel);

                if(_no_75Value != null && !_no_75Value.isEmpty() && !_no_75Value.equals(""))
                {
                    if(_no_75Value.equals("Ya"))
                    {
                        _rdgIphoneExist.check(R.id.radIsIphoneExistTrue);
                    }
                    else
                    {
                        _rdgIphoneExist.check(R.id.radIsIphoneExistFalse);
                    }
                }

                if(_no_76Value != null && !_no_76Value.isEmpty() && !_no_76Value.equals(""))
                {
                    _txtTotalTypeIphone.setText(_no_76Value);
                }
            }
            if(_no_62Value.contains("Mito"))
            {
                _cbxMito.setChecked(true);

                Helper.Show(_rdgMitoExist);
                Helper.Show(_txtTotalTypeMito);
                Helper.Show(_txtTotalTypeMitoLabel);

                if(_no_77Value != null && !_no_77Value.isEmpty() && !_no_77Value.equals(""))
                {
                    if(_no_77Value.equals("Ya"))
                    {
                        _rdgMitoExist.check(R.id.radIsMitoExistTrue);
                    }
                    else
                    {
                        _rdgNokiaExist.check(R.id.radIsMitoExistTrue);
                    }
                }

                if(_no_78Value != null && !_no_78Value.isEmpty() && !_no_78Value.equals(""))
                {
                    _txtTotalTypeMito.setText(_no_78Value);
                }
            }
            if(_no_62Value.contains("LG"))
            {
                _cbxLG.setChecked(true);

                Helper.Show(_cbxLGG4Dual);
                Helper.Show(_cbxLGMagna);
                Helper.Show(_cbxLGG4Stylus);
                Helper.Show(_cbxLGOther);
                Helper.Show(_txtLGOtherValue);
                Helper.Show(_txtTotalTypeLG);
                Helper.Show(_txtTotalTypeLGLabel);

                if(_no_79Value != null && !_no_79Value.isEmpty() && !_no_79Value.equals(""))
                {
                    if(_no_79Value.contains("LG G4 DUAL H818P NFC LTE 32GB"))
                    {
                        _no_79Value.replace("LG G4 DUAL H818P NFC LTE 32GB","");
                        _cbxLGG4Dual.setChecked(true);
                    }
                    if(_no_79Value.contains("LG Magna H502F"))
                    {
                        _no_79Value.replace("LG Magna H502F","");
                        _cbxLGMagna.setChecked(true);
                    }
                    if(_no_79Value.contains("LG G4 STYLUS")) {
                        _no_79Value.replace("LG G4 STYLUS","");
                        _cbxLGG4Stylus.setChecked(true);
                    }
                    if(_no_79Value != null && !_no_79Value.isEmpty() && !_no_79Value.equals(""))
                    {
                        _no_79Value.replace(";","");
                        _cbxLGOther.setChecked(true);
                        _txtLGOtherValue.setText(_no_79Value);
                    }
                }

                if(_no_80Value != null && !_no_80Value.isEmpty() && !_no_80Value.equals(""))
                {
                    _txtTotalTypeLG.setText(_no_80Value);
                }
            }
            if(_no_62Value.contains("HTC"))
            {
                _cbxHTC.setChecked(true);

                Helper.Show(_rdgHTCExist);
                Helper.Show(_txtTotalTypeHTC);
                Helper.Show(_txtTotalTypeHTCLabel);

                if(_no_81Value != null && !_no_81Value.isEmpty() && !_no_81Value.equals(""))
                {
                    if(_no_81Value.equals("Ya"))
                    {
                        _rdgHTCExist.check(R.id.radIsHTCExistTrue);
                    }
                    else
                    {
                        _rdgHTCExist.check(R.id.radIsHTCExistFalse);
                    }
                }

                if(_no_82Value != null && !_no_82Value.isEmpty() && !_no_82Value.equals(""))
                {
                    _txtTotalTypeHTC.setText(_no_82Value);
                }
            }
            if(_no_62Value.contains("Polytron"))
            {
                _cbxPolytron.setChecked(true);

                Helper.Show(_rdgPolytronExist);
                Helper.Show(_txtTotalTypePolytron);
                Helper.Show(_txtTotalTypePolytronLabel);

                if(_no_83Value != null && !_no_83Value.isEmpty() && !_no_83Value.equals(""))
                {
                    if(_no_83Value.equals("Ya"))
                    {
                        _rdgHTCExist.check(R.id.radIsPolytronExistTrue);
                    }
                    else
                    {
                        _rdgHTCExist.check(R.id.radIsPolytronExistFalse);
                    }
                }

                if(_no_84Value != null && !_no_84Value.isEmpty() && !_no_84Value.equals(""))
                {
                    _txtTotalTypePolytron.setText(_no_84Value);
                }
            }
            if(_no_62Value.contains("Oppo"))
            {
                _cbxOppo.setChecked(true);

                Helper.Show(_cbxOPPOMirror5);
                Helper.Show(_cbxOPPOJoy3);
                Helper.Show(_cbxOPPOJoyPlus);
                Helper.Show(_cbxOPPONeo3);
                Helper.Show(_cbxOPPONeo5);
                Helper.Show(_cbxOPPOOther);
                Helper.Show(_txtOPPOOtherValue);
                Helper.Show(_txtTotalTypeOppo);
                Helper.Show(_txtTotalTypeOppoLabel);

                if(_no_85Value != null && !_no_85Value.isEmpty() && !_no_85Value.equals(""))
                {
                    if(_no_85Value.contains("Oppo Mirror 5 A51W"))
                    {
                        _no_85Value.replace("Oppo Mirror 5 A51W","");
                        _cbxOPPOMirror5.setChecked(true);
                    }
                    if(_no_85Value.contains("Oppo JOY 3 A11W"))
                    {
                        _no_85Value.replace("Oppo JOY 3 A11W","");
                        _cbxOPPOJoy3.setChecked(true);
                    }
                    if(_no_85Value.contains("Oppo JOY PLUS R1011")) {
                        _no_85Value.replace("Oppo JOY PLUS R1011","");
                        _cbxOPPOJoyPlus.setChecked(true);
                    }
                    if(_no_85Value.contains("Oppo NEO 3 R831K")) {
                        _no_85Value.replace("Oppo NEO 3 R831K","");
                        _cbxOPPONeo3.setChecked(true);
                    }
                    if(_no_85Value.contains("Oppo NEO 5")) {
                        _no_85Value.replace("Oppo NEO 5","");
                        _cbxOPPONeo5.setChecked(true);
                    }

                    if(_no_85Value != null && !_no_85Value.isEmpty() && !_no_85Value.equals(""))
                    {
                        _no_85Value.replace(";","");
                        _cbxOPPOOther.setChecked(true);
                        _txtOPPOOtherValue.setText(_no_85Value);
                    }
                }

                if(_no_86Value != null && !_no_86Value.isEmpty() && !_no_86Value.equals(""))
                {
                    _txtTotalTypeOppo.setText(_no_86Value);

                }
            }
            if(_no_62Value.contains("Evercross"))
            {
                _cbxEvercross.setChecked(true);

                Helper.Show(_cbxEvercrossA33A);
                Helper.Show(_cbxEvercrossA5P);
                Helper.Show(_cbxEvercrossA21B);
                Helper.Show(_cbxEvercrossA35B);
                Helper.Show(_cbxEvercrossWinner);
                Helper.Show(_cbxEvercrossA54);
                Helper.Show(_cbxEvercrossOther);
                Helper.Show(_txtEvercrossOtherValue);
                Helper.Show(_txtTotalTypeEvercross);
                Helper.Show(_txtTotalTypeEvercrossLabel);

                if(_no_87Value != null && !_no_87Value.isEmpty() && !_no_87Value.equals(""))
                {
                    if(_no_87Value.contains("Evercoss / Cross A33A"))
                    {
                        _no_87Value.replace("Evercoss / Cross A33A","");
                        _cbxEvercrossA33A.setChecked(true);
                    }
                    if(_no_87Value.contains("Evercoss / Cross A5P"))
                    {
                        _no_87Value.replace("Evercoss / Cross A5P","");
                        _cbxEvercrossA5P.setChecked(true);
                    }
                    if(_no_87Value.contains("Evercoss / Cross A12B Jump Series")) {
                        _no_87Value.replace("Evercoss / Cross A12B Jump Series","");
                        _cbxEvercrossA21B.setChecked(true);
                    }
                    if(_no_87Value.contains("Evercoss / Cross A53B3")) {
                        _no_87Value.replace("Evercoss / Cross A53B3","");
                        _cbxEvercrossA35B.setChecked(true);
                    }
                    if(_no_85Value.contains("Evercoss / Cross Winner T A74A")) {
                        _no_87Value.replace("Evercoss / Cross Winner T A74A","");
                        _cbxEvercrossWinner.setChecked(true);
                    }
                    if(_no_87Value.contains("Evercoss / Cross A54 Jump")) {
                        _no_87Value.replace("Evercoss / Cross A54 Jump","");
                        _cbxEvercrossA54.setChecked(true);
                    }
                    if(_no_87Value != null && !_no_87Value.isEmpty() && !_no_87Value.equals(""))
                    {
                        _no_87Value.replace(";","");
                        _cbxEvercrossOther.setChecked(true);
                        _txtEvercrossOtherValue.setText(_no_87Value);
                    }
                }

                if(_no_88Value != null && !_no_88Value.isEmpty() && !_no_88Value.equals(""))
                {
                    _txtTotalTypeEvercross.setText(_no_88Value);
                }
            }
            if(_no_62Value.contains("Asus"))
            {
                _cbxAsus.setChecked(true);

                Helper.Show(_cbxAsusZenfone2Laser8);
                Helper.Show(_cbxAsusZenfone2Laser16);
                Helper.Show(_cbxAsusZenfoneGO);
                Helper.Show(_cbxAsusZenfone4S);
                Helper.Show(_cbxAsusNewZenfone4S);
                Helper.Show(_cbxAsusZenfone2ZE551ML);
                Helper.Show(_cbxAsusOther);
                Helper.Show(_txtAsusOtherValue);
                Helper.Show(_txtTotalTypeAsus);
                Helper.Show(_txtTotalTypeAsusLabel);

                if(_no_89Value != null && !_no_89Value.isEmpty() && !_no_89Value.equals(""))
                {
                    if(_no_89Value.contains("Zenfone 2 Laser 2GB/8GB"))
                    {
                        _no_89Value.replace("Zenfone 2 Laser 2GB/8G","");
                        _cbxAsusZenfone2Laser8.setChecked(true);
                    }
                    if(_no_89Value.contains("Zenfone 2 Laser 2GB/16GB"))
                    {
                        _no_89Value.replace("Zenfone 2 Laser 2GB/16GB","");
                        _cbxAsusZenfone2Laser16.setChecked(true);
                    }
                    if(_no_89Value.contains("Zenfone 2 Laser 2GB/16GB"))
                    {
                        _no_89Value.replace("Zenfone 2 Laser 2GB/16GB","");
                        _cbxAsusZenfoneGO.setChecked(true);
                    }
                    if(_no_89Value.contains("Zenfone 4S 1GB/8GB"))
                    {
                        _no_89Value.replace("Zenfone 4S 1GB/8GB","");
                        _cbxAsusZenfone4S.setChecked(true);
                    }
                    if(_no_89Value.contains("New Zenfone 4S 2GB/8GB"))
                    {
                        _no_89Value.replace("New Zenfone 4S 2GB/8GB","");
                        _cbxAsusNewZenfone4S.setChecked(true);
                    }
                    if(_no_89Value.contains("Zenfone 2 ZE551ML 32GB"))
                    {
                        _no_89Value.replace("Zenfone 2 ZE551ML 32GB","");
                        _cbxAsusZenfone2ZE551ML.setChecked(true);
                    }

                    if(_no_89Value != null && !_no_89Value.isEmpty() && !_no_89Value.equals(""))
                    {
                        _no_89Value.replace(";","");
                        _cbxAsusOther.setChecked(true);
                        _txtAsusOtherValue.setText(_no_89Value);
                    }
                }

                if(_no_90Value != null && !_no_90Value.isEmpty() && !_no_90Value.equals(""))
                {
                    _txtTotalTypeAsus.setText(_no_90Value);
                }
            }
            if(_no_62Value.contains("Acer"))
            {
                _cbxAcer.setChecked(true);

                Helper.Show(_cbxAcerZ220);
                Helper.Show(_cbxAcerZ520);
                Helper.Show(_cbxAcerOther);
                Helper.Show(_txtAcerOtherValue);
                Helper.Show(_txtTotalTypeAcer);
                Helper.Show(_txtTotalTypeAcerLabel);

                if(_no_91Value != null && !_no_91Value.isEmpty() && !_no_91Value.equals(""))
                {
                    if(_no_91Value.contains("Acer Liquid Z220 Dual"))
                    {
                        _no_91Value.replace("Acer Liquid Z220 Dual","");
                        _cbxAcerZ220.setChecked(true);
                    }
                    if(_no_91Value.contains("Acer Liquid Z520 DUAL"))
                    {
                        _no_91Value.replace("Acer Liquid Z520 DUAL","");
                        _cbxAcerZ520.setChecked(true);
                    }
                    if(_no_91Value != null && !_no_91Value.isEmpty() && !_no_91Value.equals(""))
                    {
                        _no_91Value.replace(";","");
                        _cbxAcerOther.setChecked(true);
                        _txtAcerOtherValue.setText(_no_91Value);
                    }
                }

                if(_no_92Value != null && !_no_92Value.isEmpty() && !_no_92Value.equals(""))
                {
                    _txtTotalTypeAcer.setText(_no_92Value);
                }
            }
            if(_no_62Value.contains("Xiaomi"))
            {
                _cbxXiaomi.setChecked(true);

                Helper.Show(_cbxXiaomiREDMI2Prime);
                Helper.Show(_cbxXiaomiREDMI28GB);
                Helper.Show(_cbxXiaomiREDMI216GB);
                Helper.Show(_cbxXiaomiMi4I);
                Helper.Show(_cbxXiaomiOther);
                Helper.Show(_txtXiaomiOtherValue);
                Helper.Show(_txtTotalTypeXiaomi);
                Helper.Show(_txtTotalTypeXiaomiLabel);

                if(_no_93Value != null && !_no_93Value.isEmpty() && !_no_93Value.equals(""))
                {
                    if(_no_93Value.contains("RED MI2 Prime"))
                    {
                        _no_93Value.replace("RED MI2 Prime","");
                        _cbxXiaomiREDMI2Prime.setChecked(true);
                    }
                    if(_no_93Value.contains("RED MI2 8GB LTE"))
                    {
                        _no_93Value.replace("RED MI2 8GB LTE","");
                        _cbxXiaomiREDMI28GB.setChecked(true);
                    }
                    if(_no_93Value.contains("RED MI2 16GB LTE"))
                    {
                        _no_93Value.replace("RED MI2 16GB LTE","");
                        _cbxXiaomiREDMI216GB.setChecked(true);
                    }
                    if(_no_93Value.contains("Mi4I LTE"))
                    {
                        _no_93Value.replace("Mi4I LTE","");
                        _cbxXiaomiMi4I.setChecked(true);
                    }

                    if(_no_93Value != null && !_no_93Value.isEmpty() && !_no_93Value.equals(""))
                    {
                        _no_93Value.replace(";","");
                        _cbxXiaomiOther.setChecked(true);
                        _txtXiaomiOtherValue.setText(_no_91Value);
                    }
                }

                if(_no_94Value != null && !_no_94Value.isEmpty() && !_no_94Value.equals(""))
                {
                    _txtTotalTypeXiaomi.setText(_no_94Value);
                }
            }
            if(_no_62Value.contains("Hi Sense"))
            {
                _cbxHiSense.setChecked(true);

                Helper.Show(_cbxHiSensePureShot);
                Helper.Show(_cbxHiSensePureShotPlus);
                Helper.Show(_cbxHiSenseOther);
                Helper.Show(_txtHiSenseOtherValue);
                Helper.Show(_txtTotalTypeHiSense);
                Helper.Show(_txtTotalTypeHiSenseLabel);

                if(_no_95Value != null && !_no_95Value.isEmpty() && !_no_95Value.equals(""))
                {
                    if(_no_95Value.contains("Pure Shot"))
                    {
                        _cbxHiSensePureShot.setChecked(true);
                        _no_95Value.replace("Pure Shot","");
                    }
                    if(_no_95Value.contains("Pure Shot Plus"))
                    {
                        _cbxHiSensePureShotPlus.setChecked(true);
                        _no_95Value.replace("Pure Shot Plus","");
                    }
                    if(_no_95Value != null && !_no_95Value.isEmpty() && !_no_95Value.equals(""))
                    {
                        _no_95Value.replace(";","");
                        _cbxHiSenseOther.setChecked(true);
                        _txtHiSenseOtherValue.setText(_no_95Value);
                    }
                }

                if(_no_96Value != null && !_no_96Value.isEmpty() && !_no_96Value.equals(""))
                {
                    _txtTotalTypeHiSense.setText(_no_90Value);
                }
            }


            Helper.Show(_rdgTelFlashExist);

            if(_no_97Value != null && !_no_97Value.isEmpty() && !_no_97Value.equals(""))
            {
                if(_no_97Value.equals("Ya"))
                {
                    _rdgTelFlashExist.check(R.id.radIsTelkomselFlashExistTrue);
                }
                else
                {
                    _rdgTelFlashExist.check(R.id.radIsTelkomselFlashExistFalse);
                }
            }

            Helper.Show(_rdgHuwaweiExist);

            if(_no_98Value != null && !_no_98Value.isEmpty() && !_no_98Value.equals(""))
            {
                if(_no_98Value.equals("Ya"))
                {
                    _rdgHuwaweiExist.check(R.id.radIsHuaweiExistTrue);
                }
                else
                {
                    _rdgHuwaweiExist.check(R.id.radIsHuaweiExistFalse);
                }
            }

            Helper.Show(_rdgZTEExist);

            if(_no_99Value != null && !_no_99Value.isEmpty() && !_no_99Value.equals(""))
            {
                if(_no_99Value.equals("Ya"))
                {
                    _rdgZTEExist.check(R.id.radIsZTEExistTrue);
                }
                else
                {
                    _rdgZTEExist.check(R.id.radIsZTEExistFalse);
                }
            }

            Helper.Show(_rdgBoltExist);

            if(_no_100Value != null && !_no_100Value.isEmpty() && !_no_100Value.equals(""))
            {
                if(_no_100Value.equals("Ya"))
                {
                    _rdgBoltExist.check(R.id.radIsBoltExistTrue);
                }
                else
                {
                    _rdgBoltExist.check(R.id.radIsBoltExistFalse);
                }
            }

        }


        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {

                Intent intent = new Intent(Blok6Activity.this, Blok5BActivity.class);
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

                startActivity(intent);
            }

            @Override
            public void onContinueClicked() {
//61b
                _no_61BValue = GetCheckBoxValue(_cbxBSimpati,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBKartuAs,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBKartuLoop,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBBIM3,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBMentari,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBXL,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBAxis,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBTri,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBSmartfren,_no_61BValue);
                _no_61BValue = GetCheckBoxValue(_cbxBEsia,_no_61BValue);

                //61c
                _no_61CValue = GetCheckBoxValue(_cbxCSimpati,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCKartuAs,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCKartuLoop,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCBIM3,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCMentari,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCXL,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCAxis,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCTri,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCSmartfren,_no_61CValue);
                _no_61CValue = GetCheckBoxValue(_cbxCBolt,_no_61CValue);

                //62
                _no_62Value = GetCheckBoxValue(_cbxSamsung,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxBlackBerry,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxNokia,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxLenovo,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxAdvan,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxSony,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxIphone,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxMito,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxLG,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxHTC,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxPolytron,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxOppo,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxEvercross,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxAsus,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxAcer,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxXiaomi,_no_62Value);
                _no_62Value = GetCheckBoxValue(_cbxHiSense,_no_62Value);

                //63 Samsung
                _no_63Value = GetCheckBoxValue(_cbxSamsung,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyYoung2,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyJ1,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyJ2,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyJ3,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyJ5,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyJ7,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyJ1Ace,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyA3,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyA5,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyA7,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyVPlus,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyNote5,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyS6,_no_63Value);
                //_no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyS5,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyS7,_no_63Value);
                _no_63Value = GetCheckBoxValue(_cbxSamsungGalaxyS7Edge,_no_63Value);

                if(_cbxSamsungOther.isChecked())
                {
                    _no_63Value = GetEditTextValue(_txtSamsungOtherValue,_no_63Value);
                }

                //64
                _no_64Value = GetEditTextValue(_txtTotalTypeSamsung,_no_64Value);

                //65
                _no_65Value = GetRadioGroupValue(_rdgBlackBerryExist, _no_65Value);

                //66
                _no_66Value = GetEditTextValue(_txtTotalTypeBlackBerry,_no_66Value);

                //67
                _no_67Value = GetRadioGroupValue(_rdgNokiaExist, _no_67Value);

                //68
                _no_68Value = GetEditTextValue(_txtTotalTypeNokia,_no_68Value);

                //69 Lenovo
                _no_69Value = GetCheckBoxValue(_cbxLenovoA6000,_no_69Value);
                _no_69Value = GetCheckBoxValue(_cbxLenovoA6000Plus,_no_69Value);
                _no_69Value = GetCheckBoxValue(_cbxLenovoA7000,_no_69Value);
                _no_69Value = GetCheckBoxValue(_cbxLenovoP70,_no_69Value);

                if(_cbxLenovoOther.isChecked())
                {
                    _no_69Value = GetEditTextValue(_txtLenovoOtherValue,_no_69Value);
                }

                //70
                _no_70Value = GetEditTextValue(_txtTotalTypeLenovo,_no_70Value);

                //71 Advan
                _no_71Value = GetCheckBoxValue(_cbxAdvanS35H,_no_71Value);
                _no_71Value = GetCheckBoxValue(_cbxAdvanS35D,_no_71Value);
                _no_71Value = GetCheckBoxValue(_cbxAdvanS35E,_no_71Value);

                if(_cbxAdvanOther.isChecked())
                {
                    _no_71Value = GetEditTextValue(_txtAdvanOtherValue,_no_71Value);
                }

                //72
                _no_72Value = GetEditTextValue(_txtTotalTypeAdvan,_no_72Value);

                //73 SONY
                _no_73Value = GetCheckBoxValue(_cbxXperiaC5,_no_73Value);
                _no_73Value = GetCheckBoxValue(_cbxXperiaE4,_no_73Value);
                _no_73Value = GetCheckBoxValue(_cbxXperiaM5,_no_73Value);
                _no_73Value = GetCheckBoxValue(_cbxXperiaM4,_no_73Value);

                if(_cbxXperiaOther.isChecked())
                {
                    _no_73Value = GetEditTextValue(_txtXperiaOtherValue,_no_73Value);
                }

                //74
                _no_74Value = GetEditTextValue(_txtTotalTypeSony,_no_74Value);

                //75
                _no_75Value = GetRadioGroupValue(_rdgIphoneExist, _no_75Value);

                //76
                _no_76Value = GetEditTextValue(_txtTotalTypeIphone,_no_76Value);

                //77
                _no_77Value = GetRadioGroupValue(_rdgMitoExist, _no_77Value);

                //78
                _no_78Value = GetEditTextValue(_txtTotalTypeMito,_no_78Value);

                //79 LG
                _no_79Value = GetCheckBoxValue(_cbxLGG4Dual,_no_79Value);
                _no_79Value = GetCheckBoxValue(_cbxLGMagna,_no_79Value);
                _no_79Value = GetCheckBoxValue(_cbxLGG4Stylus,_no_79Value);

                if(_cbxLGOther.isChecked())
                {
                    _no_79Value = GetEditTextValue(_txtLGOtherValue,_no_79Value);
                }

                //80
                _no_80Value = GetEditTextValue(_txtTotalTypeLG,_no_80Value);

                //81
                _no_81Value = GetRadioGroupValue(_rdgHTCExist, _no_81Value);

                //82
                _no_82Value = GetEditTextValue(_txtTotalTypeHTC,_no_82Value);

                //83
                _no_83Value = GetRadioGroupValue(_rdgPolytronExist, _no_83Value);

                //84
                _no_84Value = GetEditTextValue(_txtTotalTypePolytron,_no_84Value);

                //85 OPPO
                _no_85Value = GetCheckBoxValue(_cbxOPPOMirror5,_no_85Value);
                _no_85Value = GetCheckBoxValue(_cbxOPPOJoy3,_no_85Value);
                _no_85Value = GetCheckBoxValue(_cbxOPPOJoyPlus,_no_85Value);
                _no_85Value = GetCheckBoxValue(_cbxOPPONeo3,_no_85Value);
                _no_85Value = GetCheckBoxValue(_cbxOPPONeo5,_no_85Value);

                if(_cbxOPPOOther.isChecked())
                {
                    _no_85Value = GetEditTextValue(_txtOPPOOtherValue,_no_85Value);
                }

                //86
                _no_86Value = GetEditTextValue(_txtTotalTypeOppo,_no_86Value);

                //87 Evercross
                _no_87Value = GetCheckBoxValue(_cbxEvercrossA33A,_no_87Value);
                _no_87Value = GetCheckBoxValue(_cbxEvercrossA5P,_no_87Value);
                _no_87Value = GetCheckBoxValue(_cbxEvercrossA21B,_no_87Value);
                _no_87Value = GetCheckBoxValue(_cbxEvercrossA35B,_no_87Value);
                _no_87Value = GetCheckBoxValue(_cbxEvercrossWinner,_no_87Value);
                _no_87Value = GetCheckBoxValue(_cbxEvercrossA54,_no_87Value);

                if(_cbxEvercrossOther.isChecked())
                {
                    _no_87Value = GetEditTextValue(_txtEvercrossOtherValue,_no_87Value);
                }

                //88
                _no_88Value = GetEditTextValue(_txtTotalTypeEvercross,_no_88Value);

                //89 ASUS
                _no_89Value = GetCheckBoxValue(_cbxAsusZenfone2Laser8,_no_89Value);
                _no_89Value = GetCheckBoxValue(_cbxAsusZenfone2Laser16,_no_89Value);
                _no_89Value = GetCheckBoxValue(_cbxAsusZenfoneGO,_no_89Value);
                _no_89Value = GetCheckBoxValue(_cbxAsusZenfone4S,_no_89Value);
                _no_89Value = GetCheckBoxValue(_cbxAsusNewZenfone4S,_no_89Value);
                _no_89Value = GetCheckBoxValue(_cbxAsusZenfone2ZE551ML,_no_89Value);

                if(_cbxAsusOther.isChecked())
                {
                    _no_89Value = GetEditTextValue(_txtAsusOtherValue,_no_89Value);
                }

                //90
                _no_90Value = GetEditTextValue(_txtTotalTypeAsus,_no_90Value);

                //91 ACER
                _no_91Value = GetCheckBoxValue(_cbxAcerZ220,_no_91Value);
                _no_91Value = GetCheckBoxValue(_cbxAcerZ520,_no_91Value);

                if(_cbxAcerOther.isChecked())
                {
                    _no_91Value = GetEditTextValue(_txtAcerOtherValue,_no_91Value);
                }

                //92
                _no_92Value = GetEditTextValue(_txtTotalTypeAcer,_no_92Value);

                //93 XIAOMI
                _no_93Value = GetCheckBoxValue(_cbxXiaomiREDMI2Prime,_no_93Value);
                _no_93Value = GetCheckBoxValue(_cbxXiaomiREDMI28GB,_no_93Value);
                _no_93Value = GetCheckBoxValue(_cbxXiaomiREDMI216GB,_no_93Value);
                _no_93Value = GetCheckBoxValue(_cbxXiaomiMi4I,_no_93Value);

                if(_cbxXiaomiOther.isChecked())
                {
                    _no_93Value = GetEditTextValue(_txtXiaomiOtherValue,_no_93Value);
                }

                //94
                _no_94Value = GetEditTextValue(_txtTotalTypeXiaomi,_no_94Value);

                //95 Hi Sense
                _no_95Value = GetCheckBoxValue(_cbxHiSensePureShot,_no_95Value);
                _no_95Value = GetCheckBoxValue(_cbxHiSensePureShotPlus,_no_95Value);

                if(_cbxHiSenseOther.isChecked())
                {
                    _no_96Value = GetEditTextValue(_txtHiSenseOtherValue,_no_96Value);
                }

                //96
                _no_96Value = GetEditTextValue(_txtTotalTypeHiSense,_no_96Value);
                //97
                _no_97Value = GetRadioGroupValue(_rdgTelFlashExist,_no_97Value);
                //98
                _no_98Value = GetRadioGroupValue(_rdgHuwaweiExist,_no_98Value);
                //99
                _no_99Value = GetRadioGroupValue(_rdgZTEExist,_no_99Value);
                //100
                _no_100Value = GetRadioGroupValue(_rdgBoltExist,_no_100Value);


                int isError =0;

                if(_no_61BValue == null || _no_61BValue.isEmpty() || _no_61BValue.equals(""))
                {
                    isError ++;
                    _error61b.setError("error");
                    _error61b.setText("Minimal satu (1) checkbox harus dipilih");
                    Helper.Show(_error61b);
                }
                else
                {
                    _error61b.setError(null);
                    _error61b.setText("");
                    Helper.Hide(_error61b);
                }


                if(_no_61CValue == null || _no_61CValue.isEmpty() || _no_61CValue.equals(""))
                {
                    isError ++;
                    _error61c.setError("error");
                    _error61c.setText("Minimal satu (1) checkbox harus dipilih");
                    Helper.Show(_error61c);
                }else
                {
                    _error61c.setError(null);
                    _error61c.setText("");
                    Helper.Hide(_error61c);
                }


                if(_no_62Value != null && !_no_62Value.isEmpty() && !_no_62Value.equals("")) {
                    if (_no_62Value.contains("Samsung")) {

                        if (_no_63Value != null && !_no_63Value.isEmpty() && !_no_63Value.equals("")) {

                            if (_cbxSamsungOther.isChecked()) {

                                String otherValueText =_txtSamsungOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorSamsung.setError("error");
                                    _errorSamsung.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                    Helper.Show(_errorSamsung);
                                }else
                                {
                                    _errorSamsung.setError(null);
                                    _errorSamsung.setText("");
                                    Helper.Hide(_errorSamsung);
                                }
                            }
                        }
                        else
                        {
                            isError++;
                            _errorSamsung.setError("error");
                            _errorSamsung.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_64Value == null && _no_64Value.isEmpty() && _no_64Value.equals("")) {
                            isError++;
                            _errorTotalTypeSamsung.setError("error");
                            _errorTotalTypeSamsung.setText("Total harus diisi");
                            Helper.Show(_errorTotalTypeSamsung);
                        }else
                        {
                            _errorTotalTypeSamsung.setError(null);
                            _errorTotalTypeSamsung.setText("");
                            Helper.Hide(_errorTotalTypeSamsung);
                        }

                    }
                    if (_no_62Value.contains("Blackberry")) {

                        if (_no_66Value == null && _no_66Value.isEmpty() && _no_66Value.equals("")) {
                            isError++;
                            _errorTotalTypeBlackBerry.setError("error");
                            _errorTotalTypeBlackBerry.setText("Total harus diisi");
                            Helper.Show(_errorTotalTypeBlackBerry);
                        }
                        else
                        {
                            _errorTotalTypeBlackBerry.setError(null);
                            _errorTotalTypeBlackBerry.setText("");
                            Helper.Hide(_errorTotalTypeBlackBerry);
                        }
                    }
                    if (_no_62Value.contains("Nokia (Microsoft)")) {

                        if (_no_68Value == null && _no_68Value.isEmpty() && _no_68Value.equals("")) {
                            isError++;
                            _errorTotalTypeNokia.setError("error");
                            _errorTotalTypeNokia.setText("Total harus diisi");
                            Helper.Show(_errorTotalTypeNokia);
                        }
                        else
                        {
                            _errorTotalTypeBlackBerry.setError(null);
                            _errorTotalTypeBlackBerry.setText("");
                            Helper.Hide(_errorTotalTypeNokia);
                        }
                    }
                    if (_no_62Value.contains("Lenovo")) {

                        if (_no_69Value != null && !_no_69Value.isEmpty() && !_no_69Value.equals("")) {

                            if (_cbxLenovoOther.isChecked()) {
                                String otherValueText =_txtLenovoOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorLenovo.setError("error");
                                    _errorLenovo.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                    Helper.Show(_errorLenovo);
                                }
                                else
                                {
                                    _errorLenovo.setError(null);
                                    _errorLenovo.setText("");
                                    Helper.Hide(_errorLenovo);
                                }
                            }
                        }
                        else
                        {
                            isError++;
                            _errorLenovo.setError("error");
                            _errorLenovo.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_70Value == null && _no_70Value.isEmpty() && _no_70Value.equals("")) {
                            isError++;
                            _errorTotalTypeLenovo.setError("error");
                            _errorTotalTypeLenovo.setText("Total harus diisi");
                            Helper.Show(_errorTotalTypeLenovo);
                        }
                        else
                        {
                            _errorTotalTypeLenovo.setError(null);
                            _errorTotalTypeLenovo.setText("");
                            Helper.Hide(_errorTotalTypeLenovo);
                        }
                    }
                    if (_no_62Value.contains("Advan")) {

                        if (_no_71Value != null && !_no_71Value.isEmpty() && !_no_71Value.equals("")) {

                            if (_cbxAdvanOther.isChecked()) {
                                String otherValueText =_txtAdvanOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorAdvan.setError("error");
                                    _errorAdvan.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorAdvan.setError(null);
                                    _errorAdvan.setText("");
                                }
                            }
                        }
                        else
                        {
                            isError ++;
                            _errorAdvan.setError("error");
                            _errorAdvan.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_72Value == null && _no_72Value.isEmpty() && _no_72Value.equals("")) {
                            isError++;
                            _errorTotalTypeAdvan.setError("error");
                            _errorTotalTypeAdvan.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeAdvan.setError(null);
                            _errorTotalTypeAdvan.setText("");
                        }
                    }
                    if (_no_62Value.contains("Sony")) {
                        _cbxSony.setChecked(true);

                        if (_no_73Value != null && !_no_73Value.isEmpty() && !_no_73Value.equals("")) {

                            if (_cbxXperiaOther.isChecked()) {
                                String otherValueText =_txtXperiaOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorSony.setError("error");
                                    _errorSony.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorSony.setError(null);
                                    _errorSony.setText("");
                                }
                            }
                        }
                        else
                        {
                            isError ++;
                            _errorSony.setError("error");
                            _errorSony.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_74Value == null && _no_74Value.isEmpty() && _no_74Value.equals("")) {
                            isError++;
                            _errorTotalTypeSony.setError("error");
                            _errorTotalTypeSony.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeSony.setError(null);
                            _errorTotalTypeSony.setText("");
                        }
                    }
                    if (_no_62Value.contains("iPhone")) {

                        if (_no_76Value == null && _no_76Value.isEmpty() && _no_76Value.equals("")) {
                            isError++;
                            _errorTotalTypeIphone.setError("error");
                            _errorTotalTypeIphone.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeIphone.setError(null);
                            _errorTotalTypeIphone.setText("");
                        }
                    }
                    if (_no_62Value.contains("Mito")) {

                        if (_no_78Value == null && _no_78Value.isEmpty() && _no_78Value.equals("")) {
                            isError++;
                            _errorTotalTypeMito.setError("error");
                            _errorTotalTypeMito.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeMito.setError(null);
                            _errorTotalTypeMito.setText("");
                        }
                    }
                    if (_no_62Value.contains("LG")) {

                        if (_no_79Value != null && !_no_79Value.isEmpty() && !_no_79Value.equals("")) {

                            if (_cbxLGOther.isChecked()) {
                                isError ++;
                                _errorLG.setError("error");
                                _errorLG.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                            }
                            else
                            {
                                _errorLG.setError(null);
                                _errorLG.setText("");
                            }
                        }
                        else {
                            isError ++;
                            _errorLG.setError("error");
                            _errorLG.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_80Value == null && _no_80Value.isEmpty() && _no_80Value.equals("")) {
                            isError++;
                            _errorTotalTypeLG.setError("error");
                            _errorTotalTypeLG.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeLG.setError(null);
                            _errorTotalTypeLG.setText("");
                        }
                    }
                    if (_no_62Value.contains("HTC")) {

                        if (_no_82Value == null && _no_82Value.isEmpty() && _no_82Value.equals("")) {
                            isError++;
                            _errorTotalTypeHTC.setError("error");
                            _errorTotalTypeHTC.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeHTC.setError(null);
                            _errorTotalTypeHTC.setText("");
                        }
                    }
                    if (_no_62Value.contains("Polytron")) {
                        if (_no_84Value != null && _no_84Value.isEmpty() && _no_84Value.equals("")) {
                            isError++;
                            _errorTotalTypePolytron.setError("error");
                            _errorTotalTypePolytron.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypePolytron.setError(null);
                            _errorTotalTypePolytron.setText("");
                        }
                    }
                    if (_no_62Value.contains("Oppo")) {


                        if (_no_85Value != null && !_no_85Value.isEmpty() && !_no_85Value.equals("")) {

                            if (_cbxOPPOOther.isChecked()) {
                                String otherValueText =_txtOPPOOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorOppo.setError("error");
                                    _errorOppo.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorOppo.setError(null);
                                    _errorOppo.setText("");
                                }
                            }
                        }
                        else {
                            isError ++;
                            _errorOppo.setError("error");
                            _errorOppo.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_86Value == null && _no_86Value.isEmpty() && _no_86Value.equals("")) {
                            isError++;
                            _errorTotalTypeOppo.setError("error");
                            _errorTotalTypeOppo.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeOppo.setError(null);
                            _errorTotalTypeOppo.setText("");
                        }
                    }
                    if (_no_62Value.contains("Evercross")) {

                        if (_no_87Value != null && !_no_87Value.isEmpty() && !_no_87Value.equals("")) {

                            if (_cbxEvercrossOther.isChecked()) {
                                String otherValueText =_txtEvercrossOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorEvercross.setError("error");
                                    _errorEvercross.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorEvercross.setError(null);
                                    _errorEvercross.setText("");
                                }
                            }

                        }
                        else {
                            isError ++;
                            _errorEvercross.setError("error");
                            _errorEvercross.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_88Value == null && _no_88Value.isEmpty() && _no_88Value.equals("")) {
                            isError++;
                            _errorTotalTypeEvercross.setError("error");
                            _errorTotalTypeEvercross.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeEvercross.setError(null);
                            _errorTotalTypeEvercross.setText("");
                        }
                    }
                    if (_no_62Value.contains("Asus")) {

                        if (_no_89Value != null && !_no_89Value.isEmpty() && !_no_89Value.equals("")) {

                            if (_cbxAsusOther.isChecked()) {
                                String otherValueText =_txtAsusOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorAsus.setError("error");
                                    _errorAsus.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorAsus.setError(null);
                                    _errorAsus.setText("");
                                }
                            }
                        }
                        else {
                            isError ++;
                            _errorAsus.setError("error");
                            _errorAsus.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_90Value == null && _no_90Value.isEmpty() && _no_90Value.equals("")) {
                            isError++;
                            _errorTotalTypeAsus.setError("error");
                            _errorTotalTypeAsus.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeAsus.setError(null);
                            _errorTotalTypeAsus.setText("");
                        }
                    }
                    if (_no_62Value.contains("Acer")) {

                        if (_no_91Value != null && !_no_91Value.isEmpty() && !_no_91Value.equals("")) {

                            if (_cbxAcerOther.isChecked()) {
                                String otherValueText =_txtAcerOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorAcer.setError("error");
                                    _errorAcer.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorAcer.setError(null);
                                    _errorAcer.setText("");
                                }
                            }
                        }
                        else {
                            isError ++;
                            _errorAcer.setError("error");
                            _errorAcer.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_92Value == null && _no_92Value.isEmpty() && _no_92Value.equals("")) {
                            isError++;
                            _errorTotalTypeAcer.setError("error");
                            _errorTotalTypeAcer.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeAcer.setError(null);
                            _errorTotalTypeAcer.setText("");
                        }
                    }
                    if (_no_62Value.contains("Xiaomi")) {

                        if (_no_93Value != null && !_no_93Value.isEmpty() && !_no_93Value.equals("")) {

                            if (_cbxXiaomiOther.isChecked()) {
                                String otherValueText =_txtXiaomiOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorXiaomi.setError("error");
                                    _errorXiaomi.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorXiaomi.setError(null);
                                    _errorXiaomi.setText("");
                                }
                            }
                        }
                        else {
                            isError ++;
                            _errorXiaomi.setError("error");
                            _errorXiaomi.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_94Value == null && _no_94Value.isEmpty() && _no_94Value.equals("")) {
                            isError++;
                            _errorTotalTypeXiaomi.setError("error");
                            _errorTotalTypeXiaomi.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeXiaomi.setError(null);
                            _errorTotalTypeXiaomi.setText("");
                        }
                    }
                    if (_no_62Value.contains("Hi Sense")) {

                        if (_no_95Value != null && !_no_95Value.isEmpty() && !_no_95Value.equals("")) {

                            if (_cbxHiSenseOther.isChecked()) {
                                String otherValueText =_txtHiSenseOtherValue.getText().toString();

                                if (otherValueText == null && otherValueText.isEmpty() && otherValueText.equals(""))
                                {
                                    isError ++;
                                    _errorHiSense.setError("error");
                                    _errorHiSense.setText("Lengkapi keterangan jika pilih \"Lainnya\"");
                                }
                                else
                                {
                                    _errorHiSense.setError(null);
                                    _errorHiSense.setText("");
                                }
                            }
                        }
                        else {
                            isError ++;
                            _errorHiSense.setError("error");
                            _errorHiSense.setText("Minimal satu (1) checkbox harus dipilih");
                        }

                        if (_no_96Value == null && _no_96Value.isEmpty() && _no_96Value.equals("")) {
                            isError++;
                            _errorTotalTypeHiSense.setError("error");
                            _errorTotalTypeHiSense.setText("Total harus diisi");
                        }
                        else
                        {
                            _errorTotalTypeHiSense.setError(null);
                            _errorTotalTypeHiSense.setText("");
                        }
                    }

                }
                else {
                    isError ++;
                    _error62.setError("error");
                    _error62.setText("Minimal satu (1) checkbox harus dipilih");
                }

                if(isError == 0) {
                    Intent intent = new Intent(Blok6Activity.this, Blok7Activity.class);
                    intent.putExtra("DeviceSurveyID", extras.getString("DeviceSurveyID"));
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
                    intent.putExtra("NO_61B", _no_61BValue);
                    intent.putExtra("NO_61C", _no_61CValue);
                    intent.putExtra("NO_62", _no_62Value);
                    intent.putExtra("NO_63", _no_63Value);
                    intent.putExtra("NO_64", _no_64Value);
                    intent.putExtra("NO_65", _no_65Value);
                    intent.putExtra("NO_66", _no_66Value);
                    intent.putExtra("NO_67", _no_67Value);
                    intent.putExtra("NO_68", _no_68Value);
                    intent.putExtra("NO_69", _no_69Value);
                    intent.putExtra("NO_70", _no_70Value);
                    intent.putExtra("NO_71", _no_71Value);
                    intent.putExtra("NO_72", _no_72Value);
                    intent.putExtra("NO_73", _no_73Value);
                    intent.putExtra("NO_74", _no_74Value);
                    intent.putExtra("NO_75", _no_75Value);
                    intent.putExtra("NO_76", _no_76Value);
                    intent.putExtra("NO_77", _no_77Value);
                    intent.putExtra("NO_78", _no_78Value);
                    intent.putExtra("NO_79", _no_79Value);
                    intent.putExtra("NO_80", _no_80Value);
                    intent.putExtra("NO_81", _no_81Value);
                    intent.putExtra("NO_82", _no_82Value);
                    intent.putExtra("NO_83", _no_83Value);
                    intent.putExtra("NO_84", _no_84Value);
                    intent.putExtra("NO_85", _no_85Value);
                    intent.putExtra("NO_86", _no_86Value);
                    intent.putExtra("NO_87", _no_87Value);
                    intent.putExtra("NO_88", _no_88Value);
                    intent.putExtra("NO_89", _no_89Value);
                    intent.putExtra("NO_90", _no_90Value);
                    intent.putExtra("NO_91", _no_91Value);
                    intent.putExtra("NO_92", _no_92Value);
                    intent.putExtra("NO_93", _no_93Value);
                    intent.putExtra("NO_94", _no_94Value);
                    intent.putExtra("NO_95", _no_95Value);
                    intent.putExtra("NO_96", _no_96Value);
                    intent.putExtra("NO_97", _no_97Value);
                    intent.putExtra("NO_98", _no_98Value);
                    intent.putExtra("NO_99", _no_99Value);
                    intent.putExtra("NO_100", _no_100Value);

                    startActivity(intent);
                }
            }
        });
    }
}
