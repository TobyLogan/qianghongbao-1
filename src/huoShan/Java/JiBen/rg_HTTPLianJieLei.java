
package huoShan.Java.JiBen;

public class rg_HTTPLianJieLei {

    public static final int rg_QingQiuChengGong1 = 200;
    public static final int rg_YongJiuChongDingXiang = 301;
    public static final int rg_LinShiChongDingXiang = 302;

    public static void rg_ChongDingXiang3 (java.net.HttpURLConnection rg_YuCaoZuoBenDuiXiang7427, boolean rg_ShiFouGenSui1) {
        rg_YuCaoZuoBenDuiXiang7427.setInstanceFollowRedirects(rg_ShiFouGenSui1);
    }

    public static void rg_QingQiuFangFa3 (java.net.HttpURLConnection rg_YuCaoZuoBenDuiXiang7429, String rg_FangFa2) {
        try {
            rg_YuCaoZuoBenDuiXiang7429.setRequestMethod(rg_FangFa2);
        } catch (Exception e) { }
    }

    public static int rg_XiangYingZhuangTaiMa (java.net.HttpURLConnection rg_YuCaoZuoBenDuiXiang7430) {
        try {
            return rg_YuCaoZuoBenDuiXiang7430.getResponseCode();
        } catch (Exception e) {
            return -1;
        }
    }
}
