package cz.mg.vulkan;

public class VkExternalMemoryHandleTypeFlagsNV extends VkFlags {
    public VkExternalMemoryHandleTypeFlagsNV() {
    }

    protected VkExternalMemoryHandleTypeFlagsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryHandleTypeFlagsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryHandleTypeFlagsNV(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryHandleTypeFlagsNV(int value) {
        setValue(value);
    }
}
