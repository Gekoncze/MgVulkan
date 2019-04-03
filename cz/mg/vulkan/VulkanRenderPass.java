package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkRenderPass.html">khronos documentation</a>
 **/
public class VulkanRenderPass extends VulkanHandle {
    public VulkanRenderPass(){
        super(new VkRenderPass());
    }

    public VulkanRenderPass(VkRenderPass vk){
        super(vk);
    }

    @Override
    public VkRenderPass getVk(){
        return (VkRenderPass) super.getVk();
    }

    public VulkanRenderPass(int value){
        super(new VkRenderPass(value));
    }
}
