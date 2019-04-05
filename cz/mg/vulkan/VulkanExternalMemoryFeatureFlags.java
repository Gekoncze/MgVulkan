package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalMemoryFeatureFlags extends VulkanFlags {
    public VulkanExternalMemoryFeatureFlags(){
        super(new VkExternalMemoryFeatureFlags());
    }

    public VulkanExternalMemoryFeatureFlags(VkExternalMemoryFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalMemoryFeatureFlags getVk(){
        return (VkExternalMemoryFeatureFlags) super.getVk();
    }

    public VulkanExternalMemoryFeatureFlags(int value){
        super(new VkExternalMemoryFeatureFlags(value));
    }
}
