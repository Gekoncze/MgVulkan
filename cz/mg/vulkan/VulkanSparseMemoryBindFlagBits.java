package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSparseMemoryBindFlagBits.html">khronos documentation</a>
 **/
public class VulkanSparseMemoryBindFlagBits extends VulkanFlagBits {
    public static final int METADATA = VkSparseMemoryBindFlagBits.VK_SPARSE_MEMORY_BIND_METADATA_BIT;

    public VulkanSparseMemoryBindFlagBits(){
        super(new VkSparseMemoryBindFlagBits());
    }

    public VulkanSparseMemoryBindFlagBits(VkSparseMemoryBindFlagBits vk){
        super(vk);
    }

    @Override
    public VkSparseMemoryBindFlagBits getVk(){
        return (VkSparseMemoryBindFlagBits) super.getVk();
    }

    public VulkanSparseMemoryBindFlagBits(int value){
        super(new VkSparseMemoryBindFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == METADATA) s += "METADATA";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSparseMemoryBindFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanSparseMemoryBindFlagBits> {
        public Array(VkSparseMemoryBindFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSparseMemoryBindFlagBits.Array(count));
        }

        public Array(int count, VulkanSparseMemoryBindFlagBits o){
            this(new VkSparseMemoryBindFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkSparseMemoryBindFlagBits.Array getVk(){
            return (VkSparseMemoryBindFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSparseMemoryBindFlagBits get(int i){
            return new VulkanSparseMemoryBindFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSparseMemoryBindFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSparseMemoryBindFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkSparseMemoryBindFlagBits.Pointer(value));
        }

        @Override
        public VkSparseMemoryBindFlagBits.Pointer getVk(){
            return (VkSparseMemoryBindFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanSparseMemoryBindFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSparseMemoryBindFlagBits.Pointer> {
            public Array(int count) {
                super(new VkSparseMemoryBindFlagBits.Pointer.Array(count));
            }

            public Array(VulkanSparseMemoryBindFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSparseMemoryBindFlagBits.Pointer.Array getVk(){
                return (VkSparseMemoryBindFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSparseMemoryBindFlagBits.Pointer get(int i){
                return new VulkanSparseMemoryBindFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
