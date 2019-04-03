package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDependencyFlags.html">khronos documentation</a>
 **/
public class VulkanDependencyFlags extends VulkanFlags {
    public VulkanDependencyFlags(){
        super(new VkDependencyFlags());
    }

    public VulkanDependencyFlags(VkDependencyFlags vk){
        super(vk);
    }

    @Override
    public VkDependencyFlags getVk(){
        return (VkDependencyFlags) super.getVk();
    }

    public VulkanDependencyFlags(int value){
        super(new VkDependencyFlags(value));
    }
}
