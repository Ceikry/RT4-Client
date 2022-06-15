package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public class MidiPlayer {
    @OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
    public static boolean jingle = false;
    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "Lclient!le;")
    public static SoundBank aClass89_1;
    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int anInt441 = 0;
    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Lclient!ve;")
    public static Js5 aClass153_103;
    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int anInt5527;
    @OriginalMember(owner = "client!wi", name = "ab", descriptor = "I")
    public static int anInt5853;
    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int anInt1757;
    @OriginalMember(owner = "client!fl", name = "u", descriptor = "Z")
    public static boolean aBoolean116;
    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Lclient!ve;")
    public static Js5 aClass153_87;
    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Lclient!ve;")
	public static Js5 aClass153_32;
    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lclient!rf;")
    public static Song aClass3_Sub29_1;
    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lclient!ve;")
	public static Js5 aClass153_70;
    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lclient!va;")
	public static MidiPcmStream midiPcmStream;
    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int anInt5085;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(Z)Z")
    public static boolean method2699() {
        try {
            if (anInt441 == 2) {
                if (aClass3_Sub29_1 == null) {
                    aClass3_Sub29_1 = Song.create(aClass153_70, anInt5853, anInt5085);
                    if (aClass3_Sub29_1 == null) {
                        return false;
                    }
                }
                if (aClass89_1 == null) {
                    aClass89_1 = new SoundBank(aClass153_32, aClass153_103);
                }
                if (midiPcmStream.method4411(aClass3_Sub29_1, aClass153_87, aClass89_1)) {
                    midiPcmStream.method4412();
                    midiPcmStream.method4447(anInt5527);
                    midiPcmStream.method4431(aBoolean116, aClass3_Sub29_1);
                    anInt441 = 0;
                    aClass3_Sub29_1 = null;
                    aClass89_1 = null;
                    aClass153_70 = null;
                    return true;
                }
            }
        } catch (@Pc(68) Exception local68) {
            local68.printStackTrace();
            midiPcmStream.method4446();
            aClass153_70 = null;
            aClass3_Sub29_1 = null;
            anInt441 = 0;
            aClass89_1 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
    public static void method801() {
        anInt5527 = 0;
        anInt5085 = -1;
        anInt441 = 1;
        anInt1757 = 2;
        aBoolean116 = false;
        aClass153_70 = null;
        anInt5853 = -1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIILclient!ve;ZII)V")
    public static void playFadeOut(@OriginalArg(1) int arg0, @OriginalArg(3) Js5 arg1, @OriginalArg(5) int arg2) {
        aClass153_70 = arg1;
        anInt5085 = 0;
        anInt5853 = arg0;
        aBoolean116 = false;
        anInt441 = 1;
        anInt1757 = 2;
        anInt5527 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!va;Lclient!ve;Lclient!ve;Lclient!ve;)Z")
    public static boolean init(@OriginalArg(1) MidiPcmStream arg0, @OriginalArg(2) Js5 arg1, @OriginalArg(3) Js5 arg2, @OriginalArg(4) Js5 arg3) {
        aClass153_87 = arg1;
        aClass153_32 = arg3;
        aClass153_103 = arg2;
        midiPcmStream = arg0;
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void loop() {
        try {
            if (anInt441 == 1) {
                @Pc(16) int local16 = midiPcmStream.method4440();
                if (local16 > 0 && midiPcmStream.method4414()) {
                    local16 -= anInt1757;
                    if (local16 < 0) {
                        local16 = 0;
                    }
                    midiPcmStream.method4447(local16);
                    return;
                }
                midiPcmStream.method4446();
                midiPcmStream.method4426();
                aClass3_Sub29_1 = null;
                aClass89_1 = null;
                if (aClass153_70 == null) {
                    anInt441 = 0;
                } else {
                    anInt441 = 2;
                }
            }
        } catch (@Pc(62) Exception local62) {
            local62.printStackTrace();
            midiPcmStream.method4446();
            aClass153_70 = null;
            aClass3_Sub29_1 = null;
            anInt441 = 0;
            aClass89_1 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)Z")
	public static boolean method2655() {
		return anInt441 != 0 || midiPcmStream.method4414();
	}

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lclient!ve;ZIIZI)V")
    public static void method2410(@OriginalArg(0) Js5 arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
        aClass153_70 = arg0;
        anInt441 = 1;
        anInt5527 = arg2;
        anInt5085 = 0;
        anInt5853 = arg1;
        aBoolean116 = false;
        anInt1757 = 10000;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public static void method4548() {
        midiPcmStream.method4446();
        anInt441 = 1;
        aClass153_70 = null;
    }
}
