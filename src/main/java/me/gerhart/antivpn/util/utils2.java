/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.gerhart.antivpn.util;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.bukkit.plugin.Plugin;

public final class utils2 {
    private static int y2I1Ej8lB8 = 0;
    private transient int kMmdDJC7O2 = 424649370;
    private static String tkmmxuyxko;
    private static String[] nothing_to_see_here;

    private utils2() {
        int n = 0x5A3A46C5 ^ 0x4C208362;
        utils2 utils22 = this;
        n = utils2.djacljjkvydcbbvr(n, 784328042);
        n = 0xE0C9562 ^ (0x49C2C0A3 ^ Integer.parseInt("2137748748"));
        this.kMmdDJC7O2 = 0x194FA29A ^ y2I1Ej8lB8;
        n = 0xB69767F ^ n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static LoadedConfig load(Plugin var0, int var1_1) {
        block13: {
            var51_2 = 1513960991 ^ (1036371532 ^ 1678699529);
            var51_2 = 1548516840 ^ var51_2;
            var3_4 = var0;
            var41_5 = var3_4.getDataFolder();
            var4_6 = utils2.dtjravzpjb(utils2.hxhgtocumynapcz(), var51_2);
            var9_7 = var2_3 = new File(var41_5, var4_6);
            var51_2 = 195090303 ^ var51_2;
            var10_9 /* !! */  = var17_8 = new ArrayList<E>();
            var51_2 = 101254930 ^ var51_2;
            var18_10 = var9_7;
            var19_11 = var18_10.toPath();
            var35_12 = StandardCharsets.UTF_8;
            var20_13 = Files.readAllLines(var19_11, var35_12);
            var51_2 = 1366940919 ^ var51_2;
            var10_9 /* !! */  = var20_13;
            var51_2 = 159870608 ^ var51_2;
            var51_2 = 123439906 ^ var51_2;
            try {
                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var51_2) != 177317148) {
                    throw null;
                }
                throw new IOException();
            }
            catch (IOException v0) {
                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var51_2)) {
                    case -371499222: {
                        var51_2 = 457094011 ^ var51_2;
                        ** GOTO lbl30
                    }
                    case 1840530640: {
                        var51_2 = 1270042628 ^ var51_2;
lbl30:
                        // 2 sources

                        var51_2 = 592397749 ^ var51_2;
                        break block13;
                    }
                }
                throw new IllegalAccessException("Error in hash");
            }
            catch (Exception v1) {
                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var51_2)) {
                    case 458451264: {
                        var51_2 = utils2.djacljjkvydcbbvr(var51_2, 1900730850);
                        break;
                    }
                    default: {
                        throw new IOException("Error in hash");
                    }
                    case -1868722438: {
                        var51_2 = 540214549 ^ var51_2;
                    }
                }
                var49_15 = var34_14 = v1;
                var51_2 = 392833505 ^ var51_2;
            }
        }
        var21_16 = var10_9 /* !! */ ;
        var11_18 = var22_17 = utils2.parseBlockScreen(var21_16, 866526973);
        var51_2 = 222423813 ^ var51_2;
        var23_19 /* !! */  = var10_9 /* !! */ ;
        var36_20 = utils2.dtjravzpjb(utils2.dgxeuyygqbbcwwa(), var51_2);
        var42_21 = utils2.dtjravzpjb(utils2.btzbizmoudwejwe(), var51_2);
        var12_23 = var24_22 = utils2.parseScalar(var23_19 /* !! */ , var36_20, var42_21, 399335388);
        var51_2 = 1830135865 ^ var51_2;
        var25_24 /* !! */  = var10_9 /* !! */ ;
        var37_25 = utils2.dtjravzpjb(utils2.ijlokwsqxcbonow(), var51_2);
        var43_26 = utils2.dtjravzpjb(utils2.rpmkqlwpyizxqdh(), var51_2);
        var13_28 = var26_27 = utils2.parseScalar(var25_24 /* !! */ , var37_25, var43_26, 399335388);
        var51_2 = 905966392 ^ var51_2;
        var27_29 /* !! */  = var10_9 /* !! */ ;
        var38_30 = utils2.dtjravzpjb(utils2.owynjykvcrwaeei(), var51_2);
        var44_31 = utils2.dtjravzpjb(utils2.hkleagiyvbkdazi(), var51_2);
        var14_33 = var28_32 = utils2.parseScalar(var27_29 /* !! */ , var38_30, var44_31, 399335388);
        var51_2 = 1771197097 ^ var51_2;
        var29_34 /* !! */  = var10_9 /* !! */ ;
        var39_35 = utils2.dtjravzpjb(utils2.eqdqbzbargnkiao(), var51_2);
        var45_36 = utils2.dtjravzpjb(utils2.yulqzcbarfkmxxg(), var51_2);
        var15_38 = var30_37 = utils2.parseScalar(var29_34 /* !! */ , var39_35, var45_36, 399335388);
        var51_2 = 360602633 ^ var51_2;
        var31_39 /* !! */  = var10_9 /* !! */ ;
        var40_40 = utils2.dtjravzpjb(utils2.bzlcobvbixvctge(), var51_2);
        var46_41 = utils2.dtjravzpjb(utils2.jetgdcentfeptcf(), var51_2);
        var16_43 = var32_42 = utils2.parseScalar(var31_39 /* !! */ , var40_40, var46_41, 399335388);
        var51_2 = 1071797581 ^ var51_2;
        var47_45 = var11_18;
        var48_46 = var12_23;
        var5_47 = var13_28;
        var6_48 = var14_33;
        var7_49 = var15_38;
        var8_50 = var16_43;
        var33_44 = new LoadedConfig(var47_45, var48_46, var5_47, var6_48, var7_49, var8_50, 2004925700);
        return var33_44;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static List parseBlockScreen(List var0, int var1_1) {
        var44_2 = 1910252241 ^ (2023098068 ^ 1678699529);
        var44_2 = 1099101936 ^ var44_2;
        var3_4 = var2_3 = new ArrayList<String>();
        var44_2 = 67253964 ^ var44_2;
        var4_6 = var9_5 = (byte)(683935792 ^ var44_2);
        var44_2 = 252241798 ^ var44_2;
        var10_7 = var0;
        var5_9 = var11_8 = var10_7.iterator();
        var44_2 = 928604204 ^ var44_2;
        block53: while ((var13_14 = (var12_13 = var5_9).hasNext()) != (278237082 ^ var44_2)) {
            block69: {
                block70: {
                    block71: {
                        var44_2 = 1804874500 ^ var44_2;
                        var14_15 = var5_9;
                        var15_16 = var14_15.next();
                        var6_10 = var16_17 = (String)var15_16;
                        var44_2 = 836905008 ^ var44_2;
                        var17_18 = var6_10;
                        var7_11 = var18_19 = var17_18.trim();
                        var19_20 = var4_6;
                        if (var19_20 != (1303417619 ^ (var44_2 = 122881981 ^ var44_2))) break block70;
                        var44_2 = 747715091 ^ var44_2;
                        var34_34 = var7_11;
                        var41_41 = utils2.dtjravzpjb(utils2.djhdfzcizeyxvmg(), var44_2);
                        var35_35 = var34_34.startsWith(var41_41);
                        if (var35_35 == (1629595904 ^ var44_2)) break block71;
                        var44_2 = 1605036730 ^ var44_2;
                        var4_6 = var36_36 = (byte)(1049314235 ^ var44_2);
                        var44_2 = utils2.djacljjkvydcbbvr(var44_2, 387302096);
                        try {}
                        catch (RuntimeException v0) {
                            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var44_2)) {
                                case 1291062097: {
                                    var44_2 = 1459441860 ^ var44_2;
                                    break;
                                }
                                default: {
                                    throw new IllegalAccessException("Error in hash");
                                }
                                case 1142675248: {
                                    var44_2 = utils2.djacljjkvydcbbvr(var44_2, 2011212616);
                                }
                            }
                            var44_2 = 1878416948 ^ var44_2;
                            continue;
                        }
                        ** GOTO lbl-1000
                    }
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var44_2 = utils2.djacljjkvydcbbvr(var44_2, 412437540)) != -844682973) {
                        var44_2 = 1869360395 ^ var44_2;
                        throw new RuntimeException();
                    }
                    var44_2 = 1763797694 ^ var44_2;
                    continue;
