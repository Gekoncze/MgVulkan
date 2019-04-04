package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkDeviceQueueCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanDeviceQueueCreateFlagBits extends VulkanFlagBits {
    public static final int PROTECTED = VkDeviceQueueCreateFlagBits.VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT;

    public VulkanDeviceQueueCreateFlagBits(){
        super(new VkDeviceQueueCreateFlagBits());
    }

    public VulkanDeviceQueueCreateFlagBits(VkDeviceQueueCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkDeviceQueueCreateFlagBits getVk(){
        return (VkDeviceQueueCreateFlagBits) super.getVk();
    }

    public VulkanDeviceQueueCreateFlagBits(int value){
        super(new VkDeviceQueueCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanDeviceQueueCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueCreateFlagBits> {
        public Array(VkDeviceQueueCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkDeviceQueueCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanDeviceQueueCreateFlagBits o){
            this(new VkDeviceQueueCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkDeviceQueueCreateFlagBits.Array getVk(){
            return (VkDeviceQueueCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanDeviceQueueCreateFlagBits get(int i){
            return new VulkanDeviceQueueCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkDeviceQueueCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkDeviceQueueCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkDeviceQueueCreateFlagBits.Pointer(value));
        }

        @Override
        public VkDeviceQueueCreateFlagBits.Pointer getVk(){
            return (VkDeviceQueueCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanDeviceQueueCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanDeviceQueueCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkDeviceQueueCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanDeviceQueueCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkDeviceQueueCreateFlagBits.Pointer.Array getVk(){
                return (VkDeviceQueueCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanDeviceQueueCreateFlagBits.Pointer get(int i){
                return new VulkanDeviceQueueCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
