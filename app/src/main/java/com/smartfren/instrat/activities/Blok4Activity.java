package com.smartfren.instrat.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.Helper;

public class Blok4Activity extends BaseStepsActivity {

    private CheckBox _cbQ38ASmartfren;
    private CheckBox _cbQ38AAdvan;
    private CheckBox _cbQ38AAsus;
    private CheckBox _cbQ38ABlackberry;
    private CheckBox _cbQ38AEvercoss;
    private CheckBox _cbQ38AIndosat;
    private CheckBox _cbQ38ALenovo;
    private CheckBox _cbQ38AMito;
    private CheckBox _cbQ38ANokia;
    private CheckBox _cbQ38AOppo;
    private CheckBox _cbQ38ASamsung;
    private CheckBox _cbQ38ASony;
    private CheckBox _cbQ38ATelkomsel;
    private CheckBox _cbQ38AXL;
    private CheckBox _cbQ38A3;
    private CheckBox _cbQ38ATidakAda;
    private CheckBox _cbQ38ALainnya;

    private CheckBox _cbQ39ASmartfren;
    private CheckBox _cbQ39AAdvan;
    private CheckBox _cbQ39AAsus;
    private CheckBox _cbQ39ABlackberry;
    private CheckBox _cbQ39AEvercoss;
    private CheckBox _cbQ39AIndosat;
    private CheckBox _cbQ39ALenovo;
    private CheckBox _cbQ39AMito;
    private CheckBox _cbQ39ANokia;
    private CheckBox _cbQ39AOppo;
    private CheckBox _cbQ39ASamsung;
    private CheckBox _cbQ39ASony;
    private CheckBox _cbQ39ATelkomsel;
    private CheckBox _cbQ39AXL;
    private CheckBox _cbQ39A3;
    private CheckBox _cbQ39ATidakAda;
    private CheckBox _cbQ39ALainnya;

    private CheckBox _cbQ40ASmartfren;
    private CheckBox _cbQ40AAdvan;
    private CheckBox _cbQ40AAsus;
    private CheckBox _cbQ40ABlackberry;
    private CheckBox _cbQ40AEvercoss;
    private CheckBox _cbQ40AIndosat;
    private CheckBox _cbQ40ALenovo;
    private CheckBox _cbQ40AMito;
    private CheckBox _cbQ40ANokia;
    private CheckBox _cbQ40AOppo;
    private CheckBox _cbQ40ASamsung;
    private CheckBox _cbQ40ASony;
    private CheckBox _cbQ40ATelkomsel;
    private CheckBox _cbQ40AXL;
    private CheckBox _cbQ40A3;
    private CheckBox _cbQ40ATidakAda;
    private CheckBox _cbQ40ALainnya;

    private CheckBox _cbQ41ASmartfren;
    private CheckBox _cbQ41AAdvan;
    private CheckBox _cbQ41AAsus;
    private CheckBox _cbQ41ABlackberry;
    private CheckBox _cbQ41AEvercoss;
    private CheckBox _cbQ41AIndosat;
    private CheckBox _cbQ41ALenovo;
    private CheckBox _cbQ41AMito;
    private CheckBox _cbQ41ANokia;
    private CheckBox _cbQ41AOppo;
    private CheckBox _cbQ41ASamsung;
    private CheckBox _cbQ41ASony;
    private CheckBox _cbQ41ATelkomsel;
    private CheckBox _cbQ41AXL;
    private CheckBox _cbQ41A3;
    private CheckBox _cbQ41ATidakAda;
    private CheckBox _cbQ41ALainnya;

    private CheckBox _cbQ42ASmartfren;
    private CheckBox _cbQ42AAdvan;
    private CheckBox _cbQ42AAsus;
    private CheckBox _cbQ42ABlackberry;
    private CheckBox _cbQ42AEvercoss;
    private CheckBox _cbQ42AIndosat;
    private CheckBox _cbQ42ALenovo;
    private CheckBox _cbQ42AMito;
    private CheckBox _cbQ42ANokia;
    private CheckBox _cbQ42AOppo;
    private CheckBox _cbQ42ASamsung;
    private CheckBox _cbQ42ASony;
    private CheckBox _cbQ42ATelkomsel;
    private CheckBox _cbQ42AXL;
    private CheckBox _cbQ42A3;
    private CheckBox _cbQ42ATidakAda;
    private CheckBox _cbQ42ALainnya;

    private CheckBox _cbQ43ASmartfren;
    private CheckBox _cbQ43AAdvan;
    private CheckBox _cbQ43AAsus;
    private CheckBox _cbQ43ABlackberry;
    private CheckBox _cbQ43AEvercoss;
    private CheckBox _cbQ43AIndosat;
    private CheckBox _cbQ43ALenovo;
    private CheckBox _cbQ43AMito;
    private CheckBox _cbQ43ANokia;
    private CheckBox _cbQ43AOppo;
    private CheckBox _cbQ43ASamsung;
    private CheckBox _cbQ43ASony;
    private CheckBox _cbQ43ATelkomsel;
    private CheckBox _cbQ43AXL;
    private CheckBox _cbQ43A3;
    private CheckBox _cbQ43ATidakAda;
    private CheckBox _cbQ43ALainnya;

    private CheckBox _cbQ44ASmartfren;
    private CheckBox _cbQ44AAdvan;
    private CheckBox _cbQ44AAsus;
    private CheckBox _cbQ44ABlackberry;
    private CheckBox _cbQ44AEvercoss;
    private CheckBox _cbQ44AIndosat;
    private CheckBox _cbQ44ALenovo;
    private CheckBox _cbQ44AMito;
    private CheckBox _cbQ44ANokia;
    private CheckBox _cbQ44AOppo;
    private CheckBox _cbQ44ASamsung;
    private CheckBox _cbQ44ASony;
    private CheckBox _cbQ44ATelkomsel;
    private CheckBox _cbQ44AXL;
    private CheckBox _cbQ44A3;
    private CheckBox _cbQ44ATidakAda;
    private CheckBox _cbQ44ALainnya;

    private CheckBox _cbQ45ASmartfren;
    private CheckBox _cbQ45AAdvan;
    private CheckBox _cbQ45AAsus;
    private CheckBox _cbQ45ABlackberry;
    private CheckBox _cbQ45AEvercoss;
    private CheckBox _cbQ45AIndosat;
    private CheckBox _cbQ45ALenovo;
    private CheckBox _cbQ45AMito;
    private CheckBox _cbQ45ANokia;
    private CheckBox _cbQ45AOppo;
    private CheckBox _cbQ45ASamsung;
    private CheckBox _cbQ45ASony;
    private CheckBox _cbQ45ATelkomsel;
    private CheckBox _cbQ45AXL;
    private CheckBox _cbQ45A3;
    private CheckBox _cbQ45ATidakAda;
    private CheckBox _cbQ45ALainnya;

    private EditText _txtQ38A;
    private EditText _txtQ39A;
    private EditText _txtQ40A;
    private EditText _txtQ41A;
    private EditText _txtQ42A;
    private EditText _txtQ43A;
    private EditText _txtQ44A;
    private EditText _txtQ45A;

    private Spinner _spQ46A;
    private Spinner _spQ47A;

    private TextView _txtQ46A;

    private TextView _errorQ38A;
    private TextView _errorQ39A;
    private TextView _errorQ40A;
    private TextView _errorQ41A;
    private TextView _errorQ42A;
    private TextView _errorQ43A;
    private TextView _errorQ44A;
    private TextView _errorQ45A;
    private TextView _errorQ46A;
    private TextView _errorQ47A;

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

    protected String GetCheckBoxValue(CheckBox cb, String result)
    {
        if(cb.isChecked())
        {
            if(result.isEmpty() || result.equals(""))
            {
                result = cb.getText().toString();
            }
            else
            {
                result = result + ";"+ cb.getText().toString();
            }
        }
        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_blok4);
        extras = getIntent().getExtras();

