package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkDebugUtilsMessengerCallbackDataFlagsEXT;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanDebugUtilsMessengerCallbackDataFlagsEXT {
    public final VkDebugUtilsMessengerCallbackDataFlagsEXT flags;

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT() {
        this(0);
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(int flag){
        this(new VkDebugUtilsMessengerCallbackDataFlagsEXT(flag));
    }

    public VulkanDebugUtilsMessengerCallbackDataFlagsEXT(VkDebugUtilsMessengerCallbackDataFlagsEXT flags) {
        this.flags = flags;
    }

    public boolean isSet(int flag){
        return (flags.value & flag) != 0;
    }

    public void set(int flag){
        flags.value |= flag;
    }

    @Override
    public String toString() {
        return ToString.flagsToStringNoLabels(flags.value, VkDebugUtilsMessengerCallbackDataFlagsEXT.class);
    }
}
