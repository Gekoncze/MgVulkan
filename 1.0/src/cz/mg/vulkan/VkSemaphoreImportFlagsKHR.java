package cz.mg.vulkan;

public class VkSemaphoreImportFlagsKHR extends VkFlags {
    public VkSemaphoreImportFlagsKHR() {
    }

    public VkSemaphoreImportFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkSemaphoreImportFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkSemaphoreImportFlagsKHR(int value) {
        setValue(value);
    }
}
