package com.fastburngames.simplemvvmapp.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.fastburngames.simplemvvmapp.dataModel.Text;

import java.util.List;

// Class to store and manage UI data.
public class TextViewModel extends ViewModel {

    private MutableLiveData<Text> text = new MutableLiveData<>();

    public void setAppText(Text text) {
        this.text.setValue(text);
    }

    public LiveData<Text> getAppText() {
        return text;
    }
}
