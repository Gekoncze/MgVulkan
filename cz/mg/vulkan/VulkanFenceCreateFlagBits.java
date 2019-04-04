package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkFenceCreateFlagBits.html">khronos documentation</a>
 **/
public class VulkanFenceCreateFlagBits extends VulkanFlagBits {
    public static final int SIGNALED = VkFenceCreateFlagBits.VK_FENCE_CREATE_SIGNALED_BIT;

    public VulkanFenceCreateFlagBits(){
        super(new VkFenceCreateFlagBits());
    }

    public VulkanFenceCreateFlagBits(VkFenceCreateFlagBits vk){
        super(vk);
    }

    @Override
    public VkFenceCreateFlagBits getVk(){
        return (VkFenceCreateFlagBits) super.getVk();
    }

    public VulkanFenceCreateFlagBits(int value){
        super(new VkFenceCreateFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == SIGNALED) s += "SIGNALED";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanFenceCreateFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanFenceCreateFlagBits> {
        public Array(VkFenceCreateFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFenceCreateFlagBits.Array(count));
        }

        public Array(int count, VulkanFenceCreateFlagBits o){
            this(new VkFenceCreateFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkFenceCreateFlagBits.Array getVk(){
            return (VkFenceCreateFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFenceCreateFlagBits get(int i){
            return new VulkanFenceCreateFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFenceCreateFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFenceCreateFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkFenceCreateFlagBits.Pointer(value));
        }

        @Override
        public VkFenceCreateFlagBits.Pointer getVk(){
            return (VkFenceCreateFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanFenceCreateFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFenceCreateFlagBits.Pointer> {
            public Array(int count) {
                super(new VkFenceCreateFlagBits.Pointer.Array(count));
            }

            public Array(VulkanFenceCreateFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFenceCreateFlagBits.Pointer.Array getVk(){
                return (VkFenceCreateFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFenceCreateFlagBits.Pointer get(int i){
                return new VulkanFenceCreateFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
