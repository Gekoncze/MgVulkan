package cz.mg.vulkan.flags;

import cz.mg.vulkan.jna.flags.VkShaderModuleCreateFlags;
import cz.mg.vulkan.jna.utilities.ToString;


public class VulkanShaderModuleCreateFlags {
    public final VkShaderModuleCreateFlags flags;

    public VulkanShaderModuleCreateFlags(){
        this(0);
    }

    public VulkanShaderModuleCreateFlags(int flag){
        this(new VkShaderModuleCreateFlags(flag));
    }

    public VulkanShaderModuleCreateFlags(VkShaderModuleCreateFlags flags) {
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
        return ToString.flagsToStringNoLabels(flags.value, VkShaderModuleCreateFlags.class);
    }
}
