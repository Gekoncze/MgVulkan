package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineInputAssemblyStateCreateInfo extends VulkanObject {
    public VulkanPipelineInputAssemblyStateCreateInfo(){
        super(new VkPipelineInputAssemblyStateCreateInfo());
    }

    public VulkanPipelineInputAssemblyStateCreateInfo(VkPipelineInputAssemblyStateCreateInfo vk){
        super(vk);
    }

    @Override
    public VkPipelineInputAssemblyStateCreateInfo getVk(){
        return (VkPipelineInputAssemblyStateCreateInfo) super.getVk();
    }
    public VulkanPipelineInputAssemblyStateCreateInfo(VulkanObject pNext, VulkanPipelineInputAssemblyStateCreateFlags flags, VulkanPrimitiveTopology topology, VulkanBool32 primitiveRestartEnable) {
        super(new VkPipelineInputAssemblyStateCreateInfo(pNext.getVk(), flags.getVk(), topology.getVk(), primitiveRestartEnable.getVk()));
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

    public VulkanPipelineInputAssemblyStateCreateFlags getFlags() {
        return new VulkanPipelineInputAssemblyStateCreateFlags(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineInputAssemblyStateCreateFlags flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanPrimitiveTopology getTopology() {
        return new VulkanPrimitiveTopology(getVk().getTopology());
    }

    public void setTopology(VulkanPrimitiveTopology topology) {
        getVk().setTopology(topology.getVk());
    }

    public VulkanBool32 getPrimitiveRestartEnable() {
        return new VulkanBool32(getVk().getPrimitiveRestartEnable());
    }

    public void setPrimitiveRestartEnable(VulkanBool32 primitiveRestartEnable) {
        getVk().setPrimitiveRestartEnable(primitiveRestartEnable.getVk());
    }


    public static class Array extends VulkanPipelineInputAssemblyStateCreateInfo implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineInputAssemblyStateCreateInfo> {
        public Array(VkPipelineInputAssemblyStateCreateInfo.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineInputAssemblyStateCreateInfo.Array(count));
        }

        public Array(int count, VulkanPipelineInputAssemblyStateCreateInfo o){
            this(new VkPipelineInputAssemblyStateCreateInfo.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineInputAssemblyStateCreateInfo.Array getVk(){
            return (VkPipelineInputAssemblyStateCreateInfo.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineInputAssemblyStateCreateInfo get(int i){
            return new VulkanPipelineInputAssemblyStateCreateInfo(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineInputAssemblyStateCreateInfo.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineInputAssemblyStateCreateInfo.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineInputAssemblyStateCreateInfo.Pointer(value));
        }

        @Override
        public VkPipelineInputAssemblyStateCreateInfo.Pointer getVk(){
            return (VkPipelineInputAssemblyStateCreateInfo.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineInputAssemblyStateCreateInfo.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineInputAssemblyStateCreateInfo.Pointer> {
            public Array(int count) {
                super(new VkPipelineInputAssemblyStateCreateInfo.Pointer.Array(count));
            }

            public Array(VulkanPipelineInputAssemblyStateCreateInfo[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineInputAssemblyStateCreateInfo.Pointer.Array getVk(){
                return (VkPipelineInputAssemblyStateCreateInfo.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineInputAssemblyStateCreateInfo.Pointer get(int i){
                return new VulkanPipelineInputAssemblyStateCreateInfo.Pointer(getVk().get(i));
            }
        }
    }
}
