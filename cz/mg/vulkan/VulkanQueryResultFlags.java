package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryResultFlags.html">khronos documentation</a>
 **/
public class VulkanQueryResultFlags extends VulkanFlags {
    public VulkanQueryResultFlags(){
        super(new VkQueryResultFlags());
    }

    public VulkanQueryResultFlags(VkQueryResultFlags vk){
        super(vk);
    }

    @Override
    public VkQueryResultFlags getVk(){
        return (VkQueryResultFlags) super.getVk();
    }

    public VulkanQueryResultFlags(int value){
        super(new VkQueryResultFlags(value));
    }
}
