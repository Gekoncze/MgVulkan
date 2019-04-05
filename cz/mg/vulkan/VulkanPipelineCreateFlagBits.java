package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineCreateFlagBits extends VulkanFlagBits {
    public static final int DISABLE_OPTIMIZATION = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT;
    public static final int ALLOW_DERIVATIVES = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT;
    public static final int DERIVATIVE = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DERIVATIVE_BIT;
    public static final int VIEW_INDEX_FROM_DEVICE_INDEX = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final int DISPATCH_BASE = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE;
    public static final int VIEW_INDEX_FROM_DEVICE_INDEX_KHR = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR;
    public static final int DISPATCH_BASE_KHR = VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE_KHR;

    public VulkanPipelineCreateFlagBits(){
        super(new VkPipelineCreateFlagBits());
    }

    public VulkanPipelineCreateFlagBits(VkPipelineCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkPipelineCreateFlagBits getVk(){
        return (VkPipelineCreateFlagBits) super.getVk();
    }

    public VulkanPipelineCreateFlagBits(int value){
        super(new VkPipelineCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DISABLE_OPTIMIZATION) s += "DISABLE_OPTIMIZATION";
        if(getValue() == ALLOW_DERIVATIVES) s += "ALLOW_DERIVATIVES";
        if(getValue() == DERIVATIVE) s += "DERIVATIVE";
        if(getValue() == VIEW_INDEX_FROM_DEVICE_INDEX) s += "VIEW_INDEX_FROM_DEVICE_INDEX";
        if(getValue() == DISPATCH_BASE) s += "DISPATCH_BASE";
        if(getValue() == VIEW_INDEX_FROM_DEVICE_INDEX_KHR) s += "VIEW_INDEX_FROM_DEVICE_INDEX_KHR";
        if(getValue() == DISPATCH_BASE_KHR) s += "DISPATCH_BASE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
