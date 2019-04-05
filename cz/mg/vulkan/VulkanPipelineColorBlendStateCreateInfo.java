package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineColorBlendStateCreateInfo extends VulkanObject {
    public VulkanPipelineColorBlendStateCreateInfo(){
        super(new VkPipelineColorBlendStateCreateInfo());
    }

    public VulkanPipelineColorBlendStateCreateInfo(VkPipelineColorBlendStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineColorBlendStateCreateInfo getVk(){
        return (VkPipelineColorBlendStateCreateInfo) super.getVk();
    }
    public VulkanPipelineColorBlendStateCreateInfo(VulkanObject pNext, VulkanPipelineColorBlendStateCreateFlags flags, VulkanBool32 logicOpEnable, VulkanLogicOp logicOp, VulkanUInt32 attachmentCount, VulkanPipelineColorBlendAttachmentState pAttachments, VulkanFloat blendConstants) {
        super(new VkPipelineColorBlendStateCreateInfo(pNext.getVk(), flags.getVk(), logicOpEnable.getVk(), logicOp.getVk(), attachmentCount.getVk(), pAttachments.getVk(), blendConstants.getVk()));
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

    public VulkanPipelineColorBlendStateCreateFlags getFlags() {
        return new VulkanPipelineColorBlendStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineColorBlendStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBool32 getLogicOpEnable() {
        return new VulkanBool32(getVk().getLogicOpEnable());
    }

    public void setLogicOpEnable(VulkanBool32 logicOpEnable) {
        getVk().setLogicOpEnable(logicOpEnable.getVk());
    }

    public VulkanLogicOp getLogicOp() {
        return new VulkanLogicOp(getVk().getLogicOp());
    }

    public void setLogicOp(VulkanLogicOp logicOp) {
        getVk().setLogicOp(logicOp.getVk());
    }

    public VulkanUInt32 getAttachmentCount() {
        return new VulkanUInt32(getVk().getAttachmentCount());
    }

    public void setAttachmentCount(VulkanUInt32 attachmentCount) {
        getVk().setAttachmentCount(attachmentCount.getVk());
    }

    public VulkanPipelineColorBlendAttachmentState getPAttachments() {
        return new VulkanPipelineColorBlendAttachmentState(getVk().getPAttachments());
    }

    public void setPAttachments(VulkanPipelineColorBlendAttachmentState pAttachments) {
        getVk().setPAttachments(pAttachments.getVk());
    }

    public VulkanFloat getBlendConstants() {
        return new VulkanFloat(getVk().getBlendConstants());
    }

    public void setBlendConstants(VulkanFloat blendConstants) {
        getVk().setBlendConstants(blendConstants.getVk());
    }


    public static class Array extends VulkanPipelineColorBlendStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendStateCreateInfo> {
        public Array(VkPipelineColorBlendStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineColorBlendStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineColorBlendStateCreateInfo o){
            this(new VkPipelineColorBlendStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineColorBlendStateCreateInfo.Array getVk(){
            return (VkPipelineColorBlendStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineColorBlendStateCreateInfo get(int i){
            return new VulkanPipelineColorBlendStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineColorBlendStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineColorBlendStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineColorBlendStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineColorBlendStateCreateInfo.Pointer getVk(){
            return (VkPipelineColorBlendStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineColorBlendStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineColorBlendStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineColorBlendStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineColorBlendStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineColorBlendStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineColorBlendStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineColorBlendStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineColorBlendStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
