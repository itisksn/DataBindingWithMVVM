package com.databinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databinding.BR;
import com.databinding.modelclass.StudentModel;

public class LoginViewModel extends BaseObservable {


    public LoginViewModel(StudentModel studentModel) {

        this.name = studentModel.name;
        this.address = studentModel.address;
    }

    public String name;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);

    }

    public String address;


}
