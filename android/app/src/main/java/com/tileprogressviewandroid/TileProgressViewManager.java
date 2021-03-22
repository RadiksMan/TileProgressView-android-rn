package com.tileprogressviewandroid;

import android.view.View;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.iammert.tileprogressview.TiledProgressView;

public class TileProgressViewManager extends SimpleViewManager<TiledProgressView> {

    public static final String REACT_CLASS = "TileProgressView";
    ReactApplicationContext mCallerContext;

    public TileProgressViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public TiledProgressView createViewInstance(ThemedReactContext context){
        TiledProgressView tileProgressView = new TiledProgressView(context);
        return tileProgressView;
    }


    @ReactProp(name = "color", defaultInt = R.color.white)
    public void setColorRes(TiledProgressView view, Integer colorRes ) {
        view.setColorRes(colorRes);
    }

    @ReactProp(name = "loadingColor", defaultInt = R.color.purple)
    public void setLoadingColorRes(TiledProgressView view, Integer colorRes ) {
        view.setLoadingColorRes(colorRes);
    }

    @ReactProp(name = "progress")
    public void setProgress(TiledProgressView view, Float progressValue ) {
        view.setProgress(progressValue);
    }
}
