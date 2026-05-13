/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.plugin.Plugin
 */
package me.gerhart.antivpn.license;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.invoke.LambdaMetafactory;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.function.Consumer;
import java.util.logging.Logger;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public final class License {
    private final Plugin plugin;
    private final Logger logger;
    private YamlConfiguration licenseConfig;
    private File licenseFile;
    private static int FkaqJipaBG = 0;
    private transient int nlt3LlnkDh = 266567820;
    private static String cjacybmoak;
    private static String[] nothing_to_see_here;

    public License(Plugin plugin, int n) {
        File file;
        Logger logger;
        Plugin plugin2;
        int n2 = 0x6382A2 ^ 0x2D2CD8A7;
        License license = this;
        {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                case 1970811049: {
                    continue block5;
                }
                case 130650918: {
                    n2 = 0x631FABE8 ^ n2;
                    break block5;
                }
                default: {
                    throw new RuntimeException();
                }
                case 1549747337: 
            }
        }
        n2 = 0x7981D480 ^ (0x18D4DC8 ^ Integer.parseInt("912025765"));
        this.nlt3LlnkDh = 0xFE3808C ^ FkaqJipaBG;
        n2 = License.eznkswutelizrsfy(n2, 1450115491);
        n2 = 0x76961398 ^ n2;
        License license2 = this;
        license2.plugin = plugin2 = plugin;
        n2 = 0x140A80E ^ n2;
        License license3 = this;
        Plugin plugin3 = plugin;
        license3.logger = logger = plugin3.getLogger();
        n2 = 0x51101EC ^ n2;
        License license4 = this;
        Plugin plugin4 = plugin;
        File file2 = plugin4.getDataFolder();
        String string = "license.yml";
        license4.licenseFile = file = new File(file2, string);
        n2 = 0x764C7A3E ^ n2;
        License license5 = this;
        license5.loadOrCreateLicenseFile(460417401);
        n2 = 0x41579609 ^ n2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void loadOrCreateLicenseFile(int var1_1) {
        var42_2 = 613636507 ^ (389122001 ^ 1659922855);
        var42_2 = 2135506557 ^ var42_2;
        try {
            block81: {
                block82: {
                    block80: {
                        block79: {
                            var2_3 = this;
                            var7_4 = var2_3.plugin;
                            var8_5 = var7_4.getDataFolder();
                            var9_6 = var8_5.exists();
                            if (var9_6 != (773556624 ^ var42_2)) break block79;
                            var42_2 = 96018754 ^ var42_2;
                            var10_7 = this;
                            var11_8 = var10_7.plugin;
                            var12_9 = var11_8.getDataFolder();
                            var13_10 = var12_9.mkdirs();
                            var42_2 = 465474029 ^ var42_2;
                            break block80;
                        }
                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var42_2 = License.eznkswutelizrsfy(var42_2, 2020641184)) == -1286078078) break block81;
                        break block82;
                    }
lbl20:
                    // 3 sources

                    while (true) {
                        block83: {
                            block85: {
                                block78: {
                                    block77: {
                                        block84: {
                                            var14_11 = this;
                                            var15_12 = var14_11.licenseFile;
                                            var16_13 = var15_12.exists();
                                            if (var16_13 != (807156031 ^ var42_2)) break block83;
                                            var42_2 = 1422931785 ^ var42_2;
                                            var17_14 = this;
                                            var18_15 = var17_14.licenseFile;
                                            var19_16 = var18_15.createNewFile();
                                            var42_2 = 874453302 ^ var42_2;
                                            var3_18 = this;
                                            var39_19 = var3_18.licenseFile;
                                            var4_20 = var20_17 = new FileWriter(var39_19);
                                            var42_2 = 1151867366 ^ var42_2;
                                            try {
                                                var21_21 = var4_20;
                                                var32_22 = License.tvbrokkrya(License.eqdjfyzzlzfoxcb(), var42_2);
                                                var21_21.write(var32_22);
                                                var42_2 = 1346150379 ^ var42_2;
                                                var22_23 = var4_20;
                                                var33_24 = License.tvbrokkrya(License.fuobzwzbzhmtlob(), var42_2);
                                                var22_23.write(var33_24);
                                                var42_2 = 1038470147 ^ var42_2;
                                                var23_25 = var4_20;
                                                var34_26 = License.tvbrokkrya(License.ztofcyqcdcobdid(), var42_2);
                                                var23_25.write(var34_26);
                                                var42_2 = 579285837 ^ var42_2;
                                                var24_27 = var4_20;
                                            }
                                            catch (Throwable v0) {
                                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var42_2)) {
                                                    case -1546095312: {
                                                        var42_2 = 423078943 ^ var42_2;
                                                        break;
                                                    }
                                                    case -854398349: {
                                                        var42_2 = License.eznkswutelizrsfy(var42_2, 1961820151);
                                                        break;
                                                    }
                                                    default: {
                                                        throw new RuntimeException("Error in hash");
                                                    }
                                                    case 574392938: {
                                                        var42_2 = 1225470964 ^ var42_2;
                                                    }
                                                }
                                            }
                                            break block84;
                                            var5_29 = var27_28 = v0;
                                            var42_2 = 873639060 ^ var42_2;
                                            try {
                                                var28_30 = var4_20;
                                                var28_30.close();
                                                var42_2 = 683771034 ^ var42_2;
                                                var42_2 = 266668500 ^ var42_2;
                                            }
                                            catch (Throwable v1) {
                                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var42_2)) {
                                                    case -890211991: {
                                                        var42_2 = License.eznkswutelizrsfy(var42_2, 1766159172);
                                                        var6_32 = var29_31 = v1;
                                                        var30_33 = var5_29;
                                                        var38_34 = var6_32;
                                                        var30_33.addSuppressed(var38_34);
                                                        var42_2 = 1853854484 ^ var42_2;
                                                        break block77;
                                                    }
                                                    default: {
                                                        throw new IOException("Error in hash");
                                                    }
                                                }
                                            }
                                            try {
                                                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2) == 185417973) throw new IllegalAccessException();
                                                throw null;
                                            }
                                            catch (IllegalAccessException v2) {
                                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var42_2)) {
                                                    default: {
                                                        throw new IllegalAccessException("Error in hash");
                                                    }
                                                    case -204203240: {
                                                        var42_2 = License.eznkswutelizrsfy(var42_2, 997569785);
                                                        ** break;
                                                    }
                                                    case 59913785: 
                                                }
                                                var42_2 = 92107101 ^ var42_2;
                                            }
                                            break block85;
                                        }
                                        var24_27.close();
                                        var42_2 = 1791577155 ^ var42_2;
                                        try {
                                            if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2) == 12170160) throw new IllegalAccessException();
                                            throw null;
                                        }
                                        catch (IllegalAccessException v3) {
                                            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var42_2)) {
                                                case -1889463807: {
                                                    var42_2 = 1940535619 ^ var42_2;
                                                    ** GOTO lbl106
                                                }
                                                case 1574791402: {
                                                    var42_2 = License.eznkswutelizrsfy(var42_2, 167622174);
lbl106:
                                                    // 2 sources

                                                    var42_2 = 298447701 ^ var42_2;
                                                    break block78;
                                                }
                                            }
                                            throw new RuntimeException("Error in hash");
                                        }
                                    }
lbl110:
                                    // 3 sources

                                    while (true) {
                                        var31_35 = var5_29;
                                        throw var31_35;
                                    }
                                }
lbl114:
                                // 2 sources

                                while (true) {
                                    var25_36 = this;
                                    var35_37 = this;
                                    var36_38 = var35_37.licenseFile;
                                    var25_36.licenseConfig = var37_39 = YamlConfiguration.loadConfiguration((File)var36_38);
                                    var42_2 = 1757433543 ^ var42_2;
                                    var42_2 = 1458837892 ^ var42_2;
                                    try {
                                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2) == 77311875) throw new RuntimeException();
                                        throw null;
                                    }
                                    catch (RuntimeException v4) {
                                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var42_2)) {
                                            case 1151357875: {
                                                var42_2 = 1530953 ^ var42_2;
                                                ** GOTO lbl131
                                            }
                                            case 1843263659: {
                                                var42_2 = License.eznkswutelizrsfy(var42_2, 87615786);
lbl131:
                                                // 2 sources

                                                var42_2 = License.eznkswutelizrsfy(var42_2, 65815032);
                                                return;
                                            }
                                        }
                                    }
                                    throw new IOException("Error in hash");
                                }
                            }
                            block71: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2)) {
                                    case 210234577: lbl-1000:
                                    // 2 sources

                                    {
                                        continue block71;
                                    }
                                    case 1640106365: {
                                        ** GOTO lbl110
                                    }
                                    case 130899637: {
                                        var42_2 = 460052967 ^ var42_2;
                                        ** continue;
                                    }
                                }
                                break;
                            }
                            throw new RuntimeException();
                        }
                        block72: while (true) {
                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2)) {
                                case 142390575: {
                                    continue block72;
                                }
                                case 221683446: {
                                    var42_2 = 1281907795 ^ var42_2;
                                }
                                case 2057401302: {
                                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var42_2) != -475845789) {
                                        var42_2 = 1763528558 ^ var42_2;
                                        throw new RuntimeException();
                                    } else {
                                        var42_2 = License.eznkswutelizrsfy(var42_2, 805014842);
                                        ** continue;
                                    }
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                block73: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2)) {
                        case 1014326449: {
                            continue block73;
                        }
                        case 124716598: {
                            var42_2 = 1124215346 ^ var42_2;
                            throw new RuntimeException();
                        }
                    }
                    break;
                }
                throw new RuntimeException();
            }
            block74: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var42_2)) {
                    case 140756294: {
                        continue block74;
                    }
                    case 296670850: {
                        ** GOTO lbl20
                    }
                    case 124716598: {
                        var42_2 = 1719089423 ^ var42_2;
                        ** continue;
                    }
                }
                break;
            }
        }
        catch (IOException v5) {
            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var42_2)) {
                default: {
                    throw new RuntimeException("Error in hash");
                }
                case 574392938: {
                    var42_2 = 1492219256 ^ var42_2;
                    ** break;
                }
                case -1669381454: {
                    var42_2 = License.eznkswutelizrsfy(var42_2, 1329138787);
                    ** break;
                }
                case 1561675409: {
                    var42_2 = License.eznkswutelizrsfy(var42_2, 924077287);
                    ** break;
                }
                case -215518231: {
                    var42_2 = 584190536 ^ var42_2;
                    ** break;
                }
                case -2133071030: {
                    var42_2 = License.eznkswutelizrsfy(var42_2, 1286445404);
                    ** break;
                }
                case 643855283: {
                    var42_2 = 2021321283 ^ var42_2;
                    ** break;
                }
                case -854398349: {
                    var42_2 = 1695857019 ^ var42_2;
                    ** break;
                }
                case -1929620040: {
                    var42_2 = 220819074 ^ var42_2;
                    ** break;
                }
                case -651464678: {
                    var42_2 = 1200851510 ^ var42_2;
                    ** break;
                }
                case 1893485697: {
                    var42_2 = 850226597 ^ var42_2;
                    ** break;
                }
                case 1785009608: {
                    var42_2 = License.eznkswutelizrsfy(var42_2, 301614732);
                    ** break;
                }
                case -890211991: {
                    var42_2 = 636021272 ^ var42_2;
                    ** break;
                }
                case -1546095312: {
                    var42_2 = License.eznkswutelizrsfy(var42_2, 147712659);
                    ** break;
                }
                case -2036811262: {
                    var42_2 = License.eznkswutelizrsfy(var42_2, 1281749877);
                    ** break;
                }
                case -2132686343: 
            }
            var42_2 = 749395210 ^ var42_2;
            ** break;
        }
        throw new RuntimeException();
