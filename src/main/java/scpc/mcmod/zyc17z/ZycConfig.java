package scpc.mcmod.zyc17z;

import net.minecraftforge.common.ForgeConfigSpec;

public class ZycConfig {

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec.BooleanValue playerJoinInMessage;
    public static ForgeConfigSpec.BooleanValue alwaysRaining;
    static {

        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push("General");

        playerJoinInMessage = COMMON_BUILDER.comment("Enable player join world welcome message (Default: true)").define("player_join_message", true);
        alwaysRaining = COMMON_BUILDER.comment("World always raining (Default: false)").define("always_raining", false);

        COMMON_CONFIG = COMMON_BUILDER.build();
    }

}
