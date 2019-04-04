package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkImageUsageFlagBits.html">khronos documentation</a>
 **/
public class VulkanImageUsageFlagBits extends VulkanFlagBits {
    public static final int TRANSFER_SRC = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_SRC_BIT;
    public static final int TRANSFER_DST = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_DST_BIT;
    public static final int SAMPLED = VkImageUsageFlagBits.VK_IMAGE_USAGE_SAMPLED_BIT;
    public static final int STORAGE = VkImageUsageFlagBits.VK_IMAGE_USAGE_STORAGE_BIT;
    public static final int COLOR_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT;
    public static final int DEPTH_STENCIL_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT;
    public static final int TRANSIENT_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT;
    public static final int INPUT_ATTACHMENT = VkImageUsageFlagBits.VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT;

    public VulkanImageUsageFlagBits(){
        super(new VkImageUsageFlagBits());
    }

    public VulkanImageUsageFlagBits(VkImageUsageFlagBits vk){
        super(vk);
    }

    @Override
    public VkImageUsageFlagBits getVk(){
        return (VkImageUsageFlagBits) super.getVk();
    }

    public VulkanImageUsageFlagBits(int value){
        super(new VkImageUsageFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == TRANSFER_SRC) s += "TRANSFER_SRC";
        if(getValue() == TRANSFER_DST) s += "TRANSFER_DST";
        if(getValue() == SAMPLED) s += "SAMPLED";
        if(getValue() == STORAGE) s += "STORAGE";
        if(getValue() == COLOR_ATTACHMENT) s += "COLOR_ATTACHMENT";
        if(getValue() == DEPTH_STENCIL_ATTACHMENT) s += "DEPTH_STENCIL_ATTACHMENT";
        if(getValue() == TRANSIENT_ATTACHMENT) s += "TRANSIENT_ATTACHMENT";
        if(getValue() == INPUT_ATTACHMENT) s += "INPUT_ATTACHMENT";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanImageUsageFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanImageUsageFlagBits> {
        public Array(VkImageUsageFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkImageUsageFlagBits.Array(count));
        }

        public Array(int count, VulkanImageUsageFlagBits o){
            this(new VkImageUsageFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkImageUsageFlagBits.Array getVk(){
            return (VkImageUsageFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanImageUsageFlagBits get(int i){
            return new VulkanImageUsageFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkImageUsageFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkImageUsageFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkImageUsageFlagBits.Pointer(value));
        }

        @Override
        public VkImageUsageFlagBits.Pointer getVk(){
            return (VkImageUsageFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanImageUsageFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanImageUsageFlagBits.Pointer> {
            public Array(int count) {
                super(new VkImageUsageFlagBits.Pointer.Array(count));
            }

            public Array(VulkanImageUsageFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkImageUsageFlagBits.Pointer.Array getVk(){
                return (VkImageUsageFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanImageUsageFlagBits.Pointer get(int i){
                return new VulkanImageUsageFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
