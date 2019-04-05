package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanMemoryPropertyFlags extends VulkanFlags {
    public VulkanMemoryPropertyFlags(){
        super(new VkMemoryPropertyFlags());
    }

    public VulkanMemoryPropertyFlags(VkMemoryPropertyFlags vk){
        super(vk);
    }

    @Override
    public VkMemoryPropertyFlags getVk(){
        return (VkMemoryPropertyFlags) super.getVk();
    }

    public VulkanMemoryPropertyFlags(int value){
        super(new VkMemoryPropertyFlags(value));
    }
}
