package cz.mg.vulkan;

public class VkExternalMemoryHandleTypeFlagsNV extends VkFlags {
    public VkExternalMemoryHandleTypeFlagsNV() {
    }

    public VkExternalMemoryHandleTypeFlagsNV(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryHandleTypeFlagsNV(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalMemoryHandleTypeFlagsNV(int value) {
        setValue(value);
    }
}
