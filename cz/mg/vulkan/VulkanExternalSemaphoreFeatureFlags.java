package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanExternalSemaphoreFeatureFlags extends VulkanFlags {
    public VulkanExternalSemaphoreFeatureFlags(){
        super(new VkExternalSemaphoreFeatureFlags());
    }

    public VulkanExternalSemaphoreFeatureFlags(VkExternalSemaphoreFeatureFlags vk){
        super(vk);
    }

    @Override
    public VkExternalSemaphoreFeatureFlags getVk(){
        return (VkExternalSemaphoreFeatureFlags) super.getVk();
    }

    public VulkanExternalSemaphoreFeatureFlags(int value){
        super(new VkExternalSemaphoreFeatureFlags(value));
    }
}
