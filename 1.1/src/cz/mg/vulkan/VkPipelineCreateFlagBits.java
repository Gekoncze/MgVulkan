package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkPipelineCreateFlagBits extends VkFlagBits {
    public static final int VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT = 0x00000001;
    public static final int VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT = 0x00000002;
    public static final int VK_PIPELINE_CREATE_DERIVATIVE_BIT = 0x00000004;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT = 0x00000008;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE = 0x00000010;
    public static final int VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR = VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT;
    public static final int VK_PIPELINE_CREATE_DISPATCH_BASE_KHR = VK_PIPELINE_CREATE_DISPATCH_BASE;

    public VkPipelineCreateFlagBits() {
    }

    public VkPipelineCreateFlagBits(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPipelineCreateFlagBits(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkPipelineCreateFlagBits(int value) {
        setValue(value);
    }

    public VkPipelineCreateFlagBits(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT) != 0) s.addLast("VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT");
        if((getValue() & VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT) != 0) s.addLast("VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT");
        if((getValue() & VK_PIPELINE_CREATE_DERIVATIVE_BIT) != 0) s.addLast("VK_PIPELINE_CREATE_DERIVATIVE_BIT");
        if((getValue() & VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT) != 0) s.addLast("VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT");
        if((getValue() & VK_PIPELINE_CREATE_DISPATCH_BASE) != 0) s.addLast("VK_PIPELINE_CREATE_DISPATCH_BASE");
        if((getValue() & VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR) != 0) s.addLast("VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR");
        if((getValue() & VK_PIPELINE_CREATE_DISPATCH_BASE_KHR) != 0) s.addLast("VK_PIPELINE_CREATE_DISPATCH_BASE_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
