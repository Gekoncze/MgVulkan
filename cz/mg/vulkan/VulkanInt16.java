package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int16_t.html">khronos documentation</a>
 **/
public class VulkanInt16 extends VulkanObject {
    public VulkanInt16(){
        super(new VkInt16());
    }

    public VulkanInt16(VkInt16 vk){
        super(vk);
    }

    @Override
    public VkInt16 getVk(){
        return (VkInt16) super.getVk();
    }

    public VulkanInt16(short value){
        super(new VkInt16(value));
    }

    public short getValue(){
        return getVk().getValue();
    }

    public void setValue(short value){
        getVk().setValue(value);
    }
}
