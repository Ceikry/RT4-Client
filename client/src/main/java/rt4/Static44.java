package rt4;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	public static boolean aBoolean83 = false;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "Lclient!na;")
	public static final JagString IMG1 = JagString.parse("<img=1>");

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)Lclient!wk;")
	public static ComponentPointer method1148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) ComponentPointer local9 = new ComponentPointer();
		local9.anInt5879 = arg2;
		local9.anInt5878 = arg0;
		InterfaceList.openInterfaces.put(local9, (long) arg1);
		InterfaceList.method1753(arg0);
		@Pc(28) Component local28 = InterfaceList.getComponent(arg1);
		if (local28 != null) {
			InterfaceList.redraw(local28);
		}
		if (Static39.aClass13_10 != null) {
			InterfaceList.redraw(Static39.aClass13_10);
			Static39.aClass13_10 = null;
		}
		@Pc(45) int local45 = MiniMenu.size;
		@Pc(53) int local53;
		for (local53 = 0; local53 < local45; local53++) {
			if (Static2.method5(MiniMenu.actions[local53])) {
				MiniMenu.remove(local53);
			}
		}
		if (MiniMenu.size == 1) {
			Static40.aBoolean108 = false;
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
		} else {
			Static133.method4012(Static183.anInt4271, Static24.anInt761, Static229.anInt5138, Static13.anInt436);
			local53 = Fonts.b12Full.getStringWidth(LocalizedText.CHOOSE_OPTION);
			for (@Pc(95) int local95 = 0; local95 < MiniMenu.size; local95++) {
				@Pc(104) int local104 = Fonts.b12Full.getStringWidth(MiniMenu.getOp(local95));
				if (local104 > local53) {
					local53 = local104;
				}
			}
			Static24.anInt761 = local53 + 8;
			Static13.anInt436 = MiniMenu.size * 15 + (Static40.aBoolean298 ? 26 : 22);
		}
		if (local28 != null) {
			InterfaceList.method531(local28, false);
		}
		InterfaceList.method1626(arg0);
		if (InterfaceList.topLevelInterface != -1) {
			Static54.runScripts(1, InterfaceList.topLevelInterface);
		}
		return local9;
	}

}
