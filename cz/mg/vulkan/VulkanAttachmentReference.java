package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanAttachmentReference extends VulkanObject {
    public VulkanAttachmentReference(){
        super(new VkAttachmentReference());
    }

    public VulkanAttachmentReference(VkAttachmentReference vk){
        super(vk);
    }

    @Override
    public VkAttachmentReference getVk(){
        return (VkAttachmentReference) super.getVk();
    }

    public VulkanAttachmentReference(VulkanUInt32 attachment, VulkanImageLayout layout) {
        super(new VkAttachmentReference(attachment.getVk(), layout.getVk()));
    }

    public VulkanUInt32 getAttachment() {
        return new VulkanUInt32(getVk().getAttachment());
    }

    public void setAttachment(VulkanUInt32 attachment) {
        getVk().setAttachment(attachment.getVk());
    }

    public VulkanImageLayout getLayout() {
        return new VulkanImageLayout(getVk().getLayout());
    }

    public void setLayout(VulkanImageLayout layout) {
        getVk().setLayout(layout.getVk());
    }


    public static class Array extends VulkanAttachmentReference implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentReference> {
        public Array(VkAttachmentReference.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentReference.Array(count));
        }

        public Array(int count, VulkanAttachmentReference o){
            this(new VkAttachmentReference.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentReference.Array getVk(){
            return (VkAttachmentReference.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentReference get(int i){
            return new VulkanAttachmentReference(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentReference.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentReference.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentReference.Pointer(value));
        }

        @Override
        public VkAttachmentReference.Pointer getVk(){
            return (VkAttachmentReference.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentReference.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentReference.Pointer> {
            public Array(int count) {
                super(new VkAttachmentReference.Pointer.Array(count));
            }

            public Array(VulkanAttachmentReference[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentReference.Pointer.Array getVk(){
                return (VkAttachmentReference.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentReference.Pointer get(int i){
                return new VulkanAttachmentReference.Pointer(getVk().get(i));
            }
        }
    }
}
