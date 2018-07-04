package ryuu_owo.mod.objects.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ryuu_owo.mod.Main;
import ryuu_owo.mod.init.ItemInit;
import ryuu_owo.mod.util.IHasModel;

public class ItemBase extends Item implements IHasModel{

public ItemBase(String name, CreativeTabs cless) {
	
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(cless);
	
	ItemInit.ITEMS.add(this);
}

@Override
public void registerModels() {

	Main.proxy.registerItemRenderer(this, 0, "inventory");
}

}
