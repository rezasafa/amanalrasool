package com.safasoftco.amanalrasool;


import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }


    public void btnAyeh_Click(View v ) {
    	Intent mgl  =  new Intent(getApplicationContext() , AyehActivity.class);
		startActivity(mgl);
    }
    
    public void btnTafsir_Click(View v ) {
    	Intent mgl  =  new Intent(getApplicationContext() , TafsirActivity.class);
		startActivity(mgl);
    }
    
    public void btnManba_Click(View v){
    	//http://wikifeqh.ir/%D8%A2%DB%8C%D9%87_%D8%A2%D9%85%D9%86_%D8%A7%D9%84%D8%B1%D8%B3%D9%88%D9%84
    	String mylink = "http://wikifeqh.ir/%D8%A2%DB%8C%D9%87_%D8%A2%D9%85%D9%86_%D8%A7%D9%84%D8%B1%D8%B3%D9%88%D9%84";
		
		Uri webpage = Uri.parse(mylink);
	    Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
	    if (intent.resolveActivity(getPackageManager()) != null) {
	        startActivity(intent);
	    }	
    }
    public void btnContact_Click(View v ) {
    	
    	String s  = " نظرات و پیشنهادات خود را برای بهتر شدن برنامه با ما درمیان بگذارید." + "\n" + "\n برنامه نویس : رضا سلیمانی صفا \n شماره تماس : 09129373513 \n  rezasafa2005@yahoo.com" + "\n";
        DialogInterface.OnClickListener di1 = new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		};
		
		AlertDialog.Builder ad1 = new AlertDialog.Builder(this);
		ad1.setMessage(s);
		ad1.setTitle("تماس با ما") ;
		ad1.setPositiveButton("باشه", di1);
		ad1.show();

    }

    public void btnExit_Click(View v ) {
    	DialogInterface.OnClickListener di = new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				switch(which)
				{
				case DialogInterface.BUTTON_POSITIVE :
					finish();
					android.os.Process.killProcess(android.os.Process.myPid());
					break;
				case DialogInterface.BUTTON_NEGATIVE :
					break;
				}
			}
		};
		
		AlertDialog.Builder ad = new AlertDialog.Builder(this);
		ad.setMessage("آیا می خواهید از برنامه خارج شوید ؟");
		ad.setTitle("خروج از برنامه") ;
		ad.setPositiveButton("بله", di);
		ad.setNegativeButton("خیر", di);
		ad.show();
	    
    }
}
