package cz.mg.vulkan;

public class VkExternalSemaphoreHandleTypeFlags extends VkFlags {
    public VkExternalSemaphoreHandleTypeFlags() {
    }

    protected VkExternalSemaphoreHandleTypeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalSemaphoreHandleTypeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalSemaphoreHandleTypeFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalSemaphoreHandleTypeFlags(int value) {
        setValue(value);
    }
}
