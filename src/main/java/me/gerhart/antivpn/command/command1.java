/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.TabCompleter
 *  org.bukkit.entity.Player
 */
package me.gerhart.antivpn.command;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import me.gerhart.antivpn.Main;
import me.gerhart.antivpn.storage.storage1;
import me.gerhart.antivpn.util.utils1;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;

public class command1
implements CommandExecutor,
TabCompleter {
    private final Main plugin;
    private final storage1 storage;
    private static int L6gyWncsDg = 0;
    private transient int C0JjHb7nkp = 434222846;
    private static String zxjufkexoa;
    private static String[] nothing_to_see_here;

    public command1(Main main, storage1 storage12, int n) {
        storage1 storage13;
        Main main2;
        int n2 = 0x4A64A128 ^ 0x377DF6B4;
        command1 command12 = this;
        n2 = 0x3B05B701 ^ n2;
        n2 = 0x49EAAB7B ^ (0x59780238 ^ Integer.parseInt("1452165598"));
        this.C0JjHb7nkp = 0x19E1B6FE ^ L6gyWncsDg;
        n2 = 0x604BE97F ^ n2;
        n2 = 0x278C0288 ^ n2;
        command1 command13 = this;
        command13.plugin = main2 = main;
        n2 = 0x39CFC34F ^ n2;
        command1 command14 = this;
        command14.storage = storage13 = storage12;
        n2 = 0x45C5742F ^ n2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Handled duff style switch with additional control
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onCommand(CommandSender var1_1, Command var2_2, String var3_3, String[] var4_4) {
        block147: {
            block148: {
                block149: {
                    block146: {
                        block145: {
                            block154: {
                                block155: {
                                    block153: {
                                        block144: {
                                            block143: {
                                                block142: {
                                                    block141: {
                                                        block140: {
                                                            block139: {
                                                                block152: {
                                                                    block150: {
                                                                        block151: {
                                                                            var109_5 = 2089302948 ^ (1565357186 ^ 1870590550);
                                                                            var5_6 = var4_4;
                                                                            var10_7 = var5_6.length;
                                                                            var6_8 = (byte)(49601862 ^ (var109_5 = 1280270391 ^ var109_5));
                                                                            if (var10_7 != var6_8) break block150;
                                                                            var11_9 = var4_4;
                                                                            var83_10 = (byte)(2137200389 ^ (var109_5 = 2107099714 ^ var109_5));
                                                                            var12_11 = var11_9[var83_10];
                                                                            var84_12 = command1.cxrdpxygtw(command1.npoghmsyjcbbqkb(), var109_5);
                                                                            var13_13 = var12_11.equalsIgnoreCase(var84_12);
                                                                            if (var13_13 == (2137200389 ^ var109_5)) break block151;
                                                                            var14_14 = var1_1;
                                                                            var15_15 = var14_14 instanceof Player;
                                                                            if (var15_15 == (1527868207 ^ (var109_5 = 611482666 ^ var109_5))) {
                                                                                var109_5 = 1912723319 ^ var109_5;
                                                                                return (boolean)((byte)(688962649 ^ var109_5));
                                                                            }
                                                                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = command1.dphlexxdmttclcqw(var109_5, 205757442)) != -1164461718) {
                                                                                var109_5 = 85141399 ^ var109_5;
                                                                                throw new IllegalAccessException();
                                                                            }
                                                                            break block152;
                                                                        }
                                                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 363905489 ^ var109_5) == 1453242019) break block153;
                                                                        break block154;
                                                                    }
                                                                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = command1.dphlexxdmttclcqw(var109_5, 575667895)) != 98115457) {
                                                                        var109_5 = 1929048906 ^ var109_5;
                                                                        throw new IllegalAccessException();
                                                                    }
                                                                    var109_5 = command1.dphlexxdmttclcqw(var109_5, 1320992695);
                                                                    cfr_temp_0 = 850857778;
                                                                    break block155;
                                                                }
                                                                block87: while (true) {
                                                                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                                        case 2075904576: {
                                                                            continue block87;
                                                                        }
                                                                        case 154200501: {
                                                                            var109_5 = 461851399 ^ var109_5;
                                                                        }
                                                                        case 114625248: {
                                                                            var17_17 = var1_1;
                                                                            var7_19 = var18_18 = (Player)var17_17;
                                                                            var109_5 = 1017323240 ^ var109_5;
                                                                            var19_20 = var7_19;
                                                                            var85_21 = command1.cxrdpxygtw(command1.ozpuklpjsozzfwf(), var109_5);
                                                                            var20_22 = var19_20.hasPermission(var85_21);
                                                                            if (var20_22 == (1886823106 ^ var109_5)) {
                                                                                var109_5 = 1760509454 ^ var109_5;
                                                                                var34_23 = this;
                                                                                var35_24 = var34_23.plugin;
                                                                                var104_26 = var36_25 = var35_24.getNoPermission(207927885);
                                                                                var109_5 = 1860546125 ^ var109_5;
                                                                                var37_27 = var104_26;
                                                                                if (var37_27 == null) break block139;
                                                                                var109_5 = 313979678 ^ var109_5;
                                                                                var38_28 = var104_26;
                                                                                var39_29 = var38_28.isEmpty();
                                                                                if (var39_29 == (1691009439 ^ var109_5)) {
                                                                                    var109_5 = 17189459 ^ var109_5;
                                                                                    var40_30 = var7_19;
                                                                                    var90_31 = var104_26;
                                                                                    var91_32 = utils1.parse(var90_31, 1659201516);
                                                                                    var40_30.sendMessage(var91_32);
                                                                                    var109_5 = 791024027 ^ var109_5;
                                                                                    return (boolean)((byte)(1256888918 ^ var109_5));
                                                                                }
                                                                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 2120955930 ^ var109_5) == -720384984) break block140;
                                                                                break block141;
                                                                            }
                                                                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 1598681316 ^ var109_5) != 2046464305) {
                                                                                var109_5 = 2105442972 ^ var109_5;
                                                                                throw new IllegalAccessException();
                                                                            }
                                                                            var109_5 = 556332752 ^ var109_5;
                                                                            var21_34 = this;
                                                                            var22_35 = var21_34.storage;
                                                                            var86_36 = var7_19;
                                                                            var87_37 = var86_36.getUniqueId();
                                                                            var23_38 = var22_35.toggleNotify(var87_37, 1608998044);
                                                                            var8_39 = var23_38;
                                                                            var24_40 = var8_39;
                                                                            if (var24_40 == (564198596 ^ (var109_5 = 800544818 ^ var109_5))) break block142;
                                                                            var109_5 = 268301706 ^ var109_5;
                                                                            var25_41 = this;
                                                                            var26_42 = var25_41.plugin;
                                                                            var82_43 = var26_42.getToggleOn(1044908726);
                                                                            var109_5 = 1276103453 ^ var109_5;
                                                                            try {
                                                                                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5) == 243284690) throw new IllegalAccessException();
                                                                                throw null;
                                                                            }
                                                                            catch (IllegalAccessException v0) {
                                                                                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var109_5)) {
                                                                                    case 311825051: {
                                                                                        var109_5 = 1334936474 ^ var109_5;
                                                                                        ** GOTO lbl93
                                                                                    }
                                                                                    case 1378726202: {
                                                                                        var109_5 = command1.dphlexxdmttclcqw(var109_5, 1736898542);
lbl93:
                                                                                        // 2 sources

                                                                                        var109_5 = command1.dphlexxdmttclcqw(var109_5, 1060080243);
                                                                                        ** GOTO lbl150
                                                                                    }
                                                                                }
                                                                                throw new IllegalAccessException("Error in hash");
                                                                            }
                                                                        }
                                                                        default: {
                                                                            throw new IllegalAccessException();
                                                                        }
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            block89: while (true) {
                                                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                                    case 1458581599: {
                                                                        continue block89;
                                                                    }
                                                                    case 93378469: {
                                                                        var109_5 = 211669200 ^ var109_5;
                                                                    }
                                                                    case 1928503137: {
                                                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) == -686878069) {
                                                                            var109_5 = 806057990 ^ var109_5;
                                                                            return (boolean)((byte)(1256888918 ^ var109_5));
                                                                        }
                                                                        var109_5 = 681587435 ^ var109_5;
                                                                        throw new IllegalAccessException();
                                                                    }
                                                                    default: {
                                                                        throw new IllegalAccessException();
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        block90: while (true) {
                                                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                                case 339046040: {
                                                                    continue block90;
                                                                }
                                                                case 351595676: {
                                                                    return (boolean)((byte)(1256888918 ^ var109_5));
                                                                }
                                                                case 60410320: {
                                                                    var109_5 = 1347118034 ^ var109_5;
                                                                    return (boolean)((byte)(1256888918 ^ var109_5));
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        throw new IllegalAccessException();
                                                    }
                                                    block91: while (true) {
                                                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                            case 968102587: {
                                                                continue block91;
                                                            }
                                                            case 60410320: {
                                                                var109_5 = 1222650175 ^ var109_5;
                                                                throw new IllegalAccessException();
                                                            }
                                                            default: {
                                                                throw new IllegalAccessException();
                                                            }
                                                        }
                                                        break;
                                                    }
                                                }
                                                block92: while (true) {
                                                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                        case 1985336820: {
                                                            continue block92;
                                                        }
                                                        case 19384347: {
                                                            var109_5 = 1170711447 ^ var109_5;
                                                        }
                                                        case 1118535538: {
                                                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) != 591067803) {
                                                                var109_5 = command1.dphlexxdmttclcqw(var109_5, 908496873);
                                                                throw new IllegalAccessException();
                                                            }
                                                            var109_5 = command1.dphlexxdmttclcqw(var109_5, 232746488);
                                                            var32_44 = this;
                                                            var33_45 = var32_44.plugin;
                                                            var82_43 = var33_45.getToggleOff(1407350436);
                                                            var109_5 = 2069166353 ^ var109_5;
lbl150:
                                                            // 2 sources

                                                            var9_46 = var82_43;
                                                            var109_5 = 1240246914 ^ var109_5;
                                                            var27_47 = var9_46;
                                                            if (var27_47 == null) break block143;
                                                            var109_5 = 867096212 ^ var109_5;
                                                            var28_48 = var9_46;
                                                            var29_49 = var28_48.isEmpty();
                                                            if (var29_49 == (1756280748 ^ var109_5)) {
                                                                var109_5 = 758873629 ^ var109_5;
                                                                var30_50 = var7_19;
                                                                var88_51 = var9_46;
                                                                var89_52 = utils1.parse(var88_51, 1659201516);
                                                                var30_50.sendMessage(var89_52);
                                                                var109_5 = 622387333 ^ var109_5;
                                                                return (boolean)((byte)(1619863861 ^ var109_5));
                                                            }
                                                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = command1.dphlexxdmttclcqw(var109_5, 2143621110)) == -1151483184) {
                                                                var109_5 = command1.dphlexxdmttclcqw(var109_5, 2011599214);
                                                                return (boolean)((byte)(1619863861 ^ var109_5));
                                                            }
                                                            break block144;
                                                        }
                                                        default: {
                                                            throw new IllegalAccessException();
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                            block94: while (true) {
                                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                    case 1537088516: {
                                                        continue block94;
                                                    }
                                                    case 5302108: {
                                                        var109_5 = 1689899585 ^ var109_5;
                                                    }
                                                    case 414846431: {
                                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) == -36856887) {
                                                            var109_5 = command1.dphlexxdmttclcqw(var109_5, 1597282893);
                                                            return (boolean)((byte)(1619863861 ^ var109_5));
                                                        }
                                                        var109_5 = command1.dphlexxdmttclcqw(var109_5, 1844995011);
                                                        throw new IllegalAccessException();
                                                    }
                                                    default: {
                                                        throw new IllegalAccessException();
                                                    }
                                                }
                                                break;
                                            }
                                        }
                                        block95: while (true) {
                                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                                case 1357512026: {
                                                    continue block95;
                                                }
                                                case 224436805: {
                                                    var109_5 = 1160407264 ^ var109_5;
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                            break;
                                        }
                                        throw new IllegalAccessException();
                                    }
                                    block96: while (true) {
                                        cfr_temp_0 = 0;
lbl198:
                                        // 2 sources

                                        while (true) {
                                            switch (cfr_temp_0 == 0 ? sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5) : cfr_temp_0) {
                                                case 1064277832: {
                                                    continue block96;
                                                }
                                                case 251271913: {
                                                    var109_5 = 81021587 ^ var109_5;
                                                }
                                                case 850857778: {
                                                    var42_54 = var4_4;
                                                    var43_55 = var42_54.length;
                                                    var92_56 = (byte)(1845992518 ^ var109_5);
                                                    if (var43_55 == var92_56) {
                                                        var44_57 = var4_4;
                                                        var93_58 = (byte)(2007574362 ^ (var109_5 = 430881565 ^ var109_5));
                                                        var45_59 = var44_57[var93_58];
                                                        var94_60 = command1.cxrdpxygtw(command1.bvdsprvpbsdpwvz(), var109_5);
                                                        var46_61 = var45_59.equalsIgnoreCase(var94_60);
                                                        if (var46_61 != (2007574362 ^ var109_5)) {
                                                            var47_62 = var1_1;
                                                            var48_63 = var47_62 instanceof Player;
                                                            if (var48_63 == (1762883376 ^ (var109_5 = 515526762 ^ var109_5))) {
                                                                var109_5 = 1990673001 ^ var109_5;
                                                                var49_64 = this;
                                                                var50_65 = var49_64.plugin;
                                                                var50_65.reloadPluginConfig(1475505248);
                                                                var109_5 = 451369171 ^ var109_5;
                                                                var51_66 = this;
                                                                var52_67 = var51_66.plugin;
                                                                var102_69 = var53_68 = var52_67.getReloadMsg(1771276928);
                                                                var109_5 = 1333340059 ^ var109_5;
                                                                var54_70 = var102_69;
                                                                if (var54_70 != null) {
                                                                    var109_5 = 2009289551 ^ var109_5;
                                                                    var55_71 = var102_69;
                                                                    var56_72 = var55_71.isEmpty();
                                                                    if (var56_72 != (1038686558 ^ var109_5)) break block145;
                                                                    var109_5 = 2056464242 ^ var109_5;
                                                                    var57_73 = var1_1;
                                                                    var95_74 = var102_69;
                                                                    var96_75 = utils1.parse(var95_74, 1659201516);
                                                                    var57_73.sendMessage(var96_75);
                                                                    var109_5 = 330396369 ^ var109_5;
                                                                    return (boolean)((byte)(1422609660 ^ var109_5));
                                                                }
                                                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = command1.dphlexxdmttclcqw(var109_5, 206380027)) != 859475794) {
                                                                    var109_5 = command1.dphlexxdmttclcqw(var109_5, 338067792);
                                                                    throw new IllegalAccessException();
                                                                }
                                                                break block146;
                                                            }
                                                        } else {
                                                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 357821995 ^ var109_5) != 399920011) {
                                                                var109_5 = command1.dphlexxdmttclcqw(var109_5, 817568203);
                                                                throw new IllegalAccessException();
                                                            }
                                                            var109_5 = command1.dphlexxdmttclcqw(var109_5, 1718314793);
                                                            return (boolean)((byte)(76656216 ^ var109_5));
                                                        }
                                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 1855422938 ^ var109_5) != 1009235792) {
                                                            var109_5 = command1.dphlexxdmttclcqw(var109_5, 1438983760);
                                                            ** break;
                                                        }
                                                        var109_5 = 2106269982 ^ var109_5;
                                                        var59_77 = var1_1;
                                                        var103_79 = var60_78 = (Player)var59_77;
                                                        var109_5 = 1223139882 ^ var109_5;
                                                        var61_80 = var103_79;
                                                        var97_81 = command1.cxrdpxygtw(command1.vtjflxftvxvfhjh(), var109_5);
                                                        var62_82 = var61_80.hasPermission(var97_81);
                                                        if (var62_82 != (854095326 ^ var109_5)) break block147;
                                                        var109_5 = 1390083301 ^ var109_5;
                                                        var63_83 = this;
                                                        var64_84 = var63_83.plugin;
                                                        var105_86 = var65_85 = var64_84.getNoPermission(207927885);
                                                        var109_5 = 153039355 ^ var109_5;
                                                        var66_87 = var105_86;
                                                        if (var66_87 == null) break block148;
                                                        var109_5 = 1041931190 ^ var109_5;
                                                        var67_88 = var105_86;
                                                        var68_89 = var67_88.isEmpty();
                                                        if (var68_89 == (1463231350 ^ var109_5)) {
                                                            var109_5 = 1829841777 ^ var109_5;
                                                            var69_90 = var103_79;
                                                            var98_91 = var105_86;
                                                            var99_92 = utils1.parse(var98_91, 1659201516);
                                                            var69_90.sendMessage(var99_92);
                                                            var109_5 = 1687763601 ^ var109_5;
                                                            return (boolean)((byte)(1589588631 ^ var109_5));
                                                        }
                                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 963208596 ^ var109_5) != 1928476435) {
                                                            var109_5 = 1008703064 ^ var109_5;
                                                            throw new IllegalAccessException();
                                                        }
                                                        break block149;
                                                    }
                                                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 1045238131 ^ var109_5) != -2108397150) {
                                                        var109_5 = 34299278 ^ var109_5;
                                                    } else {
                                                        var109_5 = 1423647596 ^ var109_5;
                                                        return (boolean)((byte)(76656216 ^ var109_5));
                                                    }
                                                }
                                                default: {
                                                    throw new IllegalAccessException();
                                                }
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                }
                                ** while (true)
                            }
                            block98: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                    case 629087588: {
                                        continue block98;
                                    }
                                    case 251271913: {
                                        var109_5 = 949093998 ^ var109_5;
                                        throw new IllegalAccessException();
                                    }
                                }
                                break;
                            }
                            throw new IllegalAccessException();
                        }
                        block100: while (true) {
                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                                case 1088223018: {
                                    continue block100;
                                }
                                case 133405903: {
                                    var109_5 = 422332086 ^ var109_5;
                                }
                                case 1013742345: {
                                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) == 640352065) {
                                        var109_5 = 1879970581 ^ var109_5;
                                        return (boolean)((byte)(1422609660 ^ var109_5));
                                    }
                                    var109_5 = command1.dphlexxdmttclcqw(var109_5, 1988398930);
                                    throw new IllegalAccessException();
                                }
                                default: {
                                    throw new IllegalAccessException();
                                }
                            }
                            break;
                        }
                    }
                    block101: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                            case 787147858: {
                                continue block101;
                            }
                            case 1683829002: {
                                return (boolean)((byte)(1422609660 ^ var109_5));
                            }
                            case 141060306: {
                                var109_5 = 313269527 ^ var109_5;
                                return (boolean)((byte)(1422609660 ^ var109_5));
                            }
                        }
                        break;
                    }
                    throw new IllegalAccessException();
                }
                block103: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                        case 1932890757: {
                            continue block103;
                        }
                        case 1289297174: {
                            return (boolean)((byte)(1589588631 ^ var109_5));
                        }
                        case 97961739: {
                            var109_5 = 820081780 ^ var109_5;
                            return (boolean)((byte)(1589588631 ^ var109_5));
                        }
                        default: {
                            throw new IllegalAccessException();
                        }
                    }
                    break;
                }
            }
            block104: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                    case 662230788: {
                        continue block104;
                    }
                    case 197721305: {
                        var109_5 = 869298248 ^ var109_5;
                    }
                    case 947792702: {
                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) != -672250814) break block104;
                        var109_5 = 71498270 ^ var109_5;
                        return (boolean)((byte)(1589588631 ^ var109_5));
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
                break;
            }
            block105: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                    case 1407595819: {
                        continue block105;
                    }
                    case 4976250: {
                        var109_5 = 146544690 ^ var109_5;
                        throw new IllegalAccessException();
                    }
                    default: {
                        throw new IllegalAccessException();
                    }
                }
                break;
            }
        }
        block106: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                case 102727951: {
                    continue block106;
                }
                case 44193462: {
                    var109_5 = 1200301582 ^ var109_5;
                }
                case 754318455: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) == -1424318845) break block106;
                    var109_5 = command1.dphlexxdmttclcqw(var109_5, 656573290);
                    throw new IllegalAccessException();
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
            break;
        }
        block107: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                case 875520069: {
                    continue block107;
                }
                case 0x3700700: {
                    var109_5 = 690975355 ^ var109_5;
                }
                case 302470301: {
                    var71_94 = this;
                    var72_95 = var71_94.plugin;
                    var72_95.reloadPluginConfig(1475505248);
                    var109_5 = 2130286156 ^ var109_5;
                    var73_96 = this;
                    var74_97 = var73_96.plugin;
                    var106_99 = var75_98 = var74_97.getReloadMsg(1771276928);
                    var109_5 = 177500206 ^ var109_5;
                    var76_100 = var106_99;
                    if (var76_100 != null) {
                        var109_5 = 950688222 ^ var109_5;
                        var77_101 = var106_99;
                        var78_102 = var77_101.isEmpty();
                        if (var78_102 == (277585431 ^ var109_5)) {
                            var109_5 = 454949693 ^ var109_5;
                            var79_103 = var103_79;
                            var100_104 = var106_99;
                            var101_105 = utils1.parse(var100_104, 1659201516);
                            var79_103.sendMessage(var101_105);
                            var109_5 = 1982129576 ^ var109_5;
                            return (boolean)((byte)(2108850307 ^ var109_5));
                        } else {
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5 = 1223021650 ^ var109_5) != -1015918038) {
                                var109_5 = 170892031 ^ var109_5;
                                ** break;
                            }
                            var109_5 = 635226823 ^ var109_5;
                        }
                        return (boolean)((byte)(2108850307 ^ var109_5));
                    }
                    block109: while (true) {
                        switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var109_5)) {
                            case 1248014156: {
                                continue block109;
                            }
                            case 230775604: {
                                var109_5 = 558546009 ^ var109_5;
                            }
                            case 1269658114: {
                                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var109_5) == 1264311424) {
                                    var109_5 = command1.dphlexxdmttclcqw(var109_5, 1960442642);
                                    return (boolean)((byte)(2108850307 ^ var109_5));
                                }
                                var109_5 = 1529522986 ^ var109_5;
                                ** break;
                            }
                        }
                        break;
                    }
                }
            }
            break;
        }