        _cbQ38ASmartfren = (CheckBox) findViewById(R.id.cbQ38ASmartfren);
        _cbQ38AAdvan = (CheckBox) findViewById(R.id.cbQ38AAdvan);
        _cbQ38AAsus = (CheckBox) findViewById(R.id.cbQ38AAsus);
        _cbQ38ABlackberry = (CheckBox) findViewById(R.id.cbQ38ABlackberry);
        _cbQ38AEvercoss = (CheckBox) findViewById(R.id.cbQ38AEvercoss);
        _cbQ38AIndosat = (CheckBox) findViewById(R.id.cbQ38AIndosat);
        _cbQ38ALenovo = (CheckBox) findViewById(R.id.cbQ38ALenovo);
        _cbQ38AMito = (CheckBox) findViewById(R.id.cbQ38AMito);
        _cbQ38ANokia = (CheckBox) findViewById(R.id.cbQ38ANokia);
        _cbQ38AOppo = (CheckBox) findViewById(R.id.cbQ38AOppo);
        _cbQ38ASamsung = (CheckBox) findViewById(R.id.cbQ38ASamsung);
        _cbQ38ASony = (CheckBox) findViewById(R.id.cbQ38ASony);
        _cbQ38ATelkomsel = (CheckBox) findViewById(R.id.cbQ38ATelkomsel);
        _cbQ38A3 = (CheckBox) findViewById(R.id.cbQ38A3);
        _cbQ38AXL = (CheckBox) findViewById(R.id.cbQ38AXL);
        _cbQ38ATidakAda = (CheckBox) findViewById(R.id.cbQ38ATidakAda);
        _cbQ38ALainnya = (CheckBox) findViewById(R.id.cbQ38ALainnya);

        _cbQ39ASmartfren = (CheckBox) findViewById(R.id.cbQ39ASmartfren);
        _cbQ39AAdvan = (CheckBox) findViewById(R.id.cbQ39AAdvan);
        _cbQ39AAsus = (CheckBox) findViewById(R.id.cbQ39AAsus);
        _cbQ39ABlackberry = (CheckBox) findViewById(R.id.cbQ39ABlackberry);
        _cbQ39AEvercoss = (CheckBox) findViewById(R.id.cbQ39AEvercoss);
        _cbQ39AIndosat = (CheckBox) findViewById(R.id.cbQ39AIndosat);
        _cbQ39ALenovo = (CheckBox) findViewById(R.id.cbQ39ALenovo);
        _cbQ39AMito = (CheckBox) findViewById(R.id.cbQ39AMito);
        _cbQ39ANokia = (CheckBox) findViewById(R.id.cbQ39ANokia);
        _cbQ39AOppo = (CheckBox) findViewById(R.id.cbQ39AOppo);
        _cbQ39ASamsung = (CheckBox) findViewById(R.id.cbQ39ASamsung);
        _cbQ39ASony = (CheckBox) findViewById(R.id.cbQ39ASony);
        _cbQ39ATelkomsel = (CheckBox) findViewById(R.id.cbQ39ATelkomsel);
        _cbQ39A3 = (CheckBox) findViewById(R.id.cbQ39A3);
        _cbQ39AXL = (CheckBox) findViewById(R.id.cbQ39AXL);
        _cbQ39ATidakAda = (CheckBox) findViewById(R.id.cbQ39ATidakAda);
        _cbQ39ALainnya = (CheckBox) findViewById(R.id.cbQ39ALainnya);

        _cbQ40ASmartfren = (CheckBox) findViewById(R.id.cbQ40ASmartfren);
        _cbQ40AAdvan = (CheckBox) findViewById(R.id.cbQ40AAdvan);
        _cbQ40AAsus = (CheckBox) findViewById(R.id.cbQ40AAsus);
        _cbQ40ABlackberry = (CheckBox) findViewById(R.id.cbQ40ABlackberry);
        _cbQ40AEvercoss = (CheckBox) findViewById(R.id.cbQ40AEvercoss);
        _cbQ40AIndosat = (CheckBox) findViewById(R.id.cbQ40AIndosat);
        _cbQ40ALenovo = (CheckBox) findViewById(R.id.cbQ40ALenovo);
        _cbQ40AMito = (CheckBox) findViewById(R.id.cbQ40AMito);
        _cbQ40ANokia = (CheckBox) findViewById(R.id.cbQ40ANokia);
        _cbQ40AOppo = (CheckBox) findViewById(R.id.cbQ40AOppo);
        _cbQ40ASamsung = (CheckBox) findViewById(R.id.cbQ40ASamsung);
        _cbQ40ASony = (CheckBox) findViewById(R.id.cbQ40ASony);
        _cbQ40ATelkomsel = (CheckBox) findViewById(R.id.cbQ40ATelkomsel);
        _cbQ40A3 = (CheckBox) findViewById(R.id.cbQ40A3);
        _cbQ40AXL = (CheckBox) findViewById(R.id.cbQ40AXL);
        _cbQ40ATidakAda = (CheckBox) findViewById(R.id.cbQ40ATidakAda);
        _cbQ40ALainnya = (CheckBox) findViewById(R.id.cbQ40ALainnya);

        _cbQ41ASmartfren = (CheckBox) findViewById(R.id.cbQ41ASmartfren);
        _cbQ41AAdvan = (CheckBox) findViewById(R.id.cbQ41AAdvan);
        _cbQ41AAsus = (CheckBox) findViewById(R.id.cbQ41AAsus);
        _cbQ41ABlackberry = (CheckBox) findViewById(R.id.cbQ41ABlackberry);
        _cbQ41AEvercoss = (CheckBox) findViewById(R.id.cbQ41AEvercoss);
        _cbQ41AIndosat = (CheckBox) findViewById(R.id.cbQ41AIndosat);
        _cbQ41ALenovo = (CheckBox) findViewById(R.id.cbQ41ALenovo);
        _cbQ41AMito = (CheckBox) findViewById(R.id.cbQ41AMito);
        _cbQ41ANokia = (CheckBox) findViewById(R.id.cbQ41ANokia);
        _cbQ41AOppo = (CheckBox) findViewById(R.id.cbQ41AOppo);
        _cbQ41ASamsung = (CheckBox) findViewById(R.id.cbQ41ASamsung);
        _cbQ41ASony = (CheckBox) findViewById(R.id.cbQ41ASony);
        _cbQ41ATelkomsel = (CheckBox) findViewById(R.id.cbQ41ATelkomsel);
        _cbQ41A3 = (CheckBox) findViewById(R.id.cbQ41A3);
        _cbQ41AXL = (CheckBox) findViewById(R.id.cbQ41AXL);
        _cbQ41ATidakAda = (CheckBox) findViewById(R.id.cbQ41ATidakAda);
        _cbQ41ALainnya = (CheckBox) findViewById(R.id.cbQ41ALainnya);

        _cbQ42ASmartfren = (CheckBox) findViewById(R.id.cbQ42ASmartfren);
        _cbQ42AAdvan = (CheckBox) findViewById(R.id.cbQ42AAdvan);
        _cbQ42AAsus = (CheckBox) findViewById(R.id.cbQ42AAsus);
        _cbQ42ABlackberry = (CheckBox) findViewById(R.id.cbQ42ABlackberry);
        _cbQ42AEvercoss = (CheckBox) findViewById(R.id.cbQ42AEvercoss);
        _cbQ42AIndosat = (CheckBox) findViewById(R.id.cbQ42AIndosat);
        _cbQ42ALenovo = (CheckBox) findViewById(R.id.cbQ42ALenovo);
        _cbQ42AMito = (CheckBox) findViewById(R.id.cbQ42AMito);
        _cbQ42ANokia = (CheckBox) findViewById(R.id.cbQ42ANokia);
        _cbQ42AOppo = (CheckBox) findViewById(R.id.cbQ42AOppo);
        _cbQ42ASamsung = (CheckBox) findViewById(R.id.cbQ42ASamsung);
        _cbQ42ASony = (CheckBox) findViewById(R.id.cbQ42ASony);
        _cbQ42ATelkomsel = (CheckBox) findViewById(R.id.cbQ42ATelkomsel);
        _cbQ42A3 = (CheckBox) findViewById(R.id.cbQ42A3);
        _cbQ42AXL = (CheckBox) findViewById(R.id.cbQ42AXL);
        _cbQ42ATidakAda = (CheckBox) findViewById(R.id.cbQ42ATidakAda);
        _cbQ42ALainnya = (CheckBox) findViewById(R.id.cbQ42ALainnya);

