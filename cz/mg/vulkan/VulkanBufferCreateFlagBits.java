package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkBufferCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanBufferCreateFlagBits extends VulkanFlagBits {
    public static final int SPARSE_BINDING = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_BINDING_BIT;
    public static final int SPARSE_RESIDENCY = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT;
    public static final int SPARSE_ALIASED = VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_ALIASED_BIT;
    public static final int PROTECTED = VkBufferCreateFlagBits.VK_BUFFER_CREATE_PROTECTED_BIT;

    public VulkanBufferCreateFlagBits(){
        super(new VkBufferCreateFlagBits());
    }

    public VulkanBufferCreateFlagBits(VkBufferCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkBufferCreateFlagBits getVk(){
        return (VkBufferCreateFlagBits) super.getVk();
    }

    public VulkanBufferCreateFlagBits(int value){
        super(new VkBufferCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SPARSE_BINDING) s += "SPARSE_BINDING";
        if(getValue() == SPARSE_RESIDENCY) s += "SPARSE_RESIDENCY";
        if(getValue() == SPARSE_ALIASED) s += "SPARSE_ALIASED";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanBufferCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCreateFlagBits> {
        public Array(VkBufferCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkBufferCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanBufferCreateFlagBits o){
            this(new VkBufferCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkBufferCreateFlagBits.Array getVk(){
            return (VkBufferCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanBufferCreateFlagBits get(int i){
            return new VulkanBufferCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkBufferCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkBufferCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkBufferCreateFlagBits.Pointer(value));
        }

        @Override
        public VkBufferCreateFlagBits.Pointer getVk(){
            return (VkBufferCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanBufferCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanBufferCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkBufferCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanBufferCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkBufferCreateFlagBits.Pointer.Array getVk(){
                return (VkBufferCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanBufferCreateFlagBits.Pointer get(int i){
                return new VulkanBufferCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
