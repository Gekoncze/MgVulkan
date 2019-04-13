package cz.mg.vulkan;

public class VkSemaphoreImportFlags extends VkFlags {
    public VkSemaphoreImportFlags() {
    }

    public VkSemaphoreImportFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreImportFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSemaphoreImportFlags(int value) {
        setValue(value);
    }
}
