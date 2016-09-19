package com.smartfren.instrat.utilities;

import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by Garry Cokie on 9/19/2016.
 */
public final class Helper {

    public static void Hide(EditText editText) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,0);
        editText.setLayoutParams(params);
        editText.setVisibility(View.GONE);
    }

    public static void Show(EditText editText) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,20);
        editText.setLayoutParams(params);
        editText.setVisibility(View.VISIBLE);
    }

    public static void Hide(TextView label) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,0);
        label.setLayoutParams(params);
        label.setVisibility(View.GONE);
    }

    public static void Show(TextView label) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,20);
        label.setLayoutParams(params);
        label.setVisibility(View.VISIBLE);
    }

    public static void Hide(Spinner apinner) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,0);
        apinner.setLayoutParams(params);
        apinner.setVisibility(View.GONE);
    }

    public static void Show(Spinner apinner) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,20);
        apinner.setLayoutParams(params);
        apinner.setVisibility(View.VISIBLE);
    }

    public static void Hide(CheckBox checkBox) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,0);
        checkBox.setLayoutParams(params);
        checkBox.setVisibility(View.GONE);
    }

    public static void Show(CheckBox checkBox) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.setMargins(0,0,0,20);
        checkBox.setLayoutParams(params);
        checkBox.setVisibility(View.VISIBLE);
    }
}
