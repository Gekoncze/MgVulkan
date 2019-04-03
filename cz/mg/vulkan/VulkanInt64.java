package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/int64_t.html">khronos documentation</a>
 **/
public class VulkanInt64 extends VulkanObject {
    public VulkanInt64(){
        super(new VkInt64());
    }

    public VulkanInt64(VkInt64 vk){
        super(vk);
    }

    @Override
    public VkInt64 getVk(){
        return (VkInt64) super.getVk();
    }

    public VulkanInt64(long value){
        super(new VkInt64(value));
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }
}
