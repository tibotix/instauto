package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0wB  reason: invalid class name and case insensitive filesystem */
public final class C21100wB extends C17090pf implements C20570vK {
    public static final C17120pi A02 = new C21110wC();
    public String A00;
    public boolean A01;

    public final String A01() {
        return "send_mute_video_call";
    }

    public final DirectThreadKey AY6() {
        return new DirectThreadKey(this.A00);
    }

    public C21100wB() {
    }

    public C21100wB(AnonymousClass3LQ r1, String str, boolean z) {
        super(r1);
        AnonymousClass0a4.A06(str);
        this.A00 = str;
        this.A01 = z;
    }
}
