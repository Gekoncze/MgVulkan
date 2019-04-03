package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassDescriptionFlags.html">khronos documentation</a>
 **/
public class VulkanSubpassDescriptionFlags extends VulkanFlags {
    public VulkanSubpassDescriptionFlags(){
        super(new VkSubpassDescriptionFlags());
    }

    public VulkanSubpassDescriptionFlags(VkSubpassDescriptionFlags vk){
        super(vk);
    }

    @Override
    public VkSubpassDescriptionFlags getVk(){
        return (VkSubpassDescriptionFlags) super.getVk();
    }

    public VulkanSubpassDescriptionFlags(int value){
        super(new VkSubpassDescriptionFlags(value));
    }
}
