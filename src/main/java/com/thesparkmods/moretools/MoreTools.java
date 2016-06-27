package com.thesparkmods.moretools;

import com.thesparkmods.moretools.item.DirtAxe;
import com.thesparkmods.moretools.item.DirtHoe;
import com.thesparkmods.moretools.item.DirtPickaxe;
import com.thesparkmods.moretools.item.DirtSpade;
import com.thesparkmods.moretools.item.DirtSword;
import com.thesparkmods.moretools.item.GravelAxe;
import com.thesparkmods.moretools.item.GravelHoe;
import com.thesparkmods.moretools.item.GravelPickaxe;
import com.thesparkmods.moretools.item.GravelSpade;
import com.thesparkmods.moretools.item.GravelSword;
import com.thesparkmods.moretools.item.NetherAxe;
import com.thesparkmods.moretools.item.NetherHoe;
import com.thesparkmods.moretools.item.NetherPickaxe;
import com.thesparkmods.moretools.item.NetherSpade;
import com.thesparkmods.moretools.item.NetherSword;
import com.thesparkmods.moretools.item.SandAxe;
import com.thesparkmods.moretools.item.SandHoe;
import com.thesparkmods.moretools.item.SandPickaxe;
import com.thesparkmods.moretools.item.SandSpade;
import com.thesparkmods.moretools.item.SandSword;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "dtm", name = "More Tools Mod", version = "2.0")
public class MoreTools {

	public static Item dirtPickaxe;
	public static Item dirtSword;
	public static Item dirtSpade;
	public static Item dirtAxe;
	public static Item dirtHoe;
	public static Item gravelPickaxe;
	public static Item gravelAxe;
	public static Item gravelSpade;
	public static Item gravelSword;
	public static Item gravelHoe;
	public static Item sandPickaxe;
	public static Item sandAxe;
	public static Item sandSpade;
	public static Item sandSword;
	public static Item sandHoe;
	public static Item netherPickaxe;
	public static Item netherAxe;
	public static Item netherSpade;
	public static Item netherSword;
	public static Item netherHoe;
	
