package cz.mg.vulkan;

import cz.mg.vulkan.vk.*;
import static cz.mg.vulkan.vk.Vk.*;

public class VulkanPipelineRasterizationConservativeStateCreateInfoEXT extends VulkanObject {
    public VulkanPipelineRasterizationConservativeStateCreateInfoEXT(){
        super(new VkPipelineRasterizationConservativeStateCreateInfoEXT());
    }

    public VulkanPipelineRasterizationConservativeStateCreateInfoEXT(VkPipelineRasterizationConservativeStateCreateInfoEXT vk){
        super(vk);
    }

    @Override
    public VkPipelineRasterizationConservativeStateCreateInfoEXT getVk(){
        return (VkPipelineRasterizationConservativeStateCreateInfoEXT) super.getVk();
    }
    public VulkanPipelineRasterizationConservativeStateCreateInfoEXT(VulkanObject pNext, VulkanPipelineRasterizationConservativeStateCreateFlagsEXT flags, VulkanConservativeRasterizationModeEXT conservativeRasterizationMode, VulkanFloat extraPrimitiveOverestimationSize) {
        super(new VkPipelineRasterizationConservativeStateCreateInfoEXT(pNext.getVk(), flags.getVk(), conservativeRasterizationMode.getVk(), extraPrimitiveOverestimationSize.getVk()));
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

    public VulkanPipelineRasterizationConservativeStateCreateFlagsEXT getFlags() {
        return new VulkanPipelineRasterizationConservativeStateCreateFlagsEXT(getVk().getFlags());
    }

    public void setFlags(VulkanPipelineRasterizationConservativeStateCreateFlagsEXT flags) {
        getVk().setFlags(flags.getVk());
    }

    public VulkanConservativeRasterizationModeEXT getConservativeRasterizationMode() {
        return new VulkanConservativeRasterizationModeEXT(getVk().getConservativeRasterizationMode());
    }

    public void setConservativeRasterizationMode(VulkanConservativeRasterizationModeEXT conservativeRasterizationMode) {
        getVk().setConservativeRasterizationMode(conservativeRasterizationMode.getVk());
    }

    public VulkanFloat getExtraPrimitiveOverestimationSize() {
        return new VulkanFloat(getVk().getExtraPrimitiveOverestimationSize());
    }

    public void setExtraPrimitiveOverestimationSize(VulkanFloat extraPrimitiveOverestimationSize) {
        getVk().setExtraPrimitiveOverestimationSize(extraPrimitiveOverestimationSize.getVk());
    }


    public static class Array extends VulkanPipelineRasterizationConservativeStateCreateInfoEXT implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationConservativeStateCreateInfoEXT> {
        public Array(VkPipelineRasterizationConservativeStateCreateInfoEXT.Array a) {
            super(a);
        }

        public Array(int count) {
            this(new VkPipelineRasterizationConservativeStateCreateInfoEXT.Array(count));
        }

        public Array(int count, VulkanPipelineRasterizationConservativeStateCreateInfoEXT o){
            this(new VkPipelineRasterizationConservativeStateCreateInfoEXT.Array(count, o.getVk()));
        }

        @Override
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Array getVk(){
            return (VkPipelineRasterizationConservativeStateCreateInfoEXT.Array) super.getVk();
        }

        @Override
        public int count(){
            return getVk().count();
        }

        @Override
        public VulkanPipelineRasterizationConservativeStateCreateInfoEXT get(int i){
            return new VulkanPipelineRasterizationConservativeStateCreateInfoEXT(getVk().get(i));
        }
    }

    public static class Pointer extends VulkanObject.Pointer {
        public Pointer(VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer p) {
            super(p);
        }

        public Pointer(){
            this(new VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer());
        }

        public Pointer(long value) {
            this(new VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer(value));
        }

        @Override
        public VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer getVk(){
            return (VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer) super.getVk();
        }

        public static class Array extends VulkanPipelineRasterizationConservativeStateCreateInfoEXT.Pointer implements cz.mg.collections.array.ReadonlyArray<VulkanPipelineRasterizationConservativeStateCreateInfoEXT.Pointer> {
            public Array(int count) {
                super(new VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer.Array(count));
            }

            public Array(VulkanPipelineRasterizationConservativeStateCreateInfoEXT[] a) {
                this(a.length);
                for(int i = 0; i < a.length; i++) get(i).setValue(a[i].getVk().getVkAddress());
            }

            @Override
            public VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer.Array getVk(){
                return (VkPipelineRasterizationConservativeStateCreateInfoEXT.Pointer.Array) super.getVk();
            }

            @Override
            public int count(){
                return getVk().count();
            }

            @Override
            public VulkanPipelineRasterizationConservativeStateCreateInfoEXT.Pointer get(int i){
                return new VulkanPipelineRasterizationConservativeStateCreateInfoEXT.Pointer(getVk().get(i));
            }
        }
    }
}
