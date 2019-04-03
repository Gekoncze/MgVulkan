package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAccessFlags.html">khronos documentation</a>
 **/
public class VulkanAccessFlags extends VulkanFlags {
    public VulkanAccessFlags(){
        super(new VkAccessFlags());
    }

    public VulkanAccessFlags(VkAccessFlags vk){
        super(vk);
    }

    @Override
    public VkAccessFlags getVk(){
        return (VkAccessFlags) super.getVk();
    }

    public VulkanAccessFlags(int value){
        super(new VkAccessFlags(value));
    }
}
