package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueGlobalPriorityCreateInfoEXT.html">khronos documentation</a>
 **/
public class VulkanDeviceQueueGlobalPriorityCreateInfoEXT extends VulkanObject {
    public VulkanDeviceQueueGlobalPriorityCreateInfoEXT(){
        super(new VkDeviceQueueGlobalPriorityCreateInfoEXT());
    }

    public VulkanDeviceQueueGlobalPriorityCreateInfoEXT(VkDeviceQueueGlobalPriorityCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueGlobalPriorityCreateInfoEXT getVk(){
        return (VkDeviceQueueGlobalPriorityCreateInfoEXT) super.getVk();
    }
    public VulkanDeviceQueueGlobalPriorityCreateInfoEXT(VulkanObject pNext, VulkanQueueGlobalPriorityEXT globalPriority) {
        super(new VkDeviceQueueGlobalPriorityCreateInfoEXT(pNext.getVk(), globalPriority.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanQueueGlobalPriorityEXT getGlobalPriority() {
        return new VulkanQueueGlobalPriorityEXT(getVk().getGlobalPriority());
    }

    public void setGlobalPriority(VulkanQueueGlobalPriorityEXT globalPriority) {
        getVk().setGlobalPriority(globalPriority.getVk());
    }


    public static class Array extends VulkanDeviceQueueGlobalPriorityCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueGlobalPriorityCreateInfoEXT> {
        public Array(VkDeviceQueueGlobalPriorityCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceQueueGlobalPriorityCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanDeviceQueueGlobalPriorityCreateInfoEXT o){
            this(new VkDeviceQueueGlobalPriorityCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Array getVk(){
            return (VkDeviceQueueGlobalPriorityCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceQueueGlobalPriorityCreateInfoEXT get(int i){
            return new VulkanDeviceQueueGlobalPriorityCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer getVk(){
            return (VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceQueueGlobalPriorityCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueGlobalPriorityCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanDeviceQueueGlobalPriorityCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer.Array getVk(){
                return (VkDeviceQueueGlobalPriorityCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceQueueGlobalPriorityCreateInfoEXT.Pointer get(int i){
                return new VulkanDeviceQueueGlobalPriorityCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
