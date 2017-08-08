package com.wuest.prefab.Gui;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

import net.minecraft.client.resources.I18n;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.EnumFacing;

/**
 * This class contains the keys for the language files.
 * @author WuestMan
 */
public class GuiLangKeys
{
	@Unlocalized(name = "Note: If you're facing north, choose south so the pier is going away from you. The white border is just to show the size.")
	public static final String FISH_POND_STRUCTURE_FACING = "prefab.gui.fishpond.structure.facing";	
	
	@Unlocalized(name = "This structure is 32x32 blocks in size.")
	public static final String PRODUCE_FARM_SIZE = "prefab.gui.producefarm.structure.size";
	
	@Unlocalized(name = "This structure is 38x38 blocks in size.")
	public static final String TREE_FARM_SIZE = "prefab.gui.treefarm.structure.size";
	
	@Unlocalized(name = "General")
	public static final String STARTER_TAB_GENERAL = "prefab.gui.starter.tab.general";
	
	@Unlocalized(name = "Config")
	public static final String STARTER_TAB_CONFIG = "prefab.gui.starter.tab.config";
	
	@Unlocalized(name = "Blocks/Size")
	public static final String STARTER_TAB_BLOCK = "prefab.gui.starter.tab.block";
	
	@Unlocalized(name = "House Style")
	public static final String STARTER_HOUSE_STYLE = "prefab.gui.starter.style.label";
	
	@Unlocalized(name = "Floor Block Type")
	public static final String STARTER_HOUSE_FLOOR_LABEL = "prefab.gui.starter.floortype.label";
	
	@Unlocalized(name = "Ceiling Block Type")
	public static final String STARTER_HOUSE_CEILING_LABEL = "prefab.gui.starter.ceilingtype.label";
	
	@Unlocalized(name = "Wall Wood Type")
	public static final String STARTER_HOUSE_WALL_LABEL = "prefab.gui.starter.walltype.label";
	
	@Unlocalized(name = "Interior Depth")
	public static final String STARTER_HOUSE_DEPTH_LABEL = "prefab.gui.starter.depth.label";
	
	@Unlocalized(name = "Interior Width")
	public static final String STARTER_HOUSE_WIDTH_LABEL = "prefab.gui.starter.width.label";
	
	@Unlocalized(name = "Basic House")
	public static final String STARTER_HOUSE_BASIC_DISPLAY = "prefab.gui.starter.basic.display";
	
	@Unlocalized(name = "A highly configurable house but has a very basic design.")
	public static final String STARTER_HOUSE_BASIC_NOTES = "prefab.gui.starter.basic.notes";
	
	@Unlocalized(name = "Ranch Style")
	public static final String STARTER_HOUSE_RANCH_DISPLAY = "prefab.gui.starter.ranch.display";
	
	@Unlocalized(name = "A house designed in a ranch style.")
	public static final String STARTER_HOUSE_RANCH_NOTES = "prefab.gui.starter.ranch.notes";
	
	@Unlocalized(name = "Loft Style")
	public static final String STARTER_HOUSE_LOFT_DISPLAY = "prefab.gui.starter.loft.display";
	
	@Unlocalized(name = "A house designed with a lofted area for the chests.")
	public static final String STARTER_HOUSE_LOFT_NOTES = "prefab.gui.starter.loft.notes";
	
	@Unlocalized(name = "Hobbit Style")
	public static final String STARTER_HOUSE_HOBBIT_DISPLAY = "prefab.gui.starter.hobbit.display";
	
	@Unlocalized(name = "A house designed into the ground like a hobbit.")
	public static final String STARTER_HOUSE_HOBBIT_NOTES = "prefab.gui.starter.hobbit.notes";
	
	@Unlocalized(name = "Desert Style")
	public static final String STARTER_HOUSE_DESERT_DISPLAY = "prefab.gui.starter.desert.display";
	
	@Unlocalized(name = "A house designed like a pyramid.")
	public static final String STARTER_HOUSE_DESERT_NOTES = "prefab.gui.starter.desert.notes";
	
	@Unlocalized(name = "Snowy Style")
	public static final String STARTER_HOUSE_SNOWY_DISPLAY = "prefab.gui.starter.snowy.display";
	
	@Unlocalized(name = "A house designed like an igloo.")
	public static final String STARTER_HOUSE_SNOWY_NOTES = "prefab.gui.starter.snowy.notes";
	
	@Unlocalized(name = "Add Torches")
	public static final String STARTER_HOUSE_ADD_TORCHES = "prefab.gui.starter.addtorches";
	
	@Unlocalized(name = "Add Bed")
	public static final String STARTER_HOUSE_ADD_BED = "prefab.gui.starter.addbed";
	
	@Unlocalized(name = "Add Crafting Table")
	public static final String STARTER_HOUSE_ADD_CRAFTING_TABLE = "prefab.gui.starter.addcraftingtable";
	
