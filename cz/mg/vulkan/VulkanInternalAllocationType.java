package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanInternalAllocationType extends VulkanEnum {
    public static final int EXECUTABLE = VkInternalAllocationType.VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE;

    public VulkanInternalAllocationType(){
        super(new VkInternalAllocationType());
    }

    public VulkanInternalAllocationType(VkInternalAllocationType vk){
        super(vk);
    }

    @Override
    public VkInternalAllocationType getVk(){
        return (VkInternalAllocationType) super.getVk();
    }

    public VulkanInternalAllocationType(int value){
        super(new VkInternalAllocationType(value));
    }

    @Override
    public String toString() {
        if(getValue() == EXECUTABLE) return "EXECUTABLE";
        return "UNKNOWN";
    }
}
