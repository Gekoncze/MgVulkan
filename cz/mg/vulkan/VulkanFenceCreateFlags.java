package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceCreateFlags.html">khronos documentation</a>
 **/
public class VulkanFenceCreateFlags extends VulkanFlags {
    public VulkanFenceCreateFlags(){
        super(new VkFenceCreateFlags());
    }

    public VulkanFenceCreateFlags(VkFenceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkFenceCreateFlags getVk(){
        return (VkFenceCreateFlags) super.getVk();
    }

    public VulkanFenceCreateFlags(int value){
        super(new VkFenceCreateFlags(value));
    }
}
