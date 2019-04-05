package cz.mg.vulkan.vk;

public class VkPresentModeKHR extends VkEnum {
    public static final int VK_PRESENT_MODE_IMMEDIATE_KHR = 0;
    public static final int VK_PRESENT_MODE_MAILBOX_KHR = 1;
    public static final int VK_PRESENT_MODE_FIFO_KHR = 2;
    public static final int VK_PRESENT_MODE_FIFO_RELAXED_KHR = 3;
    public static final int VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR = 1000111000;
    public static final int VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR = 1000111001;

    public VkPresentModeKHR() {
    }

    public VkPresentModeKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkPresentModeKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkPresentModeKHR(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_PRESENT_MODE_IMMEDIATE_KHR) return "VK_PRESENT_MODE_IMMEDIATE_KHR";
        if(getValue() == VK_PRESENT_MODE_MAILBOX_KHR) return "VK_PRESENT_MODE_MAILBOX_KHR";
        if(getValue() == VK_PRESENT_MODE_FIFO_KHR) return "VK_PRESENT_MODE_FIFO_KHR";
        if(getValue() == VK_PRESENT_MODE_FIFO_RELAXED_KHR) return "VK_PRESENT_MODE_FIFO_RELAXED_KHR";
        if(getValue() == VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR) return "VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR";
        if(getValue() == VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR) return "VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR";
        return "UNKNOWN";
    }
}
