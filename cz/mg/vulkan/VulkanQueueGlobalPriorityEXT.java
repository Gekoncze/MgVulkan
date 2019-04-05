package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanQueueGlobalPriorityEXT extends VulkanEnum {
    public static final int QUEUE_GLOBAL_PRIORITY_LOW_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT;
    public static final int QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT;
    public static final int QUEUE_GLOBAL_PRIORITY_HIGH_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT;
    public static final int QUEUE_GLOBAL_PRIORITY_REALTIME_EXT = VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT;

    public VulkanQueueGlobalPriorityEXT(){
        super(new VkQueueGlobalPriorityEXT());
    }

    public VulkanQueueGlobalPriorityEXT(VkQueueGlobalPriorityEXT vk){
        super(vk);
    }

    @Override
    public VkQueueGlobalPriorityEXT getVk(){
        return (VkQueueGlobalPriorityEXT) super.getVk();
    }

    public VulkanQueueGlobalPriorityEXT(int value){
        super(new VkQueueGlobalPriorityEXT(value));
    }

    @Override
    public String toString() {
        if(getValue() == QUEUE_GLOBAL_PRIORITY_LOW_EXT) return "QUEUE_GLOBAL_PRIORITY_LOW_EXT";
        if(getValue() == QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT) return "QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT";
        if(getValue() == QUEUE_GLOBAL_PRIORITY_HIGH_EXT) return "QUEUE_GLOBAL_PRIORITY_HIGH_EXT";
        if(getValue() == QUEUE_GLOBAL_PRIORITY_REALTIME_EXT) return "QUEUE_GLOBAL_PRIORITY_REALTIME_EXT";
        return "UNKNOWN";
    }
}
