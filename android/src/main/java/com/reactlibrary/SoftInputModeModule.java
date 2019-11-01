package com.reactlibrary;

import android.view.WindowManager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import static com.facebook.react.bridge.UiThreadUtil.runOnUiThread;

public class SoftInputModeModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public SoftInputModeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "SoftInputMode";
    }


    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("adjustPan", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        constants.put("adjustResize", WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
        return constants;
    }

    @ReactMethod
    public void changeWindowSoftInputMode(Integer inputMode) {
        final Integer softInputMode = inputMode;
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                getCurrentActivity().getWindow().setSoftInputMode(softInputMode);
            }
        });
    }
}