	public static final Item.ToolMaterial dirtToolMaterial = EnumHelper.addToolMaterial("dirtToolMaterial", 4, 10, 15.0F, 4.0F, 30);
	public static final Item.ToolMaterial gravelToolMaterial = EnumHelper.addToolMaterial("gravelToolMaterial", 4, 9, 15.0F, 2.0F, 2);
	public static final Item.ToolMaterial sandToolMaterial = EnumHelper.addToolMaterial("sandToolMaterial", 4, 5, 15.0F, 2.0F, 2);
	public static final Item.ToolMaterial netherToolMaterial = EnumHelper.addToolMaterial("netherToolMaterial", 4, 15, 15.0F, 5.0F, 2);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//DirtItems
		dirtPickaxe = new DirtPickaxe(dirtToolMaterial).setUnlocalizedName("DirtPickaxe").setTextureName("dtm:dirtpick").setCreativeTab(tabDirtMod);
		dirtAxe = new DirtAxe(dirtToolMaterial).setUnlocalizedName("DirtAxe").setTextureName("dtm:dirtaxe").setCreativeTab(tabDirtMod);
		dirtSpade = new DirtSpade(dirtToolMaterial).setUnlocalizedName("DirtSpade").setTextureName("dtm:dirtspade").setCreativeTab(tabDirtMod);
		dirtSword = new DirtSword(dirtToolMaterial).setUnlocalizedName("DirtSword").setTextureName("dtm:dirtsword").setCreativeTab(tabDirtMod);
		dirtHoe = new DirtHoe(dirtToolMaterial).setUnlocalizedName("DirtHoe").setTextureName("dtm:dirthoe").setCreativeTab(tabDirtMod);
		//GravelItems
		gravelPickaxe = new GravelPickaxe(gravelToolMaterial).setUnlocalizedName("GravelPickaxe").setCreativeTab(tabGravelMod).setTextureName("dtm:gravelpick");
		gravelAxe = new GravelAxe(gravelToolMaterial).setUnlocalizedName("GravelAxe").setCreativeTab(tabGravelMod).setTextureName("dtm:gravelaxe");
		gravelSpade = new GravelSpade(gravelToolMaterial).setUnlocalizedName("GravelSpade").setCreativeTab(tabGravelMod).setTextureName("dtm:gravelspade");
		gravelSword = new GravelSword(gravelToolMaterial).setUnlocalizedName("GravelSword").setCreativeTab(tabGravelMod).setTextureName("dtm:gravelsword");
		gravelHoe = new GravelHoe(gravelToolMaterial).setUnlocalizedName("GravelHoe").setCreativeTab(tabGravelMod).setTextureName("dtm:gravelhoe");
		//SandItems
		sandPickaxe = new SandPickaxe(sandToolMaterial).setUnlocalizedName("SandPickaxe").setCreativeTab(tabSandMod).setTextureName("dtm:sandpickaxe");
		sandAxe = new SandAxe(sandToolMaterial).setUnlocalizedName("SandAxe").setCreativeTab(tabSandMod).setTextureName("dtm:sandaxe");
		sandSpade = new SandSpade(sandToolMaterial).setUnlocalizedName("SandSpade").setCreativeTab(tabSandMod).setTextureName("dtm:sandspade");
		sandSword = new SandSword(sandToolMaterial).setUnlocalizedName("SandSword").setCreativeTab(tabSandMod).setTextureName("dtm:sandsword");
		sandHoe = new SandHoe(sandToolMaterial).setUnlocalizedName("SandHoe").setCreativeTab(tabSandMod).setTextureName("dtm:sandhoe");
		//NetherItems
		netherPickaxe = new NetherPickaxe(netherToolMaterial).setUnlocalizedName("NetherPickaxe").setCreativeTab(tabNetherMod).setTextureName("dtm:netherpick");
		netherAxe = new NetherAxe(netherToolMaterial).setUnlocalizedName("NetherAxe").setCreativeTab(tabNetherMod).setTextureName("dtm:netheraxe");
		netherSpade = new NetherSpade(netherToolMaterial).setUnlocalizedName("NetherSpade").setCreativeTab(tabNetherMod).setTextureName("dtm:netherspade");
		netherSword = new NetherSword(netherToolMaterial).setUnlocalizedName("NetherSword").setCreativeTab(tabNetherMod).setTextureName("dtm:nethersword");
		netherHoe = new NetherHoe(netherToolMaterial).setUnlocalizedName("NetherHoe").setCreativeTab(tabNetherMod).setTextureName("dtm:netherhoe");
		//DirtRegisters
		GameRegistry.registerItem(dirtPickaxe, dirtPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dirtAxe, dirtAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dirtSpade, dirtSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dirtSword, dirtSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dirtHoe, dirtHoe.getUnlocalizedName().substring(5));
		//GravelRegisters
		GameRegistry.registerItem(gravelPickaxe, gravelPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gravelAxe, gravelAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gravelSpade, gravelSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gravelSword, gravelSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(gravelHoe, gravelHoe.getUnlocalizedName().substring(5));
		//SandRegisters
		GameRegistry.registerItem(sandPickaxe, sandPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandAxe, sandAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandSpade, sandSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandSword, sandSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(sandHoe, sandHoe.getUnlocalizedName().substring(5));
		//NetherRegisters
		GameRegistry.registerItem(netherPickaxe, netherPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherAxe, netherAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherSpade, netherSpade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherSword, netherSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(netherHoe, netherHoe.getUnlocalizedName().substring(5));
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
	
		GameRegistry.addRecipe(new ItemStack(dirtSpade),new Object[]{"D",
				                                                     "S",
				                                                     "S", 'D',Blocks.dirt, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(dirtPickaxe),new Object[]{"DDD",
				                                                       " S ",
				                                                       " S ", 'D',Blocks.dirt, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(dirtAxe),new Object[]{"DD",
				                                                   "DS",
				                                                   " S", 'D',Blocks.dirt, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(dirtSword),new Object[]{"D",
				                                                     "D",
				                                                     "S", 'D',Blocks.dirt, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(dirtHoe),new Object[]{"DD",
				                                                   " S",
				                                                   " S", 'D',Blocks.dirt, 'S',Items.stick});  
		GameRegistry.addRecipe(new ItemStack(gravelPickaxe),new Object[]{"GGG",
				                                                         " S ",
				                                                         " S ", 'G',Blocks.gravel, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(gravelSpade),new Object[]{"G",
				                                                       "S",
				                                                       "S", 'G',Blocks.gravel, 'S',Items.stick});  
		GameRegistry.addRecipe(new ItemStack(gravelSword),new Object[]{"G",
				                                                       "G",
				                                                       "S", 'G',Blocks.gravel, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(gravelAxe),new Object[]{"GG",
				                                                     "GS",
				                                                     " S", 'G',Blocks.gravel, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(gravelHoe),new Object[]{"GG",
				                                                     " S",
				                                                     " S", 'G',Blocks.gravel, 'S',Items.stick});	
		GameRegistry.addRecipe(new ItemStack(sandPickaxe),new Object[]{"QQQ",
				                                                       " S ",
				                                                       " S ", 'Q',Blocks.sand, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(sandAxe),new Object[]{"QQ",
                                                                   "QS",
                                                                   " S", 'Q',Blocks.sand, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(sandSpade),new Object[]{"Q",
                                                                     "S",
                                                                     "S", 'Q',Blocks.sand, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(sandSword),new Object[]{"Q",
                                                                     "Q",
                                                                     "S", 'Q',Blocks.sand, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(sandHoe),new Object[]{"QQ",
                                                                   "S ",
                                                                   "S ", 'Q',Blocks.sand, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(netherPickaxe),new Object[]{"NNN",
																	   " S ",
																	   " S ", 'N',Blocks.netherrack, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(netherAxe),new Object[]{"NN",
																     "NS",
																     " S", 'N',Blocks.netherrack, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(netherSpade),new Object[]{"N",
                                                                       "S",
                                                                       "S", 'N',Blocks.netherrack, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(netherSword),new Object[]{"N",
                                                                       "N",
                                                                       "S", 'N',Blocks.netherrack, 'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(netherHoe),new Object[]{"NN",
                                                                     "S ",
                                                                     "S ", 'N',Blocks.netherrack, 'S',Items.stick});
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	//DirtTab
	public static CreativeTabs tabDirtMod = new CreativeTabs("tabDirtMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Blocks.dirt).getItem();
		}
	};
	//GravelTab
	public static CreativeTabs tabGravelMod = new CreativeTabs("tabGravelMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Blocks.gravel).getItem();
		}
	};
	//SandTab
	public static CreativeTabs tabSandMod = new CreativeTabs("tabSandMod"){
		@Override
		public Item getTabIconItem(){
			return new ItemStack(Blocks.sand).getItem();
		}
	};
	//NetherTab
		public static CreativeTabs tabNetherMod = new CreativeTabs("tabNetherMod"){
			@Override
			public Item getTabIconItem(){
				return new ItemStack(Blocks.netherrack).getItem();
			}
		};
}
