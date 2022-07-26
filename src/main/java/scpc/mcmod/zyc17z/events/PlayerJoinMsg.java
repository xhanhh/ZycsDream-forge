package scpc.mcmod.zyc17z.events;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.Entity;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import scpc.mcmod.zyc17z.ZycConfig;

@Mod.EventBusSubscriber
public class PlayerJoinMsg {

    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event) {

        Entity entity = event.getEntity();

        if (!entity.world.isRemote) {

            if (ZycConfig.playerJoinInMessage.get()) {

                entity.sendMessage(new TranslationTextComponent(I18n.format("text.zycsdream.join.msg")),
                        entity.getUniqueID());

            }

        }

    }

}
