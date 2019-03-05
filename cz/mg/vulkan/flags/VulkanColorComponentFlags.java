package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkColorComponentFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanColorComponentFlags {
    public static final int R = VkColorComponentFlags.VK_COLOR_COMPONENT_R_BIT;
    public static final int G = VkColorComponentFlags.VK_COLOR_COMPONENT_G_BIT;
    public static final int B = VkColorComponentFlags.VK_COLOR_COMPONENT_B_BIT;
    public static final int A = VkColorComponentFlags.VK_COLOR_COMPONENT_A_BIT;

    public final VkColorComponentFlags flags;

    public VulkanColorComponentFlags(){
        this(0);
    }

    public VulkanColorComponentFlags(int flag){
        this(new VkColorComponentFlags(flag));
    }

    public VulkanColorComponentFlags(VkColorComponentFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkColorComponentFlags.class);
    }
}
