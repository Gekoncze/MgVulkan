package cz.mg.vulkan;

public class VkSemaphoreImportFlagsKHR extends VkFlags {
    public VkSemaphoreImportFlagsKHR() {
    }

    protected VkSemaphoreImportFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkSemaphoreImportFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkSemaphoreImportFlagsKHR(VkPointer pointer) {
        super(pointer);
    }



    public VkSemaphoreImportFlagsKHR(int value) {
        setValue(value);
    }
}
