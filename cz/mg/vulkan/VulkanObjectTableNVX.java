package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkObjectTableNVX.html">khronos documentation</a>
 **/
public class VulkanObjectTableNVX extends VulkanHandle {
    public VulkanObjectTableNVX(){
        super(new VkObjectTableNVX());
    }

    public VulkanObjectTableNVX(VkObjectTableNVX vk){
        super(vk);
    }

    @Override
    public VkObjectTableNVX getVk(){
        return (VkObjectTableNVX) super.getVk();
    }

    public VulkanObjectTableNVX(int value){
        super(new VkObjectTableNVX(value));
    }
}
