package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFramebuffer.html">khronos documentation</a>
 **/
public class VulkanFramebuffer extends VulkanHandle {
    public VulkanFramebuffer(){
        super(new VkFramebuffer());
    }

    public VulkanFramebuffer(VkFramebuffer vk){
        super(vk);
    }

    @Override
    public VkFramebuffer getVk(){
        return (VkFramebuffer) super.getVk();
    }

    public VulkanFramebuffer(int value){
        super(new VkFramebuffer(value));
    }
}
