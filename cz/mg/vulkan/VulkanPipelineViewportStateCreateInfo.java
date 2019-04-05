package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineViewportStateCreateInfo extends VulkanObject {
    public VulkanPipelineViewportStateCreateInfo(){
        super(new VkPipelineViewportStateCreateInfo());
    }

    public VulkanPipelineViewportStateCreateInfo(VkPipelineViewportStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportStateCreateInfo getVk(){
        return (VkPipelineViewportStateCreateInfo) super.getVk();
    }
    public VulkanPipelineViewportStateCreateInfo(VulkanObject pNext, VulkanPipelineViewportStateCreateFlags flags, VulkanUInt32 viewportCount, VulkanViewport pViewports, VulkanUInt32 scissorCount, VulkanRect2D pScissors) {
        super(new VkPipelineViewportStateCreateInfo(pNext.getVk(), flags.getVk(), viewportCount.getVk(), pViewports.getVk(), scissorCount.getVk(), pScissors.getVk()));
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

    public VulkanPipelineViewportStateCreateFlags getFlags() {
        return new VulkanPipelineViewportStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineViewportStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getViewportCount() {
        return new VulkanUInt32(getVk().getViewportCount());
    }

    public void setViewportCount(VulkanUInt32 viewportCount) {
        getVk().setViewportCount(viewportCount.getVk());
    }

    public VulkanViewport getPViewports() {
        return new VulkanViewport(getVk().getPViewports());
    }

    public void setPViewports(VulkanViewport pViewports) {
        getVk().setPViewports(pViewports.getVk());
    }

    public VulkanUInt32 getScissorCount() {
        return new VulkanUInt32(getVk().getScissorCount());
    }

    public void setScissorCount(VulkanUInt32 scissorCount) {
        getVk().setScissorCount(scissorCount.getVk());
    }

    public VulkanRect2D getPScissors() {
        return new VulkanRect2D(getVk().getPScissors());
    }

    public void setPScissors(VulkanRect2D pScissors) {
        getVk().setPScissors(pScissors.getVk());
    }


    public static class Array extends VulkanPipelineViewportStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportStateCreateInfo> {
        public Array(VkPipelineViewportStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineViewportStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineViewportStateCreateInfo o){
            this(new VkPipelineViewportStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineViewportStateCreateInfo.Array getVk(){
            return (VkPipelineViewportStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineViewportStateCreateInfo get(int i){
            return new VulkanPipelineViewportStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineViewportStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineViewportStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineViewportStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineViewportStateCreateInfo.Pointer getVk(){
            return (VkPipelineViewportStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineViewportStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineViewportStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineViewportStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineViewportStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineViewportStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineViewportStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineViewportStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
