package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryHeapFlags extends VulkanFlags {
    public VulkanMemoryHeapFlags(){
        super(new VkMemoryHeapFlags());
    }

    public VulkanMemoryHeapFlags(VkMemoryHeapFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryHeapFlags getVk(){
        return (VkMemoryHeapFlags) super.getVk();
    }

    public VulkanMemoryHeapFlags(int value){
        super(new VkMemoryHeapFlags(value));
    }
}
