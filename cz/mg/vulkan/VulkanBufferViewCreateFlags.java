package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanBufferViewCreateFlags extends VulkanFlags {
    public VulkanBufferViewCreateFlags(){
        super(new VkBufferViewCreateFlags());
    }

    public VulkanBufferViewCreateFlags(VkBufferViewCreateFlags vk){
        super(vk);
    }

    @Override
    public VkBufferViewCreateFlags getVk(){
        return (VkBufferViewCreateFlags) super.getVk();
    }

    public VulkanBufferViewCreateFlags(int value){
        super(new VkBufferViewCreateFlags(value));
    }
}
