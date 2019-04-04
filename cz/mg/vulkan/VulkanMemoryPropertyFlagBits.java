package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkMemoryPropertyFlagBits.html">khronos documentation</a>
 **/
public class VulkanMemoryPropertyFlagBits extends VulkanFlagBits {
    public static final int DEVICE_LOCAL = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT;
    public static final int HOST_VISIBLE = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT;
    public static final int HOST_COHERENT = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT;
    public static final int HOST_CACHED = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_CACHED_BIT;
    public static final int LAZILY_ALLOCATED = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT;
    public static final int PROTECTED = VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_PROTECTED_BIT;

    public VulkanMemoryPropertyFlagBits(){
        super(new VkMemoryPropertyFlagBits());
    }

    public VulkanMemoryPropertyFlagBits(VkMemoryPropertyFlagBits vk){
        super(vk);
    }

    @Override
    public VkMemoryPropertyFlagBits getVk(){
        return (VkMemoryPropertyFlagBits) super.getVk();
    }

    public VulkanMemoryPropertyFlagBits(int value){
        super(new VkMemoryPropertyFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == DEVICE_LOCAL) s += "DEVICE_LOCAL";
        if(getValue() == HOST_VISIBLE) s += "HOST_VISIBLE";
        if(getValue() == HOST_COHERENT) s += "HOST_COHERENT";
        if(getValue() == HOST_CACHED) s += "HOST_CACHED";
        if(getValue() == LAZILY_ALLOCATED) s += "LAZILY_ALLOCATED";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanMemoryPropertyFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryPropertyFlagBits> {
        public Array(VkMemoryPropertyFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkMemoryPropertyFlagBits.Array(count));
        }

        public Array(int count, VulkanMemoryPropertyFlagBits o){
            this(new VkMemoryPropertyFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkMemoryPropertyFlagBits.Array getVk(){
            return (VkMemoryPropertyFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanMemoryPropertyFlagBits get(int i){
            return new VulkanMemoryPropertyFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkMemoryPropertyFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkMemoryPropertyFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkMemoryPropertyFlagBits.Pointer(value));
        }

        @Override
        public VkMemoryPropertyFlagBits.Pointer getVk(){
            return (VkMemoryPropertyFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanMemoryPropertyFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanMemoryPropertyFlagBits.Pointer> {
            public Array(int count) {
                super(new VkMemoryPropertyFlagBits.Pointer.Array(count));
            }

            public Array(VulkanMemoryPropertyFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkMemoryPropertyFlagBits.Pointer.Array getVk(){
                return (VkMemoryPropertyFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanMemoryPropertyFlagBits.Pointer get(int i){
                return new VulkanMemoryPropertyFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
