package cz.mg.vulkan;

public class VkQueueFlags extends VkFlags {
    public VkQueueFlags() {
    }

    protected VkQueueFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkQueueFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkQueueFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkQueueFlags(int value) {
        setValue(value);
    }
}
