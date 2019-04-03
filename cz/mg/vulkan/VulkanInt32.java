package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int32_t.html">khronos documentation</a>
 **/
public class VulkanInt32 extends VulkanObject {
    public VulkanInt32(){
        super(new VkInt32());
    }

    public VulkanInt32(VkInt32 vk){
        super(vk);
    }

    @Override
    public VkInt32 getVk(){
        return (VkInt32) super.getVk();
    }

    public VulkanInt32(int value){
        super(new VkInt32(value));
    }

    public int getValue(){
        return getVk().getValue();
    }

    public void setValue(int value){
        getVk().setValue(value);
    }
}