lbl-1000:
                    // 1 sources

                    {
                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2) == 0xA33323) throw new RuntimeException();
                        throw null;
                    }
                }
                block54: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                        case 339372519: {
                            continue block54;
                        }
                        case 109465924: {
                            var44_2 = 1293769075 ^ var44_2;
                        }
                        case 710018141: {
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var44_2) != 91116288) {
                                var44_2 = 376767055 ^ var44_2;
                                throw new RuntimeException();
                            }
                            var44_2 = utils2.djacljjkvydcbbvr(var44_2, 437254420);
                            var20_21 = var7_11;
                            var37_37 = utils2.dtjravzpjb(utils2.zhqwrbspegfdcuh(), var44_2);
                            var21_22 = var20_21.startsWith(var37_37);
                            if (var21_22 == (446837620 ^ var44_2)) {
                                var44_2 = 646745635 ^ var44_2;
                                var29_30 = var7_11;
                                var30_31 = var29_30.isEmpty();
                                if (var30_31 == (1009696087 ^ var44_2)) {
                                    var44_2 = 1104987162 ^ var44_2;
                                    var31_32 = var7_11;
                                    var40_40 = utils2.dtjravzpjb(utils2.tdsncfgufgzrvsu(), var44_2);
                                    var32_33 = var31_32.startsWith(var40_40);
                                    if (var32_33 != (2113042765 ^ var44_2)) break block54;
                                    var44_2 = 210045595 ^ var44_2;
                                    var44_2 = 1583077180 ^ var44_2;
                                    try {
                                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2) == 191254697) throw new IllegalAccessException();
                                        throw null;
                                    }
                                    catch (IllegalAccessException v1) {
                                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var44_2)) {
                                            case -1214125181: {
                                                var44_2 = utils2.djacljjkvydcbbvr(var44_2, 1669370689);
                                                break;
                                            }
                                            default: {
                                                throw new IllegalAccessException("Error in hash");
                                            }
                                            case 2036672337: {
                                                var44_2 = 978848475 ^ var44_2;
                                            }
                                        }
                                        var44_2 = utils2.djacljjkvydcbbvr(var44_2, 1327764403);
                                        return var3_4;
                                    }
                                }
                            } else {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var44_2 = 804451865 ^ var44_2) != -1434047639) {
                                    var44_2 = utils2.djacljjkvydcbbvr(var44_2, 596118850);
                                    throw new RuntimeException();
                                }
                                break block69;
                            }
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var44_2 = 54521980 ^ var44_2) != -125146791) {
                                var44_2 = utils2.djacljjkvydcbbvr(var44_2, 701072644);
                                throw new RuntimeException();
                            }
                            block55: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                                    case 311475166: {
                                        continue block55;
                                    }
                                    case 906421977: {
                                        continue block53;
                                    }
                                    case 171031186: {
                                        var44_2 = 797229745 ^ var44_2;
                                        continue block53;
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
                block56: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                        case 1840408198: {
                            continue block56;
                        }
                        case 67483383: {
                            var44_2 = 82826902 ^ var44_2;
                        }
                        case 1405576735: {
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var44_2) != -923959589) {
                                var44_2 = 1875208180 ^ var44_2;
                                throw new RuntimeException();
                            }
                            block57: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                                    case 1977908571: {
                                        continue block57;
                                    }
                                    case 761223504: {
                                        continue block53;
                                    }
                                    case 178912677: {
                                        var44_2 = 1770528833 ^ var44_2;
                                        continue block53;
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
            block58: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                    case 486121218: {
                        continue block58;
                    }
                    case 122440659: {
                        var44_2 = 1011008305 ^ var44_2;
                    }
                    case 397321651: {
                        var22_23 = var7_11;
                        var38_38 = (byte)(152176221 ^ var44_2);
                        var23_24 = var22_23.substring(var38_38);
                        var8_12 = var24_25 = var23_24.trim();
                        var44_2 = 1603296208 ^ var44_2;
                        var25_26 = var8_12;
                        var42_42 = var26_27 = utils2.unquote(var25_26, 333091678);
                        var44_2 = 1749486363 ^ var44_2;
                        var27_28 = var3_4;
                        var39_39 = var42_42;
                        var28_29 = var27_28.add(var39_39);
                        var44_2 = 514561749 ^ var44_2;
                        var44_2 = 1898703051 ^ var44_2;
                        try {
                            if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2) == 225816524) throw new IOException();
                            throw null;
                        }
                        catch (IOException v2) {
                            switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var44_2)) {
                                default: {
                                    throw new IOException("Error in hash");
                                }
                                case 1920318426: {
                                    var44_2 = 1820078386 ^ var44_2;
                                    break;
                                }
                                case -1977007030: {
                                    var44_2 = 1937223360 ^ var44_2;
                                }
                            }
                            var44_2 = utils2.djacljjkvydcbbvr(var44_2, 849807827);
                            continue block53;
                        }
                    }
                    default: {
                        throw new RuntimeException();
                    }
                }
                break;
            }
        }
        block59: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                case 1207900205: {
                    continue block59;
                }
                case 2217647: {
                    var44_2 = 563425988 ^ var44_2;
                }
                case 2073264595: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var44_2) == -2012878095) ** GOTO lbl179
                    var44_2 = utils2.djacljjkvydcbbvr(var44_2, 668497265);
                    ** GOTO lbl187
