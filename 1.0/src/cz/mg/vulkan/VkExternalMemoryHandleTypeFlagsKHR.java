package cz.mg.vulkan;

public class VkExternalMemoryHandleTypeFlagsKHR extends VkFlags {
    public VkExternalMemoryHandleTypeFlagsKHR() {
    }

    protected VkExternalMemoryHandleTypeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryHandleTypeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryHandleTypeFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryHandleTypeFlagsKHR(int value) {
        setValue(value);
    }
}
