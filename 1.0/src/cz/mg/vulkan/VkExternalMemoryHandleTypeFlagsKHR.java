package cz.mg.vulkan;

public class VkExternalMemoryHandleTypeFlagsKHR extends VkFlags {
    public VkExternalMemoryHandleTypeFlagsKHR() {
    }

    public VkExternalMemoryHandleTypeFlagsKHR(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryHandleTypeFlagsKHR(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalMemoryHandleTypeFlagsKHR(int value) {
        setValue(value);
    }
}
