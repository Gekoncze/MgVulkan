package cz.mg.vulkan;

public class VkSemaphoreImportFlags extends VkFlags {
    public VkSemaphoreImportFlags() {
    }

    protected VkSemaphoreImportFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSemaphoreImportFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSemaphoreImportFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkSemaphoreImportFlags(int value) {
        setValue(value);
    }
}
