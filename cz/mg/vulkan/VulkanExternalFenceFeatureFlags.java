package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalFenceFeatureFlags extends VulkanFlags {
    public VulkanExternalFenceFeatureFlags(){
        super(new VkExternalFenceFeatureFlags());
    }

    public VulkanExternalFenceFeatureFlags(VkExternalFenceFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalFenceFeatureFlags getVk(){
        return (VkExternalFenceFeatureFlags) super.getVk();
    }

    public VulkanExternalFenceFeatureFlags(int value){
        super(new VkExternalFenceFeatureFlags(value));
    }
}
