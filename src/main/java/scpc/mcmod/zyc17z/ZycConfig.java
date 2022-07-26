package scpc.mcmod.zyc17z;

import net.minecraftforge.common.ForgeConfigSpec;

public class ZycConfig {

    public static ForgeConfigSpec COMMON_CONFIG;
    public static ForgeConfigSpec.BooleanValue playerJoinInMessage;
    public static ForgeConfigSpec.BooleanValue oneClickToCrash;
    static {

        ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
        COMMON_BUILDER.comment("General settings").push("General");
        playerJoinInMessage = COMMON_BUILDER.comment("Welcome message").define("player_join_message", true);
        COMMON_CONFIG = COMMON_BUILDER.build();

    }

}
