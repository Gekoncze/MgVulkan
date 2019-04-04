package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkQueryControlFlagBits.html">khronos documentation</a>
 **/
public class VulkanQueryControlFlagBits extends VulkanFlagBits {
    public static final int PRECISE = VkQueryControlFlagBits.VK_QUERY_CONTROL_PRECISE_BIT;

    public VulkanQueryControlFlagBits(){
        super(new VkQueryControlFlagBits());
    }

    public VulkanQueryControlFlagBits(VkQueryControlFlagBits vk){
        super(vk);
    }

    @Override
    public VkQueryControlFlagBits getVk(){
        return (VkQueryControlFlagBits) super.getVk();
    }

    public VulkanQueryControlFlagBits(int value){
        super(new VkQueryControlFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PRECISE) s += "PRECISE";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanQueryControlFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanQueryControlFlagBits> {
        public Array(VkQueryControlFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkQueryControlFlagBits.Array(count));
        }

        public Array(int count, VulkanQueryControlFlagBits o){
            this(new VkQueryControlFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkQueryControlFlagBits.Array getVk(){
            return (VkQueryControlFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanQueryControlFlagBits get(int i){
            return new VulkanQueryControlFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkQueryControlFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkQueryControlFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkQueryControlFlagBits.Pointer(value));
        }

        @Override
        public VkQueryControlFlagBits.Pointer getVk(){
            return (VkQueryControlFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanQueryControlFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanQueryControlFlagBits.Pointer> {
            public Array(int count) {
                super(new VkQueryControlFlagBits.Pointer.Array(count));
            }

            public Array(VulkanQueryControlFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkQueryControlFlagBits.Pointer.Array getVk(){
                return (VkQueryControlFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanQueryControlFlagBits.Pointer get(int i){
                return new VulkanQueryControlFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
