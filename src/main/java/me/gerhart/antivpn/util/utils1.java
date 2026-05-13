/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.kyori.adventure.text.Component
 *  net.kyori.adventure.text.minimessage.MiniMessage
 */
package me.gerhart.antivpn.util;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public final class utils1 {
    private static final MiniMessage MM;
    private static final Pattern HEX;
    private static final Map<Character, String> CODES;
    private static int Ebd83kNW9s = 0;
    private transient int J9XExdBeYZ = 177755380;
    private static byte[] giwbzvxogt;
    private static String[] nothing_to_see_here;

    private utils1() {
        int n = 0x27AA5933 ^ 0x5C7857F3;
        utils1 utils12 = this;
        n = 0x27D3A7D7 ^ n;
        n = 0x6AA81CB8 ^ (0x34B5F07D ^ Integer.parseInt("35407314"));
        this.J9XExdBeYZ = 0xA9854F4 ^ Ebd83kNW9s;
        {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                case 994659359: {
                    continue block5;
                }
                case 37972893: {
                    n = 0x3B7AC0F2 ^ n;
                    break block5;
                }
                default: {
                    throw new IllegalAccessException();
                }
                case 1233016165: 
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Component parse(String string, int n) {
        int n2;
        block9: {
            block10: {
                block8: {
                    n2 = 0x42C41990 ^ (0x3FF485A0 ^ 0x32D1D6C5);
                    n2 = 0x4DD4BA44 ^ n2;
                    String string2 = string;
                    if (string2 == null) break block8;
                    n2 = 0x574C05D9 ^ n2;
                    String string3 = string;
                    int n3 = string3.isEmpty();
                    if (n3 == (0x5579F568 ^ n2)) break block9;
                    n2 = 0x698A6462 ^ n2;
                    break block10;
                }
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2 = utils1.bqnpbkivzspevocs(n2, 1803787308)) != 1303602411) {
                    n2 = utils1.bqnpbkivzspevocs(n2, 100567147);
                    throw new RuntimeException();
                }
                n2 = 0x5545FD97 ^ n2;
            }
            String string4 = utils1.gxqjwuasxf(utils1.jnjbpqyxmrpkqvb(), n2);
            return Component.text((String)string4);
        }
        block5: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                case 1296712872: {
                    continue block5;
                }
                case 94117376: {
                    n2 = 0x19F8E559 ^ n2;
                }
                case 1761498955: {
                    String string5;
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2) != 1678279050) {
                        n2 = utils1.bqnpbkivzspevocs(n2, 550106311);
                        throw new RuntimeException();
                    }
                    n2 = utils1.bqnpbkivzspevocs(n2, 210525125);
                    String string6 = string;
                    String string7 = string5 = utils1.toMini(string6, 169013765);
                    n2 = 0x62A3EEA3 ^ n2;
                    MiniMessage miniMessage = MM;
                    String string8 = string7;
                    return miniMessage.deserialize((Object)string8);
                }
            }
            break;
        }
        throw new RuntimeException();
    }

    /*
     * Exception decompiling
     */
    private static String toMini(String var0, int var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    static {
        Pattern pattern;
        MiniMessage miniMessage;
        nothing_to_see_here = new String[18];
        utils1.nothing_to_see_here[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils1.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        int n = 0x58297353 ^ (0x32221F5C ^ Integer.parseInt("35407314"));
        giwbzvxogt = utils1.dhtnzvwrtwhcijf();
        int n2 = new Random(6216547335270422494L).nextInt();
        Ebd83kNW9s = 0x7397DF1D ^ n2;
        n = 0x79637AA7 ^ n;
        MM = miniMessage = MiniMessage.miniMessage();
        n = 0x7D73EB01 ^ n;
        String string = utils1.gxqjwuasxf(utils1.pemggkiqqinghvw(), n);
        HEX = pattern = Pattern.compile(string);
        n = 0x380D5E24 ^ n;
        HashMap<Character, String> hashMap = new HashMap<Character, String>();
        CODES = hashMap;
        n = 0x3F4BC899 ^ n;
        Map<Character, String> map = CODES;
        byte by = (byte)(0x6B412EF6 ^ n);
        Character c = Character.valueOf((char)by);
        String string2 = utils1.gxqjwuasxf(utils1.svelropiwynuppv(), n);
        String string3 = map.put(c, string2);
        n = 0x46ECF71A ^ n;
        Map<Character, String> map2 = CODES;
        byte by2 = (byte)(0x2DADD9ED ^ n);
        Character c2 = Character.valueOf((char)by2);
        String string4 = utils1.gxqjwuasxf(utils1.zyhelrmpqwcthad(), n);
        String string5 = map2.put(c2, string4);
        n = 0x45E8A833 ^ n;
        Map<Character, String> map3 = CODES;
        byte by3 = (byte)(0x684571DD ^ n);
        Character c3 = Character.valueOf((char)by3);
        String string6 = utils1.gxqjwuasxf(utils1.zluccejcotxvbix(), n);
        String string7 = map3.put(c3, string6);
        n = 0x47E7D950 ^ n;
        Map<Character, String> map4 = CODES;
        byte by4 = (byte)(0x2FA2A88C ^ n);
        Character c4 = Character.valueOf((char)by4);
        String string8 = utils1.gxqjwuasxf(utils1.rvmumdulfmwgswa(), n);
        String string9 = map4.put(c4, string8);
        n = 0x1B7FAD96 ^ n;
        Map<Character, String> map5 = CODES;
        byte by5 = (byte)(0x34DD051D ^ n);
        Character c5 = Character.valueOf((char)by5);
        String string10 = utils1.gxqjwuasxf(utils1.hztylkosfudzizi(), n);
        String string11 = map5.put(c5, string10);
        n = 0x58845944 ^ n;
        Map<Character, String> map6 = CODES;
        byte by6 = (byte)(0x6C595C58 ^ n);
        Character c6 = Character.valueOf((char)by6);
        String string12 = utils1.gxqjwuasxf(utils1.uoweejayayyyoce(), n);
        String string13 = map6.put(c6, string12);
        n = 0x7960826E ^ n;
        Map<Character, String> map7 = CODES;
        byte by7 = (byte)(0x1539DE35 ^ n);
        Character c7 = Character.valueOf((char)by7);
        String string14 = utils1.gxqjwuasxf(utils1.nqkweftscgattmq(), n);
        String string15 = map7.put(c7, string14);
        n = 0x271F9C2 ^ n;
        Map<Character, String> map8 = CODES;
        byte by8 = (byte)(0x174827F6 ^ n);
        Character c8 = Character.valueOf((char)by8);
        String string16 = utils1.gxqjwuasxf(utils1.bccfidnmujxoiwt(), n);
        String string17 = map8.put(c8, string16);
        n = 0x155618F5 ^ n;
        Map<Character, String> map9 = CODES;
        byte by9 = (byte)(0x21E3F0C ^ n);
        Character c9 = Character.valueOf((char)by9);
        String string18 = utils1.gxqjwuasxf(utils1.rxxixvlfbqwurpf(), n);
        String string19 = map9.put(c9, string18);
        n = 0x533F0FE2 ^ n;
        Map<Character, String> map10 = CODES;
        byte by10 = (byte)(0x512130EF ^ n);
        Character c10 = Character.valueOf((char)by10);
        String string20 = utils1.gxqjwuasxf(utils1.qfzuseqrachzwpn(), n);
        String string21 = map10.put(c10, string20);
        n = 0x48D46005 ^ n;
        Map<Character, String> map11 = CODES;
        byte by11 = (byte)(0x19F550B2 ^ n);
        Character c11 = Character.valueOf((char)by11);
        String string22 = utils1.gxqjwuasxf(utils1.ljsjcetolmzgpwt(), n);
        String string23 = map11.put(c11, string22);
        n = 0x12EEA8BC ^ n;
        Map<Character, String> map12 = CODES;
        byte by12 = (byte)(0xB1BF80D ^ n);
        Character c12 = Character.valueOf((char)by12);
        String string24 = utils1.gxqjwuasxf(utils1.mypfvavwccayzcc(), n);
        String string25 = map12.put(c12, string24);
        n = 0x5EED558B ^ n;
        Map<Character, String> map13 = CODES;
        byte by13 = (byte)(0x55F6AD87 ^ n);
        Character c13 = Character.valueOf((char)by13);
        String string26 = utils1.gxqjwuasxf(utils1.iptfxthatqqrgvp(), n);
        String string27 = map13.put(c13, string26);
        n = 0x50D047B ^ n;
        Map<Character, String> map14 = CODES;
        byte by14 = (byte)(0x50FBA9FB ^ n);
        Character c14 = Character.valueOf((char)by14);
        String string28 = utils1.gxqjwuasxf(utils1.kqlchxlhznyrtlc(), n);
        String string29 = map14.put(c14, string28);
        n = 0x1DEACB90 ^ n;
        Map<Character, String> map15 = CODES;
        byte by15 = (byte)(0x4D11626A ^ n);
        Character c15 = Character.valueOf((char)by15);
        String string30 = utils1.gxqjwuasxf(utils1.xbjuzbcfjljzfgc(), n);
        String string31 = map15.put(c15, string30);
        n = 0x56E4D6CF ^ n;
        Map<Character, String> map16 = CODES;
        byte by16 = (byte)(0x1BF5B4A6 ^ n);
        Character c16 = Character.valueOf((char)by16);
        String string32 = utils1.gxqjwuasxf(utils1.dsfyrlrzfbbqwqu(), n);
        String string33 = map16.put(c16, string32);
        n = 0x56188056 ^ n;
        Map<Character, String> map17 = CODES;
        byte by17 = (byte)(0x4DED34FD ^ n);
        Character c17 = Character.valueOf((char)by17);
        String string34 = utils1.gxqjwuasxf(utils1.ujjyenjztjpdskp(), n);
        String string35 = map17.put(c17, string34);
        n = 0x4F06AA52 ^ n;
        Map<Character, String> map18 = CODES;
        byte by18 = (byte)(0x2EB9EA8 ^ n);
        Character c18 = Character.valueOf((char)by18);
        String string36 = utils1.gxqjwuasxf(utils1.dbsgufaniienwkh(), n);
        String string37 = map18.put(c18, string36);
        n = 0x2508611F ^ n;
        Map<Character, String> map19 = CODES;
        byte by19 = (byte)(0x27E3FFB6 ^ n);
        Character c19 = Character.valueOf((char)by19);
        String string38 = utils1.gxqjwuasxf(utils1.lolmshzvsqlmdhc(), n);
        String string39 = map19.put(c19, string38);
        n = 0x77F667F7 ^ n;
        Map<Character, String> map20 = CODES;
        byte by20 = (byte)(0x50159842 ^ n);
        Character c20 = Character.valueOf((char)by20);
        String string40 = utils1.gxqjwuasxf(utils1.aqmxscxmxymddfh(), n);
        String string41 = map20.put(c20, string40);
        n = 0x29B6FD84 ^ n;
        Map<Character, String> map21 = CODES;
        byte by21 = (byte)(0x79A365C7 ^ n);
        Character c21 = Character.valueOf((char)by21);
        String string42 = utils1.gxqjwuasxf(utils1.ijyvqekelqjrrqy(), n);
        String string43 = map21.put(c21, string42);
        n = 0x40145108 ^ n;
        Map<Character, String> map22 = CODES;
        byte by22 = (byte)(0x39B734D2 ^ n);
        Character c22 = Character.valueOf((char)by22);
        String string44 = utils1.gxqjwuasxf(utils1.tsgrzoqcezkoqln(), n);
        String string45 = map22.put(c22, string44);
        n = 0x60595E2C ^ n;
    }

    public static String gxqjwuasxf(byte[] byArray, int n) {
        byte[] byArray2;
        int n2;
        int n3;
        int n4;
        byte[] byArray3;
        int n5 = n;
        String string = Integer.toString(n5);
        byte[] byArray4 = byArray3 = string.getBytes();
        int n6 = n4 = 0;
        while ((n3 = n6) < (n2 = (byArray2 = byArray).length)) {
            byte by;
            byte by2;
            byte[] byArray5 = byArray;
            int n7 = n6;
            byte by3 = byArray5[n7];
            byte[] byArray6 = byArray4;
            int n8 = n6;
            byte[] byArray7 = byArray4;
            int n9 = byArray7.length;
            int n10 = n8 % n9;
            byte by4 = byArray6[n10];
            int n11 = by3 ^ by4;
            byArray5[n7] = by2 = (byte)n11;
            byte[] byArray8 = byArray;
            int n12 = n6;
            byte by5 = byArray8[n12];
            byte[] byArray9 = giwbzvxogt;
            int n13 = n6++;
            byte[] byArray10 = giwbzvxogt;
            int n14 = byArray10.length;
            int n15 = n13 % n14;
            byte by6 = byArray9[n15];
            int n16 = by5 ^ by6;
            byArray8[n12] = by = (byte)n16;
        }
        byte[] byArray11 = byArray;
        Charset charset = StandardCharsets.UTF_16;
        String string2 = new String(byArray11, charset);
        return string2;
    }

    private static byte[] dhtnzvwrtwhcijf() {
        return new byte[]{26, 114, 70, 101, 37, 102, 30, 40, 67, 81, 120, 38, 6, 72, 70, 80, 61, 16, 71, 33, 101, 123, 57, 81, 110, 78, 93, 97, 5, 95, 4, 17, 35, 28, 21, 102, 62, 45, 69, 56, 15, 47, 123, 85, 24, 91, 103, 49, 93, 93, 123, 59, 94, 43, 44, 8, 110, 112, 92, 24, 78, 109, 41, 67, 59, 67, 73, 46, 35, 38, 106, 8, 106, 67, 87, 53, 57, 127, 66, 121, 93, 112, 90, 85, 85, 42, 106, 43, 53, 5, 67, 13, 71, 57, 17, 94, 34, 43, 83, 47, 111, 88, 81};
    }

    private static byte[] hztylkosfudzizi() {
        return new byte[]{-36, -75, 112, 96, 21, 50, 46, 121, 122, 27, 64, 123, 63, 39, 118, 18, 13, 76, 127, 125, 83, 124};
    }

    private static byte[] tsgrzoqcezkoqln() {
        return new byte[]{-35, -69, 126, 106, 21, 35, 38, 122, 113, 27, 78, 123, 53, 12, 113, 86};
    }

    private static byte[] zluccejcotxvbix() {
        return new byte[]{-43, -70, 114, 96, 22, 58, 47, 127, 114, 22, 73, 122, 50, 46, 117, 15, 12, 84, 118, 113, 84, 41, 13, 6, 93, 72};
    }

    private static byte[] kqlchxlhznyrtlc() {
        return new byte[]{-43, -66, 115, 97, 19, 61, 46, 115, 112, 15, 73, 125, 51, 4, 112, 56, 13, 82, 116, 109, 84, 58, 12, 25, 88, 21, 109, 54, 54, 88};
    }

    private static byte[] lolmshzvsqlmdhc() {
        return new byte[]{-46, -69, 127, 107, 16, 38, 43, 101, 118, 21, 78, 118, 52, 22, 117, 0, 4, 81, 113, 127, 92, 59, 12, 13, 91, 2, 104, 48, 51, 14, 54, 26};
    }

    private static byte[] mypfvavwccayzcc() {
        return new byte[]{-43, -75, 112, 106, 29, 53, 42, 109, 116, 21, 64, 113, 53, 78};
    }

    private static byte[] dbsgufaniienwkh() {
        return new byte[]{-48, -75, 127, 96, 19, 52, 45, 113, 119, 5, 65, 123, 48, 70};
    }

    private static byte[] iptfxthatqqrgvp() {
        return new byte[]{-43, -71, 114, 107, 23, 38, 39, 122, 112, 7, 73, 44};
    }

    private static byte[] pemggkiqqinghvw() {
        return new byte[]{-43, -75, 119, 113, 17, 113, 43, 51, 115, 61, 73, 46, 55, 87, 114, 93, 8, 66, 119, 59, 84, 37, 8, 34, 90, 87, 104, 20, 53, 53, 53, 82, 18, 24, 33, 47, 11, 55};
    }

    private static byte[] ljsjcetolmzgpwt() {
        return new byte[]{-48, -66, 115, 108, 21, 54, 42, 107, 114, 0, 75, 118, 51, 22, 113, 90};
    }

    private static byte[] qfzuseqrachzwpn() {
        return new byte[]{-43, -66, 112, 104, 20, 54, 39, 114, 123, 18, 73, 112, 48, 71};
    }

    private static byte[] xbjuzbcfjljzfgc() {
        return new byte[]{-43, -65, 127, 107, 28, 39, 42, 117, 119, 10, 73, 120, 63, 21, 127, 31, 9, 22};
    }

    private static byte[] ijyvqekelqjrrqy() {
        return new byte[]{-42, -67, 114, 105, 18, 58, 47, 105, 113, 8, 74, 122, 50, 17, 113, 6, 12, 27};
    }

    private static byte[] uoweejayayyyoce() {
        return new byte[]{-43, -75, 119, 110, 18, 59, 43, 127, 122, 16, 73, 117, 55, 32, 113, 25, 8, 83, 126, 96, 84, 51, 8, 10, 89, 18, 104, 105};
    }

    private static byte[] svelropiwynuppv() {
        return new byte[]{-43, -70, 127, 96, 17, 55, 45, 125, 113, 6, 73, 114, 63, 26, 114, 93};
    }

    private static byte[] dsfyrlrzfbbqwqu() {
        return new byte[]{-48, -69, 127, 105, 29, 38, 42, 114, 119, 12, 78, 107, 54, 21, 113, 90};
    }

    private static byte[] nqkweftscgattmq() {
        return new byte[]{-41, -72, 112, 104, 20, 50, 39, 117, 112, 14, 77, 116, 55, 71};
    }

    private static byte[] zyhelrmpqwcthad() {
        return new byte[]{-45, -69, 112, 106, 19, 58, 44, 123, 115, 20, 78, 123, 53, 33, 126, 0, 15, 76, 112, 98, 83, 45, 15, 87};
    }

    private static byte[] rxxixvlfbqwurpf() {
        return new byte[]{-41, -72, 115, 106, 19, 52, 39, 123, 112, 22, 77, 126, 48, 33, 127, 5, 14, 87, 114, 115, 83, 52, 0, 93};
    }

    private static byte[] ujjyenjztjpdskp() {
        return new byte[]{-43, -66, 118, 110, 22, 48, 47, 123, 113, 1, 73, 96, 54, 12, 117, 10, 12, 64, 117, 99, 84, 45, 9, 2, 93, 73};
    }

    private static byte[] aqmxscxmxymddfh() {
        return new byte[]{-43, -66, 114, 106, 16, 42, 44, 114, 122, 7, 73, 112, 50, 9, 115, 5, 15, 77, 126, 125, 84, 45, 13, 6, 91, 73};
    }

    private static byte[] bccfidnmujxoiwt() {
        return new byte[]{-41, -76, 118, 111, 21, 53, 41, 105, 116, 3, 65, 111, 48, 70};
    }

    private static byte[] rvmumdulfmwgswa() {
        return new byte[]{-45, -76, 127, 104, 29, 59, 47, 113, 112, 20, 65, 116, 55, 47, 127, 0, 5, 82, 112, 109, 92, 43, 1, 86};
    }

    private static byte[] jnjbpqyxmrpkqvb() {
        return new byte[0];
    }

    private static int bqnpbkivzspevocs(int n, int n2) {
        return n ^ n2;
    }
}

