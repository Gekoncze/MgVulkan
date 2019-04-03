package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkShaderStageFlags.html">khronos documentation</a>
 **/
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
