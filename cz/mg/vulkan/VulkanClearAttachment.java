package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanClearAttachment extends VulkanObject {
    public VulkanClearAttachment(){
        super(new VkClearAttachment());
    }

    public VulkanClearAttachment(VkClearAttachment vk){
        super(vk);
    }

    @Override
    public VkClearAttachment getVk(){
        return (VkClearAttachment) super.getVk();
    }

    public VulkanClearAttachment(VulkanImageAspectFlags aspectMask, VulkanUInt32 colorAttachment, VulkanClearValue clearValue) {
        super(new VkClearAttachment(aspectMask.getVk(), colorAttachment.getVk(), clearValue.getVk()));
    }

    public VulkanImageAspectFlags getAspectMask() {
        return new VulkanImageAspectFlags(getVk().getAspectMask());
    }

    public void setAspectMask(VulkanImageAspectFlags aspectMask) {
        getVk().setAspectMask(aspectMask.getVk());
    }

    public VulkanUInt32 getColorAttachment() {
        return new VulkanUInt32(getVk().getColorAttachment());
    }

    public void setColorAttachment(VulkanUInt32 colorAttachment) {
        getVk().setColorAttachment(colorAttachment.getVk());
    }

    public VulkanClearValue getClearValue() {
        return new VulkanClearValue(getVk().getClearValue());
    }

    public void setClearValue(VulkanClearValue clearValue) {
        getVk().setClearValue(clearValue.getVk());
    }


    public static class Array extends VulkanClearAttachment implements cz.mg.collections.array.ReadonlyArray<VulkanClearAttachment> {
        public Array(VkClearAttachment.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkClearAttachment.Array(count));
        }

        public Array(int count, VulkanClearAttachment o){
            this(new VkClearAttachment.Array(count, o.getVk()));
        }

        @Override
        public VkClearAttachment.Array getVk(){
            return (VkClearAttachment.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanClearAttachment get(int i){
            return new VulkanClearAttachment(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkClearAttachment.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkClearAttachment.Pointer());
        }

        public Pointer(long value) {
            this(new VkClearAttachment.Pointer(value));
        }

        @Override
        public VkClearAttachment.Pointer getVk(){
            return (VkClearAttachment.Pointer) super.getVk();
        }

        public static class Array extends VulkanClearAttachment.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanClearAttachment.Pointer> {
            public Array(int count) {
                super(new VkClearAttachment.Pointer.Array(count));
            }

            public Array(VulkanClearAttachment[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkClearAttachment.Pointer.Array getVk(){
                return (VkClearAttachment.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanClearAttachment.Pointer get(int i){
                return new VulkanClearAttachment.Pointer(getVk().get(i));
            }
        }
    }
}
