package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/uint64_t.html">khronos documentation</a>
 **/
public class VulkanUInt64 extends VulkanObject {
    public VulkanUInt64(){
        super(new VkUInt64());
    }

    public VulkanUInt64(VkUInt64 vk){
        super(vk);
    }

    @Override
    public VkUInt64 getVk(){
        return (VkUInt64) super.getVk();
    }

    public VulkanUInt64(long value){
        super(new VkUInt64(value));
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }
}
