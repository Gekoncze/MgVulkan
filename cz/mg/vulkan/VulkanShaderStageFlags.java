package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderStageFlags extends VulkanFlags {
    public VulkanShaderStageFlags(){
        super(new VkShaderStageFlags());
    }

    public VulkanShaderStageFlags(VkShaderStageFlags vk){
        super(vk);
    }

    @Override
    public VkShaderStageFlags getVk(){
        return (VkShaderStageFlags) super.getVk();
    }

    public VulkanShaderStageFlags(int value){
        super(new VkShaderStageFlags(value));
    }
}