        _cbQ43ASmartfren = (CheckBox) findViewById(R.id.cbQ43ASmartfren);
        _cbQ43AAdvan = (CheckBox) findViewById(R.id.cbQ43AAdvan);
        _cbQ43AAsus = (CheckBox) findViewById(R.id.cbQ43AAsus);
        _cbQ43ABlackberry = (CheckBox) findViewById(R.id.cbQ43ABlackberry);
        _cbQ43AEvercoss = (CheckBox) findViewById(R.id.cbQ43AEvercoss);
        _cbQ43AIndosat = (CheckBox) findViewById(R.id.cbQ43AIndosat);
        _cbQ43ALenovo = (CheckBox) findViewById(R.id.cbQ43ALenovo);
        _cbQ43AMito = (CheckBox) findViewById(R.id.cbQ43AMito);
        _cbQ43ANokia = (CheckBox) findViewById(R.id.cbQ43ANokia);
        _cbQ43AOppo = (CheckBox) findViewById(R.id.cbQ43AOppo);
        _cbQ43ASamsung = (CheckBox) findViewById(R.id.cbQ43ASamsung);
        _cbQ43ASony = (CheckBox) findViewById(R.id.cbQ43ASony);
        _cbQ43ATelkomsel = (CheckBox) findViewById(R.id.cbQ43ATelkomsel);
        _cbQ43A3 = (CheckBox) findViewById(R.id.cbQ43A3);
        _cbQ43AXL = (CheckBox) findViewById(R.id.cbQ43AXL);
        _cbQ43ATidakAda = (CheckBox) findViewById(R.id.cbQ43ATidakAda);
        _cbQ43ALainnya = (CheckBox) findViewById(R.id.cbQ43ALainnya);

        _cbQ44ASmartfren = (CheckBox) findViewById(R.id.cbQ44ASmartfren);
        _cbQ44AAdvan = (CheckBox) findViewById(R.id.cbQ44AAdvan);
        _cbQ44AAsus = (CheckBox) findViewById(R.id.cbQ44AAsus);
        _cbQ44ABlackberry = (CheckBox) findViewById(R.id.cbQ44ABlackberry);
        _cbQ44AEvercoss = (CheckBox) findViewById(R.id.cbQ44AEvercoss);
        _cbQ44AIndosat = (CheckBox) findViewById(R.id.cbQ44AIndosat);
        _cbQ44ALenovo = (CheckBox) findViewById(R.id.cbQ44ALenovo);
        _cbQ44AMito = (CheckBox) findViewById(R.id.cbQ44AMito);
        _cbQ44ANokia = (CheckBox) findViewById(R.id.cbQ44ANokia);
        _cbQ44AOppo = (CheckBox) findViewById(R.id.cbQ44AOppo);
        _cbQ44ASamsung = (CheckBox) findViewById(R.id.cbQ44ASamsung);
        _cbQ44ASony = (CheckBox) findViewById(R.id.cbQ44ASony);
        _cbQ44ATelkomsel = (CheckBox) findViewById(R.id.cbQ44ATelkomsel);
        _cbQ44A3 = (CheckBox) findViewById(R.id.cbQ44A3);
        _cbQ44AXL = (CheckBox) findViewById(R.id.cbQ44AXL);
        _cbQ44ATidakAda = (CheckBox) findViewById(R.id.cbQ44ATidakAda);
        _cbQ44ALainnya = (CheckBox) findViewById(R.id.cbQ44ALainnya);

        _cbQ45ASmartfren = (CheckBox) findViewById(R.id.cbQ45ASmartfren);
        _cbQ45AAdvan = (CheckBox) findViewById(R.id.cbQ45AAdvan);
        _cbQ45AAsus = (CheckBox) findViewById(R.id.cbQ45AAsus);
        _cbQ45ABlackberry = (CheckBox) findViewById(R.id.cbQ45ABlackberry);
        _cbQ45AEvercoss = (CheckBox) findViewById(R.id.cbQ45AEvercoss);
        _cbQ45AIndosat = (CheckBox) findViewById(R.id.cbQ45AIndosat);
        _cbQ45ALenovo = (CheckBox) findViewById(R.id.cbQ45ALenovo);
        _cbQ45AMito = (CheckBox) findViewById(R.id.cbQ45AMito);
        _cbQ45ANokia = (CheckBox) findViewById(R.id.cbQ45ANokia);
        _cbQ45AOppo = (CheckBox) findViewById(R.id.cbQ45AOppo);
        _cbQ45ASamsung = (CheckBox) findViewById(R.id.cbQ45ASamsung);
        _cbQ45ASony = (CheckBox) findViewById(R.id.cbQ45ASony);
        _cbQ45ATelkomsel = (CheckBox) findViewById(R.id.cbQ45ATelkomsel);
        _cbQ45A3 = (CheckBox) findViewById(R.id.cbQ45A3);
        _cbQ45AXL = (CheckBox) findViewById(R.id.cbQ45AXL);
        _cbQ45ATidakAda = (CheckBox) findViewById(R.id.cbQ45ATidakAda);
        _cbQ45ALainnya = (CheckBox) findViewById(R.id.cbQ45ALainnya);

        _txtQ38A = (EditText) findViewById(R.id.txtQ38A);
        _txtQ39A = (EditText) findViewById(R.id.txtQ39A);
        _txtQ40A = (EditText) findViewById(R.id.txtQ40A);
        _txtQ41A = (EditText) findViewById(R.id.txtQ41A);
        _txtQ42A = (EditText) findViewById(R.id.txtQ42A);
        _txtQ43A = (EditText) findViewById(R.id.txtQ43A);
        _txtQ44A = (EditText) findViewById(R.id.txtQ44A);
        _txtQ45A = (EditText) findViewById(R.id.txtQ45A);

        _spQ46A = (Spinner) findViewById(R.id.spQ46A);
        _spQ47A = (Spinner) findViewById(R.id.spQ47A);

        _txtQ46A = (EditText) findViewById(R.id.txtQ46A);

        _errorQ38A = (TextView) findViewById(R.id.errorQ38A);
        _errorQ39A = (TextView) findViewById(R.id.errorQ39A);
        _errorQ40A = (TextView) findViewById(R.id.errorQ40A);
        _errorQ41A = (TextView) findViewById(R.id.errorQ41A);
        _errorQ42A = (TextView) findViewById(R.id.errorQ42A);
        _errorQ43A = (TextView) findViewById(R.id.errorQ43A);
        _errorQ44A = (TextView) findViewById(R.id.errorQ44A);
        _errorQ45A = (TextView) findViewById(R.id.errorQ45A);
        _errorQ46A = (TextView) findViewById(R.id.errorQ46A);
        _errorQ47A = (TextView) findViewById(R.id.errorQ47A);

        Helper.Hide(_txtQ38A);
        Helper.Hide(_txtQ39A);
        Helper.Hide(_txtQ40A);
        Helper.Hide(_txtQ41A);
        Helper.Hide(_txtQ42A);
        Helper.Hide(_txtQ43A);
        Helper.Hide(_txtQ44A);
        Helper.Hide(_txtQ45A);
        Helper.Hide(_txtQ46A);

