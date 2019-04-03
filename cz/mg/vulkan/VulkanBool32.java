package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBool32.html">khronos documentation</a>
 **/
public class VulkanBool32 extends VulkanUInt32 {
    public VulkanBool32(){
        super(new VkBool32());
    }

    public VulkanBool32(VkBool32 vk){
        super(vk);
    }

    @Override
    public VkBool32 getVk(){
        return (VkBool32) super.getVk();
    }

    public VulkanBool32(int value){
        super(new VkBool32(value));
    }
}
