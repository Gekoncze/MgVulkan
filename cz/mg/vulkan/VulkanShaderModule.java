package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderModule.html">khronos documentation</a>
 **/
public class VulkanShaderModule extends VulkanHandle {
    public VulkanShaderModule(){
        super(new VkShaderModule());
    }

    public VulkanShaderModule(VkShaderModule vk){
        super(vk);
    }

    @Override
    public VkShaderModule getVk(){
        return (VkShaderModule) super.getVk();
    }

    public VulkanShaderModule(int value){
        super(new VkShaderModule(value));
    }
}
