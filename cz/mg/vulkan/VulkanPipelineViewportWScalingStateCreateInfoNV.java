package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineViewportWScalingStateCreateInfoNV extends VulkanObject {
    public VulkanPipelineViewportWScalingStateCreateInfoNV(){
        super(new VkPipelineViewportWScalingStateCreateInfoNV());
    }

    public VulkanPipelineViewportWScalingStateCreateInfoNV(VkPipelineViewportWScalingStateCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportWScalingStateCreateInfoNV getVk(){
        return (VkPipelineViewportWScalingStateCreateInfoNV) super.getVk();
    }
    public VulkanPipelineViewportWScalingStateCreateInfoNV(VulkanObject pNext, VulkanBool32 viewportWScalingEnable, VulkanUInt32 viewportCount, VulkanViewportWScalingNV pViewportWScalings) {
        super(new VkPipelineViewportWScalingStateCreateInfoNV(pNext.getVk(), viewportWScalingEnable.getVk(), viewportCount.getVk(), pViewportWScalings.getVk()));
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

    public VulkanBool32 getViewportWScalingEnable() {
        return new VulkanBool32(getVk().getViewportWScalingEnable());
    }

    public void setViewportWScalingEnable(VulkanBool32 viewportWScalingEnable) {
        getVk().setViewportWScalingEnable(viewportWScalingEnable.getVk());
    }

    public VulkanUInt32 getViewportCount() {
        return new VulkanUInt32(getVk().getViewportCount());
    }

    public void setViewportCount(VulkanUInt32 viewportCount) {
        getVk().setViewportCount(viewportCount.getVk());
    }

    public VulkanViewportWScalingNV getPViewportWScalings() {
        return new VulkanViewportWScalingNV(getVk().getPViewportWScalings());
    }

    public void setPViewportWScalings(VulkanViewportWScalingNV pViewportWScalings) {
        getVk().setPViewportWScalings(pViewportWScalings.getVk());
    }


    public static class Array extends VulkanPipelineViewportWScalingStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportWScalingStateCreateInfoNV> {
        public Array(VkPipelineViewportWScalingStateCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineViewportWScalingStateCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanPipelineViewportWScalingStateCreateInfoNV o){
            this(new VkPipelineViewportWScalingStateCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineViewportWScalingStateCreateInfoNV.Array getVk(){
            return (VkPipelineViewportWScalingStateCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineViewportWScalingStateCreateInfoNV get(int i){
            return new VulkanPipelineViewportWScalingStateCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineViewportWScalingStateCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineViewportWScalingStateCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineViewportWScalingStateCreateInfoNV.Pointer(value));
        }

        @Override
        public VkPipelineViewportWScalingStateCreateInfoNV.Pointer getVk(){
            return (VkPipelineViewportWScalingStateCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineViewportWScalingStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportWScalingStateCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineViewportWScalingStateCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineViewportWScalingStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineViewportWScalingStateCreateInfoNV.Pointer.Array getVk(){
                return (VkPipelineViewportWScalingStateCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineViewportWScalingStateCreateInfoNV.Pointer get(int i){
                return new VulkanPipelineViewportWScalingStateCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
