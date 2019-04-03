package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryControlFlags.html">khronos documentation</a>
 **/
public class VulkanQueryControlFlags extends VulkanFlags {
    public VulkanQueryControlFlags(){
        super(new VkQueryControlFlags());
    }

    public VulkanQueryControlFlags(VkQueryControlFlags vk){
        super(vk);
    }

    @Override
    public VkQueryControlFlags getVk(){
        return (VkQueryControlFlags) super.getVk();
    }

    public VulkanQueryControlFlags(int value){
        super(new VkQueryControlFlags(value));
    }
}
