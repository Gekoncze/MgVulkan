package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineViewportSwizzleStateCreateInfoNV extends VulkanObject {
    public VulkanPipelineViewportSwizzleStateCreateInfoNV(){
        super(new VkPipelineViewportSwizzleStateCreateInfoNV());
    }

    public VulkanPipelineViewportSwizzleStateCreateInfoNV(VkPipelineViewportSwizzleStateCreateInfoNV vk){
        super(vk);
    }

    @Override
    public VkPipelineViewportSwizzleStateCreateInfoNV getVk(){
        return (VkPipelineViewportSwizzleStateCreateInfoNV) super.getVk();
    }
    public VulkanPipelineViewportSwizzleStateCreateInfoNV(VulkanObject pNext, VulkanPipelineViewportSwizzleStateCreateFlagsNV flags, VulkanUInt32 viewportCount, VulkanViewportSwizzleNV pViewportSwizzles) {
        super(new VkPipelineViewportSwizzleStateCreateInfoNV(pNext.getVk(), flags.getVk(), viewportCount.getVk(), pViewportSwizzles.getVk()));
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

    public VulkanPipelineViewportSwizzleStateCreateFlagsNV getFlags() {
        return new VulkanPipelineViewportSwizzleStateCreateFlagsNV(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineViewportSwizzleStateCreateFlagsNV flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getViewportCount() {
        return new VulkanUInt32(getVk().getViewportCount());
    }

    public void setViewportCount(VulkanUInt32 viewportCount) {
        getVk().setViewportCount(viewportCount.getVk());
    }

    public VulkanViewportSwizzleNV getPViewportSwizzles() {
        return new VulkanViewportSwizzleNV(getVk().getPViewportSwizzles());
    }

    public void setPViewportSwizzles(VulkanViewportSwizzleNV pViewportSwizzles) {
        getVk().setPViewportSwizzles(pViewportSwizzles.getVk());
    }


    public static class Array extends VulkanPipelineViewportSwizzleStateCreateInfoNV implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportSwizzleStateCreateInfoNV> {
        public Array(VkPipelineViewportSwizzleStateCreateInfoNV.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineViewportSwizzleStateCreateInfoNV.Array(count));
        }

        public Array(int count, VulkanPipelineViewportSwizzleStateCreateInfoNV o){
            this(new VkPipelineViewportSwizzleStateCreateInfoNV.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineViewportSwizzleStateCreateInfoNV.Array getVk(){
            return (VkPipelineViewportSwizzleStateCreateInfoNV.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineViewportSwizzleStateCreateInfoNV get(int i){
            return new VulkanPipelineViewportSwizzleStateCreateInfoNV(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineViewportSwizzleStateCreateInfoNV.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineViewportSwizzleStateCreateInfoNV.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineViewportSwizzleStateCreateInfoNV.Pointer(value));
        }

        @Override
        public VkPipelineViewportSwizzleStateCreateInfoNV.Pointer getVk(){
            return (VkPipelineViewportSwizzleStateCreateInfoNV.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineViewportSwizzleStateCreateInfoNV.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineViewportSwizzleStateCreateInfoNV.Pointer> {
            public Array(int count) {
                super(new VkPipelineViewportSwizzleStateCreateInfoNV.Pointer.Array(count));
            }

            public Array(VulkanPipelineViewportSwizzleStateCreateInfoNV[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineViewportSwizzleStateCreateInfoNV.Pointer.Array getVk(){
                return (VkPipelineViewportSwizzleStateCreateInfoNV.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineViewportSwizzleStateCreateInfoNV.Pointer get(int i){
                return new VulkanPipelineViewportSwizzleStateCreateInfoNV.Pointer(getVk().get(i));
            }
        }
    }
}
