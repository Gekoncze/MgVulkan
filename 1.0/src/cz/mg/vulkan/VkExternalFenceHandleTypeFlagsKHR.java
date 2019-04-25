package cz.mg.vulkan;

public class VkExternalFenceHandleTypeFlagsKHR extends VkFlags {
    public VkExternalFenceHandleTypeFlagsKHR() {
    }

    protected VkExternalFenceHandleTypeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalFenceHandleTypeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalFenceHandleTypeFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalFenceHandleTypeFlagsKHR(int value) {
        setValue(value);
    }
}
