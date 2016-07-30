package emt.item.armor.boots;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import emt.EMT;
import emt.util.EMTConfigHandler;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

public class ItemQuantumBootsTraveller extends ItemElectricBootsTraveller {

	public ItemQuantumBootsTraveller(int par3, int par4) {
		super(par3, par4);
		maxCharge = 10000000;
		speedBonus = (float) EMTConfigHandler.quantumBootsSpeed;
		jumpBonus = (float) EMTConfigHandler.quantumBootsJump;
		visDiscount = 5;
		transferLimit = 10000;
		energyPerDamage = 1000;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(EMT.TEXTURE_PATH + ":armor/boots_quantum");
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		return EMT.TEXTURE_PATH + ":textures/models/quantumbootstravel.png";
	}
}