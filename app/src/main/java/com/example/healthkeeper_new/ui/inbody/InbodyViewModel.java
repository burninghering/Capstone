package com.example.healthkeeper_new.ui.inbody;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InbodyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InbodyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is inbody fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}