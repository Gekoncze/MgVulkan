package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkEventCreateFlags.html">khronos documentation</a>
 **/
public class VulkanEventCreateFlags extends VulkanFlags {
    public VulkanEventCreateFlags(){
        super(new VkEventCreateFlags());
    }

    public VulkanEventCreateFlags(VkEventCreateFlags vk){
        super(vk);
    }

    @Override
    public VkEventCreateFlags getVk(){
        return (VkEventCreateFlags) super.getVk();
    }

    public VulkanEventCreateFlags(int value){
        super(new VkEventCreateFlags(value));
    }
}
