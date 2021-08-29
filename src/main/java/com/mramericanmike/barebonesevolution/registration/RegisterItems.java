package com.mramericanmike.barebonesevolution.registration;

import com.mramericanmike.barebonesevolution.BareBonesEvolution;
import com.mramericanmike.barebonesevolution.items.BareBone;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.mramericanmike.barebonesevolution.BareBonesEvolution.MODID;

public class RegisterItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Item> BAREBONE = ITEMS.register("barebone", () -> new BareBone());


}
