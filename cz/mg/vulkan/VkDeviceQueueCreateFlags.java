package cz.mg.vulkan;

public class VkDeviceQueueCreateFlags extends VkFlags {
    public VkDeviceQueueCreateFlags() {
    }

    public VkDeviceQueueCreateFlags(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkDeviceQueueCreateFlags(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkDeviceQueueCreateFlags(int value) {
        setValue(value);
    }
}