lbl420:
        // 6 sources

        throw new IllegalAccessException();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public List<String> onTabComplete(CommandSender commandSender, Command command, String string, String[] stringArray) {
        ArrayList<String> arrayList;
        int n = 0x7CB9992F ^ (0x73034A2F ^ 0x6F7EF256);
        n = 0x64C30EE8 ^ n;
        ArrayList<String> arrayList2 = arrayList = new ArrayList<String>();
        CommandSender commandSender2 = commandSender;
        int n2 = commandSender2 instanceof Player;
        if (n2 != (0x16151576 ^ (n = 0x12123AC8 ^ n))) {
            n = 0x6011FEC1 ^ n;
            CommandSender commandSender3 = commandSender;
            Player player = (Player)commandSender3;
            String string2 = command1.cxrdpxygtw(command1.ryilwwykqqfoqky(), n);
            int n3 = player.hasPermission(string2);
            if (n3 == (0x7604EBB7 ^ n)) {
                n = 0x3C61BBAC ^ n;
                return arrayList2;
            } else {
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = 0x473AE1B2 ^ n) != -1980739543) {
                    n = command1.dphlexxdmttclcqw(n, 645413811);
                    throw new IllegalAccessException();
                }
                String[] stringArray2 = stringArray;
                int n4 = stringArray2.length;
                byte by = (byte)(0x17AEF7A9 ^ (n = command1.dphlexxdmttclcqw(n, 647036333)));
                if (n4 == by) {
                    n = 0x9DA49CF ^ n;
                    ArrayList<String> arrayList3 = arrayList2;
                    String string3 = command1.cxrdpxygtw(command1.qpnkhfocgvlxfhc(), n);
                    boolean bl = arrayList3.add(string3);
                    n = 0x61C39BB2 ^ n;
                    ArrayList<String> arrayList4 = arrayList2;
                    String string4 = command1.cxrdpxygtw(command1.mtqtktsuaxtvteb(), n);
                    boolean bl2 = arrayList4.add(string4);
                    n = 0x4C8A535F ^ n;
                    return arrayList2;
                } else {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = command1.dphlexxdmttclcqw(n, 1946469092)) != 491891299) {
                        n = command1.dphlexxdmttclcqw(n, 1961624826);
                        throw new IllegalAccessException();
                    }
                    n = 0x509743C6 ^ n;
                }
                return arrayList2;
            }
        }
        block10: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                case 1257669905: {
                    continue block10;
                }
                case 180932481: {
                    n = 0x6A837E30 ^ n;
                }
                case 1529536563: {
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n) != -458008013) break block10;
                    n = command1.dphlexxdmttclcqw(n, 921910109);
                    return arrayList2;
                }
                default: {
                    throw new IllegalAccessException();
                }
            }
            break;
        }
        block11: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                case 2106635175: {
                    continue block11;
                }
                case 23270209: {
                    n = 0x6BD05AF0 ^ n;
                    throw new IllegalAccessException();
                }
            }
            break;
        }
        throw new IllegalAccessException();
    }

    static {
        nothing_to_see_here = new String[18];
        command1.nothing_to_see_here[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f6\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u283f\u281f\u281b\u283b\u28ff\u2806\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u28c0\u28c0\u2800\u28ff\u2802\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u283b\u28ff\u28ff\u28ff\u2805\u281b\u280b\u2808\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[5] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2818\u28bc\u28ff\u28ff\u28ff\u28c3\u2820\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[6] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28df\u287f\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[7] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28db\u28db\u28eb\u2844\u2800\u28b8\u28e6\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[8] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28e0\u28f4\u28fe\u2846\u2838\u28ff\u28ff\u28ff\u2877\u2802\u2828\u28ff\u28ff\u28ff\u28ff\u28f6\u28e6\u28e4\u28c0\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e4\u28fe\u28ff\u28ff\u28ff\u28ff\u2847\u2880\u28ff\u287f\u280b\u2801\u2880\u2876\u282a\u28c9\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u28b8\u28ff\u28f7\u28ff\u28ff\u28f7\u28e6\u2859\u28ff\u28ff\u28ff\u28ff\u28ff\u284f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c7\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28a0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2838\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        command1.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b9\u28ff\u28f5\u28fe\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ef\u2841\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        zxjufkexoa = ByteBuffer.wrap(command1.plseiqxdqzxcbef()).asCharBuffer().toString();
        int n = new Random(-7014192278815676293L).nextInt();
        L6gyWncsDg = 0x33276673 ^ n;
    }

    public static String cxrdpxygtw(byte[] byArray, int n) {
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
        String string2 = zxjufkexoa;
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

    private static byte[] ozpuklpjsozzfwf() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 0};
    }

    private static byte[] vtjflxftvxvfhjh() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 13};
    }

    private static byte[] bvdsprvpbsdpwvz() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 26};
    }

    private static byte[] npoghmsyjcbbqkb() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 32};
    }

    private static byte[] mtqtktsuaxtvteb() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 38};
    }

    private static byte[] ryilwwykqqfoqky() {
        return new byte[]{0, 0, 0, 13, 0, 0, 0, 44};
    }

    private static byte[] qpnkhfocgvlxfhc() {
        return new byte[]{0, 0, 0, 6, 0, 0, 0, 57};
    }

    private static byte[] plseiqxdqzxcbef() {
        return new byte[]{49, 89, 56, 88, 56, 70, 51, 88, 48, 64, 49, 72, 56, 88, 56, 28, 51, 80, 48, 82, 49, 85, 56, 95, 56, 92, 56, 84, 52, 94, 57, 65, 51, 91, 54, 78, 53, 68, 48, 87, 53, 29, 50, 87, 56, 81, 52, 93, 57, 92, 51, 92, 50, 66, 48, 82, 53, 91, 52, 92, 54, 83, 50, 84, 50, 69, 51, 88, 50, 87, 48, 84, 56, 85, 50, 84, 50, 67, 52, 87, 55, 92, 57, 93, 48, 84, 50, 85, 49, 88, 56, 94, 48, 71, 51, 80, 55, 67, 49, 73, 56, 94, 48, 29, 51, 88, 55, 81, 49, 84, 56, 89, 48, 93, 53, 69, 48, 86, 54, 80, 51, 94, 57, 89, 49, 85};
    }

    private static int dphlexxdmttclcqw(int n, int n2) {
        return n ^ n2;
    }
}

