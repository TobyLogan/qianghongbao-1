
package huoShan.AnZhuo.JiBen;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class rg_WenBenKuang extends AndroidView {

    public rg_WenBenKuang ()  { }

    public rg_WenBenKuang (android.content.Context context, TextView view, Object objInitData) { super (context, view, objInitData); }
    public rg_WenBenKuang (android.content.Context context, TextView view) { this (context, view, null); }
    public TextView GetTextView () { return (TextView)GetView (); }
    public static rg_WenBenKuang sNewInstance (android.content.Context context) {
        return sNewInstanceAndAttachView (context, new TextView (context), null);
    }
    public static rg_WenBenKuang sNewInstance (android.content.Context context, Object objInitData) {
        return sNewInstanceAndAttachView (context, new TextView (context), objInitData);
    }
    public static rg_WenBenKuang sNewInstanceAndAttachView (android.content.Context context, TextView viewAttach) {
        return sNewInstanceAndAttachView (context, viewAttach, null);
    }
    public static rg_WenBenKuang sNewInstanceAndAttachView (android.content.Context context, TextView viewAttach, Object objInitData) {
        rg_WenBenKuang objControl = new rg_WenBenKuang (context, viewAttach, objInitData);
        objControl.onInitControlContent (context, objInitData);
        return objControl;
    }
    protected int rg_DangQianSuoSheZhiZiTiLeiXing = 0;
    protected int rg_DangQianSuoSheZhiZiTiFengGe = 0;
    android.text.TextWatcher m_objTextWatcher;

    public void rg_ChangYongShuRuLeiXing1 (int rg_YuSheZhiDeChangYongShuRuLeiXing) {
        rg_ZhiNeiRongShuRuLeiXing (rg_YuSheZhiDeChangYongShuRuLeiXing);
    }

    public void rg_NeiRong8 (final String rg_YuSheZhiDeWenBenNeiRong) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setText (rg_YuSheZhiDeWenBenNeiRong);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setText (rg_YuSheZhiDeWenBenNeiRong);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_WenBenZiTiFengGe1 (final int rg_YuSheZhiZiTiFengGe4) {
        rg_DangQianSuoSheZhiZiTiFengGe = rg_YuSheZhiZiTiFengGe4;
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setTypeface (rg_ZiTiLei.rg_QuChangYongZiTi (rg_DangQianSuoSheZhiZiTiLeiXing), rg_DangQianSuoSheZhiZiTiFengGe);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setTypeface (rg_ZiTiLei.rg_QuChangYongZiTi (rg_DangQianSuoSheZhiZiTiLeiXing), rg_DangQianSuoSheZhiZiTiFengGe);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_WenBenZiTiCheCun1 (final double rg_YuSheZhiZiTiCheCun5) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setTextSize ((float)rg_YuSheZhiZiTiCheCun5);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setTextSize ((float)rg_YuSheZhiZiTiCheCun5);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_WenBenYanSe2 (final int rg_YuSheZhiYanSe7) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setTextColor (rg_YuSheZhiYanSe7);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setTextColor (rg_YuSheZhiYanSe7);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_NeiRongShuiPingDuiJiFangShi3 (final int rg_YuSheZhiDuiJiFangShi4) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setGravity (rg_YuSheZhiDuiJiFangShi4 |
                    (GetTextView ().getGravity () & ~(android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK | android.view.Gravity.CLIP_HORIZONTAL)));
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setGravity (rg_YuSheZhiDuiJiFangShi4 |
                                (GetTextView ().getGravity () & ~(android.view.Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK | android.view.Gravity.CLIP_HORIZONTAL)));
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_DiShiWenBen4 (final String rg_YuSheZhiDiShiWenBen) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setHint (rg_YuSheZhiDiShiWenBen);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setHint (rg_YuSheZhiDiShiWenBen);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_TianJiaNeiRong (final String rg_YuTianJiaDeWenBenNeiRong) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().append (rg_YuTianJiaDeWenBenNeiRong);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().append (rg_YuTianJiaDeWenBenNeiRong);
                    } catch (Exception e) { }
                } } );
        }
    }

    public void rg_ZhiNeiRongShuRuLeiXing (final int rg_YuSheZhiDeShuRuLeiXing) {
        if (rg_YingYongChengXu.sIsUiThread ()) {
            try {
                GetTextView ().setInputType (rg_YuSheZhiDeShuRuLeiXing);
            } catch (Exception e) { }
        } else {
            rg_YingYongChengXu.sRunOnUiThread (new Runnable () {
                @Override public void run () {
                    try {
                        GetTextView ().setInputType (rg_YuSheZhiDeShuRuLeiXing);
                    } catch (Exception e) { }
                } } );
        }
    }
}
