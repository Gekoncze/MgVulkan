package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFramebufferCreateFlags extends VulkanFlags {
    public VulkanFramebufferCreateFlags(){
        super(new VkFramebufferCreateFlags());
    }

    public VulkanFramebufferCreateFlags(VkFramebufferCreateFlags vk){
        super(vk);
    }

    @Override
    public VkFramebufferCreateFlags getVk(){
        return (VkFramebufferCreateFlags) super.getVk();
    }

    public VulkanFramebufferCreateFlags(int value){
        super(new VkFramebufferCreateFlags(value));
    }
}
