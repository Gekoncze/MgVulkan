package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFilter extends VulkanEnum {
    public static final int NEAREST = VkFilter.VK_FILTER_NEAREST;
    public static final int LINEAR = VkFilter.VK_FILTER_LINEAR;
    public static final int CUBIC_IMG = VkFilter.VK_FILTER_CUBIC_IMG;

    public VulkanFilter(){
        super(new VkFilter());
    }

    public VulkanFilter(VkFilter vk){
        super(vk);
    }

    @Override
    public VkFilter getVk(){
        return (VkFilter) super.getVk();
    }

    public VulkanFilter(int value){
        super(new VkFilter(value));
    }

    @Override
    public String toString() {
        if(getValue() == NEAREST) return "NEAREST";
        if(getValue() == LINEAR) return "LINEAR";
        if(getValue() == CUBIC_IMG) return "CUBIC_IMG";
        return "UNKNOWN";
    }
}
