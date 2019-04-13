package cz.mg.vulkan;

public class VkExternalMemoryHandleTypeFlags extends VkFlags {
    public VkExternalMemoryHandleTypeFlags() {
    }

    public VkExternalMemoryHandleTypeFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkExternalMemoryHandleTypeFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkExternalMemoryHandleTypeFlags(int value) {
        setValue(value);
    }
}
