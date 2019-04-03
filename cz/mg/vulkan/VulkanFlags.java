package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFlags.html">khronos documentation</a>
 **/
public class VulkanFlags extends VulkanUInt32 {
    public VulkanFlags(){
        super(new VkFlags());
    }

    public VulkanFlags(VkFlags vk){
        super(vk);
    }

    @Override
    public VkFlags getVk(){
        return (VkFlags) super.getVk();
    }

    public VulkanFlags(int value){
        super(new VkFlags(value));
    }
}
