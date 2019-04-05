package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanSubgroupFeatureFlags extends VulkanFlags {
    public VulkanSubgroupFeatureFlags(){
        super(new VkSubgroupFeatureFlags());
    }

    public VulkanSubgroupFeatureFlags(VkSubgroupFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkSubgroupFeatureFlags getVk(){
        return (VkSubgroupFeatureFlags) super.getVk();
    }

    public VulkanSubgroupFeatureFlags(int value){
        super(new VkSubgroupFeatureFlags(value));
    }
}
