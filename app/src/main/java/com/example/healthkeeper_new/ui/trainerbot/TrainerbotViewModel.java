package com.example.healthkeeper_new.ui.trainerbot;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TrainerbotViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TrainerbotViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is trainerbot fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}