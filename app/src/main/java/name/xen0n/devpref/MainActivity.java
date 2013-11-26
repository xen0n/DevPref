package name.xen0n.devpref;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		startActivity(new Intent(
				android.provider.Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS));
		finish();
	}
}
