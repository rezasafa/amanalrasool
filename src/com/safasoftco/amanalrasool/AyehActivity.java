package com.safasoftco.amanalrasool;

import com.safasoftco.amanalrasool.R.id;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class AyehActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_ayeh);
		
		
		String ta= "به نام خداوند بخشنده و مهربان" 
				+  "\n" 
				+  "\n" 
				+  "\n" 
				+  "«آمَنَ الرَّسُولُ بِمَا أُنزِلَ إِلَيْهِ مِن رَّبِّهِ وَالْمُؤْمِنُونَ كُلٌّ آمَنَ بِاللّهِ وَمَلآئِكَتِهِ وَكُتُبِهِ وَرُسُلِهِ لاَ نُفَرِّقُ بَيْنَ أَحَدٍ مِّن رُّسُلِهِ وَقَالُواْ سَمِعْنَا وَأَطَعْنَا غُفْرَانَكَ رَبَّنَا وَإِلَيْكَ الْمَصِیرُ»؛"  
				+  "\n"
				+  "\n" 
				+  "پیامبر (خدا) بدانچه از جانب پروردگارش بر او نازل شده است ایمان آورده است‌، و مؤمنان همگى به خدا و فرشتگان و کتابها و فرستادگانش ایمان آورده‌اند (و گفتند:) (میان هیچ یک از فرستادگانش فرق نمى‌گذاریم‌) و گفتند: (شنیدیم و گردن نهادیم‌، پروردگارا، آمرزش تو را (خواستاریم‌) و فرجام به سوى تو است‌."
				+  "\n" 
				+  "\n" 
				+  "«لاَ يُكَلِّفُ اللّهُ نَفْسًا إِلاَّ وُسْعَهَا لَهَا مَا كَسَبَتْ وَعَلَيْهَا مَا اكْتَسَبَتْ رَبَّنَا لاَ تُؤَاخِذْنَا إِن نَّسِینَا أَوْ أَخْطَأْنَا رَبَّنَا وَلاَ تَحْمِلْ عَلَيْنَا إِصْرًا كَمَا حَمَلْتَهُ عَلَى الَّذِینَ مِن قَبْلِنَا رَبَّنَا وَلاَ تُحَمِّلْنَا مَا لاَ طَاقَةَ لَنَا بِهِ وَاعْفُ عَنَّا وَاغْفِرْ لَنَا وَارْحَمْنَآ أَنتَ مَوْلاَنَا فَانصُرْنَا عَلَى الْقَوْمِ الْكَافِرِینَ»؛" 
				+  "\n" 
				+  "\n" 
				+  "خداوند هیچ کس را جز به قدر توانایى‌اش تکلیف نمى‌کند. آنچه (از خوبى‌) به دست آورده به سود او، و آنچه (از بدى‌) به دست آورده به زیان اوست‌. پروردگارا، اگر فراموش کردیم یا به خطا رفتیم بر ما مگیر، پروردگارا، هیچ بار گرانى بر (دوش‌) ما مگذار؛ همچنانکه بر (دوش‌) کسانى که پیش از ما بودند نهادى‌. پروردگارا، و آنچه تاب آن نداریم بر ما تحمیل مکن‌؛ و از ما درگذر؛ و ما را ببخشاى و بر ما رحمت آور؛ سرور ما تویى‌؛ پس ما را بر گروه کافران پیروز کن‌."
				+  "\n" 
				+  " ";
				
				TextView tv = (TextView ) findViewById(id.txtAyeh);
				tv.setTextSize(18);
				//tv.setTextColor(Color.parseColor("#FFFFFF"));
				tv.setTextColor(Color.BLACK);
				tv.setText(ta);
				
	}

	
}
