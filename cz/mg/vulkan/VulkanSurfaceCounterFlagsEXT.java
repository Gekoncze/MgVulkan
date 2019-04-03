package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSurfaceCounterFlagsEXT.html">khronos documentation</a>
 **/
public class VulkanSurfaceCounterFlagsEXT extends VulkanFlags {
    public VulkanSurfaceCounterFlagsEXT(){
        super(new VkSurfaceCounterFlagsEXT());
    }

    public VulkanSurfaceCounterFlagsEXT(VkSurfaceCounterFlagsEXT vk){
        super(vk);
    }

    @Override
    public VkSurfaceCounterFlagsEXT getVk(){
        return (VkSurfaceCounterFlagsEXT) super.getVk();
    }

    public VulkanSurfaceCounterFlagsEXT(int value){
        super(new VkSurfaceCounterFlagsEXT(value));
    }
}
