package cz.mg.vulkan.vk;

public class VkSwapchainCreateFlagsKHR extends VkFlags {
    public VkSwapchainCreateFlagsKHR() {
    }

    public VkSwapchainCreateFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSwapchainCreateFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkSwapchainCreateFlagsKHR(int value) {
        setValue(value);
    }
}
