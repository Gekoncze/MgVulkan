package cz.mg.vulkan;

public class VkMemoryMapFlags extends VkFlags {
    public VkMemoryMapFlags() {
    }

    public VkMemoryMapFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryMapFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkMemoryMapFlags(int value) {
        setValue(value);
    }
}
