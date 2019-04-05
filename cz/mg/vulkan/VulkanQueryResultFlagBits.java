package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueryResultFlagBits extends VulkanFlagBits {
    public static final int B64 = VkQueryResultFlagBits.VK_QUERY_RESULT_64_BIT;
    public static final int WAIT = VkQueryResultFlagBits.VK_QUERY_RESULT_WAIT_BIT;
    public static final int WITH_AVAILABILITY = VkQueryResultFlagBits.VK_QUERY_RESULT_WITH_AVAILABILITY_BIT;
    public static final int PARTIAL = VkQueryResultFlagBits.VK_QUERY_RESULT_PARTIAL_BIT;

    public VulkanQueryResultFlagBits(){
        super(new VkQueryResultFlagBits());
    }

    public VulkanQueryResultFlagBits(VkQueryResultFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueryResultFlagBits getVk(){
        return (VkQueryResultFlagBits) super.getVk();
    }

    public VulkanQueryResultFlagBits(int value){
        super(new VkQueryResultFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == B64) s += "B64";
        if(getValue() == WAIT) s += "WAIT";
        if(getValue() == WITH_AVAILABILITY) s += "WITH_AVAILABILITY";
        if(getValue() == PARTIAL) s += "PARTIAL";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
