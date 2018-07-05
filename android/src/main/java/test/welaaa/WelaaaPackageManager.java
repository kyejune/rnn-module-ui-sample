package com.eegoma.RNAudioPlayer;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WelaaaPackageManager implements ReactPackage {

    /* 모듈 등록 */
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new RNAudioPlayerModule(reactContext));

        return modules;
    }


    /* UI 모듈 등록 */
    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new ReactImageManager);

        return modules;
    }
}