	@Unlocalized(name = "Add Chest")
	public static final String STARTER_HOUSE_ADD_CHEST = "prefab.gui.starter.addchest";
	
	@Unlocalized(name = "Add Chest Contents")
	public static final String STARTER_HOUSE_ADD_CHEST_CONTENTS = "prefab.gui.starter.addchestcontents";
	
	@Unlocalized(name = "Add Farm")
	public static final String STARTER_HOUSE_ADD_FARM = "prefab.gui.starter.addfarm";
	
	@Unlocalized(name = "Floor Stone Type")
	public static final String STARTER_HOUSE_FLOOR_STONE = "prefab.gui.starter.floorstone";
	
	@Unlocalized(name = "Ceiling Stone Type")
	public static final String STARTER_HOUSE_CEILING_TYPE = "prefab.gui.starter.ceilingtype";
	
	@Unlocalized(name = "Wall Wood Type")
	public static final String STARTER_HOUSE_WALL_TYPE = "prefab.gui.starter.walltype";
	
	@Unlocalized(name = "Is Ceiling Flat")
	public static final String STARTER_HOUSE_CEILING_FLAT = "prefab.gui.starter.ceilingflat";
	
	@Unlocalized(name = "Build Mineshaft")
	public static final String STARTER_HOUSE_BUILD_MINESHAFT = "prefab.gui.starter.buildmineshaft";
	
	@Unlocalized(name = "Stonebrick")
	public static final String CEILING_BLOCK_TYPE_STONE = "prefab.ceiling.block.type.stone";
	
	@Unlocalized(name = "Brick")
	public static final String CEILING_BLOCK_TYPE_BRICK = "prefab.ceiling.block.type.brick";
	
	@Unlocalized(name = "Sandstone")
	public static final String CEILING_BLOCK_TYPE_SAND = "prefab.ceiling.block.type.sand";
	
	@Unlocalized(name = "Oak")
	public static final String WALL_BLOCK_TYPE_OAK = "prefab.wall.block.type.oak";
	
	@Unlocalized(name = "Spruce")
	public static final String WALL_BLOCK_TYPE_SPRUCE = "prefab.wall.block.type.spruce";
	
	@Unlocalized(name = "Birch")
	public static final String WALL_BLOCK_TYPE_BIRCH = "prefab.wall.block.type.birch";
	
	@Unlocalized(name = "Jungle")
	public static final String WALL_BLOCK_TYPE_JUNGLE = "prefab.wall.block.type.jungle";
	
	@Unlocalized(name = "Acacia")
	public static final String WALL_BLOCK_TYPE_ACACIA = "prefab.wall.block.type.acacia";
	
	@Unlocalized(name = "Dark Oak")
	public static final String WALL_BLOCK_TYPE_DARK_OAK = "prefab.wall.block.type.darkoak";
	
	@Unlocalized(name = "Structure Facing")
	public static final String GUI_STRUCTURE_FACING = "prefab.gui.structure.facing";
	
	@Unlocalized(name = "Glass Color")
	public static final String GUI_STRUCTURE_GLASS = "prefab.gui.structure.glass";
	
	@Unlocalized(name = "The red box in the image on the right shows the block you clicked on.")
	public static final String GUI_BLOCK_CLICKED = "prefab.gui.structure.block.clicked";
	
	@Unlocalized(name = "Note: If you're facing north, choose south so the doors are facing you.")
	public static final String GUI_DOOR_FACING = "prefab.gui.structure.door.facing";
	
	@Unlocalized(name = "Note: If you're facing north, choose south so the structure is facing you.")
	public static final String GUI_STRUCTURE_FACING_PLAYER="prefab.gui.structure.facing.player";
	
	@Unlocalized(name = "Cannot build structure due to protected blocks/area.")
	public static final String GUI_STRUCTURE_NOBUILD = "prefab.gui.structure.nobuild";
	
	@Unlocalized(name = "Build!")
	public static final String GUI_BUTTON_BUILD = "prefab.gui.button.build";
	
	@Unlocalized(name = "Cancel")
	public static final String GUI_BUTTON_CANCEL = "prefab.gui.button.cancel";
	
	@Unlocalized(name = "Preview!")
	public static final String GUI_BUTTON_PREVIEW = "prefab.gui.button.preview";
	
	@Unlocalized(name = "Structure Complete!")
	public static final String GUI_PREVIEW_COMPLETE = "prefab.gui.preview.complete";
	
	@Unlocalized(name = "Right-click on any block in the world to remove the preview.")
	public static final String GUI_PREVIEW_NOTICE = "prefab.gui.preview.notice";
	
	@Unlocalized(name = "north")
	public static final String GUI_NORTH = "prefab.gui.north";
	
	@Unlocalized(name = "south")
	public static final String GUI_SOUTH = "prefab.gui.south";
	
	@Unlocalized(name = "east")
	public static final String GUI_EAST = "prefab.gui.east";
	
