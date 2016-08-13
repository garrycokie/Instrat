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

public class Block11Activity extends AppCompatActivity {

    private ImageView _pic1;
    private ImageView _pic2;
    private ImageView _pic3;
    private ImageView _pic4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_block11);

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
