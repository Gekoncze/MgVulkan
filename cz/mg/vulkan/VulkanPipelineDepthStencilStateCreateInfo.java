package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineDepthStencilStateCreateInfo extends VulkanObject {
    public VulkanPipelineDepthStencilStateCreateInfo(){
        super(new VkPipelineDepthStencilStateCreateInfo());
    }

    public VulkanPipelineDepthStencilStateCreateInfo(VkPipelineDepthStencilStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineDepthStencilStateCreateInfo getVk(){
        return (VkPipelineDepthStencilStateCreateInfo) super.getVk();
    }
    public VulkanPipelineDepthStencilStateCreateInfo(VulkanObject pNext, VulkanPipelineDepthStencilStateCreateFlags flags, VulkanBool32 depthTestEnable, VulkanBool32 depthWriteEnable, VulkanCompareOp depthCompareOp, VulkanBool32 depthBoundsTestEnable, VulkanBool32 stencilTestEnable, VulkanStencilOpState front, VulkanStencilOpState back, VulkanFloat minDepthBounds, VulkanFloat maxDepthBounds) {
        super(new VkPipelineDepthStencilStateCreateInfo(pNext.getVk(), flags.getVk(), depthTestEnable.getVk(), depthWriteEnable.getVk(), depthCompareOp.getVk(), depthBoundsTestEnable.getVk(), stencilTestEnable.getVk(), front.getVk(), back.getVk(), minDepthBounds.getVk(), maxDepthBounds.getVk()));
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

    public VulkanPipelineDepthStencilStateCreateFlags getFlags() {
        return new VulkanPipelineDepthStencilStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineDepthStencilStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanBool32 getDepthTestEnable() {
        return new VulkanBool32(getVk().getDepthTestEnable());
    }

    public void setDepthTestEnable(VulkanBool32 depthTestEnable) {
        getVk().setDepthTestEnable(depthTestEnable.getVk());
    }

    public VulkanBool32 getDepthWriteEnable() {
        return new VulkanBool32(getVk().getDepthWriteEnable());
    }

    public void setDepthWriteEnable(VulkanBool32 depthWriteEnable) {
        getVk().setDepthWriteEnable(depthWriteEnable.getVk());
    }

    public VulkanCompareOp getDepthCompareOp() {
        return new VulkanCompareOp(getVk().getDepthCompareOp());
    }

    public void setDepthCompareOp(VulkanCompareOp depthCompareOp) {
        getVk().setDepthCompareOp(depthCompareOp.getVk());
    }

    public VulkanBool32 getDepthBoundsTestEnable() {
        return new VulkanBool32(getVk().getDepthBoundsTestEnable());
    }

    public void setDepthBoundsTestEnable(VulkanBool32 depthBoundsTestEnable) {
        getVk().setDepthBoundsTestEnable(depthBoundsTestEnable.getVk());
    }

    public VulkanBool32 getStencilTestEnable() {
        return new VulkanBool32(getVk().getStencilTestEnable());
    }

    public void setStencilTestEnable(VulkanBool32 stencilTestEnable) {
        getVk().setStencilTestEnable(stencilTestEnable.getVk());
    }

    public VulkanStencilOpState getFront() {
        return new VulkanStencilOpState(getVk().getFront());
    }

    public void setFront(VulkanStencilOpState front) {
        getVk().setFront(front.getVk());
    }

    public VulkanStencilOpState getBack() {
        return new VulkanStencilOpState(getVk().getBack());
    }

    public void setBack(VulkanStencilOpState back) {
        getVk().setBack(back.getVk());
    }

    public VulkanFloat getMinDepthBounds() {
        return new VulkanFloat(getVk().getMinDepthBounds());
    }

    public void setMinDepthBounds(VulkanFloat minDepthBounds) {
        getVk().setMinDepthBounds(minDepthBounds.getVk());
    }

    public VulkanFloat getMaxDepthBounds() {
        return new VulkanFloat(getVk().getMaxDepthBounds());
    }

    public void setMaxDepthBounds(VulkanFloat maxDepthBounds) {
        getVk().setMaxDepthBounds(maxDepthBounds.getVk());
    }


    public static class Array extends VulkanPipelineDepthStencilStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDepthStencilStateCreateInfo> {
        public Array(VkPipelineDepthStencilStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineDepthStencilStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineDepthStencilStateCreateInfo o){
            this(new VkPipelineDepthStencilStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineDepthStencilStateCreateInfo.Array getVk(){
            return (VkPipelineDepthStencilStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineDepthStencilStateCreateInfo get(int i){
            return new VulkanPipelineDepthStencilStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineDepthStencilStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineDepthStencilStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineDepthStencilStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineDepthStencilStateCreateInfo.Pointer getVk(){
            return (VkPipelineDepthStencilStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineDepthStencilStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDepthStencilStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineDepthStencilStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineDepthStencilStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineDepthStencilStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineDepthStencilStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineDepthStencilStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineDepthStencilStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
