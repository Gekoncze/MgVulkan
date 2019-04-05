package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryAllocateFlags extends VulkanFlags {
    public VulkanMemoryAllocateFlags(){
        super(new VkMemoryAllocateFlags());
    }

    public VulkanMemoryAllocateFlags(VkMemoryAllocateFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateFlags getVk(){
        return (VkMemoryAllocateFlags) super.getVk();
    }

    public VulkanMemoryAllocateFlags(int value){
        super(new VkMemoryAllocateFlags(value));
    }
}
