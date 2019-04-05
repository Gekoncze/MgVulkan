package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanShaderModuleCreateFlags extends VulkanFlags {
    public VulkanShaderModuleCreateFlags(){
        super(new VkShaderModuleCreateFlags());
    }

    public VulkanShaderModuleCreateFlags(VkShaderModuleCreateFlags vk){
        super(vk);
    }

    @Override
    public VkShaderModuleCreateFlags getVk(){
        return (VkShaderModuleCreateFlags) super.getVk();
    }

    public VulkanShaderModuleCreateFlags(int value){
        super(new VkShaderModuleCreateFlags(value));
    }
}
