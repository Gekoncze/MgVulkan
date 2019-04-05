package cz.mg.vulkan.vk;

public class VkQueueGlobalPriorityEXT extends VkEnum {
    public static final int VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT = 128;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT = 256;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT = 512;
    public static final int VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = 1024;

    public VkQueueGlobalPriorityEXT() {
    }

    public VkQueueGlobalPriorityEXT(VkMemory vkmemory) {
        super(vkmemory);
    }

    public VkQueueGlobalPriorityEXT(VkMemory vkmemory, long vkaddress) {
        super(vkmemory, vkaddress);
    }


    public VkQueueGlobalPriorityEXT(int value) {
        setValue(value);
    }

    @Override
    public String toString() {
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT";
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT";
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT";
        if(getValue() == VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT) return "VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT";
        return "UNKNOWN";
    }
}
