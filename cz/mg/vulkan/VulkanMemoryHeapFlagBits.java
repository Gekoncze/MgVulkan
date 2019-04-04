package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryHeapFlagBits.html">khronos documentation</a>
 **/
public class VulkanMemoryHeapFlagBits extends VulkanFlagBits {
    public static final int DEVICE_LOCAL = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_DEVICE_LOCAL_BIT;
    public static final int MULTI_INSTANCE = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT;
    public static final int MULTI_INSTANCE_KHR = VkMemoryHeapFlagBits.VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR;

    public VulkanMemoryHeapFlagBits(){
        super(new VkMemoryHeapFlagBits());
    }

    public VulkanMemoryHeapFlagBits(VkMemoryHeapFlagBits vk){
        super(vk);
    }

    @Override
    public VkMemoryHeapFlagBits getVk(){
        return (VkMemoryHeapFlagBits) super.getVk();
    }

    public VulkanMemoryHeapFlagBits(int value){
        super(new VkMemoryHeapFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_LOCAL) s += "DEVICE_LOCAL";
        if(getValue() == MULTI_INSTANCE) s += "MULTI_INSTANCE";
        if(getValue() == MULTI_INSTANCE_KHR) s += "MULTI_INSTANCE_KHR";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanMemoryHeapFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHeapFlagBits> {
        public Array(VkMemoryHeapFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryHeapFlagBits.Array(count));
        }

        public Array(int count, VulkanMemoryHeapFlagBits o){
            this(new VkMemoryHeapFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryHeapFlagBits.Array getVk(){
            return (VkMemoryHeapFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryHeapFlagBits get(int i){
            return new VulkanMemoryHeapFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryHeapFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryHeapFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryHeapFlagBits.Pointer(value));
        }

        @Override
        public VkMemoryHeapFlagBits.Pointer getVk(){
            return (VkMemoryHeapFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryHeapFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryHeapFlagBits.Pointer> {
            public Array(int count) {
                super(new VkMemoryHeapFlagBits.Pointer.Array(count));
            }

            public Array(VulkanMemoryHeapFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryHeapFlagBits.Pointer.Array getVk(){
                return (VkMemoryHeapFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryHeapFlagBits.Pointer get(int i){
                return new VulkanMemoryHeapFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
