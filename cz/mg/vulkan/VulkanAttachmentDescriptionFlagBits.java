package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkAttachmentDescriptionFlagBits.html">khronos documentation</a>
 **/
public class VulkanAttachmentDescriptionFlagBits extends VulkanFlagBits {
    public static final int MAY_ALIAS = VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT;

    public VulkanAttachmentDescriptionFlagBits(){
        super(new VkAttachmentDescriptionFlagBits());
    }

    public VulkanAttachmentDescriptionFlagBits(VkAttachmentDescriptionFlagBits vk){
        super(vk);
    }

    @Override
    public VkAttachmentDescriptionFlagBits getVk(){
        return (VkAttachmentDescriptionFlagBits) super.getVk();
    }

    public VulkanAttachmentDescriptionFlagBits(int value){
        super(new VkAttachmentDescriptionFlagBits(value));
    }

    @Override
    public String toString() {
        String s = "";
        if(getValue() == MAY_ALIAS) s += "MAY_ALIAS";
        return s + "(0x" + Integer.toHexString(getValue()) + ")";
    }

    public static class Array extends VulkanAttachmentDescriptionFlagBits implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentDescriptionFlagBits> {
        public Array(VkAttachmentDescriptionFlagBits.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentDescriptionFlagBits.Array(count));
        }

        public Array(int count, VulkanAttachmentDescriptionFlagBits o){
            this(new VkAttachmentDescriptionFlagBits.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentDescriptionFlagBits.Array getVk(){
            return (VkAttachmentDescriptionFlagBits.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentDescriptionFlagBits get(int i){
            return new VulkanAttachmentDescriptionFlagBits(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentDescriptionFlagBits.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentDescriptionFlagBits.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentDescriptionFlagBits.Pointer(value));
        }

        @Override
        public VkAttachmentDescriptionFlagBits.Pointer getVk(){
            return (VkAttachmentDescriptionFlagBits.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentDescriptionFlagBits.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentDescriptionFlagBits.Pointer> {
            public Array(int count) {
                super(new VkAttachmentDescriptionFlagBits.Pointer.Array(count));
            }

            public Array(VulkanAttachmentDescriptionFlagBits[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentDescriptionFlagBits.Pointer.Array getVk(){
                return (VkAttachmentDescriptionFlagBits.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentDescriptionFlagBits.Pointer get(int i){
                return new VulkanAttachmentDescriptionFlagBits.Pointer(getVk().get(i));
            }
        }
    }
}
