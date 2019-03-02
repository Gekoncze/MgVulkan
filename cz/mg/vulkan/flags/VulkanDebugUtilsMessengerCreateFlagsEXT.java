package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkDebugUtilsMessengerCreateFlagsEXT;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanDebugUtilsMessengerCreateFlagsEXT {
    public final VkDebugUtilsMessengerCreateFlagsEXT flags;

    public VulkanDebugUtilsMessengerCreateFlagsEXT() {
        this(0);
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT(int flag){
        this(new VkDebugUtilsMessengerCreateFlagsEXT(flag));
    }

    public VulkanDebugUtilsMessengerCreateFlagsEXT(VkDebugUtilsMessengerCreateFlagsEXT flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkDebugUtilsMessengerCreateFlagsEXT.class);
    }
}
