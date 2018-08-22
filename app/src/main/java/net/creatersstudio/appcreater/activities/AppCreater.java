package net.creatersstudio.appcreater.activities;

import android.app.Application;
import android.os.Environment;

import net.creatersstudio.appcreater.R;

import java.io.File;

public class AppCreater extends Application{
    private final String PROJECTS_FOLDER = getString(R.string.projects_folder_name); // Storage projects Folder Name
    private final String APP_EXT_FOLDER = getString(R.string.app_ext_folder_name); // Storage projects lib or other folder Name

    /**
     * get app externalu storage directory Used to store all project folders| 获取本app在外部存储工程的文件夹
     * @return File folder file object
     */
    public File getProjectsFolder(){
        return new File(Environment.getExternalStorageDirectory() + File.separator + PROJECTS_FOLDER);
    }

    /**
     * get app externalu storage directory Used to store this app files| 获取本app在外部存储文件的文件夹
     * @return File folder file object
     */
    public File getAppExtFolder(){
        return new File(Environment.getExternalStorageDirectory() + File.separator + APP_EXT_FOLDER);
    }
}
