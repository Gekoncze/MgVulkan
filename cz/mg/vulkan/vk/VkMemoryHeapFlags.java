package cz.mg.vulkan.vk;

public class VkMemoryHeapFlags extends VkFlags {
    public VkMemoryHeapFlags() {
    }

    public VkMemoryHeapFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkMemoryHeapFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkMemoryHeapFlags(int value) {
        setValue(value);
    }
}
