package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueueFlagBits.html">khronos documentation</a>
 **/
public class VulkanQueueFlagBits extends VulkanFlagBits {
    public static final int GRAPHICS = VkQueueFlagBits.VK_QUEUE_GRAPHICS_BIT;
    public static final int COMPUTE = VkQueueFlagBits.VK_QUEUE_COMPUTE_BIT;
    public static final int TRANSFER = VkQueueFlagBits.VK_QUEUE_TRANSFER_BIT;
    public static final int SPARSE_BINDING = VkQueueFlagBits.VK_QUEUE_SPARSE_BINDING_BIT;
    public static final int PROTECTED = VkQueueFlagBits.VK_QUEUE_PROTECTED_BIT;

    public VulkanQueueFlagBits(){
        super(new VkQueueFlagBits());
    }

    public VulkanQueueFlagBits(VkQueueFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueueFlagBits getVk(){
        return (VkQueueFlagBits) super.getVk();
    }

    public VulkanQueueFlagBits(int value){
        super(new VkQueueFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == GRAPHICS) s += "GRAPHICS";
        if(getValue() == COMPUTE) s += "COMPUTE";
        if(getValue() == TRANSFER) s += "TRANSFER";
        if(getValue() == SPARSE_BINDING) s += "SPARSE_BINDING";
        if(getValue() == PROTECTED) s += "PROTECTED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanQueueFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFlagBits> {
        public Array(VkQueueFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueueFlagBits.Array(count));
        }

        public Array(int count, VulkanQueueFlagBits o){
            this(new VkQueueFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkQueueFlagBits.Array getVk(){
            return (VkQueueFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueueFlagBits get(int i){
            return new VulkanQueueFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueueFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueueFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueueFlagBits.Pointer(value));
        }

        @Override
        public VkQueueFlagBits.Pointer getVk(){
            return (VkQueueFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueueFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueueFlagBits.Pointer> {
            public Array(int count) {
                super(new VkQueueFlagBits.Pointer.Array(count));
            }

            public Array(VulkanQueueFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueueFlagBits.Pointer.Array getVk(){
                return (VkQueueFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueueFlagBits.Pointer get(int i){
                return new VulkanQueueFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