lbl229:
        // 15 sources

        var40_41 = var26_40 = v5;
        var42_2 = 2010772466 ^ var42_2;
    }

    /*
     * Exception decompiling
     */
    public boolean validateLicense(int var1_1) {
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    public void logLicenseSuccess(String var1_1, String var2_2, String var3_3, String var4_4, String var5_5, String var6_6, String var7_7, int var8_8) {
        block46: {
            block44: {
                block43: {
                    block45: {
                        var139_9 = 380544972 ^ (300282232 ^ 1659922855);
                        var139_9 = 903770972 ^ var139_9;
                        var9_10 = this;
                        var12_11 = var9_10.logger;
                        var10_12 = License.tvbrokkrya(License.gzdgeyahuqjtkss(), var139_9);
                        var12_11.info(var10_12);
                        var139_9 = 883984910 ^ var139_9;
                        var13_13 = this;
                        var14_14 = var13_13.logger;
                        var69_15 = this;
                        var11_16 = License.tvbrokkrya(License.rzqjfxyckerjbul(), var139_9);
                        var70_17 = var69_15.toAnsi(var11_16, 1114114791);
                        var14_14.info(var70_17);
                        var139_9 = 1777578945 ^ var139_9;
                        var15_18 = this;
                        var16_19 = var15_18.logger;
                        var71_20 = this;
                        var116_21 = License.tvbrokkrya(License.ypswfjdmpgkoity(), var139_9);
                        var72_22 = var71_20.toAnsi(var116_21, 1114114791);
                        var16_19.info(var72_22);
                        var139_9 = 317723602 ^ var139_9;
                        var17_23 = this;
                        var18_24 = var17_23.logger;
                        var73_25 = this;
                        var117_26 = License.tvbrokkrya(License.bqezsffrrjxdhkr(), var139_9);
                        var74_27 = var73_25.toAnsi(var117_26, 1114114791);
                        var18_24.info(var74_27);
                        var139_9 = 265196909 ^ var139_9;
                        var19_28 = this;
                        var20_29 = var19_28.logger;
                        var75_30 = this;
                        var118_31 = License.tvbrokkrya(License.syznnfgchhklhjo(), var139_9);
                        var76_32 = var75_30.toAnsi(var118_31, 1114114791);
                        var20_29.info(var76_32);
                        var139_9 = 1820064928 ^ var139_9;
                        var21_33 = this;
                        var22_34 = var21_33.logger;
                        var77_35 = this;
                        var119_36 = License.tvbrokkrya(License.wpllqtsyxjsthfp(), var139_9);
                        var78_37 = var77_35.toAnsi(var119_36, 1114114791);
                        var22_34.info(var78_37);
                        var139_9 = 1600497533 ^ var139_9;
                        var23_38 = this;
                        var24_39 = var23_38.logger;
                        var79_40 = this;
                        var120_41 = License.tvbrokkrya(License.foxbzebjbmscoqp(), var139_9);
                        var80_42 = var79_40.toAnsi(var120_41, 1114114791);
                        var24_39.info(var80_42);
                        var139_9 = 1403893262 ^ var139_9;
                        var25_43 = this;
                        var26_44 = var25_43.logger;
                        var81_45 = this;
                        var121_46 = License.tvbrokkrya(License.xtkilfypfeyxlzd(), var139_9);
                        var82_47 = var81_45.toAnsi(var121_46, 1114114791);
                        var26_44.info(var82_47);
                        var139_9 = 2076312032 ^ var139_9;
                        var27_48 = this;
                        var28_49 = var27_48.logger;
                        var83_50 = this;
                        var122_51 = License.tvbrokkrya(License.jvgwsqvyxaxnlfa(), var139_9);
                        var84_52 = var83_50.toAnsi(var122_51, 1114114791);
                        var28_49.info(var84_52);
                        var139_9 = 302095427 ^ var139_9;
                        var29_53 = this;
                        var30_54 = var29_53.logger;
                        var85_55 = this;
                        var123_56 = License.tvbrokkrya(License.zzfxsootvwjsdnv(), var139_9);
                        var86_57 = var85_55.toAnsi(var123_56, 1114114791);
                        var30_54.info(var86_57);
                        var139_9 = 535355032 ^ var139_9;
                        var31_58 = this;
                        var32_59 = var31_58.logger;
                        var87_60 = this;
                        var124_61 = License.tvbrokkrya(License.aloialriewdfphu(), var139_9);
                        var88_62 = var87_60.toAnsi(var124_61, 1114114791);
                        var32_59.info(var88_62);
                        var139_9 = 59485919 ^ var139_9;
                        var33_63 = this;
                        var34_64 = var33_63.logger;
                        var89_65 = this;
                        var125_66 = License.tvbrokkrya(License.iqixqhcbfugdech(), var139_9);
                        var90_67 = var89_65.toAnsi(var125_66, 1114114791);
                        var34_64.info(var90_67);
                        var139_9 = 407348671 ^ var139_9;
                        var35_68 = this;
                        var36_69 = var35_68.logger;
                        var91_70 = License.tvbrokkrya(License.djdwgpkipewjgsq(), var139_9);
                        var36_69.info(var91_70);
                        var139_9 = 1639448342 ^ var139_9;
                        var37_71 = this;
                        var38_72 = var37_71.logger;
                        var92_73 = this;
                        var93_74 = var92_73.buildBar(1877955819);
                        var38_72.info(var93_74);
                        var139_9 = 1500192942 ^ var139_9;
                        var39_75 = this;
                        var40_76 = var39_75.logger;
                        var94_77 = this;
                        var126_78 = var1_1;
                        var127_79 = "&fLicense: &f" + var126_78;
                        var95_80 = var94_77.toAnsi(var127_79, 1114114791);
                        var40_76.info(var95_80);
                        var139_9 = 119940164 ^ var139_9;
                        var41_81 = this;
                        var42_82 = var41_81.logger;
                        var96_83 = this;
                        var128_84 = License.tvbrokkrya(License.xnhwumiyatdathm(), var139_9);
                        var97_85 = var96_83.toAnsi(var128_84, 1114114791);
                        var42_82.info(var97_85);
                        var139_9 = 396439900 ^ var139_9;
                        var43_86 = var4_4;
                        if (var43_86 == null) break block43;
                        var139_9 = 2098602368 ^ var139_9;
                        var44_87 = var4_4;
                        var45_88 = var44_87.trim();
                        var46_89 = var45_88.isEmpty();
                        if (var46_89 != (1208073623 ^ var139_9)) break block44;
                        var139_9 = 1339671020 ^ var139_9;
                        var47_90 = var3_3;
                        var98_91 = var4_4;
                        var48_92 = var47_90.equals(var98_91);
                        if (var48_92 != (131628155 ^ var139_9)) break block45;
                        var139_9 = 1596611054 ^ var139_9;
                        var49_93 = var4_4;
                        var99_94 = License.tvbrokkrya(License.shcysvcutbioaea(), var139_9);
                        var139_9 = 1850372595 ^ var139_9;
                        var50_95 = var49_93.equals(var99_94);
                        if (var50_95 == (918049894 ^ var139_9)) {
                            var139_9 = 1480874390 ^ var139_9;
                            var51_96 = this;
                            var52_97 = var51_96.logger;
                            var100_98 = License.tvbrokkrya(License.agtqxgtwyjihehg(), var139_9);
                            var52_97.info(var100_98);
                            var139_9 = 1588783022 ^ var139_9;
                            var53_99 = this;
                            var54_100 = var53_99.logger;
                            var101_101 = this;
                            var102_102 = var101_101.buildBar(1877955819);
                            var54_100.info(var102_102);
                            var139_9 = 1652698852 ^ var139_9;
                            var55_103 = this;
                            var56_104 = var55_103.logger;
                            var103_105 = this;
                            var129_106 = License.tvbrokkrya(License.ttaegaonpgftloz(), var139_9);
                            var104_107 = var103_105.toAnsi(var129_106, 1114114791);
                            var56_104.info(var104_107);
                            var139_9 = 540621407 ^ var139_9;
                            var57_108 = this;
                            var58_109 = var57_108.logger;
                            var105_110 = this;
                            var130_111 = var2_2;
                            var131_112 = "&fPlugin: #9af5a5" + var130_111;
                            var106_113 = var105_110.toAnsi(var131_112, 1114114791);
                            var58_109.info(var106_113);
                            var139_9 = 1015976286 ^ var139_9;
                            var59_114 = this;
                            var60_115 = var59_114.logger;
                            var107_116 = this;
                            var132_117 = var3_3;
                            var133_118 = "&fCurrent version: #9af5a5" + var132_117;
                            var108_119 = var107_116.toAnsi(var133_118, 1114114791);
                            var60_115.info(var108_119);
                            var139_9 = 1959007922 ^ var139_9;
                            var61_120 = this;
                            var62_121 = var61_120.logger;
                            var109_122 = this;
                            var134_123 = var4_4;
                            var135_124 = "&fNewest version: #9af5a5" + var134_123;
                            var110_125 = var109_122.toAnsi(var135_124, 1114114791);
                            var62_121.info(var110_125);
                            var139_9 = 39203956 ^ var139_9;
                            var63_126 = this;
                            var64_127 = var63_126.logger;
                            var111_128 = this;
                            var136_129 = var5_5;
                            var137_130 = "&fDownload link: #9af5a5" + var136_129;
                            var112_131 = var111_128.toAnsi(var137_130, 1114114791);
                            var64_127.info(var112_131);
                            var139_9 = 1057431084 ^ var139_9;
lbl180:
                            // 6 sources

                            while (true) {
                                var65_132 = this;
                                var66_133 = var65_132.logger;
                                var113_134 = this;
                                var114_135 = var113_134.buildBar(1877955819);
                                var66_133.info(var114_135);
                                var139_9 = 883950387 ^ var139_9;
                                var67_136 = this;
                                var68_137 = var67_136.logger;
                                var115_138 = License.tvbrokkrya(License.zfqzchllhaebzcj(), var139_9);
                                var68_137.info(var115_138);
                                var139_9 = 812137107 ^ var139_9;
                                return;
                            }
                        }
                        break block46;
                    }
                    block34: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                            case 44435286: {
                                continue block34;
                            }
                            case 123401067: {
                                var139_9 = 1423365082 ^ var139_9;
                            }
                            case 136418950: {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var139_9) != -1737130742) {
                                    var139_9 = 904961204 ^ var139_9;
                                    throw new RuntimeException();
                                }
                                var139_9 = 1424030960 ^ var139_9;
                                ** GOTO lbl180
                            }
                        }
                        break;
                    }
                    throw new RuntimeException();
                }
                block35: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                        case 318147381: {
                            continue block35;
                        }
                        case 115182459: {
                            var139_9 = 1535782502 ^ var139_9;
                        }
                        case 1409203428: {
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var139_9) != 1961726859) ** GOTO lbl219
                            var139_9 = 1769201952 ^ var139_9;
                            ** GOTO lbl180
lbl219:
                            // 1 sources

                            block36: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                                    case 2089713809: {
                                        continue block36;
                                    }
                                    case 106030887: {
                                        var139_9 = 140738916 ^ var139_9;
                                        throw new RuntimeException();
                                    }
                                }
                                break;
                            }
                            throw new RuntimeException();
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                    break;
                }
            }
            block37: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                    case 724619980: {
                        continue block37;
                    }
                    case 193140565: {
                        var139_9 = 211569598 ^ var139_9;
                    }
                    case 292386087: {
                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var139_9) != 619688266) ** GOTO lbl240
                        var139_9 = License.eznkswutelizrsfy(var139_9, 1131652472);
                        ** GOTO lbl180
lbl240:
                        // 1 sources

                        block38: while (true) {
                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                                case 1136546067: {
                                    continue block38;
                                }
                                case 82987122: {
                                    var139_9 = 576963900 ^ var139_9;
                                    throw new RuntimeException();
                                }
                            }
                            break;
                        }
                        throw new RuntimeException();
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
                break;
            }
        }
        block39: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                case 2080999353: {
                    continue block39;
                }
                case 168105277: {
                    var139_9 = 1578526424 ^ var139_9;
                }
                case 355071180: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var139_9) == 1165071859) ** GOTO lbl261
                    var139_9 = 240124331 ^ var139_9;
                    ** GOTO lbl270
