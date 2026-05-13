/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.gerhart.antivpn.storage;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.FileAttribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Random;
import java.util.UUID;
import org.bukkit.plugin.Plugin;

public class storage1 {
    private final Plugin plugin;
    private static Connection globalConnection;
    private static int rPCEGVJSNb = 0;
    private transient int deyWNtaiVx = 767776571;
    private static byte[] bamscickly;
    private static String[] nothing_to_see_here;

    public storage1(Plugin plugin, int n) {
        Plugin plugin2;
        int n2 = 0x9F3A1F2 ^ 0x74750826;
        storage1 storage12 = this;
        n2 = storage1.mepbfbhaujjdvggh(n2, 1457985490);
        n2 = 0x5116CFB3 ^ (0x771F2E6 ^ Integer.parseInt("2097578835"));
        this.deyWNtaiVx = 0x2DC3573B ^ rPCEGVJSNb;
        {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                case 109503950: {
                    continue block5;
                }
                case 67980106: {
                    n2 = 0x70118F10 ^ n2;
                    break block5;
                }
                default: {
                    throw new RuntimeException();
                }
                case 1617767565: 
            }
        }
        n2 = 0x57F086C1 ^ n2;
        storage1 storage13 = this;
        storage13.plugin = plugin2 = plugin;
        n2 = 0x1991B9DE ^ n2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void init(int var1_1) {
        block61: {
            block63: {
                var48_2 = 50090417 ^ (1186964126 ^ 731614226);
                var48_2 = 1581186501 ^ var48_2;
                var2_3 = this;
                var11_4 = var2_3.plugin;
                var12_5 = var11_4.getDataFolder();
                var5_7 = var13_6 = var12_5.toPath();
                var48_2 = 844509079 ^ var48_2;
                try {
                    block64: {
                        block62: {
                            var14_8 = var5_7;
                            var3_9 = (byte)(61910383 ^ var48_2);
                            var40_10 = new LinkOption[var3_9];
                            var15_11 = Files.exists(var14_8, var40_10);
                            if (var15_11 == (61910383 ^ var48_2)) {
                                var48_2 = 1425974711 ^ var48_2;
                                var16_12 = var5_7;
                                var41_13 = (byte)(1464731864 ^ var48_2);
                                var42_14 = new FileAttribute[var41_13];
                                var17_15 = Files.createDirectories(var16_12, var42_14);
                                var48_2 = 105884331 ^ var48_2;
                            } else {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var48_2 = 1520639302 ^ var48_2) != -929201846) break block61;
                                var48_2 = 135402074 ^ var48_2;
                            }
                            var18_16 = var5_7;
                            var43_17 = storage1.ubnaxgskio(storage1.xdykjlcpzjculbu(), var48_2);
                            var6_19 = var19_18 = var18_16.resolve(var43_17);
                            var48_2 = 794882866 ^ var48_2;
                            var20_20 = var6_19;
                            var21_21 = var20_20.toAbsolutePath();
                            var22_22 = String.valueOf(var21_21);
                            var7_24 = var23_23 = "jdbc:sqlite:" + var22_22;
                            var48_2 = 1794926651 ^ var48_2;
                            var24_25 = var7_24;
                            storage1.globalConnection = var25_26 = DriverManager.getConnection(var24_25);
                            var48_2 = 393376133 ^ var48_2;
                            var26_27 = storage1.globalConnection;
                            var44_28 = storage1.ubnaxgskio(storage1.emcdlwulywjbkcz(), var48_2);
                            var8_30 = var27_29 = var26_27.prepareStatement(var44_28);
                            var48_2 = 1004604995 ^ var48_2;
                            var28_31 = var8_30;
                            var29_32 = var28_31.executeUpdate();
                            var48_2 = 209490429 ^ var48_2;
                            var38_33 = var8_30;
                            if (var38_33 == null) break block62;
                            var48_2 = 1295269330 ^ var48_2;
                            var39_34 = var8_30;
                            var39_34.close();
                            var48_2 = 482970657 ^ var48_2;
                            try {
                                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var48_2) == 80065399) throw new IllegalAccessException();
                                throw null;
                            }
                            catch (IllegalAccessException v0) {
                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var48_2)) {
                                    case 746272147: {
                                        var48_2 = 2074176854 ^ var48_2;
                                        break;
                                    }
                                    default: {
                                        throw new IOException("Error in hash");
                                    }
                                    case 1141209770: {
                                        var48_2 = 1454286001 ^ var48_2;
                                    }
                                }
                                var48_2 = 986989864 ^ var48_2;
                            }
                            break block64;
                        }
                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var48_2 = 286051791 ^ var48_2) != 737203313) break block63;
                        var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 25449538);
                    }
                    var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 1577156562);
                    try {
                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var48_2) == 239523281) throw new RuntimeException();
                        throw null;
                    }
                    catch (RuntimeException v1) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var48_2)) {
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case -1567506480: {
                                var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 1813725339);
                                break;
                            }
                            case -673609485: {
                                var48_2 = 45237887 ^ var48_2;
                            }
                        }
                        var48_2 = 874049324 ^ var48_2;
                        return;
                    }
                    catch (Throwable v2) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var48_2)) {
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case -1066256927: 
                        }
                        var48_2 = 516945261 ^ var48_2;
                    }
                    var9_36 = var30_35 = v2;
                    var31_37 = var8_30;
                    if (var31_37 != null) {
                        var48_2 = 739527218 ^ var48_2;
                        var32_38 = var8_30;
                        var32_38.close();
                        var48_2 = 1584227745 ^ var48_2;
                    }
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 911318390)) != -2071890632) {
                        var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 17023730);
                        throw new IOException();
                    }
                    var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 1431715253);
                    ** GOTO lbl126
                    var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 478025179);
                    try {
                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var48_2) == 218161758) throw new RuntimeException();
                        throw null;
                    }
                    catch (RuntimeException v3) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var48_2)) {
                            case 1177832650: {
                                var48_2 = 1684529970 ^ var48_2;
                                break;
                            }
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case 1051237001: {
                                var48_2 = 192182778 ^ var48_2;
                            }
                        }
                        var48_2 = 1768389049 ^ var48_2;
                        ** GOTO lbl126
                    }
                    catch (Throwable v4) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var48_2)) {
                            case 1454362392: {
                                var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 535506535);
                                var10_40 = var36_39 = v4;
                                var37_41 = var9_36;
                                var45_42 = var10_40;
                                var37_41.addSuppressed(var45_42);
                                var48_2 = 1358480534 ^ var48_2;
lbl126:
                                // 3 sources

                                var33_43 = var9_36;
                                throw var33_43;
                            }
                        }
                        throw new RuntimeException("Error in hash");
                    }
                }
                catch (Exception v5) {
                    switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var48_2)) {
                        case 528107512: {
                            var48_2 = 1997859893 ^ var48_2;
                            break;
                        }
                        case 1454362392: {
                            var48_2 = 2116967721 ^ var48_2;
                            break;
                        }
                        case -2012408934: {
                            var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 637142713);
                            break;
                        }
                        case -1550403063: {
                            var48_2 = 1082749835 ^ var48_2;
                            break;
                        }
                        case -1513823726: {
                            var48_2 = 541276296 ^ var48_2;
                            break;
                        }
                        default: {
                            throw new IOException("Error in hash");
                        }
                        case 495283064: {
                            var48_2 = 2001406373 ^ var48_2;
                            break;
                        }
                        case 906862217: {
                            var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 1379538715);
                            break;
                        }
                        case -902343525: {
                            var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 230510169);
                            break;
                        }
                        case -1066256927: {
                            var48_2 = 1291182710 ^ var48_2;
                            break;
                        }
                        case -217413109: {
                            var48_2 = storage1.mepbfbhaujjdvggh(var48_2, 177927563);
                            break;
                        }
                        case 774936722: {
                            var48_2 = 826128344 ^ var48_2;
                            break;
                        }
                        case -1443447776: {
                            var48_2 = 1640330062 ^ var48_2;
                            break;
                        }
                        case -1528181808: {
                            var48_2 = 1617337776 ^ var48_2;
                            break;
                        }
                        case -1167046974: {
                            var48_2 = 599108626 ^ var48_2;
                        }
                    }
                    var46_45 = var34_44 = v5;
                    var48_2 = 603529436 ^ var48_2;
                    var4_47 = var46_45;
                    var35_46 = new RuntimeException(var4_47);
                    throw var35_46;
                }
            }
            block54: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var48_2)) {
                    case 528906836: {
                        continue block54;
                    }
                    case 144995853: {
                        var48_2 = 888010459 ^ var48_2;
                        throw new IOException();
                    }
                }
                break;
            }
            throw new IOException();
        }
        block55: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var48_2)) {
                case 2041958347: {
                    continue block55;
                }
                case 211188828: {
                    var48_2 = 1216371836 ^ var48_2;
                }
            }
            break;
        }
        throw new IOException();
    }

    /*
     * Exception decompiling
     */
    public static void closeGlobal(int var0) {
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
    public boolean isNotifyEnabled(UUID var1_1, int var2_2) {
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
    public boolean toggleNotify(UUID var1_1, int var2_2) {
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
        nothing_to_see_here = new String[18];
        storage1.nothing_to_see_here[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        storage1.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        bamscickly = storage1.dcrljdadunmiyti();
        int n = new Random(1585569364540987123L).nextInt();
        rPCEGVJSNb = 0xDA20F988 ^ n;
    }

    public static String ubnaxgskio(byte[] byArray, int n) {
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
            byte[] byArray9 = bamscickly;
            int n13 = n6++;
            byte[] byArray10 = bamscickly;
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

    private static byte[] dcrljdadunmiyti() {
        return new byte[]{94, 86, 104, 125, 89, 91, 104, 124, 70, 9, 30, 91, 62, 118, 115, 27, 78, 40, 6, 79, 9, 9, 59, 65, 119, 9, 96};
    }

    private static byte[] emcdlwulywjbkcz() {
        return new byte[]{-106, -97, 88, 15, 106, 61, 91, 0, 112, 126, 46, 62, 13, 7, 64, 2, 120, 74, 54, 63, 58, 127, 8, 52, 65, 122, 80, 79, 101, 21, 78, 38, 109, 126, 76, 57, 58, 101, 104, 83, 64, 101, 43, 58, 27, 106, 124, 121, 63, 94, 113, 18, 58, 7, 109, 79, 94, 42, 105, 14, 91, 37, 117, 89, 40, 3, 14, 24, 64, 65, 125, 126, 48, 13, 57, 81, 8, 19, 68, 73, 86, 72, 102, 113, 78, 24, 104, 36, 74, 25, 57, 75, 104, 42, 69, 30, 45, 61, 24, 111, 124, 105, 58, 34, 119, 17, 57, 3, 109, 43, 91, 9, 111, 44, 88, 31, 117, 100, 45, 66, 8, 11, 67, 111, 125, 69, 53, 90, 63, 31, 11, 21, 68, 83, 83, 6, 96, 60, 77, 4, 104, 57, 79, 27, 63, 8, 107, 70, 69, 9, 40, 35, 30, 117, 127, 127, 58, 74, 114, 28, 63, 118, 110, 41, 91, 6, 106, 54, 94, 106, 118, 118, 45, 58, 13, 3, 69, 97, 126, 48};
    }

    private static byte[] xdykjlcpzjculbu() {
        return new byte[]{-111, -102, 93, 55, 105, 25, 89, 37, 119, 66, 47, 9, 11, 40, 67, 72, 127, 48, 55, 18, 56, 88};
    }

    private static byte[] yfyxpbbdciqwvdn() {
        return new byte[]{-111, -112, 92, 29, 110, 47, 93, 1, 126, 124, 47, 33, 10, 17, 68, 10, 123, 124, 62, 17, 56, 81, 15, 16, 64, 84, 85, 10, 110, 60, 76, 64, 111, 29, 75, 37, 60, 96, 99, 67, 71, 106, 47, 28, 31, 83, 122, 85, 49, 98, 112, 32, 61, 12, 105, 9, 93, 35, 97, 31, 89, 44, 114, 92, 41, 19, 11, 103, 75, 124, 127, 89, 50, 57, 62, 106, 14, 53, 79, 25, 81, 18, 98, 46, 74, 1, 110, 61, 68, 86, 56, 26, 111, 45, 65, 125};
    }

    private static byte[] nbldvynvcmchavr() {
        return new byte[]{-107, -97, 95, 2, 104, 45, 88, 30, 118, 121, 40, 62, 8, 19, 75, 11, 127, 81, 51, 55, 62, 107, 10, 54, 71, 24, 80, 10, 96, 59, 75, 5, 99, 49, 77, 24, 60, 119, 108, 102, 71, 36, 43, 11, 24, 90, 121, 88, 63, 115, 121, 111, 56, 37, 107, 21, 95, 34, 104, 7, 88, 97, 118, 28, 40, 9, 8, 41, 75, 74, 127, 122, 51, 21, 62, 90, 10, 29, 71, 17, 80, 75, 96, 9, 75, 41, 99, 20, 77, 35, 60, 109, 108, 91, 71, 99, 43, 64, 24, 31, 121, 30, 63, 53, 121, 110, 56, 112, 107, 47, 95, 5, 104, 67, 88, 14, 118, 115, 40, 34, 8, 1, 75, 103, 127, 81, 51, 58, 62, 107, 10, 81, 71, 77, 80, 30, 96, 54, 75, 12, 99, 113, 77, 86, 60, 108, 108, 71, 71, 107, 43, 42, 24, 99, 121, 122, 63, 75, 121, 19, 56, 21, 107, 64, 95, 24, 104, 38, 88, 25, 118, 28, 40, 9, 8, 41, 75, 74, 127, 122, 51, 21, 62, 90, 10, 29, 71, 5, 80, 14, 96, 39, 75, 11, 99, 52, 77, 3, 60, 76, 108, 109, 71, 47, 43, 81, 24, 86, 121, 80, 63, 107, 121, 37, 56, 60, 107, 5, 95, 47};
    }

    private static int mepbfbhaujjdvggh(int n, int n2) {
        return n ^ n2;
    }
}

