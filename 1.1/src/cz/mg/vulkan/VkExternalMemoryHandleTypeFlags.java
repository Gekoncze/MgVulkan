package cz.mg.vulkan;

public class VkExternalMemoryHandleTypeFlags extends VkFlags {
    public VkExternalMemoryHandleTypeFlags() {
    }

    protected VkExternalMemoryHandleTypeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkExternalMemoryHandleTypeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkExternalMemoryHandleTypeFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkExternalMemoryHandleTypeFlags(int value) {
        setValue(value);
    }
}
