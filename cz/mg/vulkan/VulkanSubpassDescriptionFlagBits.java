package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassDescriptionFlagBits.html">khronos documentation</a>
 **/
public class VulkanSubpassDescriptionFlagBits extends VulkanFlagBits {
    public static final int PER_VIEW_ATTRIBUTES_NVX = VkSubpassDescriptionFlagBits.VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX;
    public static final int PER_VIEW_POSITION_X_ONLY_NVX = VkSubpassDescriptionFlagBits.VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX;

    public VulkanSubpassDescriptionFlagBits(){
        super(new VkSubpassDescriptionFlagBits());
    }

    public VulkanSubpassDescriptionFlagBits(VkSubpassDescriptionFlagBits vk){
        super(vk);
    }

    @Override
    public VkSubpassDescriptionFlagBits getVk(){
        return (VkSubpassDescriptionFlagBits) super.getVk();
    }

    public VulkanSubpassDescriptionFlagBits(int value){
        super(new VkSubpassDescriptionFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == PER_VIEW_ATTRIBUTES_NVX) s += "PER_VIEW_ATTRIBUTES_NVX";
        if(getValue() == PER_VIEW_POSITION_X_ONLY_NVX) s += "PER_VIEW_POSITION_X_ONLY_NVX";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanSubpassDescriptionFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDescriptionFlagBits> {
        public Array(VkSubpassDescriptionFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubpassDescriptionFlagBits.Array(count));
        }

        public Array(int count, VulkanSubpassDescriptionFlagBits o){
            this(new VkSubpassDescriptionFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkSubpassDescriptionFlagBits.Array getVk(){
            return (VkSubpassDescriptionFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubpassDescriptionFlagBits get(int i){
            return new VulkanSubpassDescriptionFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubpassDescriptionFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubpassDescriptionFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubpassDescriptionFlagBits.Pointer(value));
        }

        @Override
        public VkSubpassDescriptionFlagBits.Pointer getVk(){
            return (VkSubpassDescriptionFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubpassDescriptionFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDescriptionFlagBits.Pointer> {
            public Array(int count) {
                super(new VkSubpassDescriptionFlagBits.Pointer.Array(count));
            }

            public Array(VulkanSubpassDescriptionFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubpassDescriptionFlagBits.Pointer.Array getVk(){
                return (VkSubpassDescriptionFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubpassDescriptionFlagBits.Pointer get(int i){
                return new VulkanSubpassDescriptionFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
