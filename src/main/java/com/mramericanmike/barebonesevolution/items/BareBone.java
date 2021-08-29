package com.mramericanmike.barebonesevolution.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class BareBone extends Item {

    public BareBone(Properties properties) {
        super(properties);
    }

    public BareBone() {
        super(
                new Item.Properties()
                        .stacksTo(32)
                        .tab(CreativeModeTab.TAB_MISC)
        );
    }
}