lbl179:
                    // 1 sources

                    block60: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var44_2)) {
                            case 1166595365: {
                                continue block60;
                            }
                            case 250699750: {
                                var44_2 = 1800405212 ^ var44_2;
                            }
                            case 937949655: {
                                return var3_4;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
lbl187:
        // 3 sources

        throw new RuntimeException();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     * Exception decompiling
     */
    private static String parseScalar(List var0, String var1_1, String var2_2, int var3_3) {
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
    private static String unquote(String var0, int var1_1) {
        block37: {
            block38: {
                var38_2 = 1012939954 ^ (1165115664 ^ 1678699529);
                var38_2 = 293397071 ^ var38_2;
                var2_3 = var0;
                if (var2_3 == null) {
                    var38_2 = 1617176980 ^ var38_2;
                    return null;
                }
                block22: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var38_2)) {
                        case 344147063: {
                            continue block22;
                        }
                        case 133885161: {
                            var38_2 = 1513361735 ^ var38_2;
                        }
                        case 1502283629: {
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2) != -1297935078) {
                                var38_2 = 832312302 ^ var38_2;
                                throw new IOException();
                            }
                            var38_2 = utils2.djacljjkvydcbbvr(var38_2, 1964197129);
                            var7_5 = var0;
                            var3_6 = utils2.dtjravzpjb(utils2.yqyencwnfjefuyc(), var38_2);
                            var8_7 = var7_5.startsWith(var3_6);
                            if (var8_7 == (591865770 ^ var38_2)) break block37;
                            var38_2 = 1014225378 ^ var38_2;
                            var9_8 = var0;
                            var24_9 = utils2.dtjravzpjb(utils2.mysxddexoqrwgjl(), var38_2);
                            var10_10 = var9_8.endsWith(var24_9);
                            if (var10_10 != (523566664 ^ var38_2)) {
                                var38_2 = 306298202 ^ var38_2;
                                var11_11 = var0;
                                var12_12 = var11_11.length();
                                if (var12_12 >= (var25_13 = (byte)(225788688 ^ var38_2))) {
                                    var38_2 = 1891455111 ^ var38_2;
                                    var13_14 = var0;
                                    var26_15 = (byte)(2110264212 ^ var38_2);
                                    var4_16 = var0;
                                    var31_17 = var4_16.length();
                                    var5_18 = (byte)(2110264212 ^ var38_2);
                                    var32_19 = var31_17 - var5_18;
                                    return var13_14.substring(var26_15, var32_19);
                                }
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2 = utils2.djacljjkvydcbbvr(var38_2, 454436232)) != -1290062640) break block22;
                                var38_2 = 1104123692 ^ var38_2;
                            } else {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2 = utils2.djacljjkvydcbbvr(var38_2, 2045864173)) != 908899627) break block38;
                                var38_2 = 828991251 ^ var38_2;
                            }
                            ** GOTO lbl77
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                    break;
                }
                block23: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var38_2)) {
                        case 1566715343: {
                            continue block23;
                        }
                        case 190873769: {
                            var38_2 = 1907038167 ^ var38_2;
                            throw new IOException();
                        }
                        default: {
                            throw new IOException();
                        }
                    }
                    break;
                }
            }
            block24: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var38_2)) {
                    case 1009356707: {
                        continue block24;
                    }
                    case 119452954: {
                        var38_2 = 17688552 ^ var38_2;
                        throw new IOException();
                    }
                }
                break;
            }
            throw new IOException();
        }
        block25: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var38_2)) {
                case 133871633: {
                    continue block25;
                }
                case 73007006: {
                    var38_2 = 956928461 ^ var38_2;
                }
                case 1281329388: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2) != -764038344) {
                        var38_2 = 2105984810 ^ var38_2;
                        throw new IOException();
                    }
                    var38_2 = 1306675153 ^ var38_2;
