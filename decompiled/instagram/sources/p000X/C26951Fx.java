package p000X;

import java.util.ArrayList;

/* renamed from: X.1Fx  reason: invalid class name and case insensitive filesystem */
public final class C26951Fx {
    public static C26961Fy parseFromJson(C13080hr r4) {
        C26961Fy r3 = new C26961Fy();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("pending_saves".equals(A0i)) {
                ArrayList arrayList = null;
                if (r4.A0g() == C13120hv.START_ARRAY) {
                    arrayList = new ArrayList();
                    while (r4.A0p() != C13120hv.END_ARRAY) {
                        C195948a0 parseFromJson = C195938Zz.parseFromJson(r4);
                        if (parseFromJson != null) {
                            arrayList.add(parseFromJson);
                        }
                    }
                }
                r3.A00 = arrayList;
            }
            r4.A0f();
        }
        return r3;
    }
}
