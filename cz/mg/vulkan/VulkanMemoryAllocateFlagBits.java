package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryAllocateFlagBits.html">khronos documentation</a>
 **/
public class VulkanMemoryAllocateFlagBits extends VulkanFlagBits {
    public static final int DEVICE_MASK = VkMemoryAllocateFlagBits.VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT;
    public static final int DEVICE_MASK_KHR = VkMemoryAllocateFlagBits.VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR;

    public VulkanMemoryAllocateFlagBits(){
        super(new VkMemoryAllocateFlagBits());
    }

    public VulkanMemoryAllocateFlagBits(VkMemoryAllocateFlagBits vk){
        super(vk);
    }

    @Override
    public VkMemoryAllocateFlagBits getVk(){
        return (VkMemoryAllocateFlagBits) super.getVk();
    }

    public VulkanMemoryAllocateFlagBits(int value){
        super(new VkMemoryAllocateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_MASK) s += "DEVICE_MASK";
        if(getValue() == DEVICE_MASK_KHR) s += "DEVICE_MASK_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanMemoryAllocateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateFlagBits> {
        public Array(VkMemoryAllocateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryAllocateFlagBits.Array(count));
        }

        public Array(int count, VulkanMemoryAllocateFlagBits o){
            this(new VkMemoryAllocateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryAllocateFlagBits.Array getVk(){
            return (VkMemoryAllocateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryAllocateFlagBits get(int i){
            return new VulkanMemoryAllocateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryAllocateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryAllocateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryAllocateFlagBits.Pointer(value));
        }

        @Override
        public VkMemoryAllocateFlagBits.Pointer getVk(){
            return (VkMemoryAllocateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryAllocateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryAllocateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkMemoryAllocateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanMemoryAllocateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryAllocateFlagBits.Pointer.Array getVk(){
                return (VkMemoryAllocateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryAllocateFlagBits.Pointer get(int i){
                return new VulkanMemoryAllocateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
