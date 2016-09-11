package com.smartfren.instrat.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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
        if(!edtxt.equals("") && edtxt!= null)
        {
            result = result + ";"+ edtxt.getText().toString();
        }
        return result;
    }

    protected String GetRedioGroupValue(RadioGroup rdg, String result)
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

        _cbxLenovoA6000.setVisibility(View.GONE);
        _cbxLenovoA6000Plus.setVisibility(View.GONE);
        _cbxLenovoA7000.setVisibility(View.GONE);
        _cbxLenovoP70.setVisibility(View.GONE);
        _cbxLenovoOther.setVisibility(View.GONE);

        _cbxAdvanS35H.setVisibility(View.GONE);
        _cbxAdvanS35D.setVisibility(View.GONE);
        _cbxAdvanS35E.setVisibility(View.GONE);
        _cbxAdvanOther.setVisibility(View.GONE);

        _cbxXperiaC5.setVisibility(View.GONE);
        _cbxXperiaE4.setVisibility(View.GONE);
        _cbxXperiaM5.setVisibility(View.GONE);
        _cbxXperiaM4.setVisibility(View.GONE);
        _cbxXperiaOther.setVisibility(View.GONE);

        _cbxLGG4Dual.setVisibility(View.GONE);
        _cbxLGMagna.setVisibility(View.GONE);
        _cbxLGG4Stylus.setVisibility(View.GONE);
        _cbxLGOther.setVisibility(View.GONE);

        _cbxOPPOMirror5.setVisibility(View.GONE);
        _cbxOPPOJoy3.setVisibility(View.GONE);
        _cbxOPPOJoyPlus.setVisibility(View.GONE);
        _cbxOPPONeo3.setVisibility(View.GONE);
        _cbxOPPONeo5.setVisibility(View.GONE);
        _cbxOPPOOther.setVisibility(View.GONE);

        _cbxEvercrossA33A.setVisibility(View.GONE);
        _cbxEvercrossA5P.setVisibility(View.GONE);
        _cbxEvercrossA21B.setVisibility(View.GONE);
        _cbxEvercrossA35B.setVisibility(View.GONE);
        _cbxEvercrossWinner.setVisibility(View.GONE);
        _cbxEvercrossA54.setVisibility(View.GONE);
        _cbxEvercrossOther.setVisibility(View.GONE);

        _cbxAsusZenfone2Laser8.setVisibility(View.GONE);
        _cbxAsusZenfone2Laser16.setVisibility(View.GONE);
        _cbxAsusZenfoneGO.setVisibility(View.GONE);
        _cbxAsusZenfone4S.setVisibility(View.GONE);
        _cbxAsusNewZenfone4S.setVisibility(View.GONE);
        _cbxAsusZenfone2ZE551ML.setVisibility(View.GONE);
        _cbxAsusOther.setVisibility(View.GONE);

        _cbxAcerZ220.setVisibility(View.GONE);
        _cbxAcerZ520.setVisibility(View.GONE);
        _cbxAcerOther.setVisibility(View.GONE);

        _cbxXiaomiREDMI2Prime.setVisibility(View.GONE);
        _cbxXiaomiREDMI28GB.setVisibility(View.GONE);
        _cbxXiaomiREDMI216GB.setVisibility(View.GONE);
        _cbxXiaomiMi4I.setVisibility(View.GONE);
        _cbxXiaomiOther.setVisibility(View.GONE);

        _cbxHiSensePureShot.setVisibility(View.GONE);
        _cbxHiSensePureShotPlus.setVisibility(View.GONE);
        _cbxHiSenseOther.setVisibility(View.GONE);

        _txtTotalTypeSamsung.setVisibility(View.GONE);
        _txtTotalTypeBlackBerry.setVisibility(View.GONE);
        _txtTotalTypeNokia.setVisibility(View.GONE);
        _txtTotalTypeLenovo.setVisibility(View.GONE);
        _txtTotalTypeAdvan.setVisibility(View.GONE);
        _txtTotalTypeSony.setVisibility(View.GONE);
        _txtTotalTypeIphone.setVisibility(View.GONE);
        _txtTotalTypeMito.setVisibility(View.GONE);
        _txtTotalTypeLG.setVisibility(View.GONE);
        _txtTotalTypeHTC.setVisibility(View.GONE);
        _txtTotalTypePolytron.setVisibility(View.GONE);
        _txtTotalTypeOppo.setVisibility(View.GONE);
        _txtTotalTypeEvercross.setVisibility(View.GONE);
        _txtTotalTypeAsus.setVisibility(View.GONE);
        _txtTotalTypeAcer.setVisibility(View.GONE);
        _txtTotalTypeXiaomi.setVisibility(View.GONE);
        _txtTotalTypeHiSense.setVisibility(View.GONE);

        _txtTotalTypeSamsungLabel.setVisibility(View.GONE);
        _txtTotalTypeBlackBerryLabel.setVisibility(View.GONE);
        _txtTotalTypeNokiaLabel.setVisibility(View.GONE);
        _txtTotalTypeLenovoLabel.setVisibility(View.GONE);
        _txtTotalTypeAdvanLabel.setVisibility(View.GONE);
        _txtTotalTypeSonyLabel.setVisibility(View.GONE);
        _txtTotalTypeIphoneLabel.setVisibility(View.GONE);
        _txtTotalTypeMitoLabel.setVisibility(View.GONE);
        _txtTotalTypeLGLabel.setVisibility(View.GONE);
        _txtTotalTypeHTCLabel.setVisibility(View.GONE);
        _txtTotalTypePolytronLabel.setVisibility(View.GONE);
        _txtTotalTypeOppoLabel.setVisibility(View.GONE);
        _txtTotalTypeEvercrossLabel.setVisibility(View.GONE);
        _txtTotalTypeAsusLabel.setVisibility(View.GONE);
        _txtTotalTypeAcerLabel.setVisibility(View.GONE);
        _txtTotalTypeXiaomiLabel.setVisibility(View.GONE);
        _txtTotalTypeHiSenseLabel.setVisibility(View.GONE);

        _rdgBlackBerryExist.setVisibility(View.GONE);
        _rdgNokiaExist.setVisibility(View.GONE);
        _rdgIphoneExist.setVisibility(View.GONE);
        _rdgMitoExist.setVisibility(View.GONE);
        _rdgHTCExist.setVisibility(View.GONE);
        _rdgPolytronExist.setVisibility(View.GONE);

        _txtSamsungOtherValue.setVisibility(View.GONE);
        _txtAdvanOtherValue.setVisibility(View.GONE);
        _txtLenovoOtherValue.setVisibility(View.GONE);
        _txtXperiaOtherValue.setVisibility(View.GONE);
        _txtLGOtherValue.setVisibility(View.GONE);
        _txtOPPOOtherValue.setVisibility(View.GONE);
        _txtEvercrossOtherValue.setVisibility(View.GONE);
        _txtAsusOtherValue.setVisibility(View.GONE);
        _txtAcerOtherValue.setVisibility(View.GONE);
        _txtXiaomiOtherValue.setVisibility(View.GONE);
        _txtHiSenseOtherValue.setVisibility(View.GONE);

        _txtSamsungLabel.setVisibility(View.GONE);
        _txtBlackBerryLabel.setVisibility(View.GONE);
        _txtNokiaLabel.setVisibility(View.GONE);
        _txtLenovoLabel.setVisibility(View.GONE);
        _txtAdvanLabel.setVisibility(View.GONE);
        _txtSonyLabel.setVisibility(View.GONE);
        _txtIphoneLabel.setVisibility(View.GONE);
        _txtMitoLabel.setVisibility(View.GONE);
        _txtLGLabel.setVisibility(View.GONE);
        _txtHTCLabel.setVisibility(View.GONE);
        _txtPolytronLabel.setVisibility(View.GONE);
        _txtOppoLabel.setVisibility(View.GONE);
        _txtEvercrossLabel.setVisibility(View.GONE);
        _txtAsusLabel.setVisibility(View.GONE);
        _txtAcerLabel.setVisibility(View.GONE);
        _txtXiaomiLabel.setVisibility(View.GONE);
        _txtHiSenseLabel.setVisibility(View.GONE);

        _cbxSamsungOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtSamsungOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtSamsungOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxLenovoOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtLenovoOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtLenovoOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxAdvanOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtAdvanOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtAdvanOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxXperiaOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtXperiaOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtXperiaOtherValue.setVisibility(View.GONE);
                }
            }
        });


        _cbxLGOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtLGOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtLGOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxOPPOOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtOPPOOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtOPPOOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxEvercrossOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtEvercrossOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtEvercrossOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxAsusOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtAsusOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtAsusOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxAcerOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtAcerOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtAcerOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxXiaomiOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtXiaomiOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtXiaomiOtherValue.setVisibility(View.GONE);
                }
            }
        });

        _cbxHiSenseOther.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    _txtHiSenseOtherValue.setVisibility(View.VISIBLE);
                }
                else
                {
                    _txtHiSenseOtherValue.setVisibility(View.GONE);
                }
            }
        });

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
                    _txtTotalTypeSamsungLabel.setVisibility(View.VISIBLE);
                    _txtTotalTypeSamsung.setVisibility(View.VISIBLE);
                    _txtSamsungLabel.setVisibility(View.VISIBLE);
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
                    _txtTotalTypeSamsungLabel.setVisibility(View.GONE);
                    _txtTotalTypeSamsung.setVisibility(View.GONE);
                    _txtSamsungLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeLenovo.setVisibility(View.VISIBLE);
                    _txtTotalTypeLenovoLabel.setVisibility(View.VISIBLE);
                    _txtLenovoLabel.setVisibility(View.VISIBLE);
                }else {
                    _cbxLenovoA6000.setVisibility(View.GONE);
                    _cbxLenovoA6000Plus.setVisibility(View.GONE);
                    _cbxLenovoA7000.setVisibility(View.GONE);
                    _cbxLenovoP70.setVisibility(View.GONE);
                    _cbxLenovoOther.setVisibility(View.GONE);
                    _txtTotalTypeLenovo.setVisibility(View.GONE);
                    _txtTotalTypeLenovoLabel.setVisibility(View.GONE);
                    _txtLenovoLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeAdvan.setVisibility(View.VISIBLE);
                    _txtTotalTypeAdvanLabel.setVisibility(View.VISIBLE);
                    _txtAdvanLabel.setVisibility(View.VISIBLE);
                }else {
                    _cbxAdvanS35H.setVisibility(View.GONE);
                    _cbxAdvanS35D.setVisibility(View.GONE);
                    _cbxAdvanS35E.setVisibility(View.GONE);
                    _cbxAdvanOther.setVisibility(View.GONE);
                    _txtTotalTypeAdvan.setVisibility(View.GONE);
                    _txtTotalTypeAdvanLabel.setVisibility(View.GONE);
                    _txtAdvanLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeSony.setVisibility(View.VISIBLE);
                    _txtTotalTypeSonyLabel.setVisibility(View.VISIBLE);
                    _txtSonyLabel.setVisibility(View.VISIBLE);
                } else {
                    _cbxXperiaC5.setVisibility(View.GONE);
                    _cbxXperiaE4.setVisibility(View.GONE);
                    _cbxXperiaM5.setVisibility(View.GONE);
                    _cbxXperiaM4.setVisibility(View.GONE);
                    _cbxXperiaOther.setVisibility(View.GONE);
                    _txtTotalTypeSony.setVisibility(View.GONE);
                    _txtTotalTypeSonyLabel.setVisibility(View.GONE);
                    _txtSonyLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeLG.setVisibility(View.VISIBLE);
                    _txtTotalTypeLGLabel.setVisibility(View.VISIBLE);
                    _txtLGLabel.setVisibility(View.VISIBLE);
                } else {
                    _cbxLGG4Dual.setVisibility(View.GONE);
                    _cbxLGMagna.setVisibility(View.GONE);
                    _cbxLGG4Stylus.setVisibility(View.GONE);
                    _cbxLGOther.setVisibility(View.GONE);
                    _txtTotalTypeLG.setVisibility(View.GONE);
                    _txtTotalTypeLGLabel.setVisibility(View.GONE);
                    _txtLGLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeOppo.setVisibility(View.VISIBLE);
                    _txtTotalTypeOppoLabel.setVisibility(View.VISIBLE);
                    _txtOppoLabel.setVisibility(View.VISIBLE);

                }else {
                    _cbxOPPOMirror5.setVisibility(View.GONE);
                    _cbxOPPOJoy3.setVisibility(View.GONE);
                    _cbxOPPOJoyPlus.setVisibility(View.GONE);
                    _cbxOPPONeo3.setVisibility(View.GONE);
                    _cbxOPPONeo5.setVisibility(View.GONE);
                    _cbxOPPOOther.setVisibility(View.GONE);
                    _txtTotalTypeOppo.setVisibility(View.GONE);
                    _txtTotalTypeOppoLabel.setVisibility(View.GONE);
                    _txtOppoLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeEvercross.setVisibility(View.VISIBLE);
                    _txtTotalTypeEvercrossLabel.setVisibility(View.VISIBLE);
                    _txtEvercrossLabel.setVisibility(View.VISIBLE);

                }else {
                    _cbxEvercrossA33A.setVisibility(View.GONE);
                    _cbxEvercrossA5P.setVisibility(View.GONE);
                    _cbxEvercrossA21B.setVisibility(View.GONE);
                    _cbxEvercrossA35B.setVisibility(View.GONE);
                    _cbxEvercrossWinner.setVisibility(View.GONE);
                    _cbxEvercrossA54.setVisibility(View.GONE);
                    _cbxEvercrossOther.setVisibility(View.GONE);
                    _txtTotalTypeEvercross.setVisibility(View.GONE);
                    _txtTotalTypeEvercrossLabel.setVisibility(View.GONE);
                    _txtEvercrossLabel.setVisibility(View.GONE);

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
                    _txtTotalTypeAsus.setVisibility(View.VISIBLE);
                    _txtTotalTypeAsusLabel.setVisibility(View.VISIBLE);
                    _txtAsusLabel.setVisibility(View.VISIBLE);
                }else {
                    _cbxAsusZenfone2Laser8.setVisibility(View.GONE);
                    _cbxAsusZenfone2Laser16.setVisibility(View.GONE);
                    _cbxAsusZenfoneGO.setVisibility(View.GONE);
                    _cbxAsusZenfone4S.setVisibility(View.GONE);
                    _cbxAsusNewZenfone4S.setVisibility(View.GONE);
                    _cbxAsusZenfone2ZE551ML.setVisibility(View.GONE);
                    _cbxAsusOther.setVisibility(View.GONE);
                    _txtTotalTypeAsus.setVisibility(View.GONE);
                    _txtTotalTypeAsusLabel.setVisibility(View.GONE);
                    _txtAsusLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeAcer.setVisibility(View.VISIBLE);
                    _txtTotalTypeAcerLabel.setVisibility(View.VISIBLE);
                    _txtAcerLabel.setVisibility(View.VISIBLE);
                }else {
                    _cbxAcerZ220.setVisibility(View.GONE);
                    _cbxAcerZ520.setVisibility(View.GONE);
                    _cbxAcerOther.setVisibility(View.GONE);
                    _txtTotalTypeAcer.setVisibility(View.GONE);
                    _txtTotalTypeAcerLabel.setVisibility(View.GONE);
                    _txtAcerLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeXiaomi.setVisibility(View.VISIBLE);
                    _txtTotalTypeXiaomiLabel.setVisibility(View.VISIBLE);
                    _txtXiaomiLabel.setVisibility(View.VISIBLE);
                }else {
                    _cbxXiaomiREDMI2Prime.setVisibility(View.GONE);
                    _cbxXiaomiREDMI28GB.setVisibility(View.GONE);
                    _cbxXiaomiREDMI216GB.setVisibility(View.GONE);
                    _cbxXiaomiMi4I.setVisibility(View.GONE);
                    _cbxXiaomiOther.setVisibility(View.GONE);
                    _txtTotalTypeXiaomi.setVisibility(View.GONE);
                    _txtTotalTypeXiaomiLabel.setVisibility(View.GONE);
                    _txtXiaomiLabel.setVisibility(View.VISIBLE);
                }
            }
        });

        _cbxBlackBerry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _rdgBlackBerryExist.setVisibility(View.VISIBLE);
                    _txtTotalTypeBlackBerry.setVisibility(View.VISIBLE);
                    _txtTotalTypeBlackBerryLabel.setVisibility(View.VISIBLE);
                    _txtBlackBerryLabel.setVisibility(View.VISIBLE);
                }else {
                    _rdgBlackBerryExist.setVisibility(View.GONE);
                    _txtTotalTypeBlackBerry.setVisibility(View.GONE);
                    _txtTotalTypeBlackBerryLabel.setVisibility(View.GONE);
                    _txtBlackBerryLabel.setVisibility(View.GONE);
                }
            }
        });

        _cbxNokia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _rdgNokiaExist.setVisibility(View.VISIBLE);
                    _txtTotalTypeNokia.setVisibility(View.VISIBLE);
                    _txtTotalTypeNokiaLabel.setVisibility(View.VISIBLE);
                    _txtNokiaLabel.setVisibility(View.VISIBLE);
                }else {
                    _rdgNokiaExist.setVisibility(View.GONE);
                    _txtTotalTypeNokia.setVisibility(View.GONE);
                    _txtTotalTypeNokiaLabel.setVisibility(View.GONE);
                    _txtNokiaLabel.setVisibility(View.GONE);
                }
            }
        });

        _cbxIphone.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _rdgIphoneExist.setVisibility(View.VISIBLE);
                    _txtTotalTypeIphone.setVisibility(View.VISIBLE);
                    _txtTotalTypeIphoneLabel.setVisibility(View.VISIBLE);
                    _txtIphoneLabel.setVisibility(View.VISIBLE);
                }else {
                    _rdgIphoneExist.setVisibility(View.GONE);
                    _txtTotalTypeIphone.setVisibility(View.GONE);
                    _txtTotalTypeIphoneLabel.setVisibility(View.GONE);
                    _txtIphoneLabel.setVisibility(View.GONE);
                }
            }
        });

        _cbxMito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _rdgMitoExist.setVisibility(View.VISIBLE);
                    _txtTotalTypeMito.setVisibility(View.VISIBLE);
                    _txtTotalTypeMitoLabel.setVisibility(View.VISIBLE);
                    _txtMitoLabel.setVisibility(View.VISIBLE);
                }else {
                    _rdgMitoExist.setVisibility(View.GONE);
                    _txtTotalTypeMito.setVisibility(View.GONE);
                    _txtTotalTypeMitoLabel.setVisibility(View.GONE);
                    _txtMitoLabel.setVisibility(View.GONE);
                }
            }
        });

        _cbxHTC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _rdgHTCExist.setVisibility(View.VISIBLE);
                    _txtTotalTypeHTC.setVisibility(View.VISIBLE);
                    _txtTotalTypeHTCLabel.setVisibility(View.VISIBLE);
                    _txtHTCLabel.setVisibility(View.VISIBLE);
                }else {
                    _rdgHTCExist.setVisibility(View.GONE);
                    _txtTotalTypeHTC.setVisibility(View.GONE);
                    _txtTotalTypeHTCLabel.setVisibility(View.GONE);
                    _txtHTCLabel.setVisibility(View.GONE);
                }
            }
        });

        _cbxPolytron.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    _rdgPolytronExist.setVisibility(View.VISIBLE);
                    _txtTotalTypePolytron.setVisibility(View.VISIBLE);
                    _txtTotalTypePolytronLabel.setVisibility(View.VISIBLE);
                    _txtPolytronLabel.setVisibility(View.VISIBLE);
                }else {
                    _rdgPolytronExist.setVisibility(View.GONE);
                    _txtTotalTypePolytron.setVisibility(View.GONE);
                    _txtTotalTypePolytronLabel.setVisibility(View.GONE);
                    _txtPolytronLabel.setVisibility(View.GONE);
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
                    _txtTotalTypeHiSense.setVisibility(View.VISIBLE);
                    _txtTotalTypeHiSenseLabel.setVisibility(View.VISIBLE);
                    _txtHiSenseLabel.setVisibility(View.VISIBLE);
                }else {

                    _cbxHiSensePureShot.setVisibility(View.GONE);
                    _cbxHiSensePureShotPlus.setVisibility(View.GONE);
                    _cbxHiSenseOther.setVisibility(View.GONE);
                    _txtHiSenseLabel.setVisibility(View.GONE);
                }
            }
        });


        int validateCount = 0;

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
                _no_65Value = GetRedioGroupValue(_rdgBlackBerryExist, _no_65Value);

                //66
                _no_66Value = GetEditTextValue(_txtTotalTypeBlackBerry,_no_66Value);

                //67
                _no_67Value = GetRedioGroupValue(_rdgNokiaExist, _no_67Value);

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
                _no_75Value = GetRedioGroupValue(_rdgIphoneExist, _no_75Value);

                //76
                _no_76Value = GetEditTextValue(_txtTotalTypeIphone,_no_76Value);

                //77
                _no_77Value = GetRedioGroupValue(_rdgMitoExist, _no_77Value);

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
                _no_81Value = GetRedioGroupValue(_rdgHTCExist, _no_81Value);

                //82
                _no_82Value = GetEditTextValue(_txtTotalTypeHTC,_no_82Value);

                //83
                _no_83Value = GetRedioGroupValue(_rdgPolytronExist, _no_83Value);

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
                _no_97Value = GetRedioGroupValue(_rdgTelFlashExist,_no_97Value);
                //98
                _no_98Value = GetRedioGroupValue(_rdgHuwaweiExist,_no_98Value);
                //99
                _no_99Value = GetRedioGroupValue(_rdgZTEExist,_no_99Value);
                //100
                //_no_100Value = GetRedioGroupValue(_rdgBoltExist,_no_100Value);
                _no_100Value = "Ada";

                Intent intent = new Intent(Blok6Activity.this, Blok7Activity.class);
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
                intent.putExtra("NO_100", _no_100Value);

                startActivity(intent);
            }
        });
            }
}
