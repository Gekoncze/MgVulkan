package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/size_t.html">khronos documentation</a>
 **/
public class VulkanSize extends VulkanObject {
    public VulkanSize(){
        super(new VkSize());
    }

    public VulkanSize(VkSize vk){
        super(vk);
    }

    @Override
    public VkSize getVk(){
        return (VkSize) super.getVk();
    }

    public VulkanSize(long value){
        super(new VkSize(value));
    }

    public long getValue(){
        return getVk().getValue();
    }

    public void setValue(long value){
        getVk().setValue(value);
    }
}
