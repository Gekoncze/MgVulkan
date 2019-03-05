package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkCullModeFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanCullModeFlags {
    public static final int NONE = VkCullModeFlags.VK_CULL_MODE_NONE;
    public static final int FRONT = VkCullModeFlags.VK_CULL_MODE_FRONT_BIT;
    public static final int BACK = VkCullModeFlags.VK_CULL_MODE_BACK_BIT;
    public static final int FRONT_AND_BACK = VkCullModeFlags.VK_CULL_MODE_FRONT_AND_BACK;

    public final VkCullModeFlags flags;

    public VulkanCullModeFlags(){
        this(0);
    }

    public VulkanCullModeFlags(int flag){
        this(new VkCullModeFlags(flag));
    }

    public VulkanCullModeFlags(VkCullModeFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkCullModeFlags.class);
    }
}
