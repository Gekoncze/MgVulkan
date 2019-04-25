package cz.mg.vulkan;

public class VkSwapchainCreateFlagsKHR extends VkFlags {
    public VkSwapchainCreateFlagsKHR() {
    }

    protected VkSwapchainCreateFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSwapchainCreateFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSwapchainCreateFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkSwapchainCreateFlagsKHR(int value) {
        setValue(value);
    }
}
