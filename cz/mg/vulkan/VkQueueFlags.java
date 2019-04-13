package cz.mg.vulkan;

public class VkQueueFlags extends VkFlags {
    public VkQueueFlags() {
    }

    public VkQueueFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueueFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }



    public VkQueueFlags(int value) {
        setValue(value);
    }
}
