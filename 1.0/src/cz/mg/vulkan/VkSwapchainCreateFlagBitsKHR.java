package cz.mg.vulkan;

import cz.mg.collections.list.chainlist.ChainList;

public class VkSwapchainCreateFlagBitsKHR extends VkFlagBits {
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 0x00000002;

    public VkSwapchainCreateFlagBitsKHR() {
    }

    protected VkSwapchainCreateFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSwapchainCreateFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSwapchainCreateFlagBitsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkSwapchainCreateFlagBitsKHR(int value) {
        setValue(value);
    }

    public VkSwapchainCreateFlagBitsKHR(VkFlags flags) {
        setValue(flags.getValue());
    }

    @Override
    public String toString() {
        ChainList<String> s = new ChainList<>();
        if((getValue() & VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR) != 0) s.addLast("VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR");
        if((getValue() & VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR) != 0) s.addLast("VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR");
        return s.toString(", ") + (s.count() > 0 ? " " : "") + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
