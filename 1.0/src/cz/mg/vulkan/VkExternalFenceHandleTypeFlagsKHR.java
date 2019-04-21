package cz.mg.vulkan;

public class VkExternalFenceHandleTypeFlagsKHR extends VkFlags {
    public VkExternalFenceHandleTypeFlagsKHR() {
    }

    public VkExternalFenceHandleTypeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalFenceHandleTypeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalFenceHandleTypeFlagsKHR(int value) {
        setValue(value);
    }
}
