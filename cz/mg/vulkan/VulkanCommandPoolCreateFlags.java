package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanCommandPoolCreateFlags extends VulkanFlags {
    public VulkanCommandPoolCreateFlags(){
        super(new VkCommandPoolCreateFlags());
    }

    public VulkanCommandPoolCreateFlags(VkCommandPoolCreateFlags vk){
        super(vk);
    }

    @Override
    public VkCommandPoolCreateFlags getVk(){
        return (VkCommandPoolCreateFlags) super.getVk();
    }

    public VulkanCommandPoolCreateFlags(int value){
        super(new VkCommandPoolCreateFlags(value));
    }
}
