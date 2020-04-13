package com.ashandilya.kakichai.ui.refreshment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RefreshmentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RefreshmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}