lbl261:
                    // 1 sources

                    block40: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var139_9)) {
                            case 169172128: {
                                continue block40;
                            }
                            case 193342818: {
                                ** GOTO lbl180
                            }
                            case 181529342: {
                                var139_9 = 1866490351 ^ var139_9;
                                ** continue;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
lbl270:
        // 3 sources

        throw new RuntimeException();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void logLicenseError(String var1_1, int var2_2) {
        block39: {
            block38: {
                block37: {
                    block40: {
                        var97_3 = 1429267889 ^ (1428198585 ^ 1659922855);
                        var97_3 = 1981889477 ^ var97_3;
                        var3_4 = var1_1;
                        if (var3_4 == null) break block40;
                        var97_3 = 1025211269 ^ var97_3;
                        var46_5 = var1_1;
                        var97_3 = License.eznkswutelizrsfy(var97_3, 2013608178);
                        try {
                            if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var97_3) == 245406695) throw new RuntimeException();
                            throw null;
                        }
                        catch (RuntimeException v0) {
                            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var97_3)) {
                                case -185296408: {
                                    var97_3 = 1419388679 ^ var97_3;
                                    break;
                                }
                                default: {
                                    throw new RuntimeException("Error in hash");
                                }
                                case -1896152854: {
                                    var97_3 = 467391527 ^ var97_3;
                                }
                            }
                            var97_3 = 1957522554 ^ var97_3;
                            ** GOTO lbl35
                        }
                    }
                    block30: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var97_3)) {
                            case 2141683396: {
                                continue block30;
                            }
                            case 137764956: {
                                var97_3 = 1196121726 ^ var97_3;
                            }
                            case 278094624: {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var97_3) != -1672222558) break block37;
                                var97_3 = License.eznkswutelizrsfy(var97_3, 1915748275);
                                var45_6 = this;
                                var46_5 = var45_6.getFirstLocalKey(352870250);
                                var97_3 = 520903399 ^ var97_3;
lbl35:
                                // 2 sources

                                var6_7 = var46_5;
                                var97_3 = 2081286496 ^ var97_3;
                                var7_8 = this;
                                var8_9 = var7_8.logger;
                                var4_10 = License.tvbrokkrya(License.hzlxbbkileujdfq(), var97_3);
                                var8_9.info(var4_10);
                                var97_3 = 1923841572 ^ var97_3;
                                var9_11 = this;
                                var10_12 = var9_11.logger;
                                var47_13 = this;
                                var5_14 = License.tvbrokkrya(License.bkjcutqenmugpac(), var97_3);
                                var48_15 = var47_13.toAnsi(var5_14, 1114114791);
                                var10_12.info(var48_15);
                                var97_3 = 2138010621 ^ var97_3;
                                var11_16 = this;
                                var12_17 = var11_16.logger;
                                var49_18 = this;
                                var81_19 = License.tvbrokkrya(License.brfenxlejuwbuhu(), var97_3);
                                var50_20 = var49_18.toAnsi(var81_19, 1114114791);
                                var12_17.info(var50_20);
                                var97_3 = 490429260 ^ var97_3;
                                var13_21 = this;
                                var14_22 = var13_21.logger;
                                var51_23 = this;
                                var82_24 = License.tvbrokkrya(License.okylgyengvijmzf(), var97_3);
                                var52_25 = var51_23.toAnsi(var82_24, 1114114791);
                                var14_22.info(var52_25);
                                var97_3 = 610696808 ^ var97_3;
                                var15_26 = this;
                                var16_27 = var15_26.logger;
                                var53_28 = this;
                                var83_29 = License.tvbrokkrya(License.qgatuelsfrfnjge(), var97_3);
                                var54_30 = var53_28.toAnsi(var83_29, 1114114791);
                                var16_27.info(var54_30);
                                var97_3 = 2085747665 ^ var97_3;
                                var17_31 = this;
                                var18_32 = var17_31.logger;
                                var55_33 = this;
                                var84_34 = License.tvbrokkrya(License.jwlcxhrmwkdivwx(), var97_3);
                                var56_35 = var55_33.toAnsi(var84_34, 1114114791);
                                var18_32.info(var56_35);
                                var97_3 = 1060423201 ^ var97_3;
                                var19_36 = this;
                                var20_37 = var19_36.logger;
                                var57_38 = this;
                                var85_39 = License.tvbrokkrya(License.uygrtzmlahgnvff(), var97_3);
                                var58_40 = var57_38.toAnsi(var85_39, 1114114791);
                                var20_37.info(var58_40);
                                var97_3 = 1071809996 ^ var97_3;
                                var21_41 = this;
                                var22_42 = var21_41.logger;
                                var59_43 = this;
                                var86_44 = License.tvbrokkrya(License.nrlxiaxpwzcxlya(), var97_3);
                                var60_45 = var59_43.toAnsi(var86_44, 1114114791);
                                var22_42.info(var60_45);
                                var97_3 = 1519060474 ^ var97_3;
                                var23_46 = this;
                                var24_47 = var23_46.logger;
                                var61_48 = this;
                                var87_49 = License.tvbrokkrya(License.wnlzdlvqemwexqg(), var97_3);
                                var62_50 = var61_48.toAnsi(var87_49, 1114114791);
                                var24_47.info(var62_50);
                                var97_3 = 158649715 ^ var97_3;
                                var25_51 = this;
                                var26_52 = var25_51.logger;
                                var63_53 = this;
                                var88_54 = License.tvbrokkrya(License.dtlhgbhwztyuqio(), var97_3);
                                var64_55 = var63_53.toAnsi(var88_54, 1114114791);
                                var26_52.info(var64_55);
                                var97_3 = 165269222 ^ var97_3;
                                var27_56 = this;
                                var28_57 = var27_56.logger;
                                var65_58 = this;
                                var89_59 = License.tvbrokkrya(License.apvswnqcapvjuut(), var97_3);
                                var66_60 = var65_58.toAnsi(var89_59, 1114114791);
                                var28_57.info(var66_60);
                                var97_3 = 2034865603 ^ var97_3;
                                var29_61 = this;
                                var30_62 = var29_61.logger;
                                var67_63 = this;
                                var90_64 = License.tvbrokkrya(License.xbhrlwazgwfnsfm(), var97_3);
                                var68_65 = var67_63.toAnsi(var90_64, 1114114791);
                                var30_62.info(var68_65);
                                var97_3 = 593705512 ^ var97_3;
                                var31_66 = this;
                                var32_67 = var31_66.logger;
                                var69_68 = License.tvbrokkrya(License.lcjztwybhezwdhu(), var97_3);
                                var32_67.info(var69_68);
                                var97_3 = 1249810184 ^ var97_3;
                                var33_69 = this;
                                var34_70 = var33_69.logger;
                                var70_71 = this;
                                var71_72 = var70_71.buildBar(1877955819);
                                var34_70.info(var71_72);
                                var97_3 = 1311908138 ^ var97_3;
                                var35_73 = this;
                                var36_74 = var35_73.logger;
                                var72_75 = this;
                                var91_76 = var6_7;
                                if (var91_76 != null) {
                                    var97_3 = 429077368 ^ var97_3;
                                    var92_77 = var6_7;
                                    var97_3 = License.eznkswutelizrsfy(var97_3, 1792630601);
                                    ** try [egrp 1[TRYBLOCK] [0 : 1166->1187)] { 
lbl139:
                                    // 1 sources

                                    break block30;
                                }
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var97_3 = 920838403 ^ var97_3) == -1060963807) break block38;
                                break block39;
                            }
                            default: {
                                throw new IllegalAccessException();
                            }
                        }
                        break;
                    }
                    {
                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var97_3) == 59173492) throw new RuntimeException();
                        throw null;
                    }
lbl146:
                    // 1 sources

                    catch (RuntimeException v1) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var97_3)) {
                            case -309947469: {
                                var97_3 = License.eznkswutelizrsfy(var97_3, 3630367);
                                break;
                            }
                            default: {
                                throw new IOException("Error in hash");
                            }
                            case 714157195: {
                                var97_3 = License.eznkswutelizrsfy(var97_3, 416649976);
                            }
                        }
                        var97_3 = 1981037670 ^ var97_3;
                        ** GOTO lbl178
                    }
                }
                block31: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var97_3)) {
                        case 3860056: {
                            continue block31;
                        }
                        case 31195612: {
                            var97_3 = 1413678542 ^ var97_3;
                            throw new IllegalAccessException();
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                    break;
                }
            }
            block32: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var97_3)) {
                    case 1949959827: {
                        continue block32;
                    }
                    case 212795531: {
                        var97_3 = 1164414926 ^ var97_3;
                        ** GOTO lbl-1000
                    }
                    case 1801449965: lbl-1000:
                    // 2 sources

                    {
                        var92_77 = License.tvbrokkrya(License.bbjlpvxwzdmdube(), var97_3);
                        var97_3 = 1995201413 ^ var97_3;
lbl178:
                        // 2 sources

                        var93_78 = "&fLicense: &f" + var92_77;
                        var73_79 = var72_75.toAnsi(var93_78, 1114114791);
                        var36_74.info(var73_79);
                        var97_3 = 1345580859 ^ var97_3;
                        var37_80 = this;
                        var38_81 = var37_80.logger;
                        var74_82 = this;
                        var94_83 = License.tvbrokkrya(License.celpofmkqtoddpk(), var97_3);
                        var75_84 = var74_82.toAnsi(var94_83, 1114114791);
                        var38_81.info(var75_84);
                        var97_3 = 1358356066 ^ var97_3;
                        var39_85 = this;
                        var40_86 = var39_85.logger;
                        var76_87 = this;
                        var95_88 = License.tvbrokkrya(License.igjvtykmwcsircb(), var97_3);
                        var77_89 = var76_87.toAnsi(var95_88, 1114114791);
                        var40_86.info(var77_89);
                        var97_3 = 1178448988 ^ var97_3;
                        var41_90 = this;
                        var42_91 = var41_90.logger;
                        var78_92 = this;
                        var79_93 = var78_92.buildBar(1877955819);
                        var42_91.info(var79_93);
                        var97_3 = 1428025133 ^ var97_3;
                        var43_94 = this;
                        var44_95 = var43_94.logger;
                        var80_96 = License.tvbrokkrya(License.xeijdqwqgrjsxms(), var97_3);
                        var44_95.info(var80_96);
                        var97_3 = 2081460173 ^ var97_3;
                        return;
                    }
                }
                break;
            }
        }
        block33: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var97_3)) {
                case 1197182512: {
                    continue block33;
                }
                case 212795531: {
                    var97_3 = 1070671774 ^ var97_3;
                    ** break;
                }
            }
            break;
        }
lbl216:
        // 3 sources

        throw new IllegalAccessException();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String getFirstLocalKey(int var1_1) {
        block49: {
            block51: {
                block50: {
                    var25_2 = 1654076369 ^ (1582929952 ^ 1659922855);
                    var25_2 = 946451981 ^ var25_2;
                    try {
                        block56: {
                            block52: {
                                block55: {
                                    block53: {
                                        block54: {
                                            var2_3 = this;
                                            var5_4 = var2_3.licenseConfig;
                                            if (var5_4 == null) break block52;
                                            var25_2 = 1054011464 ^ var25_2;
                                            var6_5 = this;
                                            var7_6 = var6_5.licenseConfig;
                                            var3_7 = License.tvbrokkrya(License.ltezrjvsibatavj(), var25_2);
                                            var8_8 = var7_6.contains(var3_7);
                                            if (var8_8 == (1485145107 ^ var25_2)) break block53;
                                            var25_2 = 652865820 ^ var25_2;
                                            var10_9 = this;
                                            var11_10 = var10_9.licenseConfig;
                                            var21_11 = License.tvbrokkrya(License.gqgfmxhcxckycgo(), var25_2);
                                            var4_13 = var12_12 = var11_10.getStringList(var21_11);
                                            var25_2 = 1005854123 ^ var25_2;
                                            var13_14 = var4_13;
                                            if (var13_14 == null) break block54;
                                            var25_2 = 360087952 ^ var25_2;
                                            var14_15 = var4_13;
                                            var15_16 = var14_15.isEmpty();
                                            if (var15_16 != (1357834548 ^ var25_2)) break block49;
                                            break block55;
                                        }
                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var25_2 = License.eznkswutelizrsfy(var25_2, 1410154065)) != -1934968920) {
                                            var25_2 = License.eznkswutelizrsfy(var25_2, 2141504534);
                                            throw new IllegalAccessException();
                                        }
                                        var25_2 = 61722611 ^ var25_2;
                                        break block56;
                                    }
                                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var25_2 = License.eznkswutelizrsfy(var25_2, 1037965898)) != 719123147) {
                                        var25_2 = License.eznkswutelizrsfy(var25_2, 191499450);
                                        throw new IllegalAccessException();
                                    }
                                    var25_2 = 107085625 ^ var25_2;
                                    break block50;
                                }
                                var25_2 = 250560459 ^ var25_2;
                                var17_17 = var4_13;
                                var22_18 = (byte)(1577178879 ^ var25_2);
                                var18_19 = var17_17.get(var22_18);
                                var19_20 = (String)var18_19;
                                var20_21 = var19_20.trim();
                                var25_2 = License.eznkswutelizrsfy(var25_2, 1675269789);
                                try {
                                    if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var25_2) == 131658086) throw new IllegalAccessException();
                                    throw null;
                                }
                                catch (IllegalAccessException v0) {
                                    switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var25_2)) {
                                        default: {
                                            throw new RuntimeException("Error in hash");
                                        }
                                        case 2114046066: {
                                            var25_2 = 967010266 ^ var25_2;
                                            break;
                                        }
                                        case -287702255: {
                                            var25_2 = 1270357686 ^ var25_2;
                                        }
                                    }
                                    var25_2 = 1092611834 ^ var25_2;
                                    return var20_21;
                                }
                            }
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var25_2 = License.eznkswutelizrsfy(var25_2, 1861647171)) != 1158183104) break block51;
                            var25_2 = License.eznkswutelizrsfy(var25_2, 1805348472);
                            break block50;
                        }
