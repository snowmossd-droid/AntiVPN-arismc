package me.gerhart.antivpn.license;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
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
        this.plugin = plugin;
        this.logger = plugin.getLogger();
        this.licenseFile = new File(plugin.getDataFolder(), "license.yml");
        this.loadOrCreateLicenseFile(460417401);
        this.logger.info("§a=========================================");
        this.logger.info("§a[License] §fCracked version - License bypassed");
        this.logger.info("§a[License] §fEverything will work normally");
        this.logger.info("§a=========================================");
    }

    // ============ METHOD CHÍNH - LUÔN TRUE ============
    public boolean validateLicense(int var1_1) {
        // LUÔN TRẢ VỀ TRUE - KHÔNG CẦN KIỂM TRA GÌ CẢ
        this.logger.info("§a[License] Validation: §aSUCCESS (bypassed)");
        return true;
    }
    // =================================================

    public void validateLicenseAsync(Runnable callback) {
        this.logger.info("§a[License] Async validation: SUCCESS (bypassed)");
        if (callback != null) {
            callback.run();
        }
    }

    private void loadOrCreateLicenseFile(int hash) {
        try {
            if (!this.plugin.getDataFolder().exists()) {
                this.plugin.getDataFolder().mkdirs();
            }
            
            if (!this.licenseFile.exists()) {
                this.licenseFile.createNewFile();
                try (FileWriter writer = new FileWriter(this.licenseFile)) {
                    writer.write("# Cracked license file - Auto generated\n");
                    writer.write("license-key: CRACKED-BYPASS-100\n");
                    writer.write("license-keys:\n");
                    writer.write("  - CRACKED-KEY-001\n");
                    writer.write("  - CRACKED-KEY-002\n");
                    writer.write("  - CRACKED-KEY-003\n");
                    writer.write("license-status: VALID\n");
                    writer.write("license-type: PREMIUM\n");
                    writer.write("expiry-date: NEVER\n");
                }
            }
            
            this.licenseConfig = YamlConfiguration.loadConfiguration(this.licenseFile);
            
            // Đảm bảo có dữ liệu license
            if (!this.licenseConfig.contains("license-key")) {
                this.licenseConfig.set("license-key", "CRACKED-BYPASS-100");
                this.licenseConfig.set("license-keys", List.of("CRACKED-KEY-001", "CRACKED-KEY-002"));
                this.licenseConfig.set("license-status", "VALID");
                this.licenseConfig.set("license-type", "PREMIUM");
                this.licenseConfig.save(this.licenseFile);
            }
        } catch (IOException e) {
            this.logger.warning("[License] Could not create license file: " + e.getMessage());
        }
    }

    public void logLicenseSuccess(String licenseKey, String pluginName, String currentVersion, 
                                   String newestVersion, String downloadLink, String var6, String var7, int var8) {
        this.logger.info("§a=========================================");
        this.logger.info("§a[License] §fLicense Status: §aVALID");
        this.logger.info("§a[License] §fPlugin: §e" + pluginName);
        this.logger.info("§a[License] §fCurrent Version: §e" + currentVersion);
        this.logger.info("§a[License] §fLicense Key: §e" + licenseKey);
        this.logger.info("§a=========================================");
    }

    public void logLicenseError(String error, int code) {
        // Không log lỗi - im lặng để tránh spam
        // Có thể bỏ comment dòng dưới nếu muốn thấy log
        // this.logger.info("§c[License] Error ignored: " + error);
    }

    private String getFirstLocalKey(int n) {
        if (this.licenseConfig != null) {
            List<String> keys = this.licenseConfig.getStringList("license-keys");
            if (keys != null && !keys.isEmpty()) {
                String key = keys.get(0);
                if (key != null && !key.trim().isEmpty()) {
                    return key.trim();
                }
            }
            
            String singleKey = this.licenseConfig.getString("license-key");
            if (singleKey != null && !singleKey.trim().isEmpty()) {
                return singleKey.trim();
            }
        }
        return "CRACKED-BYPASS-100";
    }

    private String fetchPublicIP(int n) {
        // Trả về IP giả
        return "192.168.1.1";
    }

    private String toAnsi(String text, int n) {
        if (text == null) return "";
        // Chuyển đổi màu Minecraft sang ANSI màu
        return text.replace("&a", "\u001B[32m")
                   .replace("&c", "\u001B[31m")
                   .replace("&e", "\u001B[33m")
                   .replace("&f", "\u001B[37m")
                   .replace("&r", "\u001B[0m")
                   .replace("&l", "")
                   .replace("&n", "")
                   .replace("&o", "")
                   .replace("&k", "");
    }

    private String buildBar(int n) {
        return "=========================================";
    }

    private boolean isFolia(int n) {
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    public static String tvbrokkrya(byte[] bytes, int n) {
        if (bytes == null) return "";
        return new String(bytes, StandardCharsets.UTF_16BE);
    }

    // Các static method trả về byte array giữ nguyên format
    private static byte[] zwbrmkwprsuybzy() { return new byte[]{0, 0, 0, 24}; }
    private static byte[] cntwvuvxftousdz() { return new byte[]{0, 0, 0, 3, 0, 0, 0, 24}; }
    private static byte[] fuobzwzbzhmtlob() { return new byte[]{0, 0, 0, 10}; }
    private static byte[] eqdjfyzzlzfoxcb() { return new byte[]{0, 0, 0, 44}; }
    private static byte[] ztofcyqcdcobdid() { return new byte[]{0, 0, 0, 21}; }
    private static byte[] gzdgeyahuqjtkss() { return new byte[]{0, 0, 0, 0}; }
    private static byte[] rzqjfxyckerjbul() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] ypswfjdmpgkoity() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] bqezsffrrjxdhkr() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] syznnfgchhklhjo() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] wpllqtsyxjsthfp() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] foxbzebjbmscoqp() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] xtkilfypfeyxlzd() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] jvgwsqvyxaxnlfa() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] zzfxsootvwjsdnv() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] aloialriewdfphu() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] iqixqhcbfugdech() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] djdwgpkipewjgsq() { return new byte[]{0, 0, 0, 1}; }
    private static byte[] xnhwumiyatdathm() { return new byte[]{0, 0, 0, 27}; }
    private static byte[] shcysvcutbioaea() { return new byte[]{0, 0, 0, 4}; }
    private static byte[] agtqxgtwyjihehg() { return new byte[]{0, 0, 0, 0}; }
    private static byte[] ttaegaonpgftloz() { return new byte[]{0, 0, 0, 26}; }
    private static byte[] zfqzchllhaebzcj() { return new byte[]{0, 0, 0, 0}; }
    private static byte[] hzlxbbkileujdfq() { return new byte[]{0, 0, 0, 0}; }
    private static byte[] bkjcutqenmugpac() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] brfenxlejuwbuhu() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] okylgyengvijmzf() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] qgatuelsfrfnjge() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] jwlcxhrmwkdivwx() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] uygrtzmlahgnvff() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] nrlxiaxpwzcxlya() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] wnlzdlvqemwexqg() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] dtlhgbhwztyuqio() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] apvswnqcapvjuut() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] xbhrlwazgwfnsfm() { return new byte[]{0, 0, 0, 48}; }
    private static byte[] lcjztwybhezwdhu() { return new byte[]{0, 0, 0, 1}; }
    private static byte[] ltezrjvsibatavj() { return new byte[]{0, 0, 0, 8}; }
    private static byte[] gqgfmxhcxckycgo() { return new byte[]{0, 0, 0, 8}; }
    private static byte[] jclpllgsxkokzlg() { return new byte[]{0, 0, 0, 3}; }
    private static byte[] nfdbmilgcyiqqjd() { return new byte[]{0, 0, 0, 49}; }
    private static byte[] bbjlpvxwzdmdube() { return new byte[]{0, 0, 0, 14}; }
    private static byte[] celpofmkqtoddpk() { return new byte[]{0, 0, 0, 28}; }
    private static byte[] igjvtykmwcsircb() { return new byte[]{0, 0, 0, 31}; }
    private static byte[] xeijdqwqgrjsxms() { return new byte[]{0, 0, 0, 0}; }

    static {
        nothing_to_see_here = new String[17];
        for (int i = 0; i < 17; i++) {
            nothing_to_see_here[i] = "FAKE_STRING_" + i;
        }
        cjacybmoak = "CRACKED_LICENSE_BYPASS";
        Random rand = new Random();
        FkaqJipaBG = rand.nextInt(1000000);
    }

    private static int eznkswutelizrsfy(int n, int n2) {
        return n ^ n2;
    }
        }
