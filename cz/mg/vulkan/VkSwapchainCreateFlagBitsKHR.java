package cz.mg.vulkan;

public class VkSwapchainCreateFlagBitsKHR extends VkFlagBits {
    public static final int VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR = 0x00000001;
    public static final int VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR = 0x00000002;

    public VkSwapchainCreateFlagBitsKHR() {
    }

    public VkSwapchainCreateFlagBitsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSwapchainCreateFlagBitsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSwapchainCreateFlagBitsKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR) s += "VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR";
        if(getValue() == VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR) s += "VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }
}
