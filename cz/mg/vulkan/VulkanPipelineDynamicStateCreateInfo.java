package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineDynamicStateCreateInfo extends VulkanObject {
    public VulkanPipelineDynamicStateCreateInfo(){
        super(new VkPipelineDynamicStateCreateInfo());
    }

    public VulkanPipelineDynamicStateCreateInfo(VkPipelineDynamicStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineDynamicStateCreateInfo getVk(){
        return (VkPipelineDynamicStateCreateInfo) super.getVk();
    }
    public VulkanPipelineDynamicStateCreateInfo(VulkanObject pNext, VulkanPipelineDynamicStateCreateFlags flags, VulkanUInt32 dynamicStateCount, VulkanDynamicState pDynamicStates) {
        super(new VkPipelineDynamicStateCreateInfo(pNext.getVk(), flags.getVk(), dynamicStateCount.getVk(), pDynamicStates.getVk()));
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

    public VulkanPipelineDynamicStateCreateFlags getFlags() {
        return new VulkanPipelineDynamicStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineDynamicStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanUInt32 getDynamicStateCount() {
        return new VulkanUInt32(getVk().getDynamicStateCount());
    }

    public void setDynamicStateCount(VulkanUInt32 dynamicStateCount) {
        getVk().setDynamicStateCount(dynamicStateCount.getVk());
    }

    public VulkanDynamicState getPDynamicStates() {
        return new VulkanDynamicState(getVk().getPDynamicStates());
    }

    public void setPDynamicStates(VulkanDynamicState pDynamicStates) {
        getVk().setPDynamicStates(pDynamicStates.getVk());
    }


    public static class Array extends VulkanPipelineDynamicStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDynamicStateCreateInfo> {
        public Array(VkPipelineDynamicStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineDynamicStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineDynamicStateCreateInfo o){
            this(new VkPipelineDynamicStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineDynamicStateCreateInfo.Array getVk(){
            return (VkPipelineDynamicStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineDynamicStateCreateInfo get(int i){
            return new VulkanPipelineDynamicStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineDynamicStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineDynamicStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineDynamicStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineDynamicStateCreateInfo.Pointer getVk(){
            return (VkPipelineDynamicStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineDynamicStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineDynamicStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineDynamicStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineDynamicStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineDynamicStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineDynamicStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineDynamicStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineDynamicStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
