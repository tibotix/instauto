package p000X;

/* renamed from: X.DKU */
public final class DKU {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "PREPARED";
            case 2:
                return "STARTED";
            default:
                return "STOPPED";
        }
    }
}