	@Unlocalized(name = "west")
	public static final String GUI_WEST = "prefab.gui.west";
	
	@Unlocalized(name = "white")
	public static final String GUI_WHITE = "prefab.gui.white";
	
	@Unlocalized(name = "orange")
	public static final String GUI_ORANGE = "prefab.gui.orange";
	
	@Unlocalized(name = "magenta")
	public static final String GUI_MAGENTA = "prefab.gui.magenta";
	
	@Unlocalized(name = "light_blue")
	public static final String GUI_LIGHT_BLUE = "prefab.gui.light_blue";
	
	@Unlocalized(name = "yellow")
	public static final String GUI_YELLOW = "prefab.gui.yellow";
	
	@Unlocalized(name = "lime")
	public static final String GUI_LIME = "prefab.gui.lime";
	
	@Unlocalized(name = "pink")
	public static final String GUI_PINK = "prefab.gui.pink";
	
	@Unlocalized(name = "gray")
	public static final String GUI_GRAY = "prefab.gui.gray";
	
	@Unlocalized(name = "silver")
	public static final String GUI_SILVER = "prefab.gui.silver";
	
	@Unlocalized(name = "cyan")
	public static final String GUI_CYAN = "prefab.gui.cyan";
	
	@Unlocalized(name = "purple")
	public static final String GUI_PURPLE = "prefab.gui.purple";
	
	@Unlocalized(name = "blue")
	public static final String GUI_BLUE = "prefab.gui.blue";
	
	@Unlocalized(name = "brown")
	public static final String GUI_BROWN = "prefab.gui.brown";
	
	@Unlocalized(name = "green")
	public static final String GUI_GREEN = "prefab.gui.green";
	
	@Unlocalized(name = "red")
	public static final String GUI_RED = "prefab.gui.red";
	
	@Unlocalized(name = "black")
	public static final String GUI_BLACK = "prefab.gui.black";
	
	@Unlocalized(name = "Flat Roof")
	public static final String VILLAGER_HOUSE_FLAT_ROOF = "prefab.gui.villager.house.flat";
	
	@Unlocalized(name = "Angled Roof")
	public static final String VILLAGER_HOUSE_ANGLED_ROOF = "prefab.gui.villager.house.angled";
	
	@Unlocalized(name = "Fenced Roof")
	public static final String VILLAGER_HOUSE_FENCED_ROOF = "prefab.gui.villager.house.fenced";
	
	@Unlocalized(name = "Blacksmith")
	public static final String VILLAGER_HOUSE_BLACKSMITH = "prefab.gui.villager.blacksmith";
	
	@Unlocalized(name = "Long House")
	public static final String VILLAGER_HOUSE_LONGHOUSE = "prefab.gui.villager.long_house";
	
	@Unlocalized(name = "Spruce House")
	public static final String MODERATE_HOUSE_SPRUCE = "prefab.gui.moderate_house.spruce";
	
	@Unlocalized(name = "Acacia House")
	public static final String MODERATE_HOUSE_ACACIA = "prefab.gui.moderate_house.acacia";
	

	/**
	 * Translates the specified language key for the current language.
	 * 
	 * @param translateKey The language key to use.
	 * @return The translated language key.
	 */
	public static String translateString(String translateKey)
	{
		if (I18n.hasKey(translateKey))
		{
			return I18n.format(translateKey, new Object[0]);
		}
		else
		{
			return GuiLangKeys.getUnLocalized(translateKey);
		}
	}

	/**
	 * Gets the unlocalized version of this translation key.
	 * If the translation key does not exist the key is returned instead of the unlocalized value.
	 * @param translateKey The translation key to get the unlocalized value for.
	 * @return The unlocalized value or the passed in key.
	 */
	public static String getUnLocalized(String translateKey)
	{
		for (Field field : GuiLangKeys.class.getDeclaredFields())
		{
			Class type = field.getType();
			String name = field.getName();
			String value = "";
			
			try
			{
				value = field.get(null).toString();
			}
			catch (IllegalArgumentException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IllegalAccessException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (translateKey.equals(value))
			{
				Annotation[] annotations = field.getDeclaredAnnotations();
				
				for (Annotation annotation : annotations)
				{
					if (annotation instanceof Unlocalized)
					{
						
						return ((Unlocalized)annotation).name();
					}
				}
			}
		}

		return translateKey;
	}

	public static String translateFacing(EnumFacing facing)
	{
		return GuiLangKeys.translateString("prefab.gui." + facing.getName2());
	}
	
	public static String translateDye(EnumDyeColor dyeColor)
	{
		return GuiLangKeys.translateString("prefab.gui." + dyeColor.getUnlocalizedName());
	}
	
	/**
	 * An annotation which allows the UI to get the unlocalized name;
	 * @author WuestMan
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target(java.lang.annotation.ElementType.FIELD)
	public @interface Unlocalized
	{
		public String name() default "";
	}
}