/*
 * Decompiled with CFR 0.152.
 */
package dev.respark.licensegate;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Random;
import org.json.JSONObject;

public class LicenseGate {
    private static final String DEFAULT_SERVER = "https://api.licensegate.io";
    private String userId;
    private String publicRsaKey;
    private String validationServer;
    private boolean useChallenges;
    private boolean debug;
    private static int m35nlEi56F = 0;
    private transient int KFLyeGNI43 = 1813757035;
    private static String[] nothing_to_see_here = new String[15];

    public LicenseGate(String string) {
        String string2;
        boolean bl;
        boolean bl2;
        String string3;
        int n = 0x7833B284 ^ 0x3318097B;
        LicenseGate licenseGate = this;
        n = LicenseGate.ohktpjxprcwkswyu(n, 206018682);
        n = 0x7B808712 ^ (0x782E2AF3 ^ Integer.parseInt("1153601124"));
        this.KFLyeGNI43 = 0x6C1BBC6B ^ m35nlEi56F;
        n = 0x218EE4A3 ^ n;
        n = 0x7852D23C ^ n;
        LicenseGate licenseGate2 = this;
        licenseGate2.validationServer = string3 = DEFAULT_SERVER;
        n = 0x4C4C966D ^ n;
        LicenseGate licenseGate3 = this;
        licenseGate3.useChallenges = bl2 = false;
        n = 0x21766DD6 ^ n;
        LicenseGate licenseGate4 = this;
        licenseGate4.debug = bl = false;
        n = 0x3DEEBD8C ^ n;
        LicenseGate licenseGate5 = this;
        licenseGate5.userId = string2 = string;
        n = 0x2B3A6B3E ^ n;
    }

    /*
     * Exception decompiling
     */
    public LicenseGate(String var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CASE]], but top level block is 5[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    public LicenseGate setPublicRsaKey(String string) {
        String string2;
        int n = 0x55CEEEA9 ^ (0x2B1BC261 ^ 0x7A2CFD73);
        n = 0x341E631B ^ n;
        LicenseGate licenseGate = this;
        licenseGate.publicRsaKey = string2 = string;
        n = 0xB1FC9DC ^ n;
        LicenseGate licenseGate2 = this;
        return licenseGate2;
    }

    public LicenseGate setValidationServer(String string) {
        String string2;
        int n = 0x296D3E02 ^ (0x5F9408BB ^ 0x7A2CFD73);
        n = 0x19851E4D ^ n;
        LicenseGate licenseGate = this;
        licenseGate.validationServer = string2 = string;
        n = 0x1486F53B ^ n;
        LicenseGate licenseGate2 = this;
        return licenseGate2;
    }

    public LicenseGate useChallenges() {
        int n = 0x56CAC3FF ^ (0x20DAEB62 ^ 0x7A2CFD73);
        n = 0x6C092278 ^ n;
        LicenseGate licenseGate = this;
        byte by = (byte)(0x6035F797 ^ n);
        licenseGate.useChallenges = by;
        n = 0x63BE93A7 ^ n;
        LicenseGate licenseGate2 = this;
        return licenseGate2;
    }

    public LicenseGate debug() {
        int n = 0x4CEAA83C ^ (0x220D4291 ^ 0x7A2CFD73);
        n = 0x7292FCDA ^ n;
        LicenseGate licenseGate = this;
        byte by = (byte)(0x6659EB05 ^ n);
        licenseGate.debug = by;
        n = 0x5674C7B3 ^ n;
        LicenseGate licenseGate2 = this;
        return licenseGate2;
    }

    public ValidationType verify(String string, int n) {
        int n2 = 0x57254010 ^ (0x20A6927D ^ 0x7A2CFD73);
        n2 = 0x73BC8B29 ^ n2;
        LicenseGate licenseGate = this;
        String string2 = string;
        String string3 = null;
        String string4 = null;
        ValidationType validationType = licenseGate.verify(string2, string3, string4, 2129204013);
        return validationType;
    }

    public ValidationType verify(String string, String string2, int n) {
        int n2 = 0x5356B30A ^ (0x791262EE ^ 0x7A2CFD73);
        n2 = 0x40AF94E8 ^ n2;
        LicenseGate licenseGate = this;
        String string3 = string;
        String string4 = string2;
        String string5 = null;
        ValidationType validationType = licenseGate.verify(string3, string4, string5, 2129204013);
        return validationType;
    }

    /*
     * Exception decompiling
     */
    public ValidationType verify(String var1_1, String var2_2, String var3_3, int var4_4) {
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
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean verifySimple(String var1_1) {
        block30: {
            block31: {
                block29: {
                    var9_2 = 1942317810 ^ (826682348 ^ 2049768819);
                    var9_2 = 365920278 ^ var9_2;
                    var2_3 = this;
                    var3_4 = var1_1;
                    var4_5 = var2_3.verify(var3_4, 679692056);
                    if (var4_5 == (var6_6 = ValidationType.VALID)) break block29;
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var9_2 = 861627809 ^ var9_2) == -237318448) break block30;
                    break block31;
                }
                var9_2 = 166448495 ^ var9_2;
                var5_7 = (byte)(613150997 ^ var9_2);
                block25: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var9_2)) {
                        case 772952047: {
                            continue block25;
                        }
                        case 114231197: {
                            var9_2 = 210828038 ^ var9_2;
                        }
                        case 1478877459: {
                            try {
                                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var9_2) == 229919641) throw new IllegalAccessException();
                                throw null;
                            }
                            catch (IllegalAccessException v0) {
                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var9_2)) {
                                    case -879339614: {
                                        var9_2 = LicenseGate.ohktpjxprcwkswyu(var9_2, 920580365);
                                        ** break;
                                    }
                                    default: {
                                        throw new RuntimeException("Error in hash");
                                    }
                                    case 1087918225: 
                                }
                                var9_2 = 1203188203 ^ var9_2;
                            }
                            block26: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var9_2)) {
                                    case 5030951: lbl-1000:
                                    // 2 sources

                                    {
                                        continue block26;
                                    }
                                    case 140368798: {
                                        var9_2 = 542472191 ^ var9_2;
                                        return var5_7;
                                    }
                                    case 1006671616: {
                                        return var5_7;
                                    }
                                    default: {
                                        throw new RuntimeException();
                                    }
                                }
                                break;
                            }
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                    break;
                }
            }
            block27: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var9_2)) {
                    case 104177893: {
                        continue block27;
                    }
                    case 177397805: {
                        var9_2 = 1247680809 ^ var9_2;
                        throw new RuntimeException();
                    }
                }
                break;
            }
            throw new RuntimeException();
        }
        block28: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var9_2)) {
                case 1355641002: {
                    continue block28;
                }
                case 177397805: {
                    var9_2 = 1173014887 ^ var9_2;
                    break block28;
                }
                default: {
                    throw new RuntimeException();
                }
                case 402463563: 
            }
            break;
        }
        var5_7 = (byte)(1540460733 ^ var9_2);
        var9_2 = 338222267 ^ var9_2;
        return var5_7;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean verifySimple(String var1_1, String var2_2) {
        var11_3 = 746917904 ^ (1327682225 ^ 2049768819);
        var11_3 = 567226216 ^ var11_3;
        var3_4 = this;
        var4_5 = var1_1;
        var5_6 = var2_2;
        var6_7 = var3_4.verify(var4_5, var5_6, 1435308090);
        if (var6_7 != (var8_8 = ValidationType.VALID)) ** GOTO lbl41
        var11_3 = 2142701398 ^ var11_3;
        var7_9 = (byte)(1207113709 ^ var11_3);
        block26: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var11_3)) {
                case 318472136: {
                    continue block26;
                }
                case 191281578: {
                    var11_3 = 299430941 ^ var11_3;
                }
                case 1512356526: {
                    try {
                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var11_3) == 116744073) throw new IllegalAccessException();
                        throw null;
                    }
                    catch (IllegalAccessException v0) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var11_3)) {
                            case -1124516664: {
                                var11_3 = 2020978601 ^ var11_3;
                                ** break;
                            }
                            default: {
                                throw new IllegalAccessException("Error in hash");
                            }
                            case -1319166070: 
                        }
                        var11_3 = 968977345 ^ var11_3;
                        break block26;
                    }
                }
                default: {
                    throw new IOException();
                }
            }
            break;
        }
        block27: while (true) {
            cfr_temp_0 = 0;
lbl34:
            // 2 sources

            while (true) {
                switch (cfr_temp_0 == 0 ? sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var11_3) : cfr_temp_0) {
                    case 1243410854: lbl-1000:
                    // 2 sources

                    {
                        continue block27;
                    }
                    case 148244535: {
                        var11_3 = 1004874721 ^ var11_3;
                        ** GOTO lbl63
                    }
lbl41:
                    // 1 sources

                    block29: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var11_3)) {
                            case 1760269481: {
                                continue block29;
                            }
                            case 218355756: {
                                var11_3 = 549770388 ^ var11_3;
                            }
                            case 2116431857: {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var11_3) == -1006231184) break block29;
                                var11_3 = LicenseGate.ohktpjxprcwkswyu(var11_3, 441026237);
                                throw new IOException();
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                        break;
                    }
                    block30: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var11_3)) {
                            case 854731670: {
                                continue block30;
                            }
                            case 259613849: {
                                var11_3 = 1812133519 ^ var11_3;
                            }
                            case 704085479: {
                                var7_9 = (byte)(1954689697 ^ var11_3);
                                cfr_temp_0 = 236308778;
                                var11_3 = 546148720 ^ var11_3;
lbl63:
                                // 2 sources

                                case 236308778: {
                                    return var7_9;
                                }
                            }
                            default: {
                                throw new IOException();
                            }
                        }
                        break;
                    }
                    default: {
                        throw new IOException();
                    }
                }
                break;
            }
            break;
        }
        ** while (true)
