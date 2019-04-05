package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanAttachmentDescription extends VulkanObject {
    public VulkanAttachmentDescription(){
        super(new VkAttachmentDescription());
    }

    public VulkanAttachmentDescription(VkAttachmentDescription vk){
        super(vk);
    }

    @Override
    public VkAttachmentDescription getVk(){
        return (VkAttachmentDescription) super.getVk();
    }

    public VulkanAttachmentDescription(VulkanAttachmentDescriptionFlags flags, VulkanFormat format, VulkanSampleCountFlagBits samples, VulkanAttachmentLoadOp loadOp, VulkanAttachmentStoreOp storeOp, VulkanAttachmentLoadOp stencilLoadOp, VulkanAttachmentStoreOp stencilStoreOp, VulkanImageLayout initialLayout, VulkanImageLayout finalLayout) {
        super(new VkAttachmentDescription(flags.getVk(), format.getVk(), samples.getVk(), loadOp.getVk(), storeOp.getVk(), stencilLoadOp.getVk(), stencilStoreOp.getVk(), initialLayout.getVk(), finalLayout.getVk()));
    }

    public VulkanAttachmentDescriptionFlags getFlags() {
        return new VulkanAttachmentDescriptionFlags(getVk().getFlags());
    }

    public void setFlags(VulkanAttachmentDescriptionFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanFormat getFormat() {
        return new VulkanFormat(getVk().getFormat());
    }

    public void setFormat(VulkanFormat format) {
        getVk().setFormat(format.getVk());
    }

    public VulkanSampleCountFlagBits getSamples() {
        return new VulkanSampleCountFlagBits(getVk().getSamples());
    }

    public void setSamples(VulkanSampleCountFlagBits samples) {
        getVk().setSamples(samples.getVk());
    }

    public VulkanAttachmentLoadOp getLoadOp() {
        return new VulkanAttachmentLoadOp(getVk().getLoadOp());
    }

    public void setLoadOp(VulkanAttachmentLoadOp loadOp) {
        getVk().setLoadOp(loadOp.getVk());
    }

    public VulkanAttachmentStoreOp getStoreOp() {
        return new VulkanAttachmentStoreOp(getVk().getStoreOp());
    }

    public void setStoreOp(VulkanAttachmentStoreOp storeOp) {
        getVk().setStoreOp(storeOp.getVk());
    }

    public VulkanAttachmentLoadOp getStencilLoadOp() {
        return new VulkanAttachmentLoadOp(getVk().getStencilLoadOp());
    }

    public void setStencilLoadOp(VulkanAttachmentLoadOp stencilLoadOp) {
        getVk().setStencilLoadOp(stencilLoadOp.getVk());
    }

    public VulkanAttachmentStoreOp getStencilStoreOp() {
        return new VulkanAttachmentStoreOp(getVk().getStencilStoreOp());
    }

    public void setStencilStoreOp(VulkanAttachmentStoreOp stencilStoreOp) {
        getVk().setStencilStoreOp(stencilStoreOp.getVk());
    }

    public VulkanImageLayout getInitialLayout() {
        return new VulkanImageLayout(getVk().getInitialLayout());
    }

    public void setInitialLayout(VulkanImageLayout initialLayout) {
        getVk().setInitialLayout(initialLayout.getVk());
    }

    public VulkanImageLayout getFinalLayout() {
        return new VulkanImageLayout(getVk().getFinalLayout());
    }

    public void setFinalLayout(VulkanImageLayout finalLayout) {
        getVk().setFinalLayout(finalLayout.getVk());
    }


    public static class Array extends VulkanAttachmentDescription implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentDescription> {
        public Array(VkAttachmentDescription.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkAttachmentDescription.Array(count));
        }

        public Array(int count, VulkanAttachmentDescription o){
            this(new VkAttachmentDescription.Array(count, o.getVk()));
        }

        @Override
        public VkAttachmentDescription.Array getVk(){
            return (VkAttachmentDescription.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanAttachmentDescription get(int i){
            return new VulkanAttachmentDescription(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkAttachmentDescription.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkAttachmentDescription.Pointer());
        }

        public Pointer(long value) {
            this(new VkAttachmentDescription.Pointer(value));
        }

        @Override
        public VkAttachmentDescription.Pointer getVk(){
            return (VkAttachmentDescription.Pointer) super.getVk();
        }

        public static class Array extends VulkanAttachmentDescription.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanAttachmentDescription.Pointer> {
            public Array(int count) {
                super(new VkAttachmentDescription.Pointer.Array(count));
            }

            public Array(VulkanAttachmentDescription[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkAttachmentDescription.Pointer.Array getVk(){
                return (VkAttachmentDescription.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanAttachmentDescription.Pointer get(int i){
                return new VulkanAttachmentDescription.Pointer(getVk().get(i));
            }
        }
    }
}
