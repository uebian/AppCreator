package net.creatersstudio.appcreater.activities;

import android.app.Application;
import android.os.Environment;

import net.creatersstudio.appcreater.R;

import java.io.File;

public class AppCreater extends Application{

    //获取本应用在外部存储Project的文件夹对象
    public File getProjectsFolder(){
        return new File(Environment.getExternalStorageDirectory() + File.separator + getString(R.string.ext_projects_folder_name));
    }

    //获取本应用在外部存储其他文件的文件夹对象
    public File getAppExtFolder(){
        return new File(Environment.getExternalStorageDirectory() + File.separator + getString(R.string.ext_app_folder_name));
    }
}
