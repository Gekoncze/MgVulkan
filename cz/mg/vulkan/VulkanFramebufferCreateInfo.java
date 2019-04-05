package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanFramebufferCreateInfo extends VulkanObject {
    public VulkanFramebufferCreateInfo(){
        super(new VkFramebufferCreateInfo());
    }

    public VulkanFramebufferCreateInfo(VkFramebufferCreateInfo vk){
        super(vk);
    }

    @Override
    public VkFramebufferCreateInfo getVk(){
        return (VkFramebufferCreateInfo) super.getVk();
    }
    public VulkanFramebufferCreateInfo(VulkanObject pNext, VulkanFramebufferCreateFlags flags, VulkanRenderPass renderPass, VulkanUInt32 attachmentCount, VulkanImageView pAttachments, VulkanUInt32 width, VulkanUInt32 height, VulkanUInt32 layers) {
        super(new VkFramebufferCreateInfo(pNext.getVk(), flags.getVk(), renderPass.getVk(), attachmentCount.getVk(), pAttachments.getVk(), width.getVk(), height.getVk(), layers.getVk()));
    }

    public VulkanStructureType getSType() {
        return new VulkanStructureType(getVk().getSType());
    }

    public void setSType(VulkanStructureType sType) {
        getVk().setSType(sType.getVk());
    }

    public VulkanObject getPNext() {
        return new VulkanObject(getVk().getPNext());
    }

    public void setPNext(VulkanObject pNext) {
        getVk().setPNext(pNext.getVk());
    }

    public VulkanFramebufferCreateFlags getFlags() {
        return new VulkanFramebufferCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanFramebufferCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanRenderPass getRenderPass() {
        return new VulkanRenderPass(getVk().getRenderPass());
    }

    public void setRenderPass(VulkanRenderPass renderPass) {
        getVk().setRenderPass(renderPass.getVk());
    }

    public VulkanUInt32 getAttachmentCount() {
        return new VulkanUInt32(getVk().getAttachmentCount());
    }

    public void setAttachmentCount(VulkanUInt32 attachmentCount) {
        getVk().setAttachmentCount(attachmentCount.getVk());
    }

    public VulkanImageView getPAttachments() {
        return new VulkanImageView(getVk().getPAttachments());
    }

    public void setPAttachments(VulkanImageView pAttachments) {
        getVk().setPAttachments(pAttachments.getVk());
    }

    public VulkanUInt32 getWidth() {
        return new VulkanUInt32(getVk().getWidth());
    }

    public void setWidth(VulkanUInt32 width) {
        getVk().setWidth(width.getVk());
    }

    public VulkanUInt32 getHeight() {
        return new VulkanUInt32(getVk().getHeight());
    }

    public void setHeight(VulkanUInt32 height) {
        getVk().setHeight(height.getVk());
    }

    public VulkanUInt32 getLayers() {
        return new VulkanUInt32(getVk().getLayers());
    }

    public void setLayers(VulkanUInt32 layers) {
        getVk().setLayers(layers.getVk());
    }


    public static class Array extends VulkanFramebufferCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanFramebufferCreateInfo> {
        public Array(VkFramebufferCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkFramebufferCreateInfo.Array(count));
        }

        public Array(int count, VulkanFramebufferCreateInfo o){
            this(new VkFramebufferCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkFramebufferCreateInfo.Array getVk(){
            return (VkFramebufferCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanFramebufferCreateInfo get(int i){
            return new VulkanFramebufferCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkFramebufferCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkFramebufferCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkFramebufferCreateInfo.Pointer(value));
        }

        @Override
        public VkFramebufferCreateInfo.Pointer getVk(){
            return (VkFramebufferCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanFramebufferCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanFramebufferCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkFramebufferCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanFramebufferCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkFramebufferCreateInfo.Pointer.Array getVk(){
                return (VkFramebufferCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanFramebufferCreateInfo.Pointer get(int i){
                return new VulkanFramebufferCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