lbl65:
                        // 2 sources

                        while (true) {
                            var20_21 = null;
                            var25_2 = 625223976 ^ var25_2;
                            return var20_21;
                        }
                    }
                    catch (Exception v1) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var25_2)) {
                            case 750994722: {
                                var25_2 = License.eznkswutelizrsfy(var25_2, 595566930);
                                break;
                            }
                            case -267470854: {
                                var25_2 = 954605321 ^ var25_2;
                                break;
                            }
                            case -1003741030: {
                                var25_2 = 1046629861 ^ var25_2;
                                break;
                            }
                            case -211572613: {
                                var25_2 = License.eznkswutelizrsfy(var25_2, 411811065);
                                break;
                            }
                            case 851157723: {
                                var25_2 = 11582893 ^ var25_2;
                                break;
                            }
                            case -2022225502: {
                                var25_2 = 906567874 ^ var25_2;
                                break;
                            }
                            default: {
                                throw new IOException("Error in hash");
                            }
                            case -1849374672: {
                                var25_2 = 1960792304 ^ var25_2;
                            }
                        }
                        var23_23 = var16_22 = v1;
                        var25_2 = 63602709 ^ var25_2;
                        return null;
                    }
                }
                block42: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var25_2)) {
                        case 2079893422: {
                            continue block42;
                        }
                        case 4292496: {
                            var25_2 = 1793519223 ^ var25_2;
                        }
                        case 705072376: {
                            try {
                                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var25_2) == 52124896) throw new IOException();
                                throw null;
                            }
                            catch (IOException v2) {
                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var25_2)) {
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                    case 2076765377: {
                                        var25_2 = 546425675 ^ var25_2;
                                        break;
                                    }
                                    case 1323595960: {
                                        var25_2 = 104094148 ^ var25_2;
                                    }
                                }
                                var25_2 = 1791336240 ^ var25_2;
                            }
                            return null;
                        }
                    }
                    break;
                }
                throw new IllegalAccessException();
            }
            block43: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var25_2)) {
                    case 461268363: {
                        continue block43;
                    }
                    case 12060063: {
                        var25_2 = 1720753659 ^ var25_2;
                        throw new IllegalAccessException();
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
                break;
            }
        }
        block44: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var25_2)) {
                case 1670359930: {
                    continue block44;
                }
                case 214872890: {
                    var25_2 = 162149883 ^ var25_2;
                }
                case 1511752078: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var25_2) == -903420294) {
                        var25_2 = License.eznkswutelizrsfy(var25_2, 1266435529);
                        ** continue;
                    }
                    block45: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var25_2)) {
                            case 1360156032: {
                                continue block45;
                            }
                            case 217395861: {
                                var25_2 = 930434604 ^ var25_2;
                                ** break;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
lbl147:
        // 3 sources

        throw new IllegalAccessException();
    }

    /*
     * Exception decompiling
     */
    private String fetchPublicIP(int var1_1) {
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

    /*
     * Exception decompiling
     */
    private String toAnsi(String var1_1, int var2_2) {
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

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String buildBar(int n) {
        byte by;
        int n2;
        int n3;
        StringBuilder stringBuilder;
        String string;
        byte by2;
        int n4 = 0x77C43291 ^ (0x6C738BF0 ^ 0x62F069A7);
        n4 = 0x26C71D72 ^ n4;
        byte by3 = by2 = (byte)(0x5F80CD97 ^ n4);
        n4 = 0x2C9639AC ^ n4;
        String string2 = string = License.tvbrokkrya(License.jclpllgsxkokzlg(), n4);
        n4 = 0x7FBC4DFE ^ n4;
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        n4 = 0x76F59862 ^ n4;
        int n5 = n3 = (int)(0x7A5F2184 ^ n4);
        n4 = 0x4D1433B ^ n4;
        while ((n2 = n5) < (by = by3)) {
            n4 = 0x47044E64 ^ n4;
            StringBuilder stringBuilder3 = stringBuilder2;
            String string3 = string2;
            StringBuilder stringBuilder4 = stringBuilder3.append(string3);
            n4 = 0x9797CAF ^ n4;
            n5 += 0x30F35075 ^ n4;
            n4 = 0xE37E3FB ^ n4;
            try {
                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n4) == 161293601) throw new IllegalAccessException();
                throw null;
            }
            catch (IllegalAccessException illegalAccessException) {
                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n4)) {
                    default: {
                        throw new IllegalAccessException("Error in hash");
                    }
                    case -1122170448: {
                        n4 = 0x688C35E2 ^ n4;
                        break;
                    }
                    case -165307271: {
                        n4 = 0x41EB275B ^ n4;
                    }
                }
                n4 = 0x1A1F66B ^ n4;
            }
        }
        block16: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n4)) {
                case 1438551423: {
                    continue block16;
                }
                case 87269852: {
                    n4 = 0x2E55F74B ^ n4;
                }
                case 570503002: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n4) != -2032357470) break block16;
                    n4 = 0x58DB61FD ^ n4;
                    License license = this;
                    StringBuilder stringBuilder5 = stringBuilder2;
                    String string4 = stringBuilder5.toString();
                    return license.toAnsi(string4, 1114114791);
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
            break;
        }
        block17: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n4)) {
                case 719945056: {
                    continue block17;
                }
                case 212410963: {
                    n4 = 0x68CD27E4 ^ n4;
                    throw new IllegalAccessException();
                }
            }
            break;
        }
        throw new IllegalAccessException();
    }

    /*
     * Exception decompiling
     */
    public void validateLicenseAsync(Runnable var1_1) {
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

    private boolean isFolia(int n) {
        int n2 = 0x63385F ^ (0x7A8C03B6 ^ 0x62F069A7);
        n2 = 0x1C0F71B5 ^ n2;
        try {
            String string = License.tvbrokkrya(License.nfdbmilgcyiqqjd(), n2);
            Class<?> clazz = Class.forName(string);
            n2 = 0x17CBA5F8 ^ n2;
            boolean bl = (byte)(0x13DB8602 ^ n2);
            n2 = 0x5574A768 ^ n2;
            return bl;
        }
        catch (ClassNotFoundException classNotFoundException) {
            ClassNotFoundException classNotFoundException2;
            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n2)) {
                default: {
                    throw new IllegalAccessException("Error in hash");
                }
                case -1629736936: {
                    n2 = 0x3E7439CF ^ n2;
                    break;
                }
                case 545333208: {
                    n2 = 0x29BF9C37 ^ n2;
                }
            }
            ClassNotFoundException classNotFoundException3 = classNotFoundException2 = classNotFoundException;
            n2 = 0x518D0BBC ^ n2;
            boolean bl = (byte)(0x7C22B470 ^ n2);
            return bl;
        }
    }

    private static /* synthetic */ void lambda$validateLicenseAsync$3(Runnable runnable, Object object) {
        int n = 0x3305A0DF ^ (0x556F00E7 ^ 0x6D13E92B);
        n = 0x40896C03 ^ n;
        Runnable runnable2 = runnable;
        runnable2.run();
    }

    /*
     * Unable to fully structure code
     */
    private /* synthetic */ void lambda$validateLicenseAsync$2(Runnable var1_1, boolean var2_2) {
        block40: {
            var59_3 = 1630158050 ^ (822921401 ^ 1659922855);
            var59_3 = 2075339489 ^ var59_3;
            var3_4 = this;
            var8_6 = var11_5 = var3_4.validateLicense(1409035878);
            var59_3 = 1088400590 ^ var59_3;
            var12_7 = this;
            var4_8 = var8_6;
            var5_9 = var1_1;
            var9_11 = var13_10 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$validateLicenseAsync$0(boolean java.lang.Runnable ), ()V)((License)var12_7, (boolean)var4_8, (Runnable)var5_9);
            var14_12 = var2_2;
            if (var14_12 == (617168992 ^ (var59_3 = 762534835 ^ var59_3))) break block40;
            var59_3 = 874813723 ^ var59_3;
            var15_13 = this;
            var16_14 = var15_13.plugin;
            var17_15 = var16_14.getServer();
            var18_16 = var17_15.getClass();
            var31_17 = License.tvbrokkrya(License.zwbrmkwprsuybzy(), var59_3);
            var39_18 = (byte)(284023163 ^ var59_3);
            var40_19 = new Class[var39_18];
            var19_20 = var18_16.getMethod(var31_17, var40_19);
            var32_21 = this;
            var33_22 = var32_21.plugin;
            var59_3 = 424266073 ^ var59_3;
            var34_23 = var33_22.getServer();
            var41_24 = (byte)(161746978 ^ var59_3);
            var42_25 = new Object[var41_24];
            var10_27 = var20_26 = var19_20.invoke(var34_23, var42_25);
            var59_3 = 880102074 ^ var59_3;
            var21_28 = var10_27;
            var22_29 = var21_28.getClass();
            var35_30 = License.tvbrokkrya(License.cntwvuvxftousdz(), var59_3);
            var43_31 = (byte)(1037130394 ^ var59_3);
            var44_32 = new Class[var43_31];
            var6_33 = (byte)(1037130392 ^ var59_3);
            var44_32[var6_33] = var7_34 = Plugin.class;
            var48_35 = (byte)(1037130393 ^ var59_3);
            var44_32[var48_35] = var51_36 = Consumer.class;
            var23_37 = var22_29.getMethod(var35_30, var44_32);
            var36_38 = var10_27;
            var45_39 = (byte)(1037130394 ^ var59_3);
            var46_40 = new Object[var45_39];
            var49_41 = (byte)(1037130392 ^ var59_3);
            var52_42 = this;
            var53_43 = var52_42.plugin;
            var46_40[var49_41] = var53_43;
            var50_44 = (byte)(1037130393 ^ var59_3);
            var54_45 = var9_11;
            var46_40[var50_44] = var55_46 = (Consumer<Object>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$validateLicenseAsync$1(java.lang.Runnable java.lang.Object ), (Ljava/lang/Object;)V)((Runnable)var54_45);
            var59_3 = 2100142552 ^ var59_3;
            var24_47 = var23_37.invoke(var36_38, var46_40);
            var59_3 = 1286713629 ^ var59_3;
            ** GOTO lbl105
        }
        block35: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var59_3)) {
                case 1910141575: {
                    continue block35;
                }
                case 122013811: {
                    var59_3 = 547652056 ^ var59_3;
                }
                case 1077642261: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var59_3) == 594415040) ** GOTO lbl65
                    var59_3 = 1187286046 ^ var59_3;
                    ** GOTO lbl-1000
