package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkInstanceCreateFlags.html">khronos documentation</a>
 **/
public class VulkanInstanceCreateFlags extends VulkanFlags {
    public VulkanInstanceCreateFlags(){
        super(new VkInstanceCreateFlags());
    }

    public VulkanInstanceCreateFlags(VkInstanceCreateFlags vk){
        super(vk);
    }

    @Override
    public VkInstanceCreateFlags getVk(){
        return (VkInstanceCreateFlags) super.getVk();
    }

    public VulkanInstanceCreateFlags(int value){
        super(new VkInstanceCreateFlags(value));
    }
}
