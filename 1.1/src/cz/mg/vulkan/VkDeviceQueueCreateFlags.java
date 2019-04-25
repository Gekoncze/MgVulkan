package cz.mg.vulkan;

public class VkDeviceQueueCreateFlags extends VkFlags {
    public VkDeviceQueueCreateFlags() {
    }

    protected VkDeviceQueueCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    protected VkDeviceQueueCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }

    public VkDeviceQueueCreateFlags(VkPointer pointer) {
        super(pointer);
    }



    public VkDeviceQueueCreateFlags(int value) {
        setValue(value);
    }
}
