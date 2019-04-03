package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkEvent.html">khronos documentation</a>
 **/
public class VulkanEvent extends VulkanHandle {
    public VulkanEvent(){
        super(new VkEvent());
    }

    public VulkanEvent(VkEvent vk){
        super(vk);
    }

    @Override
    public VkEvent getVk(){
        return (VkEvent) super.getVk();
    }

    public VulkanEvent(int value){
        super(new VkEvent(value));
    }
}