lbl65:
                    // 1 sources

                    var59_3 = 809607984 ^ var59_3;
                    break block35;
                }
                catch (Exception v0) {
                    switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var59_3)) {
                        case -2022781992: {
                            var59_3 = 2003903546 ^ var59_3;
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case -292891455: {
                            var59_3 = License.eznkswutelizrsfy(var59_3, 1515038681);
                            break;
                        }
                        case 1293975824: {
                            var59_3 = 1849224547 ^ var59_3;
                            break;
                        }
                        case 132635138: {
                            var59_3 = 660604417 ^ var59_3;
                        }
                    }
                    var56_49 = var25_48 = v0;
                    var59_3 = 1772874999 ^ var59_3;
                }
                {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var59_3)) {
                        case 615022744: {
                            continue block36;
                        }
                        case 193641575: {
                            var59_3 = 891410131 ^ var59_3;
                        }
                        case 1760838155: {
                            try {
                                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var59_3) != 41687365) {
                                    throw null;
                                }
                                throw new RuntimeException();
                            }
                            catch (RuntimeException v1) {
                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var59_3)) {
                                    case 2026561490: {
                                        var59_3 = License.eznkswutelizrsfy(var59_3, 1929257540);
                                        break;
                                    }
                                    default: {
                                        throw new IllegalAccessException("Error in hash");
                                    }
                                    case -659145943: {
                                        var59_3 = License.eznkswutelizrsfy(var59_3, 116506331);
                                    }
                                }
                                var59_3 = License.eznkswutelizrsfy(var59_3, 1984301000);
                                ** GOTO lbl140
                            }
                        }
