package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineRasterizationStateRasterizationOrderAMD extends VulkanObject {
    public VulkanPipelineRasterizationStateRasterizationOrderAMD(){
        super(new VkPipelineRasterizationStateRasterizationOrderAMD());
    }

    public VulkanPipelineRasterizationStateRasterizationOrderAMD(VkPipelineRasterizationStateRasterizationOrderAMD vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationStateRasterizationOrderAMD getVk(){
        return (VkPipelineRasterizationStateRasterizationOrderAMD) super.getVk();
    }

    public VulkanPipelineRasterizationStateRasterizationOrderAMD(VulkanStructureType sType, VulkanObject pNext, VulkanRasterizationOrderAMD rasterizationOrder) {
        super(new VkPipelineRasterizationStateRasterizationOrderAMD(sType.getVk(), pNext.getVk(), rasterizationOrder.getVk()));
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

    public VulkanRasterizationOrderAMD getRasterizationOrder() {
        return new VulkanRasterizationOrderAMD(getVk().getRasterizationOrder());
    }

    public void setRasterizationOrder(VulkanRasterizationOrderAMD rasterizationOrder) {
        getVk().setRasterizationOrder(rasterizationOrder.getVk());
    }


    public static class Array extends VulkanPipelineRasterizationStateRasterizationOrderAMD implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationStateRasterizationOrderAMD> {
        public Array(VkPipelineRasterizationStateRasterizationOrderAMD.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineRasterizationStateRasterizationOrderAMD.Array(count));
        }

        public Array(int count, VulkanPipelineRasterizationStateRasterizationOrderAMD o){
            this(new VkPipelineRasterizationStateRasterizationOrderAMD.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineRasterizationStateRasterizationOrderAMD.Array getVk(){
            return (VkPipelineRasterizationStateRasterizationOrderAMD.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineRasterizationStateRasterizationOrderAMD get(int i){
            return new VulkanPipelineRasterizationStateRasterizationOrderAMD(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineRasterizationStateRasterizationOrderAMD.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineRasterizationStateRasterizationOrderAMD.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineRasterizationStateRasterizationOrderAMD.Pointer(value));
        }

        @Override
        public VkPipelineRasterizationStateRasterizationOrderAMD.Pointer getVk(){
            return (VkPipelineRasterizationStateRasterizationOrderAMD.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineRasterizationStateRasterizationOrderAMD.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationStateRasterizationOrderAMD.Pointer> {
            public Array(int count) {
                super(new VkPipelineRasterizationStateRasterizationOrderAMD.Pointer.Array(count));
            }

            public Array(VulkanPipelineRasterizationStateRasterizationOrderAMD[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineRasterizationStateRasterizationOrderAMD.Pointer.Array getVk(){
                return (VkPipelineRasterizationStateRasterizationOrderAMD.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineRasterizationStateRasterizationOrderAMD.Pointer get(int i){
                return new VulkanPipelineRasterizationStateRasterizationOrderAMD.Pointer(getVk().get(i));
            }
        }
    }
}
