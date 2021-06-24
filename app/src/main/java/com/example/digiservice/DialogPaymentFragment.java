package com.example.digiservice;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;

import androidx.fragment.app.DialogFragment;

import afu.org.checkerframework.checker.nullness.qual.NonNull;

public class DialogPaymentFragment extends DialogFragment {

    public CallbackResult callbackResult;

    public void setOnCallbackResult(final CallbackResult callbackResult) {
        this.callbackResult = callbackResult;
    }

    private int request_code = 0;
    private View root_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root_view = inflater.inflate(R.layout.dialog_payment, container, false);
        ((ImageButton) root_view.findViewById(R.id.bt_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        (root_view.findViewById(R.id.lyt_add_card)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosignupteknisi = new Intent(getContext(),SignUpTeknisiActivity.class);
                startActivity(gotosignupteknisi);
            }
        });
        (root_view.findViewById(R.id.lyt_request)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotosignup = new Intent(getContext(),SignUpActivity.class);
                startActivity(gotosignup);
            }
        });
        return root_view;
    }

    private void onPaymentClick() {
        if (callbackResult != null) {
            callbackResult.sendResult(request_code);
        }
        dismiss();
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        return dialog;
    }

    public void setRequestCode(int request_code) {
        this.request_code = request_code;
    }

    public interface CallbackResult {
        void sendResult(int requestCode);
    }

}