package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSampleCountFlagBits.html">khronos documentation</a>
 **/
public class VulkanSampleCountFlagBits extends VulkanFlagBits {
    public static final int B1 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_1_BIT;
    public static final int B2 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_2_BIT;
    public static final int B4 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_4_BIT;
    public static final int B8 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_8_BIT;
    public static final int B16 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_16_BIT;
    public static final int B32 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_32_BIT;
    public static final int B64 = VkSampleCountFlagBits.VK_SAMPLE_COUNT_64_BIT;

    public VulkanSampleCountFlagBits(){
        super(new VkSampleCountFlagBits());
    }

    public VulkanSampleCountFlagBits(VkSampleCountFlagBits vk){
        super(vk);
    }

    @Override
    public VkSampleCountFlagBits getVk(){
        return (VkSampleCountFlagBits) super.getVk();
    }

    public VulkanSampleCountFlagBits(int value){
        super(new VkSampleCountFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == B1) s += "B1";
        if(getValue() == B2) s += "B2";
        if(getValue() == B4) s += "B4";
        if(getValue() == B8) s += "B8";
        if(getValue() == B16) s += "B16";
        if(getValue() == B32) s += "B32";
        if(getValue() == B64) s += "B64";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSampleCountFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanSampleCountFlagBits> {
        public Array(VkSampleCountFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSampleCountFlagBits.Array(count));
        }

        public Array(int count, VulkanSampleCountFlagBits o){
            this(new VkSampleCountFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkSampleCountFlagBits.Array getVk(){
            return (VkSampleCountFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSampleCountFlagBits get(int i){
            return new VulkanSampleCountFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSampleCountFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSampleCountFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkSampleCountFlagBits.Pointer(value));
        }

        @Override
        public VkSampleCountFlagBits.Pointer getVk(){
            return (VkSampleCountFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanSampleCountFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSampleCountFlagBits.Pointer> {
            public Array(int count) {
                super(new VkSampleCountFlagBits.Pointer.Array(count));
            }

            public Array(VulkanSampleCountFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSampleCountFlagBits.Pointer.Array getVk(){
                return (VkSampleCountFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSampleCountFlagBits.Pointer get(int i){
                return new VulkanSampleCountFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
