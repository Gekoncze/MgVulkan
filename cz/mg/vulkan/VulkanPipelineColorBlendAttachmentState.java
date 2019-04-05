package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineColorBlendAttachmentState extends VulkanObject {
    public VulkanPipelineColorBlendAttachmentState(){
        super(new VkPipelineColorBlendAttachmentState());
    }

    public VulkanPipelineColorBlendAttachmentState(VkPipelineColorBlendAttachmentState vk){
        super(vk);
    }

    @Override
    public VkPipelineColorBlendAttachmentState getVk(){
        return (VkPipelineColorBlendAttachmentState) super.getVk();
    }

    public VulkanPipelineColorBlendAttachmentState(VulkanBool32 blendEnable, VulkanBlendFactor srcColorBlendFactor, VulkanBlendFactor dstColorBlendFactor, VulkanBlendOp colorBlendOp, VulkanBlendFactor srcAlphaBlendFactor, VulkanBlendFactor dstAlphaBlendFactor, VulkanBlendOp alphaBlendOp, VulkanColorComponentFlags colorWriteMask) {
        super(new VkPipelineColorBlendAttachmentState(blendEnable.getVk(), srcColorBlendFactor.getVk(), dstColorBlendFactor.getVk(), colorBlendOp.getVk(), srcAlphaBlendFactor.getVk(), dstAlphaBlendFactor.getVk(), alphaBlendOp.getVk(), colorWriteMask.getVk()));
    }

    public VulkanBool32 getBlendEnable() {
        return new VulkanBool32(getVk().getBlendEnable());
    }

    public void setBlendEnable(VulkanBool32 blendEnable) {
        getVk().setBlendEnable(blendEnable.getVk());
    }

    public VulkanBlendFactor getSrcColorBlendFactor() {
        return new VulkanBlendFactor(getVk().getSrcColorBlendFactor());
    }

    public void setSrcColorBlendFactor(VulkanBlendFactor srcColorBlendFactor) {
        getVk().setSrcColorBlendFactor(srcColorBlendFactor.getVk());
    }

    public VulkanBlendFactor getDstColorBlendFactor() {
        return new VulkanBlendFactor(getVk().getDstColorBlendFactor());
    }

    public void setDstColorBlendFactor(VulkanBlendFactor dstColorBlendFactor) {
        getVk().setDstColorBlendFactor(dstColorBlendFactor.getVk());
    }

    public VulkanBlendOp getColorBlendOp() {
        return new VulkanBlendOp(getVk().getColorBlendOp());
    }

    public void setColorBlendOp(VulkanBlendOp colorBlendOp) {
        getVk().setColorBlendOp(colorBlendOp.getVk());
    }

    public VulkanBlendFactor getSrcAlphaBlendFactor() {
        return new VulkanBlendFactor(getVk().getSrcAlphaBlendFactor());
    }

    public void setSrcAlphaBlendFactor(VulkanBlendFactor srcAlphaBlendFactor) {
        getVk().setSrcAlphaBlendFactor(srcAlphaBlendFactor.getVk());
    }

    public VulkanBlendFactor getDstAlphaBlendFactor() {
        return new VulkanBlendFactor(getVk().getDstAlphaBlendFactor());
    }

    public void setDstAlphaBlendFactor(VulkanBlendFactor dstAlphaBlendFactor) {
        getVk().setDstAlphaBlendFactor(dstAlphaBlendFactor.getVk());
    }

    public VulkanBlendOp getAlphaBlendOp() {
        return new VulkanBlendOp(getVk().getAlphaBlendOp());
    }

    public void setAlphaBlendOp(VulkanBlendOp alphaBlendOp) {
        getVk().setAlphaBlendOp(alphaBlendOp.getVk());
    }

    public VulkanColorComponentFlags getColorWriteMask() {
        return new VulkanColorComponentFlags(getVk().getColorWriteMask());
    }

    public void setColorWriteMask(VulkanColorComponentFlags colorWriteMask) {
        getVk().setColorWriteMask(colorWriteMask.getVk());
    }


    public static class Array extends VulkanPipelineColorBlendAttachmentState implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendAttachmentState> {
        public Array(VkPipelineColorBlendAttachmentState.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineColorBlendAttachmentState.Array(count));
        }

        public Array(int count, VulkanPipelineColorBlendAttachmentState o){
            this(new VkPipelineColorBlendAttachmentState.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineColorBlendAttachmentState.Array getVk(){
            return (VkPipelineColorBlendAttachmentState.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineColorBlendAttachmentState get(int i){
            return new VulkanPipelineColorBlendAttachmentState(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineColorBlendAttachmentState.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineColorBlendAttachmentState.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineColorBlendAttachmentState.Pointer(value));
        }

        @Override
        public VkPipelineColorBlendAttachmentState.Pointer getVk(){
            return (VkPipelineColorBlendAttachmentState.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineColorBlendAttachmentState.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendAttachmentState.Pointer> {
            public Array(int count) {
                super(new VkPipelineColorBlendAttachmentState.Pointer.Array(count));
            }

            public Array(VulkanPipelineColorBlendAttachmentState[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineColorBlendAttachmentState.Pointer.Array getVk(){
                return (VkPipelineColorBlendAttachmentState.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineColorBlendAttachmentState.Pointer get(int i){
                return new VulkanPipelineColorBlendAttachmentState.Pointer(getVk().get(i));
            }
        }
    }
}
