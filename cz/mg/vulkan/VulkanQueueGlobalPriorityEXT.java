package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueGlobalPriorityEXT.html">khronos documentation</a>
 **/
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

    public static class Array extends VulkanQueueGlobalPriorityEXT implements cz.mg.collections.array.ReadonlyArray<VulkanQueueGlobalPriorityEXT> {
        public Array(VkQueueGlobalPriorityEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueueGlobalPriorityEXT.Array(count));
        }

        public Array(int count, VulkanQueueGlobalPriorityEXT o){
            this(new VkQueueGlobalPriorityEXT.Array(count, o.getVk()));
        }

        @Override
        public VkQueueGlobalPriorityEXT.Array getVk(){
            return (VkQueueGlobalPriorityEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueueGlobalPriorityEXT get(int i){
            return new VulkanQueueGlobalPriorityEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueueGlobalPriorityEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueueGlobalPriorityEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueueGlobalPriorityEXT.Pointer(value));
        }

        @Override
        public VkQueueGlobalPriorityEXT.Pointer getVk(){
            return (VkQueueGlobalPriorityEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueueGlobalPriorityEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueueGlobalPriorityEXT.Pointer> {
            public Array(int count) {
                super(new VkQueueGlobalPriorityEXT.Pointer.Array(count));
            }

            public Array(VulkanQueueGlobalPriorityEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueueGlobalPriorityEXT.Pointer.Array getVk(){
                return (VkQueueGlobalPriorityEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueueGlobalPriorityEXT.Pointer get(int i){
                return new VulkanQueueGlobalPriorityEXT.Pointer(getVk().get(i));
            }
        }
    }
}