lbl77:
                    // 3 sources

                    var15_21 = var0;
                    var27_22 = utils2.dtjravzpjb(utils2.qrawxqqqarqeyjp(), var38_2);
                    var16_23 = var15_21.startsWith(var27_22);
                    if (var16_23 == (1470951862 ^ var38_2)) ** GOTO lbl103
                    var38_2 = 2050411742 ^ var38_2;
                    var17_24 = var0;
                    var28_25 = utils2.dtjravzpjb(utils2.diygihhdyyzejic(), var38_2);
                    var18_26 = var17_24.endsWith(var28_25);
                    if (var18_26 == (765082984 ^ var38_2)) ** GOTO lbl99
                    var38_2 = 546944359 ^ var38_2;
                    var19_27 = var0;
                    var20_28 = var19_27.length();
                    if (var20_28 >= (var29_29 = (byte)(218335245 ^ var38_2))) {
                        var38_2 = 1563767689 ^ var38_2;
                        var21_30 = var0;
                        var30_31 = (byte)(1345764231 ^ var38_2);
                        var33_32 = var0;
                        var34_33 = var33_32.length();
                        var36_34 = (byte)(1345764231 ^ var38_2);
                        var35_35 = var34_33 - var36_34;
                        return var21_30.substring(var30_31, var35_35);
                    }
                    ** GOTO lbl108
