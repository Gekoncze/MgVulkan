package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanObjectEntryUsageFlagsNVX extends VulkanFlags {
    public VulkanObjectEntryUsageFlagsNVX(){
        super(new VkObjectEntryUsageFlagsNVX());
    }

    public VulkanObjectEntryUsageFlagsNVX(VkObjectEntryUsageFlagsNVX vk){
        super(vk);
    }

    @Override
    public VkObjectEntryUsageFlagsNVX getVk(){
        return (VkObjectEntryUsageFlagsNVX) super.getVk();
    }

    public VulkanObjectEntryUsageFlagsNVX(int value){
        super(new VkObjectEntryUsageFlagsNVX(value));
    }
}
