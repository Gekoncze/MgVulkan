package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int8_t.html">khronos documentation</a>
 **/
public class VulkanInt8 extends VulkanObject {
    public VulkanInt8(){
        super(new VkInt8());
    }

    public VulkanInt8(VkInt8 vk){
        super(vk);
    }

    @Override
    public VkInt8 getVk(){
        return (VkInt8) super.getVk();
    }

    public VulkanInt8(byte value){
        super(new VkInt8(value));
    }

    public byte getValue(){
        return getVk().getValue();
    }

    public void setValue(byte value){
        getVk().setValue(value);
    }
}
