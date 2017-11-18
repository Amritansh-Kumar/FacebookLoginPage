    package com.example.acer.facebooklayout;

    import android.app.Fragment;
    import android.app.FragmentManager;
    import android.content.Intent;
    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.CompoundButton;
    import android.widget.EditText;
    import android.widget.Toast;
    import android.widget.ToggleButton;


    public class MainActivity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }


        public void submit(View view)

        {

            Toast toast = Toast.makeText(getBaseContext(), "successfully submited", Toast.LENGTH_LONG);
            toast.show();

        }

    }




