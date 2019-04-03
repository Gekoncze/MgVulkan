package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageView.html">khronos documentation</a>
 **/
public class VulkanImageView extends VulkanHandle {
    public VulkanImageView(){
        super(new VkImageView());
    }

    public VulkanImageView(VkImageView vk){
        super(vk);
    }

    @Override
    public VkImageView getVk(){
        return (VkImageView) super.getVk();
    }

    public VulkanImageView(int value){
        super(new VkImageView(value));
    }
}