lbl70:
        // 1 sources

        throw new IOException();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean verifySimple(String string, String string2, String string3) {
        boolean bl;
        ValidationType validationType;
        int n = 0x26A8091C ^ (0x7220656C ^ 0x7A2CFD73);
        n = 0x4A60DC59 ^ n;
        LicenseGate licenseGate = this;
        String string4 = string;
        String string5 = string2;
        String string6 = string3;
        ValidationType validationType2 = licenseGate.verify(string4, string5, string6, 2129204013);
        if (validationType2 == (validationType = ValidationType.VALID)) {
            n = 0x45AE7D3E ^ n;
            bl = (byte)(0x216A3065 ^ n);
            n = LicenseGate.ohktpjxprcwkswyu(n, 1992269985);
            try {
                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n) == 170762152) throw new IllegalAccessException();
                throw null;
            }
            catch (IllegalAccessException illegalAccessException) {
                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n)) {
                    case -1066664912: {
                        n = LicenseGate.ohktpjxprcwkswyu(n, 1103227767);
                        break;
                    }
                    default: {
                        throw new IOException("Error in hash");
                    }
                    case -1095989718: {
                        n = 0xE190434 ^ n;
                    }
                }
                n = LicenseGate.ohktpjxprcwkswyu(n, 573738869);
                return bl;
            }
        }
        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = 0x5E4E7F6B ^ n) == -732851831) {
            block15: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                    case 1184154132: {
                        continue block15;
                    }
                    case 23854004: {
                        n = 0x232077F6 ^ n;
                    }
                    case 1663284579: {
                        bl = (byte)(0x19AA45C7 ^ n);
                        n = 0x62545E43 ^ n;
                        return bl;
                    }
                }
                break;
            }
            throw new RuntimeException();
        } else {
            block16: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                    case 0x69629699: {
                        continue block16;
                    }
                    case 23854004: {
                        n = 0x59B4003F ^ n;
                    }
                }
                break;
            }
        }
        throw new RuntimeException();
    }

    /*
     * Exception decompiling
     */
    private String buildUrl(String var1_1, String var2_2, String var3_3, String var4_4, int var5_5) throws UnsupportedEncodingException {
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
    private JSONObject requestServer(String var1_1, int var2_2) throws IOException {
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
    private boolean verifyChallenge(String string, String string2, int n) {
        int n2 = 0x7728F5A7 ^ (0x5EF990A8 ^ 0x7A2CFD73);
        n2 = 0x732516D9 ^ n2;
        try {
            Signature signature;
            byte[] byArray;
            PublicKey publicKey;
            KeyFactory keyFactory;
            X509EncodedKeySpec x509EncodedKeySpec;
            byte[] byArray2;
            String string3;
            String string4;
            String string5;
            String string6 = string5 = LicenseGate.iwgseprjsa(LicenseGate.dezmslsqumbtnwt(), LicenseGate.icyulilhctlojdn(), n2);
            n2 = 0x51D4A8BA ^ n2;
            String string7 = string4 = LicenseGate.iwgseprjsa(LicenseGate.dlmoqjvsdimovol(), LicenseGate.icyulilhctlojdn(), n2);
            n2 = 0x585809B ^ n2;
            LicenseGate licenseGate = this;
            String string8 = licenseGate.publicRsaKey;
            String string9 = string6;
            String string10 = LicenseGate.iwgseprjsa(LicenseGate.grwtqgtbfygezfj(), LicenseGate.icyulilhctlojdn(), n2);
            String string11 = string8.replace(string9, string10);
            String string12 = string7;
            String string13 = LicenseGate.iwgseprjsa(LicenseGate.hsdjkopcoqewemr(), LicenseGate.icyulilhctlojdn(), n2);
            String string14 = string11.replace(string12, string13);
            String string15 = LicenseGate.iwgseprjsa(LicenseGate.yahkcceaxncqisf(), LicenseGate.icyulilhctlojdn(), n2);
            String string16 = LicenseGate.iwgseprjsa(LicenseGate.dvuedsxvsylfzff(), LicenseGate.icyulilhctlojdn(), n2);
            String string17 = string3 = string14.replaceAll(string15, string16);
            n2 = 0x1BC6A357 ^ n2;
            Base64.Decoder decoder = Base64.getDecoder();
            String string18 = string17;
            byte[] byArray3 = byArray2 = decoder.decode(string18);
            n2 = 0xD8BBEAC ^ n2;
            byte[] byArray4 = byArray3;
            X509EncodedKeySpec x509EncodedKeySpec2 = x509EncodedKeySpec = new X509EncodedKeySpec(byArray4);
            n2 = 0x1FC1DE55 ^ n2;
            String string19 = LicenseGate.iwgseprjsa(LicenseGate.pzuyojzutdztxrz(), LicenseGate.icyulilhctlojdn(), n2);
            KeyFactory keyFactory2 = keyFactory = KeyFactory.getInstance(string19);
            n2 = 0x73284889 ^ n2;
            KeyFactory keyFactory3 = keyFactory2;
            X509EncodedKeySpec x509EncodedKeySpec3 = x509EncodedKeySpec2;
            PublicKey publicKey2 = publicKey = keyFactory3.generatePublic(x509EncodedKeySpec3);
            n2 = 0x7C6250C7 ^ n2;
            Base64.Decoder decoder2 = Base64.getDecoder();
            String string20 = string2;
            byte[] byArray5 = byArray = decoder2.decode(string20);
            n2 = 0x56644567 ^ n2;
            String string21 = LicenseGate.iwgseprjsa(LicenseGate.xifwpfptkvscxii(), LicenseGate.icyulilhctlojdn(), n2);
            Signature signature2 = signature = Signature.getInstance(string21);
            n2 = 0x362F3D7D ^ n2;
            Signature signature3 = signature2;
            PublicKey publicKey3 = publicKey2;
            signature3.initVerify(publicKey3);
            n2 = 0x6D448EF1 ^ n2;
            Signature signature4 = signature2;
            String string22 = string;
            byte[] byArray6 = string22.getBytes();
            signature4.update(byArray6);
            n2 = 0x28E3F74A ^ n2;
            Signature signature5 = signature2;
            byte[] byArray7 = byArray5;
            boolean bl = signature5.verify(byArray7);
            n2 = 0x3DD8A3C3 ^ n2;
            return bl;
        }
        catch (Exception exception) {
            block30: {
                block29: {
                    Exception exception2;
                    switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n2)) {
                        case -100377477: {
                            n2 = LicenseGate.ohktpjxprcwkswyu(n2, 935271206);
                            break;
                        }
                        case -1538444253: {
                            n2 = LicenseGate.ohktpjxprcwkswyu(n2, 1014380077);
                            break;
                        }
                        case 2054696603: {
                            n2 = 0x27B0957A ^ n2;
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case -399824557: {
                            n2 = LicenseGate.ohktpjxprcwkswyu(n2, 905639299);
                            break;
                        }
                        case -1837372637: {
                            n2 = 0x3AB0EDCD ^ n2;
                            break;
                        }
                        case -1876939792: {
                            n2 = 0x5AFB95D7 ^ n2;
                            break;
                        }
                        case -1122245078: {
                            n2 = 0x1F5CEC6C ^ n2;
                            break;
                        }
                        case -2006896389: {
                            n2 = 0x39F3B6B6 ^ n2;
                            break;
                        }
                        case 1902734616: {
                            n2 = 0x46D2BD0A ^ n2;
                            break;
                        }
                        case 113538345: {
                            n2 = 0x68271E0C ^ n2;
                            break;
                        }
                        case 559530009: {
                            n2 = 0x6CD4A8AA ^ n2;
                            break;
                        }
                        case 371579899: {
                            n2 = 0x2A3B2BD6 ^ n2;
                        }
                    }
                    Exception exception3 = exception2 = exception;
                    n2 = 0x5B07761F ^ n2;
                    LicenseGate licenseGate = this;
                    int n3 = licenseGate.debug;
                    if (n3 != (0x13F8E6B6 ^ n2)) {
                        n2 = 0x4963B587 ^ n2;
                        Exception exception4 = exception3;
                        exception4.printStackTrace();
                        n2 = 0x167B0199 ^ n2;
                        return (byte)(0x4CE052A8 ^ n2) != 0;
                    }
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2 = 0x9C20423 ^ n2) == -774433624) break block29;
                    break block30;
                }
                block26: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                        case 597382997: {
                            continue block26;
                        }
                        case 287104520: {
                            return (byte)(0x4CE052A8 ^ n2) != 0;
                        }
                        case 47320378: {
                            n2 = 0x56DAB03D ^ n2;
                            return (byte)(0x4CE052A8 ^ n2) != 0;
                        }
                    }
                    break;
                }
                throw new RuntimeException();
            }
            block27: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                    case 1045065773: {
                        continue block27;
                    }
                    case 47320378: {
                        n2 = 0x628BB807 ^ n2;
                    }
                }
                break;
            }
            throw new RuntimeException();
        }
    }

    static {
        LicenseGate.nothing_to_see_here[0] = "\u2804\u2804\u2804\u28b0\u28e7\u28fc\u28ef\u2804\u28f8\u28e0\u28f6\u28f6\u28e6\u28fe\u2804\u2804\u2804\u2804\u2840\u2804\u2880\u28ff\u28ff\u2804\u2804\u2804\u28b8\u2847\u2804\u2804";
        LicenseGate.nothing_to_see_here[1] = "\u2804\u2804\u2804\u28fe\u28ff\u283f\u283f\u2836\u283f\u28bf\u28ff\u28ff\u28ff\u28ff\u28e6\u28e4\u28c4\u2880\u2845\u28a0\u28fe\u28db\u2849\u2804\u2804\u2804\u2838\u2880\u28ff\u2804";
        LicenseGate.nothing_to_see_here[2] = "\u2804\u2804\u2880\u284b\u28e1\u28f4\u28f6\u28f6\u2840\u2804\u2804\u2819\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28f4\u28ff\u28ff\u28ff\u2883\u28e4\u28c4\u28c0\u28e5\u28ff\u28ff\u2804";
        LicenseGate.nothing_to_see_here[3] = "\u2804\u2804\u28b8\u28c7\u283b\u28ff\u28ff\u28ff\u28e7\u28c0\u2880\u28e0\u284c\u28bb\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28ff\u28ff\u28ff\u2804";
        LicenseGate.nothing_to_see_here[4] = "\u2804\u2880\u28b8\u28ff\u28f7\u28e4\u28e4\u28e4\u28ec\u28d9\u28db\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u28ff\u28ff\u284d\u2804\u2804\u2880\u28e4\u28c4\u2809\u280b\u28f0";
        LicenseGate.nothing_to_see_here[5] = "\u2804\u28fc\u28d6\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u2887\u28ff\u28ff\u2877\u2836\u2836\u28bf\u28ff\u28ff\u2807\u2880\u28e4";
        LicenseGate.nothing_to_see_here[6] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28fd\u28ff\u28ff\u28ff\u2847\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28f6\u28e5\u28f4\u28ff\u2857";
        LicenseGate.nothing_to_see_here[7] = "\u2880\u2808\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u285f\u2804";
        LicenseGate.nothing_to_see_here[8] = "\u28b8\u28ff\u28e6\u28cc\u28db\u28fb\u28ff\u28ff\u28e7\u2819\u281b\u281b\u286d\u2805\u2812\u2826\u282d\u28ed\u287b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2804";
        LicenseGate.nothing_to_see_here[9] = "\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2846\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2839\u2808\u288b\u28fd\u28ff\u28ff\u28ff\u28ff\u28f5\u28fe\u2803\u2804";
        LicenseGate.nothing_to_see_here[10] = "\u2804\u2818\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2804\u28f4\u28ff\u28f6\u28c4\u2804\u28f4\u28f6\u2804\u2880\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2804\u2804";
        LicenseGate.nothing_to_see_here[11] = "\u2804\u2804\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2844\u28bb\u28ff\u28ff\u28ff\u2804\u28ff\u28ff\u2840\u28fe\u28ff\u28ff\u28ff\u28ff\u28db\u281b\u2801\u2804\u2804\u2804";
        LicenseGate.nothing_to_see_here[12] = "\u2804\u2804\u2804\u2804\u2808\u281b\u28bf\u28ff\u28ff\u28ff\u2801\u281e\u28bf\u28ff\u28ff\u2844\u28bf\u28ff\u2847\u28f8\u28ff\u28ff\u283f\u281b\u2801\u2804\u2804\u2804\u2804\u2804";
        LicenseGate.nothing_to_see_here[13] = "\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u2809\u283b\u28ff\u28ff\u28fe\u28e6\u2859\u283b\u28f7\u28fe\u28ff\u2803\u283f\u280b\u2801\u2804\u2804\u2804\u2804\u2804\u2880\u28e0\u28f4";
        LicenseGate.nothing_to_see_here[14] = "\u28ff\u28ff\u28ff\u28f6\u28f6\u28ee\u28e5\u28d2\u2832\u28ae\u28dd\u287f\u28ff\u28ff\u2846\u28ff\u287f\u2803\u2804\u2804\u2804\u2804\u2804\u2804\u2804\u28e0\u28f4\u28ff\u28ff\u28ff";
        int n = new Random(3853628402638234388L).nextInt();
        m35nlEi56F = 0x1AE68CA7 ^ n;
    }

    public static String iwgseprjsa(byte[] byArray, byte[] byArray2, int n) {
        byte[] byArray3;
        int n2;
        int n3;
        int n4;
        byte[] byArray4;
        int n5 = n;
        String string = Integer.toString(n5);
        byte[] byArray5 = byArray4 = string.getBytes();
        int n6 = n4 = 0;
        while ((n3 = n6) < (n2 = (byArray3 = byArray).length)) {
            byte by;
            byte by2;
            byte[] byArray6 = byArray;
            int n7 = n6;
            byte by3 = byArray6[n7];
            byte[] byArray7 = byArray5;
            int n8 = n6;
            byte[] byArray8 = byArray5;
            int n9 = byArray8.length;
            int n10 = n8 % n9;
            byte by4 = byArray7[n10];
            int n11 = by3 ^ by4;
            byArray6[n7] = by2 = (byte)n11;
            byte[] byArray9 = byArray;
            int n12 = n6;
            byte by5 = byArray9[n12];
            byte[] byArray10 = byArray2;
            int n13 = n6++;
            byte[] byArray11 = byArray2;
            int n14 = byArray11.length;
            int n15 = n13 % n14;
            byte by6 = byArray10[n15];
            int n16 = by5 ^ by6;
            byArray9[n12] = by = (byte)n16;
        }
        byte[] byArray12 = byArray;
        Charset charset = StandardCharsets.UTF_16;
        String string2 = new String(byArray12, charset);
        return string2;
    }

    private static byte[] icyulilhctlojdn() {
        return new byte[]{88, 97, 11, 67, 112, 3, 81, 79, 108, 32, 112, 87, 55, 68, 89, 48, 37, 70, 116, 51, 18, 49, 27, 16, 110, 31, 109, 55, 82, 9, 65, 13, 58, 21, 104, 60, 51, 122, 83, 40, 102, 64, 73, 1, 88, 1, 13, 27, 18, 17, 65, 11, 126, 55, 94, 109, 8, 99, 105, 89, 31, 72, 83, 105, 54, 3, 82, 73, 46, 62, 4, 19, 6, 86};
    }

    private static byte[] zvlckokijiyrqun() {
        return new byte[]{-105, -81, 56, 2, 64, 94, 102, 5, 95, 102, 65, 10, 4, 3};
    }

    private static byte[] hujkjyhqdogdqav() {
        return new byte[]{-105, -85, 63, 1, 64, 95, 101, 26, 94, 127, 69, 6, 6, 16, 108, 71, 23, 28, 69, 103, 38, 108, 43, 73, 90, 72, 95, 104, 103, 90, 112, 88};
    }

    private static byte[] ktiiwpbgiaedtti() {
        return new byte[]{-105, -85, 61, 8, 73, 84, 100, 10, 92, 103, 65, 14, 1, 9};
    }

    private static byte[] kdxqhrmtlommkcn() {
        return new byte[]{-105, -81, 63, 51, 72, 70, 96, 10, 85, 126, 65, 17, 2, 70, 110, 33};
    }

    private static byte[] ipzreekzpjbthyz() {
        return new byte[]{-105, -81, 63, 19, 72, 70, 96, 10, 85, 126, 65, 17};
    }

    private static byte[] mkvlqfmkxzzabpg() {
        return new byte[]{-109, -84, 63, 55, 67, 69, 101, 12, 95, 122, 66, 17, 6, 77, 109, 36, 20, 59, 65, 110, 38, 32, 40, 71, 90, 70, 94, 99, 96, 81, 112, 82, 14, 68, 89, 97, 6, 47, 103, 124, 85, 84, 125, 66, 107, 81, 63, 92, 35, 87, 117, 83, 79, 112};
    }

    private static byte[] xudourhvxszvfat() {
        return new byte[]{-110, -89, 62, 6, 65, 87, 105, 10, 91, 97, 73, 14, 0, 1};
    }

    private static byte[] fqmlkfqfioqkvxz() {
        return new byte[]{-105, -86, 62, 12, 69, 87, 98, 18, 89, 122, 65, 7};
    }

    private static byte[] fwdlzthccytowfj() {
        return new byte[]{-105, -90, 58, 8, 70, 83, 98, 29, 88, 119, 65, 10, 6, 24, 111, 74, 22, 27, 64, 107, 35, 101, 42, 68, 88, 67, 94, 108, 102, 87, 112, 80};
    }

    private static byte[] ukgflblqootwolq() {
        return new byte[]{-105, -81, 57, 54, 73, 65, 96, 13, 95, 121, 65, 20, 5, 78, 96, 32, 20, 53, 71, 109, 35, 97, 41, 76, 87, 67, 92, 98, 97, 81, 112, 91, 8, 64, 81, 44, 2, 60, 96, 123, 87, 3, 123, 88, 97, 87, 60, 66, 33, 68, 112, 91, 76, 115, 103, 52, 57, 60, 90, 1, 46, 89, 97, 63, 15, 82, 99, 16, 29, 100, 53, 71, 52, 2};
    }

    private static byte[] hgpzncgxyxhmluu() {
        return new byte[]{-105, -81, 50, 19, 72, 65, 104, 5, 90, 123, 65, 20};
    }

    private static byte[] yegjocmhfnoyxwr() {
        return new byte[]{-105, -83, 50, 7, 72, 91, 103, 21, 94, 125, 65, 0};
    }

    private static byte[] exydcqgzcmozhbl() {
        return new byte[]{-108, -82, 50, 78};
    }

    private static byte[] ltjevizwawaeypi() {
        return new byte[0];
    }

    private static byte[] webyydvlryifmgp() {
        return new byte[]{-97, -84, 62, 78, 65, 89, 101, 19, 89, 109, 66, 3, 5, 17, 110, 101, 28, 7, 77, 96, 39, 62};
    }

    private static byte[] dfakhtemawhlcat() {
        return new byte[]{-105, -84, 62, 86};
    }

    private static byte[] wziiemslewdearz() {
        return new byte[]{-98, -86, 62, 91, 69, 95, 99, 30, 84, 123, 68, 7, 0, 31, 105, 113, 29, 27, 76, 40};
    }

    private static byte[] rmtehyvsqpcapah() {
        return new byte[]{-98, -86, 62, 91};
    }

    private static byte[] fovaoysjiqozuwa() {
        return new byte[]{-98, -86, 62, 91, 69, 69, 99, 18, 84, 106, 68, 11, 0, 23, 105, 123};
    }

    private static byte[] yykjhbodfmldakz() {
        return new byte[]{-105, -83, 57, 80};
    }

    private static byte[] bnclmkhhhfqrvxy() {
        return new byte[]{-107, -88, 59, 20, 68, 89, 103, 29, 90, 124, 68, 15, 5, 23, 106, 104, 21, 21, 64, 100, 36, 63};
    }

    private static byte[] sdififaarnnjzdx() {
        return new byte[]{-108, -85, 59, 9, 67, 84, 101, 24, 94, 98, 69, 2, 14, 74};
    }

    private static byte[] sgwtuclqowhvaof() {
        return new byte[]{-105, -81, 57, 69};
    }

    private static byte[] nillnyujqccousb() {
        return new byte[]{-112, -81, 62, 40, 70, 80, 98, 10, 95, 102, 65, 13, 14, 28, 111, 112, 19, 16, 66, 56, 39, 40};
    }

    private static byte[] fquiwenljmjocpp() {
        return new byte[]{-105, -88, 63, 38, 65, 70, 101, 18, 89, 107, 65, 76, 3, 53, 104, 97, 17, 27, 65, 100, 35, 115};
    }

    private static byte[] suyezddysbdvgnw() {
        return new byte[]{-105, -88, 63, 62, 65, 90, 101, 13, 89, 112, 65, 13, 3, 24, 104, 103, 17, 81, 65, 63, 35, 41, 47, 16};
    }

    private static byte[] feggedgmusgnkfy() {
        return new byte[]{-98, -88, 63, 33, 66, 85, 103, 12, 89, 104, 70, 12, 7, 24, 106, 117, 21, 22, 76, 37, 38, 66, 41, 76, 88, 75, 88, 106, 100, 29, 113, 5, 9, 3};
    }

    private static byte[] owzyhqhpygkkdkh() {
        return new byte[]{-98, -90, 62, 55, 64, 127, 96, 35};
    }

    private static byte[] qjxmfhgmtafxbyw() {
        return new byte[]{-105, -81, 57, 126, 68, 101, 104, 28, 88, 118, 65, 2, 5, 26, 109, 107, 28, 23, 64, 43, 35, 114, 41, 66, 90, 91, 84, 116, 102, 84, 112, 79, 8, 86, 92, 41, 10, 56, 103, 127, 87, 81, 123, 99, 108, 102, 52, 97, 38, 9, 112, 0, 76, 32};
    }

    private static byte[] dezmslsqumbtnwt() {
        return new byte[]{-109, -85, 58, 94, 70, 29, 99, 82, 89, 56, 69, 75, 7, 48, 106, 71, 21, 52, 65, 79, 35, 79, 45, 3, 92, 127, 88, 87, 103, 122, 113, 119, 9, 110, 88, 74, 6, 111, 98, 83, 80, 54, 123, 104, 109, 25, 56, 7, 34, 10, 114, 20, 78, 47};
    }

    private static byte[] pzuyojzutdztxrz() {
        return new byte[]{-108, -82, 50, 38, 69, 96, 100, 59};
    }

    private static byte[] grwtqgtbfygezfj() {
        return new byte[0];
    }

    private static byte[] hsdjkopcoqewemr() {
        return new byte[0];
    }

    private static byte[] yahkcceaxncqisf() {
        return new byte[]{-105, -89, 62, 42, 65, 71, 105, 85};
    }

    private static byte[] dvuedsxvsylfzff() {
        return new byte[0];
    }

    private static byte[] dlmoqjvsdimovol() {
        return new byte[]{-105, -90, 50, 88, 70, 28, 96, 87, 85, 52, 65, 66, 14, 55, 111, 76, 20, 55, 77, 42, 35, 89, 34, 115, 88, 111, 92, 78, 107, 121, 112, 118, 3, 3, 94, 69, 2, 10, 106, 72, 87, 85, 112, 26, 110, 30, 60, 3, 43, 5};
    }

    private static byte[] xifwpfptkvscxii() {
        return new byte[]{-112, -82, 61, 40, 65, 121, 96, 56, 95, 36, 64, 84, 15, 67, 107, 118, 19, 28, 66, 119, 36, 97, 42, 112, 95, 122, 94, 64};
    }

    private static int ohktpjxprcwkswyu(int n, int n2) {
        return n ^ n2;
    }

    public static final class ValidationType
    extends Enum<ValidationType> {
        public static final /* enum */ ValidationType VALID;
        public static final /* enum */ ValidationType NOT_FOUND;
        public static final /* enum */ ValidationType NOT_ACTIVE;
        public static final /* enum */ ValidationType EXPIRED;
        public static final /* enum */ ValidationType LICENSE_SCOPE_FAILED;
        public static final /* enum */ ValidationType IP_LIMIT_EXCEEDED;
        public static final /* enum */ ValidationType RATE_LIMIT_EXCEEDED;
        public static final /* enum */ ValidationType FAILED_CHALLENGE;
        public static final /* enum */ ValidationType SERVER_ERROR;
        public static final /* enum */ ValidationType CONNECTION_ERROR;
        private boolean valid;
        private static final /* synthetic */ ValidationType[] $VALUES;
        private static byte[] bkinmmjjfb;

        public static ValidationType[] values() {
            int n = 0x4F6F11AC ^ (0x14D80337 ^ 0x762366E3);
            n = 0x52751CDD ^ n;
            ValidationType[] validationTypeArray = $VALUES;
            Object object = validationTypeArray.clone();
            ValidationType[] validationTypeArray2 = (ValidationType[])object;
            return validationTypeArray2;
        }

        public static ValidationType valueOf(String string) {
            ValidationType validationType;
            int n = 0x529E9548 ^ (0x4CAD487D ^ 0x762366E3);
            n = 0x2BBCA737 ^ n;
            Class<ValidationType> clazz = ValidationType.class;
            String string2 = string;
            ValidationType validationType2 = validationType = Enum.valueOf(clazz, string2);
            return validationType2;
        }

        private ValidationType(boolean bl) {
            int n2 = 0x1A1FC15E ^ 0x388A0B37;
            ValidationType validationType = this;
            String string2 = string;
            int n3 = n;
            {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                    case 2136897948: {
                        continue block10;
                    }
                    case 50469566: {
                        n2 = 0x62DF82D8 ^ n2;
                    }
                    case 2026231852: {
                        n2 = 0xB0293CD ^ (0x77FC2D26 ^ Integer.parseInt("1018492506"));
                        {
                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                                case 1426677895: {
                                    continue block11;
                                }
                                case 210742428: {
                                    n2 = 0x716BF876 ^ n2;
                                }
                                case 618045615: {
                                    boolean bl2;
                                    n2 = 0x12589886 ^ n2;
                                    ValidationType validationType2 = this;
                                    validationType2.valid = bl2 = bl;
                                    n2 = 0x200A6879 ^ n2;
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            throw new IllegalAccessException();
        }

        private ValidationType() {
            int n2 = 0x5098B133 ^ 0x686D2BD4;
            ValidationType validationType = this;
            String string2 = string;
            int n3 = n;
            boolean bl = false;
            validationType(bl);
            n2 = ValidationType.npyxgpkkoestwomz(n2, 2015515432);
            n2 = 0x78618922 ^ (0x402B6B7 ^ Integer.parseInt("1018492506"));
            {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                    case 2012499433: {
                        continue block5;
                    }
                    case 228743126: {
                        n2 = 0x48F04A2F ^ n2;
                        break block5;
                    }
                    default: {
                        throw new RuntimeException();
                    }
                    case 1997351718: 
                }
            }
            n2 = 0x649B42AE ^ n2;
        }

        public boolean isValid() {
            int n = 0x3E472A06 ^ (0x2A05EDD1 ^ 0x21792A17);
            n = 0x2355F63C ^ n;
            ValidationType validationType = this;
            boolean bl = validationType.valid;
            return bl;
        }

        private static /* synthetic */ ValidationType[] $values() {
            ValidationType validationType;
            ValidationType validationType2;
            ValidationType validationType3;
            ValidationType validationType4;
            ValidationType validationType5;
            ValidationType validationType6;
            ValidationType validationType7;
            ValidationType validationType8;
            ValidationType validationType9;
            ValidationType validationType10;
            int n = 0x297CF98F ^ (0x550C61E8 ^ 0x762366E3);
            n = 0x1D3FFA8F ^ n;
            byte by = (byte)(0x176C0401 ^ n);
            ValidationType[] validationTypeArray = new ValidationType[by];
            byte by2 = (byte)(0x176C040B ^ n);
            validationTypeArray[by2] = validationType10 = VALID;
            byte by3 = (byte)(0x176C040A ^ n);
            validationTypeArray[by3] = validationType9 = NOT_FOUND;
            byte by4 = (byte)(0x176C0409 ^ n);
            validationTypeArray[by4] = validationType8 = NOT_ACTIVE;
            byte by5 = (byte)(0x176C0408 ^ n);
            validationTypeArray[by5] = validationType7 = EXPIRED;
            byte by6 = (byte)(0x176C040F ^ n);
            validationTypeArray[by6] = validationType6 = LICENSE_SCOPE_FAILED;
            byte by7 = (byte)(0x176C040E ^ n);
            validationTypeArray[by7] = validationType5 = IP_LIMIT_EXCEEDED;
            byte by8 = (byte)(0x176C040D ^ n);
            validationTypeArray[by8] = validationType4 = RATE_LIMIT_EXCEEDED;
            byte by9 = (byte)(0x176C040C ^ n);
            validationTypeArray[by9] = validationType3 = FAILED_CHALLENGE;
            byte by10 = (byte)(0x176C0403 ^ n);
            validationTypeArray[by10] = validationType2 = SERVER_ERROR;
            byte by11 = (byte)(0x176C0402 ^ n);
            validationTypeArray[by11] = validationType = CONNECTION_ERROR;
            return validationTypeArray;
        }

        static {
            ValidationType validationType;
            ValidationType validationType2;
            ValidationType validationType3;
            ValidationType validationType4;
            ValidationType validationType5;
            ValidationType validationType6;
            ValidationType validationType7;
            ValidationType validationType8;
            ValidationType validationType9;
            ValidationType validationType10;
            int n = 0x53A87A8 ^ (0x12D92103 ^ Integer.parseInt("1018492506"));
            bkinmmjjfb = ValidationType.whruyzwekachixy();
            n = 0x29B93412 ^ n;
            String string = ValidationType.isugzzrema(ValidationType.ercbrysjxzxoxsz(), n);
            byte by = (byte)(0x2EE64E3 ^ n);
            boolean bl = (byte)(0x2EE64E2 ^ n);
            VALID = validationType10 = new ValidationType(bl);
            String string2 = ValidationType.isugzzrema(ValidationType.hzhtdboghthrmio(), n);
            byte by2 = (byte)(0x2EE64E2 ^ n);
            NOT_FOUND = validationType9 = new ValidationType();
            String string3 = ValidationType.isugzzrema(ValidationType.npvpfuhwoeupldd(), n);
            byte by3 = (byte)(0x2EE64E1 ^ n);
            NOT_ACTIVE = validationType8 = new ValidationType();
            String string4 = ValidationType.isugzzrema(ValidationType.byrloujdohkukdn(), n);
            byte by4 = (byte)(0x2EE64E0 ^ n);
            EXPIRED = validationType7 = new ValidationType();
            String string5 = ValidationType.isugzzrema(ValidationType.nhzgjxdumiuayql(), n);
            byte by5 = (byte)(0x2EE64E7 ^ n);
            LICENSE_SCOPE_FAILED = validationType6 = new ValidationType();
            String string6 = ValidationType.isugzzrema(ValidationType.ahymmejwyalgsit(), n);
            byte by6 = (byte)(0x2EE64E6 ^ n);
            IP_LIMIT_EXCEEDED = validationType5 = new ValidationType();
            String string7 = ValidationType.isugzzrema(ValidationType.ybhwdnewzsjebjv(), n);
            byte by7 = (byte)(0x2EE64E5 ^ n);
            RATE_LIMIT_EXCEEDED = validationType4 = new ValidationType();
            String string8 = ValidationType.isugzzrema(ValidationType.favcxpqqpbufcsx(), n);
            byte by8 = (byte)(0x2EE64E4 ^ n);
            FAILED_CHALLENGE = validationType3 = new ValidationType();
            String string9 = ValidationType.isugzzrema(ValidationType.vhiijcnlsibmugh(), n);
            byte by9 = (byte)(0x2EE64EB ^ n);
            SERVER_ERROR = validationType2 = new ValidationType();
            String string10 = ValidationType.isugzzrema(ValidationType.ipnbiswigthcbpw(), n);
            byte by10 = (byte)(0x2EE64EA ^ n);
            CONNECTION_ERROR = validationType = new ValidationType();
            n = 0x7B29238 ^ n;
            ValidationType[] validationTypeArray = ValidationType.$values();
            $VALUES = validationTypeArray;
        }

        public static String isugzzrema(byte[] byArray, int n) {
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
                byte[] byArray9 = bkinmmjjfb;
                int n13 = n6++;
                byte[] byArray10 = bkinmmjjfb;
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

        private static byte[] whruyzwekachixy() {
            return new byte[]{85, 125, 71, 64, 15, 98, 42, 51, 55, 69, 64, 45, 4, 39, 96, 39, 76, 69, 1, 121, 105, 44, 68, 124, 1, 117, 25, 85, 71, 78, 58, 15, 50, 109, 61, 17, 86, 13, 111, 28, 70, 77, 44, 28, 20, 68, 5, 87, 119, 112, 1, 38, 34, 63, 35, 88, 108, 10, 95, 47, 112, 98, 85, 98, 82, 24, 19, 6, 122, 104, 94, 10, 105, 90, 68, 73, 33, 63, 65, 79, 96, 115, 108, 120, 104, 70, 120, 73, 114, 6, 27};
        }

        private static byte[] ercbrysjxzxoxsz() {
            return new byte[]{-97, -69, 118, 33, 56, 27, 24, 72, 3, 53, 113, 94};
        }

        private static byte[] hzhtdboghthrmio() {
            return new byte[]{-97, -69, 118, 57, 56, 21, 24, 80, 3, 35, 113, 92, 51, 80, 82, 69, 120, 50, 48, 10};
        }

        private static byte[] npvpfuhwoeupldd() {
            return new byte[]{-97, -69, 118, 57, 56, 21, 24, 80, 3, 35, 113, 91, 51, 92, 82, 68, 120, 53, 48, 24, 94, 81};
        }

        private static byte[] byrloujdohkukdn() {
            return new byte[]{-97, -69, 118, 50, 56, 2, 24, 84, 3, 53, 113, 72, 51, 90, 82, 84};
        }

        private static byte[] nhzgjxdumiuayql() {
            return new byte[]{-97, -69, 118, 59, 56, 19, 24, 71, 3, 57, 113, 84, 51, 76, 82, 85, 120, 35, 48, 29, 94, 87, 118, 4, 53, 28, 40, 39, 112, 41, 8, 126, 6, 21, 12, 111, 97, 121, 93, 110, 114, 48};
        }

        private static byte[] ahymmejwyalgsit() {
            return new byte[]{-97, -69, 118, 62, 56, 10, 24, 91, 3, 48, 113, 83, 51, 82, 82, 89, 120, 40, 48, 17, 94, 81, 118, 19, 53, 15, 40, 39, 112, 51, 8, 124, 6, 17, 12, 98};
        }

        private static byte[] ybhwdnewzsjebjv() {
            return new byte[]{-97, -69, 118, 37, 56, 27, 24, 80, 3, 57, 113, 69, 51, 83, 82, 89, 120, 49, 48, 7, 94, 64, 118, 20, 53, 9, 40, 58, 112, 53, 8, 125, 6, 17, 12, 98, 97, 112, 93, 111};
        }

        private static byte[] favcxpqqpbufcsx() {
            return new byte[]{-97, -69, 118, 49, 56, 27, 24, 77, 3, 48, 113, 95, 51, 91, 82, 79, 120, 63, 48, 6, 94, 85, 118, 7, 53, 0, 40, 39, 112, 56, 8, 127, 6, 17};
        }

        private static byte[] vhiijcnlsibmugh() {
            return new byte[]{-97, -69, 118, 36, 56, 31, 24, 86, 3, 42, 113, 95, 51, 77, 82, 79, 120, 57, 48, 28, 94, 70, 118, 4, 53, 30};
        }

        private static byte[] ipnbiswigthcbpw() {
            return new byte[]{-97, -69, 118, 52, 56, 21, 24, 74, 3, 50, 113, 95, 51, 92, 82, 68, 120, 53, 48, 1, 94, 90, 118, 20, 53, 9, 40, 48, 112, 36, 8, 119, 6, 6};
        }

        private static int npyxgpkkoestwomz(int n, int n2) {
            return n ^ n2;
        }
    }
}

