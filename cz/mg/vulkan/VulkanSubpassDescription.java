package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

/**
 *  @see <a href="https://www.khronos.org/registry/vulkan/specs/1.1-extensions/man/html/VkSubpassDescription.html">khronos documentation</a>
 **/
public class VulkanSubpassDescription extends VulkanObject {
    public VulkanSubpassDescription(){
        super(new VkSubpassDescription());
    }

    public VulkanSubpassDescription(VkSubpassDescription vk){
        super(vk);
    }

    @Override
    public VkSubpassDescription getVk(){
        return (VkSubpassDescription) super.getVk();
    }

    public VulkanSubpassDescription(VulkanSubpassDescriptionFlags flags, VulkanPipelineBindPoint pipelineBindPoint, VulkanUInt32 inputAttachmentCount, VulkanAttachmentReference pInputAttachments, VulkanUInt32 colorAttachmentCount, VulkanAttachmentReference pColorAttachments, VulkanAttachmentReference pResolveAttachments, VulkanAttachmentReference pDepthStencilAttachment, VulkanUInt32 preserveAttachmentCount, VulkanUInt32 pPreserveAttachments) {
        super(new VkSubpassDescription(flags.getVk(), pipelineBindPoint.getVk(), inputAttachmentCount.getVk(), pInputAttachments.getVk(), colorAttachmentCount.getVk(), pColorAttachments.getVk(), pResolveAttachments.getVk(), pDepthStencilAttachment.getVk(), preserveAttachmentCount.getVk(), pPreserveAttachments.getVk()));
    }

    public VulkanSubpassDescriptionFlags getFlags() {
        return new VulkanSubpassDescriptionFlags(getVk().getFlags());
    }

    public void setFlags(VulkanSubpassDescriptionFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanPipelineBindPoint getPipelineBindPoint() {
        return new VulkanPipelineBindPoint(getVk().getPipelineBindPoint());
    }

    public void setPipelineBindPoint(VulkanPipelineBindPoint pipelineBindPoint) {
        getVk().setPipelineBindPoint(pipelineBindPoint.getVk());
    }

    public VulkanUInt32 getInputAttachmentCount() {
        return new VulkanUInt32(getVk().getInputAttachmentCount());
    }

    public void setInputAttachmentCount(VulkanUInt32 inputAttachmentCount) {
        getVk().setInputAttachmentCount(inputAttachmentCount.getVk());
    }

    public VulkanAttachmentReference getPInputAttachments() {
        return new VulkanAttachmentReference(getVk().getPInputAttachments());
    }

    public void setPInputAttachments(VulkanAttachmentReference pInputAttachments) {
        getVk().setPInputAttachments(pInputAttachments.getVk());
    }

    public VulkanUInt32 getColorAttachmentCount() {
        return new VulkanUInt32(getVk().getColorAttachmentCount());
    }

    public void setColorAttachmentCount(VulkanUInt32 colorAttachmentCount) {
        getVk().setColorAttachmentCount(colorAttachmentCount.getVk());
    }

    public VulkanAttachmentReference getPColorAttachments() {
        return new VulkanAttachmentReference(getVk().getPColorAttachments());
    }

    public void setPColorAttachments(VulkanAttachmentReference pColorAttachments) {
        getVk().setPColorAttachments(pColorAttachments.getVk());
    }

    public VulkanAttachmentReference getPResolveAttachments() {
        return new VulkanAttachmentReference(getVk().getPResolveAttachments());
    }

    public void setPResolveAttachments(VulkanAttachmentReference pResolveAttachments) {
        getVk().setPResolveAttachments(pResolveAttachments.getVk());
    }

    public VulkanAttachmentReference getPDepthStencilAttachment() {
        return new VulkanAttachmentReference(getVk().getPDepthStencilAttachment());
    }

    public void setPDepthStencilAttachment(VulkanAttachmentReference pDepthStencilAttachment) {
        getVk().setPDepthStencilAttachment(pDepthStencilAttachment.getVk());
    }

    public VulkanUInt32 getPreserveAttachmentCount() {
        return new VulkanUInt32(getVk().getPreserveAttachmentCount());
    }

    public void setPreserveAttachmentCount(VulkanUInt32 preserveAttachmentCount) {
        getVk().setPreserveAttachmentCount(preserveAttachmentCount.getVk());
    }

    public VulkanUInt32 getPPreserveAttachments() {
        return new VulkanUInt32(getVk().getPPreserveAttachments());
    }

    public void setPPreserveAttachments(VulkanUInt32 pPreserveAttachments) {
        getVk().setPPreserveAttachments(pPreserveAttachments.getVk());
    }


    public static class Array extends VulkanSubpassDescription implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDescription> {
        public Array(VkSubpassDescription.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkSubpassDescription.Array(count));
        }

        public Array(int count, VulkanSubpassDescription o){
            this(new VkSubpassDescription.Array(count, o.getVk()));
        }

        @Override
        public VkSubpassDescription.Array getVk(){
            return (VkSubpassDescription.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanSubpassDescription get(int i){
            return new VulkanSubpassDescription(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkSubpassDescription.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkSubpassDescription.Pointer());
        }

        public Pointer(long value) {
            this(new VkSubpassDescription.Pointer(value));
        }

        @Override
        public VkSubpassDescription.Pointer getVk(){
            return (VkSubpassDescription.Pointer) super.getVk();
        }

        public static class Array extends VulkanSubpassDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanSubpassDescription.Pointer> {
            public Array(int count) {
                super(new VkSubpassDescription.Pointer.Array(count));
            }

            public Array(VulkanSubpassDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkSubpassDescription.Pointer.Array getVk(){
                return (VkSubpassDescription.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanSubpassDescription.Pointer get(int i){
                return new VulkanSubpassDescription.Pointer(getVk().get(i));
            }
        }
    }
}
