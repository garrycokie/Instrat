package com.smartfren.instrat.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.ImageView;

import com.smartfren.instrat.R;
import com.smartfren.instrat.utilities.ImageViewHelper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Block11Activity extends BaseStepsActivity {

    private ImageView _pic1;
    private ImageView _pic2;
    private ImageView _pic3;
    private ImageView _pic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.initActivity(R.layout.activity_block11);

        _pic1 = (ImageView) findViewById(R.id.pic_1);
        _pic2 = (ImageView) findViewById(R.id.pic_2);
        _pic3 = (ImageView) findViewById(R.id.pic_3);
        _pic4 = (ImageView) findViewById(R.id.pic_4);

        _pic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent(R.id.pic_1);
            }
        });
        _pic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent(R.id.pic_2);
            }
        });
        _pic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent(R.id.pic_3);
            }
        });
        _pic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dispatchTakePictureIntent(R.id.pic_4);
            }
        });

        super.setStepEventListener(new OnStepEventListener() {
            @Override
            public void onBackClicked() {
                // TODO: back;
            }

            @Override
            public void onContinueClicked() {
                // TODO: continue;

                Intent intent = new Intent(Block11Activity.this, Block12Activity.class);
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
                //intent.putExtra("NO_130", _pic1);
                //intent.putExtra("NO_131", _pic2);
                //intent.putExtra("NO_132", _pic3);
                //intent.putExtra("NO_133", _pic4);

            }
        });
    }

    static final int REQUEST_IMAGE_CAPTURE_1 = 1;
    static final int REQUEST_IMAGE_CAPTURE_2 = 2;
    static final int REQUEST_IMAGE_CAPTURE_3 = 3;
    static final int REQUEST_IMAGE_CAPTURE_4 = 4;

    String _filePath;

    private void dispatchTakePictureIntent(int picId) {
        _filePath = "";
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        _filePath = ImageViewHelper.getFilename();
        takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(new File(_filePath)));
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            switch (picId) {
                case R.id.pic_1:
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE_1);
                    break;
                case R.id.pic_2:
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE_2);
                    break;
                case R.id.pic_3:
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE_3);
                    break;
                case R.id.pic_4:
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE_4);
                    break;
            }
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String compressedImage = "";
        if (resultCode == RESULT_OK) {
            compressedImage = ImageViewHelper.compressImage(getApplicationContext(), _filePath);
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE_1 && resultCode == RESULT_OK) {
            _pic1.setImageDrawable(Drawable.createFromPath(compressedImage));
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE_2 && resultCode == RESULT_OK) {
            _pic2.setImageDrawable(Drawable.createFromPath(compressedImage));
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE_3 && resultCode == RESULT_OK) {
            _pic3.setImageDrawable(Drawable.createFromPath(compressedImage));
        }
        if (requestCode == REQUEST_IMAGE_CAPTURE_4 && resultCode == RESULT_OK) {
            _pic4.setImageDrawable(Drawable.createFromPath(compressedImage));
        }
    }
}
