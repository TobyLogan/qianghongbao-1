
package anZhuo.MoMingMoKuai.WenJianMuLuCaoZuo;

public class rg_MuLuGongJuLei {

    public rg_MuLuGongJuLei ()  { }

    public static String rg_MuLu_QuCunChuLuJing () {
        java.io.File rg_GenMuLu1;
        rg_GenMuLu1 = android.os.Environment.getExternalStorageDirectory ();
        if (rg_GenMuLu1 == null)
        {
            return ("/sdcard/");
        }
        return (rg_GenMuLu1.getPath () + "/");
    }

    public static String rg_MuLu_QuMuLu (String rg_Can_WenJianLuJing24) {
        return ((new java.io.File (rg_Can_WenJianLuJing24).getParentFile ()).getPath ());
    }

    public static boolean rg_MuLu_ShiFouCunZai (String rg_Can_WenJianLuJing26) {
        return (new java.io.File (rg_Can_WenJianLuJing26).exists ());
    }

    public static boolean rg_MuLu_ChuangJianWenJianMuLu (String rg_Can_WenJianLuJing27) {
        if (rg_WenJianCaoZuoGongJuLei.rg_WenJian_FuMuLuShiFouCunZai (rg_Can_WenJianLuJing27))
        {
            return (true);
        }
        else
        {
            return ((new java.io.File (rg_Can_WenJianLuJing27).getParentFile ()).mkdirs ());
        }
    }
}
