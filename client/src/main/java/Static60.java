import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!em", name = "t", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray6;

	@OriginalMember(owner = "client!em", name = "v", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!em", name = "w", descriptor = "I")
	public static int anInt1892;

	@OriginalMember(owner = "client!em", name = "x", descriptor = "Lclient!cj;")
	public static Class19 aClass19_1;

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	public static int anInt1895;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!na;")
	public static final Class100 aClass100_420 = Static28.method790(")1o");

	@OriginalMember(owner = "client!em", name = "y", descriptor = "I")
	public static int anInt1893 = 0;

	@OriginalMember(owner = "client!em", name = "z", descriptor = "Z")
	public static boolean aBoolean108 = false;

	@OriginalMember(owner = "client!em", name = "A", descriptor = "Lclient!na;")
	public static final Class100 aClass100_421 = Static28.method790("blinken3:");

	@OriginalMember(owner = "client!em", name = "B", descriptor = "I")
	public static int anInt1894 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!be;Lclient!qf;IIIBI)V")
	public static void method1446(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class3_Sub2_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		@Pc(21) int local21 = arg3 * arg3 + arg2 * arg2;
		@Pc(27) int local27 = Static59.anInt1814 + Static57.anInt1747 & 0x7FF;
		@Pc(39) int local39 = Math.max(arg0.anInt445 / 2, arg0.anInt459 / 2) + 10;
		if (local39 * local39 < local21) {
			return;
		}
		@Pc(50) int local50 = Class58.anIntArray223[local27];
		@Pc(58) int local58 = local50 * 256 / (Static273.anInt4130 + 256);
		@Pc(62) int local62 = Class58.anIntArray225[local27];
		@Pc(70) int local70 = local62 * 256 / (Static273.anInt4130 + 256);
		@Pc(81) int local81 = local58 * arg2 + arg3 * local70 >> 16;
		@Pc(92) int local92 = local70 * arg2 - arg3 * local58 >> 16;
		if (Static239.aBoolean269) {
			((GlSprite) arg1).method1425(arg0.anInt445 / 2 + arg5 + local81 - arg1.anInt1860 / 2, arg0.anInt459 / 2 + arg4 - (local92 + arg1.anInt1866 / 2), (GlSprite) arg0.method489(false));
		} else {
			((Class3_Sub2_Sub1_Sub1) arg1).method312(arg0.anInt445 / 2 + arg5 + local81 - arg1.anInt1860 / 2, -(arg1.anInt1866 / 2) + arg0.anInt459 / 2 + arg4 + -local92, arg0.anIntArray37, arg0.anIntArray45);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I")
	public static int method1447(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
