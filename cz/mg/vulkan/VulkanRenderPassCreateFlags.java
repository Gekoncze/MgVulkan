package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPassCreateFlags.html">khronos documentation</a>
 **/
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
