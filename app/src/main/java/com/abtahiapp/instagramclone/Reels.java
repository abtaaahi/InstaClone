package com.abtahiapp.instagramclone;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.fragment.app.Fragment;
public class Reels extends Fragment {
    View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        root= inflater.inflate(R.layout.fragment_reels, container, false);

        WebView webView1 = (WebView) root.findViewById(R.id.wv1);
        WebSettings webSettings1 = webView1.getSettings();
        webSettings1.setJavaScriptEnabled(true);
        webView1.loadUrl("https://www.instagram.com/reels/C3kKTXHPD75/");

        return root;
    }
}