package net.creatersstudio.appcreater.activities;
import android.os.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import net.creatersstudio.appcreater.*;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setSupportActionBar((Toolbar)findViewById(R.id.toolbar_normal));
	}
	
}
