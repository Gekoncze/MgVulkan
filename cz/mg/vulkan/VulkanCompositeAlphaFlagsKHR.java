package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkCompositeAlphaFlagsKHR.html">khronos documentation</a>
 **/
public class VulkanCompositeAlphaFlagsKHR extends VulkanFlags {
    public VulkanCompositeAlphaFlagsKHR(){
        super(new VkCompositeAlphaFlagsKHR());
    }

    public VulkanCompositeAlphaFlagsKHR(VkCompositeAlphaFlagsKHR vk){
        super(vk);
    }

    @Override
    public VkCompositeAlphaFlagsKHR getVk(){
        return (VkCompositeAlphaFlagsKHR) super.getVk();
    }

    public VulkanCompositeAlphaFlagsKHR(int value){
        super(new VkCompositeAlphaFlagsKHR(value));
    }
}
