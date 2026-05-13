/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.EntityScheduler
 *  io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler
 *  io.papermc.paper.threadedregions.scheduler.ScheduledTask
 *  net.kyori.adventure.text.Component
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent
 *  org.bukkit.event.player.PlayerLoginEvent
 *  org.bukkit.event.player.PlayerLoginEvent$Result
 *  org.bukkit.plugin.Plugin
 */
package me.gerhart.antivpn.listener;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import io.papermc.paper.threadedregions.scheduler.EntityScheduler;
import io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler;
import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import java.io.IOException;
import java.net.InetAddress;
import java.net.http.HttpClient;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import me.gerhart.antivpn.Main;
import me.gerhart.antivpn.storage.storage1;
import me.gerhart.antivpn.util.utils1;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;

public class listener1
implements Listener {
    private final Main plugin;
    private final storage1 storage;
    private final HttpClient client;
    private final ConcurrentHashMap<String, Long> blockedIps;
    private static final long TTL;
    private static int rGvac7Sd7x = 0;
    private transient int aSGoQfmLen = 373464862;
    private static String[] nothing_to_see_here;

    public listener1(Main main, storage1 storage12, int n) {
        HttpClient httpClient;
        storage1 storage13;
        Main main2;
        int n2 = 0x100F4102 ^ 0x2EF50DBB;
        listener1 listener12 = this;
        n2 = listener1.wxequxfawwljkght(n2, 1436306534);
        n2 = 0x3A4BB88E ^ (0x2F9E8566 ^ Integer.parseInt("2125675831"));
        this.aSGoQfmLen = 0x16429F1E ^ rGvac7Sd7x;
        n2 = 0x4D91489B ^ n2;
        n2 = 0x181A9C6C ^ n2;
        listener1 listener13 = this;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        listener13.blockedIps = concurrentHashMap;
        n2 = 0x6BA9D186 ^ n2;
        listener1 listener14 = this;
        listener14.plugin = main2 = main;
        n2 = 0x562C1EDE ^ n2;
        listener1 listener15 = this;
        listener15.storage = storage13 = storage12;
        n2 = 0x28829D34 ^ n2;
        listener1 listener16 = this;
        HttpClient.Builder builder = HttpClient.newBuilder();
        long l = 5L;
        Duration duration = Duration.ofSeconds(l);
        HttpClient.Builder builder2 = builder.connectTimeout(duration);
        listener16.client = httpClient = builder2.build();
        n2 = 0x49805DB0 ^ n2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @EventHandler
    public void onPreLogin(AsyncPlayerPreLoginEvent var1_1) {
        block23: {
            var32_2 = 1818276213 ^ (476489790 ^ 331248892);
            var32_2 = 2065426040 ^ var32_2;
            var2_3 = var1_1;
            var10_4 = var2_3.getAddress();
            if (var10_4 != null) break block23;
            var32_2 = 951399924 ^ var32_2;
            var24_5 = null;
            var32_2 = listener1.wxequxfawwljkght(var32_2, 932028134);
            try {
                if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var32_2) == 230463543) throw new IOException();
                throw null;
            }
            catch (IOException v0) {
                switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(var32_2)) {
                    case 1445985995: {
                        var32_2 = listener1.wxequxfawwljkght(var32_2, 1555315189);
                        ** GOTO lbl19
                    }
                    case -1126627608: {
                        var32_2 = listener1.wxequxfawwljkght(var32_2, 569042673);
lbl19:
                        // 2 sources

                        var32_2 = 882134189 ^ var32_2;
                        ** GOTO lbl31
                    }
                }
                throw new IOException("Error in hash");
            }
        }
        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var32_2 = 472580324 ^ var32_2) != 608459096) {
            var32_2 = listener1.wxequxfawwljkght(var32_2, 541766148);
            throw new IOException();
        } else {
            var32_2 = 1438672048 ^ var32_2;
            var22_6 = var1_1;
            var23_7 = var22_6.getAddress();
            var24_5 = var23_7.getHostAddress();
            var32_2 = 1403872538 ^ var32_2;
lbl31:
            // 2 sources

            var8_8 = var24_5;
            var32_2 = 608171676 ^ var32_2;
            var11_9 = var8_8;
            if (var11_9 == null) {
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var32_2 = 209719552 ^ var32_2) != 1389586665) {
                    var32_2 = 244864050 ^ var32_2;
                    throw new IOException();
                }
            } else {
                var32_2 = 1468955948 ^ var32_2;
                var12_10 = var8_8;
                var13_11 = var12_10.isEmpty();
                if (var13_11 != (1901330737 ^ var32_2)) {
                    var32_2 = 1397940487 ^ var32_2;
                    return;
                }
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var32_2 = listener1.wxequxfawwljkght(var32_2, 563079422)) != -2032185734) {
                    var32_2 = listener1.wxequxfawwljkght(var32_2, 1947848928);
                    throw new IOException();
                }
                var32_2 = listener1.wxequxfawwljkght(var32_2, 1292815242);
                var14_12 = this;
                var3_13 = var8_8;
                var15_14 = var14_12.isCachedBlocked(var3_13, 1074197124);
                if (var15_14 != (500507205 ^ var32_2)) {
                    var32_2 = 512970810 ^ var32_2;
                    return;
                }
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var32_2 = 1134178007 ^ var32_2) != -226990958) {
                    var32_2 = 2056074685 ^ var32_2;
                    throw new IOException();
                }
                var32_2 = 2045719992 ^ var32_2;
                var16_15 = this;
                var25_16 = var8_8;
                var17_17 = var16_15.isVpnOrProxy(var25_16, 2140815876);
                var9_18 = var17_17;
                var18_19 = var9_18;
                if (var18_19 != (945557104 ^ (var32_2 = 536622938 ^ var32_2))) {
                    var32_2 = 468168225 ^ var32_2;
                    var19_20 = this;
                    var20_21 = var19_20.blockedIps;
                    var26_22 = var8_8;
                    var4_23 = System.currentTimeMillis();
                    var6_24 = listener1.TTL;
                    var27_25 = var4_23 + var6_24;
                    var29_26 = var27_25;
                    var21_27 = var20_21.put(var26_22, var29_26);
                    var32_2 = 1407126005 ^ var32_2;
                    return;
                }
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(var32_2 = 1873549794 ^ var32_2) != -1082082158) {
                    var32_2 = 1932668605 ^ var32_2;
                    throw new IOException();
                }
                var32_2 = 664059446 ^ var32_2;
                return;
            }
            block11: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(var32_2)) {
                    case 1960650210: {
                        continue block11;
                    }
                    case 1666517878: {
                        return;
                    }
                    case 34543922: {
                        var32_2 = 140283179 ^ var32_2;
                        return;
                    }
                }
                break;
            }
        }
        throw new IOException();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler
    public void onLogin(PlayerLoginEvent playerLoginEvent) {
        Player player;
        int n;
        block22: {
            Throwable throwable;
            Throwable throwable22;
            String string;
            block21: {
                String string2;
                Player player2;
                n = 0x17D7D0EA ^ (0x6B5D1F07 ^ 0x13BE74FC);
                n = 0x7A3A5DBA ^ n;
                PlayerLoginEvent playerLoginEvent2 = playerLoginEvent;
                player = player2 = playerLoginEvent2.getPlayer();
                n = 0x1B8CD45C ^ n;
                Player player3 = player;
                String string3 = listener1.rjsagyddfz(listener1.upvuadwlxezqawf(), listener1.nyrboykfyrtpieg(), n);
                int n2 = player3.hasPermission(string3);
                if (n2 != (0xE8232F7 ^ n)) {
                    n = 0x2219B340 ^ n;
                    return;
                }
                if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = listener1.wxequxfawwljkght(n, 246421323)) != 26291680) {
                    n = listener1.wxequxfawwljkght(n, 1049269768);
                    throw new RuntimeException();
                }
                block17: while (true) {
                    switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                        case 412091615: {
                            continue block17;
                        }
                        case 3081042: {
                            n = 0x4AF82C40 ^ n;
                        }
                        case 1229840879: {
                            int n3;
                            String string4;
                            PlayerLoginEvent playerLoginEvent3 = playerLoginEvent;
                            InetAddress inetAddress = playerLoginEvent3.getAddress();
                            String string5 = string4 = inetAddress.getHostAddress();
                            n = 0x2693779F ^ n;
                            listener1 listener12 = this;
                            String string6 = string5;
                            int n4 = n3 = listener12.isCachedBlocked(string6, 1074197124);
                            n = 0x217073D ^ n;
                            int n5 = n4;
                            if (n5 == (0x6E4E795E ^ n)) {
                                n = 0x66FFB8D2 ^ n;
                                return;
                            }
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = listener1.wxequxfawwljkght(n, 19026058)) == 2069974691) break block17;
                            n = 0x51D49A60 ^ n;
                        }
                        default: {
                            throw new RuntimeException();
                        }
                    }
                    break;
                }
                n = 0x15AFB695 ^ n;
                String string7 = listener1.rjsagyddfz(listener1.jvnbaieyqrxmbnp(), listener1.nyrboykfyrtpieg(), n);
                listener1 listener13 = this;
                Main main = listener13.plugin;
                List list = main.getBlockScreen(377616192);
                string = string2 = String.join((CharSequence)string7, list);
                n = 0x260E5A5F ^ n;
                try {
                    Component component;
                    String string8 = string;
                    Component component2 = component = utils1.parse(string8, 1659201516);
                    n = 0x4395E423 ^ n;
                    PlayerLoginEvent playerLoginEvent4 = playerLoginEvent;
                    PlayerLoginEvent.Result result = PlayerLoginEvent.Result.KICK_OTHER;
                    Component component3 = component2;
                    playerLoginEvent4.disallow(result, component3);
                    n = 0x776618CD ^ n;
                }
                catch (Throwable throwable22) {
                    switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n)) {
                        default: {
                            throw new RuntimeException("Error in hash");
                        }
                        case -88012312: {
                            n = 0x2A723E9 ^ n;
                            break;
                        }
                        case -428988174: {
                            n = 0x4132C7CA ^ n;
                            break;
                        }
                    }
                    break block21;
                }
                n = 0x1F412451 ^ n;
                try {
                    if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n) == 126238232) throw new IllegalAccessException();
                    throw null;
                }
                catch (IllegalAccessException illegalAccessException) {
                    switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n)) {
                        case -1141314293: {
                            n = 0x409211BC ^ n;
                            break;
                        }
                        default: {
                            throw new IllegalAccessException("Error in hash");
                        }
                        case 978837753: {
                            n = 0x10A7F002 ^ n;
                        }
                    }
                    n = listener1.wxequxfawwljkght(n, 1487235246);
                }
                break block22;
            }
            Throwable throwable3 = throwable = throwable22;
            n = 0x102052A5 ^ n;
            PlayerLoginEvent playerLoginEvent5 = playerLoginEvent;
            PlayerLoginEvent.Result result = PlayerLoginEvent.Result.KICK_OTHER;
            String string9 = string;
            playerLoginEvent5.disallow(result, string9);
            n = 0x629734C2 ^ n;
        }
        listener1 listener14 = this;
        Player player4 = player;
        String string = player4.getName();
        listener14.notifyAdmins(string, 1265336505);
        n = 0x39B84660 ^ n;
    }

    /*
     * Exception decompiling
     */
    private boolean isVpnOrProxy(String var1_1, int var2_2) {
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
     */
    private boolean isCachedBlocked(String string, int n) {
        Long l;
        Long l2;
        int n2 = 0x4721AF6F ^ (0x2963B2F ^ 0x13BE74FC);
        n2 = 0x76309D11 ^ n2;
        listener1 listener12 = this;
        ConcurrentHashMap<String, Long> concurrentHashMap = listener12.blockedIps;
        String string2 = string;
        Long l3 = l2 = (l = concurrentHashMap.get(string2));
        n2 = 0x4434A0D ^ n2;
        Long l4 = l3;
        if (l4 == null) {
            n2 = 0x64E3EB27 ^ n2;
            return (byte)(0x4099DC87 ^ n2) != 0;
        }
        block9: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                case 511579796: {
                    continue block9;
                }
                case 111996860: {
                    n2 = 0x17357BEF ^ n2;
                }
                case 517311106: {
                    long l5;
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2) != -1703255431) {
                        n2 = listener1.wxequxfawwljkght(n2, 289303691);
                        throw new IOException();
                    }
                    n2 = 0x1A8A0052 ^ n2;
                    long l6 = l5 = System.currentTimeMillis();
                    n2 = 0x74F782BF ^ n2;
                    long l7 = l6;
                    Long l8 = l3;
                    long l9 = l8;
                    long l10 = l7 - l9;
                    long l11 = l10 == 0L ? 0 : (l10 < 0L ? -1 : 1);
                    if (l11 <= (0x5D32CEA2 ^ n2)) {
                        n2 = 0x75915C6 ^ n2;
                        return (byte)(0x5A6BDB65 ^ n2) != 0;
                    }
                    if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2 = 0x7131A600 ^ n2) != 1612399889) break block9;
                    n2 = 0x78A4EDB4 ^ n2;
                    listener1 listener13 = this;
                    ConcurrentHashMap<String, Long> concurrentHashMap2 = listener13.blockedIps;
                    String string3 = string;
                    Long l12 = concurrentHashMap2.remove(string3);
                    n2 = 0x468E9199 ^ n2;
                    return (byte)(0x1229148F ^ n2) != 0;
                }
                default: {
                    throw new IOException();
                }
            }
            break;
        }
        block10: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                case 178729486: {
                    continue block10;
                }
                case 88520378: {
                    n2 = 0xE724866 ^ n2;
                    throw new IOException();
                }
            }
            break;
        }
        throw new IOException();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void notifyAdmins(String string, int n) {
        String string2;
        int n2 = 0x243BA9B5 ^ (0x1FF6F4BA ^ 0x13BE74FC);
        n2 = 0x261BA77D ^ n2;
        listener1 listener12 = this;
        Main main = listener12.plugin;
        String string3 = string2 = main.getAdminNotice(340519542);
        n2 = 0x722F124C ^ n2;
        String string4 = string3;
        if (string4 != null) {
            n2 = 0x3F85FF2 ^ n2;
            String string5 = string3;
            int n3 = string5.isEmpty();
            if (n3 != (0x7FBFC330 ^ n2)) {
                n2 = 0x1A4BD72F ^ n2;
                return;
            }
        } else {
            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2 = 0x7128E45F ^ n2) != 1803273448) {
                n2 = 0x156339C7 ^ n2;
                throw new IOException();
            }
            n2 = 0x689B6C82 ^ n2;
            return;
        }
        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n2 = 0x4B24CDDB ^ n2) == -1529317543) {
            Component component;
            String string6;
            n2 = listener1.wxequxfawwljkght(n2, 1565399855);
            String string7 = string3;
            String string8 = listener1.rjsagyddfz(listener1.veygkjlwmvmnxiv(), listener1.nyrboykfyrtpieg(), n2);
            String string9 = string;
            String string10 = string6 = string7.replace(string8, string9);
            n2 = 0x329B925C ^ n2;
            String string11 = string10;
            Component component2 = component = utils1.parse(string11, 1659201516);
            n2 = 0x2EEB3E0A ^ n2;
            GlobalRegionScheduler globalRegionScheduler = Bukkit.getGlobalRegionScheduler();
            listener1 listener13 = this;
            Main main2 = listener13.plugin;
            listener1 listener14 = this;
            Component component3 = component2;
            Consumer<ScheduledTask> consumer = scheduledTask2 -> {
                Iterator iterator;
                int n = 0x56AA3404 ^ (0x71AD9C93 ^ 0x13BE74FC);
                n = 0x2CBCCE58 ^ n;
                Collection collection = Bukkit.getOnlinePlayers();
                Iterator iterator2 = iterator = collection.iterator();
                n = 0x67D6BAB0 ^ n;
                while (true) {
                    Player player;
                    Iterator iterator3;
                    int n2;
                    if ((n2 = (iterator3 = iterator2).hasNext()) == (0x7FD3A883 ^ n)) {
                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = listener1.wxequxfawwljkght(n, 1709905516)) == -775555208) {
                            n = listener1.wxequxfawwljkght(n, 247035218);
                            return;
                        }
                        n = 0x5019AC66 ^ n;
                        throw new IllegalAccessException();
                    }
                    n = 0x5C1FBE5E ^ n;
                    Iterator iterator4 = iterator2;
                    Object e = iterator4.next();
                    Player player2 = player = (Player)e;
                    n = 0x4DFCD58B ^ n;
                    Player player3 = player2;
                    EntityScheduler entityScheduler = player3.getScheduler();
                    listener1 listener12 = this;
                    Main main = listener12.plugin;
                    listener1 listener13 = this;
                    Player player4 = player2;
                    Component component2 = component3;
                    Consumer<ScheduledTask> consumer = scheduledTask -> {
                        int n = 0x5C41CC84 ^ (0x5571DD6A ^ 0x13BE74FC);
                        n = 0x64AA125E ^ n;
                        Player player2 = player4;
                        String string = listener1.rjsagyddfz(listener1.zptbdmwpislqgqh(), listener1.nyrboykfyrtpieg(), n);
                        int n2 = player2.hasPermission(string);
                        if (n2 == (0x7E24774C ^ n)) {
                            if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = 0x77372C3E ^ n) != 1218108304) {
                                n = listener1.wxequxfawwljkght(n, 225887636);
                                throw new RuntimeException();
                            }
                            block14: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                                    case 36033620: {
                                        continue block14;
                                    }
                                    case 1175189667: {
                                        return;
                                    }
                                    case 26576959: {
                                        n = 0x21D95EBB ^ n;
                                        return;
                                    }
                                }
                                break;
                            }
                            throw new RuntimeException();
                        } else {
                            n = 0x2DFEF976 ^ n;
                            listener1 listener12 = this;
                            storage1 storage12 = listener12.storage;
                            Player player3 = player4;
                            UUID uUID = player3.getUniqueId();
                            int n3 = storage12.isNotifyEnabled(uUID, 866035830);
                            if (n3 != (0x53DA8E3A ^ n)) {
                                n = 0x4C6F6549 ^ n;
                                Player player4 = player4;
                                Component component2 = component2;
                                player4.sendMessage(component2);
                                n = 0x377FEEBA ^ n;
                                return;
                            }
                            block15: while (true) {
                                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                                    case 1391072584: {
                                        continue block15;
                                    }
                                    case 41361482: {
                                        n = 0x3A4EFE97 ^ n;
                                    }
                                    case 1664821416: {
                                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n) == 1285784939) {
                                            n = listener1.wxequxfawwljkght(n, 1096709476);
                                            return;
                                        }
                                        block16: while (true) {
                                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                                                case 340047119: {
                                                    continue block16;
                                                }
                                                case 210760667: {
                                                    n = 0x6DF1EE4B ^ n;
                                                    throw new RuntimeException();
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        throw new RuntimeException();
                    };
                    Runnable runnable = null;
                    ScheduledTask scheduledTask3 = entityScheduler.run((Plugin)main, consumer, runnable);
                    n = 0x3FA3B0E3 ^ n;
                    n = listener1.wxequxfawwljkght(n, 1603107460);
                    try {
                        if (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n) != 190463952) {
                            throw null;
                        }
                        throw new RuntimeException();
                    }
                    catch (RuntimeException runtimeException) {
                        switch (sqzqdggcrmshhhew.fvnkfgjyjeapcbab(n)) {
                            case 815586681: {
                                n = 0x69A6B9BF ^ n;
                                break;
                            }
                            default: {
                                throw new RuntimeException("Error in hash");
                            }
                            case 1894795656: {
                                n = listener1.wxequxfawwljkght(n, 1101736737);
                            }
                        }
                        n = 0x30668A93 ^ n;
                        continue;
                    }
                    break;
                }
            };
            ScheduledTask scheduledTask = globalRegionScheduler.run((Plugin)main2, consumer);
            n2 = 0xF843B91 ^ n2;
            return;
        }
        block4: while (true) {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n2)) {
                case 1892127891: {
                    continue block4;
                }
                case 99375228: {
                    n2 = 0x2C974FB1 ^ n2;
                    throw new IOException();
                }
            }
            break;
        }
        throw new IOException();
    }

    static {
        long l;
        nothing_to_see_here = new String[15];
        listener1.nothing_to_see_here[0] = "\u2880\u2874\u2811\u2844\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28e4\u28e4\u28e4\u28c0\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[1] = "\u2838\u2847\u2800\u283f\u2840\u2800\u2800\u2800\u28c0\u2874\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2811\u2884\u28e0\u283e\u2801\u28c0\u28c4\u2848\u2819\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2880\u2840\u2801\u2800\u2800\u2808\u2819\u281b\u2802\u2808\u28ff\u28ff\u28ff\u28ff\u28ff\u283f\u287f\u28bf\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2880\u287e\u28c1\u28c0\u2800\u2834\u2802\u2819\u28d7\u2840\u2800\u28bb\u28ff\u28ff\u282d\u28a4\u28f4\u28e6\u28e4\u28f9\u2800\u2800\u2800\u2880\u28b4\u28f6\u28c6";
        listener1.nothing_to_see_here[5] = "\u2800\u2800\u2880\u28fe\u28ff\u28ff\u28ff\u28f7\u28ee\u28fd\u28fe\u28ff\u28e5\u28f4\u28ff\u28ff\u287f\u2882\u2814\u289a\u287f\u28bf\u28ff\u28e6\u28f4\u28fe\u2801\u2838\u28fc\u287f";
        listener1.nothing_to_see_here[6] = "\u2800\u2880\u285e\u2801\u2819\u283b\u283f\u281f\u2809\u2800\u281b\u28b9\u28ff\u28ff\u28ff\u28ff\u28ff\u28cc\u28a4\u28fc\u28ff\u28fe\u28ff\u285f\u2809\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[7] = "\u2800\u28fe\u28f7\u28f6\u2807\u2800\u2800\u28e4\u28c4\u28c0\u2840\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[8] = "\u2800\u2809\u2808\u2809\u2800\u2800\u28a6\u2848\u28bb\u28ff\u28ff\u28ff\u28f6\u28f6\u28f6\u28f6\u28e4\u28fd\u2879\u28ff\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[9] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u2832\u28fd\u287b\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28f7\u28dc\u28ff\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[10] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28f7\u28f6\u28ee\u28ed\u28fd\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[11] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28c0\u28c0\u28c8\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2807\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[12] = "\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u2803\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[13] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u281f\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        listener1.nothing_to_see_here[14] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2809\u281b\u283b\u283f\u283f\u283f\u283f\u281b\u2809              ";
        int n = 0x7A0BE98A ^ (0x582E8741 ^ Integer.parseInt("2125675831"));
        int n2 = new Random(-5297588584645218141L).nextInt();
        rGvac7Sd7x = 0xCE71B7A6 ^ n2;
        n = 0x7605ABAE ^ n;
        long l2 = 15L;
        Duration duration = Duration.ofMinutes(l2);
        TTL = l = duration.toMillis();
    }

    public static String rjsagyddfz(byte[] byArray, byte[] byArray2, int n) {
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

    private static byte[] nyrboykfyrtpieg() {
        return new byte[]{56, 105, 62, 34, 101, 76, 15, 47, 112, 53, 77, 89, 47, 43, 33, 28, 49, 38, 96, 70, 86, 107, 47, 20, 117, 40, 92, 23, 26, 118, 107, 98, 93, 74, 33, 40, 67, 22, 107, 37, 93, 112, 44, 58, 55, 59, 118, 95, 126, 120, 100, 51, 112, 85, 68, 103, 23, 2, 43, 54, 23, 31, 37, 99, 66, 102, 28, 26, 32, 8, 3, 30, 57, 62, 37, 89, 97, 19, 45, 11, 3, 62, 5, 65, 11, 39, 1, 86, 117, 63, 31, 121, 23, 83, 4, 86, 71, 33, 66, 116, 74, 20, 124, 66, 59, 120, 59, 83, 50, 28, 37, 88, 106, 49, 30, 97, 31};
    }

    private static byte[] zptbdmwpislqgqh() {
        return new byte[]{-12, -89, 15, 117, 86, 19, 54, 107, 69, 110, 127, 30, 30, 109, 18, 67, 8, 56, 85, 21, 100, 62, 30, 79, 70, 112, 101, 73};
    }

    private static byte[] jvnbaieyqrxmbnp() {
        return new byte[]{-12, -90, 11, 17};
    }

    private static byte[] upvuadwlxezqawf() {
        return new byte[]{-12, -94, 13, 119, 84, 17, 56, 110, 65, 110, 121, 28, 27, 106, 18, 69, 4, 57, 82, 16, 101, 38, 30, 87, 66, 124, 109, 86, 46, 54};
    }

    private static byte[] ahicdcdsqdtquog() {
        return new byte[]{-9, -89, 6, 79, 87, 94, 54, 62, 70, 116, 124, 24, 23, 116, 19, 80, 8, 111, 86, 3, 103, 53, 23, 93, 71, 97, 101, 82, 44, 53, 90, 60, 101, 9, 19, 100, 122, 78, 93, 124, 108, 46, 20, 101, 5, 114, 79, 11, 72, 32, 85, 119, 72, 23, 118, 43, 46, 83, 29, 110, 38, 93, 29, 38, 112, 63, 37, 77, 22, 88, 50, 6, 1, 83, 23, 75, 88, 118, 27, 79, 50, 37, 61, 74, 57, 75, 56, 28, 67, 34, 46, 60, 47, 16, 54, 19, 126, 125};
    }

    private static byte[] qovpyvxqcmykzwd() {
        return new byte[]{-12, -90, 10, 54, 85, 8, 54, 121, 69, 97, 127, 28, 27, 111, 17, 66, 8, 97, 85, 8, 100, 121};
    }

    private static byte[] kpvmetrcvrwhowz() {
        return new byte[]{-9, -92, 15, 77, 85, 94, 63, 53, 66, 116, 124, 25, 30, 119, 17, 84, 1, 109, 82, 11, 103, 47, 30, 87, 69, 118, 108, 12, 40, 27, 90, 114, 108, 37, 17, 107, 115, 14, 89, 46, 108, 30, 29, 122, 7, 33, 70, 49, 76, 107, 85, 120, 65, 3, 116, 36, 39, 108, 25, 37};
    }

    private static byte[] nrpxkqnmakhfhze() {
        return new byte[]{-9, -93, 8, 78, 92, 91, 56, 107, 68, 122, 124, 28, 25, 126, 24, 117, 6, 52, 84, 44, 103, 45, 25, 14, 76, 39, 107, 123, 46, 51, 90, 125, 107, 38, 24, 63, 116, 80, 95, 99, 108, 43, 26, 86, 14, 44};
    }

    private static byte[] veygkjlwmvmnxiv() {
        return new byte[]{-9, -95, 9, 50, 80, 21, 61, 122, 66, 104, 124, 11, 24, 59};
    }

    private static int wxequxfawwljkght(int n, int n2) {
        return n ^ n2;
    }
}

