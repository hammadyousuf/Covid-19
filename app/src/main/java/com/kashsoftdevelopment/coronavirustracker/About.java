package com.kashsoftdevelopment.coronavirustracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shashank.sony.fancyaboutpagelib.FancyAboutPage;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        FancyAboutPage fancyAboutPage=findViewById(R.id.fancyaboutpage);
        //fancyAboutPage.setCoverTintColor(Color.BLUE);  //Optional
        fancyAboutPage.setCover(R.drawable.allah); //Pass your cover image
        fancyAboutPage.setName("Hammad Yousuf");
        fancyAboutPage.setDescription("Android and Web Developer.");
        fancyAboutPage.setAppIcon(R.mipmap.ic_launcher); //Pass your app icon image
        fancyAboutPage.setAppName("About This App");
        fancyAboutPage.setVersionNameAsAppSubTitle("1.0");
        fancyAboutPage.setAppDescription("This app is built for providing all live updates of CORONA VIRUS.\n\n" +
                "Major motive of this app is to spread only true facts and any related news of Covid-19");



        fancyAboutPage.addEmailLink("kashsoftdevelopment@.com");     //Add your email id
        fancyAboutPage.addLinkedinLink("https://www.linkedin.com/in/hamm121/");  //Add your facebook address url
        fancyAboutPage.addFacebookLink("https://www.facebook.com/hammad.bhat");

    }
}