lbl99:
                    // 1 sources

                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2 = utils2.djacljjkvydcbbvr(var38_2, 786095359)) == 436669624) {
                        var38_2 = 334509846 ^ var38_2;
                        return var0;
                    }
                    ** GOTO lbl113
lbl103:
                    // 1 sources

                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2 = 1767898056 ^ var38_2) != -141011983) {
                        var38_2 = utils2.djacljjkvydcbbvr(var38_2, 1497070387);
                        throw new IOException();
                    }
                    var38_2 = 776199423 ^ var38_2;
                    return var0;
lbl108:
                    // 1 sources

                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var38_2 = 34183536 ^ var38_2) != 2018544632) {
                        var38_2 = utils2.djacljjkvydcbbvr(var38_2, 1757569074);
                        throw new IOException();
                    }
                    var38_2 = utils2.djacljjkvydcbbvr(var38_2, 532334590);
                    return var0;
lbl113:
                    // 1 sources

                    block26: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var38_2)) {
                            case 698710883: {
                                continue block26;
                            }
                            case 51171389: {
                                var38_2 = 1686671578 ^ var38_2;
                                throw new IOException();
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
        throw new IOException();
    }

    static {
        nothing_to_see_here = new String[18];
        utils2.nothing_to_see_here[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        utils2.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        tkmmxuyxko = ByteBuffer.wrap(utils2.lxwszyvsbnqesqw()).asCharBuffer().toString();
        int n = new Random(1637165013070801165L).nextInt();
        y2I1Ej8lB8 = 0xBC76ACE8 ^ n;
    }

    public static String dtjravzpjb(byte[] byArray, int n) {
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
        String string2 = tkmmxuyxko;
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

    private static byte[] bzlcobvbixvctge() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 0};
    }

    private static byte[] jetgdcentfeptcf() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 15};
    }

    private static byte[] ijlokwsqxcbonow() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 21};
    }

    private static byte[] rpmkqlwpyizxqdh() {
        return new byte[]{0, 0, 0, 12, 0, 0, 0, 36};
    }

    private static byte[] eqdqbzbargnkiao() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 48};
    }

    private static byte[] yulqzcbarfkmxxg() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 63};
    }

    private static byte[] owynjykvcrwaeei() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 73};
    }

    private static byte[] hkleagiyvbkdazi() {
        return new byte[]{0, 0, 0, 9, 0, 0, 0, 88};
    }

    private static byte[] hxhgtocumynapcz() {
        return new byte[]{0, 0, 0, 10, 0, 0, 0, 97};
    }

    private static byte[] dgxeuyygqbbcwwa() {
        return new byte[]{0, 0, 0, 15, 0, 0, 0, 107};
    }

    private static byte[] btzbizmoudwejwe() {
        return new byte[]{0, 0, 0, 27, 0, 0, 0, 122};
    }

    private static byte[] djhdfzcizeyxvmg() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, -107};
    }

    private static byte[] zhqwrbspegfdcuh() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -94};
    }

    private static byte[] tdsncfgufgzrvsu() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -93};
    }

    private static byte[] kidlhltmhdbmmxv() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -92};
    }

    private static byte[] bcwnvqkyjgjbcet() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -91};
    }

    private static byte[] fxzwvxrfoozenis() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -90};
    }

    private static byte[] iowztoiwcylaexn() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -89};
    }

    private static byte[] mysxddexoqrwgjl() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -88};
    }

    private static byte[] diygihhdyyzejic() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -87};
    }

    private static byte[] yqyencwnfjefuyc() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -86};
    }

    private static byte[] qrawxqqqarqeyjp() {
        return new byte[]{0, 0, 0, 1, 0, 0, 0, -85};
    }

    private static byte[] lxwszyvsbnqesqw() {
        return new byte[]{49, 95, 55, 80, 57, 65, 57, 71, 56, 86, 49, 85, 55, 80, 57, 65, 57, 104, 56, 68, 49, 24, 55, 15, 57, 110, 57, 71, 56, 29, 49, 64, 55, 80, 57, 94, 57, 91, 56, 86, 49, 86, 56, 88, 57, 85, 57, 67, 49, 70, 56, 84, 57, 87, 57, 85, 49, 70, 56, 105, 57, 67, 57, 26, 49, 15, 56, 105, 57, 67, 57, 26, 56, 91, 57, 95, 57, 96, 49, 80, 56, 71, 57, 93, 57, 89, 49, 70, 56, 70, 57, 89, 57, 95, 49, 91, 49, 88, 48, 85, 55, 71, 49, 70, 49, 81, 49, 82, 48, 85, 55, 71, 49, 105, 49, 67, 49, 31, 48, 10, 55, 104, 49, 70, 49, 26, 49, 65, 48, 95, 55, 83, 49, 82, 49, 92, 49, 80, 48, 29, 55, 91, 49, 83, 49, 86, 56, 95, 48, 85, 54, 64, 53, 64, 53, 89, 50, 87, 48, 83, 51, 70, 51, 105, 56, 65, 48, 26, 54, 9, 53, 111, 53, 75, 50, 26, 56, 70, 48, 95, 54, 84, 53, 84, 53, 84, 50, 85, 48, 27, 51, 90, 51, 91, 49, 85, 48, 89, 48, 91, 48, 84, 50, 95, 49, 81, 48, 24, 48, 76, 48, 95, 50, 90, 49, 90, 52, 80, 53, 75, 49, 69, 49, 85, 49, 80, 52, 80, 53, 75, 49, 106, 49, 71, 49, 29, 52, 15, 53, 100, 49, 69, 49, 30, 49, 71, 52, 89, 53, 89, 49, 79, 49, 81, 49, 69, 52, 24, 53, 90, 49, 90, 49, 91, 49, 84, 52, 94, 53, 93, 49, 82, 49, 25, 49, 86, 52, 81, 53, 85, 49, 95, 49, 90, 49, 26, 52, 91, 53, 87, 49, 66, 49, 93, 49, 84, 52, 80, 49, 84, 50, 85, 53, 86, 53, 90, 48, 95, 49, 27, 50, 74, 53, 90, 53, 75, 48, 81, 49, 83, 50, 87, 53, 3, 52, 25, 50, 18, 52, 10, 55, 30, 49, 14, 49, 22, 53, 16, 55, 17, 53, 27, 49, 19};
    }

    private static int djacljjkvydcbbvr(int n, int n2) {
        return n2 ^ n;
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    public static final class LoadedConfig {
        public final List<String> blockScreen;
        public final String adminNotice;
        public final String noPermission;
        public final String toggleOn;
        public final String toggleOff;
        public final String reloadMsg;
        private static int 8N8OUZf2F3 = 0;
        private transient int KGGFZqU5l3 = 192617914;
        private static String[] nothing_to_see_here = new String[18];

        public LoadedConfig(List<String> list, String string, String string2, String string3, String string4, String string5) {
            String string6;
            String string7;
            String string8;
            String string9;
            String string10;
            int n = 0x15E533D2 ^ 0x65C4A1E7;
            LoadedConfig loadedConfig = this;
            n = LoadedConfig.ddakmbalourlcwbr(n, 1249885746);
            n = 0x71433ECE ^ (0x7625F7F0 ^ Integer.parseInt("1027138873"));
            this.KGGFZqU5l3 = 0xB7B1DBA ^ 8N8OUZf2F3;
            n = LoadedConfig.ddakmbalourlcwbr(n, 1727895112);
            n = 0x1CEEC9FE ^ n;
            LoadedConfig loadedConfig2 = this;
            List<String> list2 = list;
            loadedConfig2.blockScreen = list2;
            n = 0x451B5A94 ^ n;
            LoadedConfig loadedConfig3 = this;
            loadedConfig3.adminNotice = string10 = string;
            n = 0x3EABC082 ^ n;
            LoadedConfig loadedConfig4 = this;
            loadedConfig4.noPermission = string9 = string2;
            n = 0x30994D6F ^ n;
            LoadedConfig loadedConfig5 = this;
            loadedConfig5.toggleOn = string8 = string3;
            n = 0x770EE30E ^ n;
            LoadedConfig loadedConfig6 = this;
            loadedConfig6.toggleOff = string7 = string4;
            n = 0x51FC092E ^ n;
            LoadedConfig loadedConfig7 = this;
            loadedConfig7.reloadMsg = string6 = string5;
            n = 0xCFA3CD1 ^ n;
        }

        static {
            LoadedConfig.nothing_to_see_here[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            LoadedConfig.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
            int n = new Random(1980220964599158633L).nextInt();
            8N8OUZf2F3 = 0xF9A6299A ^ n;
        }

        private static int ddakmbalourlcwbr(int n, int n2) {
            return n ^ n2;
        }
    }
}

