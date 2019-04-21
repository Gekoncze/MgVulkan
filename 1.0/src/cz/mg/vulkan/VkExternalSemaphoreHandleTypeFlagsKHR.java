package cz.mg.vulkan;

public class VkExternalSemaphoreHandleTypeFlagsKHR extends VkFlags {
    public VkExternalSemaphoreHandleTypeFlagsKHR() {
    }

    public VkExternalSemaphoreHandleTypeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalSemaphoreHandleTypeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalSemaphoreHandleTypeFlagsKHR(int value) {
        setValue(value);
    }
}
