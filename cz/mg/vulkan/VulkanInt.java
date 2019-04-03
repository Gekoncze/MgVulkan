package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int.html">khronos documentation</a>
 **/
public class VulkanInt extends VulkanObject {
    public VulkanInt(){
        super(new VkInt());
    }

    public VulkanInt(VkInt vk){
        super(vk);
    }

    @Override
    public VkInt getVk(){
        return (VkInt) super.getVk();
    }

    public VulkanInt(int value){
        super(new VkInt(value));
    }

    public int getValue(){
        return getVk().getValue();
    }

    public void setValue(int value){
        getVk().setValue(value);
    }
}
