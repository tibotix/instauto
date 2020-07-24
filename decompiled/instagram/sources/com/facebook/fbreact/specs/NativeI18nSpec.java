package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeI18nSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeI18nSpec(A44 a44) {
        super(a44);
    }
}