lbl105:
                        // 1 sources

                        var59_3 = License.eznkswutelizrsfy(var59_3, 556488029);
                        try {
                            if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var59_3) != 133558646) {
                                throw null;
                            }
                            throw new IOException();
                        }
                        catch (IOException v2) {
                            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var59_3)) {
                                case -119147222: {
                                    var59_3 = License.eznkswutelizrsfy(var59_3, 1588736224);
                                    ** break;
                                }
                                default: {
                                    throw new IOException("Error in hash");
                                }
                                case 1798371329: {
                                    var59_3 = 751341893 ^ var59_3;
                                }
                            }
                        }
                        {
                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var59_3)) {
                                case 1815463153: lbl-1000:
                                // 3 sources

                                {
                                    continue block37;
                                }
                                case 26453198: {
                                    var59_3 = 1242558515 ^ var59_3;
                                    ** GOTO lbl140
                                }
                                default: {
                                    default: lbl-1000:
                                    // 3 sources

                                    {
                                        default: {
                                            throw new IOException();
                                        }
                                    }
                                }
                                case 1317077780: {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            break;
        }
        var26_50 = this;
        var27_51 = var26_50.plugin;
        var28_52 = var27_51.getServer();
        var29_53 = var28_52.getScheduler();
        var37_54 = this;
        var38_55 = var37_54.plugin;
        var47_56 = var9_11;
        var30_57 = var29_53.runTask(var38_55, var47_56);
        var59_3 = 2139954430 ^ var59_3;
lbl140:
        // 3 sources

    }

    private static /* synthetic */ void lambda$validateLicenseAsync$1(Runnable runnable, Object object) {
        int n = 0x74BEBA07 ^ (0x67DF16D7 ^ 0x6D13E92B);
        n = 0x42C2FD6A ^ n;
        Runnable runnable2 = runnable;
        runnable2.run();
    }

    /*
     * Exception decompiling
     */
    private /* synthetic */ void lambda$validateLicenseAsync$0(boolean var1_1, Runnable var2_2) {
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
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1050)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    static {
        nothing_to_see_here = new String[17];
        License.nothing_to_see_here[0] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e0\u28e4\u28f6\u28f6\u28f6\u28e4\u28c4\u28c0\u28c0\u2804\u2804\u2804\u2804\u2804";
        License.nothing_to_see_here[1] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28c0\u28e4\u28e4\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28df\u28bf\u28ff\u28ff\u28ff\u28f6\u28e4\u2840\u2804";
        License.nothing_to_see_here[2] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2880\u28fc\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u283f\u283f\u28ff\u28ff\u28e7\u2893";
        License.nothing_to_see_here[3] = "\u2804\u2804\u2804\u2804\u2804\u2860\u289b\u28ff\u28ff\u28ff\u285f\u28ff\u28ff\u28fd\u28cb\u283b\u28bb\u28ff\u28ff\u28ff\u28ff\u287b\u28e7\u2860\u28ed\u28ed\u28ff\u2867";
        License.nothing_to_see_here[4] = "\u2804\u2804\u2804\u2804\u2804\u28a0\u28ff\u285f\u28ff\u28bb\u2803\u28fb\u28e8\u28fb\u283f\u2840\u28dd\u287f\u28ff\u28ff\u28f7\u28dc\u28dc\u28bf\u28dd\u287f\u287b\u2894";
        License.nothing_to_see_here[5] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u285f\u28f7\u28bf\u2888\u28da\u28d3\u2861\u28fb\u28ff\u28f6\u28ec\u28db\u28d3\u28c9\u287b\u28bf\u28ce\u2822\u283b\u28f4\u287e\u282b";
        License.nothing_to_see_here[6] = "\u2804\u2804\u2804\u2804\u2804\u28b8\u2803\u28b9\u287c\u28b8\u28ff\u28ff\u28ff\u28e6\u28f9\u28ff\u28ff\u28ff\u283f\u283f\u283f\u2837\u28ce\u287c\u2806\u28ff\u2835\u28eb";
        License.nothing_to_see_here[7] = "\u2804\u2804\u2804\u2804\u2804\u2808\u2804\u2838\u285f\u285c\u28e9\u2844\u2804\u28ff\u28ff\u28ff\u28ff\u28f6\u2880\u2880\u28ff\u28f7\u28ff\u28ff\u2850\u2847\u2844\u28ff";
        License.nothing_to_see_here[8] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2801\u28b6\u28bb\u28e7\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28ff\u28c7\u285f\u28c7\u28f7\u28ff";
        License.nothing_to_see_here[9] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28c6\u28e4\u28fd\u28ff\u287f\u283f\u283f\u28ff\u28ff\u28e6\u28f4\u2847\u28ff\u28a8\u28fe\u28ff\u28b9\u28b8";
        License.nothing_to_see_here[10] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u28ff\u280a\u285b\u28bf\u28ff\u28ff\u28ff\u28ff\u287f\u28eb\u28b1\u28ba\u2847\u284f\u28ff\u28ff\u28f8\u287c";
        License.nothing_to_see_here[11] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28b8\u287f\u2804\u28ff\u28f7\u28fe\u284d\u28ed\u28f6\u28ff\u28ff\u284c\u28fc\u28f9\u28b1\u2839\u28ff\u28c7\u28e7";
        License.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28fc\u2801\u28e4\u28ed\u28ed\u284c\u2881\u28fc\u28ff\u28ff\u28ff\u28b9\u2847\u28ed\u28e4\u28f6\u28e4\u285d\u287c";
        License.nothing_to_see_here[13] = "\u2804\u28c0\u2824\u2840\u2804\u2804\u2804\u2804\u2804\u284f\u28c8\u287b\u287f\u2803\u2880\u28fe\u28ff\u28ff\u28ff\u287f\u287c\u2801\u28ff\u28ff\u28ff\u287f\u28b7\u28b8";
        License.nothing_to_see_here[14] = "\u28b0\u28f7\u2867\u2862\u2804\u2804\u2804\u2804\u2820\u28a0\u285b\u283f\u2804\u2820\u282c\u283f\u28ff\u282d\u282d\u28b1\u28c7\u28c0\u28ed\u2845\u2836\u28fe\u28f7\u28f6";
        License.nothing_to_see_here[15] = "\u2808\u28bf\u28ff\u28e7\u2804\u2804\u2804\u2804\u2880\u285b\u283f\u2804\u2804\u2804\u2804\u28a0\u2803\u2804\u2804\u285c\u2804\u2804\u28e4\u2880\u28f6\u28ee\u284d\u28f4";
        License.nothing_to_see_here[16] = "\u2804\u2808\u28ff\u28ff\u2840\u2804\u2804\u2804\u28a9\u28dd\u2803\u2804\u2804\u2880\u2844\u284e\u2804\u2804\u2804\u2807\u2804\u2804\u2805\u28f4\u28f6\u28f6\u2804\u28f6";
        cjacybmoak = ByteBuffer.wrap(License.kpcrnfniutoezcy()).asCharBuffer().toString();
        int n = new Random(2148771429781590322L).nextInt();
        FkaqJipaBG = 0xB3A15126 ^ n;
    }

    public static String tvbrokkrya(byte[] byArray, int n) {
        byte[] byArray2;
        int n2;
        int n3;
        int n4;
        byte[] byArray3;
        int n5;
        int n6;
        byte[] byArray4;
        int n7 = n;
        String string = Integer.toString(n7);
        byte[] byArray5 = byArray4 = string.getBytes();
        byte[] byArray6 = byArray;
        int n8 = 0;
        byte by = byArray6[n8];
        int n9 = 255;
        int n10 = by & n9;
        int n11 = 24;
        int n12 = n10 << n11;
        byte[] byArray7 = byArray;
        int n13 = 1;
        byte by2 = byArray7[n13];
        int n14 = 255;
        int n15 = by2 & n14;
        int n16 = 16;
        int n17 = n15 << n16;
        int n18 = n12 | n17;
        byte[] byArray8 = byArray;
        int n19 = 2;
        byte by3 = byArray8[n19];
        int n20 = 255;
        int n21 = by3 & n20;
        int n22 = 8;
        int n23 = n21 << n22;
        int n24 = n18 | n23;
        byte[] byArray9 = byArray;
        int n25 = 3;
        byte by4 = byArray9[n25];
        int n26 = 255;
        int n27 = by4 & n26;
        int n28 = n6 = n24 | n27;
        byte[] byArray10 = byArray;
        int n29 = 4;
        byte by5 = byArray10[n29];
        int n30 = 255;
        int n31 = by5 & n30;
        int n32 = 24;
        int n33 = n31 << n32;
        byte[] byArray11 = byArray;
        int n34 = 5;
        byte by6 = byArray11[n34];
        int n35 = 255;
        int n36 = by6 & n35;
        int n37 = 16;
        int n38 = n36 << n37;
        int n39 = n33 | n38;
        byte[] byArray12 = byArray;
        int n40 = 6;
        byte by7 = byArray12[n40];
        int n41 = 255;
        int n42 = by7 & n41;
        int n43 = 8;
        int n44 = n42 << n43;
        int n45 = n39 | n44;
        byte[] byArray13 = byArray;
        int n46 = 7;
        byte by8 = byArray13[n46];
        int n47 = 255;
        int n48 = by8 & n47;
        int n49 = n5 = n45 | n48;
        String string2 = cjacybmoak;
        int n50 = n49;
        int n51 = n49;
        int n52 = n28;
        int n53 = n51 + n52;
        String string3 = string2.substring(n50, n53);
        Charset charset = StandardCharsets.UTF_16BE;
        byte[] byArray14 = byArray3 = string3.getBytes(charset);
        int n54 = n4 = 0;
        while ((n3 = n54) < (n2 = (byArray2 = byArray14).length)) {
            byte by9;
            byte[] byArray15 = byArray14;
            int n55 = n54;
            byte by10 = byArray15[n55];
            byte[] byArray16 = byArray5;
            int n56 = n54++;
            byte[] byArray17 = byArray5;
            int n57 = byArray17.length;
            int n58 = n56 % n57;
            byte by11 = byArray16[n58];
            int n59 = by10 ^ by11;
            byArray15[n55] = by9 = (byte)n59;
        }
        byte[] byArray18 = byArray14;
        Charset charset2 = StandardCharsets.UTF_16BE;
        String string4 = new String(byArray18, charset2);
        return string4;
    }

    private static byte[] zwbrmkwprsuybzy() {
        return new byte[]{0, 0, 0, 24, 0, 0, 0, 0};
    }

    private static byte[] cntwvuvxftousdz() {
        return new byte[]{0, 0, 0, 3, 0, 0, 0, 24};
    }

    private static byte[] fuobzwzbzhmtlob() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 27};
    }

    private static byte[] eqdjfyzzlzfoxcb() {
        return new byte[]{0, 0, 0, 44, 0, 0, 0, 37};
    }

    private static byte[] ztofcyqcdcobdid() {
        return new byte[]{0, 0, 0, 21, 0, 0, 0, 81};
    }

    private static byte[] dpjnhipsvfakpnc() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, 102};
    }

    private static byte[] vqatzouojigpkfa() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, 103};
    }

    private static byte[] ejqdbdhaalbnzxu() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 107};
    }

    private static byte[] xnwdvpdiwzfsjfg() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 114};
    }

    private static byte[] jaevsljimwzdeuy() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, 119};
    }

    private static byte[] niuvrebnbmxaftm() {
        return new byte[]{0, 0, 0, 5, 0, 0, 0, 126};
    }

    private static byte[] ncbzdjpabvydbfy() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, -125};
    }

    private static byte[] rivcyiazzuclonq() {
        return new byte[]{0, 0, 0, 31, 0, 0, 0, -113};
    }

    private static byte[] wityerpdgjobujn() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, -82};
    }

    private static byte[] szuckkdaygjxemu() {
        return new byte[]{0, 0, 0, 14, 0, 0, 0, -72};
    }

    private static byte[] miydbmrsfvjuujg() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -58};
    }

    private static byte[] iqbeuvhdobtrzqb() {
        return new byte[]{0, 0, 0, 7, 0, 0, 0, -57};
    }

    private static byte[] hrnjzmtqmtnfacu() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -50};
    }

    private static byte[] shcysvcutbioaea() {
        return new byte[]{0, 0, 0, 4, 0, 0, 0, -49};
    }

    private static byte[] jvgwsqvyxaxnlfa() {
        return new byte[]{0, 0, 0, 48, 0, 0, 0, -45};
    }

    private static byte[] aloialriewdfphu() {
        return new byte[]{0, 0, 0, 48, 0, 0, 1, 3};
    }

    private static byte[] foxbzebjbmscoqp() {
        return new byte[]{0, 0, 0, 48, 0, 0, 1, 51};
    }

    private static byte[] djdwgpkipewjgsq() {
        return new byte[]{0, 0, 0, 1, 0, 0, 1, 99};
    }

    private static byte[] ypswfjdmpgkoity() {
        return new byte[]{0, 0, 0, 48, 0, 0, 1, 100};
    }

    private static byte[] iqixqhcbfugdech() {
        return new byte[]{0, 0, 0, 48, 0, 0, 1, -108};
    }

    private static byte[] ttaegaonpgftloz() {
        return new byte[]{0, 0, 0, 26, 0, 0, 1, -60};
    }

    private static byte[] wpllqtsyxjsthfp() {
        return new byte[]{0, 0, 0, 48, 0, 0, 1, -34};
    }

    private static byte[] zfqzchllhaebzcj() {
        return new byte[]{0, 0, 0, 0, 0, 0, 2, 14};
    }

    private static byte[] zzfxsootvwjsdnv() {
        return new byte[]{0, 0, 0, 48, 0, 0, 2, 14};
    }

    private static byte[] gzdgeyahuqjtkss() {
        return new byte[]{0, 0, 0, 0, 0, 0, 2, 62};
    }

    private static byte[] xtkilfypfeyxlzd() {
        return new byte[]{0, 0, 0, 48, 0, 0, 2, 62};
    }

    private static byte[] bqezsffrrjxdhkr() {
        return new byte[]{0, 0, 0, 48, 0, 0, 2, 110};
    }

    private static byte[] xnhwumiyatdathm() {
        return new byte[]{0, 0, 0, 27, 0, 0, 2, -98};
    }

    private static byte[] rzqjfxyckerjbul() {
        return new byte[]{0, 0, 0, 48, 0, 0, 2, -71};
    }

    private static byte[] syznnfgchhklhjo() {
        return new byte[]{0, 0, 0, 48, 0, 0, 2, -23};
    }

    private static byte[] agtqxgtwyjihehg() {
        return new byte[]{0, 0, 0, 0, 0, 0, 3, 25};
    }

    private static byte[] bkjcutqenmugpac() {
        return new byte[]{0, 0, 0, 48, 0, 0, 3, 25};
    }

    private static byte[] igjvtykmwcsircb() {
        return new byte[]{0, 0, 0, 31, 0, 0, 3, 73};
    }

    private static byte[] hzlxbbkileujdfq() {
        return new byte[]{0, 0, 0, 0, 0, 0, 3, 104};
    }

    private static byte[] okylgyengvijmzf() {
        return new byte[]{0, 0, 0, 48, 0, 0, 3, 104};
    }

    private static byte[] bbjlpvxwzdmdube() {
        return new byte[]{0, 0, 0, 14, 0, 0, 3, -104};
    }

    private static byte[] celpofmkqtoddpk() {
        return new byte[]{0, 0, 0, 28, 0, 0, 3, -90};
    }

    private static byte[] dtlhgbhwztyuqio() {
        return new byte[]{0, 0, 0, 48, 0, 0, 3, -62};
    }

    private static byte[] brfenxlejuwbuhu() {
        return new byte[]{0, 0, 0, 48, 0, 0, 3, -14};
    }

    private static byte[] qgatuelsfrfnjge() {
        return new byte[]{0, 0, 0, 48, 0, 0, 4, 34};
    }

    private static byte[] xeijdqwqgrjsxms() {
        return new byte[]{0, 0, 0, 0, 0, 0, 4, 82};
    }

    private static byte[] jwlcxhrmwkdivwx() {
        return new byte[]{0, 0, 0, 48, 0, 0, 4, 82};
    }

    private static byte[] nrlxiaxpwzcxlya() {
        return new byte[]{0, 0, 0, 48, 0, 0, 4, -126};
    }

    private static byte[] wnlzdlvqemwexqg() {
        return new byte[]{0, 0, 0, 48, 0, 0, 4, -78};
    }

    private static byte[] xbhrlwazgwfnsfm() {
        return new byte[]{0, 0, 0, 48, 0, 0, 4, -30};
    }

    private static byte[] uygrtzmlahgnvff() {
        return new byte[]{0, 0, 0, 48, 0, 0, 5, 18};
    }

    private static byte[] apvswnqcapvjuut() {
        return new byte[]{0, 0, 0, 48, 0, 0, 5, 66};
    }

    private static byte[] lcjztwybhezwdhu() {
        return new byte[]{0, 0, 0, 1, 0, 0, 5, 114};
    }

    private static byte[] ltezrjvsibatavj() {
        return new byte[]{0, 0, 0, 8, 0, 0, 5, 115};
    }

    private static byte[] gqgfmxhcxckycgo() {
        return new byte[]{0, 0, 0, 8, 0, 0, 5, 123};
    }

    private static byte[] awdsybzfbakzswe() {
        return new byte[]{0, 0, 0, 21, 0, 0, 5, -125};
    }

    private static byte[] firtnicagghztsm() {
        return new byte[]{0, 0, 0, 3, 0, 0, 5, -104};
    }

    private static byte[] qjujeiqpymjabsm() {
        return new byte[]{0, 0, 0, 4, 0, 0, 5, -101};
    }

    private static byte[] gjvbwysktnoqnin() {
        return new byte[]{0, 0, 0, 8, 0, 0, 5, -97};
    }

    private static byte[] hyirvzodyfisnzz() {
        return new byte[]{0, 0, 0, 0, 0, 0, 5, -89};
    }

    private static byte[] pqeagzuubcqspmj() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -89};
    }

    private static byte[] iseytrdhtznerbh() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -87};
    }

    private static byte[] fmfvndbxjkxnarm() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -82};
    }

    private static byte[] ypabrhhmjpdccaf() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -80};
    }

    private static byte[] bteqxkbdnxhvucn() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -75};
    }

    private static byte[] svkrjxjpfupkxub() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -73};
    }

    private static byte[] pulcozekwhusgjc() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -68};
    }

    private static byte[] fclfizpempauhgj() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -66};
    }

    private static byte[] atlpotkvusrphgz() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -61};
    }

    private static byte[] ecaidwzommympma() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -59};
    }

    private static byte[] iviherqocgfsdyi() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -54};
    }

    private static byte[] pyaxbxmzacuvlwv() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -52};
    }

    private static byte[] copdrhmvlicwdfx() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -47};
    }

    private static byte[] skvrhxgefdlbyxr() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -45};
    }

    private static byte[] dtksrlvfmmscyxh() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -40};
    }

    private static byte[] iqiwnvfpeeaaocs() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -38};
    }

    private static byte[] loogwfotckileza() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -33};
    }

    private static byte[] varymtdsqdjjmnj() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -31};
    }

    private static byte[] rbxcbdyrcxsbqhb() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -26};
    }

    private static byte[] ulnqkzzavdylowf() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -24};
    }

    private static byte[] wtahkuukcwlfszl() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -19};
    }

    private static byte[] ckwqvdecinzqzeq() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -17};
    }

    private static byte[] ywanzalkjcrmqbe() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -12};
    }

    private static byte[] oolhyluskmunxre() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -10};
    }

    private static byte[] rlfmsfpbpzyxlwd() {
        return new byte[]{0, 0, 0, 2, 0, 0, 5, -5};
    }

    private static byte[] rwqycozgkzqiqih() {
        return new byte[]{0, 0, 0, 5, 0, 0, 5, -3};
    }

    private static byte[] aqglgkzwkgtcpmw() {
        return new byte[]{0, 0, 0, 2, 0, 0, 6, 2};
    }

    private static byte[] iiffkkkialwgpch() {
        return new byte[]{0, 0, 0, 5, 0, 0, 6, 4};
    }

    private static byte[] egbfgnqdlmeerlm() {
        return new byte[]{0, 0, 0, 2, 0, 0, 6, 9};
    }

    private static byte[] qmmaggimbrviaqj() {
        return new byte[]{0, 0, 0, 5, 0, 0, 6, 11};
    }

    private static byte[] lquwvgoyronjcgi() {
        return new byte[]{0, 0, 0, 2, 0, 0, 6, 16};
    }

    private static byte[] wnfkgdaxpnecfky() {
        return new byte[]{0, 0, 0, 5, 0, 0, 6, 18};
    }

    private static byte[] lqgkzwxxuiqzisy() {
        return new byte[]{0, 0, 0, 2, 0, 0, 6, 23};
    }

    private static byte[] niyeiilgyocjkai() {
        return new byte[]{0, 0, 0, 4, 0, 0, 6, 25};
    }

    private static byte[] wetefcvnkeckzjn() {
        return new byte[]{0, 0, 0, 2, 0, 0, 6, 29};
    }

    private static byte[] qwxxbcrpbzfjsqg() {
        return new byte[]{0, 0, 0, 4, 0, 0, 6, 31};
    }

    private static byte[] lgvxodmgarsrjbj() {
        return new byte[]{0, 0, 0, 2, 0, 0, 6, 35};
    }

    private static byte[] swsmexqdjtgmfeo() {
        return new byte[]{0, 0, 0, 36, 0, 0, 6, 37};
    }

    private static byte[] jclpllgsxkokzlg() {
        return new byte[]{0, 0, 0, 3, 0, 0, 6, 73};
    }

    private static byte[] sjzaeapgiaolpcu() {
        return new byte[]{0, 0, 0, 17, 0, 0, 6, 76};
    }

    private static byte[] looasuqalimaeqx() {
        return new byte[]{0, 0, 0, 6, 0, 0, 6, 93};
    }

    private static byte[] nfdbmilgcyiqqjd() {
        return new byte[]{0, 0, 0, 49, 0, 0, 6, 99};
    }

    /*
     * Opcode count of 13476 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private static byte[] kpcrnfniutoezcy() {
        return new byte[]{50, 95, 52, 85, 50, 71, 49, 113, 51, 94, 56, 91, 48, 80, 51, 80, 54, 95, 50, 106, 52, 85, 50, 84, 49, 95, 51, 93, 56, 90, 48, 97, 51, 82, 54, 91, 50, 93, 52, 84, 50, 70, 49, 90, 51, 87, 56, 70, 49, 66, 51, 66, 49, 93, 49, 93, 52, 92, 53, 87, 48, 92, 52, 95, 49, 66, 52, 80, 53, 71, 48, 3, 52, 59, 51, 23, 51, 22, 48, 127, 57, 92, 56, 71, 52, 19, 54, 69, 56, 75, 57, 24, 51, 120, 51, 95, 48, 91, 57, 92, 56, 93, 52, 64, 54, 85, 56, 25, 57, 80, 51, 81, 51, 68, 48, 93, 57, 25, 56, 87, 52, 90, 54, 67, 56, 90, 57, 87, 51, 70, 51, 82, 48, 22, 57, 94, 56, 84, 52, 28, 54, 99, 56, 64, 57, 115, 51, 121, 51, 111, 48, 124, 57, 108, 56, 6, 52, 65, 54, 125, 56, 51, 50, 16, 52, 16, 54, 21, 51, 24, 53, 22, 50, 125, 52, 125, 54, 114, 51, 96, 53, 25, 50, 99, 52, 96, 54, 125, 51, 0, 53, 25, 50, 106, 52, 98, 54, 108, 51, 98, 53, 22, 50, 58, 56, 18, 49, 101, 52, 122, 57, 99, 53, 108, 49, 65, 56, 86, 52, 92, 53, 87, 54, 89, 49, 67, 56, 86, 49, 65, 52, 82, 50, 90, 48, 91, 57, 80, 54, 97, 48, 91, 55, 92, 51, 91, 55, 89, 52, 71, 53, 89, 55, 100, 51, 98, 53, 112, 55, 29, 55, 15, 49, 115, 56, 94, 55, 91, 50, 69, 50, 85, 49, 94, 56, 69, 55, 24, 50, 101, 50, 73, 49, 64, 56, 84, 49, 81, 56, 65, 55, 69, 50, 93, 50, 89, 49, 83, 56, 80, 55, 65, 50, 88, 50, 95, 49, 94, 56, 30, 55, 95, 50, 66, 50, 95, 49, 94, 56, 10, 55, 21, 50, 82, 50, 88, 49, 81, 56, 67, 55, 70, 50, 84, 50, 68, 49, 13, 56, 100, 55, 97, 50, 119, 50, 29, 49, 8, 49, 108, 57, 65, 51, 83, 54, 69, 56, 31, 49, 120, 57, 85, 51, 83, 54, 89, 56, 70, 49, 126, 57, 87, 51, 68, 54, 95, 56, 83, 49, 75, 57, 70, 51, 101, 54, 67, 56, 71, 49, 93, 57, 91, 51, 89, 54, 68, 49, 8, 56, 89, 51, 91, 56, 67, 49, 80, 57, 84, 48, 90, 53, 92, 56, 15, 49, 90, 57, 93, 50, 88, 52, 86, 49, 26, 49, 13, 51, 89, 54, 86, 52, 4, 57, 80, 52, 6, 56, 22, 48, 72, 49, 25, 49, 28, 51, 103, 54, 111, 52, 110, 57, 17, 52, 79, 56, 22, 48, 72, 49, 102, 49, 20, 51, 103, 54, 16, 52, 17, 57, 17, 52, 108, 56, 22, 48, 20, 49, 102, 49, 107, 51, 68, 54, 16, 52, 77, 57, 110, 52, 19, 56, 22, 48, 107, 49, 102, 49, 107, 51, 24, 54, 16, 52, 110, 57, 110, 52, 108, 56, 22, 48, 20, 49, 25, 49, 20, 51, 24, 49, 19, 57, 9, 55, 84, 57, 84, 55, 4, 48, 88, 48, 2, 53, 25, 50, 23, 49, 111, 57, 111, 55, 106, 57, 109, 55, 24, 48, 25, 48, 75, 53, 25, 50, 75, 49, 111, 57, 76, 55, 21, 57, 78, 55, 110, 48, 69, 48, 23, 53, 69, 50, 23, 49, 24, 57, 111, 55, 73, 57, 18, 55, 77, 48, 25, 48, 75, 53, 25, 50, 31, 49, 111, 57, 25, 55, 21, 57, 110, 55, 110, 48, 102, 48, 23, 53, 101, 50, 23, 49, 16, 57, 16, 55, 21, 53, 27, 55, 15, 51, 88, 48, 87, 48, 0, 56, 86, 54, 6, 57, 16, 49, 16, 53, 100, 55, 105, 51, 102, 48, 110, 48, 106, 56, 104, 54, 79, 57, 108, 49, 111, 53, 103, 55, 105, 51, 69, 48, 110, 48, 73, 56, 23, 54, 19, 57, 76, 49, 111, 53, 68, 55, 22, 51, 69, 48, 110, 48, 73, 56, 107, 54, 108, 57, 111, 49, 28, 53, 103, 55, 74, 51, 102, 48, 77, 48, 21, 56, 23, 54, 19, 57, 108, 49, 111, 53, 103, 55, 74, 51, 25, 52, 25, 50, 17, 48, 15, 50, 85, 50, 83, 54, 7, 50, 81, 54, 7, 52, 18, 53, 22, 50, 29, 48, 22, 50, 107, 50, 106, 54, 109, 50, 111, 54, 78, 52, 18, 53, 22, 50, 18, 48, 22, 50, 20, 50, 21, 54, 18, 50, 16, 54, 18, 52, 78, 53, 22, 50, 78, 48, 22, 50, 20, 50, 21, 54, 18, 50, 16, 54, 18, 52, 18, 53, 22, 50, 18, 48, 22, 50, 20, 50, 21, 54, 18, 50, 16, 54, 78, 52, 18, 53, 74, 50, 18, 48, 22, 50, 20, 56, 23, 54, 15, 57, 80, 57, 84, 56, 1, 54, 87, 57, 4, 57, 18, 56, 72, 54, 105, 57, 110, 57, 109, 56, 107, 54, 105, 57, 30, 57, 18, 56, 104, 54, 105, 57, 110, 57, 78, 56, 104, 54, 105, 57, 110, 57, 30, 56, 107, 54, 74, 57, 109, 57, 109, 56, 107, 54, 26, 57, 110, 57, 78, 56, 107, 54, 74, 57, 109, 57, 109, 56, 107, 54, 105, 57, 30, 57, 78, 56, 107, 54, 105, 57, 110, 57, 29, 56, 20, 54, 22, 57, 17, 57, 18, 49, 16, 56, 0, 49, 84, 49, 82, 49, 13, 49, 82, 56, 12, 49, 19, 49, 88, 49, 109, 49, 67, 56, 93, 49, 84, 49, 64, 49, 93, 49, 19, 56, 120, 49, 67, 49, 85, 49, 81, 49, 95, 56, 88, 49, 87, 49, 88, 49, 93, 49, 18, 50, 19, 56, 15, 56, 87, 54, 94, 52, 2, 50, 81, 56, 3, 56, 22, 54, 68, 52, 23, 50, 76, 56, 105, 56, 105, 54, 68, 52, 23, 50, 76, 56, 22, 56, 22, 54, 103, 52, 104, 50, 31, 56, 22, 56, 74, 54, 24, 52, 23, 50, 76, 56, 22, 56, 74, 54, 24, 52, 75, 50, 16, 56, 74, 56, 22, 54, 16, 52, 104, 50, 76, 56, 22, 56, 74, 54, 24, 52, 75, 50, 16, 56, 22, 56, 74, 54, 24, 52, 75, 50, 111, 56, 22, 56, 22, 52, 17, 54, 11, 55, 88, 55, 83, 57, 1, 50, 87, 50, 2, 57, 23, 53, 25, 52, 110, 54, 109, 55, 102, 55, 106, 57, 20, 50, 106, 50, 75, 57, 23, 53, 102, 52, 109, 54, 78, 55, 25, 55, 73, 57, 20, 50, 74, 50, 23, 57, 75, 53, 22, 52, 18, 54, 109, 55, 89, 55, 21, 57, 72, 50, 22, 50, 75, 57, 24, 53, 25, 52, 109, 54, 18, 55, 101, 55, 26, 57, 20, 50, 105, 50, 104, 57, 75, 53, 25, 52, 18, 54, 18, 55, 25, 49, 27, 57, 9, 50, 87, 50, 81, 54, 1, 49, 89, 57, 5, 50, 22, 50, 23, 54, 27, 49, 24, 57, 111, 50, 105, 50, 104, 54, 107, 49, 68, 57, 16, 50, 74, 50, 23, 54, 20, 49, 24, 57, 16, 50, 22, 50, 23, 54, 20, 49, 24, 57, 16, 50, 22, 50, 23, 54, 72, 49, 24, 57, 24, 50, 105, 50, 30, 54, 20, 49, 24, 57, 16, 50, 22, 50, 23, 54, 20, 49, 24, 57, 16, 50, 22, 50, 23, 54, 20, 49, 24, 57, 16, 50, 22, 53, 16, 52, 8, 52, 85, 53, 95, 52, 0, 51, 85, 49, 1, 52, 21, 57, 72, 53, 19, 52, 77, 52, 20, 53, 25, 52, 106, 51, 107, 49, 20, 52, 21, 57, 107, 53, 108, 52, 110, 52, 20, 53, 102, 52, 21, 51, 107, 49, 107, 52, 73, 57, 20, 53, 79, 52, 110, 52, 107, 53, 25, 52, 21, 51, 20, 49, 107, 52, 106, 57, 20, 53, 108, 52, 17, 52, 107, 53, 25, 52, 106, 51, 107, 49, 72, 52, 21, 57, 72, 53, 108, 52, 17, 52, 20, 53, 30, 50, 85, 57, 100, 50, 65, 57, 84, 56, 70, 51, 76, 55, 65, 53, 3, 53, 24, 50, 16, 57, 5, 50, 7, 57, 83, 56, 84, 51, 9, 55, 2, 53, 31, 53, 84, 50, 101, 57, 86, 50, 89, 57, 92, 56, 86, 51, 25, 55, 18, 53, 25, 49, 21, 57, 8, 55, 82, 49, 83, 50, 4, 49, 87, 57, 4, 55, 19, 49, 21, 50, 17, 49, 105, 57, 110, 55, 108, 49, 106, 50, 110, 49, 22, 57, 17, 55, 19, 49, 21, 50, 17, 49, 22, 57, 17, 55, 19, 49, 21, 50, 17, 49, 22, 57, 110, 55, 19, 49, 21, 50, 17, 49, 22, 57, 17, 55, 19, 49, 21, 50, 17, 49, 22, 57, 17, 55, 19, 49, 21, 50, 17, 49, 22, 57, 17, 55, 19, 49, 106, 50, 17, 49, 22, 57, 17, 55, 19, 50, 20, 48, 9, 55, 81, 53, 95, 49, 7, 55, 81, 48, 2, 48, 21, 57, 77, 50, 23, 48, 76, 55, 16, 53, 69, 49, 109, 55, 16, 48, 75, 48, 26, 57, 17, 50, 104, 48, 16, 55, 108, 53, 25, 49, 21, 55, 111, 48, 104, 48, 73, 57, 17, 50, 16, 48, 111, 55, 16, 53, 101, 49, 18, 55, 31, 48, 23, 48, 106, 57, 81, 50, 23, 48, 76, 55, 16, 53, 30, 49, 109, 55, 111, 48, 75, 48, 21, 57, 110, 50, 104, 48, 76, 55, 16, 56, 19, 54, 10, 48, 88, 54, 85, 54, 13, 48, 87, 51, 5, 57, 22, 51, 22, 56, 16, 54, 108, 48, 102, 54, 108, 54, 103, 48, 105, 51, 16, 57, 22, 51, 22, 56, 16, 54, 19, 48, 25, 54, 19, 54, 24, 48, 22, 51, 16, 57, 22, 51, 105, 56, 16, 54, 19, 48, 25, 54, 19, 54, 24, 48, 22, 51, 16, 57, 22, 51, 22, 56, 16, 54, 19, 48, 25, 54, 19, 54, 24, 48, 22, 51, 16, 57, 105, 51, 22, 56, 16, 54, 19, 48, 25, 49, 26, 48, 84, 51, 85, 49, 7, 52, 1, 57, 0, 50, 3, 51, 23, 55, 88, 49, 93, 48, 91, 51, 64, 49, 84, 52, 94, 57, 66, 50, 87, 51, 31, 55, 83, 49, 94, 48, 29, 51, 96, 49, 78, 52, 122, 57, 125, 50, 106, 51, 117, 55, 97, 49, 12, 48, 64, 51, 126, 49, 23, 49, 16, 56, 8, 55, 83, 50, 86, 51, 2, 49, 82, 56, 4, 55, 18, 50, 76, 51, 23, 49, 79, 56, 17, 55, 18, 50, 111, 51, 104, 49, 19, 56, 17, 55, 109, 50, 111, 51, 104, 49, 19, 56, 110, 55, 18, 50, 111, 51, 104, 49, 79, 56, 17, 55, 78, 50, 111, 51, 104, 49, 19, 56, 17, 55, 18, 50, 111, 51, 104, 49, 19, 56, 110, 55, 18, 50, 111, 51, 23, 49, 108, 56, 110, 55, 78, 50, 16, 51, 75, 49, 108, 56, 17, 55, 18, 50, 20, 48, 89, 53, 91, 56, 87, 53, 93, 50, 95, 48, 70, 53, 87, 56, 25, 53, 80, 50, 84, 48, 71, 53, 87, 56, 17, 49, 19, 51, 81, 50, 96, 56, 68, 54, 89, 49, 65, 51, 66, 50, 64, 56, 10, 54, 24, 49, 22, 51, 81, 50, 85, 56, 0, 54, 8, 49, 5, 51, 7, 50, 21, 56, 92, 54, 113, 49, 123, 51, 97, 50, 114, 56, 124, 54, 113, 49, 113, 51, 23, 50, 19, 49, 23, 57, 14, 55, 83, 49, 87, 57, 7, 49, 85, 57, 2, 55, 18, 49, 17, 57, 110, 49, 107, 57, 104, 55, 109, 49, 17, 57, 110, 49, 72, 57, 23, 55, 109, 49, 110, 57, 78, 49, 20, 57, 75, 55, 18, 49, 77, 57, 18, 49, 72, 57, 24, 55, 18, 49, 110, 57, 82, 49, 20, 57, 75, 55, 18, 49, 77, 57, 29, 49, 20, 57, 104, 55, 18, 49, 109, 57, 29, 49, 20, 57, 104, 55, 109, 49, 77, 57, 18, 49, 20, 57, 23, 55, 18, 49, 16, 51, 8, 55, 81, 55, 87, 50, 12, 49, 82, 51, 4, 55, 16, 55, 17, 50, 22, 49, 19, 51, 110, 55, 111, 55, 110, 50, 102, 49, 79, 51, 17, 55, 16, 55, 17, 50, 25, 49, 19, 51, 17, 55, 16, 55, 17, 50, 25, 49, 79, 51, 17, 55, 76, 55, 17, 50, 25, 49, 19, 51, 17, 55, 16, 55, 17, 50, 25, 49, 19, 51, 17, 55, 16, 55, 17, 50, 25, 49, 19, 51, 17, 55, 76, 55, 17, 50, 69, 49, 19, 51, 17, 55, 16, 49, 26, 56, 10, 55, 80, 53, 94, 48, 0, 49, 88, 56, 6, 55, 17, 53, 68, 48, 21, 49, 69, 56, 19, 55, 77, 53, 103, 48, 21, 49, 69, 56, 28, 55, 17, 53, 103, 48, 21, 49, 101, 56, 19, 55, 22, 53, 103, 48, 106, 49, 69, 56, 19, 55, 22, 53, 103, 48, 21, 49, 101, 56, 19, 55, 30, 53, 24, 48, 106, 49, 89, 56, 19, 55, 77, 53, 24, 48, 18, 49, 102, 56, 108, 55, 77, 53, 24, 48, 106, 49, 102, 56, 79, 55, 17, 49, 20, 52, 0, 48, 86, 57, 87, 54, 4, 55, 85, 57, 5, 55, 25, 49, 74, 49, 23, 52, 69, 48, 104, 57, 110, 54, 77, 55, 20, 57, 76, 55, 25, 49, 22, 49, 104, 52, 102, 48, 24, 57, 17, 54, 77, 55, 20, 57, 16, 55, 69, 49, 22, 49, 75, 52, 25, 48, 75, 57, 17, 54, 77, 55, 20, 57, 24, 55, 102, 49, 74, 49, 23, 52, 69, 48, 23, 57, 77, 54, 17, 55, 20, 57, 76, 55, 25, 49, 74, 49, 104, 52, 25, 48, 23, 49, 27, 48, 9, 48, 82, 50, 95, 55, 4, 56, 81, 48, 5, 51, 18, 57, 23, 49, 23, 48, 16, 48, 108, 50, 102, 55, 110, 56, 111, 48, 76, 51, 18, 57, 75, 49, 24, 48, 16, 48, 19, 50, 25, 55, 17, 56, 16, 48, 16, 51, 18, 57, 23, 49, 24, 48, 16, 48, 79, 50, 25, 55, 25, 56, 111, 48, 25, 51, 18, 57, 23, 49, 24, 48, 16, 48, 19, 50, 25, 55, 17, 56, 16, 48, 16, 51, 18, 57, 23, 49, 24, 48, 16, 48, 19, 49, 16, 52, 12, 52, 82, 48, 83, 53, 0, 49, 82, 52, 0, 52, 19, 48, 73, 53, 21, 49, 27, 52, 106, 52, 108, 48, 106, 53, 21, 49, 79, 52, 21, 52, 79, 48, 106, 53, 21, 49, 108, 52, 21, 52, 19, 48, 21, 53, 106, 49, 19, 52, 21, 52, 108, 48, 106, 53, 73, 49, 19, 52, 73, 52, 108, 48, 21, 53, 21, 49, 108, 52, 106, 52, 108, 48, 21, 53, 21, 49, 108, 52, 106, 52, 108, 48, 21, 53, 21, 49, 19, 52, 21, 52, 19, 55, 19, 49, 1, 51, 86, 57, 86, 49, 2, 48, 80, 56, 6, 55, 25, 48, 77, 55, 111, 49, 103, 51, 104, 57, 111, 49, 104, 48, 30, 56, 19, 55, 101, 48, 110, 55, 111, 49, 68, 51, 107, 57, 111, 49, 104, 48, 29, 56, 108, 55, 69, 48, 109, 55, 111, 49, 103, 51, 27, 57, 111, 49, 75, 48, 110, 56, 79, 55, 101, 48, 110, 55, 111, 49, 103, 51, 24, 57, 76, 49, 104, 48, 110, 56, 108, 55, 22, 48, 17, 55, 16, 49, 24, 51, 23, 56, 26, 52, 0, 54, 89, 56, 81, 55, 13, 57, 85, 57, 3, 56, 24, 55, 23, 56, 101, 52, 102, 54, 103, 56, 104, 55, 103, 57, 107, 57, 74, 56, 100, 55, 104, 56, 102, 52, 102, 54, 68, 56, 104, 55, 68, 57, 20, 57, 22, 56, 68, 55, 104, 56, 69, 52, 25, 54, 68, 56, 104, 55, 68, 57, 104, 57, 105, 56, 103, 55, 27, 56, 102, 52, 69, 54, 103, 56, 75, 55, 24, 57, 20, 57, 22, 56, 100, 55, 104, 56, 102, 52, 69, 54, 24, 49, 16, 53, 11, 52, 85, 51, 81, 57, 5, 49, 82, 53, 7, 52, 20, 51, 23, 57, 111, 49, 108, 53, 109, 52, 107, 51, 30, 57, 16, 49, 79, 53, 18, 52, 72, 51, 104, 57, 76, 49, 19, 53, 78, 52, 107, 51, 75, 57, 16, 49, 79, 53, 18, 52, 28, 51, 104, 57, 76, 49, 19, 53, 78, 52, 20, 51, 75, 57, 16, 49, 27, 53, 109, 52, 29, 51, 23, 57, 108, 49, 108, 53, 109, 52, 20, 51, 107, 57, 16, 49, 19, 53, 18, 52, 20, 49, 23, 49, 88, 56, 92, 49, 87, 53, 84, 48, 89, 49, 71, 56, 80, 49, 71, 50, 93, 50, 88, 48, 80, 55, 85, 55, 95, 50, 66, 50, 84, 48, 64, 49, 92, 53, 68, 53, 67, 49, 65, 53, 71, 49, 14, 53, 31, 53, 24, 49, 80, 53, 68, 49, 93, 53, 30, 53, 94, 49, 65, 53, 93, 49, 82, 53, 73, 53, 25, 49, 94, 53, 70, 49, 83, 53, 126, 55, 119, 54, 101, 50, 34, 50, 109, 48, 2, 49, 92, 56, 23, 55, 27, 50, 111, 57, 116, 57, 21, 49, 109, 51, 111, 52, 16, 49, 22, 56, 6, 49, 43, 56, 109, 48, 6, 52, 0, 55, 92, 49, 22, 56, 7, 49, 43, 56, 109, 48, 6, 52, 4, 55, 92, 49, 22, 56, 4, 49, 43, 56, 109, 48, 6, 52, 2, 55, 92, 49, 22, 56, 5, 49, 43, 56, 109, 48, 6, 52, 6, 55, 92, 49, 22, 56, 2, 49, 43, 56, 109, 48, 6, 52, 1, 55, 92, 49, 22, 56, 3, 49, 43, 56, 109, 48, 6, 52, 5, 55, 92, 49, 22, 56, 0, 49, 43, 56, 109, 48, 6, 52, 3, 55, 92, 49, 22, 56, 1, 49, 43, 56, 109, 48, 6, 52, 7, 55, 92, 49, 22, 56, 14, 49, 43, 56, 109, 48, 12, 52, 0, 55, 92, 49, 22, 56, 15, 49, 43, 56, 109, 48, 12, 52, 4, 55, 92, 49, 22, 56, 87, 49, 43, 56, 109, 48, 12, 52, 2, 55, 92, 49, 22, 56, 84, 49, 43, 56, 109, 48, 12, 52, 6, 55, 92, 49, 22, 56, 85, 49, 43, 56, 109, 48, 12, 52, 1, 55, 92, 49, 22, 56, 82, 49, 43, 56, 109, 48, 12, 52, 5, 55, 92, 49, 22, 56, 83, 49, 43, 56, 109, 48, 12, 52, 3, 55, 92, 49, 22, 56, 80, 49, 43, 56, 109, 48, 12, 52, 7, 55, 92, 49, 30, 55, 92, 49, 35, 55, 106, 50, 10, 52, 92, 49, 23, 53, 66, 49, 45, 57, 108, 52, 3, 49, 85, 52, 23, 48, 93, 53, 17, 56, 26, 51, 31, 50, 106, 50, 116, 55, 21, 57, 117, 55, 83, 49, 31, 53, 81, 56, 9, 51, 26, 50, 8, 50, 104, 55, 67, 57, 5, 55, 79, 49, 27, 53, 75, 56, 26, 51, 31, 50, 106, 50, 116, 55, 21, 57, 117, 55, 83, 49, 31, 53, 81, 56, 9, 51, 26, 50, 8, 50, 104, 55, 67, 57, 5, 55, 79, 49, 27, 49, 31, 51, 93, 56, 24, 50, 84, 53, 81, 57, 64, 48, 116, 50, 65, 51, 76, 52, 87, 52, 83, 53, 97, 50, 80, 53, 92, 57, 81, 48, 81, 50, 71, 51, 89, 52, 92, 52, 66, 53, 64, 54, 69, 56, 86, 52, 120, 56, 90, 50, 65, 54, 81, 49, 89, 54, 24, 53, 65, 54, 89, 49, 70, 54, 83, 53, 67, 54, 85, 49, 85, 54, 24, 53, 65, 54, 89, 49, 70, 54, 83, 53, 67, 54, 22, 49, 66, 54, 94, 53, 67, 54, 93, 49, 87, 54, 82, 53, 84, 54, 92, 49, 68, 54, 83, 53, 86, 54, 81, 49, 89, 54, 88, 53, 66, 54, 22, 49, 100, 54, 83, 53, 86, 54, 81, 49, 89, 54, 88, 53, 88, 54, 66, 49, 83, 54, 82, 53, 98, 54, 93, 49, 68, 54, 64, 53, 84, 54, 74};
    }

    private static int eznkswutelizrsfy(int n, int n2) {
        return n ^ n2;
    }
}

