package pk.edu.iba.asynctask_class;


import pk.edu.iba.asynctask1.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

    private ImageView mImageView;
	private ProgressBar mProgressbar;
	private Button btnLoad;
	private Button btnOther;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView=(ImageView)findViewById(R.id.imageView1);
		mProgressbar=(ProgressBar)findViewById(R.id.progressBar1);
		btnLoad=(Button)findViewById(R.id.btnLoad);
		btnOther=(Button)findViewById(R.id.btnOther);
    }
}
