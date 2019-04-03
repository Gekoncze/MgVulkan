package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImage.html">khronos documentation</a>
 **/
public class VulkanImage extends VulkanHandle {
    public VulkanImage(){
        super(new VkImage());
    }

    public VulkanImage(VkImage vk){
        super(vk);
    }

    @Override
    public VkImage getVk(){
        return (VkImage) super.getVk();
    }

    public VulkanImage(int value){
        super(new VkImage(value));
    }
}
