package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineTessellationStateCreateInfo extends VulkanObject {
    public VulkanPipelineTessellationStateCreateInfo(){
        super(new VkPipelineTessellationStateCreateInfo());
    }

    public VulkanPipelineTessellationStateCreateInfo(VkPipelineTessellationStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineTessellationStateCreateInfo getVk(){
        return (VkPipelineTessellationStateCreateInfo) super.getVk();
    }
    public VulkanPipelineTessellationStateCreateInfo(VulkanObject pNext, VulkanPipelineTessellationStateCreateFlags flags, VulkanUInt32 patchControlPoints) {
        super(new VkPipelineTessellationStateCreateInfo(pNext.getVk(), flags.getVk(), patchControlPoints.getVk()));
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

    public VulkanPipelineTessellationStateCreateFlags getFlags() {
        return new VulkanPipelineTessellationStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineTessellationStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getPatchControlPoints() {
        return new VulkanUInt32(getVk().getPatchControlPoints());
    }

    public void setPatchControlPoints(VulkanUInt32 patchControlPoints) {
        getVk().setPatchControlPoints(patchControlPoints.getVk());
    }


    public static class Array extends VulkanPipelineTessellationStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineTessellationStateCreateInfo> {
        public Array(VkPipelineTessellationStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineTessellationStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineTessellationStateCreateInfo o){
            this(new VkPipelineTessellationStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineTessellationStateCreateInfo.Array getVk(){
            return (VkPipelineTessellationStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineTessellationStateCreateInfo get(int i){
            return new VulkanPipelineTessellationStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineTessellationStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineTessellationStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineTessellationStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineTessellationStateCreateInfo.Pointer getVk(){
            return (VkPipelineTessellationStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineTessellationStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineTessellationStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineTessellationStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineTessellationStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineTessellationStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineTessellationStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineTessellationStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineTessellationStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
