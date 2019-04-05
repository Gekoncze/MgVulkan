package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueueFlags extends VulkanFlags {
    public VulkanQueueFlags(){
        super(new VkQueueFlags());
    }

    public VulkanQueueFlags(VkQueueFlags vk){
        super(vk);
    }

    @Override
    public VkQueueFlags getVk(){
        return (VkQueueFlags) super.getVk();
    }

    public VulkanQueueFlags(int value){
        super(new VkQueueFlags(value));
    }
}
