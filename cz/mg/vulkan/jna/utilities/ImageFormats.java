package cz.mg.vulkan.jna.utilities;

import cz.mg.collections.list.List;
import cz.mg.collections.list.chainlist.ChainList;
import cz.mg.vulkan.jna.VkSimplified;
import cz.mg.vulkan.jna.enums.VkFormat;
import cz.mg.vulkan.jna.enums.VkImageTiling;
import cz.mg.vulkan.jna.enums.VkImageType;
import cz.mg.vulkan.jna.flags.VkImageCreateFlags;
import cz.mg.vulkan.jna.flags.VkImageUsageFlags;
import cz.mg.vulkan.jna.handles.VkPhysicalDevice;
import cz.mg.vulkan.jna.structures.VkImageFormatProperties;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


public class ImageFormats {
    public static List<ImageFormat> find(VkSimplified vks, VkPhysicalDevice.ByValue device, VkImageType.ByValue type, VkImageTiling.ByValue tiling, VkImageUsageFlags.ByValue usage, VkImageCreateFlags.ByValue flags){
        ChainList<ImageFormat> formats = new ChainList<>();
        Class c = VkFormat.class;
        for(Field field : c.getFields()){
            if(Modifier.isStatic(field.getModifiers())){
                if(field.getType() == int.class){
                    try {
                        VkFormat.ByValue format = new VkFormat.ByValue(field.getInt(null));
                        VkImageFormatProperties.ByValue properties = vks.vkGetPhysicalDeviceImageFormatProperties(device, format, type, tiling, usage, flags);
                        formats.addLast(new ImageFormat(format, field.getName(), properties));
                    } catch (Exception e){}
                }
            }
        }
        return formats;
    }

    public static class ImageFormat {
        private final VkFormat.ByValue format;
        private final String name;
        private final VkImageFormatProperties.ByValue properties;

        public ImageFormat(VkFormat.ByValue format, String name, VkImageFormatProperties.ByValue properties) {
            this.format = format;
            this.name = name;
            this.properties = properties;
        }

        public VkFormat.ByValue getFormat() {
            return format;
        }

        public String getName() {
            return name;
        }

        public VkImageFormatProperties.ByValue getProperties() {
            return properties;
        }
    }
}
