package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDevice.html">khronos documentation</a>
 **/
public class VulkanDevice extends VulkanHandle {
    public VulkanDevice(){
        super(new VkDevice());
    }

    public VulkanDevice(VkDevice vk){
        super(vk);
    }

    @Override
    public VkDevice getVk(){
        return (VkDevice) super.getVk();
    }

    public VulkanDevice(int value){
        super(new VkDevice(value));
    }
}
