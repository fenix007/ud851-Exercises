package com.example.android.todolist;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

import com.example.android.todolist.database.AppDatabase;

public class AddTaskViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private final AppDatabase mDb;
    private final Integer mTaskId;

    public AddTaskViewModelFactory(AppDatabase mDb, Integer taskId) {
        this.mDb = mDb;
        this.mTaskId = taskId;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        return (T) new AddTaskViewModel(mDb, mTaskId);
    }
}
