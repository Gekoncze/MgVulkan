package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPeerMemoryFeatureFlags extends VulkanFlags {
    public VulkanPeerMemoryFeatureFlags(){
        super(new VkPeerMemoryFeatureFlags());
    }

    public VulkanPeerMemoryFeatureFlags(VkPeerMemoryFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkPeerMemoryFeatureFlags getVk(){
        return (VkPeerMemoryFeatureFlags) super.getVk();
    }

    public VulkanPeerMemoryFeatureFlags(int value){
        super(new VkPeerMemoryFeatureFlags(value));
    }
}
