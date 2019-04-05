package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBufferCreateFlags extends VulkanFlags {
    public VulkanBufferCreateFlags(){
        super(new VkBufferCreateFlags());
    }

    public VulkanBufferCreateFlags(VkBufferCreateFlags vk){
        super(vk);
    }

    @Override
    public VkBufferCreateFlags getVk(){
        return (VkBufferCreateFlags) super.getVk();
    }

    public VulkanBufferCreateFlags(int value){
        super(new VkBufferCreateFlags(value));
    }
}
