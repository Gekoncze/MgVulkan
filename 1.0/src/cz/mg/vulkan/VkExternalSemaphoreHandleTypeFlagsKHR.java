package cz.mg.vulkan;

public class VkExternalSemaphoreHandleTypeFlagsKHR extends VkFlags {
    public VkExternalSemaphoreHandleTypeFlagsKHR() {
    }

    protected VkExternalSemaphoreHandleTypeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalSemaphoreHandleTypeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalSemaphoreHandleTypeFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalSemaphoreHandleTypeFlagsKHR(int value) {
        setValue(value);
    }
}