        if(extras.getString("NO_38") != null)
        {
            if(extras.getString("NO_38").contains("Smartfren"))
            {
                _cbQ38ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Advan"))
            {
                _cbQ38AAdvan.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Asus"))
            {
                _cbQ38AAsus.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Blackberry"))
            {
                _cbQ38ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Evercoss"))
            {
                _cbQ38AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Indosat"))
            {
                _cbQ38AIndosat.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Lenovo"))
            {
                _cbQ38ALenovo.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Mito"))
            {
                _cbQ38AMito.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Nokia"))
            {
                _cbQ38ANokia.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Oppo"))
            {
                _cbQ38AOppo.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Samsung"))
            {
                _cbQ38ASamsung.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Sony"))
            {
                _cbQ38ASony.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Telkomsel"))
            {
                _cbQ38ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Tri"))
            {
                _cbQ38A3.setChecked(true);
            }
            if(extras.getString("NO_38").contains("XL"))
            {
                _cbQ38AXL.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Tidak Ada"))
            {
                _cbQ38ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_38").contains("Lainnya"))
            {
                _cbQ38ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_38").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                        !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                        !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                        !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ38ALainnya.setChecked(true);
                        _txtQ38A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_39") != null)
        {
            if(extras.getString("NO_39").contains("Smartfren"))
            {
                _cbQ39ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Advan"))
            {
                _cbQ39AAdvan.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Asus"))
            {
                _cbQ39AAsus.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Blackberry"))
            {
                _cbQ39ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Evercoss"))
            {
                _cbQ39AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Indosat"))
            {
                _cbQ39AIndosat.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Lenovo"))
            {
                _cbQ39ALenovo.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Mito"))
            {
                _cbQ39AMito.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Nokia"))
            {
                _cbQ39ANokia.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Oppo"))
            {
                _cbQ39AOppo.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Samsung"))
            {
                _cbQ39ASamsung.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Sony"))
            {
                _cbQ39ASony.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Telkomsel"))
            {
                _cbQ39ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Tri"))
            {
                _cbQ39A3.setChecked(true);
            }
            if(extras.getString("NO_39").contains("XL"))
            {
                _cbQ39AXL.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Tidak Ada"))
            {
                _cbQ39ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Lainnya"))
            {
                _cbQ39ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_39").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ39ALainnya.setChecked(true);
                        _txtQ39A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_39") != null)
        {
            if(extras.getString("NO_39").contains("Smartfren"))
            {
                _cbQ39ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Advan"))
            {
                _cbQ39AAdvan.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Asus"))
            {
                _cbQ39AAsus.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Blackberry"))
            {
                _cbQ39ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Evercoss"))
            {
                _cbQ39AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Indosat"))
            {
                _cbQ39AIndosat.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Lenovo"))
            {
                _cbQ39ALenovo.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Mito"))
            {
                _cbQ39AMito.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Nokia"))
            {
                _cbQ39ANokia.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Oppo"))
            {
                _cbQ39AOppo.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Samsung"))
            {
                _cbQ39ASamsung.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Sony"))
            {
                _cbQ39ASony.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Telkomsel"))
            {
                _cbQ39ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Tri"))
            {
                _cbQ39A3.setChecked(true);
            }
            if(extras.getString("NO_39").contains("XL"))
            {
                _cbQ39AXL.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Tidak Ada"))
            {
                _cbQ39ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_39").contains("Lainnya"))
            {
                _cbQ39ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_39").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ39ALainnya.setChecked(true);
                        _txtQ39A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_40") != null)
        {
            if(extras.getString("NO_40").contains("Smartfren"))
            {
                _cbQ40ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Advan"))
            {
                _cbQ40AAdvan.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Asus"))
            {
                _cbQ40AAsus.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Blackberry"))
            {
                _cbQ40ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Evercoss"))
            {
                _cbQ40AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Indosat"))
            {
                _cbQ40AIndosat.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Lenovo"))
            {
                _cbQ40ALenovo.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Mito"))
            {
                _cbQ40AMito.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Nokia"))
            {
                _cbQ40ANokia.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Oppo"))
            {
                _cbQ40AOppo.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Samsung"))
            {
                _cbQ40ASamsung.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Sony"))
            {
                _cbQ40ASony.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Telkomsel"))
            {
                _cbQ40ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Tri"))
            {
                _cbQ40A3.setChecked(true);
            }
            if(extras.getString("NO_40").contains("XL"))
            {
                _cbQ40AXL.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Tidak Ada"))
            {
                _cbQ40ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_40").contains("Lainnya"))
            {
                _cbQ40ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_40").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ40ALainnya.setChecked(true);
                        _txtQ40A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_41") != null)
        {
            if(extras.getString("NO_41").contains("Smartfren"))
            {
                _cbQ41ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Advan"))
            {
                _cbQ41AAdvan.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Asus"))
            {
                _cbQ41AAsus.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Blackberry"))
            {
                _cbQ41ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Evercoss"))
            {
                _cbQ41AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Indosat"))
            {
                _cbQ41AIndosat.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Lenovo"))
            {
                _cbQ41ALenovo.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Mito"))
            {
                _cbQ41AMito.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Nokia"))
            {
                _cbQ41ANokia.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Oppo"))
            {
                _cbQ41AOppo.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Samsung"))
            {
                _cbQ41ASamsung.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Sony"))
            {
                _cbQ41ASony.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Telkomsel"))
            {
                _cbQ41ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Tri"))
            {
                _cbQ41A3.setChecked(true);
            }
            if(extras.getString("NO_41").contains("XL"))
            {
                _cbQ41AXL.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Tidak Ada"))
            {
                _cbQ41ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_41").contains("Lainnya"))
            {
                _cbQ41ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_41").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ41ALainnya.setChecked(true);
                        _txtQ41A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_42") != null)
        {
            if(extras.getString("NO_42").contains("Smartfren"))
            {
                _cbQ42ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Advan"))
            {
                _cbQ42AAdvan.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Asus"))
            {
                _cbQ42AAsus.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Blackberry"))
            {
                _cbQ42ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Evercoss"))
            {
                _cbQ42AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Indosat"))
            {
                _cbQ42AIndosat.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Lenovo"))
            {
                _cbQ42ALenovo.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Mito"))
            {
                _cbQ42AMito.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Nokia"))
            {
                _cbQ42ANokia.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Oppo"))
            {
                _cbQ42AOppo.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Samsung"))
            {
                _cbQ42ASamsung.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Sony"))
            {
                _cbQ42ASony.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Telkomsel"))
            {
                _cbQ42ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Tri"))
            {
                _cbQ42A3.setChecked(true);
            }
            if(extras.getString("NO_42").contains("XL"))
            {
                _cbQ42AXL.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Tidak Ada"))
            {
                _cbQ42ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_42").contains("Lainnya"))
            {
                _cbQ42ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_42").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ42ALainnya.setChecked(true);
                        _txtQ42A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_43") != null)
        {
            if(extras.getString("NO_43").contains("Smartfren"))
            {
                _cbQ43ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Advan"))
            {
                _cbQ43AAdvan.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Asus"))
            {
                _cbQ43AAsus.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Blackberry"))
            {
                _cbQ43ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Evercoss"))
            {
                _cbQ43AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Indosat"))
            {
                _cbQ43AIndosat.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Lenovo"))
            {
                _cbQ43ALenovo.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Mito"))
            {
                _cbQ43AMito.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Nokia"))
            {
                _cbQ43ANokia.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Oppo"))
            {
                _cbQ43AOppo.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Samsung"))
            {
                _cbQ43ASamsung.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Sony"))
            {
                _cbQ43ASony.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Telkomsel"))
            {
                _cbQ43ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Tri"))
            {
                _cbQ43A3.setChecked(true);
            }
            if(extras.getString("NO_43").contains("XL"))
            {
                _cbQ43AXL.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Tidak Ada"))
            {
                _cbQ43ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_43").contains("Lainnya"))
            {
                _cbQ43ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_43").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ43ALainnya.setChecked(true);
                        _txtQ43A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_44") != null)
        {
            if(extras.getString("NO_44").contains("Smartfren"))
            {
                _cbQ44ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Advan"))
            {
                _cbQ44AAdvan.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Asus"))
            {
                _cbQ44AAsus.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Blackberry"))
            {
                _cbQ44ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Evercoss"))
            {
                _cbQ44AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Indosat"))
            {
                _cbQ44AIndosat.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Lenovo"))
            {
                _cbQ44ALenovo.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Mito"))
            {
                _cbQ44AMito.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Nokia"))
            {
                _cbQ44ANokia.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Oppo"))
            {
                _cbQ44AOppo.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Samsung"))
            {
                _cbQ44ASamsung.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Sony"))
            {
                _cbQ44ASony.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Telkomsel"))
            {
                _cbQ44ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Tri"))
            {
                _cbQ44A3.setChecked(true);
            }
            if(extras.getString("NO_44").contains("XL"))
            {
                _cbQ44AXL.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Tidak Ada"))
            {
                _cbQ44ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_44").contains("Lainnya"))
            {
                _cbQ44ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_44").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ44ALainnya.setChecked(true);
                        _txtQ44A.setText(lastAnswer);
                    }
                }
            }
        }

        if(extras.getString("NO_45") != null)
        {
            if(extras.getString("NO_45").contains("Smartfren"))
            {
                _cbQ45ASmartfren.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Advan"))
            {
                _cbQ45AAdvan.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Asus"))
            {
                _cbQ45AAsus.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Blackberry"))
            {
                _cbQ45ABlackberry.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Evercoss"))
            {
                _cbQ45AEvercoss.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Indosat"))
            {
                _cbQ45AIndosat.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Lenovo"))
            {
                _cbQ45ALenovo.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Mito"))
            {
                _cbQ45AMito.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Nokia"))
            {
                _cbQ45ANokia.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Oppo"))
            {
                _cbQ45AOppo.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Samsung"))
            {
                _cbQ45ASamsung.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Sony"))
            {
                _cbQ45ASony.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Telkomsel"))
            {
                _cbQ45ATelkomsel.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Tri"))
            {
                _cbQ45A3.setChecked(true);
            }
            if(extras.getString("NO_45").contains("XL"))
            {
                _cbQ45AXL.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Tidak Ada"))
            {
                _cbQ45ATidakAda.setChecked(true);
            }
            if(extras.getString("NO_45").contains("Lainnya"))
            {
                _cbQ45ALainnya.setChecked(true);
            }

            String[] splitAnswer = extras.getString("NO_45").split(";");
            if(splitAnswer != null && splitAnswer.length > 0)
            {
                String lastAnswer = splitAnswer[splitAnswer.length - 1];
                if(lastAnswer != null && !lastAnswer.isEmpty())
                {
                    if(!lastAnswer.equals("Smartfren") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Advan") && !lastAnswer.equals("Blackberry") &&
                            !lastAnswer.equals("Evercoss / Cross") && !lastAnswer.equals("Indosat") && !lastAnswer.equals("Lenovo") && !lastAnswer.equals("Mito") &&
                            !lastAnswer.equals("Nokia / Microsoft") && !lastAnswer.equals("Oppo") && !lastAnswer.equals("Samsung") && !lastAnswer.equals("Sony") &&
                            !lastAnswer.equals("Telkomsel") && !lastAnswer.equals("Tri") && !lastAnswer.equals("XL")  && !lastAnswer.equals("Tidak Ada")
                            )
                    {
                        _cbQ45ALainnya.setChecked(true);
                        _txtQ45A.setText(lastAnswer);
                    }
                }
            }
        }

        ArrayAdapter<CharSequence> adapterQ46 = ArrayAdapter.createFromResource(this, R.array.page_blok4_poster_list, R.layout.spinner_item);
        adapterQ46.setDropDownViewResource(R.layout.spinner_item);
        _spQ46A.setAdapter(adapterQ46);

        if(extras.getString("NO_46") != null)
        {
            int position = SetSelectedSpinner(adapterQ46, extras.getString("NO_46"));
            if(position > 0) {
                _spQ46A.setSelection(position);
            }
            else
            {
                _txtQ46A.setText(extras.getString("NO_46"));
            }
        }

        ArrayAdapter<CharSequence> adapterQ47 = ArrayAdapter.createFromResource(this, R.array.page_blok4_dominasibranding_list, R.layout.spinner_item);
        adapterQ47.setDropDownViewResource(R.layout.spinner_item);
        _spQ47A.setAdapter(adapterQ47);

        if(extras.getString("NO_47") != null)
        {
            int position = SetSelectedSpinner(adapterQ47, extras.getString("NO_47"));
            if(position > 0) {
                _spQ47A.setSelection(position);
            }
        }

        _cbQ38ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ38A);
                }
                else
                {
                    Helper.Hide(_txtQ38A);
                    _txtQ38A.setText("");
                }
            }
        });

        _cbQ39ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ39A);
                }
                else
                {
                    Helper.Hide(_txtQ39A);
                    _txtQ39A.setText("");
                }
            }
        });

        _cbQ40ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ40A);
                }
                else
                {
                    Helper.Hide(_txtQ40A);
                    _txtQ40A.setText("");
                }
            }
        });

        _cbQ41ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ41A);
                }
                else
                {
                    Helper.Hide(_txtQ41A);
                    _txtQ41A.setText("");
                }
            }
        });

        _cbQ42ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ42A);
                }
                else
                {
                    Helper.Hide(_txtQ42A);
                    _txtQ42A.setText("");
                }
            }
        });

        _cbQ43ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ43A);
                }
                else
                {
                    Helper.Hide(_txtQ43A);
                    _txtQ43A.setText("");
                }
            }
        });

        _cbQ44ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ44A);
                }
                else
                {
                    Helper.Hide(_txtQ44A);
                    _txtQ44A.setText("");
                }
            }
        });

        _cbQ45ALainnya.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    Helper.Show(_txtQ45A);
                }
                else
                {
                    Helper.Hide(_txtQ45A);
                    _txtQ45A.setText("");
                }
            }
        });

        _cbQ38ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ38ASmartfren.setChecked(false);
                    _cbQ38AAdvan.setChecked(false);
                    _cbQ38AAsus.setChecked(false);
                    _cbQ38ABlackberry.setChecked(false);
                    _cbQ38AEvercoss.setChecked(false);
                    _cbQ38AIndosat.setChecked(false);
                    _cbQ38ALenovo.setChecked(false);
                    _cbQ38AMito.setChecked(false);
                    _cbQ38ANokia.setChecked(false);
                    _cbQ38AOppo.setChecked(false);
                    _cbQ38ASamsung.setChecked(false);
                    _cbQ38ASony.setChecked(false);
                    _cbQ38ATelkomsel.setChecked(false);
                    _cbQ38AXL.setChecked(false);
                    _cbQ38A3.setChecked(false);
                    _cbQ38ALainnya.setChecked(false);
                    _txtQ38A.setText("");
                }
            }
        });

        _cbQ39ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ39ASmartfren.setChecked(false);
                    _cbQ39AAdvan.setChecked(false);
                    _cbQ39AAsus.setChecked(false);
                    _cbQ39ABlackberry.setChecked(false);
                    _cbQ39AEvercoss.setChecked(false);
                    _cbQ39AIndosat.setChecked(false);
                    _cbQ39ALenovo.setChecked(false);
                    _cbQ39AMito.setChecked(false);
                    _cbQ39ANokia.setChecked(false);
                    _cbQ39AOppo.setChecked(false);
                    _cbQ39ASamsung.setChecked(false);
                    _cbQ39ASony.setChecked(false);
                    _cbQ39ATelkomsel.setChecked(false);
                    _cbQ39AXL.setChecked(false);
                    _cbQ39A3.setChecked(false);
                    _cbQ39ALainnya.setChecked(false);
                    _txtQ39A.setText("");
                }
            }
        });

        _cbQ40ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ40ASmartfren.setChecked(false);
                    _cbQ40AAdvan.setChecked(false);
                    _cbQ40AAsus.setChecked(false);
                    _cbQ40ABlackberry.setChecked(false);
                    _cbQ40AEvercoss.setChecked(false);
                    _cbQ40AIndosat.setChecked(false);
                    _cbQ40ALenovo.setChecked(false);
                    _cbQ40AMito.setChecked(false);
                    _cbQ40ANokia.setChecked(false);
                    _cbQ40AOppo.setChecked(false);
                    _cbQ40ASamsung.setChecked(false);
                    _cbQ40ASony.setChecked(false);
                    _cbQ40ATelkomsel.setChecked(false);
                    _cbQ40AXL.setChecked(false);
                    _cbQ40A3.setChecked(false);
                    _cbQ40ALainnya.setChecked(false);
                    _txtQ40A.setText("");
                }
            }
        });

        _cbQ41ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ41ASmartfren.setChecked(false);
                    _cbQ41AAdvan.setChecked(false);
                    _cbQ41AAsus.setChecked(false);
                    _cbQ41ABlackberry.setChecked(false);
                    _cbQ41AEvercoss.setChecked(false);
                    _cbQ41AIndosat.setChecked(false);
                    _cbQ41ALenovo.setChecked(false);
                    _cbQ41AMito.setChecked(false);
                    _cbQ41ANokia.setChecked(false);
                    _cbQ41AOppo.setChecked(false);
                    _cbQ41ASamsung.setChecked(false);
                    _cbQ41ASony.setChecked(false);
                    _cbQ41ATelkomsel.setChecked(false);
                    _cbQ41AXL.setChecked(false);
                    _cbQ41A3.setChecked(false);
                    _cbQ41ALainnya.setChecked(false);
                    _txtQ41A.setText("");
                }
            }
        });

        _cbQ42ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ42ASmartfren.setChecked(false);
                    _cbQ42AAdvan.setChecked(false);
                    _cbQ42AAsus.setChecked(false);
                    _cbQ42ABlackberry.setChecked(false);
                    _cbQ42AEvercoss.setChecked(false);
                    _cbQ42AIndosat.setChecked(false);
                    _cbQ42ALenovo.setChecked(false);
                    _cbQ42AMito.setChecked(false);
                    _cbQ42ANokia.setChecked(false);
                    _cbQ42AOppo.setChecked(false);
                    _cbQ42ASamsung.setChecked(false);
                    _cbQ42ASony.setChecked(false);
                    _cbQ42ATelkomsel.setChecked(false);
                    _cbQ42AXL.setChecked(false);
                    _cbQ42A3.setChecked(false);
                    _cbQ42ALainnya.setChecked(false);
                    _txtQ42A.setText("");
                }
            }
        });

        _cbQ43ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ43ASmartfren.setChecked(false);
                    _cbQ43AAdvan.setChecked(false);
                    _cbQ43AAsus.setChecked(false);
                    _cbQ43ABlackberry.setChecked(false);
                    _cbQ43AEvercoss.setChecked(false);
                    _cbQ43AIndosat.setChecked(false);
                    _cbQ43ALenovo.setChecked(false);
                    _cbQ43AMito.setChecked(false);
                    _cbQ43ANokia.setChecked(false);
                    _cbQ43AOppo.setChecked(false);
                    _cbQ43ASamsung.setChecked(false);
                    _cbQ43ASony.setChecked(false);
                    _cbQ43ATelkomsel.setChecked(false);
                    _cbQ43AXL.setChecked(false);
                    _cbQ43A3.setChecked(false);
                    _cbQ43ALainnya.setChecked(false);
                    _txtQ43A.setText("");
                }
            }
        });

        _cbQ44ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ44ASmartfren.setChecked(false);
                    _cbQ44AAdvan.setChecked(false);
                    _cbQ44AAsus.setChecked(false);
                    _cbQ44ABlackberry.setChecked(false);
                    _cbQ44AEvercoss.setChecked(false);
                    _cbQ44AIndosat.setChecked(false);
                    _cbQ44ALenovo.setChecked(false);
                    _cbQ44AMito.setChecked(false);
                    _cbQ44ANokia.setChecked(false);
                    _cbQ44AOppo.setChecked(false);
                    _cbQ44ASamsung.setChecked(false);
                    _cbQ44ASony.setChecked(false);
                    _cbQ44ATelkomsel.setChecked(false);
                    _cbQ44AXL.setChecked(false);
                    _cbQ44A3.setChecked(false);
                    _cbQ44ALainnya.setChecked(false);
                    _txtQ44A.setText("");
                }
            }
        });

        _cbQ45ATidakAda.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
            {
                if (isChecked)
                {
                    _cbQ45ASmartfren.setChecked(false);
                    _cbQ45AAdvan.setChecked(false);
                    _cbQ45AAsus.setChecked(false);
                    _cbQ45ABlackberry.setChecked(false);
                    _cbQ45AEvercoss.setChecked(false);
                    _cbQ45AIndosat.setChecked(false);
                    _cbQ45ALenovo.setChecked(false);
                    _cbQ45AMito.setChecked(false);
                    _cbQ45ANokia.setChecked(false);
                    _cbQ45AOppo.setChecked(false);
                    _cbQ45ASamsung.setChecked(false);
                    _cbQ45ASony.setChecked(false);
                    _cbQ45ATelkomsel.setChecked(false);
                    _cbQ45AXL.setChecked(false);
                    _cbQ45A3.setChecked(false);
                    _cbQ45ALainnya.setChecked(false);
                    _txtQ45A.setText("");
                }
            }
        });

        _spQ46A.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                String selectedItem = parentView.getItemAtPosition(position).toString();
                if(selectedItem.equals("Lainnya"))
                {
                    Helper.Show(_txtQ46A);
                }
                else
                {
                    Helper.Hide(_txtQ46A);
                    _txtQ46A.setText("");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // your code here
            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                String surveyType = extras.getString("TipeSurvey");
                String storeType = extras.getString("NO_1");

                if(surveyType.equals("Full Audit Smartphone"))
                {
                    if(storeType.equals("EXCLUSIVE SMARTFREN"))
                    {
                        Intent intent = new Intent(Blok4Activity.this, Block1Activity.class);

                        intent.putExtra("DeviceSurveyID",extras.getString("DeviceSurveyID"));
                        intent.putExtra("TipeSurvey", extras.getString("TipeSurvey"));
                        intent.putExtra("UserID", extras.getString("UserID"));
                        intent.putExtra("AccessToken", extras.getString("AccessToken"));
                        intent.putExtra("NO_1", extras.getString("NO_1"));
                        intent.putExtra("NO_2", extras.getString("NO_2"));

                        startActivity(intent);
                    }
                    else
                    {
                        if(extras.getString("NO_7") != null && !extras.getString("NO_7").isEmpty() && !extras.getString("NO_7").equals("null"))
                        {
                            Intent intent = new Intent(Blok4Activity.this, Blok3AActivity.class);
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
                            startActivity(intent);
                        }
                        else if(extras.getString("NO_17") != null && !extras.getString("NO_17").isEmpty() && !extras.getString("NO_17").equals("null"))
                        {
                            Intent intent = new Intent(Blok4Activity.this, Blok3BActivity.class);
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
                            startActivity(intent);
                        }
                        else if(extras.getString("NO_27") != null && !extras.getString("NO_27").isEmpty() && !extras.getString("NO_27").equals("null"))
                        {
                            Intent intent = new Intent(Blok4Activity.this, Blok3CActivity.class);
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
                            startActivity(intent);
                        }
                    }
                }
                else if(surveyType.equals("Full Audit Modem"))
                {
                    Intent intent = new Intent(Blok4Activity.this, Blok3CActivity.class);
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
                    startActivity(intent);
                }

            }

            @Override
            public void onContinueClicked() {
                String A38 = "";
                A38 = GetCheckBoxValue(_cbQ38ASmartfren, A38);
                A38 = GetCheckBoxValue(_cbQ38AAdvan, A38);
                A38 = GetCheckBoxValue(_cbQ38AAsus, A38);
                A38 = GetCheckBoxValue(_cbQ38ABlackberry, A38);
                A38 = GetCheckBoxValue(_cbQ38AEvercoss, A38);
                A38 = GetCheckBoxValue(_cbQ38AIndosat, A38);
                A38 = GetCheckBoxValue(_cbQ38ALenovo, A38);
                A38 = GetCheckBoxValue(_cbQ38AMito, A38);
                A38 = GetCheckBoxValue(_cbQ38ANokia, A38);
                A38 = GetCheckBoxValue(_cbQ38AOppo, A38);
                A38 = GetCheckBoxValue(_cbQ38ASamsung, A38);
                A38 = GetCheckBoxValue(_cbQ38ASony, A38);
                A38 = GetCheckBoxValue(_cbQ38ATelkomsel, A38);
                A38 = GetCheckBoxValue(_cbQ38A3, A38);
                A38 = GetCheckBoxValue(_cbQ38AXL, A38);

                if(_cbQ38ALainnya.isChecked())
                {
                    A38 = A38 + ";" + _txtQ38A.getText().toString();
                }
                if(_cbQ38ATidakAda.isChecked())
                {
                    A38 = "";
                }

                String A39 = "";
                A39 = GetCheckBoxValue(_cbQ39ASmartfren, A39);
                A39 = GetCheckBoxValue(_cbQ39AAdvan, A39);
                A39 = GetCheckBoxValue(_cbQ39AAsus, A39);
                A39 = GetCheckBoxValue(_cbQ39ABlackberry, A39);
                A39 = GetCheckBoxValue(_cbQ39AEvercoss, A39);
                A39 = GetCheckBoxValue(_cbQ39AIndosat, A39);
                A39 = GetCheckBoxValue(_cbQ39ALenovo, A39);
                A39 = GetCheckBoxValue(_cbQ39AMito, A39);
                A39 = GetCheckBoxValue(_cbQ39ANokia, A39);
                A39 = GetCheckBoxValue(_cbQ39AOppo, A39);
                A39 = GetCheckBoxValue(_cbQ39ASamsung, A39);
                A39 = GetCheckBoxValue(_cbQ39ASony, A39);
                A39 = GetCheckBoxValue(_cbQ39ATelkomsel, A39);
                A39 = GetCheckBoxValue(_cbQ39A3, A39);
                A39 = GetCheckBoxValue(_cbQ39AXL, A39);

                if(_cbQ39ALainnya.isChecked())
                {
                    A39 = A39 + ";" + _txtQ39A.getText().toString();
                }
                if(_cbQ39ATidakAda.isChecked())
                {
                    A39 = "";
                }

                String A40 = "";
                A40 = GetCheckBoxValue(_cbQ40ASmartfren, A40);
                A40 = GetCheckBoxValue(_cbQ40AAdvan, A40);
                A40 = GetCheckBoxValue(_cbQ40AAsus, A40);
                A40 = GetCheckBoxValue(_cbQ40ABlackberry, A40);
                A40 = GetCheckBoxValue(_cbQ40AEvercoss, A40);
                A40 = GetCheckBoxValue(_cbQ40AIndosat, A40);
                A40 = GetCheckBoxValue(_cbQ40ALenovo, A40);
                A40 = GetCheckBoxValue(_cbQ40AMito, A40);
                A40 = GetCheckBoxValue(_cbQ40ANokia, A40);
                A40 = GetCheckBoxValue(_cbQ40AOppo, A40);
                A40 = GetCheckBoxValue(_cbQ40ASamsung, A40);
                A40 = GetCheckBoxValue(_cbQ40ASony, A40);
                A40 = GetCheckBoxValue(_cbQ40ATelkomsel, A40);
                A40 = GetCheckBoxValue(_cbQ40A3, A40);
                A40 = GetCheckBoxValue(_cbQ40AXL, A40);

                if(_cbQ40ALainnya.isChecked())
                {
                    A40 = A40 + ";" + _txtQ40A.getText().toString();
                }
                if(_cbQ40ATidakAda.isChecked())
                {
                    A40 = "";
                }

                String A41 = "";
                A41 = GetCheckBoxValue(_cbQ41ASmartfren, A41);
                A41 = GetCheckBoxValue(_cbQ41AAdvan, A41);
                A41 = GetCheckBoxValue(_cbQ41AAsus, A41);
                A41 = GetCheckBoxValue(_cbQ41ABlackberry, A41);
                A41 = GetCheckBoxValue(_cbQ41AEvercoss, A41);
                A41 = GetCheckBoxValue(_cbQ41AIndosat, A41);
                A41 = GetCheckBoxValue(_cbQ41ALenovo, A41);
                A41 = GetCheckBoxValue(_cbQ41AMito, A41);
                A41 = GetCheckBoxValue(_cbQ41ANokia, A41);
                A41 = GetCheckBoxValue(_cbQ41AOppo, A41);
                A41 = GetCheckBoxValue(_cbQ41ASamsung, A41);
                A41 = GetCheckBoxValue(_cbQ41ASony, A41);
                A41 = GetCheckBoxValue(_cbQ41ATelkomsel, A41);
                A41 = GetCheckBoxValue(_cbQ41A3, A41);
                A41 = GetCheckBoxValue(_cbQ41AXL, A41);

                if(_cbQ41ALainnya.isChecked())
                {
                    A41 = A41 + ";" + _txtQ41A.getText().toString();
                }
                if(_cbQ41ATidakAda.isChecked())
                {
                    A41 = "";
                }

                String A42 = "";
                A42 = GetCheckBoxValue(_cbQ42ASmartfren, A42);
                A42 = GetCheckBoxValue(_cbQ42AAdvan, A42);
                A42 = GetCheckBoxValue(_cbQ42AAsus, A42);
                A42 = GetCheckBoxValue(_cbQ42ABlackberry, A42);
                A42 = GetCheckBoxValue(_cbQ42AEvercoss, A42);
                A42 = GetCheckBoxValue(_cbQ42AIndosat, A42);
                A42 = GetCheckBoxValue(_cbQ42ALenovo, A42);
                A42 = GetCheckBoxValue(_cbQ42AMito, A42);
                A42 = GetCheckBoxValue(_cbQ42ANokia, A42);
                A42 = GetCheckBoxValue(_cbQ42AOppo, A42);
                A42 = GetCheckBoxValue(_cbQ42ASamsung, A42);
                A42 = GetCheckBoxValue(_cbQ42ASony, A42);
                A42 = GetCheckBoxValue(_cbQ42ATelkomsel, A42);
                A42 = GetCheckBoxValue(_cbQ42A3, A42);
                A42 = GetCheckBoxValue(_cbQ42AXL, A42);

                if(_cbQ42ALainnya.isChecked())
                {
                    A42 = A42 + ";" + _txtQ42A.getText().toString();
                }
                if(_cbQ42ATidakAda.isChecked())
                {
                    A42 = "";
                }

                String A43 = "";
                A43 = GetCheckBoxValue(_cbQ43ASmartfren, A43);
                A43 = GetCheckBoxValue(_cbQ43AAdvan, A43);
                A43 = GetCheckBoxValue(_cbQ43AAsus, A43);
                A43 = GetCheckBoxValue(_cbQ43ABlackberry, A43);
                A43 = GetCheckBoxValue(_cbQ43AEvercoss, A43);
                A43 = GetCheckBoxValue(_cbQ43AIndosat, A43);
                A43 = GetCheckBoxValue(_cbQ43ALenovo, A43);
                A43 = GetCheckBoxValue(_cbQ43AMito, A43);
                A43 = GetCheckBoxValue(_cbQ43ANokia, A43);
                A43 = GetCheckBoxValue(_cbQ43AOppo, A43);
                A43 = GetCheckBoxValue(_cbQ43ASamsung, A43);
                A43 = GetCheckBoxValue(_cbQ43ASony, A43);
                A43 = GetCheckBoxValue(_cbQ43ATelkomsel, A43);
                A43 = GetCheckBoxValue(_cbQ43A3, A43);
                A43 = GetCheckBoxValue(_cbQ43AXL, A43);

                if(_cbQ43ALainnya.isChecked())
                {
                    A43 = A43 + ";" + _txtQ43A.getText().toString();
                }
                if(_cbQ43ATidakAda.isChecked())
                {
                    A43 = "";
                }

                String A44 = "";
                A44 = GetCheckBoxValue(_cbQ44ASmartfren, A44);
                A44 = GetCheckBoxValue(_cbQ44AAdvan, A44);
                A44 = GetCheckBoxValue(_cbQ44AAsus, A44);
                A44 = GetCheckBoxValue(_cbQ44ABlackberry, A44);
                A44 = GetCheckBoxValue(_cbQ44AEvercoss, A44);
                A44 = GetCheckBoxValue(_cbQ44AIndosat, A44);
                A44 = GetCheckBoxValue(_cbQ44ALenovo, A44);
                A44 = GetCheckBoxValue(_cbQ44AMito, A44);
                A44 = GetCheckBoxValue(_cbQ44ANokia, A44);
                A44 = GetCheckBoxValue(_cbQ44AOppo, A44);
                A44 = GetCheckBoxValue(_cbQ44ASamsung, A44);
                A44 = GetCheckBoxValue(_cbQ44ASony, A44);
                A44 = GetCheckBoxValue(_cbQ44ATelkomsel, A44);
                A44 = GetCheckBoxValue(_cbQ44A3, A44);
                A44 = GetCheckBoxValue(_cbQ44AXL, A44);

                if(_cbQ44ALainnya.isChecked())
                {
                    A44 = A44 + ";" + _txtQ44A.getText().toString();
                }
                if(_cbQ44ATidakAda.isChecked())
                {
                    A44 = "";
                }

                String A45 = "";
                A45 = GetCheckBoxValue(_cbQ45ASmartfren, A45);
                A45 = GetCheckBoxValue(_cbQ45AAdvan, A45);
                A45 = GetCheckBoxValue(_cbQ45AAsus, A45);
                A45 = GetCheckBoxValue(_cbQ45ABlackberry, A45);
                A45 = GetCheckBoxValue(_cbQ45AEvercoss, A45);
                A45 = GetCheckBoxValue(_cbQ45AIndosat, A45);
                A45 = GetCheckBoxValue(_cbQ45ALenovo, A45);
                A45 = GetCheckBoxValue(_cbQ45AMito, A45);
                A45 = GetCheckBoxValue(_cbQ45ANokia, A45);
                A45 = GetCheckBoxValue(_cbQ45AOppo, A45);
                A45 = GetCheckBoxValue(_cbQ45ASamsung, A45);
                A45 = GetCheckBoxValue(_cbQ45ASony, A45);
                A45 = GetCheckBoxValue(_cbQ45ATelkomsel, A45);
                A45 = GetCheckBoxValue(_cbQ45A3, A45);
                A45 = GetCheckBoxValue(_cbQ45AXL, A45);

                if(_cbQ45ALainnya.isChecked())
                {
                    A45 = A45 + ";" + _txtQ45A.getText().toString();
                }
                if(_cbQ45ATidakAda.isChecked())
                {
                    A45 = "";
                }

                String A46 = "";
                if(String.valueOf(_spQ46A.getSelectedItem()).equals("Lainnya"))
                {
                    A46 = _txtQ46A.getText().toString();
                }
                else
                {
                    A46 = String.valueOf(_spQ46A.getSelectedItem());
                }

                String A47 = String.valueOf(_spQ47A.getSelectedItem());

                int validatedAnswer = 0;

                if(!_cbQ38ATidakAda.isChecked() && (A38 == null || A38.equals("") || A38.isEmpty()))
                {
                    _errorQ38A.setError("error");
                    _errorQ38A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ38ALainnya.isChecked() && A38 != null && !A38.equals("") && !A38.isEmpty() && (_txtQ38A.getText() == null || _txtQ38A.getText().toString().equals("")) )
                {
                    _errorQ38A.setError("error");
                    _errorQ38A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ38ALainnya.isChecked() && A38 != null && !A38.equals("") && !A38.isEmpty() && _txtQ38A.getText().toString().length() > 50)
                {
                    _errorQ38A.setError("error");
                    _errorQ38A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ38A.setError(null);
                    _errorQ38A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ39ATidakAda.isChecked() && (A39 == null || A39.equals("") || A39.isEmpty()))
                {
                    _errorQ39A.setError("error");
                    _errorQ39A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ39ALainnya.isChecked() && A39 != null && !A39.equals("") && !A39.isEmpty() && (_txtQ39A.getText() == null || _txtQ39A.getText().toString().equals("")) )
                {
                    _errorQ39A.setError("error");
                    _errorQ39A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ39ALainnya.isChecked() && A39 != null && !A39.equals("") && !A39.isEmpty() && _txtQ39A.getText().toString().length() > 50)
                {
                    _errorQ39A.setError("error");
                    _errorQ39A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ39A.setError(null);
                    _errorQ39A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ40ATidakAda.isChecked() && (A40 == null || A40.equals("") || A40.isEmpty()))
                {
                    _errorQ40A.setError("error");
                    _errorQ40A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ40ALainnya.isChecked() && A40 != null && !A40.equals("") && !A40.isEmpty() && (_txtQ40A.getText() == null || _txtQ40A.getText().toString().equals("")) )
                {
                    _errorQ40A.setError("error");
                    _errorQ40A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ40ALainnya.isChecked() && A40 != null && !A40.equals("") && !A40.isEmpty() && _txtQ40A.getText().toString().length() > 50)
                {
                    _errorQ40A.setError("error");
                    _errorQ40A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ40A.setError(null);
                    _errorQ40A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ41ATidakAda.isChecked() && (A41 == null || A41.equals("") || A41.isEmpty()))
                {
                    _errorQ41A.setError("error");
                    _errorQ41A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ41ALainnya.isChecked() && A41 != null && !A41.equals("") && !A41.isEmpty() && (_txtQ41A.getText() == null || _txtQ41A.getText().toString().equals("")) )
                {
                    _errorQ41A.setError("error");
                    _errorQ41A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ41ALainnya.isChecked() && A41 != null && !A41.equals("") && !A41.isEmpty() && _txtQ41A.getText().toString().length() > 50)
                {
                    _errorQ41A.setError("error");
                    _errorQ41A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ41A.setError(null);
                    _errorQ41A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ42ATidakAda.isChecked() && (A42 == null || A42.equals("") || A42.isEmpty()))
                {
                    _errorQ42A.setError("error");
                    _errorQ42A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ42ALainnya.isChecked() && A42 != null && !A42.equals("") && !A42.isEmpty() && (_txtQ42A.getText() == null || _txtQ42A.getText().toString().equals("")) )
                {
                    _errorQ42A.setError("error");
                    _errorQ42A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ42ALainnya.isChecked() && A42 != null && !A42.equals("") && !A42.isEmpty() && _txtQ42A.getText().toString().length() > 50)
                {
                    _errorQ42A.setError("error");
                    _errorQ42A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ42A.setError(null);
                    _errorQ42A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ43ATidakAda.isChecked() && (A43 == null || A43.equals("") || A43.isEmpty()))
                {
                    _errorQ43A.setError("error");
                    _errorQ43A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ43ALainnya.isChecked() && A43 != null && !A43.equals("") && !A43.isEmpty() && (_txtQ43A.getText() == null || _txtQ43A.getText().toString().equals("")) )
                {
                    _errorQ43A.setError("error");
                    _errorQ43A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ43ALainnya.isChecked() && A43 != null && !A43.equals("") && !A43.isEmpty() && _txtQ43A.getText().toString().length() > 50)
                {
                    _errorQ43A.setError("error");
                    _errorQ43A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ43A.setError(null);
                    _errorQ43A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ44ATidakAda.isChecked() && (A44 == null || A44.equals("") || A44.isEmpty()))
                {
                    _errorQ44A.setError("error");
                    _errorQ44A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ44ALainnya.isChecked() && A44 != null && !A44.equals("") && !A44.isEmpty() && (_txtQ44A.getText() == null || _txtQ44A.getText().toString().equals("")) )
                {
                    _errorQ44A.setError("error");
                    _errorQ44A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ44ALainnya.isChecked() && A44 != null && !A44.equals("") && !A44.isEmpty() && _txtQ44A.getText().toString().length() > 50)
                {
                    _errorQ44A.setError("error");
                    _errorQ44A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ44A.setError(null);
                    _errorQ44A.setText("");
                    validatedAnswer++;
                }

                if(!_cbQ45ATidakAda.isChecked() && (A45 == null || A45.equals("") || A45.isEmpty()))
                {
                    _errorQ45A.setError("error");
                    _errorQ45A.setText("pilih salah satu checkbox");
                }
                else if(_cbQ45ALainnya.isChecked() && A45 != null && !A45.equals("") && !A45.isEmpty() && (_txtQ45A.getText() == null || _txtQ45A.getText().toString().equals("")) )
                {
                    _errorQ45A.setError("error");
                    _errorQ45A.setText("checkbox lainnya tercentang, textbox harus terisi");
                }
                else if(_cbQ45ALainnya.isChecked() && A45 != null && !A45.equals("") && !A45.isEmpty() && _txtQ45A.getText().toString().length() > 50)
                {
                    _errorQ45A.setError("error");
                    _errorQ45A.setText("checkbox lainnya tercentang, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ45A.setError(null);
                    _errorQ45A.setText("");
                    validatedAnswer++;
                }

                if(_spQ46A.getSelectedItem().toString().equals("Lainnya") && (_txtQ46A.getText() == null || _txtQ46A.getText().toString().equals("")) )
                {
                    _errorQ46A.setError("error");
                    _errorQ46A.setText("combobox lainnya terpilih, textbox harus terisi");
                }
                else if(_spQ46A.getSelectedItem().toString().equals("Lainnya") && _txtQ46A.getText().toString().length() > 50)
                {
                    _errorQ46A.setError("error");
                    _errorQ46A.setText("combobox lainnya terpilih, textbox harus terisi tidak boleh lebih dari 50 karakter");
                }
                else
                {
                    _errorQ46A.setError(null);
                    _errorQ46A.setText("");
                    validatedAnswer++;
                }

                if(A47.equals("--Pilih Jawaban--") || A47 == null || A47.equals("") || A47.isEmpty())
                {
                    _errorQ47A.setError("error");
                    _errorQ47A.setText("Pilih salah satu jawaban");
                }
                else
                {
                    _errorQ47A.setError(null);
                    _errorQ47A.setText("");
                    validatedAnswer++;
                }

                if(validatedAnswer == 10)
                {
                    String surveyType = extras.getString("TipeSurvey");

                    if(surveyType.equals("Full Audit Modem"))
                    {
                        Intent intent = new Intent(Blok4Activity.this, Blok5BActivity.class);
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
                        intent.putExtra("NO_38", A38);
                        intent.putExtra("NO_39", A39);
                        intent.putExtra("NO_40", A40);
                        intent.putExtra("NO_41", A41);
                        intent.putExtra("NO_42", A42);
                        intent.putExtra("NO_43", A43);
                        intent.putExtra("NO_44", A44);
                        intent.putExtra("NO_45", A45);
                        intent.putExtra("NO_46", A46);
                        intent.putExtra("NO_47", A47);
                        intent.putExtra("NO_48", "");
                        intent.putExtra("NO_49", "");
                        intent.putExtra("NO_50", "");
                        intent.putExtra("NO_51", "");
                        intent.putExtra("NO_52", "");
                        intent.putExtra("NO_52B", "");
                        intent.putExtra("NO_52C", "");
                        intent.putExtra("NO_52D", "");
                        intent.putExtra("NO_52E", "");
                        intent.putExtra("NO_53", "");
                        intent.putExtra("NO_54", "");
                        intent.putExtra("NO_55", "");
                        intent.putExtra("NO_56", "");
                        startActivity(intent);
                    }
                    else
                    {
                        Intent intent = new Intent(Blok4Activity.this, Blok5AActivity.class);
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
                        intent.putExtra("NO_38", A38);
                        intent.putExtra("NO_39", A39);
                        intent.putExtra("NO_40", A40);
                        intent.putExtra("NO_41", A41);
                        intent.putExtra("NO_42", A42);
                        intent.putExtra("NO_43", A43);
                        intent.putExtra("NO_44", A44);
                        intent.putExtra("NO_45", A45);
                        intent.putExtra("NO_46", A46);
                        intent.putExtra("NO_47", A47);
                        startActivity(intent);
                    }

                }


            }
        });
    }
}
