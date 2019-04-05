package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanRenderPassCreateFlags extends VulkanFlags {
    public VulkanRenderPassCreateFlags(){
        super(new VkRenderPassCreateFlags());
    }

    public VulkanRenderPassCreateFlags(VkRenderPassCreateFlags vk){
        super(vk);
    }

    @Override
    public VkRenderPassCreateFlags getVk(){
        return (VkRenderPassCreateFlags) super.getVk();
    }

    public VulkanRenderPassCreateFlags(int value){
        super(new VkRenderPassCreateFlags(value));
    }
}
